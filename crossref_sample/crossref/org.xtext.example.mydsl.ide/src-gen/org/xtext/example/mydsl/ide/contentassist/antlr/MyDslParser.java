/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstructItemAccess().getAlternatives(), "rule__AbstructItem__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getViewModelAccess().getGroup(), "rule__ViewModel__Group__0");
			builder.put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
			builder.put(grammarAccess.getInt32ItemAccess().getGroup(), "rule__Int32Item__Group__0");
			builder.put(grammarAccess.getStringItemAccess().getGroup(), "rule__StringItem__Group__0");
			builder.put(grammarAccess.getBindingFieldAccess().getGroup(), "rule__BindingField__Group__0");
			builder.put(grammarAccess.getModelAccess().getTablesAssignment_0(), "rule__Model__TablesAssignment_0");
			builder.put(grammarAccess.getModelAccess().getViewModelsAssignment_1(), "rule__Model__ViewModelsAssignment_1");
			builder.put(grammarAccess.getViewModelAccess().getNameAssignment_1(), "rule__ViewModel__NameAssignment_1");
			builder.put(grammarAccess.getViewModelAccess().getFieldsAssignment_3(), "rule__ViewModel__FieldsAssignment_3");
			builder.put(grammarAccess.getTableAccess().getNameAssignment_1(), "rule__Table__NameAssignment_1");
			builder.put(grammarAccess.getTableAccess().getItemsAssignment_3(), "rule__Table__ItemsAssignment_3");
			builder.put(grammarAccess.getInt32ItemAccess().getNameAssignment_1(), "rule__Int32Item__NameAssignment_1");
			builder.put(grammarAccess.getStringItemAccess().getNameAssignment_1(), "rule__StringItem__NameAssignment_1");
			builder.put(grammarAccess.getBindingFieldAccess().getNameAssignment_1(), "rule__BindingField__NameAssignment_1");
			builder.put(grammarAccess.getBindingFieldAccess().getTableAssignment_3(), "rule__BindingField__TableAssignment_3");
			builder.put(grammarAccess.getBindingFieldAccess().getItemAssignment_5(), "rule__BindingField__ItemAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
