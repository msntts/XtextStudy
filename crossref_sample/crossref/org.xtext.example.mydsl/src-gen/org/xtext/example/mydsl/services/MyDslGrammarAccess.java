/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTablesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTablesTableParserRuleCall_0_0 = (RuleCall)cTablesAssignment_0.eContents().get(0);
		private final Assignment cViewModelsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cViewModelsViewModelParserRuleCall_1_0 = (RuleCall)cViewModelsAssignment_1.eContents().get(0);
		
		//Model:
		//    tables+=Table*
		//    viewModels+=ViewModel*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//tables+=Table*
		//viewModels+=ViewModel*
		public Group getGroup() { return cGroup; }
		
		//tables+=Table*
		public Assignment getTablesAssignment_0() { return cTablesAssignment_0; }
		
		//Table
		public RuleCall getTablesTableParserRuleCall_0_0() { return cTablesTableParserRuleCall_0_0; }
		
		//viewModels+=ViewModel*
		public Assignment getViewModelsAssignment_1() { return cViewModelsAssignment_1; }
		
		//ViewModel
		public RuleCall getViewModelsViewModelParserRuleCall_1_0() { return cViewModelsViewModelParserRuleCall_1_0; }
	}
	public class ViewModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ViewModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cViewModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldsBindingFieldParserRuleCall_3_0 = (RuleCall)cFieldsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ViewModel:
		//    'viewModel' name=ID '{'
		//        fields+=BindingField+
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'viewModel' name=ID '{'
		//    fields+=BindingField+
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'viewModel'
		public Keyword getViewModelKeyword_0() { return cViewModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fields+=BindingField+
		public Assignment getFieldsAssignment_3() { return cFieldsAssignment_3; }
		
		//BindingField
		public RuleCall getFieldsBindingFieldParserRuleCall_3_0() { return cFieldsBindingFieldParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Table");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cItemsAbstructItemParserRuleCall_3_0 = (RuleCall)cItemsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Table:
		//    'table' name=ID '{'
		//        items+=AbstructItem*
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'table' name=ID '{'
		//    items+=AbstructItem*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'table'
		public Keyword getTableKeyword_0() { return cTableKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//items+=AbstructItem*
		public Assignment getItemsAssignment_3() { return cItemsAssignment_3; }
		
		//AbstructItem
		public RuleCall getItemsAbstructItemParserRuleCall_3_0() { return cItemsAbstructItemParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstructItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.AbstructItem");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInt32ItemParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringItemParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstructItem:
		//    Int32Item | StringItem
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Int32Item | StringItem
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Int32Item
		public RuleCall getInt32ItemParserRuleCall_0() { return cInt32ItemParserRuleCall_0; }
		
		//StringItem
		public RuleCall getStringItemParserRuleCall_1() { return cStringItemParserRuleCall_1; }
	}
	public class Int32ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Int32Item");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInt32Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Int32Item:
		//    'int32' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'int32' name=ID
		public Group getGroup() { return cGroup; }
		
		//'int32'
		public Keyword getInt32Keyword_0() { return cInt32Keyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class StringItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.StringItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//StringItem:
		//    'string' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'string' name=ID
		public Group getGroup() { return cGroup; }
		
		//'string'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class BindingFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.BindingField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cBindsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTableAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTableTableCrossReference_3_0 = (CrossReference)cTableAssignment_3.eContents().get(0);
		private final RuleCall cTableTableIDTerminalRuleCall_3_0_1 = (RuleCall)cTableTableCrossReference_3_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cItemAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cItemAbstructItemCrossReference_5_0 = (CrossReference)cItemAssignment_5.eContents().get(0);
		private final RuleCall cItemAbstructItemIDTerminalRuleCall_5_0_1 = (RuleCall)cItemAbstructItemCrossReference_5_0.eContents().get(1);
		
		//BindingField:
		//    'field' name=ID 'binds' table=[Table]"."item=[AbstructItem]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'field' name=ID 'binds' table=[Table]"."item=[AbstructItem]
		public Group getGroup() { return cGroup; }
		
		//'field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'binds'
		public Keyword getBindsKeyword_2() { return cBindsKeyword_2; }
		
		//table=[Table]
		public Assignment getTableAssignment_3() { return cTableAssignment_3; }
		
		//[Table]
		public CrossReference getTableTableCrossReference_3_0() { return cTableTableCrossReference_3_0; }
		
		//ID
		public RuleCall getTableTableIDTerminalRuleCall_3_0_1() { return cTableTableIDTerminalRuleCall_3_0_1; }
		
		//"."
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }
		
		//item=[AbstructItem]
		public Assignment getItemAssignment_5() { return cItemAssignment_5; }
		
		//[AbstructItem]
		public CrossReference getItemAbstructItemCrossReference_5_0() { return cItemAbstructItemCrossReference_5_0; }
		
		//ID
		public RuleCall getItemAbstructItemIDTerminalRuleCall_5_0_1() { return cItemAbstructItemIDTerminalRuleCall_5_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final ViewModelElements pViewModel;
	private final TableElements pTable;
	private final AbstructItemElements pAbstructItem;
	private final Int32ItemElements pInt32Item;
	private final StringItemElements pStringItem;
	private final BindingFieldElements pBindingField;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pViewModel = new ViewModelElements();
		this.pTable = new TableElements();
		this.pAbstructItem = new AbstructItemElements();
		this.pInt32Item = new Int32ItemElements();
		this.pStringItem = new StringItemElements();
		this.pBindingField = new BindingFieldElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    tables+=Table*
	//    viewModels+=ViewModel*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ViewModel:
	//    'viewModel' name=ID '{'
	//        fields+=BindingField+
	//    '}'
	//;
	public ViewModelElements getViewModelAccess() {
		return pViewModel;
	}
	
	public ParserRule getViewModelRule() {
		return getViewModelAccess().getRule();
	}
	
	//Table:
	//    'table' name=ID '{'
	//        items+=AbstructItem*
	//    '}'
	//;
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	//AbstructItem:
	//    Int32Item | StringItem
	//;
	public AbstructItemElements getAbstructItemAccess() {
		return pAbstructItem;
	}
	
	public ParserRule getAbstructItemRule() {
		return getAbstructItemAccess().getRule();
	}
	
	//Int32Item:
	//    'int32' name=ID
	//;
	public Int32ItemElements getInt32ItemAccess() {
		return pInt32Item;
	}
	
	public ParserRule getInt32ItemRule() {
		return getInt32ItemAccess().getRule();
	}
	
	//StringItem:
	//    'string' name=ID
	//;
	public StringItemElements getStringItemAccess() {
		return pStringItem;
	}
	
	public ParserRule getStringItemRule() {
		return getStringItemAccess().getRule();
	}
	
	//BindingField:
	//    'field' name=ID 'binds' table=[Table]"."item=[AbstructItem]
	//;
	public BindingFieldElements getBindingFieldAccess() {
		return pBindingField;
	}
	
	public ParserRule getBindingFieldRule() {
		return getBindingFieldAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
