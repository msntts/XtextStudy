package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'viewModel'", "'{'", "'}'", "'table'", "'int32'", "'string'", "'field'", "'binds'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_tables_0_0= ruleTable ) )* ( (lv_viewModels_1_0= ruleViewModel ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;

        EObject lv_viewModels_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_tables_0_0= ruleTable ) )* ( (lv_viewModels_1_0= ruleViewModel ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_tables_0_0= ruleTable ) )* ( (lv_viewModels_1_0= ruleViewModel ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_tables_0_0= ruleTable ) )* ( (lv_viewModels_1_0= ruleViewModel ) )* )
            // InternalMyDsl.g:79:3: ( (lv_tables_0_0= ruleTable ) )* ( (lv_viewModels_1_0= ruleViewModel ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_tables_0_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_tables_0_0= ruleTable )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_tables_0_0= ruleTable )
            	    // InternalMyDsl.g:81:5: lv_tables_0_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tables_0_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_viewModels_1_0= ruleViewModel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_viewModels_1_0= ruleViewModel )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_viewModels_1_0= ruleViewModel )
            	    // InternalMyDsl.g:100:5: lv_viewModels_1_0= ruleViewModel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getViewModelsViewModelParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_viewModels_1_0=ruleViewModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"viewModels",
            	    						lv_viewModels_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.ViewModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleViewModel"
    // InternalMyDsl.g:121:1: entryRuleViewModel returns [EObject current=null] : iv_ruleViewModel= ruleViewModel EOF ;
    public final EObject entryRuleViewModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewModel = null;


        try {
            // InternalMyDsl.g:121:50: (iv_ruleViewModel= ruleViewModel EOF )
            // InternalMyDsl.g:122:2: iv_ruleViewModel= ruleViewModel EOF
            {
             newCompositeNode(grammarAccess.getViewModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewModel=ruleViewModel();

            state._fsp--;

             current =iv_ruleViewModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewModel"


    // $ANTLR start "ruleViewModel"
    // InternalMyDsl.g:128:1: ruleViewModel returns [EObject current=null] : (otherlv_0= 'viewModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleBindingField ) )+ otherlv_4= '}' ) ;
    public final EObject ruleViewModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= 'viewModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleBindingField ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:135:2: (otherlv_0= 'viewModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleBindingField ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= 'viewModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleBindingField ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:136:3: otherlv_0= 'viewModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleBindingField ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getViewModelAccess().getViewModelKeyword_0());
            		
            // InternalMyDsl.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getViewModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getViewModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:162:3: ( (lv_fields_3_0= ruleBindingField ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:163:4: (lv_fields_3_0= ruleBindingField )
            	    {
            	    // InternalMyDsl.g:163:4: (lv_fields_3_0= ruleBindingField )
            	    // InternalMyDsl.g:164:5: lv_fields_3_0= ruleBindingField
            	    {

            	    					newCompositeNode(grammarAccess.getViewModelAccess().getFieldsBindingFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_fields_3_0=ruleBindingField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getViewModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.BindingField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getViewModelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewModel"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:189:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:189:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:190:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:196:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAbstructItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:202:2: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAbstructItem ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:203:2: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAbstructItem ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:203:2: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAbstructItem ) )* otherlv_4= '}' )
            // InternalMyDsl.g:204:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAbstructItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalMyDsl.g:208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:209:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:230:3: ( (lv_items_3_0= ruleAbstructItem ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:231:4: (lv_items_3_0= ruleAbstructItem )
            	    {
            	    // InternalMyDsl.g:231:4: (lv_items_3_0= ruleAbstructItem )
            	    // InternalMyDsl.g:232:5: lv_items_3_0= ruleAbstructItem
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getItemsAbstructItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_items_3_0=ruleAbstructItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AbstructItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAbstructItem"
    // InternalMyDsl.g:257:1: entryRuleAbstructItem returns [EObject current=null] : iv_ruleAbstructItem= ruleAbstructItem EOF ;
    public final EObject entryRuleAbstructItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstructItem = null;


        try {
            // InternalMyDsl.g:257:53: (iv_ruleAbstructItem= ruleAbstructItem EOF )
            // InternalMyDsl.g:258:2: iv_ruleAbstructItem= ruleAbstructItem EOF
            {
             newCompositeNode(grammarAccess.getAbstructItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstructItem=ruleAbstructItem();

            state._fsp--;

             current =iv_ruleAbstructItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstructItem"


    // $ANTLR start "ruleAbstructItem"
    // InternalMyDsl.g:264:1: ruleAbstructItem returns [EObject current=null] : (this_Int32Item_0= ruleInt32Item | this_StringItem_1= ruleStringItem ) ;
    public final EObject ruleAbstructItem() throws RecognitionException {
        EObject current = null;

        EObject this_Int32Item_0 = null;

        EObject this_StringItem_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:270:2: ( (this_Int32Item_0= ruleInt32Item | this_StringItem_1= ruleStringItem ) )
            // InternalMyDsl.g:271:2: (this_Int32Item_0= ruleInt32Item | this_StringItem_1= ruleStringItem )
            {
            // InternalMyDsl.g:271:2: (this_Int32Item_0= ruleInt32Item | this_StringItem_1= ruleStringItem )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:272:3: this_Int32Item_0= ruleInt32Item
                    {

                    			newCompositeNode(grammarAccess.getAbstructItemAccess().getInt32ItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Int32Item_0=ruleInt32Item();

                    state._fsp--;


                    			current = this_Int32Item_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:281:3: this_StringItem_1= ruleStringItem
                    {

                    			newCompositeNode(grammarAccess.getAbstructItemAccess().getStringItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringItem_1=ruleStringItem();

                    state._fsp--;


                    			current = this_StringItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstructItem"


    // $ANTLR start "entryRuleInt32Item"
    // InternalMyDsl.g:293:1: entryRuleInt32Item returns [EObject current=null] : iv_ruleInt32Item= ruleInt32Item EOF ;
    public final EObject entryRuleInt32Item() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt32Item = null;


        try {
            // InternalMyDsl.g:293:50: (iv_ruleInt32Item= ruleInt32Item EOF )
            // InternalMyDsl.g:294:2: iv_ruleInt32Item= ruleInt32Item EOF
            {
             newCompositeNode(grammarAccess.getInt32ItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt32Item=ruleInt32Item();

            state._fsp--;

             current =iv_ruleInt32Item; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt32Item"


    // $ANTLR start "ruleInt32Item"
    // InternalMyDsl.g:300:1: ruleInt32Item returns [EObject current=null] : (otherlv_0= 'int32' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInt32Item() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:306:2: ( (otherlv_0= 'int32' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:307:2: (otherlv_0= 'int32' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:307:2: (otherlv_0= 'int32' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:308:3: otherlv_0= 'int32' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInt32ItemAccess().getInt32Keyword_0());
            		
            // InternalMyDsl.g:312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:313:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInt32ItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInt32ItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt32Item"


    // $ANTLR start "entryRuleStringItem"
    // InternalMyDsl.g:334:1: entryRuleStringItem returns [EObject current=null] : iv_ruleStringItem= ruleStringItem EOF ;
    public final EObject entryRuleStringItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringItem = null;


        try {
            // InternalMyDsl.g:334:51: (iv_ruleStringItem= ruleStringItem EOF )
            // InternalMyDsl.g:335:2: iv_ruleStringItem= ruleStringItem EOF
            {
             newCompositeNode(grammarAccess.getStringItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringItem=ruleStringItem();

            state._fsp--;

             current =iv_ruleStringItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringItem"


    // $ANTLR start "ruleStringItem"
    // InternalMyDsl.g:341:1: ruleStringItem returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStringItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:347:2: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:348:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:348:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:349:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStringItemAccess().getStringKeyword_0());
            		
            // InternalMyDsl.g:353:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:354:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:354:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:355:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringItem"


    // $ANTLR start "entryRuleBindingField"
    // InternalMyDsl.g:375:1: entryRuleBindingField returns [EObject current=null] : iv_ruleBindingField= ruleBindingField EOF ;
    public final EObject entryRuleBindingField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingField = null;


        try {
            // InternalMyDsl.g:375:53: (iv_ruleBindingField= ruleBindingField EOF )
            // InternalMyDsl.g:376:2: iv_ruleBindingField= ruleBindingField EOF
            {
             newCompositeNode(grammarAccess.getBindingFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingField=ruleBindingField();

            state._fsp--;

             current =iv_ruleBindingField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingField"


    // $ANTLR start "ruleBindingField"
    // InternalMyDsl.g:382:1: ruleBindingField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'binds' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleBindingField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:388:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'binds' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:389:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'binds' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:389:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'binds' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:390:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'binds' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingFieldAccess().getFieldKeyword_0());
            		
            // InternalMyDsl.g:394:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:395:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:395:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:396:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBindingFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingFieldAccess().getBindsKeyword_2());
            		
            // InternalMyDsl.g:416:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:417:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:417:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:418:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingFieldRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getBindingFieldAccess().getTableTableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingFieldAccess().getFullStopKeyword_4());
            		
            // InternalMyDsl.g:433:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:434:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:434:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:435:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingFieldRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getBindingFieldAccess().getItemAbstructItemCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingField"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}