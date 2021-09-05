# 経緯
Xtext/Xtendを使って、DSL文書からのコード生成をCLI化するためにXtextプロジェクトをMaven化しようとしたが、Eclise/XtextでMavenプロジェクトを作成してそのまま```mvn install```してもうまく動かなかった。。。  
色々調べた結果、[xtext-mavenのgithub issue](https://github.com/eclipse/xtext-maven/issues/146)にそれっぽい情報があったので対応した。  

# 動作確認環境
多分、XtextやEclipseのバージョンによっては何もしなくてもうまく動くんだと思います。  
今回動作確認したく見合わせは以下。

| 名前    | バージョン        |
| ---     | ---               | 
| OS      | Win 10 Home 64bit |
| Eclipse | 2021-06           |
| Xtext   | 2.25              |
| JDK     | OpenJDK 15        |
| Maven   | 3.8.2             |

# 原因
経緯に書いたgithubのissueの通り、今回はJREのバージョンとTychoのバージョンの組み合わせによって発生しているらしい。  
以下に修正手順を書く。

## pom.xmlの修正
[org.xtext.example.mydsl.parent/pom.xml](https://github.com/msntts/XtextStudy/blob/master/maven_sample/workspace/org.xtext.example.mydsl.parent/pom.xml)にTychoのバージョンが記載されている。  
これを書いている2021/9/5時点では、Eclipseから自動生成した場合、Tychoのバージョンが1.7.0となっているので、これを2.3.0へ変更する。  
```xml
		<!-- Tycho settings -->
		<tycho-version>2.3.0</tycho-version>
		<!-- Define overridable properties for tycho-surefire-plugin -->
```

## JREのバージョン指定
このプロジェクトのビルドはJDKのバージョンによって成功したり失敗したりした。すべての組み合わせを試したわけではないけどJDK 16はダメらしい。  
さらにTychoバージョン2系ではJDK 9以上?っぽいので、JDK 15を使うように設定した。  
今回使っているEclipseでは、デフォルトのECJ(かな?)は16系なのでEclipseで動作を確認する場合は、Eclipseで使うJavaのバージョンも設定変更する必要がある。  

# コマンドラインでコード生成するために
org.xtext.example.mydsl.parentフォルダ以下に、コード生成用のプロジェクトを作成する。本プロジェクトでは[org.xtext.example.mydsl.parent/org.xtext.example.mydsl.gen](https://github.com/msntts/XtextStudy/tree/master/maven_sample/workspace/org.xtext.example.mydsl.parent/org.xtext.example.mydsl.gen)
が作成したプロジェクト。  
参考にしたものは、[ここ](https://github.com/LorenzoBettini/xtext-maven-plugin-example/tree/explicit-xtext.builder.standalone-dep/org.xtext.example.mydsl.parent/org.xtext.example.mydsl.example)や公式のドキュメントの[standalone-build節](https://www.eclipse.org/Xtext/documentation/350_continuous_integration.html#standalone-build)。  
その後、[org.xtext.example.mydsl.parent/pom.xml](https://github.com/msntts/XtextStudy/blob/master/maven_sample/workspace/org.xtext.example.mydsl.parent/pom.xml)に作成したモジュールを追加する。  
このgitリポジトリでは```org.xtext.example.mydsl.gen```を追加した。
```xml
	<modules>
		<module>org.xtext.example.mydsl</module>
		<module>org.xtext.example.mydsl.ide</module>
		<module>org.xtext.example.mydsl.ui</module>
		<module>org.xtext.example.mydsl.target</module>
		<module>org.xtext.example.mydsl.gen</module> <!-- ここを追加 -->
	</modules>
```
ここまでやったら、あとはorg.xtext.example.mydsl.genプロジェクトのsrcフォルダ以下にdsl文書を置き、```mvn install```や```mvn generate-sources```を実行するとsrc-genフォルダ以下に生成結果が出力されます。  
