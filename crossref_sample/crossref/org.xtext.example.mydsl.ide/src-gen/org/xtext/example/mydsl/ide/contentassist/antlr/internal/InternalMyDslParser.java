package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleViewModel"
    // InternalMyDsl.g:78:1: entryRuleViewModel : ruleViewModel EOF ;
    public final void entryRuleViewModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleViewModel EOF )
            // InternalMyDsl.g:80:1: ruleViewModel EOF
            {
             before(grammarAccess.getViewModelRule()); 
            pushFollow(FOLLOW_1);
            ruleViewModel();

            state._fsp--;

             after(grammarAccess.getViewModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewModel"


    // $ANTLR start "ruleViewModel"
    // InternalMyDsl.g:87:1: ruleViewModel : ( ( rule__ViewModel__Group__0 ) ) ;
    public final void ruleViewModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ViewModel__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ViewModel__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ViewModel__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__ViewModel__Group__0 )
            {
             before(grammarAccess.getViewModelAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__ViewModel__Group__0 )
            // InternalMyDsl.g:94:4: rule__ViewModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViewModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewModel"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTable EOF )
            // InternalMyDsl.g:105:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Table__Group__0 )
            // InternalMyDsl.g:119:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAbstructItem"
    // InternalMyDsl.g:128:1: entryRuleAbstructItem : ruleAbstructItem EOF ;
    public final void entryRuleAbstructItem() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAbstructItem EOF )
            // InternalMyDsl.g:130:1: ruleAbstructItem EOF
            {
             before(grammarAccess.getAbstructItemRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstructItem();

            state._fsp--;

             after(grammarAccess.getAbstructItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstructItem"


    // $ANTLR start "ruleAbstructItem"
    // InternalMyDsl.g:137:1: ruleAbstructItem : ( ( rule__AbstructItem__Alternatives ) ) ;
    public final void ruleAbstructItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__AbstructItem__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__AbstructItem__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__AbstructItem__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__AbstructItem__Alternatives )
            {
             before(grammarAccess.getAbstructItemAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__AbstructItem__Alternatives )
            // InternalMyDsl.g:144:4: rule__AbstructItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstructItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstructItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstructItem"


    // $ANTLR start "entryRuleInt32Item"
    // InternalMyDsl.g:153:1: entryRuleInt32Item : ruleInt32Item EOF ;
    public final void entryRuleInt32Item() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleInt32Item EOF )
            // InternalMyDsl.g:155:1: ruleInt32Item EOF
            {
             before(grammarAccess.getInt32ItemRule()); 
            pushFollow(FOLLOW_1);
            ruleInt32Item();

            state._fsp--;

             after(grammarAccess.getInt32ItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt32Item"


    // $ANTLR start "ruleInt32Item"
    // InternalMyDsl.g:162:1: ruleInt32Item : ( ( rule__Int32Item__Group__0 ) ) ;
    public final void ruleInt32Item() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Int32Item__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Int32Item__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Int32Item__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Int32Item__Group__0 )
            {
             before(grammarAccess.getInt32ItemAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Int32Item__Group__0 )
            // InternalMyDsl.g:169:4: rule__Int32Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32ItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt32Item"


    // $ANTLR start "entryRuleStringItem"
    // InternalMyDsl.g:178:1: entryRuleStringItem : ruleStringItem EOF ;
    public final void entryRuleStringItem() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleStringItem EOF )
            // InternalMyDsl.g:180:1: ruleStringItem EOF
            {
             before(grammarAccess.getStringItemRule()); 
            pushFollow(FOLLOW_1);
            ruleStringItem();

            state._fsp--;

             after(grammarAccess.getStringItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringItem"


    // $ANTLR start "ruleStringItem"
    // InternalMyDsl.g:187:1: ruleStringItem : ( ( rule__StringItem__Group__0 ) ) ;
    public final void ruleStringItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__StringItem__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__StringItem__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__StringItem__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__StringItem__Group__0 )
            {
             before(grammarAccess.getStringItemAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__StringItem__Group__0 )
            // InternalMyDsl.g:194:4: rule__StringItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringItem"


    // $ANTLR start "entryRuleBindingField"
    // InternalMyDsl.g:203:1: entryRuleBindingField : ruleBindingField EOF ;
    public final void entryRuleBindingField() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleBindingField EOF )
            // InternalMyDsl.g:205:1: ruleBindingField EOF
            {
             before(grammarAccess.getBindingFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingField();

            state._fsp--;

             after(grammarAccess.getBindingFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBindingField"


    // $ANTLR start "ruleBindingField"
    // InternalMyDsl.g:212:1: ruleBindingField : ( ( rule__BindingField__Group__0 ) ) ;
    public final void ruleBindingField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__BindingField__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__BindingField__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__BindingField__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__BindingField__Group__0 )
            {
             before(grammarAccess.getBindingFieldAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__BindingField__Group__0 )
            // InternalMyDsl.g:219:4: rule__BindingField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BindingField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBindingField"


    // $ANTLR start "rule__AbstructItem__Alternatives"
    // InternalMyDsl.g:227:1: rule__AbstructItem__Alternatives : ( ( ruleInt32Item ) | ( ruleStringItem ) );
    public final void rule__AbstructItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ruleInt32Item ) | ( ruleStringItem ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:232:2: ( ruleInt32Item )
                    {
                    // InternalMyDsl.g:232:2: ( ruleInt32Item )
                    // InternalMyDsl.g:233:3: ruleInt32Item
                    {
                     before(grammarAccess.getAbstructItemAccess().getInt32ItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInt32Item();

                    state._fsp--;

                     after(grammarAccess.getAbstructItemAccess().getInt32ItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:2: ( ruleStringItem )
                    {
                    // InternalMyDsl.g:238:2: ( ruleStringItem )
                    // InternalMyDsl.g:239:3: ruleStringItem
                    {
                     before(grammarAccess.getAbstructItemAccess().getStringItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringItem();

                    state._fsp--;

                     after(grammarAccess.getAbstructItemAccess().getStringItemParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstructItem__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:248:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:252:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:253:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:260:1: rule__Model__Group__0__Impl : ( ( rule__Model__TablesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( ( ( rule__Model__TablesAssignment_0 )* ) )
            // InternalMyDsl.g:265:1: ( ( rule__Model__TablesAssignment_0 )* )
            {
            // InternalMyDsl.g:265:1: ( ( rule__Model__TablesAssignment_0 )* )
            // InternalMyDsl.g:266:2: ( rule__Model__TablesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTablesAssignment_0()); 
            // InternalMyDsl.g:267:2: ( rule__Model__TablesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:267:3: rule__Model__TablesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__TablesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTablesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:275:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:279:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:280:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:286:1: rule__Model__Group__1__Impl : ( ( rule__Model__ViewModelsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:290:1: ( ( ( rule__Model__ViewModelsAssignment_1 )* ) )
            // InternalMyDsl.g:291:1: ( ( rule__Model__ViewModelsAssignment_1 )* )
            {
            // InternalMyDsl.g:291:1: ( ( rule__Model__ViewModelsAssignment_1 )* )
            // InternalMyDsl.g:292:2: ( rule__Model__ViewModelsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getViewModelsAssignment_1()); 
            // InternalMyDsl.g:293:2: ( rule__Model__ViewModelsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:293:3: rule__Model__ViewModelsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ViewModelsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getViewModelsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__ViewModel__Group__0"
    // InternalMyDsl.g:302:1: rule__ViewModel__Group__0 : rule__ViewModel__Group__0__Impl rule__ViewModel__Group__1 ;
    public final void rule__ViewModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( rule__ViewModel__Group__0__Impl rule__ViewModel__Group__1 )
            // InternalMyDsl.g:307:2: rule__ViewModel__Group__0__Impl rule__ViewModel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ViewModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__0"


    // $ANTLR start "rule__ViewModel__Group__0__Impl"
    // InternalMyDsl.g:314:1: rule__ViewModel__Group__0__Impl : ( 'viewModel' ) ;
    public final void rule__ViewModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( ( 'viewModel' ) )
            // InternalMyDsl.g:319:1: ( 'viewModel' )
            {
            // InternalMyDsl.g:319:1: ( 'viewModel' )
            // InternalMyDsl.g:320:2: 'viewModel'
            {
             before(grammarAccess.getViewModelAccess().getViewModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getViewModelAccess().getViewModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__0__Impl"


    // $ANTLR start "rule__ViewModel__Group__1"
    // InternalMyDsl.g:329:1: rule__ViewModel__Group__1 : rule__ViewModel__Group__1__Impl rule__ViewModel__Group__2 ;
    public final void rule__ViewModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( rule__ViewModel__Group__1__Impl rule__ViewModel__Group__2 )
            // InternalMyDsl.g:334:2: rule__ViewModel__Group__1__Impl rule__ViewModel__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ViewModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__1"


    // $ANTLR start "rule__ViewModel__Group__1__Impl"
    // InternalMyDsl.g:341:1: rule__ViewModel__Group__1__Impl : ( ( rule__ViewModel__NameAssignment_1 ) ) ;
    public final void rule__ViewModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( ( rule__ViewModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:346:1: ( ( rule__ViewModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:346:1: ( ( rule__ViewModel__NameAssignment_1 ) )
            // InternalMyDsl.g:347:2: ( rule__ViewModel__NameAssignment_1 )
            {
             before(grammarAccess.getViewModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:348:2: ( rule__ViewModel__NameAssignment_1 )
            // InternalMyDsl.g:348:3: rule__ViewModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ViewModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__1__Impl"


    // $ANTLR start "rule__ViewModel__Group__2"
    // InternalMyDsl.g:356:1: rule__ViewModel__Group__2 : rule__ViewModel__Group__2__Impl rule__ViewModel__Group__3 ;
    public final void rule__ViewModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( rule__ViewModel__Group__2__Impl rule__ViewModel__Group__3 )
            // InternalMyDsl.g:361:2: rule__ViewModel__Group__2__Impl rule__ViewModel__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ViewModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__2"


    // $ANTLR start "rule__ViewModel__Group__2__Impl"
    // InternalMyDsl.g:368:1: rule__ViewModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( ( '{' ) )
            // InternalMyDsl.g:373:1: ( '{' )
            {
            // InternalMyDsl.g:373:1: ( '{' )
            // InternalMyDsl.g:374:2: '{'
            {
             before(grammarAccess.getViewModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getViewModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__2__Impl"


    // $ANTLR start "rule__ViewModel__Group__3"
    // InternalMyDsl.g:383:1: rule__ViewModel__Group__3 : rule__ViewModel__Group__3__Impl rule__ViewModel__Group__4 ;
    public final void rule__ViewModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( rule__ViewModel__Group__3__Impl rule__ViewModel__Group__4 )
            // InternalMyDsl.g:388:2: rule__ViewModel__Group__3__Impl rule__ViewModel__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ViewModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__3"


    // $ANTLR start "rule__ViewModel__Group__3__Impl"
    // InternalMyDsl.g:395:1: rule__ViewModel__Group__3__Impl : ( ( ( rule__ViewModel__FieldsAssignment_3 ) ) ( ( rule__ViewModel__FieldsAssignment_3 )* ) ) ;
    public final void rule__ViewModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( ( ( rule__ViewModel__FieldsAssignment_3 ) ) ( ( rule__ViewModel__FieldsAssignment_3 )* ) ) )
            // InternalMyDsl.g:400:1: ( ( ( rule__ViewModel__FieldsAssignment_3 ) ) ( ( rule__ViewModel__FieldsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:400:1: ( ( ( rule__ViewModel__FieldsAssignment_3 ) ) ( ( rule__ViewModel__FieldsAssignment_3 )* ) )
            // InternalMyDsl.g:401:2: ( ( rule__ViewModel__FieldsAssignment_3 ) ) ( ( rule__ViewModel__FieldsAssignment_3 )* )
            {
            // InternalMyDsl.g:401:2: ( ( rule__ViewModel__FieldsAssignment_3 ) )
            // InternalMyDsl.g:402:3: ( rule__ViewModel__FieldsAssignment_3 )
            {
             before(grammarAccess.getViewModelAccess().getFieldsAssignment_3()); 
            // InternalMyDsl.g:403:3: ( rule__ViewModel__FieldsAssignment_3 )
            // InternalMyDsl.g:403:4: rule__ViewModel__FieldsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__ViewModel__FieldsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getViewModelAccess().getFieldsAssignment_3()); 

            }

            // InternalMyDsl.g:406:2: ( ( rule__ViewModel__FieldsAssignment_3 )* )
            // InternalMyDsl.g:407:3: ( rule__ViewModel__FieldsAssignment_3 )*
            {
             before(grammarAccess.getViewModelAccess().getFieldsAssignment_3()); 
            // InternalMyDsl.g:408:3: ( rule__ViewModel__FieldsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:408:4: rule__ViewModel__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ViewModel__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getViewModelAccess().getFieldsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__3__Impl"


    // $ANTLR start "rule__ViewModel__Group__4"
    // InternalMyDsl.g:417:1: rule__ViewModel__Group__4 : rule__ViewModel__Group__4__Impl ;
    public final void rule__ViewModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( rule__ViewModel__Group__4__Impl )
            // InternalMyDsl.g:422:2: rule__ViewModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__4"


    // $ANTLR start "rule__ViewModel__Group__4__Impl"
    // InternalMyDsl.g:428:1: rule__ViewModel__Group__4__Impl : ( '}' ) ;
    public final void rule__ViewModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( '}' ) )
            // InternalMyDsl.g:433:1: ( '}' )
            {
            // InternalMyDsl.g:433:1: ( '}' )
            // InternalMyDsl.g:434:2: '}'
            {
             before(grammarAccess.getViewModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getViewModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalMyDsl.g:444:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMyDsl.g:449:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalMyDsl.g:456:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( ( 'table' ) )
            // InternalMyDsl.g:461:1: ( 'table' )
            {
            // InternalMyDsl.g:461:1: ( 'table' )
            // InternalMyDsl.g:462:2: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalMyDsl.g:471:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMyDsl.g:476:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalMyDsl.g:483:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalMyDsl.g:488:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:488:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalMyDsl.g:489:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:490:2: ( rule__Table__NameAssignment_1 )
            // InternalMyDsl.g:490:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalMyDsl.g:498:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMyDsl.g:503:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMyDsl.g:510:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( '{' ) )
            // InternalMyDsl.g:515:1: ( '{' )
            {
            // InternalMyDsl.g:515:1: ( '{' )
            // InternalMyDsl.g:516:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMyDsl.g:525:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMyDsl.g:530:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMyDsl.g:537:1: rule__Table__Group__3__Impl : ( ( rule__Table__ItemsAssignment_3 )* ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( rule__Table__ItemsAssignment_3 )* ) )
            // InternalMyDsl.g:542:1: ( ( rule__Table__ItemsAssignment_3 )* )
            {
            // InternalMyDsl.g:542:1: ( ( rule__Table__ItemsAssignment_3 )* )
            // InternalMyDsl.g:543:2: ( rule__Table__ItemsAssignment_3 )*
            {
             before(grammarAccess.getTableAccess().getItemsAssignment_3()); 
            // InternalMyDsl.g:544:2: ( rule__Table__ItemsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:544:3: rule__Table__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getItemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalMyDsl.g:552:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( rule__Table__Group__4__Impl )
            // InternalMyDsl.g:557:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalMyDsl.g:563:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( '}' ) )
            // InternalMyDsl.g:568:1: ( '}' )
            {
            // InternalMyDsl.g:568:1: ( '}' )
            // InternalMyDsl.g:569:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Int32Item__Group__0"
    // InternalMyDsl.g:579:1: rule__Int32Item__Group__0 : rule__Int32Item__Group__0__Impl rule__Int32Item__Group__1 ;
    public final void rule__Int32Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( rule__Int32Item__Group__0__Impl rule__Int32Item__Group__1 )
            // InternalMyDsl.g:584:2: rule__Int32Item__Group__0__Impl rule__Int32Item__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Int32Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Item__Group__0"


    // $ANTLR start "rule__Int32Item__Group__0__Impl"
    // InternalMyDsl.g:591:1: rule__Int32Item__Group__0__Impl : ( 'int32' ) ;
    public final void rule__Int32Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( 'int32' ) )
            // InternalMyDsl.g:596:1: ( 'int32' )
            {
            // InternalMyDsl.g:596:1: ( 'int32' )
            // InternalMyDsl.g:597:2: 'int32'
            {
             before(grammarAccess.getInt32ItemAccess().getInt32Keyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInt32ItemAccess().getInt32Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Item__Group__0__Impl"


    // $ANTLR start "rule__Int32Item__Group__1"
    // InternalMyDsl.g:606:1: rule__Int32Item__Group__1 : rule__Int32Item__Group__1__Impl ;
    public final void rule__Int32Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( rule__Int32Item__Group__1__Impl )
            // InternalMyDsl.g:611:2: rule__Int32Item__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32Item__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Item__Group__1"


    // $ANTLR start "rule__Int32Item__Group__1__Impl"
    // InternalMyDsl.g:617:1: rule__Int32Item__Group__1__Impl : ( ( rule__Int32Item__NameAssignment_1 ) ) ;
    public final void rule__Int32Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__Int32Item__NameAssignment_1 ) ) )
            // InternalMyDsl.g:622:1: ( ( rule__Int32Item__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:622:1: ( ( rule__Int32Item__NameAssignment_1 ) )
            // InternalMyDsl.g:623:2: ( rule__Int32Item__NameAssignment_1 )
            {
             before(grammarAccess.getInt32ItemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:624:2: ( rule__Int32Item__NameAssignment_1 )
            // InternalMyDsl.g:624:3: rule__Int32Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Int32Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInt32ItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Item__Group__1__Impl"


    // $ANTLR start "rule__StringItem__Group__0"
    // InternalMyDsl.g:633:1: rule__StringItem__Group__0 : rule__StringItem__Group__0__Impl rule__StringItem__Group__1 ;
    public final void rule__StringItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__StringItem__Group__0__Impl rule__StringItem__Group__1 )
            // InternalMyDsl.g:638:2: rule__StringItem__Group__0__Impl rule__StringItem__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StringItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringItem__Group__0"


    // $ANTLR start "rule__StringItem__Group__0__Impl"
    // InternalMyDsl.g:645:1: rule__StringItem__Group__0__Impl : ( 'string' ) ;
    public final void rule__StringItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( 'string' ) )
            // InternalMyDsl.g:650:1: ( 'string' )
            {
            // InternalMyDsl.g:650:1: ( 'string' )
            // InternalMyDsl.g:651:2: 'string'
            {
             before(grammarAccess.getStringItemAccess().getStringKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringItemAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringItem__Group__0__Impl"


    // $ANTLR start "rule__StringItem__Group__1"
    // InternalMyDsl.g:660:1: rule__StringItem__Group__1 : rule__StringItem__Group__1__Impl ;
    public final void rule__StringItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__StringItem__Group__1__Impl )
            // InternalMyDsl.g:665:2: rule__StringItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringItem__Group__1"


    // $ANTLR start "rule__StringItem__Group__1__Impl"
    // InternalMyDsl.g:671:1: rule__StringItem__Group__1__Impl : ( ( rule__StringItem__NameAssignment_1 ) ) ;
    public final void rule__StringItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( rule__StringItem__NameAssignment_1 ) ) )
            // InternalMyDsl.g:676:1: ( ( rule__StringItem__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:676:1: ( ( rule__StringItem__NameAssignment_1 ) )
            // InternalMyDsl.g:677:2: ( rule__StringItem__NameAssignment_1 )
            {
             before(grammarAccess.getStringItemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:678:2: ( rule__StringItem__NameAssignment_1 )
            // InternalMyDsl.g:678:3: rule__StringItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringItem__Group__1__Impl"


    // $ANTLR start "rule__BindingField__Group__0"
    // InternalMyDsl.g:687:1: rule__BindingField__Group__0 : rule__BindingField__Group__0__Impl rule__BindingField__Group__1 ;
    public final void rule__BindingField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__BindingField__Group__0__Impl rule__BindingField__Group__1 )
            // InternalMyDsl.g:692:2: rule__BindingField__Group__0__Impl rule__BindingField__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BindingField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__0"


    // $ANTLR start "rule__BindingField__Group__0__Impl"
    // InternalMyDsl.g:699:1: rule__BindingField__Group__0__Impl : ( 'field' ) ;
    public final void rule__BindingField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( 'field' ) )
            // InternalMyDsl.g:704:1: ( 'field' )
            {
            // InternalMyDsl.g:704:1: ( 'field' )
            // InternalMyDsl.g:705:2: 'field'
            {
             before(grammarAccess.getBindingFieldAccess().getFieldKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBindingFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__0__Impl"


    // $ANTLR start "rule__BindingField__Group__1"
    // InternalMyDsl.g:714:1: rule__BindingField__Group__1 : rule__BindingField__Group__1__Impl rule__BindingField__Group__2 ;
    public final void rule__BindingField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__BindingField__Group__1__Impl rule__BindingField__Group__2 )
            // InternalMyDsl.g:719:2: rule__BindingField__Group__1__Impl rule__BindingField__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BindingField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__1"


    // $ANTLR start "rule__BindingField__Group__1__Impl"
    // InternalMyDsl.g:726:1: rule__BindingField__Group__1__Impl : ( ( rule__BindingField__NameAssignment_1 ) ) ;
    public final void rule__BindingField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( ( rule__BindingField__NameAssignment_1 ) ) )
            // InternalMyDsl.g:731:1: ( ( rule__BindingField__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:731:1: ( ( rule__BindingField__NameAssignment_1 ) )
            // InternalMyDsl.g:732:2: ( rule__BindingField__NameAssignment_1 )
            {
             before(grammarAccess.getBindingFieldAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:733:2: ( rule__BindingField__NameAssignment_1 )
            // InternalMyDsl.g:733:3: rule__BindingField__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BindingField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__1__Impl"


    // $ANTLR start "rule__BindingField__Group__2"
    // InternalMyDsl.g:741:1: rule__BindingField__Group__2 : rule__BindingField__Group__2__Impl rule__BindingField__Group__3 ;
    public final void rule__BindingField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__BindingField__Group__2__Impl rule__BindingField__Group__3 )
            // InternalMyDsl.g:746:2: rule__BindingField__Group__2__Impl rule__BindingField__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__BindingField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__2"


    // $ANTLR start "rule__BindingField__Group__2__Impl"
    // InternalMyDsl.g:753:1: rule__BindingField__Group__2__Impl : ( 'binds' ) ;
    public final void rule__BindingField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( 'binds' ) )
            // InternalMyDsl.g:758:1: ( 'binds' )
            {
            // InternalMyDsl.g:758:1: ( 'binds' )
            // InternalMyDsl.g:759:2: 'binds'
            {
             before(grammarAccess.getBindingFieldAccess().getBindsKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBindingFieldAccess().getBindsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__2__Impl"


    // $ANTLR start "rule__BindingField__Group__3"
    // InternalMyDsl.g:768:1: rule__BindingField__Group__3 : rule__BindingField__Group__3__Impl rule__BindingField__Group__4 ;
    public final void rule__BindingField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__BindingField__Group__3__Impl rule__BindingField__Group__4 )
            // InternalMyDsl.g:773:2: rule__BindingField__Group__3__Impl rule__BindingField__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__BindingField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__3"


    // $ANTLR start "rule__BindingField__Group__3__Impl"
    // InternalMyDsl.g:780:1: rule__BindingField__Group__3__Impl : ( ( rule__BindingField__TableAssignment_3 ) ) ;
    public final void rule__BindingField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__BindingField__TableAssignment_3 ) ) )
            // InternalMyDsl.g:785:1: ( ( rule__BindingField__TableAssignment_3 ) )
            {
            // InternalMyDsl.g:785:1: ( ( rule__BindingField__TableAssignment_3 ) )
            // InternalMyDsl.g:786:2: ( rule__BindingField__TableAssignment_3 )
            {
             before(grammarAccess.getBindingFieldAccess().getTableAssignment_3()); 
            // InternalMyDsl.g:787:2: ( rule__BindingField__TableAssignment_3 )
            // InternalMyDsl.g:787:3: rule__BindingField__TableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BindingField__TableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindingFieldAccess().getTableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__3__Impl"


    // $ANTLR start "rule__BindingField__Group__4"
    // InternalMyDsl.g:795:1: rule__BindingField__Group__4 : rule__BindingField__Group__4__Impl rule__BindingField__Group__5 ;
    public final void rule__BindingField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__BindingField__Group__4__Impl rule__BindingField__Group__5 )
            // InternalMyDsl.g:800:2: rule__BindingField__Group__4__Impl rule__BindingField__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__BindingField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BindingField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__4"


    // $ANTLR start "rule__BindingField__Group__4__Impl"
    // InternalMyDsl.g:807:1: rule__BindingField__Group__4__Impl : ( '.' ) ;
    public final void rule__BindingField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( '.' ) )
            // InternalMyDsl.g:812:1: ( '.' )
            {
            // InternalMyDsl.g:812:1: ( '.' )
            // InternalMyDsl.g:813:2: '.'
            {
             before(grammarAccess.getBindingFieldAccess().getFullStopKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBindingFieldAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__4__Impl"


    // $ANTLR start "rule__BindingField__Group__5"
    // InternalMyDsl.g:822:1: rule__BindingField__Group__5 : rule__BindingField__Group__5__Impl ;
    public final void rule__BindingField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__BindingField__Group__5__Impl )
            // InternalMyDsl.g:827:2: rule__BindingField__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BindingField__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__5"


    // $ANTLR start "rule__BindingField__Group__5__Impl"
    // InternalMyDsl.g:833:1: rule__BindingField__Group__5__Impl : ( ( rule__BindingField__ItemAssignment_5 ) ) ;
    public final void rule__BindingField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__BindingField__ItemAssignment_5 ) ) )
            // InternalMyDsl.g:838:1: ( ( rule__BindingField__ItemAssignment_5 ) )
            {
            // InternalMyDsl.g:838:1: ( ( rule__BindingField__ItemAssignment_5 ) )
            // InternalMyDsl.g:839:2: ( rule__BindingField__ItemAssignment_5 )
            {
             before(grammarAccess.getBindingFieldAccess().getItemAssignment_5()); 
            // InternalMyDsl.g:840:2: ( rule__BindingField__ItemAssignment_5 )
            // InternalMyDsl.g:840:3: rule__BindingField__ItemAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BindingField__ItemAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingFieldAccess().getItemAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__Group__5__Impl"


    // $ANTLR start "rule__Model__TablesAssignment_0"
    // InternalMyDsl.g:849:1: rule__Model__TablesAssignment_0 : ( ruleTable ) ;
    public final void rule__Model__TablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( ruleTable ) )
            // InternalMyDsl.g:854:2: ( ruleTable )
            {
            // InternalMyDsl.g:854:2: ( ruleTable )
            // InternalMyDsl.g:855:3: ruleTable
            {
             before(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTablesTableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TablesAssignment_0"


    // $ANTLR start "rule__Model__ViewModelsAssignment_1"
    // InternalMyDsl.g:864:1: rule__Model__ViewModelsAssignment_1 : ( ruleViewModel ) ;
    public final void rule__Model__ViewModelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ruleViewModel ) )
            // InternalMyDsl.g:869:2: ( ruleViewModel )
            {
            // InternalMyDsl.g:869:2: ( ruleViewModel )
            // InternalMyDsl.g:870:3: ruleViewModel
            {
             before(grammarAccess.getModelAccess().getViewModelsViewModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleViewModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getViewModelsViewModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ViewModelsAssignment_1"


    // $ANTLR start "rule__ViewModel__NameAssignment_1"
    // InternalMyDsl.g:879:1: rule__ViewModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ViewModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:884:2: ( RULE_ID )
            {
            // InternalMyDsl.g:884:2: ( RULE_ID )
            // InternalMyDsl.g:885:3: RULE_ID
            {
             before(grammarAccess.getViewModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__NameAssignment_1"


    // $ANTLR start "rule__ViewModel__FieldsAssignment_3"
    // InternalMyDsl.g:894:1: rule__ViewModel__FieldsAssignment_3 : ( ruleBindingField ) ;
    public final void rule__ViewModel__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( ruleBindingField ) )
            // InternalMyDsl.g:899:2: ( ruleBindingField )
            {
            // InternalMyDsl.g:899:2: ( ruleBindingField )
            // InternalMyDsl.g:900:3: ruleBindingField
            {
             before(grammarAccess.getViewModelAccess().getFieldsBindingFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBindingField();

            state._fsp--;

             after(grammarAccess.getViewModelAccess().getFieldsBindingFieldParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewModel__FieldsAssignment_3"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalMyDsl.g:909:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:914:2: ( RULE_ID )
            {
            // InternalMyDsl.g:914:2: ( RULE_ID )
            // InternalMyDsl.g:915:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ItemsAssignment_3"
    // InternalMyDsl.g:924:1: rule__Table__ItemsAssignment_3 : ( ruleAbstructItem ) ;
    public final void rule__Table__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( ruleAbstructItem ) )
            // InternalMyDsl.g:929:2: ( ruleAbstructItem )
            {
            // InternalMyDsl.g:929:2: ( ruleAbstructItem )
            // InternalMyDsl.g:930:3: ruleAbstructItem
            {
             before(grammarAccess.getTableAccess().getItemsAbstructItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstructItem();

            state._fsp--;

             after(grammarAccess.getTableAccess().getItemsAbstructItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ItemsAssignment_3"


    // $ANTLR start "rule__Int32Item__NameAssignment_1"
    // InternalMyDsl.g:939:1: rule__Int32Item__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Int32Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:944:2: ( RULE_ID )
            {
            // InternalMyDsl.g:944:2: ( RULE_ID )
            // InternalMyDsl.g:945:3: RULE_ID
            {
             before(grammarAccess.getInt32ItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInt32ItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Item__NameAssignment_1"


    // $ANTLR start "rule__StringItem__NameAssignment_1"
    // InternalMyDsl.g:954:1: rule__StringItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:959:2: ( RULE_ID )
            {
            // InternalMyDsl.g:959:2: ( RULE_ID )
            // InternalMyDsl.g:960:3: RULE_ID
            {
             before(grammarAccess.getStringItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringItem__NameAssignment_1"


    // $ANTLR start "rule__BindingField__NameAssignment_1"
    // InternalMyDsl.g:969:1: rule__BindingField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BindingField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:974:2: ( RULE_ID )
            {
            // InternalMyDsl.g:974:2: ( RULE_ID )
            // InternalMyDsl.g:975:3: RULE_ID
            {
             before(grammarAccess.getBindingFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__NameAssignment_1"


    // $ANTLR start "rule__BindingField__TableAssignment_3"
    // InternalMyDsl.g:984:1: rule__BindingField__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__BindingField__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:989:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:989:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:990:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingFieldAccess().getTableTableCrossReference_3_0()); 
            // InternalMyDsl.g:991:3: ( RULE_ID )
            // InternalMyDsl.g:992:4: RULE_ID
            {
             before(grammarAccess.getBindingFieldAccess().getTableTableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingFieldAccess().getTableTableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBindingFieldAccess().getTableTableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__TableAssignment_3"


    // $ANTLR start "rule__BindingField__ItemAssignment_5"
    // InternalMyDsl.g:1003:1: rule__BindingField__ItemAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__BindingField__ItemAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1008:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1008:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1009:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingFieldAccess().getItemAbstructItemCrossReference_5_0()); 
            // InternalMyDsl.g:1010:3: ( RULE_ID )
            // InternalMyDsl.g:1011:4: RULE_ID
            {
             before(grammarAccess.getBindingFieldAccess().getItemAbstructItemIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingFieldAccess().getItemAbstructItemIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBindingFieldAccess().getItemAbstructItemCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingField__ItemAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});

}