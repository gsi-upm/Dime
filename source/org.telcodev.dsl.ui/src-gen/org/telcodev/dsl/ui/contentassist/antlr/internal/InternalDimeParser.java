package org.telcodev.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.telcodev.dsl.services.DimeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_EVENTENUM", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_SESSION", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'state'", "'times'", "'{'", "'}'", "'timeout'", "'dialTo'", "';'", "'play'", "'record'", "'seconds'", "'in'", "'->'", "'get'", "'digits'", "'ask'", "'choices'", "'send'", "'to'", "','", "'=>'", "'say'", "'goTo'", "'when'", "'else'", "'if'", "'varString'", "'='", "'varNum'", "'varBool'", "'withStates'", "'reject;'", "'hangUp;'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_OBRACKET=11;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_BOOL=19;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_CONCATENATION=16;
    public static final int RULE_INT=5;
    public static final int RULE_COMPARE=13;
    public static final int RULE_CBRACKET=12;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_NEGATION=14;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_DOUBLE=4;
    public static final int RULE_NULL=17;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_LOGIC_WORD=10;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SESSION=18;
    public static final int RULE_EVENTENUM=9;
    public static final int RULE_WS=21;
    public static final int RULE_MATH=15;

    // delegates
    // delegators


        public InternalDimeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimeParser.tokenNames; }
    public String getGrammarFileName() { return "../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g"; }


     
     	private DimeGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DimeGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDocument"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:60:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:61:1: ( ruleDocument EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:62:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument61);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument68); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:69:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:73:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:74:1: ( ( rule__Document__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:74:1: ( ( rule__Document__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:75:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:76:1: ( rule__Document__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:76:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument94);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:89:1: ( ruleAbstractElement EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement121);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement128); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement154);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleStatement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:116:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:117:1: ( ruleStatement EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:118:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement181);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement188); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:125:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:129:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:130:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:130:1: ( ( rule__Statement__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:131:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:132:1: ( rule__Statement__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:132:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement214);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStateAbstractElement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:144:1: entryRuleStateAbstractElement : ruleStateAbstractElement EOF ;
    public final void entryRuleStateAbstractElement() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:145:1: ( ruleStateAbstractElement EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:146:1: ruleStateAbstractElement EOF
            {
             before(grammarAccess.getStateAbstractElementRule()); 
            pushFollow(FOLLOW_ruleStateAbstractElement_in_entryRuleStateAbstractElement241);
            ruleStateAbstractElement();

            state._fsp--;

             after(grammarAccess.getStateAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAbstractElement248); 

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
    // $ANTLR end "entryRuleStateAbstractElement"


    // $ANTLR start "ruleStateAbstractElement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:153:1: ruleStateAbstractElement : ( ( rule__StateAbstractElement__Alternatives ) ) ;
    public final void ruleStateAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:157:2: ( ( ( rule__StateAbstractElement__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:158:1: ( ( rule__StateAbstractElement__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:158:1: ( ( rule__StateAbstractElement__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:159:1: ( rule__StateAbstractElement__Alternatives )
            {
             before(grammarAccess.getStateAbstractElementAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:160:1: ( rule__StateAbstractElement__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:160:2: rule__StateAbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__StateAbstractElement__Alternatives_in_ruleStateAbstractElement274);
            rule__StateAbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStateAbstractElement"


    // $ANTLR start "entryRuleState"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:172:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:173:1: ( ruleState EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:174:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState301);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState308); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:181:1: ruleState : ( ( rule__State__UnorderedGroup ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:185:2: ( ( ( rule__State__UnorderedGroup ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:186:1: ( ( rule__State__UnorderedGroup ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:186:1: ( ( rule__State__UnorderedGroup ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:187:1: ( rule__State__UnorderedGroup )
            {
             before(grammarAccess.getStateAccess().getUnorderedGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:188:1: ( rule__State__UnorderedGroup )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:188:2: rule__State__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup_in_ruleState334);
            rule__State__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVoiceTag"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:200:1: entryRuleVoiceTag : ruleVoiceTag EOF ;
    public final void entryRuleVoiceTag() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:201:1: ( ruleVoiceTag EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:202:1: ruleVoiceTag EOF
            {
             before(grammarAccess.getVoiceTagRule()); 
            pushFollow(FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag361);
            ruleVoiceTag();

            state._fsp--;

             after(grammarAccess.getVoiceTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoiceTag368); 

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
    // $ANTLR end "entryRuleVoiceTag"


    // $ANTLR start "ruleVoiceTag"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:209:1: ruleVoiceTag : ( ( rule__VoiceTag__Alternatives ) ) ;
    public final void ruleVoiceTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:213:2: ( ( ( rule__VoiceTag__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:214:1: ( ( rule__VoiceTag__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:214:1: ( ( rule__VoiceTag__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:215:1: ( rule__VoiceTag__Alternatives )
            {
             before(grammarAccess.getVoiceTagAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:216:1: ( rule__VoiceTag__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:216:2: rule__VoiceTag__Alternatives
            {
            pushFollow(FOLLOW_rule__VoiceTag__Alternatives_in_ruleVoiceTag394);
            rule__VoiceTag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVoiceTagAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVoiceTag"


    // $ANTLR start "entryRuleDial"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:228:1: entryRuleDial : ruleDial EOF ;
    public final void entryRuleDial() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:229:1: ( ruleDial EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:230:1: ruleDial EOF
            {
             before(grammarAccess.getDialRule()); 
            pushFollow(FOLLOW_ruleDial_in_entryRuleDial421);
            ruleDial();

            state._fsp--;

             after(grammarAccess.getDialRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDial428); 

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
    // $ANTLR end "entryRuleDial"


    // $ANTLR start "ruleDial"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:237:1: ruleDial : ( ( rule__Dial__Group__0 ) ) ;
    public final void ruleDial() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:241:2: ( ( ( rule__Dial__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:242:1: ( ( rule__Dial__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:242:1: ( ( rule__Dial__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:243:1: ( rule__Dial__Group__0 )
            {
             before(grammarAccess.getDialAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:244:1: ( rule__Dial__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:244:2: rule__Dial__Group__0
            {
            pushFollow(FOLLOW_rule__Dial__Group__0_in_ruleDial454);
            rule__Dial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDialAccess().getGroup()); 

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
    // $ANTLR end "ruleDial"


    // $ANTLR start "entryRulePlay"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:256:1: entryRulePlay : rulePlay EOF ;
    public final void entryRulePlay() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:257:1: ( rulePlay EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:258:1: rulePlay EOF
            {
             before(grammarAccess.getPlayRule()); 
            pushFollow(FOLLOW_rulePlay_in_entryRulePlay481);
            rulePlay();

            state._fsp--;

             after(grammarAccess.getPlayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlay488); 

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
    // $ANTLR end "entryRulePlay"


    // $ANTLR start "rulePlay"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:265:1: rulePlay : ( ( rule__Play__Group__0 ) ) ;
    public final void rulePlay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:269:2: ( ( ( rule__Play__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:270:1: ( ( rule__Play__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:270:1: ( ( rule__Play__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:271:1: ( rule__Play__Group__0 )
            {
             before(grammarAccess.getPlayAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:272:1: ( rule__Play__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:272:2: rule__Play__Group__0
            {
            pushFollow(FOLLOW_rule__Play__Group__0_in_rulePlay514);
            rule__Play__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayAccess().getGroup()); 

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
    // $ANTLR end "rulePlay"


    // $ANTLR start "entryRuleRecord"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:284:1: entryRuleRecord : ruleRecord EOF ;
    public final void entryRuleRecord() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:285:1: ( ruleRecord EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:286:1: ruleRecord EOF
            {
             before(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord541);
            ruleRecord();

            state._fsp--;

             after(grammarAccess.getRecordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord548); 

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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:293:1: ruleRecord : ( ( rule__Record__Group__0 ) ) ;
    public final void ruleRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:297:2: ( ( ( rule__Record__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:298:1: ( ( rule__Record__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:298:1: ( ( rule__Record__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:299:1: ( rule__Record__Group__0 )
            {
             before(grammarAccess.getRecordAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:300:1: ( rule__Record__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:300:2: rule__Record__Group__0
            {
            pushFollow(FOLLOW_rule__Record__Group__0_in_ruleRecord574);
            rule__Record__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getGroup()); 

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
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleReject"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:312:1: entryRuleReject : ruleReject EOF ;
    public final void entryRuleReject() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:313:1: ( ruleReject EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:314:1: ruleReject EOF
            {
             before(grammarAccess.getRejectRule()); 
            pushFollow(FOLLOW_ruleReject_in_entryRuleReject601);
            ruleReject();

            state._fsp--;

             after(grammarAccess.getRejectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReject608); 

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
    // $ANTLR end "entryRuleReject"


    // $ANTLR start "ruleReject"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:321:1: ruleReject : ( ( rule__Reject__NameAssignment ) ) ;
    public final void ruleReject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:325:2: ( ( ( rule__Reject__NameAssignment ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:326:1: ( ( rule__Reject__NameAssignment ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:326:1: ( ( rule__Reject__NameAssignment ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:327:1: ( rule__Reject__NameAssignment )
            {
             before(grammarAccess.getRejectAccess().getNameAssignment()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:328:1: ( rule__Reject__NameAssignment )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:328:2: rule__Reject__NameAssignment
            {
            pushFollow(FOLLOW_rule__Reject__NameAssignment_in_ruleReject634);
            rule__Reject__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRejectAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleReject"


    // $ANTLR start "entryRuleHangup"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:340:1: entryRuleHangup : ruleHangup EOF ;
    public final void entryRuleHangup() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:341:1: ( ruleHangup EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:342:1: ruleHangup EOF
            {
             before(grammarAccess.getHangupRule()); 
            pushFollow(FOLLOW_ruleHangup_in_entryRuleHangup661);
            ruleHangup();

            state._fsp--;

             after(grammarAccess.getHangupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHangup668); 

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
    // $ANTLR end "entryRuleHangup"


    // $ANTLR start "ruleHangup"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:349:1: ruleHangup : ( ( rule__Hangup__NameAssignment ) ) ;
    public final void ruleHangup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:353:2: ( ( ( rule__Hangup__NameAssignment ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:354:1: ( ( rule__Hangup__NameAssignment ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:354:1: ( ( rule__Hangup__NameAssignment ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:355:1: ( rule__Hangup__NameAssignment )
            {
             before(grammarAccess.getHangupAccess().getNameAssignment()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:356:1: ( rule__Hangup__NameAssignment )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:356:2: rule__Hangup__NameAssignment
            {
            pushFollow(FOLLOW_rule__Hangup__NameAssignment_in_ruleHangup694);
            rule__Hangup__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHangupAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleHangup"


    // $ANTLR start "entryRuleGetDigits"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:368:1: entryRuleGetDigits : ruleGetDigits EOF ;
    public final void entryRuleGetDigits() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:369:1: ( ruleGetDigits EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:370:1: ruleGetDigits EOF
            {
             before(grammarAccess.getGetDigitsRule()); 
            pushFollow(FOLLOW_ruleGetDigits_in_entryRuleGetDigits721);
            ruleGetDigits();

            state._fsp--;

             after(grammarAccess.getGetDigitsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDigits728); 

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
    // $ANTLR end "entryRuleGetDigits"


    // $ANTLR start "ruleGetDigits"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:377:1: ruleGetDigits : ( ( rule__GetDigits__Group__0 ) ) ;
    public final void ruleGetDigits() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:381:2: ( ( ( rule__GetDigits__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:382:1: ( ( rule__GetDigits__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:382:1: ( ( rule__GetDigits__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:383:1: ( rule__GetDigits__Group__0 )
            {
             before(grammarAccess.getGetDigitsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:384:1: ( rule__GetDigits__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:384:2: rule__GetDigits__Group__0
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__0_in_ruleGetDigits754);
            rule__GetDigits__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetDigitsAccess().getGroup()); 

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
    // $ANTLR end "ruleGetDigits"


    // $ANTLR start "entryRuleAsk"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:396:1: entryRuleAsk : ruleAsk EOF ;
    public final void entryRuleAsk() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:397:1: ( ruleAsk EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:398:1: ruleAsk EOF
            {
             before(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_ruleAsk_in_entryRuleAsk781);
            ruleAsk();

            state._fsp--;

             after(grammarAccess.getAskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsk788); 

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
    // $ANTLR end "entryRuleAsk"


    // $ANTLR start "ruleAsk"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:405:1: ruleAsk : ( ( rule__Ask__Group__0 ) ) ;
    public final void ruleAsk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:409:2: ( ( ( rule__Ask__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:410:1: ( ( rule__Ask__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:410:1: ( ( rule__Ask__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:411:1: ( rule__Ask__Group__0 )
            {
             before(grammarAccess.getAskAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:412:1: ( rule__Ask__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:412:2: rule__Ask__Group__0
            {
            pushFollow(FOLLOW_rule__Ask__Group__0_in_ruleAsk814);
            rule__Ask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getGroup()); 

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
    // $ANTLR end "ruleAsk"


    // $ANTLR start "entryRuleSend"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:424:1: entryRuleSend : ruleSend EOF ;
    public final void entryRuleSend() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:425:1: ( ruleSend EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:426:1: ruleSend EOF
            {
             before(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend841);
            ruleSend();

            state._fsp--;

             after(grammarAccess.getSendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend848); 

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
    // $ANTLR end "entryRuleSend"


    // $ANTLR start "ruleSend"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:433:1: ruleSend : ( ( rule__Send__Group__0 ) ) ;
    public final void ruleSend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:437:2: ( ( ( rule__Send__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:438:1: ( ( rule__Send__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:438:1: ( ( rule__Send__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:439:1: ( rule__Send__Group__0 )
            {
             before(grammarAccess.getSendAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:440:1: ( rule__Send__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:440:2: rule__Send__Group__0
            {
            pushFollow(FOLLOW_rule__Send__Group__0_in_ruleSend874);
            rule__Send__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendAccess().getGroup()); 

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
    // $ANTLR end "ruleSend"


    // $ANTLR start "entryRuleSendBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:452:1: entryRuleSendBlock : ruleSendBlock EOF ;
    public final void entryRuleSendBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:453:1: ( ruleSendBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:454:1: ruleSendBlock EOF
            {
             before(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock901);
            ruleSendBlock();

            state._fsp--;

             after(grammarAccess.getSendBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock908); 

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
    // $ANTLR end "entryRuleSendBlock"


    // $ANTLR start "ruleSendBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:461:1: ruleSendBlock : ( ( rule__SendBlock__Group__0 ) ) ;
    public final void ruleSendBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:465:2: ( ( ( rule__SendBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:466:1: ( ( rule__SendBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:466:1: ( ( rule__SendBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:467:1: ( rule__SendBlock__Group__0 )
            {
             before(grammarAccess.getSendBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:468:1: ( rule__SendBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:468:2: rule__SendBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0_in_ruleSendBlock934);
            rule__SendBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleSendBlock"


    // $ANTLR start "entryRuleNotPrimaryParam"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:480:1: entryRuleNotPrimaryParam : ruleNotPrimaryParam EOF ;
    public final void entryRuleNotPrimaryParam() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:481:1: ( ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:482:1: ruleNotPrimaryParam EOF
            {
             before(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam961);
            ruleNotPrimaryParam();

            state._fsp--;

             after(grammarAccess.getNotPrimaryParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam968); 

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
    // $ANTLR end "entryRuleNotPrimaryParam"


    // $ANTLR start "ruleNotPrimaryParam"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:489:1: ruleNotPrimaryParam : ( ( rule__NotPrimaryParam__Group__0 ) ) ;
    public final void ruleNotPrimaryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:493:2: ( ( ( rule__NotPrimaryParam__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:494:1: ( ( rule__NotPrimaryParam__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:494:1: ( ( rule__NotPrimaryParam__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:495:1: ( rule__NotPrimaryParam__Group__0 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:496:1: ( rule__NotPrimaryParam__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:496:2: rule__NotPrimaryParam__Group__0
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0_in_ruleNotPrimaryParam994);
            rule__NotPrimaryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotPrimaryParamAccess().getGroup()); 

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
    // $ANTLR end "ruleNotPrimaryParam"


    // $ANTLR start "entryRuleParam"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:508:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:509:1: ( ruleParam EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:510:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1021);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1028); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:517:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:521:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:522:1: ( ( rule__Param__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:522:1: ( ( rule__Param__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:523:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:524:1: ( rule__Param__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:524:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam1054);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSay"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:536:1: entryRuleSay : ruleSay EOF ;
    public final void entryRuleSay() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:537:1: ( ruleSay EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:538:1: ruleSay EOF
            {
             before(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay1081);
            ruleSay();

            state._fsp--;

             after(grammarAccess.getSayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay1088); 

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
    // $ANTLR end "entryRuleSay"


    // $ANTLR start "ruleSay"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:545:1: ruleSay : ( ( rule__Say__Group__0 ) ) ;
    public final void ruleSay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:549:2: ( ( ( rule__Say__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:550:1: ( ( rule__Say__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:550:1: ( ( rule__Say__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:551:1: ( rule__Say__Group__0 )
            {
             before(grammarAccess.getSayAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:552:1: ( rule__Say__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:552:2: rule__Say__Group__0
            {
            pushFollow(FOLLOW_rule__Say__Group__0_in_ruleSay1114);
            rule__Say__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSayAccess().getGroup()); 

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
    // $ANTLR end "ruleSay"


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:564:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:565:1: ( ruleTransition EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:566:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1141);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1148); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:573:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:577:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:578:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:578:1: ( ( rule__Transition__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:579:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:580:1: ( rule__Transition__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:580:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition1174);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleIfExp"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:592:1: entryRuleIfExp : ruleIfExp EOF ;
    public final void entryRuleIfExp() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:593:1: ( ruleIfExp EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:594:1: ruleIfExp EOF
            {
             before(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp1201);
            ruleIfExp();

            state._fsp--;

             after(grammarAccess.getIfExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp1208); 

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
    // $ANTLR end "entryRuleIfExp"


    // $ANTLR start "ruleIfExp"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:601:1: ruleIfExp : ( ( rule__IfExp__Group__0 ) ) ;
    public final void ruleIfExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:605:2: ( ( ( rule__IfExp__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:606:1: ( ( rule__IfExp__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:606:1: ( ( rule__IfExp__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:607:1: ( rule__IfExp__Group__0 )
            {
             before(grammarAccess.getIfExpAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:608:1: ( rule__IfExp__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:608:2: rule__IfExp__Group__0
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1234);
            rule__IfExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfExpAccess().getGroup()); 

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
    // $ANTLR end "ruleIfExp"


    // $ANTLR start "entryRuleBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:620:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:621:1: ( ruleBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:622:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1261);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1268); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:629:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:633:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__Block__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:635:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:1: ( rule__Block__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1294);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleCondBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:648:1: entryRuleCondBlock : ruleCondBlock EOF ;
    public final void entryRuleCondBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:649:1: ( ruleCondBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:650:1: ruleCondBlock EOF
            {
             before(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock1321);
            ruleCondBlock();

            state._fsp--;

             after(grammarAccess.getCondBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock1328); 

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
    // $ANTLR end "entryRuleCondBlock"


    // $ANTLR start "ruleCondBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:657:1: ruleCondBlock : ( ( rule__CondBlock__Group__0 ) ) ;
    public final void ruleCondBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:661:2: ( ( ( rule__CondBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:662:1: ( ( rule__CondBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:662:1: ( ( rule__CondBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:663:1: ( rule__CondBlock__Group__0 )
            {
             before(grammarAccess.getCondBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:664:1: ( rule__CondBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:664:2: rule__CondBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1354);
            rule__CondBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleCondBlock"


    // $ANTLR start "entryRuleIfStateExp"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:676:1: entryRuleIfStateExp : ruleIfStateExp EOF ;
    public final void entryRuleIfStateExp() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:677:1: ( ruleIfStateExp EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:678:1: ruleIfStateExp EOF
            {
             before(grammarAccess.getIfStateExpRule()); 
            pushFollow(FOLLOW_ruleIfStateExp_in_entryRuleIfStateExp1381);
            ruleIfStateExp();

            state._fsp--;

             after(grammarAccess.getIfStateExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStateExp1388); 

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
    // $ANTLR end "entryRuleIfStateExp"


    // $ANTLR start "ruleIfStateExp"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:685:1: ruleIfStateExp : ( ( rule__IfStateExp__Group__0 ) ) ;
    public final void ruleIfStateExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:689:2: ( ( ( rule__IfStateExp__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__IfStateExp__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__IfStateExp__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:691:1: ( rule__IfStateExp__Group__0 )
            {
             before(grammarAccess.getIfStateExpAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:1: ( rule__IfStateExp__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:2: rule__IfStateExp__Group__0
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group__0_in_ruleIfStateExp1414);
            rule__IfStateExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStateExpAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStateExp"


    // $ANTLR start "entryRuleCondStateBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:704:1: entryRuleCondStateBlock : ruleCondStateBlock EOF ;
    public final void entryRuleCondStateBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:705:1: ( ruleCondStateBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:706:1: ruleCondStateBlock EOF
            {
             before(grammarAccess.getCondStateBlockRule()); 
            pushFollow(FOLLOW_ruleCondStateBlock_in_entryRuleCondStateBlock1441);
            ruleCondStateBlock();

            state._fsp--;

             after(grammarAccess.getCondStateBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondStateBlock1448); 

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
    // $ANTLR end "entryRuleCondStateBlock"


    // $ANTLR start "ruleCondStateBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:713:1: ruleCondStateBlock : ( ( rule__CondStateBlock__Group__0 ) ) ;
    public final void ruleCondStateBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:717:2: ( ( ( rule__CondStateBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__CondStateBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__CondStateBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:719:1: ( rule__CondStateBlock__Group__0 )
            {
             before(grammarAccess.getCondStateBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:1: ( rule__CondStateBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:2: rule__CondStateBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CondStateBlock__Group__0_in_ruleCondStateBlock1474);
            rule__CondStateBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondStateBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleCondStateBlock"


    // $ANTLR start "entryRuleBlockState"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:732:1: entryRuleBlockState : ruleBlockState EOF ;
    public final void entryRuleBlockState() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:733:1: ( ruleBlockState EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:734:1: ruleBlockState EOF
            {
             before(grammarAccess.getBlockStateRule()); 
            pushFollow(FOLLOW_ruleBlockState_in_entryRuleBlockState1501);
            ruleBlockState();

            state._fsp--;

             after(grammarAccess.getBlockStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockState1508); 

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
    // $ANTLR end "entryRuleBlockState"


    // $ANTLR start "ruleBlockState"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:741:1: ruleBlockState : ( ( rule__BlockState__Group__0 ) ) ;
    public final void ruleBlockState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:745:2: ( ( ( rule__BlockState__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__BlockState__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__BlockState__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:747:1: ( rule__BlockState__Group__0 )
            {
             before(grammarAccess.getBlockStateAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:1: ( rule__BlockState__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:2: rule__BlockState__Group__0
            {
            pushFollow(FOLLOW_rule__BlockState__Group__0_in_ruleBlockState1534);
            rule__BlockState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockStateAccess().getGroup()); 

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
    // $ANTLR end "ruleBlockState"


    // $ANTLR start "entryRuleBoolExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:760:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:761:1: ( ruleBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:762:1: ruleBoolExpression EOF
            {
             before(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1561);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression1568); 

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
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:769:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:773:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__BoolExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__BoolExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:775:1: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:1: ( rule__BoolExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:2: rule__BoolExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1594);
            rule__BoolExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleTerminalBoolExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:788:1: entryRuleTerminalBoolExpression : ruleTerminalBoolExpression EOF ;
    public final void entryRuleTerminalBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:789:1: ( ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:790:1: ruleTerminalBoolExpression EOF
            {
             before(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1621);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getTerminalBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression1628); 

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
    // $ANTLR end "entryRuleTerminalBoolExpression"


    // $ANTLR start "ruleTerminalBoolExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:797:1: ruleTerminalBoolExpression : ( ( rule__TerminalBoolExpression__Alternatives ) ) ;
    public final void ruleTerminalBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:801:2: ( ( ( rule__TerminalBoolExpression__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:803:1: ( rule__TerminalBoolExpression__Alternatives )
            {
             before(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:1: ( rule__TerminalBoolExpression__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:2: rule__TerminalBoolExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1654);
            rule__TerminalBoolExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerminalBoolExpression"


    // $ANTLR start "entryRuleBrackets"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:816:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:817:1: ( ruleBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:818:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1681);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1688); 

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
    // $ANTLR end "entryRuleBrackets"


    // $ANTLR start "ruleBrackets"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:825:1: ruleBrackets : ( ( rule__Brackets__Group__0 ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:829:2: ( ( ( rule__Brackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__Brackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__Brackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:831:1: ( rule__Brackets__Group__0 )
            {
             before(grammarAccess.getBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:1: ( rule__Brackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:2: rule__Brackets__Group__0
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1714);
            rule__Brackets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracketsAccess().getGroup()); 

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
    // $ANTLR end "ruleBrackets"


    // $ANTLR start "entryRuleCompareExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:844:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:845:1: ( ruleCompareExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:846:1: ruleCompareExpression EOF
            {
             before(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1741);
            ruleCompareExpression();

            state._fsp--;

             after(grammarAccess.getCompareExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1748); 

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
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:853:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:857:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:859:1: ( rule__CompareExpression__Group__0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:1: ( rule__CompareExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1774);
            rule__CompareExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:872:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:873:1: ( ruleNegExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:874:1: ruleNegExpression EOF
            {
             before(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression1801);
            ruleNegExpression();

            state._fsp--;

             after(grammarAccess.getNegExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression1808); 

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
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:881:1: ruleNegExpression : ( ( rule__NegExpression__Group__0 ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:885:2: ( ( ( rule__NegExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__NegExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__NegExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:887:1: ( rule__NegExpression__Group__0 )
            {
             before(grammarAccess.getNegExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:1: ( rule__NegExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:2: rule__NegExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1834);
            rule__NegExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleMathExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:900:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:901:1: ( ruleMathExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:902:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression1861);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression1868); 

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
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:909:1: ruleMathExpression : ( ( rule__MathExpression__Group__0 ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:913:2: ( ( ( rule__MathExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__MathExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__MathExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:915:1: ( rule__MathExpression__Group__0 )
            {
             before(grammarAccess.getMathExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:1: ( rule__MathExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:2: rule__MathExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1894);
            rule__MathExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleMathTerminal"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:928:1: entryRuleMathTerminal : ruleMathTerminal EOF ;
    public final void entryRuleMathTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:929:1: ( ruleMathTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:930:1: ruleMathTerminal EOF
            {
             before(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1921);
            ruleMathTerminal();

            state._fsp--;

             after(grammarAccess.getMathTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal1928); 

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
    // $ANTLR end "entryRuleMathTerminal"


    // $ANTLR start "ruleMathTerminal"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:937:1: ruleMathTerminal : ( ( rule__MathTerminal__Alternatives ) ) ;
    public final void ruleMathTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:941:2: ( ( ( rule__MathTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__MathTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__MathTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:943:1: ( rule__MathTerminal__Alternatives )
            {
             before(grammarAccess.getMathTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:1: ( rule__MathTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:2: rule__MathTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1954);
            rule__MathTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathTerminalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMathTerminal"


    // $ANTLR start "entryRuleMathBrackets"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:956:1: entryRuleMathBrackets : ruleMathBrackets EOF ;
    public final void entryRuleMathBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:957:1: ( ruleMathBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:958:1: ruleMathBrackets EOF
            {
             before(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1981);
            ruleMathBrackets();

            state._fsp--;

             after(grammarAccess.getMathBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets1988); 

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
    // $ANTLR end "entryRuleMathBrackets"


    // $ANTLR start "ruleMathBrackets"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:965:1: ruleMathBrackets : ( ( rule__MathBrackets__Group__0 ) ) ;
    public final void ruleMathBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:969:2: ( ( ( rule__MathBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__MathBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__MathBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:971:1: ( rule__MathBrackets__Group__0 )
            {
             before(grammarAccess.getMathBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:1: ( rule__MathBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:2: rule__MathBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets2014);
            rule__MathBrackets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathBracketsAccess().getGroup()); 

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
    // $ANTLR end "ruleMathBrackets"


    // $ANTLR start "entryRuleConcatenationExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:984:1: entryRuleConcatenationExpression : ruleConcatenationExpression EOF ;
    public final void entryRuleConcatenationExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:985:1: ( ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:986:1: ruleConcatenationExpression EOF
            {
             before(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression2041);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression2048); 

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
    // $ANTLR end "entryRuleConcatenationExpression"


    // $ANTLR start "ruleConcatenationExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:993:1: ruleConcatenationExpression : ( ( rule__ConcatenationExpression__Group__0 ) ) ;
    public final void ruleConcatenationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:997:2: ( ( ( rule__ConcatenationExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:999:1: ( rule__ConcatenationExpression__Group__0 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:1: ( rule__ConcatenationExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:2: rule__ConcatenationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression2074);
            rule__ConcatenationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleConcatenationExpression"


    // $ANTLR start "entryRuleConcatenationTerminal"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1012:1: entryRuleConcatenationTerminal : ruleConcatenationTerminal EOF ;
    public final void entryRuleConcatenationTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1013:1: ( ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1014:1: ruleConcatenationTerminal EOF
            {
             before(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal2101);
            ruleConcatenationTerminal();

            state._fsp--;

             after(grammarAccess.getConcatenationTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal2108); 

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
    // $ANTLR end "entryRuleConcatenationTerminal"


    // $ANTLR start "ruleConcatenationTerminal"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1021:1: ruleConcatenationTerminal : ( ( rule__ConcatenationTerminal__Alternatives ) ) ;
    public final void ruleConcatenationTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1025:2: ( ( ( rule__ConcatenationTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1027:1: ( rule__ConcatenationTerminal__Alternatives )
            {
             before(grammarAccess.getConcatenationTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:1: ( rule__ConcatenationTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:2: rule__ConcatenationTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2134);
            rule__ConcatenationTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationTerminalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConcatenationTerminal"


    // $ANTLR start "entryRuleConcatenationBrackets"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1040:1: entryRuleConcatenationBrackets : ruleConcatenationBrackets EOF ;
    public final void entryRuleConcatenationBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1041:1: ( ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1042:1: ruleConcatenationBrackets EOF
            {
             before(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2161);
            ruleConcatenationBrackets();

            state._fsp--;

             after(grammarAccess.getConcatenationBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets2168); 

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
    // $ANTLR end "entryRuleConcatenationBrackets"


    // $ANTLR start "ruleConcatenationBrackets"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1049:1: ruleConcatenationBrackets : ( ( rule__ConcatenationBrackets__Group__0 ) ) ;
    public final void ruleConcatenationBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1053:2: ( ( ( rule__ConcatenationBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1055:1: ( rule__ConcatenationBrackets__Group__0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:1: ( rule__ConcatenationBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:2: rule__ConcatenationBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2194);
            rule__ConcatenationBrackets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationBracketsAccess().getGroup()); 

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
    // $ANTLR end "ruleConcatenationBrackets"


    // $ANTLR start "entryRuleStringVariable"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1068:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1069:1: ( ruleStringVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1070:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable2221);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable2228); 

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
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1077:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1081:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__StringVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__StringVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1083:1: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:1: ( rule__StringVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:2: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2254);
            rule__StringVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleNumVariable"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1096:1: entryRuleNumVariable : ruleNumVariable EOF ;
    public final void entryRuleNumVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1097:1: ( ruleNumVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1098:1: ruleNumVariable EOF
            {
             before(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable2281);
            ruleNumVariable();

            state._fsp--;

             after(grammarAccess.getNumVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable2288); 

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
    // $ANTLR end "entryRuleNumVariable"


    // $ANTLR start "ruleNumVariable"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1105:1: ruleNumVariable : ( ( rule__NumVariable__Group__0 ) ) ;
    public final void ruleNumVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1109:2: ( ( ( rule__NumVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1110:1: ( ( rule__NumVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1110:1: ( ( rule__NumVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1111:1: ( rule__NumVariable__Group__0 )
            {
             before(grammarAccess.getNumVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:1: ( rule__NumVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:2: rule__NumVariable__Group__0
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2314);
            rule__NumVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleNumVariable"


    // $ANTLR start "entryRuleBoolVariable"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1124:1: entryRuleBoolVariable : ruleBoolVariable EOF ;
    public final void entryRuleBoolVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1125:1: ( ruleBoolVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1126:1: ruleBoolVariable EOF
            {
             before(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2341);
            ruleBoolVariable();

            state._fsp--;

             after(grammarAccess.getBoolVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable2348); 

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
    // $ANTLR end "entryRuleBoolVariable"


    // $ANTLR start "ruleBoolVariable"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1133:1: ruleBoolVariable : ( ( rule__BoolVariable__Group__0 ) ) ;
    public final void ruleBoolVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1137:2: ( ( ( rule__BoolVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1138:1: ( ( rule__BoolVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1138:1: ( ( rule__BoolVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1139:1: ( rule__BoolVariable__Group__0 )
            {
             before(grammarAccess.getBoolVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:1: ( rule__BoolVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:2: rule__BoolVariable__Group__0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2374);
            rule__BoolVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleBoolVariable"


    // $ANTLR start "entryRuleAssigment"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1152:1: entryRuleAssigment : ruleAssigment EOF ;
    public final void entryRuleAssigment() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1153:1: ( ruleAssigment EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1154:1: ruleAssigment EOF
            {
             before(grammarAccess.getAssigmentRule()); 
            pushFollow(FOLLOW_ruleAssigment_in_entryRuleAssigment2401);
            ruleAssigment();

            state._fsp--;

             after(grammarAccess.getAssigmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigment2408); 

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
    // $ANTLR end "entryRuleAssigment"


    // $ANTLR start "ruleAssigment"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1161:1: ruleAssigment : ( ( rule__Assigment__Group__0 ) ) ;
    public final void ruleAssigment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1165:2: ( ( ( rule__Assigment__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1166:1: ( ( rule__Assigment__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1166:1: ( ( rule__Assigment__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1167:1: ( rule__Assigment__Group__0 )
            {
             before(grammarAccess.getAssigmentAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:1: ( rule__Assigment__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:2: rule__Assigment__Group__0
            {
            pushFollow(FOLLOW_rule__Assigment__Group__0_in_ruleAssigment2434);
            rule__Assigment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssigmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssigment"


    // $ANTLR start "entryRuleLiteralAbs"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1182:1: entryRuleLiteralAbs : ruleLiteralAbs EOF ;
    public final void entryRuleLiteralAbs() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1183:1: ( ruleLiteralAbs EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1184:1: ruleLiteralAbs EOF
            {
             before(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2463);
            ruleLiteralAbs();

            state._fsp--;

             after(grammarAccess.getLiteralAbsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs2470); 

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
    // $ANTLR end "entryRuleLiteralAbs"


    // $ANTLR start "ruleLiteralAbs"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1191:1: ruleLiteralAbs : ( ( rule__LiteralAbs__Alternatives ) ) ;
    public final void ruleLiteralAbs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1195:2: ( ( ( rule__LiteralAbs__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1196:1: ( ( rule__LiteralAbs__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1196:1: ( ( rule__LiteralAbs__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1197:1: ( rule__LiteralAbs__Alternatives )
            {
             before(grammarAccess.getLiteralAbsAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1198:1: ( rule__LiteralAbs__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1198:2: rule__LiteralAbs__Alternatives
            {
            pushFollow(FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2496);
            rule__LiteralAbs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAbsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteralAbs"


    // $ANTLR start "entryRuleLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1210:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1211:1: ( ruleLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1212:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2523);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2530); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1219:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1223:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1224:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1224:1: ( ( rule__Literal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1225:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1226:1: ( rule__Literal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1226:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2556);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1238:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1239:1: ( ruleBoolLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1240:1: ruleBoolLiteral EOF
            {
             before(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2583);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getBoolLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral2590); 

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1247:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Group__0 ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1251:2: ( ( ( rule__BoolLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1252:1: ( ( rule__BoolLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1252:1: ( ( rule__BoolLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1253:1: ( rule__BoolLiteral__Group__0 )
            {
             before(grammarAccess.getBoolLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1254:1: ( rule__BoolLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1254:2: rule__BoolLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2616);
            rule__BoolLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleNumLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1266:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1267:1: ( ruleNumLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1268:1: ruleNumLiteral EOF
            {
             before(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2643);
            ruleNumLiteral();

            state._fsp--;

             after(grammarAccess.getNumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral2650); 

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
    // $ANTLR end "entryRuleNumLiteral"


    // $ANTLR start "ruleNumLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1275:1: ruleNumLiteral : ( ( rule__NumLiteral__Group__0 ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1279:2: ( ( ( rule__NumLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1280:1: ( ( rule__NumLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1280:1: ( ( rule__NumLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1281:1: ( rule__NumLiteral__Group__0 )
            {
             before(grammarAccess.getNumLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1282:1: ( rule__NumLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1282:2: rule__NumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2676);
            rule__NumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleNumLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1294:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1295:1: ( ruleStringLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1296:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2703);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2710); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1303:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1307:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1308:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1308:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1309:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1310:1: ( rule__StringLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1310:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2736);
            rule__StringLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumber"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1322:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1323:1: ( ruleNumber EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1324:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2763);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2770); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1331:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1335:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1336:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1336:1: ( ( rule__Number__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1337:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1338:1: ( rule__Number__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1338:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber2796);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1350:1: rule__AbstractElement__Alternatives : ( ( ruleStatement ) | ( ruleIfExp ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1354:1: ( ( ruleStatement ) | ( ruleIfExp ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ML_COMMENT)||LA1_0==29||(LA1_0>=31 && LA1_0<=32)||LA1_0==36||LA1_0==38||LA1_0==40||LA1_0==44||LA1_0==49||(LA1_0>=51 && LA1_0<=52)||(LA1_0>=54 && LA1_0<=55)) ) {
                alt1=1;
            }
            else if ( (LA1_0==48) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1355:1: ( ruleStatement )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1355:1: ( ruleStatement )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1356:1: ruleStatement
                    {
                     before(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives2832);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1361:6: ( ruleIfExp )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1361:6: ( ruleIfExp )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1362:1: ruleIfExp
                    {
                     before(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives2849);
                    ruleIfExp();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1372:1: rule__Statement__Alternatives : ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleVoiceTag ) | ( ruleAssigment ) | ( ( rule__Statement__ComAssignment_5 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1376:1: ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleVoiceTag ) | ( ruleAssigment ) | ( ( rule__Statement__ComAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt2=1;
                }
                break;
            case 49:
                {
                alt2=2;
                }
                break;
            case 52:
                {
                alt2=3;
                }
                break;
            case 29:
            case 31:
            case 32:
            case 36:
            case 38:
            case 40:
            case 44:
            case 54:
            case 55:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1377:1: ( ruleNumVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1377:1: ( ruleNumVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1378:1: ruleNumVariable
                    {
                     before(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2881);
                    ruleNumVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1383:6: ( ruleStringVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1383:6: ( ruleStringVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1384:1: ruleStringVariable
                    {
                     before(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2898);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1389:6: ( ruleBoolVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1389:6: ( ruleBoolVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1390:1: ruleBoolVariable
                    {
                     before(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2915);
                    ruleBoolVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1395:6: ( ruleVoiceTag )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1395:6: ( ruleVoiceTag )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1396:1: ruleVoiceTag
                    {
                     before(grammarAccess.getStatementAccess().getVoiceTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVoiceTag_in_rule__Statement__Alternatives2932);
                    ruleVoiceTag();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVoiceTagParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1401:6: ( ruleAssigment )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1401:6: ( ruleAssigment )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1402:1: ruleAssigment
                    {
                     before(grammarAccess.getStatementAccess().getAssigmentParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAssigment_in_rule__Statement__Alternatives2949);
                    ruleAssigment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssigmentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1407:6: ( ( rule__Statement__ComAssignment_5 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1407:6: ( ( rule__Statement__ComAssignment_5 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1408:1: ( rule__Statement__ComAssignment_5 )
                    {
                     before(grammarAccess.getStatementAccess().getComAssignment_5()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1409:1: ( rule__Statement__ComAssignment_5 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1409:2: rule__Statement__ComAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Statement__ComAssignment_5_in_rule__Statement__Alternatives2966);
                    rule__Statement__ComAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getComAssignment_5()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__StateAbstractElement__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1418:1: rule__StateAbstractElement__Alternatives : ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfStateExp ) );
    public final void rule__StateAbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1422:1: ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfStateExp ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_ML_COMMENT:
            case 29:
            case 31:
            case 32:
            case 36:
            case 38:
            case 40:
            case 44:
            case 49:
            case 51:
            case 52:
            case 54:
            case 55:
                {
                alt3=1;
                }
                break;
            case 45:
                {
                alt3=2;
                }
                break;
            case 48:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1423:1: ( ruleStatement )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1423:1: ( ruleStatement )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1424:1: ruleStatement
                    {
                     before(grammarAccess.getStateAbstractElementAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__StateAbstractElement__Alternatives2999);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getStateAbstractElementAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1429:6: ( ruleTransition )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1429:6: ( ruleTransition )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1430:1: ruleTransition
                    {
                     before(grammarAccess.getStateAbstractElementAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__StateAbstractElement__Alternatives3016);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getStateAbstractElementAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1435:6: ( ruleIfStateExp )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1435:6: ( ruleIfStateExp )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1436:1: ruleIfStateExp
                    {
                     before(grammarAccess.getStateAbstractElementAccess().getIfStateExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIfStateExp_in_rule__StateAbstractElement__Alternatives3033);
                    ruleIfStateExp();

                    state._fsp--;

                     after(grammarAccess.getStateAbstractElementAccess().getIfStateExpParserRuleCall_2()); 

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
    // $ANTLR end "rule__StateAbstractElement__Alternatives"


    // $ANTLR start "rule__VoiceTag__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1446:1: rule__VoiceTag__Alternatives : ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) );
    public final void rule__VoiceTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1450:1: ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 38:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            case 54:
                {
                alt4=8;
                }
                break;
            case 55:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1451:1: ( ruleSay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1451:1: ( ruleSay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1452:1: ruleSay
                    {
                     before(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3065);
                    ruleSay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1457:6: ( ruleDial )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1457:6: ( ruleDial )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1458:1: ruleDial
                    {
                     before(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3082);
                    ruleDial();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1463:6: ( rulePlay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1463:6: ( rulePlay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1464:1: rulePlay
                    {
                     before(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3099);
                    rulePlay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1469:6: ( ruleRecord )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1469:6: ( ruleRecord )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1470:1: ruleRecord
                    {
                     before(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3116);
                    ruleRecord();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1475:6: ( ruleGetDigits )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1475:6: ( ruleGetDigits )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1476:1: ruleGetDigits
                    {
                     before(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3133);
                    ruleGetDigits();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1481:6: ( ruleAsk )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1481:6: ( ruleAsk )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1482:1: ruleAsk
                    {
                     before(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives3150);
                    ruleAsk();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1487:6: ( ruleSend )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1487:6: ( ruleSend )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1488:1: ruleSend
                    {
                     before(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3167);
                    ruleSend();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1493:6: ( ruleReject )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1493:6: ( ruleReject )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1494:1: ruleReject
                    {
                     before(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3184);
                    ruleReject();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1499:6: ( ruleHangup )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1499:6: ( ruleHangup )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1500:1: ruleHangup
                    {
                     before(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3201);
                    ruleHangup();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 

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
    // $ANTLR end "rule__VoiceTag__Alternatives"


    // $ANTLR start "rule__TerminalBoolExpression__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1510:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) );
    public final void rule__TerminalBoolExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1514:1: ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1515:1: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1515:1: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1516:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3233);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1521:6: ( ruleCompareExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1521:6: ( ruleCompareExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1522:1: ruleCompareExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3250);
                    ruleCompareExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1527:6: ( ruleNegExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1527:6: ( ruleNegExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1528:1: ruleNegExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3267);
                    ruleNegExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1533:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1533:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1534:1: ruleLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3284);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1539:6: ( ruleBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1539:6: ( ruleBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1540:1: ruleBrackets
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3301);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 

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
    // $ANTLR end "rule__TerminalBoolExpression__Alternatives"


    // $ANTLR start "rule__MathTerminal__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1550:1: rule__MathTerminal__Alternatives : ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) );
    public final void rule__MathTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1554:1: ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case RULE_SESSION:
                {
                alt6=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1555:1: ( ruleMathBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1555:1: ( ruleMathBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1556:1: ruleMathBrackets
                    {
                     before(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3333);
                    ruleMathBrackets();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1561:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1561:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1562:1: ruleLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3350);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1568:1: ruleNumLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3367);
                    ruleNumLiteral();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__MathTerminal__Alternatives"


    // $ANTLR start "rule__ConcatenationTerminal__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1578:1: rule__ConcatenationTerminal__Alternatives : ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) );
    public final void rule__ConcatenationTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1582:1: ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OBRACKET) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_DOUBLE && LA7_0<=RULE_ID)||LA7_0==RULE_STRING||(LA7_0>=RULE_NULL && LA7_0<=RULE_BOOL)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1583:1: ( ruleConcatenationBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1583:1: ( ruleConcatenationBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1584:1: ruleConcatenationBrackets
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3399);
                    ruleConcatenationBrackets();

                    state._fsp--;

                     after(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1589:6: ( ruleLiteralAbs )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1589:6: ( ruleLiteralAbs )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1590:1: ruleLiteralAbs
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3416);
                    ruleLiteralAbs();

                    state._fsp--;

                     after(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 

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
    // $ANTLR end "rule__ConcatenationTerminal__Alternatives"


    // $ANTLR start "rule__LiteralAbs__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1601:1: rule__LiteralAbs__Alternatives : ( ( ruleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) );
    public final void rule__LiteralAbs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1605:1: ( ( ruleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_NULL:
            case RULE_SESSION:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_BOOL:
                {
                alt8=3;
                }
                break;
            case RULE_DOUBLE:
            case RULE_INT:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1606:1: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1606:1: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1607:1: ruleLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3449);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1612:6: ( ruleStringLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1612:6: ( ruleStringLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1613:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__LiteralAbs__Alternatives3466);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1618:6: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1618:6: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1619:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getBoolLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__LiteralAbs__Alternatives3483);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getBoolLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1624:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1624:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1625:1: ruleNumLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getNumLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__LiteralAbs__Alternatives3500);
                    ruleNumLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getNumLiteralParserRuleCall_3()); 

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
    // $ANTLR end "rule__LiteralAbs__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1635:1: rule__Literal__Alternatives : ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ( rule__Literal__SesAssignment_2 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1639:1: ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ( rule__Literal__SesAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_NULL:
                {
                alt9=2;
                }
                break;
            case RULE_SESSION:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1640:1: ( ( rule__Literal__VAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1640:1: ( ( rule__Literal__VAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1641:1: ( rule__Literal__VAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getVAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1642:1: ( rule__Literal__VAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1642:2: rule__Literal__VAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3532);
                    rule__Literal__VAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getVAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1646:6: ( ( rule__Literal__NulAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1646:6: ( ( rule__Literal__NulAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1647:1: ( rule__Literal__NulAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getNulAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1648:1: ( rule__Literal__NulAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1648:2: rule__Literal__NulAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3550);
                    rule__Literal__NulAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getNulAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1652:6: ( ( rule__Literal__SesAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1652:6: ( ( rule__Literal__SesAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1653:1: ( rule__Literal__SesAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getSesAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1654:1: ( rule__Literal__SesAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1654:2: rule__Literal__SesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__SesAssignment_2_in_rule__Literal__Alternatives3568);
                    rule__Literal__SesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getSesAssignment_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1663:1: rule__Number__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1667:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOUBLE) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1668:1: ( RULE_DOUBLE )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1668:1: ( RULE_DOUBLE )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1669:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3601); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1674:6: ( RULE_INT )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1674:6: ( RULE_INT )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1675:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives3618); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Document__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1687:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1691:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1692:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03648);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03651);
            rule__Document__Group__1();

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
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1699:1: rule__Document__Group__0__Impl : ( 'application' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1703:1: ( ( 'application' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1704:1: ( 'application' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1704:1: ( 'application' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1705:1: 'application'
            {
             before(grammarAccess.getDocumentAccess().getApplicationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Document__Group__0__Impl3679); 
             after(grammarAccess.getDocumentAccess().getApplicationKeyword_0()); 

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
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1718:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1722:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1723:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13710);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__13713);
            rule__Document__Group__2();

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
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1730:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1734:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1735:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1735:1: ( ( rule__Document__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1736:1: ( rule__Document__NameAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1737:1: ( rule__Document__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1737:2: rule__Document__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl3740);
            rule__Document__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1747:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1751:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1752:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__23770);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__23773);
            rule__Document__Group__3();

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
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1759:1: rule__Document__Group__2__Impl : ( ( rule__Document__StatesAssignment_2 )? ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1763:1: ( ( ( rule__Document__StatesAssignment_2 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1764:1: ( ( rule__Document__StatesAssignment_2 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1764:1: ( ( rule__Document__StatesAssignment_2 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1765:1: ( rule__Document__StatesAssignment_2 )?
            {
             before(grammarAccess.getDocumentAccess().getStatesAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1766:1: ( rule__Document__StatesAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1766:2: rule__Document__StatesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Document__StatesAssignment_2_in_rule__Document__Group__2__Impl3800);
                    rule__Document__StatesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getStatesAssignment_2()); 

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
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Document__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1776:1: rule__Document__Group__3 : rule__Document__Group__3__Impl rule__Document__Group__4 ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1780:1: ( rule__Document__Group__3__Impl rule__Document__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1781:2: rule__Document__Group__3__Impl rule__Document__Group__4
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__33831);
            rule__Document__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__4_in_rule__Document__Group__33834);
            rule__Document__Group__4();

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
    // $ANTLR end "rule__Document__Group__3"


    // $ANTLR start "rule__Document__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1788:1: rule__Document__Group__3__Impl : ( ( rule__Document__ElementsAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1792:1: ( ( ( rule__Document__ElementsAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1793:1: ( ( rule__Document__ElementsAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1793:1: ( ( rule__Document__ElementsAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1794:1: ( rule__Document__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getElementsAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1795:1: ( rule__Document__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_ML_COMMENT)||LA12_0==29||(LA12_0>=31 && LA12_0<=32)||LA12_0==36||LA12_0==38||LA12_0==40||LA12_0==44||(LA12_0>=48 && LA12_0<=49)||(LA12_0>=51 && LA12_0<=52)||(LA12_0>=54 && LA12_0<=55)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1795:2: rule__Document__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Document__ElementsAssignment_3_in_rule__Document__Group__3__Impl3861);
            	    rule__Document__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Document__Group__3__Impl"


    // $ANTLR start "rule__Document__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1805:1: rule__Document__Group__4 : rule__Document__Group__4__Impl ;
    public final void rule__Document__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1809:1: ( rule__Document__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1810:2: rule__Document__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__4__Impl_in_rule__Document__Group__43892);
            rule__Document__Group__4__Impl();

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
    // $ANTLR end "rule__Document__Group__4"


    // $ANTLR start "rule__Document__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1816:1: rule__Document__Group__4__Impl : ( ( rule__Document__StaAssignment_4 )* ) ;
    public final void rule__Document__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1820:1: ( ( ( rule__Document__StaAssignment_4 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1821:1: ( ( rule__Document__StaAssignment_4 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1821:1: ( ( rule__Document__StaAssignment_4 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1822:1: ( rule__Document__StaAssignment_4 )*
            {
             before(grammarAccess.getDocumentAccess().getStaAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1823:1: ( rule__Document__StaAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24||LA13_0==26||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1823:2: rule__Document__StaAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Document__StaAssignment_4_in_rule__Document__Group__4__Impl3919);
            	    rule__Document__StaAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getStaAssignment_4()); 

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
    // $ANTLR end "rule__Document__Group__4__Impl"


    // $ANTLR start "rule__State__Group_0__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1843:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1847:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1848:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__03960);
            rule__State__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__03963);
            rule__State__Group_0__1();

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
    // $ANTLR end "rule__State__Group_0__0"


    // $ANTLR start "rule__State__Group_0__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1855:1: rule__State__Group_0__0__Impl : ( 'state' ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1859:1: ( ( 'state' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1860:1: ( 'state' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1860:1: ( 'state' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1861:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__State__Group_0__0__Impl3991); 
             after(grammarAccess.getStateAccess().getStateKeyword_0_0()); 

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
    // $ANTLR end "rule__State__Group_0__0__Impl"


    // $ANTLR start "rule__State__Group_0__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl rule__State__Group_0__2 ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1878:1: ( rule__State__Group_0__1__Impl rule__State__Group_0__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1879:2: rule__State__Group_0__1__Impl rule__State__Group_0__2
            {
            pushFollow(FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__14022);
            rule__State__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__14025);
            rule__State__Group_0__2();

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
    // $ANTLR end "rule__State__Group_0__1"


    // $ANTLR start "rule__State__Group_0__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1886:1: rule__State__Group_0__1__Impl : ( ( rule__State__NameAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1890:1: ( ( ( rule__State__NameAssignment_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1891:1: ( ( rule__State__NameAssignment_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1891:1: ( ( rule__State__NameAssignment_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1892:1: ( rule__State__NameAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1893:1: ( rule__State__NameAssignment_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1893:2: rule__State__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl4052);
            rule__State__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__State__Group_0__1__Impl"


    // $ANTLR start "rule__State__Group_0__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1903:1: rule__State__Group_0__2 : rule__State__Group_0__2__Impl ;
    public final void rule__State__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1907:1: ( rule__State__Group_0__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:2: rule__State__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__24082);
            rule__State__Group_0__2__Impl();

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
    // $ANTLR end "rule__State__Group_0__2"


    // $ANTLR start "rule__State__Group_0__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:1: rule__State__Group_0__2__Impl : ( ( rule__State__Group_0_2__0 )? ) ;
    public final void rule__State__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1918:1: ( ( ( rule__State__Group_0_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1919:1: ( ( rule__State__Group_0_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1919:1: ( ( rule__State__Group_0_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:1: ( rule__State__Group_0_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1921:1: ( rule__State__Group_0_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1921:2: rule__State__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl4109);
                    rule__State__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__State__Group_0__2__Impl"


    // $ANTLR start "rule__State__Group_0_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1937:1: rule__State__Group_0_2__0 : rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 ;
    public final void rule__State__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1941:1: ( rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:2: rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__04146);
            rule__State__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__04149);
            rule__State__Group_0_2__1();

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
    // $ANTLR end "rule__State__Group_0_2__0"


    // $ANTLR start "rule__State__Group_0_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1949:1: rule__State__Group_0_2__0__Impl : ( 'times' ) ;
    public final void rule__State__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1953:1: ( ( 'times' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:1: ( 'times' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:1: ( 'times' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1955:1: 'times'
            {
             before(grammarAccess.getStateAccess().getTimesKeyword_0_2_0()); 
            match(input,25,FOLLOW_25_in_rule__State__Group_0_2__0__Impl4177); 
             after(grammarAccess.getStateAccess().getTimesKeyword_0_2_0()); 

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
    // $ANTLR end "rule__State__Group_0_2__0__Impl"


    // $ANTLR start "rule__State__Group_0_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1968:1: rule__State__Group_0_2__1 : rule__State__Group_0_2__1__Impl ;
    public final void rule__State__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1972:1: ( rule__State__Group_0_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1973:2: rule__State__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__14208);
            rule__State__Group_0_2__1__Impl();

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
    // $ANTLR end "rule__State__Group_0_2__1"


    // $ANTLR start "rule__State__Group_0_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1979:1: rule__State__Group_0_2__1__Impl : ( ( rule__State__TimesAssignment_0_2_1 ) ) ;
    public final void rule__State__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1983:1: ( ( ( rule__State__TimesAssignment_0_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1984:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1984:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1985:1: ( rule__State__TimesAssignment_0_2_1 )
            {
             before(grammarAccess.getStateAccess().getTimesAssignment_0_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1986:1: ( rule__State__TimesAssignment_0_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1986:2: rule__State__TimesAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl4235);
            rule__State__TimesAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTimesAssignment_0_2_1()); 

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
    // $ANTLR end "rule__State__Group_0_2__1__Impl"


    // $ANTLR start "rule__State__Group_1__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2000:1: rule__State__Group_1__0 : rule__State__Group_1__0__Impl rule__State__Group_1__1 ;
    public final void rule__State__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2004:1: ( rule__State__Group_1__0__Impl rule__State__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2005:2: rule__State__Group_1__0__Impl rule__State__Group_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__04269);
            rule__State__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__04272);
            rule__State__Group_1__1();

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
    // $ANTLR end "rule__State__Group_1__0"


    // $ANTLR start "rule__State__Group_1__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2012:1: rule__State__Group_1__0__Impl : ( ( rule__State__Group_1_0__0 )? ) ;
    public final void rule__State__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2016:1: ( ( ( rule__State__Group_1_0__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2017:1: ( ( rule__State__Group_1_0__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2017:1: ( ( rule__State__Group_1_0__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2018:1: ( rule__State__Group_1_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2019:1: ( rule__State__Group_1_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2019:2: rule__State__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4299);
                    rule__State__Group_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__State__Group_1__0__Impl"


    // $ANTLR start "rule__State__Group_1__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2029:1: rule__State__Group_1__1 : rule__State__Group_1__1__Impl rule__State__Group_1__2 ;
    public final void rule__State__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2033:1: ( rule__State__Group_1__1__Impl rule__State__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2034:2: rule__State__Group_1__1__Impl rule__State__Group_1__2
            {
            pushFollow(FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14330);
            rule__State__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14333);
            rule__State__Group_1__2();

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
    // $ANTLR end "rule__State__Group_1__1"


    // $ANTLR start "rule__State__Group_1__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2041:1: rule__State__Group_1__1__Impl : ( '{' ) ;
    public final void rule__State__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2045:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2046:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2046:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2047:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__State__Group_1__1__Impl4361); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__State__Group_1__1__Impl"


    // $ANTLR start "rule__State__Group_1__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2060:1: rule__State__Group_1__2 : rule__State__Group_1__2__Impl rule__State__Group_1__3 ;
    public final void rule__State__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2064:1: ( rule__State__Group_1__2__Impl rule__State__Group_1__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2065:2: rule__State__Group_1__2__Impl rule__State__Group_1__3
            {
            pushFollow(FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24392);
            rule__State__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__24395);
            rule__State__Group_1__3();

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
    // $ANTLR end "rule__State__Group_1__2"


    // $ANTLR start "rule__State__Group_1__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2072:1: rule__State__Group_1__2__Impl : ( ( rule__State__StmsAssignment_1_2 )* ) ;
    public final void rule__State__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2076:1: ( ( ( rule__State__StmsAssignment_1_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2077:1: ( ( rule__State__StmsAssignment_1_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2077:1: ( ( rule__State__StmsAssignment_1_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2078:1: ( rule__State__StmsAssignment_1_2 )*
            {
             before(grammarAccess.getStateAccess().getStmsAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2079:1: ( rule__State__StmsAssignment_1_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_ML_COMMENT)||LA16_0==29||(LA16_0>=31 && LA16_0<=32)||LA16_0==36||LA16_0==38||LA16_0==40||(LA16_0>=44 && LA16_0<=45)||(LA16_0>=48 && LA16_0<=49)||(LA16_0>=51 && LA16_0<=52)||(LA16_0>=54 && LA16_0<=55)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2079:2: rule__State__StmsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl4422);
            	    rule__State__StmsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getStmsAssignment_1_2()); 

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
    // $ANTLR end "rule__State__Group_1__2__Impl"


    // $ANTLR start "rule__State__Group_1__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2089:1: rule__State__Group_1__3 : rule__State__Group_1__3__Impl ;
    public final void rule__State__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2093:1: ( rule__State__Group_1__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2094:2: rule__State__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__34453);
            rule__State__Group_1__3__Impl();

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
    // $ANTLR end "rule__State__Group_1__3"


    // $ANTLR start "rule__State__Group_1__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2100:1: rule__State__Group_1__3__Impl : ( '}' ) ;
    public final void rule__State__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2104:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2105:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2105:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2106:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_1__3__Impl4481); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__State__Group_1__3__Impl"


    // $ANTLR start "rule__State__Group_1_0__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2127:1: rule__State__Group_1_0__0 : rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 ;
    public final void rule__State__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2131:1: ( rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2132:2: rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__04520);
            rule__State__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__04523);
            rule__State__Group_1_0__1();

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
    // $ANTLR end "rule__State__Group_1_0__0"


    // $ANTLR start "rule__State__Group_1_0__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2139:1: rule__State__Group_1_0__0__Impl : ( 'timeout' ) ;
    public final void rule__State__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2143:1: ( ( 'timeout' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2144:1: ( 'timeout' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2144:1: ( 'timeout' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2145:1: 'timeout'
            {
             before(grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0()); 
            match(input,28,FOLLOW_28_in_rule__State__Group_1_0__0__Impl4551); 
             after(grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0()); 

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
    // $ANTLR end "rule__State__Group_1_0__0__Impl"


    // $ANTLR start "rule__State__Group_1_0__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2158:1: rule__State__Group_1_0__1 : rule__State__Group_1_0__1__Impl ;
    public final void rule__State__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2162:1: ( rule__State__Group_1_0__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2163:2: rule__State__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__14582);
            rule__State__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__State__Group_1_0__1"


    // $ANTLR start "rule__State__Group_1_0__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2169:1: rule__State__Group_1_0__1__Impl : ( ( rule__State__TimeoutAssignment_1_0_1 ) ) ;
    public final void rule__State__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2173:1: ( ( ( rule__State__TimeoutAssignment_1_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2174:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2174:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2175:1: ( rule__State__TimeoutAssignment_1_0_1 )
            {
             before(grammarAccess.getStateAccess().getTimeoutAssignment_1_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2176:1: ( rule__State__TimeoutAssignment_1_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2176:2: rule__State__TimeoutAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl4609);
            rule__State__TimeoutAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTimeoutAssignment_1_0_1()); 

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
    // $ANTLR end "rule__State__Group_1_0__1__Impl"


    // $ANTLR start "rule__Dial__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2190:1: rule__Dial__Group__0 : rule__Dial__Group__0__Impl rule__Dial__Group__1 ;
    public final void rule__Dial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2194:1: ( rule__Dial__Group__0__Impl rule__Dial__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2195:2: rule__Dial__Group__0__Impl rule__Dial__Group__1
            {
            pushFollow(FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__04643);
            rule__Dial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__04646);
            rule__Dial__Group__1();

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
    // $ANTLR end "rule__Dial__Group__0"


    // $ANTLR start "rule__Dial__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2202:1: rule__Dial__Group__0__Impl : ( 'dialTo' ) ;
    public final void rule__Dial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2206:1: ( ( 'dialTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2207:1: ( 'dialTo' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2207:1: ( 'dialTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2208:1: 'dialTo'
            {
             before(grammarAccess.getDialAccess().getDialToKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Dial__Group__0__Impl4674); 
             after(grammarAccess.getDialAccess().getDialToKeyword_0()); 

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
    // $ANTLR end "rule__Dial__Group__0__Impl"


    // $ANTLR start "rule__Dial__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2221:1: rule__Dial__Group__1 : rule__Dial__Group__1__Impl rule__Dial__Group__2 ;
    public final void rule__Dial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2225:1: ( rule__Dial__Group__1__Impl rule__Dial__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2226:2: rule__Dial__Group__1__Impl rule__Dial__Group__2
            {
            pushFollow(FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__14705);
            rule__Dial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__14708);
            rule__Dial__Group__2();

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
    // $ANTLR end "rule__Dial__Group__1"


    // $ANTLR start "rule__Dial__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2233:1: rule__Dial__Group__1__Impl : ( ( rule__Dial__ToAssignment_1 ) ) ;
    public final void rule__Dial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2237:1: ( ( ( rule__Dial__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2238:1: ( ( rule__Dial__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2238:1: ( ( rule__Dial__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2239:1: ( rule__Dial__ToAssignment_1 )
            {
             before(grammarAccess.getDialAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2240:1: ( rule__Dial__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2240:2: rule__Dial__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl4735);
            rule__Dial__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDialAccess().getToAssignment_1()); 

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
    // $ANTLR end "rule__Dial__Group__1__Impl"


    // $ANTLR start "rule__Dial__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2250:1: rule__Dial__Group__2 : rule__Dial__Group__2__Impl ;
    public final void rule__Dial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2254:1: ( rule__Dial__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2255:2: rule__Dial__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__24765);
            rule__Dial__Group__2__Impl();

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
    // $ANTLR end "rule__Dial__Group__2"


    // $ANTLR start "rule__Dial__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2261:1: rule__Dial__Group__2__Impl : ( ';' ) ;
    public final void rule__Dial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2265:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2266:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2266:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2267:1: ';'
            {
             before(grammarAccess.getDialAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Dial__Group__2__Impl4793); 
             after(grammarAccess.getDialAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Dial__Group__2__Impl"


    // $ANTLR start "rule__Play__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2286:1: rule__Play__Group__0 : rule__Play__Group__0__Impl rule__Play__Group__1 ;
    public final void rule__Play__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2290:1: ( rule__Play__Group__0__Impl rule__Play__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2291:2: rule__Play__Group__0__Impl rule__Play__Group__1
            {
            pushFollow(FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__04830);
            rule__Play__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__1_in_rule__Play__Group__04833);
            rule__Play__Group__1();

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
    // $ANTLR end "rule__Play__Group__0"


    // $ANTLR start "rule__Play__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2298:1: rule__Play__Group__0__Impl : ( 'play' ) ;
    public final void rule__Play__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2302:1: ( ( 'play' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2303:1: ( 'play' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2303:1: ( 'play' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2304:1: 'play'
            {
             before(grammarAccess.getPlayAccess().getPlayKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Play__Group__0__Impl4861); 
             after(grammarAccess.getPlayAccess().getPlayKeyword_0()); 

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
    // $ANTLR end "rule__Play__Group__0__Impl"


    // $ANTLR start "rule__Play__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2317:1: rule__Play__Group__1 : rule__Play__Group__1__Impl rule__Play__Group__2 ;
    public final void rule__Play__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2321:1: ( rule__Play__Group__1__Impl rule__Play__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2322:2: rule__Play__Group__1__Impl rule__Play__Group__2
            {
            pushFollow(FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__14892);
            rule__Play__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__2_in_rule__Play__Group__14895);
            rule__Play__Group__2();

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
    // $ANTLR end "rule__Play__Group__1"


    // $ANTLR start "rule__Play__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2329:1: rule__Play__Group__1__Impl : ( ( rule__Play__FileAssignment_1 ) ) ;
    public final void rule__Play__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2333:1: ( ( ( rule__Play__FileAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2334:1: ( ( rule__Play__FileAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2334:1: ( ( rule__Play__FileAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2335:1: ( rule__Play__FileAssignment_1 )
            {
             before(grammarAccess.getPlayAccess().getFileAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2336:1: ( rule__Play__FileAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2336:2: rule__Play__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl4922);
            rule__Play__FileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayAccess().getFileAssignment_1()); 

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
    // $ANTLR end "rule__Play__Group__1__Impl"


    // $ANTLR start "rule__Play__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2346:1: rule__Play__Group__2 : rule__Play__Group__2__Impl ;
    public final void rule__Play__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2350:1: ( rule__Play__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2351:2: rule__Play__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__24952);
            rule__Play__Group__2__Impl();

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
    // $ANTLR end "rule__Play__Group__2"


    // $ANTLR start "rule__Play__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2357:1: rule__Play__Group__2__Impl : ( ';' ) ;
    public final void rule__Play__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2361:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2362:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2362:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2363:1: ';'
            {
             before(grammarAccess.getPlayAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Play__Group__2__Impl4980); 
             after(grammarAccess.getPlayAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Play__Group__2__Impl"


    // $ANTLR start "rule__Record__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2382:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2386:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2387:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05017);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05020);
            rule__Record__Group__1();

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
    // $ANTLR end "rule__Record__Group__0"


    // $ANTLR start "rule__Record__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2394:1: rule__Record__Group__0__Impl : ( 'record' ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2398:1: ( ( 'record' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2399:1: ( 'record' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2399:1: ( 'record' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2400:1: 'record'
            {
             before(grammarAccess.getRecordAccess().getRecordKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Record__Group__0__Impl5048); 
             after(grammarAccess.getRecordAccess().getRecordKeyword_0()); 

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
    // $ANTLR end "rule__Record__Group__0__Impl"


    // $ANTLR start "rule__Record__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2413:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2417:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2418:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15079);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15082);
            rule__Record__Group__2();

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
    // $ANTLR end "rule__Record__Group__1"


    // $ANTLR start "rule__Record__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2425:1: rule__Record__Group__1__Impl : ( ( rule__Record__TimeAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2429:1: ( ( ( rule__Record__TimeAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2430:1: ( ( rule__Record__TimeAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2430:1: ( ( rule__Record__TimeAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2431:1: ( rule__Record__TimeAssignment_1 )
            {
             before(grammarAccess.getRecordAccess().getTimeAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2432:1: ( rule__Record__TimeAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2432:2: rule__Record__TimeAssignment_1
            {
            pushFollow(FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5109);
            rule__Record__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getTimeAssignment_1()); 

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
    // $ANTLR end "rule__Record__Group__1__Impl"


    // $ANTLR start "rule__Record__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2442:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2446:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2447:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25139);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25142);
            rule__Record__Group__3();

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
    // $ANTLR end "rule__Record__Group__2"


    // $ANTLR start "rule__Record__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2454:1: rule__Record__Group__2__Impl : ( 'seconds' ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2458:1: ( ( 'seconds' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2459:1: ( 'seconds' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2459:1: ( 'seconds' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2460:1: 'seconds'
            {
             before(grammarAccess.getRecordAccess().getSecondsKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Record__Group__2__Impl5170); 
             after(grammarAccess.getRecordAccess().getSecondsKeyword_2()); 

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
    // $ANTLR end "rule__Record__Group__2__Impl"


    // $ANTLR start "rule__Record__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2473:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2477:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2478:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35201);
            rule__Record__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__4_in_rule__Record__Group__35204);
            rule__Record__Group__4();

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
    // $ANTLR end "rule__Record__Group__3"


    // $ANTLR start "rule__Record__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2485:1: rule__Record__Group__3__Impl : ( 'in' ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2489:1: ( ( 'in' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2490:1: ( 'in' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2490:1: ( 'in' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2491:1: 'in'
            {
             before(grammarAccess.getRecordAccess().getInKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Record__Group__3__Impl5232); 
             after(grammarAccess.getRecordAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__Record__Group__3__Impl"


    // $ANTLR start "rule__Record__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2504:1: rule__Record__Group__4 : rule__Record__Group__4__Impl rule__Record__Group__5 ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2508:1: ( rule__Record__Group__4__Impl rule__Record__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2509:2: rule__Record__Group__4__Impl rule__Record__Group__5
            {
            pushFollow(FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__45263);
            rule__Record__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__5_in_rule__Record__Group__45266);
            rule__Record__Group__5();

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
    // $ANTLR end "rule__Record__Group__4"


    // $ANTLR start "rule__Record__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2516:1: rule__Record__Group__4__Impl : ( ( rule__Record__ActionAssignment_4 ) ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2520:1: ( ( ( rule__Record__ActionAssignment_4 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2521:1: ( ( rule__Record__ActionAssignment_4 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2521:1: ( ( rule__Record__ActionAssignment_4 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2522:1: ( rule__Record__ActionAssignment_4 )
            {
             before(grammarAccess.getRecordAccess().getActionAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2523:1: ( rule__Record__ActionAssignment_4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2523:2: rule__Record__ActionAssignment_4
            {
            pushFollow(FOLLOW_rule__Record__ActionAssignment_4_in_rule__Record__Group__4__Impl5293);
            rule__Record__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getActionAssignment_4()); 

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
    // $ANTLR end "rule__Record__Group__4__Impl"


    // $ANTLR start "rule__Record__Group__5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2533:1: rule__Record__Group__5 : rule__Record__Group__5__Impl rule__Record__Group__6 ;
    public final void rule__Record__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2537:1: ( rule__Record__Group__5__Impl rule__Record__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2538:2: rule__Record__Group__5__Impl rule__Record__Group__6
            {
            pushFollow(FOLLOW_rule__Record__Group__5__Impl_in_rule__Record__Group__55323);
            rule__Record__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__6_in_rule__Record__Group__55326);
            rule__Record__Group__6();

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
    // $ANTLR end "rule__Record__Group__5"


    // $ANTLR start "rule__Record__Group__5__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2545:1: rule__Record__Group__5__Impl : ( ( rule__Record__Group_5__0 )? ) ;
    public final void rule__Record__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2549:1: ( ( ( rule__Record__Group_5__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2550:1: ( ( rule__Record__Group_5__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2550:1: ( ( rule__Record__Group_5__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2551:1: ( rule__Record__Group_5__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2552:1: ( rule__Record__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2552:2: rule__Record__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Record__Group_5__0_in_rule__Record__Group__5__Impl5353);
                    rule__Record__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Record__Group__5__Impl"


    // $ANTLR start "rule__Record__Group__6"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2562:1: rule__Record__Group__6 : rule__Record__Group__6__Impl ;
    public final void rule__Record__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2566:1: ( rule__Record__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2567:2: rule__Record__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group__6__Impl_in_rule__Record__Group__65384);
            rule__Record__Group__6__Impl();

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
    // $ANTLR end "rule__Record__Group__6"


    // $ANTLR start "rule__Record__Group__6__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2573:1: rule__Record__Group__6__Impl : ( ';' ) ;
    public final void rule__Record__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2577:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2578:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2578:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2579:1: ';'
            {
             before(grammarAccess.getRecordAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Record__Group__6__Impl5412); 
             after(grammarAccess.getRecordAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Record__Group__6__Impl"


    // $ANTLR start "rule__Record__Group_5__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2606:1: rule__Record__Group_5__0 : rule__Record__Group_5__0__Impl rule__Record__Group_5__1 ;
    public final void rule__Record__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2610:1: ( rule__Record__Group_5__0__Impl rule__Record__Group_5__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2611:2: rule__Record__Group_5__0__Impl rule__Record__Group_5__1
            {
            pushFollow(FOLLOW_rule__Record__Group_5__0__Impl_in_rule__Record__Group_5__05457);
            rule__Record__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group_5__1_in_rule__Record__Group_5__05460);
            rule__Record__Group_5__1();

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
    // $ANTLR end "rule__Record__Group_5__0"


    // $ANTLR start "rule__Record__Group_5__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2618:1: rule__Record__Group_5__0__Impl : ( '->' ) ;
    public final void rule__Record__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2622:1: ( ( '->' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2623:1: ( '->' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2623:1: ( '->' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2624:1: '->'
            {
             before(grammarAccess.getRecordAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__Record__Group_5__0__Impl5488); 
             after(grammarAccess.getRecordAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

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
    // $ANTLR end "rule__Record__Group_5__0__Impl"


    // $ANTLR start "rule__Record__Group_5__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2637:1: rule__Record__Group_5__1 : rule__Record__Group_5__1__Impl ;
    public final void rule__Record__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2641:1: ( rule__Record__Group_5__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2642:2: rule__Record__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group_5__1__Impl_in_rule__Record__Group_5__15519);
            rule__Record__Group_5__1__Impl();

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
    // $ANTLR end "rule__Record__Group_5__1"


    // $ANTLR start "rule__Record__Group_5__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2648:1: rule__Record__Group_5__1__Impl : ( ( rule__Record__NameAssignment_5_1 ) ) ;
    public final void rule__Record__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2652:1: ( ( ( rule__Record__NameAssignment_5_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2653:1: ( ( rule__Record__NameAssignment_5_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2653:1: ( ( rule__Record__NameAssignment_5_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2654:1: ( rule__Record__NameAssignment_5_1 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_5_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2655:1: ( rule__Record__NameAssignment_5_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2655:2: rule__Record__NameAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Record__NameAssignment_5_1_in_rule__Record__Group_5__1__Impl5546);
            rule__Record__NameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getNameAssignment_5_1()); 

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
    // $ANTLR end "rule__Record__Group_5__1__Impl"


    // $ANTLR start "rule__GetDigits__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2669:1: rule__GetDigits__Group__0 : rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 ;
    public final void rule__GetDigits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2673:1: ( rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2674:2: rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__05580);
            rule__GetDigits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__05583);
            rule__GetDigits__Group__1();

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
    // $ANTLR end "rule__GetDigits__Group__0"


    // $ANTLR start "rule__GetDigits__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2681:1: rule__GetDigits__Group__0__Impl : ( 'get' ) ;
    public final void rule__GetDigits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2685:1: ( ( 'get' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2686:1: ( 'get' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2686:1: ( 'get' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2687:1: 'get'
            {
             before(grammarAccess.getGetDigitsAccess().getGetKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__GetDigits__Group__0__Impl5611); 
             after(grammarAccess.getGetDigitsAccess().getGetKeyword_0()); 

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
    // $ANTLR end "rule__GetDigits__Group__0__Impl"


    // $ANTLR start "rule__GetDigits__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2700:1: rule__GetDigits__Group__1 : rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 ;
    public final void rule__GetDigits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2704:1: ( rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2705:2: rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__15642);
            rule__GetDigits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__15645);
            rule__GetDigits__Group__2();

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
    // $ANTLR end "rule__GetDigits__Group__1"


    // $ANTLR start "rule__GetDigits__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2712:1: rule__GetDigits__Group__1__Impl : ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) ;
    public final void rule__GetDigits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2716:1: ( ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2717:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2717:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2718:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2719:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2719:2: rule__GetDigits__NumDigitsAssignment_1
            {
            pushFollow(FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl5672);
            rule__GetDigits__NumDigitsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1()); 

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
    // $ANTLR end "rule__GetDigits__Group__1__Impl"


    // $ANTLR start "rule__GetDigits__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2729:1: rule__GetDigits__Group__2 : rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 ;
    public final void rule__GetDigits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2733:1: ( rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2734:2: rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__25702);
            rule__GetDigits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__25705);
            rule__GetDigits__Group__3();

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
    // $ANTLR end "rule__GetDigits__Group__2"


    // $ANTLR start "rule__GetDigits__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2741:1: rule__GetDigits__Group__2__Impl : ( 'digits' ) ;
    public final void rule__GetDigits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2745:1: ( ( 'digits' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2746:1: ( 'digits' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2746:1: ( 'digits' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2747:1: 'digits'
            {
             before(grammarAccess.getGetDigitsAccess().getDigitsKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__GetDigits__Group__2__Impl5733); 
             after(grammarAccess.getGetDigitsAccess().getDigitsKeyword_2()); 

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
    // $ANTLR end "rule__GetDigits__Group__2__Impl"


    // $ANTLR start "rule__GetDigits__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2760:1: rule__GetDigits__Group__3 : rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4 ;
    public final void rule__GetDigits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2764:1: ( rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2765:2: rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__35764);
            rule__GetDigits__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__4_in_rule__GetDigits__Group__35767);
            rule__GetDigits__Group__4();

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
    // $ANTLR end "rule__GetDigits__Group__3"


    // $ANTLR start "rule__GetDigits__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2772:1: rule__GetDigits__Group__3__Impl : ( ( rule__GetDigits__QuestionAssignment_3 ) ) ;
    public final void rule__GetDigits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2776:1: ( ( ( rule__GetDigits__QuestionAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2777:1: ( ( rule__GetDigits__QuestionAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2777:1: ( ( rule__GetDigits__QuestionAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2778:1: ( rule__GetDigits__QuestionAssignment_3 )
            {
             before(grammarAccess.getGetDigitsAccess().getQuestionAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2779:1: ( rule__GetDigits__QuestionAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2779:2: rule__GetDigits__QuestionAssignment_3
            {
            pushFollow(FOLLOW_rule__GetDigits__QuestionAssignment_3_in_rule__GetDigits__Group__3__Impl5794);
            rule__GetDigits__QuestionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGetDigitsAccess().getQuestionAssignment_3()); 

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
    // $ANTLR end "rule__GetDigits__Group__3__Impl"


    // $ANTLR start "rule__GetDigits__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2789:1: rule__GetDigits__Group__4 : rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5 ;
    public final void rule__GetDigits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2793:1: ( rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2794:2: rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__4__Impl_in_rule__GetDigits__Group__45824);
            rule__GetDigits__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__5_in_rule__GetDigits__Group__45827);
            rule__GetDigits__Group__5();

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
    // $ANTLR end "rule__GetDigits__Group__4"


    // $ANTLR start "rule__GetDigits__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2801:1: rule__GetDigits__Group__4__Impl : ( '->' ) ;
    public final void rule__GetDigits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2805:1: ( ( '->' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2806:1: ( '->' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2806:1: ( '->' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2807:1: '->'
            {
             before(grammarAccess.getGetDigitsAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__GetDigits__Group__4__Impl5855); 
             after(grammarAccess.getGetDigitsAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__GetDigits__Group__4__Impl"


    // $ANTLR start "rule__GetDigits__Group__5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2820:1: rule__GetDigits__Group__5 : rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6 ;
    public final void rule__GetDigits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2824:1: ( rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2825:2: rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__5__Impl_in_rule__GetDigits__Group__55886);
            rule__GetDigits__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__6_in_rule__GetDigits__Group__55889);
            rule__GetDigits__Group__6();

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
    // $ANTLR end "rule__GetDigits__Group__5"


    // $ANTLR start "rule__GetDigits__Group__5__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2832:1: rule__GetDigits__Group__5__Impl : ( ( rule__GetDigits__NameAssignment_5 ) ) ;
    public final void rule__GetDigits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2836:1: ( ( ( rule__GetDigits__NameAssignment_5 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2837:1: ( ( rule__GetDigits__NameAssignment_5 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2837:1: ( ( rule__GetDigits__NameAssignment_5 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2838:1: ( rule__GetDigits__NameAssignment_5 )
            {
             before(grammarAccess.getGetDigitsAccess().getNameAssignment_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2839:1: ( rule__GetDigits__NameAssignment_5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2839:2: rule__GetDigits__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__GetDigits__NameAssignment_5_in_rule__GetDigits__Group__5__Impl5916);
            rule__GetDigits__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGetDigitsAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__GetDigits__Group__5__Impl"


    // $ANTLR start "rule__GetDigits__Group__6"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2849:1: rule__GetDigits__Group__6 : rule__GetDigits__Group__6__Impl ;
    public final void rule__GetDigits__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2853:1: ( rule__GetDigits__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2854:2: rule__GetDigits__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__6__Impl_in_rule__GetDigits__Group__65946);
            rule__GetDigits__Group__6__Impl();

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
    // $ANTLR end "rule__GetDigits__Group__6"


    // $ANTLR start "rule__GetDigits__Group__6__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2860:1: rule__GetDigits__Group__6__Impl : ( ';' ) ;
    public final void rule__GetDigits__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2864:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2865:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2865:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2866:1: ';'
            {
             before(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__GetDigits__Group__6__Impl5974); 
             after(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__GetDigits__Group__6__Impl"


    // $ANTLR start "rule__Ask__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2893:1: rule__Ask__Group__0 : rule__Ask__Group__0__Impl rule__Ask__Group__1 ;
    public final void rule__Ask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2897:1: ( rule__Ask__Group__0__Impl rule__Ask__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2898:2: rule__Ask__Group__0__Impl rule__Ask__Group__1
            {
            pushFollow(FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__06019);
            rule__Ask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__06022);
            rule__Ask__Group__1();

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
    // $ANTLR end "rule__Ask__Group__0"


    // $ANTLR start "rule__Ask__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2905:1: rule__Ask__Group__0__Impl : ( 'ask' ) ;
    public final void rule__Ask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2909:1: ( ( 'ask' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2910:1: ( 'ask' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2910:1: ( 'ask' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2911:1: 'ask'
            {
             before(grammarAccess.getAskAccess().getAskKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Ask__Group__0__Impl6050); 
             after(grammarAccess.getAskAccess().getAskKeyword_0()); 

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
    // $ANTLR end "rule__Ask__Group__0__Impl"


    // $ANTLR start "rule__Ask__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2924:1: rule__Ask__Group__1 : rule__Ask__Group__1__Impl rule__Ask__Group__2 ;
    public final void rule__Ask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2928:1: ( rule__Ask__Group__1__Impl rule__Ask__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2929:2: rule__Ask__Group__1__Impl rule__Ask__Group__2
            {
            pushFollow(FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__16081);
            rule__Ask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__16084);
            rule__Ask__Group__2();

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
    // $ANTLR end "rule__Ask__Group__1"


    // $ANTLR start "rule__Ask__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2936:1: rule__Ask__Group__1__Impl : ( ( rule__Ask__QuestionAssignment_1 ) ) ;
    public final void rule__Ask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2940:1: ( ( ( rule__Ask__QuestionAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2941:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2941:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2942:1: ( rule__Ask__QuestionAssignment_1 )
            {
             before(grammarAccess.getAskAccess().getQuestionAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2943:1: ( rule__Ask__QuestionAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2943:2: rule__Ask__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6111);
            rule__Ask__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getQuestionAssignment_1()); 

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
    // $ANTLR end "rule__Ask__Group__1__Impl"


    // $ANTLR start "rule__Ask__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2953:1: rule__Ask__Group__2 : rule__Ask__Group__2__Impl rule__Ask__Group__3 ;
    public final void rule__Ask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2957:1: ( rule__Ask__Group__2__Impl rule__Ask__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2958:2: rule__Ask__Group__2__Impl rule__Ask__Group__3
            {
            pushFollow(FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26141);
            rule__Ask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__3_in_rule__Ask__Group__26144);
            rule__Ask__Group__3();

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
    // $ANTLR end "rule__Ask__Group__2"


    // $ANTLR start "rule__Ask__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2965:1: rule__Ask__Group__2__Impl : ( 'choices' ) ;
    public final void rule__Ask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2969:1: ( ( 'choices' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2970:1: ( 'choices' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2970:1: ( 'choices' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2971:1: 'choices'
            {
             before(grammarAccess.getAskAccess().getChoicesKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Ask__Group__2__Impl6172); 
             after(grammarAccess.getAskAccess().getChoicesKeyword_2()); 

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
    // $ANTLR end "rule__Ask__Group__2__Impl"


    // $ANTLR start "rule__Ask__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2984:1: rule__Ask__Group__3 : rule__Ask__Group__3__Impl rule__Ask__Group__4 ;
    public final void rule__Ask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2988:1: ( rule__Ask__Group__3__Impl rule__Ask__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2989:2: rule__Ask__Group__3__Impl rule__Ask__Group__4
            {
            pushFollow(FOLLOW_rule__Ask__Group__3__Impl_in_rule__Ask__Group__36203);
            rule__Ask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__4_in_rule__Ask__Group__36206);
            rule__Ask__Group__4();

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
    // $ANTLR end "rule__Ask__Group__3"


    // $ANTLR start "rule__Ask__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2996:1: rule__Ask__Group__3__Impl : ( ( rule__Ask__ChoicesAssignment_3 ) ) ;
    public final void rule__Ask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3000:1: ( ( ( rule__Ask__ChoicesAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3001:1: ( ( rule__Ask__ChoicesAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3001:1: ( ( rule__Ask__ChoicesAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3002:1: ( rule__Ask__ChoicesAssignment_3 )
            {
             before(grammarAccess.getAskAccess().getChoicesAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3003:1: ( rule__Ask__ChoicesAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3003:2: rule__Ask__ChoicesAssignment_3
            {
            pushFollow(FOLLOW_rule__Ask__ChoicesAssignment_3_in_rule__Ask__Group__3__Impl6233);
            rule__Ask__ChoicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getChoicesAssignment_3()); 

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
    // $ANTLR end "rule__Ask__Group__3__Impl"


    // $ANTLR start "rule__Ask__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3013:1: rule__Ask__Group__4 : rule__Ask__Group__4__Impl rule__Ask__Group__5 ;
    public final void rule__Ask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3017:1: ( rule__Ask__Group__4__Impl rule__Ask__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3018:2: rule__Ask__Group__4__Impl rule__Ask__Group__5
            {
            pushFollow(FOLLOW_rule__Ask__Group__4__Impl_in_rule__Ask__Group__46263);
            rule__Ask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__5_in_rule__Ask__Group__46266);
            rule__Ask__Group__5();

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
    // $ANTLR end "rule__Ask__Group__4"


    // $ANTLR start "rule__Ask__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3025:1: rule__Ask__Group__4__Impl : ( '->' ) ;
    public final void rule__Ask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3029:1: ( ( '->' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3030:1: ( '->' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3030:1: ( '->' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3031:1: '->'
            {
             before(grammarAccess.getAskAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Ask__Group__4__Impl6294); 
             after(grammarAccess.getAskAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Ask__Group__4__Impl"


    // $ANTLR start "rule__Ask__Group__5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3044:1: rule__Ask__Group__5 : rule__Ask__Group__5__Impl rule__Ask__Group__6 ;
    public final void rule__Ask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3048:1: ( rule__Ask__Group__5__Impl rule__Ask__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3049:2: rule__Ask__Group__5__Impl rule__Ask__Group__6
            {
            pushFollow(FOLLOW_rule__Ask__Group__5__Impl_in_rule__Ask__Group__56325);
            rule__Ask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__6_in_rule__Ask__Group__56328);
            rule__Ask__Group__6();

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
    // $ANTLR end "rule__Ask__Group__5"


    // $ANTLR start "rule__Ask__Group__5__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3056:1: rule__Ask__Group__5__Impl : ( ( rule__Ask__NameAssignment_5 ) ) ;
    public final void rule__Ask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3060:1: ( ( ( rule__Ask__NameAssignment_5 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3061:1: ( ( rule__Ask__NameAssignment_5 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3061:1: ( ( rule__Ask__NameAssignment_5 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3062:1: ( rule__Ask__NameAssignment_5 )
            {
             before(grammarAccess.getAskAccess().getNameAssignment_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3063:1: ( rule__Ask__NameAssignment_5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3063:2: rule__Ask__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__Ask__NameAssignment_5_in_rule__Ask__Group__5__Impl6355);
            rule__Ask__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__Ask__Group__5__Impl"


    // $ANTLR start "rule__Ask__Group__6"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3073:1: rule__Ask__Group__6 : rule__Ask__Group__6__Impl ;
    public final void rule__Ask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3077:1: ( rule__Ask__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3078:2: rule__Ask__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Ask__Group__6__Impl_in_rule__Ask__Group__66385);
            rule__Ask__Group__6__Impl();

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
    // $ANTLR end "rule__Ask__Group__6"


    // $ANTLR start "rule__Ask__Group__6__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3084:1: rule__Ask__Group__6__Impl : ( ';' ) ;
    public final void rule__Ask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3088:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3089:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3089:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3090:1: ';'
            {
             before(grammarAccess.getAskAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Ask__Group__6__Impl6413); 
             after(grammarAccess.getAskAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Ask__Group__6__Impl"


    // $ANTLR start "rule__Send__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3117:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3121:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3122:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06458);
            rule__Send__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06461);
            rule__Send__Group__1();

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
    // $ANTLR end "rule__Send__Group__0"


    // $ANTLR start "rule__Send__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3129:1: rule__Send__Group__0__Impl : ( 'send' ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3133:1: ( ( 'send' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3134:1: ( 'send' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3134:1: ( 'send' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3135:1: 'send'
            {
             before(grammarAccess.getSendAccess().getSendKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Send__Group__0__Impl6489); 
             after(grammarAccess.getSendAccess().getSendKeyword_0()); 

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
    // $ANTLR end "rule__Send__Group__0__Impl"


    // $ANTLR start "rule__Send__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3148:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3152:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3153:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16520);
            rule__Send__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16523);
            rule__Send__Group__2();

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
    // $ANTLR end "rule__Send__Group__1"


    // $ANTLR start "rule__Send__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3160:1: rule__Send__Group__1__Impl : ( ( rule__Send__ParamsAssignment_1 ) ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3164:1: ( ( ( rule__Send__ParamsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3165:1: ( ( rule__Send__ParamsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3165:1: ( ( rule__Send__ParamsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3166:1: ( rule__Send__ParamsAssignment_1 )
            {
             before(grammarAccess.getSendAccess().getParamsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3167:1: ( rule__Send__ParamsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3167:2: rule__Send__ParamsAssignment_1
            {
            pushFollow(FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6550);
            rule__Send__ParamsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSendAccess().getParamsAssignment_1()); 

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
    // $ANTLR end "rule__Send__Group__1__Impl"


    // $ANTLR start "rule__Send__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3177:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3181:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3182:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26580);
            rule__Send__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26583);
            rule__Send__Group__3();

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
    // $ANTLR end "rule__Send__Group__2"


    // $ANTLR start "rule__Send__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3189:1: rule__Send__Group__2__Impl : ( 'to' ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3193:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3194:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3194:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3195:1: 'to'
            {
             before(grammarAccess.getSendAccess().getToKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Send__Group__2__Impl6611); 
             after(grammarAccess.getSendAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Send__Group__2__Impl"


    // $ANTLR start "rule__Send__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3208:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3212:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3213:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36642);
            rule__Send__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36645);
            rule__Send__Group__4();

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
    // $ANTLR end "rule__Send__Group__3"


    // $ANTLR start "rule__Send__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3220:1: rule__Send__Group__3__Impl : ( ( rule__Send__UrlAssignment_3 ) ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3224:1: ( ( ( rule__Send__UrlAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3225:1: ( ( rule__Send__UrlAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3225:1: ( ( rule__Send__UrlAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3226:1: ( rule__Send__UrlAssignment_3 )
            {
             before(grammarAccess.getSendAccess().getUrlAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3227:1: ( rule__Send__UrlAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3227:2: rule__Send__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6672);
            rule__Send__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSendAccess().getUrlAssignment_3()); 

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
    // $ANTLR end "rule__Send__Group__3__Impl"


    // $ANTLR start "rule__Send__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3237:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3241:1: ( rule__Send__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3242:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46702);
            rule__Send__Group__4__Impl();

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
    // $ANTLR end "rule__Send__Group__4"


    // $ANTLR start "rule__Send__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3248:1: rule__Send__Group__4__Impl : ( ';' ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3252:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3253:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3253:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3254:1: ';'
            {
             before(grammarAccess.getSendAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Send__Group__4__Impl6730); 
             after(grammarAccess.getSendAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Send__Group__4__Impl"


    // $ANTLR start "rule__SendBlock__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3277:1: rule__SendBlock__Group__0 : rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 ;
    public final void rule__SendBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3281:1: ( rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3282:2: rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06771);
            rule__SendBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06774);
            rule__SendBlock__Group__1();

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
    // $ANTLR end "rule__SendBlock__Group__0"


    // $ANTLR start "rule__SendBlock__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3289:1: rule__SendBlock__Group__0__Impl : ( () ) ;
    public final void rule__SendBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3293:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3294:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3294:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3295:1: ()
            {
             before(grammarAccess.getSendBlockAccess().getSendBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3296:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3298:1: 
            {
            }

             after(grammarAccess.getSendBlockAccess().getSendBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendBlock__Group__0__Impl"


    // $ANTLR start "rule__SendBlock__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3308:1: rule__SendBlock__Group__1 : rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 ;
    public final void rule__SendBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3312:1: ( rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3313:2: rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16832);
            rule__SendBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16835);
            rule__SendBlock__Group__2();

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
    // $ANTLR end "rule__SendBlock__Group__1"


    // $ANTLR start "rule__SendBlock__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3320:1: rule__SendBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SendBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3324:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3325:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3325:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3326:1: '{'
            {
             before(grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__SendBlock__Group__1__Impl6863); 
             after(grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__SendBlock__Group__1__Impl"


    // $ANTLR start "rule__SendBlock__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3339:1: rule__SendBlock__Group__2 : rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 ;
    public final void rule__SendBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3343:1: ( rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3344:2: rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26894);
            rule__SendBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26897);
            rule__SendBlock__Group__3();

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
    // $ANTLR end "rule__SendBlock__Group__2"


    // $ANTLR start "rule__SendBlock__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3351:1: rule__SendBlock__Group__2__Impl : ( ( rule__SendBlock__ValueAssignment_2 ) ) ;
    public final void rule__SendBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3355:1: ( ( ( rule__SendBlock__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3356:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3356:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3357:1: ( rule__SendBlock__ValueAssignment_2 )
            {
             before(grammarAccess.getSendBlockAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3358:1: ( rule__SendBlock__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3358:2: rule__SendBlock__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6924);
            rule__SendBlock__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSendBlockAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__SendBlock__Group__2__Impl"


    // $ANTLR start "rule__SendBlock__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3368:1: rule__SendBlock__Group__3 : rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 ;
    public final void rule__SendBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3372:1: ( rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3373:2: rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36954);
            rule__SendBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36957);
            rule__SendBlock__Group__4();

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
    // $ANTLR end "rule__SendBlock__Group__3"


    // $ANTLR start "rule__SendBlock__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3380:1: rule__SendBlock__Group__3__Impl : ( ( rule__SendBlock__StmsAssignment_3 )* ) ;
    public final void rule__SendBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3384:1: ( ( ( rule__SendBlock__StmsAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3385:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3385:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3386:1: ( rule__SendBlock__StmsAssignment_3 )*
            {
             before(grammarAccess.getSendBlockAccess().getStmsAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3387:1: ( rule__SendBlock__StmsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3387:2: rule__SendBlock__StmsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6984);
            	    rule__SendBlock__StmsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSendBlockAccess().getStmsAssignment_3()); 

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
    // $ANTLR end "rule__SendBlock__Group__3__Impl"


    // $ANTLR start "rule__SendBlock__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3397:1: rule__SendBlock__Group__4 : rule__SendBlock__Group__4__Impl ;
    public final void rule__SendBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3401:1: ( rule__SendBlock__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3402:2: rule__SendBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__47015);
            rule__SendBlock__Group__4__Impl();

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
    // $ANTLR end "rule__SendBlock__Group__4"


    // $ANTLR start "rule__SendBlock__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3408:1: rule__SendBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SendBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3412:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3413:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3413:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3414:1: '}'
            {
             before(grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__SendBlock__Group__4__Impl7043); 
             after(grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SendBlock__Group__4__Impl"


    // $ANTLR start "rule__NotPrimaryParam__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3437:1: rule__NotPrimaryParam__Group__0 : rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 ;
    public final void rule__NotPrimaryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3441:1: ( rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3442:2: rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__07084);
            rule__NotPrimaryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__07087);
            rule__NotPrimaryParam__Group__1();

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
    // $ANTLR end "rule__NotPrimaryParam__Group__0"


    // $ANTLR start "rule__NotPrimaryParam__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3449:1: rule__NotPrimaryParam__Group__0__Impl : ( ',' ) ;
    public final void rule__NotPrimaryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3453:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3454:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3454:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3455:1: ','
            {
             before(grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__NotPrimaryParam__Group__0__Impl7115); 
             after(grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__NotPrimaryParam__Group__0__Impl"


    // $ANTLR start "rule__NotPrimaryParam__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3468:1: rule__NotPrimaryParam__Group__1 : rule__NotPrimaryParam__Group__1__Impl ;
    public final void rule__NotPrimaryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3472:1: ( rule__NotPrimaryParam__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3473:2: rule__NotPrimaryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__17146);
            rule__NotPrimaryParam__Group__1__Impl();

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
    // $ANTLR end "rule__NotPrimaryParam__Group__1"


    // $ANTLR start "rule__NotPrimaryParam__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3479:1: rule__NotPrimaryParam__Group__1__Impl : ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) ;
    public final void rule__NotPrimaryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3483:1: ( ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3484:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3484:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3485:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3486:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3486:2: rule__NotPrimaryParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7173);
            rule__NotPrimaryParam__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NotPrimaryParam__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3500:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3504:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3505:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07207);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07210);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3512:1: rule__Param__Group__0__Impl : ( ( rule__Param__ParamNameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3516:1: ( ( ( rule__Param__ParamNameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3517:1: ( ( rule__Param__ParamNameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3517:1: ( ( rule__Param__ParamNameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3518:1: ( rule__Param__ParamNameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getParamNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3519:1: ( rule__Param__ParamNameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3519:2: rule__Param__ParamNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__ParamNameAssignment_0_in_rule__Param__Group__0__Impl7237);
            rule__Param__ParamNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getParamNameAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3529:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3533:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3534:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17267);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17270);
            rule__Param__Group__2();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3541:1: rule__Param__Group__1__Impl : ( '=>' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3545:1: ( ( '=>' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3546:1: ( '=>' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3546:1: ( '=>' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3547:1: '=>'
            {
             before(grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__Param__Group__1__Impl7298); 
             after(grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3560:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3564:1: ( rule__Param__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3565:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27329);
            rule__Param__Group__2__Impl();

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
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3571:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3575:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3576:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3576:1: ( ( rule__Param__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3577:1: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3578:1: ( rule__Param__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3578:2: rule__Param__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7356);
            rule__Param__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__Say__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3594:1: rule__Say__Group__0 : rule__Say__Group__0__Impl rule__Say__Group__1 ;
    public final void rule__Say__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3598:1: ( rule__Say__Group__0__Impl rule__Say__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3599:2: rule__Say__Group__0__Impl rule__Say__Group__1
            {
            pushFollow(FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07392);
            rule__Say__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07395);
            rule__Say__Group__1();

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
    // $ANTLR end "rule__Say__Group__0"


    // $ANTLR start "rule__Say__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3606:1: rule__Say__Group__0__Impl : ( 'say' ) ;
    public final void rule__Say__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3610:1: ( ( 'say' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3611:1: ( 'say' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3611:1: ( 'say' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3612:1: 'say'
            {
             before(grammarAccess.getSayAccess().getSayKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Say__Group__0__Impl7423); 
             after(grammarAccess.getSayAccess().getSayKeyword_0()); 

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
    // $ANTLR end "rule__Say__Group__0__Impl"


    // $ANTLR start "rule__Say__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3625:1: rule__Say__Group__1 : rule__Say__Group__1__Impl rule__Say__Group__2 ;
    public final void rule__Say__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3629:1: ( rule__Say__Group__1__Impl rule__Say__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3630:2: rule__Say__Group__1__Impl rule__Say__Group__2
            {
            pushFollow(FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17454);
            rule__Say__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17457);
            rule__Say__Group__2();

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
    // $ANTLR end "rule__Say__Group__1"


    // $ANTLR start "rule__Say__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3637:1: rule__Say__Group__1__Impl : ( ( rule__Say__ThatAssignment_1 ) ) ;
    public final void rule__Say__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3641:1: ( ( ( rule__Say__ThatAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3642:1: ( ( rule__Say__ThatAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3642:1: ( ( rule__Say__ThatAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3643:1: ( rule__Say__ThatAssignment_1 )
            {
             before(grammarAccess.getSayAccess().getThatAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3644:1: ( rule__Say__ThatAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3644:2: rule__Say__ThatAssignment_1
            {
            pushFollow(FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7484);
            rule__Say__ThatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSayAccess().getThatAssignment_1()); 

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
    // $ANTLR end "rule__Say__Group__1__Impl"


    // $ANTLR start "rule__Say__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3654:1: rule__Say__Group__2 : rule__Say__Group__2__Impl ;
    public final void rule__Say__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3658:1: ( rule__Say__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3659:2: rule__Say__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27514);
            rule__Say__Group__2__Impl();

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
    // $ANTLR end "rule__Say__Group__2"


    // $ANTLR start "rule__Say__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3665:1: rule__Say__Group__2__Impl : ( ';' ) ;
    public final void rule__Say__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3669:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3670:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3670:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3671:1: ';'
            {
             before(grammarAccess.getSayAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Say__Group__2__Impl7542); 
             after(grammarAccess.getSayAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Say__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3690:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3694:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3695:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07579);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07582);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3702:1: rule__Transition__Group__0__Impl : ( 'goTo' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3706:1: ( ( 'goTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3707:1: ( 'goTo' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3707:1: ( 'goTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3708:1: 'goTo'
            {
             before(grammarAccess.getTransitionAccess().getGoToKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Transition__Group__0__Impl7610); 
             after(grammarAccess.getTransitionAccess().getGoToKeyword_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3721:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3725:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3726:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17641);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17644);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3733:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TargetAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3737:1: ( ( ( rule__Transition__TargetAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3738:1: ( ( rule__Transition__TargetAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3738:1: ( ( rule__Transition__TargetAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3739:1: ( rule__Transition__TargetAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3740:1: ( rule__Transition__TargetAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3740:2: rule__Transition__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl7671);
            rule__Transition__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3750:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3754:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3755:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__27701);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__27704);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3762:1: rule__Transition__Group__2__Impl : ( 'when' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3766:1: ( ( 'when' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3767:1: ( 'when' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3767:1: ( 'when' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3768:1: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__Transition__Group__2__Impl7732); 
             after(grammarAccess.getTransitionAccess().getWhenKeyword_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3781:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3785:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3786:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__37763);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__37766);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3793:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__EventAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3797:1: ( ( ( rule__Transition__EventAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3798:1: ( ( rule__Transition__EventAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3798:1: ( ( rule__Transition__EventAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3799:1: ( rule__Transition__EventAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3800:1: ( rule__Transition__EventAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3800:2: rule__Transition__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl7793);
            rule__Transition__EventAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3810:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3814:1: ( rule__Transition__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3815:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__47823);
            rule__Transition__Group__4__Impl();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3821:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3825:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3826:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3826:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3827:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Transition__Group__4__Impl7851); 
             after(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__IfExp__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3850:1: rule__IfExp__Group__0 : rule__IfExp__Group__0__Impl rule__IfExp__Group__1 ;
    public final void rule__IfExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3854:1: ( rule__IfExp__Group__0__Impl rule__IfExp__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3855:2: rule__IfExp__Group__0__Impl rule__IfExp__Group__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__07892);
            rule__IfExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__07895);
            rule__IfExp__Group__1();

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
    // $ANTLR end "rule__IfExp__Group__0"


    // $ANTLR start "rule__IfExp__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3862:1: rule__IfExp__Group__0__Impl : ( ( rule__IfExp__BlockAssignment_0 ) ) ;
    public final void rule__IfExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3866:1: ( ( ( rule__IfExp__BlockAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3867:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3867:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3868:1: ( rule__IfExp__BlockAssignment_0 )
            {
             before(grammarAccess.getIfExpAccess().getBlockAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3869:1: ( rule__IfExp__BlockAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3869:2: rule__IfExp__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl7922);
            rule__IfExp__BlockAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIfExpAccess().getBlockAssignment_0()); 

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
    // $ANTLR end "rule__IfExp__Group__0__Impl"


    // $ANTLR start "rule__IfExp__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3879:1: rule__IfExp__Group__1 : rule__IfExp__Group__1__Impl rule__IfExp__Group__2 ;
    public final void rule__IfExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3883:1: ( rule__IfExp__Group__1__Impl rule__IfExp__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3884:2: rule__IfExp__Group__1__Impl rule__IfExp__Group__2
            {
            pushFollow(FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__17952);
            rule__IfExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__17955);
            rule__IfExp__Group__2();

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
    // $ANTLR end "rule__IfExp__Group__1"


    // $ANTLR start "rule__IfExp__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3891:1: rule__IfExp__Group__1__Impl : ( ( rule__IfExp__Group_1__0 )* ) ;
    public final void rule__IfExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3895:1: ( ( ( rule__IfExp__Group_1__0 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3896:1: ( ( rule__IfExp__Group_1__0 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3896:1: ( ( rule__IfExp__Group_1__0 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3897:1: ( rule__IfExp__Group_1__0 )*
            {
             before(grammarAccess.getIfExpAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3898:1: ( rule__IfExp__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==47) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==48) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3898:2: rule__IfExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl7982);
            	    rule__IfExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getIfExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__IfExp__Group__1__Impl"


    // $ANTLR start "rule__IfExp__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3908:1: rule__IfExp__Group__2 : rule__IfExp__Group__2__Impl ;
    public final void rule__IfExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3912:1: ( rule__IfExp__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3913:2: rule__IfExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__28013);
            rule__IfExp__Group__2__Impl();

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
    // $ANTLR end "rule__IfExp__Group__2"


    // $ANTLR start "rule__IfExp__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3919:1: rule__IfExp__Group__2__Impl : ( ( rule__IfExp__Group_2__0 )? ) ;
    public final void rule__IfExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3923:1: ( ( ( rule__IfExp__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3924:1: ( ( rule__IfExp__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3924:1: ( ( rule__IfExp__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3925:1: ( rule__IfExp__Group_2__0 )?
            {
             before(grammarAccess.getIfExpAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3926:1: ( rule__IfExp__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3926:2: rule__IfExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl8040);
                    rule__IfExp__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfExpAccess().getGroup_2()); 

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
    // $ANTLR end "rule__IfExp__Group__2__Impl"


    // $ANTLR start "rule__IfExp__Group_1__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3942:1: rule__IfExp__Group_1__0 : rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 ;
    public final void rule__IfExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3946:1: ( rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3947:2: rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__08077);
            rule__IfExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__08080);
            rule__IfExp__Group_1__1();

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
    // $ANTLR end "rule__IfExp__Group_1__0"


    // $ANTLR start "rule__IfExp__Group_1__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3954:1: rule__IfExp__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3958:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3959:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3959:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3960:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__IfExp__Group_1__0__Impl8108); 
             after(grammarAccess.getIfExpAccess().getElseKeyword_1_0()); 

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
    // $ANTLR end "rule__IfExp__Group_1__0__Impl"


    // $ANTLR start "rule__IfExp__Group_1__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3973:1: rule__IfExp__Group_1__1 : rule__IfExp__Group_1__1__Impl ;
    public final void rule__IfExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3977:1: ( rule__IfExp__Group_1__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3978:2: rule__IfExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__18139);
            rule__IfExp__Group_1__1__Impl();

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
    // $ANTLR end "rule__IfExp__Group_1__1"


    // $ANTLR start "rule__IfExp__Group_1__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3984:1: rule__IfExp__Group_1__1__Impl : ( ( rule__IfExp__BlocksAssignment_1_1 ) ) ;
    public final void rule__IfExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3988:1: ( ( ( rule__IfExp__BlocksAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3989:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3989:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3990:1: ( rule__IfExp__BlocksAssignment_1_1 )
            {
             before(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3991:1: ( rule__IfExp__BlocksAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3991:2: rule__IfExp__BlocksAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl8166);
            rule__IfExp__BlocksAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1()); 

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
    // $ANTLR end "rule__IfExp__Group_1__1__Impl"


    // $ANTLR start "rule__IfExp__Group_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4005:1: rule__IfExp__Group_2__0 : rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 ;
    public final void rule__IfExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4009:1: ( rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4010:2: rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__08200);
            rule__IfExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__08203);
            rule__IfExp__Group_2__1();

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
    // $ANTLR end "rule__IfExp__Group_2__0"


    // $ANTLR start "rule__IfExp__Group_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4017:1: rule__IfExp__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4021:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4022:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4022:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4023:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__IfExp__Group_2__0__Impl8231); 
             after(grammarAccess.getIfExpAccess().getElseKeyword_2_0()); 

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
    // $ANTLR end "rule__IfExp__Group_2__0__Impl"


    // $ANTLR start "rule__IfExp__Group_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4036:1: rule__IfExp__Group_2__1 : rule__IfExp__Group_2__1__Impl ;
    public final void rule__IfExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4040:1: ( rule__IfExp__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4041:2: rule__IfExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__18262);
            rule__IfExp__Group_2__1__Impl();

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
    // $ANTLR end "rule__IfExp__Group_2__1"


    // $ANTLR start "rule__IfExp__Group_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4047:1: rule__IfExp__Group_2__1__Impl : ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) ;
    public final void rule__IfExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4051:1: ( ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4052:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4052:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4053:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4054:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4054:2: rule__IfExp__DefaultBlockAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl8289);
            rule__IfExp__DefaultBlockAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1()); 

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
    // $ANTLR end "rule__IfExp__Group_2__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4068:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4072:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4073:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08323);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08326);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4080:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4084:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4085:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4085:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4086:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4087:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4089:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4099:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4103:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4104:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18384);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18387);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4111:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4115:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4116:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4116:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4117:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Block__Group__1__Impl8415); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4130:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4134:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4135:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28446);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28449);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4142:1: rule__Block__Group__2__Impl : ( ( rule__Block__StmsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4146:1: ( ( ( rule__Block__StmsAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4147:1: ( ( rule__Block__StmsAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4147:1: ( ( rule__Block__StmsAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4148:1: ( rule__Block__StmsAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getStmsAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4149:1: ( rule__Block__StmsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_ML_COMMENT)||LA21_0==29||(LA21_0>=31 && LA21_0<=32)||LA21_0==36||LA21_0==38||LA21_0==40||LA21_0==44||(LA21_0>=48 && LA21_0<=49)||(LA21_0>=51 && LA21_0<=52)||(LA21_0>=54 && LA21_0<=55)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4149:2: rule__Block__StmsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StmsAssignment_2_in_rule__Block__Group__2__Impl8476);
            	    rule__Block__StmsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStmsAssignment_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4159:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4163:1: ( rule__Block__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4164:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38507);
            rule__Block__Group__3__Impl();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4170:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4174:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4175:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4175:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4176:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Block__Group__3__Impl8535); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__CondBlock__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4197:1: rule__CondBlock__Group__0 : rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 ;
    public final void rule__CondBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4201:1: ( rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4202:2: rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__08574);
            rule__CondBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__08577);
            rule__CondBlock__Group__1();

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
    // $ANTLR end "rule__CondBlock__Group__0"


    // $ANTLR start "rule__CondBlock__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4209:1: rule__CondBlock__Group__0__Impl : ( 'if' ) ;
    public final void rule__CondBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4213:1: ( ( 'if' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4214:1: ( 'if' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4214:1: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4215:1: 'if'
            {
             before(grammarAccess.getCondBlockAccess().getIfKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__CondBlock__Group__0__Impl8605); 
             after(grammarAccess.getCondBlockAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__CondBlock__Group__0__Impl"


    // $ANTLR start "rule__CondBlock__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4228:1: rule__CondBlock__Group__1 : rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 ;
    public final void rule__CondBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4232:1: ( rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4233:2: rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__18636);
            rule__CondBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__18639);
            rule__CondBlock__Group__2();

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
    // $ANTLR end "rule__CondBlock__Group__1"


    // $ANTLR start "rule__CondBlock__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4240:1: rule__CondBlock__Group__1__Impl : ( ( rule__CondBlock__CondAssignment_1 ) ) ;
    public final void rule__CondBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4244:1: ( ( ( rule__CondBlock__CondAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4245:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4245:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4246:1: ( rule__CondBlock__CondAssignment_1 )
            {
             before(grammarAccess.getCondBlockAccess().getCondAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4247:1: ( rule__CondBlock__CondAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4247:2: rule__CondBlock__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl8666);
            rule__CondBlock__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCondBlockAccess().getCondAssignment_1()); 

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
    // $ANTLR end "rule__CondBlock__Group__1__Impl"


    // $ANTLR start "rule__CondBlock__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4257:1: rule__CondBlock__Group__2 : rule__CondBlock__Group__2__Impl ;
    public final void rule__CondBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4261:1: ( rule__CondBlock__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4262:2: rule__CondBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__28696);
            rule__CondBlock__Group__2__Impl();

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
    // $ANTLR end "rule__CondBlock__Group__2"


    // $ANTLR start "rule__CondBlock__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4268:1: rule__CondBlock__Group__2__Impl : ( ( rule__CondBlock__ActionAssignment_2 ) ) ;
    public final void rule__CondBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4272:1: ( ( ( rule__CondBlock__ActionAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4273:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4273:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4274:1: ( rule__CondBlock__ActionAssignment_2 )
            {
             before(grammarAccess.getCondBlockAccess().getActionAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4275:1: ( rule__CondBlock__ActionAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4275:2: rule__CondBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl8723);
            rule__CondBlock__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCondBlockAccess().getActionAssignment_2()); 

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
    // $ANTLR end "rule__CondBlock__Group__2__Impl"


    // $ANTLR start "rule__IfStateExp__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4291:1: rule__IfStateExp__Group__0 : rule__IfStateExp__Group__0__Impl rule__IfStateExp__Group__1 ;
    public final void rule__IfStateExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4295:1: ( rule__IfStateExp__Group__0__Impl rule__IfStateExp__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4296:2: rule__IfStateExp__Group__0__Impl rule__IfStateExp__Group__1
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group__0__Impl_in_rule__IfStateExp__Group__08759);
            rule__IfStateExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStateExp__Group__1_in_rule__IfStateExp__Group__08762);
            rule__IfStateExp__Group__1();

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
    // $ANTLR end "rule__IfStateExp__Group__0"


    // $ANTLR start "rule__IfStateExp__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4303:1: rule__IfStateExp__Group__0__Impl : ( ( rule__IfStateExp__BlockAssignment_0 ) ) ;
    public final void rule__IfStateExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4307:1: ( ( ( rule__IfStateExp__BlockAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4308:1: ( ( rule__IfStateExp__BlockAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4308:1: ( ( rule__IfStateExp__BlockAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4309:1: ( rule__IfStateExp__BlockAssignment_0 )
            {
             before(grammarAccess.getIfStateExpAccess().getBlockAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4310:1: ( rule__IfStateExp__BlockAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4310:2: rule__IfStateExp__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__IfStateExp__BlockAssignment_0_in_rule__IfStateExp__Group__0__Impl8789);
            rule__IfStateExp__BlockAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStateExpAccess().getBlockAssignment_0()); 

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
    // $ANTLR end "rule__IfStateExp__Group__0__Impl"


    // $ANTLR start "rule__IfStateExp__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4320:1: rule__IfStateExp__Group__1 : rule__IfStateExp__Group__1__Impl rule__IfStateExp__Group__2 ;
    public final void rule__IfStateExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4324:1: ( rule__IfStateExp__Group__1__Impl rule__IfStateExp__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4325:2: rule__IfStateExp__Group__1__Impl rule__IfStateExp__Group__2
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group__1__Impl_in_rule__IfStateExp__Group__18819);
            rule__IfStateExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStateExp__Group__2_in_rule__IfStateExp__Group__18822);
            rule__IfStateExp__Group__2();

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
    // $ANTLR end "rule__IfStateExp__Group__1"


    // $ANTLR start "rule__IfStateExp__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4332:1: rule__IfStateExp__Group__1__Impl : ( ( rule__IfStateExp__Group_1__0 )* ) ;
    public final void rule__IfStateExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4336:1: ( ( ( rule__IfStateExp__Group_1__0 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4337:1: ( ( rule__IfStateExp__Group_1__0 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4337:1: ( ( rule__IfStateExp__Group_1__0 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4338:1: ( rule__IfStateExp__Group_1__0 )*
            {
             before(grammarAccess.getIfStateExpAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4339:1: ( rule__IfStateExp__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==48) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4339:2: rule__IfStateExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IfStateExp__Group_1__0_in_rule__IfStateExp__Group__1__Impl8849);
            	    rule__IfStateExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIfStateExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__IfStateExp__Group__1__Impl"


    // $ANTLR start "rule__IfStateExp__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4349:1: rule__IfStateExp__Group__2 : rule__IfStateExp__Group__2__Impl ;
    public final void rule__IfStateExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4353:1: ( rule__IfStateExp__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4354:2: rule__IfStateExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group__2__Impl_in_rule__IfStateExp__Group__28880);
            rule__IfStateExp__Group__2__Impl();

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
    // $ANTLR end "rule__IfStateExp__Group__2"


    // $ANTLR start "rule__IfStateExp__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4360:1: rule__IfStateExp__Group__2__Impl : ( ( rule__IfStateExp__Group_2__0 )? ) ;
    public final void rule__IfStateExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4364:1: ( ( ( rule__IfStateExp__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4365:1: ( ( rule__IfStateExp__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4365:1: ( ( rule__IfStateExp__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4366:1: ( rule__IfStateExp__Group_2__0 )?
            {
             before(grammarAccess.getIfStateExpAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4367:1: ( rule__IfStateExp__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4367:2: rule__IfStateExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IfStateExp__Group_2__0_in_rule__IfStateExp__Group__2__Impl8907);
                    rule__IfStateExp__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStateExpAccess().getGroup_2()); 

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
    // $ANTLR end "rule__IfStateExp__Group__2__Impl"


    // $ANTLR start "rule__IfStateExp__Group_1__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4383:1: rule__IfStateExp__Group_1__0 : rule__IfStateExp__Group_1__0__Impl rule__IfStateExp__Group_1__1 ;
    public final void rule__IfStateExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4387:1: ( rule__IfStateExp__Group_1__0__Impl rule__IfStateExp__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4388:2: rule__IfStateExp__Group_1__0__Impl rule__IfStateExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group_1__0__Impl_in_rule__IfStateExp__Group_1__08944);
            rule__IfStateExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStateExp__Group_1__1_in_rule__IfStateExp__Group_1__08947);
            rule__IfStateExp__Group_1__1();

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
    // $ANTLR end "rule__IfStateExp__Group_1__0"


    // $ANTLR start "rule__IfStateExp__Group_1__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4395:1: rule__IfStateExp__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__IfStateExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4399:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4400:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4400:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4401:1: 'else'
            {
             before(grammarAccess.getIfStateExpAccess().getElseKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__IfStateExp__Group_1__0__Impl8975); 
             after(grammarAccess.getIfStateExpAccess().getElseKeyword_1_0()); 

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
    // $ANTLR end "rule__IfStateExp__Group_1__0__Impl"


    // $ANTLR start "rule__IfStateExp__Group_1__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4414:1: rule__IfStateExp__Group_1__1 : rule__IfStateExp__Group_1__1__Impl ;
    public final void rule__IfStateExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4418:1: ( rule__IfStateExp__Group_1__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4419:2: rule__IfStateExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group_1__1__Impl_in_rule__IfStateExp__Group_1__19006);
            rule__IfStateExp__Group_1__1__Impl();

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
    // $ANTLR end "rule__IfStateExp__Group_1__1"


    // $ANTLR start "rule__IfStateExp__Group_1__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4425:1: rule__IfStateExp__Group_1__1__Impl : ( ( rule__IfStateExp__BlocksAssignment_1_1 ) ) ;
    public final void rule__IfStateExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4429:1: ( ( ( rule__IfStateExp__BlocksAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4430:1: ( ( rule__IfStateExp__BlocksAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4430:1: ( ( rule__IfStateExp__BlocksAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4431:1: ( rule__IfStateExp__BlocksAssignment_1_1 )
            {
             before(grammarAccess.getIfStateExpAccess().getBlocksAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4432:1: ( rule__IfStateExp__BlocksAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4432:2: rule__IfStateExp__BlocksAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IfStateExp__BlocksAssignment_1_1_in_rule__IfStateExp__Group_1__1__Impl9033);
            rule__IfStateExp__BlocksAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStateExpAccess().getBlocksAssignment_1_1()); 

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
    // $ANTLR end "rule__IfStateExp__Group_1__1__Impl"


    // $ANTLR start "rule__IfStateExp__Group_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4446:1: rule__IfStateExp__Group_2__0 : rule__IfStateExp__Group_2__0__Impl rule__IfStateExp__Group_2__1 ;
    public final void rule__IfStateExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4450:1: ( rule__IfStateExp__Group_2__0__Impl rule__IfStateExp__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4451:2: rule__IfStateExp__Group_2__0__Impl rule__IfStateExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group_2__0__Impl_in_rule__IfStateExp__Group_2__09067);
            rule__IfStateExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStateExp__Group_2__1_in_rule__IfStateExp__Group_2__09070);
            rule__IfStateExp__Group_2__1();

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
    // $ANTLR end "rule__IfStateExp__Group_2__0"


    // $ANTLR start "rule__IfStateExp__Group_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4458:1: rule__IfStateExp__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfStateExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4462:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4463:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4463:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4464:1: 'else'
            {
             before(grammarAccess.getIfStateExpAccess().getElseKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__IfStateExp__Group_2__0__Impl9098); 
             after(grammarAccess.getIfStateExpAccess().getElseKeyword_2_0()); 

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
    // $ANTLR end "rule__IfStateExp__Group_2__0__Impl"


    // $ANTLR start "rule__IfStateExp__Group_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4477:1: rule__IfStateExp__Group_2__1 : rule__IfStateExp__Group_2__1__Impl ;
    public final void rule__IfStateExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4481:1: ( rule__IfStateExp__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4482:2: rule__IfStateExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IfStateExp__Group_2__1__Impl_in_rule__IfStateExp__Group_2__19129);
            rule__IfStateExp__Group_2__1__Impl();

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
    // $ANTLR end "rule__IfStateExp__Group_2__1"


    // $ANTLR start "rule__IfStateExp__Group_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4488:1: rule__IfStateExp__Group_2__1__Impl : ( ( rule__IfStateExp__DefaultBlockAssignment_2_1 ) ) ;
    public final void rule__IfStateExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4492:1: ( ( ( rule__IfStateExp__DefaultBlockAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4493:1: ( ( rule__IfStateExp__DefaultBlockAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4493:1: ( ( rule__IfStateExp__DefaultBlockAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4494:1: ( rule__IfStateExp__DefaultBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfStateExpAccess().getDefaultBlockAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4495:1: ( rule__IfStateExp__DefaultBlockAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4495:2: rule__IfStateExp__DefaultBlockAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IfStateExp__DefaultBlockAssignment_2_1_in_rule__IfStateExp__Group_2__1__Impl9156);
            rule__IfStateExp__DefaultBlockAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStateExpAccess().getDefaultBlockAssignment_2_1()); 

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
    // $ANTLR end "rule__IfStateExp__Group_2__1__Impl"


    // $ANTLR start "rule__CondStateBlock__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4509:1: rule__CondStateBlock__Group__0 : rule__CondStateBlock__Group__0__Impl rule__CondStateBlock__Group__1 ;
    public final void rule__CondStateBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4513:1: ( rule__CondStateBlock__Group__0__Impl rule__CondStateBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4514:2: rule__CondStateBlock__Group__0__Impl rule__CondStateBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CondStateBlock__Group__0__Impl_in_rule__CondStateBlock__Group__09190);
            rule__CondStateBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondStateBlock__Group__1_in_rule__CondStateBlock__Group__09193);
            rule__CondStateBlock__Group__1();

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
    // $ANTLR end "rule__CondStateBlock__Group__0"


    // $ANTLR start "rule__CondStateBlock__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4521:1: rule__CondStateBlock__Group__0__Impl : ( 'if' ) ;
    public final void rule__CondStateBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4525:1: ( ( 'if' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4526:1: ( 'if' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4526:1: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4527:1: 'if'
            {
             before(grammarAccess.getCondStateBlockAccess().getIfKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__CondStateBlock__Group__0__Impl9221); 
             after(grammarAccess.getCondStateBlockAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__CondStateBlock__Group__0__Impl"


    // $ANTLR start "rule__CondStateBlock__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4540:1: rule__CondStateBlock__Group__1 : rule__CondStateBlock__Group__1__Impl rule__CondStateBlock__Group__2 ;
    public final void rule__CondStateBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4544:1: ( rule__CondStateBlock__Group__1__Impl rule__CondStateBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4545:2: rule__CondStateBlock__Group__1__Impl rule__CondStateBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CondStateBlock__Group__1__Impl_in_rule__CondStateBlock__Group__19252);
            rule__CondStateBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondStateBlock__Group__2_in_rule__CondStateBlock__Group__19255);
            rule__CondStateBlock__Group__2();

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
    // $ANTLR end "rule__CondStateBlock__Group__1"


    // $ANTLR start "rule__CondStateBlock__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4552:1: rule__CondStateBlock__Group__1__Impl : ( ( rule__CondStateBlock__CondAssignment_1 ) ) ;
    public final void rule__CondStateBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4556:1: ( ( ( rule__CondStateBlock__CondAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4557:1: ( ( rule__CondStateBlock__CondAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4557:1: ( ( rule__CondStateBlock__CondAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4558:1: ( rule__CondStateBlock__CondAssignment_1 )
            {
             before(grammarAccess.getCondStateBlockAccess().getCondAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4559:1: ( rule__CondStateBlock__CondAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4559:2: rule__CondStateBlock__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CondStateBlock__CondAssignment_1_in_rule__CondStateBlock__Group__1__Impl9282);
            rule__CondStateBlock__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCondStateBlockAccess().getCondAssignment_1()); 

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
    // $ANTLR end "rule__CondStateBlock__Group__1__Impl"


    // $ANTLR start "rule__CondStateBlock__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4569:1: rule__CondStateBlock__Group__2 : rule__CondStateBlock__Group__2__Impl ;
    public final void rule__CondStateBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4573:1: ( rule__CondStateBlock__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4574:2: rule__CondStateBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CondStateBlock__Group__2__Impl_in_rule__CondStateBlock__Group__29312);
            rule__CondStateBlock__Group__2__Impl();

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
    // $ANTLR end "rule__CondStateBlock__Group__2"


    // $ANTLR start "rule__CondStateBlock__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4580:1: rule__CondStateBlock__Group__2__Impl : ( ( rule__CondStateBlock__ActionAssignment_2 ) ) ;
    public final void rule__CondStateBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4584:1: ( ( ( rule__CondStateBlock__ActionAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4585:1: ( ( rule__CondStateBlock__ActionAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4585:1: ( ( rule__CondStateBlock__ActionAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4586:1: ( rule__CondStateBlock__ActionAssignment_2 )
            {
             before(grammarAccess.getCondStateBlockAccess().getActionAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4587:1: ( rule__CondStateBlock__ActionAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4587:2: rule__CondStateBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__CondStateBlock__ActionAssignment_2_in_rule__CondStateBlock__Group__2__Impl9339);
            rule__CondStateBlock__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCondStateBlockAccess().getActionAssignment_2()); 

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
    // $ANTLR end "rule__CondStateBlock__Group__2__Impl"


    // $ANTLR start "rule__BlockState__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4603:1: rule__BlockState__Group__0 : rule__BlockState__Group__0__Impl rule__BlockState__Group__1 ;
    public final void rule__BlockState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4607:1: ( rule__BlockState__Group__0__Impl rule__BlockState__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4608:2: rule__BlockState__Group__0__Impl rule__BlockState__Group__1
            {
            pushFollow(FOLLOW_rule__BlockState__Group__0__Impl_in_rule__BlockState__Group__09375);
            rule__BlockState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockState__Group__1_in_rule__BlockState__Group__09378);
            rule__BlockState__Group__1();

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
    // $ANTLR end "rule__BlockState__Group__0"


    // $ANTLR start "rule__BlockState__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4615:1: rule__BlockState__Group__0__Impl : ( () ) ;
    public final void rule__BlockState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4619:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4620:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4620:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4621:1: ()
            {
             before(grammarAccess.getBlockStateAccess().getBlockStateAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4622:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4624:1: 
            {
            }

             after(grammarAccess.getBlockStateAccess().getBlockStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockState__Group__0__Impl"


    // $ANTLR start "rule__BlockState__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4634:1: rule__BlockState__Group__1 : rule__BlockState__Group__1__Impl rule__BlockState__Group__2 ;
    public final void rule__BlockState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4638:1: ( rule__BlockState__Group__1__Impl rule__BlockState__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4639:2: rule__BlockState__Group__1__Impl rule__BlockState__Group__2
            {
            pushFollow(FOLLOW_rule__BlockState__Group__1__Impl_in_rule__BlockState__Group__19436);
            rule__BlockState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockState__Group__2_in_rule__BlockState__Group__19439);
            rule__BlockState__Group__2();

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
    // $ANTLR end "rule__BlockState__Group__1"


    // $ANTLR start "rule__BlockState__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4646:1: rule__BlockState__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4650:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4651:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4651:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4652:1: '{'
            {
             before(grammarAccess.getBlockStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__BlockState__Group__1__Impl9467); 
             after(grammarAccess.getBlockStateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__BlockState__Group__1__Impl"


    // $ANTLR start "rule__BlockState__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4665:1: rule__BlockState__Group__2 : rule__BlockState__Group__2__Impl rule__BlockState__Group__3 ;
    public final void rule__BlockState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4669:1: ( rule__BlockState__Group__2__Impl rule__BlockState__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4670:2: rule__BlockState__Group__2__Impl rule__BlockState__Group__3
            {
            pushFollow(FOLLOW_rule__BlockState__Group__2__Impl_in_rule__BlockState__Group__29498);
            rule__BlockState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockState__Group__3_in_rule__BlockState__Group__29501);
            rule__BlockState__Group__3();

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
    // $ANTLR end "rule__BlockState__Group__2"


    // $ANTLR start "rule__BlockState__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4677:1: rule__BlockState__Group__2__Impl : ( ( rule__BlockState__StaAssignment_2 )* ) ;
    public final void rule__BlockState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4681:1: ( ( ( rule__BlockState__StaAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4682:1: ( ( rule__BlockState__StaAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4682:1: ( ( rule__BlockState__StaAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4683:1: ( rule__BlockState__StaAssignment_2 )*
            {
             before(grammarAccess.getBlockStateAccess().getStaAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4684:1: ( rule__BlockState__StaAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_ML_COMMENT)||LA24_0==29||(LA24_0>=31 && LA24_0<=32)||LA24_0==36||LA24_0==38||LA24_0==40||(LA24_0>=44 && LA24_0<=45)||(LA24_0>=48 && LA24_0<=49)||(LA24_0>=51 && LA24_0<=52)||(LA24_0>=54 && LA24_0<=55)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4684:2: rule__BlockState__StaAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BlockState__StaAssignment_2_in_rule__BlockState__Group__2__Impl9528);
            	    rule__BlockState__StaAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBlockStateAccess().getStaAssignment_2()); 

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
    // $ANTLR end "rule__BlockState__Group__2__Impl"


    // $ANTLR start "rule__BlockState__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4694:1: rule__BlockState__Group__3 : rule__BlockState__Group__3__Impl ;
    public final void rule__BlockState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4698:1: ( rule__BlockState__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4699:2: rule__BlockState__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockState__Group__3__Impl_in_rule__BlockState__Group__39559);
            rule__BlockState__Group__3__Impl();

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
    // $ANTLR end "rule__BlockState__Group__3"


    // $ANTLR start "rule__BlockState__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4705:1: rule__BlockState__Group__3__Impl : ( '}' ) ;
    public final void rule__BlockState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4709:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4710:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4710:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4711:1: '}'
            {
             before(grammarAccess.getBlockStateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__BlockState__Group__3__Impl9587); 
             after(grammarAccess.getBlockStateAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__BlockState__Group__3__Impl"


    // $ANTLR start "rule__BoolExpression__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4732:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4736:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4737:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__09626);
            rule__BoolExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__09629);
            rule__BoolExpression__Group__1();

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
    // $ANTLR end "rule__BoolExpression__Group__0"


    // $ANTLR start "rule__BoolExpression__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4744:1: rule__BoolExpression__Group__0__Impl : ( ruleTerminalBoolExpression ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4748:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4749:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4749:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4750:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl9656);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__BoolExpression__Group__0__Impl"


    // $ANTLR start "rule__BoolExpression__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4761:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4765:1: ( rule__BoolExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4766:2: rule__BoolExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__19685);
            rule__BoolExpression__Group__1__Impl();

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
    // $ANTLR end "rule__BoolExpression__Group__1"


    // $ANTLR start "rule__BoolExpression__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4772:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4776:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4777:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4777:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4778:1: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4779:1: ( rule__BoolExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_LOGIC_WORD) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4779:2: rule__BoolExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl9712);
                    rule__BoolExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BoolExpression__Group__1__Impl"


    // $ANTLR start "rule__BoolExpression__Group_1__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4793:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4797:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4798:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__09747);
            rule__BoolExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__09750);
            rule__BoolExpression__Group_1__1();

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
    // $ANTLR end "rule__BoolExpression__Group_1__0"


    // $ANTLR start "rule__BoolExpression__Group_1__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4805:1: rule__BoolExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4809:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4810:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4810:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4811:1: ()
            {
             before(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4812:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4814:1: 
            {
            }

             after(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BoolExpression__Group_1__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4824:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4828:1: ( rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4829:2: rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__19808);
            rule__BoolExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__19811);
            rule__BoolExpression__Group_1__2();

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
    // $ANTLR end "rule__BoolExpression__Group_1__1"


    // $ANTLR start "rule__BoolExpression__Group_1__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4836:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4840:1: ( ( ( rule__BoolExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4841:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4841:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4842:1: ( rule__BoolExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4843:1: ( rule__BoolExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4843:2: rule__BoolExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl9838);
            rule__BoolExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__BoolExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BoolExpression__Group_1__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4853:1: rule__BoolExpression__Group_1__2 : rule__BoolExpression__Group_1__2__Impl ;
    public final void rule__BoolExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4857:1: ( rule__BoolExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4858:2: rule__BoolExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__29868);
            rule__BoolExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__BoolExpression__Group_1__2"


    // $ANTLR start "rule__BoolExpression__Group_1__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4864:1: rule__BoolExpression__Group_1__2__Impl : ( ( rule__BoolExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4868:1: ( ( ( rule__BoolExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4869:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4869:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4870:1: ( rule__BoolExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4871:1: ( rule__BoolExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4871:2: rule__BoolExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl9895);
            rule__BoolExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__BoolExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Brackets__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4887:1: rule__Brackets__Group__0 : rule__Brackets__Group__0__Impl rule__Brackets__Group__1 ;
    public final void rule__Brackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4891:1: ( rule__Brackets__Group__0__Impl rule__Brackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4892:2: rule__Brackets__Group__0__Impl rule__Brackets__Group__1
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__09931);
            rule__Brackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__09934);
            rule__Brackets__Group__1();

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
    // $ANTLR end "rule__Brackets__Group__0"


    // $ANTLR start "rule__Brackets__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4899:1: rule__Brackets__Group__0__Impl : ( ( rule__Brackets__OpenAssignment_0 ) ) ;
    public final void rule__Brackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4903:1: ( ( ( rule__Brackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4904:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4904:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4905:1: ( rule__Brackets__OpenAssignment_0 )
            {
             before(grammarAccess.getBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4906:1: ( rule__Brackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4906:2: rule__Brackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl9961);
            rule__Brackets__OpenAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBracketsAccess().getOpenAssignment_0()); 

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
    // $ANTLR end "rule__Brackets__Group__0__Impl"


    // $ANTLR start "rule__Brackets__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4916:1: rule__Brackets__Group__1 : rule__Brackets__Group__1__Impl rule__Brackets__Group__2 ;
    public final void rule__Brackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4920:1: ( rule__Brackets__Group__1__Impl rule__Brackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4921:2: rule__Brackets__Group__1__Impl rule__Brackets__Group__2
            {
            pushFollow(FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__19991);
            rule__Brackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__19994);
            rule__Brackets__Group__2();

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
    // $ANTLR end "rule__Brackets__Group__1"


    // $ANTLR start "rule__Brackets__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4928:1: rule__Brackets__Group__1__Impl : ( ( rule__Brackets__ObjAssignment_1 ) ) ;
    public final void rule__Brackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4932:1: ( ( ( rule__Brackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4933:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4933:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4934:1: ( rule__Brackets__ObjAssignment_1 )
            {
             before(grammarAccess.getBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4935:1: ( rule__Brackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4935:2: rule__Brackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10021);
            rule__Brackets__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketsAccess().getObjAssignment_1()); 

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
    // $ANTLR end "rule__Brackets__Group__1__Impl"


    // $ANTLR start "rule__Brackets__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4945:1: rule__Brackets__Group__2 : rule__Brackets__Group__2__Impl ;
    public final void rule__Brackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4949:1: ( rule__Brackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4950:2: rule__Brackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210051);
            rule__Brackets__Group__2__Impl();

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
    // $ANTLR end "rule__Brackets__Group__2"


    // $ANTLR start "rule__Brackets__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4956:1: rule__Brackets__Group__2__Impl : ( ( rule__Brackets__CloseAssignment_2 ) ) ;
    public final void rule__Brackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4960:1: ( ( ( rule__Brackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4961:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4961:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4962:1: ( rule__Brackets__CloseAssignment_2 )
            {
             before(grammarAccess.getBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4963:1: ( rule__Brackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4963:2: rule__Brackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10078);
            rule__Brackets__CloseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBracketsAccess().getCloseAssignment_2()); 

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
    // $ANTLR end "rule__Brackets__Group__2__Impl"


    // $ANTLR start "rule__CompareExpression__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4979:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4983:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4984:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010114);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010117);
            rule__CompareExpression__Group__1();

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
    // $ANTLR end "rule__CompareExpression__Group__0"


    // $ANTLR start "rule__CompareExpression__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4991:1: rule__CompareExpression__Group__0__Impl : ( ( rule__CompareExpression__LeftAssignment_0 ) ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4995:1: ( ( ( rule__CompareExpression__LeftAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4996:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4996:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4997:1: ( rule__CompareExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4998:1: ( rule__CompareExpression__LeftAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4998:2: rule__CompareExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10144);
            rule__CompareExpression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__CompareExpression__Group__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5008:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5012:1: ( rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5013:2: rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110174);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110177);
            rule__CompareExpression__Group__2();

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
    // $ANTLR end "rule__CompareExpression__Group__1"


    // $ANTLR start "rule__CompareExpression__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5020:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__OpAssignment_1 ) ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5024:1: ( ( ( rule__CompareExpression__OpAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5025:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5025:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5026:1: ( rule__CompareExpression__OpAssignment_1 )
            {
             before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5027:1: ( rule__CompareExpression__OpAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5027:2: rule__CompareExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10204);
            rule__CompareExpression__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpressionAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__CompareExpression__Group__1__Impl"


    // $ANTLR start "rule__CompareExpression__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5037:1: rule__CompareExpression__Group__2 : rule__CompareExpression__Group__2__Impl ;
    public final void rule__CompareExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5041:1: ( rule__CompareExpression__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5042:2: rule__CompareExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210234);
            rule__CompareExpression__Group__2__Impl();

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
    // $ANTLR end "rule__CompareExpression__Group__2"


    // $ANTLR start "rule__CompareExpression__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5048:1: rule__CompareExpression__Group__2__Impl : ( ( rule__CompareExpression__RightAssignment_2 ) ) ;
    public final void rule__CompareExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5052:1: ( ( ( rule__CompareExpression__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5053:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5053:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5054:1: ( rule__CompareExpression__RightAssignment_2 )
            {
             before(grammarAccess.getCompareExpressionAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5055:1: ( rule__CompareExpression__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5055:2: rule__CompareExpression__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10261);
            rule__CompareExpression__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpressionAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__CompareExpression__Group__2__Impl"


    // $ANTLR start "rule__NegExpression__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5071:1: rule__NegExpression__Group__0 : rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 ;
    public final void rule__NegExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5075:1: ( rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5076:2: rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010297);
            rule__NegExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010300);
            rule__NegExpression__Group__1();

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
    // $ANTLR end "rule__NegExpression__Group__0"


    // $ANTLR start "rule__NegExpression__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5083:1: rule__NegExpression__Group__0__Impl : ( ( rule__NegExpression__OpAssignment_0 ) ) ;
    public final void rule__NegExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5087:1: ( ( ( rule__NegExpression__OpAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5088:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5088:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5089:1: ( rule__NegExpression__OpAssignment_0 )
            {
             before(grammarAccess.getNegExpressionAccess().getOpAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5090:1: ( rule__NegExpression__OpAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5090:2: rule__NegExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10327);
            rule__NegExpression__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNegExpressionAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__NegExpression__Group__0__Impl"


    // $ANTLR start "rule__NegExpression__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5100:1: rule__NegExpression__Group__1 : rule__NegExpression__Group__1__Impl ;
    public final void rule__NegExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5104:1: ( rule__NegExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5105:2: rule__NegExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110357);
            rule__NegExpression__Group__1__Impl();

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
    // $ANTLR end "rule__NegExpression__Group__1"


    // $ANTLR start "rule__NegExpression__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5111:1: rule__NegExpression__Group__1__Impl : ( ( rule__NegExpression__ObjAssignment_1 ) ) ;
    public final void rule__NegExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5115:1: ( ( ( rule__NegExpression__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5116:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5116:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5117:1: ( rule__NegExpression__ObjAssignment_1 )
            {
             before(grammarAccess.getNegExpressionAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5118:1: ( rule__NegExpression__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5118:2: rule__NegExpression__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10384);
            rule__NegExpression__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegExpressionAccess().getObjAssignment_1()); 

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
    // $ANTLR end "rule__NegExpression__Group__1__Impl"


    // $ANTLR start "rule__MathExpression__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5132:1: rule__MathExpression__Group__0 : rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 ;
    public final void rule__MathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5136:1: ( rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5137:2: rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010418);
            rule__MathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010421);
            rule__MathExpression__Group__1();

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
    // $ANTLR end "rule__MathExpression__Group__0"


    // $ANTLR start "rule__MathExpression__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5144:1: rule__MathExpression__Group__0__Impl : ( ruleMathTerminal ) ;
    public final void rule__MathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5148:1: ( ( ruleMathTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5149:1: ( ruleMathTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5149:1: ( ruleMathTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5150:1: ruleMathTerminal
            {
             before(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10448);
            ruleMathTerminal();

            state._fsp--;

             after(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 

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
    // $ANTLR end "rule__MathExpression__Group__0__Impl"


    // $ANTLR start "rule__MathExpression__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5161:1: rule__MathExpression__Group__1 : rule__MathExpression__Group__1__Impl ;
    public final void rule__MathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5165:1: ( rule__MathExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5166:2: rule__MathExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110477);
            rule__MathExpression__Group__1__Impl();

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
    // $ANTLR end "rule__MathExpression__Group__1"


    // $ANTLR start "rule__MathExpression__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5172:1: rule__MathExpression__Group__1__Impl : ( ( rule__MathExpression__Group_1__0 )? ) ;
    public final void rule__MathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5176:1: ( ( ( rule__MathExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5177:1: ( ( rule__MathExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5177:1: ( ( rule__MathExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5178:1: ( rule__MathExpression__Group_1__0 )?
            {
             before(grammarAccess.getMathExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5179:1: ( rule__MathExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_MATH) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5179:2: rule__MathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10504);
                    rule__MathExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMathExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MathExpression__Group__1__Impl"


    // $ANTLR start "rule__MathExpression__Group_1__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5193:1: rule__MathExpression__Group_1__0 : rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 ;
    public final void rule__MathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5197:1: ( rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5198:2: rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__010539);
            rule__MathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__010542);
            rule__MathExpression__Group_1__1();

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
    // $ANTLR end "rule__MathExpression__Group_1__0"


    // $ANTLR start "rule__MathExpression__Group_1__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5205:1: rule__MathExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5209:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5210:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5210:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5211:1: ()
            {
             before(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5212:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5214:1: 
            {
            }

             after(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MathExpression__Group_1__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5224:1: rule__MathExpression__Group_1__1 : rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 ;
    public final void rule__MathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5228:1: ( rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5229:2: rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__110600);
            rule__MathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__110603);
            rule__MathExpression__Group_1__2();

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
    // $ANTLR end "rule__MathExpression__Group_1__1"


    // $ANTLR start "rule__MathExpression__Group_1__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5236:1: rule__MathExpression__Group_1__1__Impl : ( ( rule__MathExpression__OpAssignment_1_1 ) ) ;
    public final void rule__MathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5240:1: ( ( ( rule__MathExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5241:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5241:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5242:1: ( rule__MathExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5243:1: ( rule__MathExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5243:2: rule__MathExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl10630);
            rule__MathExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__MathExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MathExpression__Group_1__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5253:1: rule__MathExpression__Group_1__2 : rule__MathExpression__Group_1__2__Impl ;
    public final void rule__MathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5257:1: ( rule__MathExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5258:2: rule__MathExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__210660);
            rule__MathExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__MathExpression__Group_1__2"


    // $ANTLR start "rule__MathExpression__Group_1__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5264:1: rule__MathExpression__Group_1__2__Impl : ( ( rule__MathExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5268:1: ( ( ( rule__MathExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5269:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5269:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5270:1: ( rule__MathExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5271:1: ( rule__MathExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5271:2: rule__MathExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl10687);
            rule__MathExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MathExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MathBrackets__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5287:1: rule__MathBrackets__Group__0 : rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 ;
    public final void rule__MathBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5291:1: ( rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5292:2: rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__010723);
            rule__MathBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__010726);
            rule__MathBrackets__Group__1();

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
    // $ANTLR end "rule__MathBrackets__Group__0"


    // $ANTLR start "rule__MathBrackets__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5299:1: rule__MathBrackets__Group__0__Impl : ( ( rule__MathBrackets__OpenAssignment_0 ) ) ;
    public final void rule__MathBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5303:1: ( ( ( rule__MathBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5304:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5304:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5305:1: ( rule__MathBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getMathBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5306:1: ( rule__MathBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5306:2: rule__MathBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl10753);
            rule__MathBrackets__OpenAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMathBracketsAccess().getOpenAssignment_0()); 

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
    // $ANTLR end "rule__MathBrackets__Group__0__Impl"


    // $ANTLR start "rule__MathBrackets__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5316:1: rule__MathBrackets__Group__1 : rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 ;
    public final void rule__MathBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5320:1: ( rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5321:2: rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__110783);
            rule__MathBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__110786);
            rule__MathBrackets__Group__2();

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
    // $ANTLR end "rule__MathBrackets__Group__1"


    // $ANTLR start "rule__MathBrackets__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5328:1: rule__MathBrackets__Group__1__Impl : ( ( rule__MathBrackets__ObjAssignment_1 ) ) ;
    public final void rule__MathBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5332:1: ( ( ( rule__MathBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5333:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5333:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5334:1: ( rule__MathBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getMathBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5335:1: ( rule__MathBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5335:2: rule__MathBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl10813);
            rule__MathBrackets__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathBracketsAccess().getObjAssignment_1()); 

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
    // $ANTLR end "rule__MathBrackets__Group__1__Impl"


    // $ANTLR start "rule__MathBrackets__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5345:1: rule__MathBrackets__Group__2 : rule__MathBrackets__Group__2__Impl ;
    public final void rule__MathBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5349:1: ( rule__MathBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5350:2: rule__MathBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__210843);
            rule__MathBrackets__Group__2__Impl();

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
    // $ANTLR end "rule__MathBrackets__Group__2"


    // $ANTLR start "rule__MathBrackets__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5356:1: rule__MathBrackets__Group__2__Impl : ( ( rule__MathBrackets__CloseAssignment_2 ) ) ;
    public final void rule__MathBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5360:1: ( ( ( rule__MathBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5361:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5361:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5362:1: ( rule__MathBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getMathBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5363:1: ( rule__MathBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5363:2: rule__MathBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl10870);
            rule__MathBrackets__CloseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathBracketsAccess().getCloseAssignment_2()); 

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
    // $ANTLR end "rule__MathBrackets__Group__2__Impl"


    // $ANTLR start "rule__ConcatenationExpression__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5379:1: rule__ConcatenationExpression__Group__0 : rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 ;
    public final void rule__ConcatenationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5383:1: ( rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5384:2: rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__010906);
            rule__ConcatenationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__010909);
            rule__ConcatenationExpression__Group__1();

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
    // $ANTLR end "rule__ConcatenationExpression__Group__0"


    // $ANTLR start "rule__ConcatenationExpression__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5391:1: rule__ConcatenationExpression__Group__0__Impl : ( ruleConcatenationTerminal ) ;
    public final void rule__ConcatenationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5395:1: ( ( ruleConcatenationTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5396:1: ( ruleConcatenationTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5396:1: ( ruleConcatenationTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5397:1: ruleConcatenationTerminal
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl10936);
            ruleConcatenationTerminal();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConcatenationExpression__Group__0__Impl"


    // $ANTLR start "rule__ConcatenationExpression__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5408:1: rule__ConcatenationExpression__Group__1 : rule__ConcatenationExpression__Group__1__Impl ;
    public final void rule__ConcatenationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5412:1: ( rule__ConcatenationExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5413:2: rule__ConcatenationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__110965);
            rule__ConcatenationExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ConcatenationExpression__Group__1"


    // $ANTLR start "rule__ConcatenationExpression__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5419:1: rule__ConcatenationExpression__Group__1__Impl : ( ( rule__ConcatenationExpression__Group_1__0 )? ) ;
    public final void rule__ConcatenationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5423:1: ( ( ( rule__ConcatenationExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5424:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5424:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5425:1: ( rule__ConcatenationExpression__Group_1__0 )?
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5426:1: ( rule__ConcatenationExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_CONCATENATION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5426:2: rule__ConcatenationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl10992);
                    rule__ConcatenationExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcatenationExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConcatenationExpression__Group__1__Impl"


    // $ANTLR start "rule__ConcatenationExpression__Group_1__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5440:1: rule__ConcatenationExpression__Group_1__0 : rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 ;
    public final void rule__ConcatenationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5444:1: ( rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5445:2: rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011027);
            rule__ConcatenationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011030);
            rule__ConcatenationExpression__Group_1__1();

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
    // $ANTLR end "rule__ConcatenationExpression__Group_1__0"


    // $ANTLR start "rule__ConcatenationExpression__Group_1__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5452:1: rule__ConcatenationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatenationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5456:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5457:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5457:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5458:1: ()
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5459:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5461:1: 
            {
            }

             after(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcatenationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConcatenationExpression__Group_1__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5471:1: rule__ConcatenationExpression__Group_1__1 : rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 ;
    public final void rule__ConcatenationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5475:1: ( rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5476:2: rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111088);
            rule__ConcatenationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111091);
            rule__ConcatenationExpression__Group_1__2();

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
    // $ANTLR end "rule__ConcatenationExpression__Group_1__1"


    // $ANTLR start "rule__ConcatenationExpression__Group_1__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5483:1: rule__ConcatenationExpression__Group_1__1__Impl : ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5487:1: ( ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5488:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5488:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5489:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5490:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5490:2: rule__ConcatenationExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11118);
            rule__ConcatenationExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__ConcatenationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConcatenationExpression__Group_1__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5500:1: rule__ConcatenationExpression__Group_1__2 : rule__ConcatenationExpression__Group_1__2__Impl ;
    public final void rule__ConcatenationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5504:1: ( rule__ConcatenationExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5505:2: rule__ConcatenationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211148);
            rule__ConcatenationExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ConcatenationExpression__Group_1__2"


    // $ANTLR start "rule__ConcatenationExpression__Group_1__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5511:1: rule__ConcatenationExpression__Group_1__2__Impl : ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5515:1: ( ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5516:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5516:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5517:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5518:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5518:2: rule__ConcatenationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11175);
            rule__ConcatenationExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ConcatenationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConcatenationBrackets__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5534:1: rule__ConcatenationBrackets__Group__0 : rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 ;
    public final void rule__ConcatenationBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5538:1: ( rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5539:2: rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011211);
            rule__ConcatenationBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011214);
            rule__ConcatenationBrackets__Group__1();

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
    // $ANTLR end "rule__ConcatenationBrackets__Group__0"


    // $ANTLR start "rule__ConcatenationBrackets__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5546:1: rule__ConcatenationBrackets__Group__0__Impl : ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) ;
    public final void rule__ConcatenationBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5550:1: ( ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5551:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5551:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5552:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5553:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5553:2: rule__ConcatenationBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11241);
            rule__ConcatenationBrackets__OpenAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0()); 

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
    // $ANTLR end "rule__ConcatenationBrackets__Group__0__Impl"


    // $ANTLR start "rule__ConcatenationBrackets__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5563:1: rule__ConcatenationBrackets__Group__1 : rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 ;
    public final void rule__ConcatenationBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5567:1: ( rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5568:2: rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111271);
            rule__ConcatenationBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111274);
            rule__ConcatenationBrackets__Group__2();

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
    // $ANTLR end "rule__ConcatenationBrackets__Group__1"


    // $ANTLR start "rule__ConcatenationBrackets__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5575:1: rule__ConcatenationBrackets__Group__1__Impl : ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) ;
    public final void rule__ConcatenationBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5579:1: ( ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5580:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5580:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5581:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5582:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5582:2: rule__ConcatenationBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11301);
            rule__ConcatenationBrackets__ObjAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1()); 

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
    // $ANTLR end "rule__ConcatenationBrackets__Group__1__Impl"


    // $ANTLR start "rule__ConcatenationBrackets__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5592:1: rule__ConcatenationBrackets__Group__2 : rule__ConcatenationBrackets__Group__2__Impl ;
    public final void rule__ConcatenationBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5596:1: ( rule__ConcatenationBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5597:2: rule__ConcatenationBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211331);
            rule__ConcatenationBrackets__Group__2__Impl();

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
    // $ANTLR end "rule__ConcatenationBrackets__Group__2"


    // $ANTLR start "rule__ConcatenationBrackets__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5603:1: rule__ConcatenationBrackets__Group__2__Impl : ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) ;
    public final void rule__ConcatenationBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5607:1: ( ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5608:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5608:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5609:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5610:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5610:2: rule__ConcatenationBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11358);
            rule__ConcatenationBrackets__CloseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2()); 

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
    // $ANTLR end "rule__ConcatenationBrackets__Group__2__Impl"


    // $ANTLR start "rule__StringVariable__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5626:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5630:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5631:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011394);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011397);
            rule__StringVariable__Group__1();

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
    // $ANTLR end "rule__StringVariable__Group__0"


    // $ANTLR start "rule__StringVariable__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5638:1: rule__StringVariable__Group__0__Impl : ( 'varString' ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5642:1: ( ( 'varString' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5643:1: ( 'varString' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5643:1: ( 'varString' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5644:1: 'varString'
            {
             before(grammarAccess.getStringVariableAccess().getVarStringKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__StringVariable__Group__0__Impl11425); 
             after(grammarAccess.getStringVariableAccess().getVarStringKeyword_0()); 

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
    // $ANTLR end "rule__StringVariable__Group__0__Impl"


    // $ANTLR start "rule__StringVariable__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5657:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5661:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5662:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111456);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111459);
            rule__StringVariable__Group__2();

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
    // $ANTLR end "rule__StringVariable__Group__1"


    // $ANTLR start "rule__StringVariable__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5669:1: rule__StringVariable__Group__1__Impl : ( ( rule__StringVariable__NameAssignment_1 ) ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5673:1: ( ( ( rule__StringVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5674:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5674:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5675:1: ( rule__StringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5676:1: ( rule__StringVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5676:2: rule__StringVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11486);
            rule__StringVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringVariable__Group__1__Impl"


    // $ANTLR start "rule__StringVariable__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5686:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5690:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5691:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__211516);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__211519);
            rule__StringVariable__Group__3();

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
    // $ANTLR end "rule__StringVariable__Group__2"


    // $ANTLR start "rule__StringVariable__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5698:1: rule__StringVariable__Group__2__Impl : ( ( rule__StringVariable__Group_2__0 )? ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5702:1: ( ( ( rule__StringVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5703:1: ( ( rule__StringVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5703:1: ( ( rule__StringVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5704:1: ( rule__StringVariable__Group_2__0 )?
            {
             before(grammarAccess.getStringVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5705:1: ( rule__StringVariable__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5705:2: rule__StringVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl11546);
                    rule__StringVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__StringVariable__Group__2__Impl"


    // $ANTLR start "rule__StringVariable__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5715:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5719:1: ( rule__StringVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5720:2: rule__StringVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__311577);
            rule__StringVariable__Group__3__Impl();

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
    // $ANTLR end "rule__StringVariable__Group__3"


    // $ANTLR start "rule__StringVariable__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5726:1: rule__StringVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5730:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5731:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5731:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5732:1: ';'
            {
             before(grammarAccess.getStringVariableAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__StringVariable__Group__3__Impl11605); 
             after(grammarAccess.getStringVariableAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__StringVariable__Group__3__Impl"


    // $ANTLR start "rule__StringVariable__Group_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5753:1: rule__StringVariable__Group_2__0 : rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 ;
    public final void rule__StringVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5757:1: ( rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5758:2: rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__011644);
            rule__StringVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__011647);
            rule__StringVariable__Group_2__1();

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
    // $ANTLR end "rule__StringVariable__Group_2__0"


    // $ANTLR start "rule__StringVariable__Group_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5765:1: rule__StringVariable__Group_2__0__Impl : ( '=' ) ;
    public final void rule__StringVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5769:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5770:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5770:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5771:1: '='
            {
             before(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__StringVariable__Group_2__0__Impl11675); 
             after(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__StringVariable__Group_2__0__Impl"


    // $ANTLR start "rule__StringVariable__Group_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5784:1: rule__StringVariable__Group_2__1 : rule__StringVariable__Group_2__1__Impl ;
    public final void rule__StringVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5788:1: ( rule__StringVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5789:2: rule__StringVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__111706);
            rule__StringVariable__Group_2__1__Impl();

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
    // $ANTLR end "rule__StringVariable__Group_2__1"


    // $ANTLR start "rule__StringVariable__Group_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5795:1: rule__StringVariable__Group_2__1__Impl : ( ( rule__StringVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__StringVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5799:1: ( ( ( rule__StringVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5800:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5800:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5801:1: ( rule__StringVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getStringVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5802:1: ( rule__StringVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5802:2: rule__StringVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl11733);
            rule__StringVariable__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__StringVariable__Group_2__1__Impl"


    // $ANTLR start "rule__NumVariable__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5816:1: rule__NumVariable__Group__0 : rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 ;
    public final void rule__NumVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5820:1: ( rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5821:2: rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__011767);
            rule__NumVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__011770);
            rule__NumVariable__Group__1();

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
    // $ANTLR end "rule__NumVariable__Group__0"


    // $ANTLR start "rule__NumVariable__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5828:1: rule__NumVariable__Group__0__Impl : ( 'varNum' ) ;
    public final void rule__NumVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5832:1: ( ( 'varNum' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5833:1: ( 'varNum' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5833:1: ( 'varNum' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5834:1: 'varNum'
            {
             before(grammarAccess.getNumVariableAccess().getVarNumKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__NumVariable__Group__0__Impl11798); 
             after(grammarAccess.getNumVariableAccess().getVarNumKeyword_0()); 

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
    // $ANTLR end "rule__NumVariable__Group__0__Impl"


    // $ANTLR start "rule__NumVariable__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5847:1: rule__NumVariable__Group__1 : rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 ;
    public final void rule__NumVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5851:1: ( rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5852:2: rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__111829);
            rule__NumVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__111832);
            rule__NumVariable__Group__2();

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
    // $ANTLR end "rule__NumVariable__Group__1"


    // $ANTLR start "rule__NumVariable__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5859:1: rule__NumVariable__Group__1__Impl : ( ( rule__NumVariable__NameAssignment_1 ) ) ;
    public final void rule__NumVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5863:1: ( ( ( rule__NumVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5864:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5864:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5865:1: ( rule__NumVariable__NameAssignment_1 )
            {
             before(grammarAccess.getNumVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5866:1: ( rule__NumVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5866:2: rule__NumVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl11859);
            rule__NumVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NumVariable__Group__1__Impl"


    // $ANTLR start "rule__NumVariable__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5876:1: rule__NumVariable__Group__2 : rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 ;
    public final void rule__NumVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5880:1: ( rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5881:2: rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__211889);
            rule__NumVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__211892);
            rule__NumVariable__Group__3();

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
    // $ANTLR end "rule__NumVariable__Group__2"


    // $ANTLR start "rule__NumVariable__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5888:1: rule__NumVariable__Group__2__Impl : ( ( rule__NumVariable__Group_2__0 )? ) ;
    public final void rule__NumVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5892:1: ( ( ( rule__NumVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5893:1: ( ( rule__NumVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5893:1: ( ( rule__NumVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5894:1: ( rule__NumVariable__Group_2__0 )?
            {
             before(grammarAccess.getNumVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5895:1: ( rule__NumVariable__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5895:2: rule__NumVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl11919);
                    rule__NumVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NumVariable__Group__2__Impl"


    // $ANTLR start "rule__NumVariable__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5905:1: rule__NumVariable__Group__3 : rule__NumVariable__Group__3__Impl ;
    public final void rule__NumVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5909:1: ( rule__NumVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5910:2: rule__NumVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__311950);
            rule__NumVariable__Group__3__Impl();

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
    // $ANTLR end "rule__NumVariable__Group__3"


    // $ANTLR start "rule__NumVariable__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5916:1: rule__NumVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__NumVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5920:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5921:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5921:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5922:1: ';'
            {
             before(grammarAccess.getNumVariableAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__NumVariable__Group__3__Impl11978); 
             after(grammarAccess.getNumVariableAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__NumVariable__Group__3__Impl"


    // $ANTLR start "rule__NumVariable__Group_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5943:1: rule__NumVariable__Group_2__0 : rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 ;
    public final void rule__NumVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5947:1: ( rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5948:2: rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012017);
            rule__NumVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012020);
            rule__NumVariable__Group_2__1();

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
    // $ANTLR end "rule__NumVariable__Group_2__0"


    // $ANTLR start "rule__NumVariable__Group_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5955:1: rule__NumVariable__Group_2__0__Impl : ( '=' ) ;
    public final void rule__NumVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5959:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5960:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5960:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5961:1: '='
            {
             before(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__NumVariable__Group_2__0__Impl12048); 
             after(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__NumVariable__Group_2__0__Impl"


    // $ANTLR start "rule__NumVariable__Group_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5974:1: rule__NumVariable__Group_2__1 : rule__NumVariable__Group_2__1__Impl ;
    public final void rule__NumVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5978:1: ( rule__NumVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5979:2: rule__NumVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112079);
            rule__NumVariable__Group_2__1__Impl();

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
    // $ANTLR end "rule__NumVariable__Group_2__1"


    // $ANTLR start "rule__NumVariable__Group_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5985:1: rule__NumVariable__Group_2__1__Impl : ( ( rule__NumVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__NumVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5989:1: ( ( ( rule__NumVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5990:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5990:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5991:1: ( rule__NumVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNumVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5992:1: ( rule__NumVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5992:2: rule__NumVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12106);
            rule__NumVariable__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNumVariableAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__NumVariable__Group_2__1__Impl"


    // $ANTLR start "rule__BoolVariable__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6006:1: rule__BoolVariable__Group__0 : rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 ;
    public final void rule__BoolVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6010:1: ( rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6011:2: rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012140);
            rule__BoolVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012143);
            rule__BoolVariable__Group__1();

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
    // $ANTLR end "rule__BoolVariable__Group__0"


    // $ANTLR start "rule__BoolVariable__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6018:1: rule__BoolVariable__Group__0__Impl : ( 'varBool' ) ;
    public final void rule__BoolVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6022:1: ( ( 'varBool' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6023:1: ( 'varBool' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6023:1: ( 'varBool' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6024:1: 'varBool'
            {
             before(grammarAccess.getBoolVariableAccess().getVarBoolKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__BoolVariable__Group__0__Impl12171); 
             after(grammarAccess.getBoolVariableAccess().getVarBoolKeyword_0()); 

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
    // $ANTLR end "rule__BoolVariable__Group__0__Impl"


    // $ANTLR start "rule__BoolVariable__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6037:1: rule__BoolVariable__Group__1 : rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 ;
    public final void rule__BoolVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6041:1: ( rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6042:2: rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112202);
            rule__BoolVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112205);
            rule__BoolVariable__Group__2();

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
    // $ANTLR end "rule__BoolVariable__Group__1"


    // $ANTLR start "rule__BoolVariable__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6049:1: rule__BoolVariable__Group__1__Impl : ( ( rule__BoolVariable__NameAssignment_1 ) ) ;
    public final void rule__BoolVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6053:1: ( ( ( rule__BoolVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6054:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6054:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6055:1: ( rule__BoolVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6056:1: ( rule__BoolVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6056:2: rule__BoolVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12232);
            rule__BoolVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BoolVariable__Group__1__Impl"


    // $ANTLR start "rule__BoolVariable__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6066:1: rule__BoolVariable__Group__2 : rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 ;
    public final void rule__BoolVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6070:1: ( rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6071:2: rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212262);
            rule__BoolVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212265);
            rule__BoolVariable__Group__3();

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
    // $ANTLR end "rule__BoolVariable__Group__2"


    // $ANTLR start "rule__BoolVariable__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6078:1: rule__BoolVariable__Group__2__Impl : ( ( rule__BoolVariable__Group_2__0 )? ) ;
    public final void rule__BoolVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6082:1: ( ( ( rule__BoolVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6083:1: ( ( rule__BoolVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6083:1: ( ( rule__BoolVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6084:1: ( rule__BoolVariable__Group_2__0 )?
            {
             before(grammarAccess.getBoolVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6085:1: ( rule__BoolVariable__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6085:2: rule__BoolVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12292);
                    rule__BoolVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BoolVariable__Group__2__Impl"


    // $ANTLR start "rule__BoolVariable__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6095:1: rule__BoolVariable__Group__3 : rule__BoolVariable__Group__3__Impl ;
    public final void rule__BoolVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6099:1: ( rule__BoolVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6100:2: rule__BoolVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312323);
            rule__BoolVariable__Group__3__Impl();

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
    // $ANTLR end "rule__BoolVariable__Group__3"


    // $ANTLR start "rule__BoolVariable__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6106:1: rule__BoolVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__BoolVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6110:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6111:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6111:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6112:1: ';'
            {
             before(grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__BoolVariable__Group__3__Impl12351); 
             after(grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__BoolVariable__Group__3__Impl"


    // $ANTLR start "rule__BoolVariable__Group_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6133:1: rule__BoolVariable__Group_2__0 : rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 ;
    public final void rule__BoolVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6137:1: ( rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6138:2: rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012390);
            rule__BoolVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012393);
            rule__BoolVariable__Group_2__1();

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
    // $ANTLR end "rule__BoolVariable__Group_2__0"


    // $ANTLR start "rule__BoolVariable__Group_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6145:1: rule__BoolVariable__Group_2__0__Impl : ( '=' ) ;
    public final void rule__BoolVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6149:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6150:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6150:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6151:1: '='
            {
             before(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__BoolVariable__Group_2__0__Impl12421); 
             after(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__BoolVariable__Group_2__0__Impl"


    // $ANTLR start "rule__BoolVariable__Group_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6164:1: rule__BoolVariable__Group_2__1 : rule__BoolVariable__Group_2__1__Impl ;
    public final void rule__BoolVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6168:1: ( rule__BoolVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6169:2: rule__BoolVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112452);
            rule__BoolVariable__Group_2__1__Impl();

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
    // $ANTLR end "rule__BoolVariable__Group_2__1"


    // $ANTLR start "rule__BoolVariable__Group_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6175:1: rule__BoolVariable__Group_2__1__Impl : ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__BoolVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6179:1: ( ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6180:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6180:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6181:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6182:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6182:2: rule__BoolVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12479);
            rule__BoolVariable__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__BoolVariable__Group_2__1__Impl"


    // $ANTLR start "rule__Assigment__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6196:1: rule__Assigment__Group__0 : rule__Assigment__Group__0__Impl rule__Assigment__Group__1 ;
    public final void rule__Assigment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6200:1: ( rule__Assigment__Group__0__Impl rule__Assigment__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6201:2: rule__Assigment__Group__0__Impl rule__Assigment__Group__1
            {
            pushFollow(FOLLOW_rule__Assigment__Group__0__Impl_in_rule__Assigment__Group__012513);
            rule__Assigment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigment__Group__1_in_rule__Assigment__Group__012516);
            rule__Assigment__Group__1();

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
    // $ANTLR end "rule__Assigment__Group__0"


    // $ANTLR start "rule__Assigment__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6208:1: rule__Assigment__Group__0__Impl : ( ( rule__Assigment__VaAssignment_0 ) ) ;
    public final void rule__Assigment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6212:1: ( ( ( rule__Assigment__VaAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6213:1: ( ( rule__Assigment__VaAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6213:1: ( ( rule__Assigment__VaAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6214:1: ( rule__Assigment__VaAssignment_0 )
            {
             before(grammarAccess.getAssigmentAccess().getVaAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6215:1: ( rule__Assigment__VaAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6215:2: rule__Assigment__VaAssignment_0
            {
            pushFollow(FOLLOW_rule__Assigment__VaAssignment_0_in_rule__Assigment__Group__0__Impl12543);
            rule__Assigment__VaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssigmentAccess().getVaAssignment_0()); 

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
    // $ANTLR end "rule__Assigment__Group__0__Impl"


    // $ANTLR start "rule__Assigment__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6225:1: rule__Assigment__Group__1 : rule__Assigment__Group__1__Impl rule__Assigment__Group__2 ;
    public final void rule__Assigment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6229:1: ( rule__Assigment__Group__1__Impl rule__Assigment__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6230:2: rule__Assigment__Group__1__Impl rule__Assigment__Group__2
            {
            pushFollow(FOLLOW_rule__Assigment__Group__1__Impl_in_rule__Assigment__Group__112573);
            rule__Assigment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigment__Group__2_in_rule__Assigment__Group__112576);
            rule__Assigment__Group__2();

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
    // $ANTLR end "rule__Assigment__Group__1"


    // $ANTLR start "rule__Assigment__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6237:1: rule__Assigment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assigment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6241:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6242:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6242:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6243:1: '='
            {
             before(grammarAccess.getAssigmentAccess().getEqualsSignKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__Assigment__Group__1__Impl12604); 
             after(grammarAccess.getAssigmentAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Assigment__Group__1__Impl"


    // $ANTLR start "rule__Assigment__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6256:1: rule__Assigment__Group__2 : rule__Assigment__Group__2__Impl rule__Assigment__Group__3 ;
    public final void rule__Assigment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6260:1: ( rule__Assigment__Group__2__Impl rule__Assigment__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6261:2: rule__Assigment__Group__2__Impl rule__Assigment__Group__3
            {
            pushFollow(FOLLOW_rule__Assigment__Group__2__Impl_in_rule__Assigment__Group__212635);
            rule__Assigment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigment__Group__3_in_rule__Assigment__Group__212638);
            rule__Assigment__Group__3();

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
    // $ANTLR end "rule__Assigment__Group__2"


    // $ANTLR start "rule__Assigment__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6268:1: rule__Assigment__Group__2__Impl : ( ( rule__Assigment__RightAssignment_2 ) ) ;
    public final void rule__Assigment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6272:1: ( ( ( rule__Assigment__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6273:1: ( ( rule__Assigment__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6273:1: ( ( rule__Assigment__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6274:1: ( rule__Assigment__RightAssignment_2 )
            {
             before(grammarAccess.getAssigmentAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6275:1: ( rule__Assigment__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6275:2: rule__Assigment__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Assigment__RightAssignment_2_in_rule__Assigment__Group__2__Impl12665);
            rule__Assigment__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssigmentAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Assigment__Group__2__Impl"


    // $ANTLR start "rule__Assigment__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6285:1: rule__Assigment__Group__3 : rule__Assigment__Group__3__Impl ;
    public final void rule__Assigment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6289:1: ( rule__Assigment__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6290:2: rule__Assigment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assigment__Group__3__Impl_in_rule__Assigment__Group__312695);
            rule__Assigment__Group__3__Impl();

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
    // $ANTLR end "rule__Assigment__Group__3"


    // $ANTLR start "rule__Assigment__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6296:1: rule__Assigment__Group__3__Impl : ( ';' ) ;
    public final void rule__Assigment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6300:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6301:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6301:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6302:1: ';'
            {
             before(grammarAccess.getAssigmentAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Assigment__Group__3__Impl12723); 
             after(grammarAccess.getAssigmentAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Assigment__Group__3__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6323:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6327:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6328:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__012762);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__012765);
            rule__BoolLiteral__Group__1();

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
    // $ANTLR end "rule__BoolLiteral__Group__0"


    // $ANTLR start "rule__BoolLiteral__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6335:1: rule__BoolLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6339:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6340:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6340:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6341:1: ()
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6342:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6344:1: 
            {
            }

             after(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolLiteral__Group__0__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6354:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6358:1: ( rule__BoolLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6359:2: rule__BoolLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__112823);
            rule__BoolLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__BoolLiteral__Group__1"


    // $ANTLR start "rule__BoolLiteral__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6365:1: rule__BoolLiteral__Group__1__Impl : ( ( rule__BoolLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6369:1: ( ( ( rule__BoolLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6370:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6370:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6371:1: ( rule__BoolLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6372:1: ( rule__BoolLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6372:2: rule__BoolLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl12850);
            rule__BoolLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__BoolLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumLiteral__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6386:1: rule__NumLiteral__Group__0 : rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 ;
    public final void rule__NumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6390:1: ( rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6391:2: rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__012884);
            rule__NumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__012887);
            rule__NumLiteral__Group__1();

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
    // $ANTLR end "rule__NumLiteral__Group__0"


    // $ANTLR start "rule__NumLiteral__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6398:1: rule__NumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6402:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6403:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6403:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6404:1: ()
            {
             before(grammarAccess.getNumLiteralAccess().getNumLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6405:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6407:1: 
            {
            }

             after(grammarAccess.getNumLiteralAccess().getNumLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumLiteral__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6417:1: rule__NumLiteral__Group__1 : rule__NumLiteral__Group__1__Impl ;
    public final void rule__NumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6421:1: ( rule__NumLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6422:2: rule__NumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__112945);
            rule__NumLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__NumLiteral__Group__1"


    // $ANTLR start "rule__NumLiteral__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6428:1: rule__NumLiteral__Group__1__Impl : ( ( rule__NumLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6432:1: ( ( ( rule__NumLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6433:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6433:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6434:1: ( rule__NumLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6435:1: ( rule__NumLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6435:2: rule__NumLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl12972);
            rule__NumLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NumLiteral__Group__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6449:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6453:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6454:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013006);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013009);
            rule__StringLiteral__Group__1();

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
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6461:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6465:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6466:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6466:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6467:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6468:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6470:1: 
            {
            }

             after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6480:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6484:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6485:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113067);
            rule__StringLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6491:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6495:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6496:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6496:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6497:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6498:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6498:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13094);
            rule__StringLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__State__UnorderedGroup"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6513:1: rule__State__UnorderedGroup : rule__State__UnorderedGroup__0 {...}?;
    public final void rule__State__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup());
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6518:1: ( rule__State__UnorderedGroup__0 {...}?)
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6519:2: rule__State__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup13129);
            rule__State__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStateAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__State__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getStateAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__UnorderedGroup"


    // $ANTLR start "rule__State__UnorderedGroup__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6530:1: rule__State__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) ;
    public final void rule__State__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6535:1: ( ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6536:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6536:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                alt31=1;
            }
            else if ( (LA31_0==26||LA31_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6538:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6538:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6539:5: {...}? => ( ( ( rule__State__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6539:100: ( ( ( rule__State__Group_0__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6540:6: ( ( rule__State__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6546:6: ( ( rule__State__Group_0__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6548:7: ( rule__State__Group_0__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6549:7: ( rule__State__Group_0__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6549:8: rule__State__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl13218);
                    rule__State__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6555:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6555:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6556:5: {...}? => ( ( ( rule__State__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6556:100: ( ( ( rule__State__Group_1__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6557:6: ( ( rule__State__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6563:6: ( ( rule__State__Group_1__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6565:7: ( rule__State__Group_1__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6566:7: ( rule__State__Group_1__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6566:8: rule__State__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl13309);
                    rule__State__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__UnorderedGroup__Impl"


    // $ANTLR start "rule__State__UnorderedGroup__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6581:1: rule__State__UnorderedGroup__0 : rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? ;
    public final void rule__State__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6585:1: ( rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6586:2: rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__013368);
            rule__State__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6587:2: ( rule__State__UnorderedGroup__1 )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA32_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        alt32=1;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA32_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt32=1;
                    }
                    }
                    break;
                case 26:
                    {
                    int LA32_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt32=1;
                    }
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6587:2: rule__State__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__013371);
                    rule__State__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__State__UnorderedGroup__0"


    // $ANTLR start "rule__State__UnorderedGroup__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6594:1: rule__State__UnorderedGroup__1 : rule__State__UnorderedGroup__Impl ;
    public final void rule__State__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6598:1: ( rule__State__UnorderedGroup__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6599:2: rule__State__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__113396);
            rule__State__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__State__UnorderedGroup__1"


    // $ANTLR start "rule__Document__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6610:1: rule__Document__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6614:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6615:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6615:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6616:1: RULE_ID
            {
             before(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113428); 
             after(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Document__NameAssignment_1"


    // $ANTLR start "rule__Document__StatesAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6625:1: rule__Document__StatesAssignment_2 : ( ( 'withStates' ) ) ;
    public final void rule__Document__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6629:1: ( ( ( 'withStates' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6630:1: ( ( 'withStates' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6630:1: ( ( 'withStates' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6631:1: ( 'withStates' )
            {
             before(grammarAccess.getDocumentAccess().getStatesWithStatesKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6632:1: ( 'withStates' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6633:1: 'withStates'
            {
             before(grammarAccess.getDocumentAccess().getStatesWithStatesKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__Document__StatesAssignment_213464); 
             after(grammarAccess.getDocumentAccess().getStatesWithStatesKeyword_2_0()); 

            }

             after(grammarAccess.getDocumentAccess().getStatesWithStatesKeyword_2_0()); 

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
    // $ANTLR end "rule__Document__StatesAssignment_2"


    // $ANTLR start "rule__Document__ElementsAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6648:1: rule__Document__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Document__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6652:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6653:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6653:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6654:1: ruleAbstractElement
            {
             before(grammarAccess.getDocumentAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Document__ElementsAssignment_313503);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Document__ElementsAssignment_3"


    // $ANTLR start "rule__Document__StaAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6663:1: rule__Document__StaAssignment_4 : ( ruleState ) ;
    public final void rule__Document__StaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6667:1: ( ( ruleState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6668:1: ( ruleState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6668:1: ( ruleState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6669:1: ruleState
            {
             before(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Document__StaAssignment_413534);
            ruleState();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Document__StaAssignment_4"


    // $ANTLR start "rule__Statement__ComAssignment_5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6678:1: rule__Statement__ComAssignment_5 : ( RULE_ML_COMMENT ) ;
    public final void rule__Statement__ComAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6682:1: ( ( RULE_ML_COMMENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6683:1: ( RULE_ML_COMMENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6683:1: ( RULE_ML_COMMENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6684:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_5_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_513565); 
             after(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Statement__ComAssignment_5"


    // $ANTLR start "rule__State__NameAssignment_0_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6693:1: rule__State__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6697:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6698:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6698:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6699:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_113596); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_0_1"


    // $ANTLR start "rule__State__TimesAssignment_0_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6708:1: rule__State__TimesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__State__TimesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6712:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6713:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6713:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6714:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_113627); 
             after(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_0_2_1_0()); 

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
    // $ANTLR end "rule__State__TimesAssignment_0_2_1"


    // $ANTLR start "rule__State__TimeoutAssignment_1_0_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6723:1: rule__State__TimeoutAssignment_1_0_1 : ( RULE_INT ) ;
    public final void rule__State__TimeoutAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6727:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6728:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6728:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6729:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimeoutINTTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_113658); 
             after(grammarAccess.getStateAccess().getTimeoutINTTerminalRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__State__TimeoutAssignment_1_0_1"


    // $ANTLR start "rule__State__StmsAssignment_1_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6738:1: rule__State__StmsAssignment_1_2 : ( ruleStateAbstractElement ) ;
    public final void rule__State__StmsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6742:1: ( ( ruleStateAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6743:1: ( ruleStateAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6743:1: ( ruleStateAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6744:1: ruleStateAbstractElement
            {
             before(grammarAccess.getStateAccess().getStmsStateAbstractElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleStateAbstractElement_in_rule__State__StmsAssignment_1_213689);
            ruleStateAbstractElement();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStmsStateAbstractElementParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__State__StmsAssignment_1_2"


    // $ANTLR start "rule__Dial__ToAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6753:1: rule__Dial__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Dial__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6757:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6758:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6758:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6759:1: ruleConcatenationExpression
            {
             before(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_113720);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dial__ToAssignment_1"


    // $ANTLR start "rule__Play__FileAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6768:1: rule__Play__FileAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Play__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6772:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6773:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6773:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6774:1: ruleConcatenationExpression
            {
             before(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_113751);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Play__FileAssignment_1"


    // $ANTLR start "rule__Record__TimeAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6783:1: rule__Record__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Record__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6787:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6788:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6788:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6789:1: RULE_INT
            {
             before(grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_113782); 
             after(grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Record__TimeAssignment_1"


    // $ANTLR start "rule__Record__ActionAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6798:1: rule__Record__ActionAssignment_4 : ( ruleConcatenationExpression ) ;
    public final void rule__Record__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6802:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6803:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6803:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6804:1: ruleConcatenationExpression
            {
             before(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Record__ActionAssignment_413813);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Record__ActionAssignment_4"


    // $ANTLR start "rule__Record__NameAssignment_5_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6813:1: rule__Record__NameAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Record__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6817:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6818:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6818:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6819:1: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Record__NameAssignment_5_113844); 
             after(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Record__NameAssignment_5_1"


    // $ANTLR start "rule__Reject__NameAssignment"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6828:1: rule__Reject__NameAssignment : ( ( 'reject;' ) ) ;
    public final void rule__Reject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6832:1: ( ( ( 'reject;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6833:1: ( ( 'reject;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6833:1: ( ( 'reject;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6834:1: ( 'reject;' )
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6835:1: ( 'reject;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6836:1: 'reject;'
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Reject__NameAssignment13880); 
             after(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 

            }

             after(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 

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
    // $ANTLR end "rule__Reject__NameAssignment"


    // $ANTLR start "rule__Hangup__NameAssignment"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6851:1: rule__Hangup__NameAssignment : ( ( 'hangUp;' ) ) ;
    public final void rule__Hangup__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6855:1: ( ( ( 'hangUp;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6856:1: ( ( 'hangUp;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6856:1: ( ( 'hangUp;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6857:1: ( 'hangUp;' )
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6858:1: ( 'hangUp;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6859:1: 'hangUp;'
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__Hangup__NameAssignment13924); 
             after(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 

            }

             after(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 

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
    // $ANTLR end "rule__Hangup__NameAssignment"


    // $ANTLR start "rule__GetDigits__NumDigitsAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6874:1: rule__GetDigits__NumDigitsAssignment_1 : ( RULE_INT ) ;
    public final void rule__GetDigits__NumDigitsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6878:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6879:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6879:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6880:1: RULE_INT
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_113963); 
             after(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GetDigits__NumDigitsAssignment_1"


    // $ANTLR start "rule__GetDigits__QuestionAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6889:1: rule__GetDigits__QuestionAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__GetDigits__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6893:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6894:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6894:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6895:1: ruleConcatenationExpression
            {
             before(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__GetDigits__QuestionAssignment_313994);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GetDigits__QuestionAssignment_3"


    // $ANTLR start "rule__GetDigits__NameAssignment_5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6904:1: rule__GetDigits__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__GetDigits__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6908:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6909:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6909:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6910:1: RULE_ID
            {
             before(grammarAccess.getGetDigitsAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetDigits__NameAssignment_514025); 
             after(grammarAccess.getGetDigitsAccess().getNameIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__GetDigits__NameAssignment_5"


    // $ANTLR start "rule__Ask__QuestionAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6919:1: rule__Ask__QuestionAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Ask__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6923:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6924:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6924:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6925:1: ruleConcatenationExpression
            {
             before(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_114056);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ask__QuestionAssignment_1"


    // $ANTLR start "rule__Ask__ChoicesAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6934:1: rule__Ask__ChoicesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Ask__ChoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6938:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6939:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6939:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6940:1: RULE_STRING
            {
             before(grammarAccess.getAskAccess().getChoicesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ask__ChoicesAssignment_314087); 
             after(grammarAccess.getAskAccess().getChoicesSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Ask__ChoicesAssignment_3"


    // $ANTLR start "rule__Ask__NameAssignment_5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6949:1: rule__Ask__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Ask__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6953:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6954:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6954:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6955:1: RULE_ID
            {
             before(grammarAccess.getAskAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ask__NameAssignment_514118); 
             after(grammarAccess.getAskAccess().getNameIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Ask__NameAssignment_5"


    // $ANTLR start "rule__Send__ParamsAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6964:1: rule__Send__ParamsAssignment_1 : ( ruleSendBlock ) ;
    public final void rule__Send__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6968:1: ( ( ruleSendBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6969:1: ( ruleSendBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6969:1: ( ruleSendBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6970:1: ruleSendBlock
            {
             before(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114149);
            ruleSendBlock();

            state._fsp--;

             after(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Send__ParamsAssignment_1"


    // $ANTLR start "rule__Send__UrlAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6979:1: rule__Send__UrlAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Send__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6983:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6984:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6984:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6985:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314180);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Send__UrlAssignment_3"


    // $ANTLR start "rule__SendBlock__ValueAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6994:1: rule__SendBlock__ValueAssignment_2 : ( ruleParam ) ;
    public final void rule__SendBlock__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6998:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6999:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6999:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7000:1: ruleParam
            {
             before(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214211);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SendBlock__ValueAssignment_2"


    // $ANTLR start "rule__SendBlock__StmsAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7009:1: rule__SendBlock__StmsAssignment_3 : ( ruleNotPrimaryParam ) ;
    public final void rule__SendBlock__StmsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7013:1: ( ( ruleNotPrimaryParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7014:1: ( ruleNotPrimaryParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7014:1: ( ruleNotPrimaryParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7015:1: ruleNotPrimaryParam
            {
             before(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314242);
            ruleNotPrimaryParam();

            state._fsp--;

             after(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SendBlock__StmsAssignment_3"


    // $ANTLR start "rule__NotPrimaryParam__ValueAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7024:1: rule__NotPrimaryParam__ValueAssignment_1 : ( ruleParam ) ;
    public final void rule__NotPrimaryParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7028:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7029:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7029:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7030:1: ruleParam
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114273);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NotPrimaryParam__ValueAssignment_1"


    // $ANTLR start "rule__Param__ParamNameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7039:1: rule__Param__ParamNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Param__ParamNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7043:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7044:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7044:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7045:1: RULE_STRING
            {
             before(grammarAccess.getParamAccess().getParamNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Param__ParamNameAssignment_014304); 
             after(grammarAccess.getParamAccess().getParamNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__ParamNameAssignment_0"


    // $ANTLR start "rule__Param__ValueAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7054:1: rule__Param__ValueAssignment_2 : ( ruleConcatenationExpression ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7058:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7059:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7059:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7060:1: ruleConcatenationExpression
            {
             before(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214335);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Param__ValueAssignment_2"


    // $ANTLR start "rule__Say__ThatAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7069:1: rule__Say__ThatAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Say__ThatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7073:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7074:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7074:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7075:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114366);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Say__ThatAssignment_1"


    // $ANTLR start "rule__Transition__TargetAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7084:1: rule__Transition__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7088:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7089:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7089:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7090:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7091:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7092:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_114401); 
             after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 

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
    // $ANTLR end "rule__Transition__TargetAssignment_1"


    // $ANTLR start "rule__Transition__EventAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7103:1: rule__Transition__EventAssignment_3 : ( RULE_EVENTENUM ) ;
    public final void rule__Transition__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7107:1: ( ( RULE_EVENTENUM ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7108:1: ( RULE_EVENTENUM )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7108:1: ( RULE_EVENTENUM )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7109:1: RULE_EVENTENUM
            {
             before(grammarAccess.getTransitionAccess().getEventEventEnumTerminalRuleCall_3_0()); 
            match(input,RULE_EVENTENUM,FOLLOW_RULE_EVENTENUM_in_rule__Transition__EventAssignment_314436); 
             after(grammarAccess.getTransitionAccess().getEventEventEnumTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Transition__EventAssignment_3"


    // $ANTLR start "rule__IfExp__BlockAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7118:1: rule__IfExp__BlockAssignment_0 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7122:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7124:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_014467);
            ruleCondBlock();

            state._fsp--;

             after(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__IfExp__BlockAssignment_0"


    // $ANTLR start "rule__IfExp__BlocksAssignment_1_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7133:1: rule__IfExp__BlocksAssignment_1_1 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlocksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7137:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7138:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7138:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7139:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_114498);
            ruleCondBlock();

            state._fsp--;

             after(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__IfExp__BlocksAssignment_1_1"


    // $ANTLR start "rule__IfExp__DefaultBlockAssignment_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7148:1: rule__IfExp__DefaultBlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__IfExp__DefaultBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7152:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7153:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7153:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7154:1: ruleBlock
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_114529);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__IfExp__DefaultBlockAssignment_2_1"


    // $ANTLR start "rule__Block__StmsAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7163:1: rule__Block__StmsAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Block__StmsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7167:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7168:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7168:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7169:1: ruleAbstractElement
            {
             before(grammarAccess.getBlockAccess().getStmsAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Block__StmsAssignment_214560);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStmsAbstractElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Block__StmsAssignment_2"


    // $ANTLR start "rule__CondBlock__CondAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7178:1: rule__CondBlock__CondAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__CondBlock__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7182:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7183:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7183:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7184:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_114591);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CondBlock__CondAssignment_1"


    // $ANTLR start "rule__CondBlock__ActionAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7193:1: rule__CondBlock__ActionAssignment_2 : ( ruleBlock ) ;
    public final void rule__CondBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7197:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7198:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7198:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7199:1: ruleBlock
            {
             before(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_214622);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CondBlock__ActionAssignment_2"


    // $ANTLR start "rule__IfStateExp__BlockAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7208:1: rule__IfStateExp__BlockAssignment_0 : ( ruleCondStateBlock ) ;
    public final void rule__IfStateExp__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7212:1: ( ( ruleCondStateBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7213:1: ( ruleCondStateBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7213:1: ( ruleCondStateBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7214:1: ruleCondStateBlock
            {
             before(grammarAccess.getIfStateExpAccess().getBlockCondStateBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondStateBlock_in_rule__IfStateExp__BlockAssignment_014653);
            ruleCondStateBlock();

            state._fsp--;

             after(grammarAccess.getIfStateExpAccess().getBlockCondStateBlockParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__IfStateExp__BlockAssignment_0"


    // $ANTLR start "rule__IfStateExp__BlocksAssignment_1_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7223:1: rule__IfStateExp__BlocksAssignment_1_1 : ( ruleCondStateBlock ) ;
    public final void rule__IfStateExp__BlocksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7227:1: ( ( ruleCondStateBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7228:1: ( ruleCondStateBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7228:1: ( ruleCondStateBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7229:1: ruleCondStateBlock
            {
             before(grammarAccess.getIfStateExpAccess().getBlocksCondStateBlockParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondStateBlock_in_rule__IfStateExp__BlocksAssignment_1_114684);
            ruleCondStateBlock();

            state._fsp--;

             after(grammarAccess.getIfStateExpAccess().getBlocksCondStateBlockParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__IfStateExp__BlocksAssignment_1_1"


    // $ANTLR start "rule__IfStateExp__DefaultBlockAssignment_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7238:1: rule__IfStateExp__DefaultBlockAssignment_2_1 : ( ruleBlockState ) ;
    public final void rule__IfStateExp__DefaultBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7242:1: ( ( ruleBlockState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7243:1: ( ruleBlockState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7243:1: ( ruleBlockState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7244:1: ruleBlockState
            {
             before(grammarAccess.getIfStateExpAccess().getDefaultBlockBlockStateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBlockState_in_rule__IfStateExp__DefaultBlockAssignment_2_114715);
            ruleBlockState();

            state._fsp--;

             after(grammarAccess.getIfStateExpAccess().getDefaultBlockBlockStateParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__IfStateExp__DefaultBlockAssignment_2_1"


    // $ANTLR start "rule__CondStateBlock__CondAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7253:1: rule__CondStateBlock__CondAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__CondStateBlock__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7257:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7258:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7258:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7259:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getCondStateBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__CondStateBlock__CondAssignment_114746);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getCondStateBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CondStateBlock__CondAssignment_1"


    // $ANTLR start "rule__CondStateBlock__ActionAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7268:1: rule__CondStateBlock__ActionAssignment_2 : ( ruleBlockState ) ;
    public final void rule__CondStateBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7272:1: ( ( ruleBlockState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7273:1: ( ruleBlockState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7273:1: ( ruleBlockState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7274:1: ruleBlockState
            {
             before(grammarAccess.getCondStateBlockAccess().getActionBlockStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlockState_in_rule__CondStateBlock__ActionAssignment_214777);
            ruleBlockState();

            state._fsp--;

             after(grammarAccess.getCondStateBlockAccess().getActionBlockStateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CondStateBlock__ActionAssignment_2"


    // $ANTLR start "rule__BlockState__StaAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7283:1: rule__BlockState__StaAssignment_2 : ( ruleStateAbstractElement ) ;
    public final void rule__BlockState__StaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7287:1: ( ( ruleStateAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7288:1: ( ruleStateAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7288:1: ( ruleStateAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7289:1: ruleStateAbstractElement
            {
             before(grammarAccess.getBlockStateAccess().getStaStateAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateAbstractElement_in_rule__BlockState__StaAssignment_214808);
            ruleStateAbstractElement();

            state._fsp--;

             after(grammarAccess.getBlockStateAccess().getStaStateAbstractElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BlockState__StaAssignment_2"


    // $ANTLR start "rule__BoolExpression__OpAssignment_1_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7298:1: rule__BoolExpression__OpAssignment_1_1 : ( RULE_LOGIC_WORD ) ;
    public final void rule__BoolExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7302:1: ( ( RULE_LOGIC_WORD ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7303:1: ( RULE_LOGIC_WORD )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7303:1: ( RULE_LOGIC_WORD )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7304:1: RULE_LOGIC_WORD
            {
             before(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 
            match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_114839); 
             after(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BoolExpression__OpAssignment_1_1"


    // $ANTLR start "rule__BoolExpression__RightAssignment_1_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7313:1: rule__BoolExpression__RightAssignment_1_2 : ( ruleBoolExpression ) ;
    public final void rule__BoolExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7317:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7318:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7318:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7319:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_214870);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__BoolExpression__RightAssignment_1_2"


    // $ANTLR start "rule__Brackets__OpenAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7328:1: rule__Brackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__Brackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7332:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7333:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7333:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7334:1: RULE_OBRACKET
            {
             before(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_014901); 
             after(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Brackets__OpenAssignment_0"


    // $ANTLR start "rule__Brackets__ObjAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7343:1: rule__Brackets__ObjAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__Brackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7347:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7348:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7348:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7349:1: ruleBoolExpression
            {
             before(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_114932);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Brackets__ObjAssignment_1"


    // $ANTLR start "rule__Brackets__CloseAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7358:1: rule__Brackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__Brackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7362:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7363:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7363:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7364:1: RULE_CBRACKET
            {
             before(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_214963); 
             after(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Brackets__CloseAssignment_2"


    // $ANTLR start "rule__CompareExpression__LeftAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7373:1: rule__CompareExpression__LeftAssignment_0 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7377:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7378:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7378:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7379:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_014994);
            ruleLiteralAbs();

            state._fsp--;

             after(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CompareExpression__LeftAssignment_0"


    // $ANTLR start "rule__CompareExpression__OpAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7388:1: rule__CompareExpression__OpAssignment_1 : ( RULE_COMPARE ) ;
    public final void rule__CompareExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7392:1: ( ( RULE_COMPARE ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7393:1: ( RULE_COMPARE )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7393:1: ( RULE_COMPARE )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7394:1: RULE_COMPARE
            {
             before(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 
            match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115025); 
             after(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompareExpression__OpAssignment_1"


    // $ANTLR start "rule__CompareExpression__RightAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7403:1: rule__CompareExpression__RightAssignment_2 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7407:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7408:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7408:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7409:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215056);
            ruleLiteralAbs();

            state._fsp--;

             after(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompareExpression__RightAssignment_2"


    // $ANTLR start "rule__NegExpression__OpAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7418:1: rule__NegExpression__OpAssignment_0 : ( RULE_NEGATION ) ;
    public final void rule__NegExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7422:1: ( ( RULE_NEGATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7423:1: ( RULE_NEGATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7423:1: ( RULE_NEGATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7424:1: RULE_NEGATION
            {
             before(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 
            match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015087); 
             after(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NegExpression__OpAssignment_0"


    // $ANTLR start "rule__NegExpression__ObjAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7433:1: rule__NegExpression__ObjAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__NegExpression__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7437:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7438:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7438:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7439:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115118);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NegExpression__ObjAssignment_1"


    // $ANTLR start "rule__MathExpression__OpAssignment_1_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7448:1: rule__MathExpression__OpAssignment_1_1 : ( RULE_MATH ) ;
    public final void rule__MathExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7452:1: ( ( RULE_MATH ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7453:1: ( RULE_MATH )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7453:1: ( RULE_MATH )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7454:1: RULE_MATH
            {
             before(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 
            match(input,RULE_MATH,FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115149); 
             after(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MathExpression__OpAssignment_1_1"


    // $ANTLR start "rule__MathExpression__RightAssignment_1_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7463:1: rule__MathExpression__RightAssignment_1_2 : ( ruleMathExpression ) ;
    public final void rule__MathExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7467:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7468:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7468:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7469:1: ruleMathExpression
            {
             before(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215180);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MathExpression__RightAssignment_1_2"


    // $ANTLR start "rule__MathBrackets__OpenAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7478:1: rule__MathBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__MathBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7482:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7483:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7483:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7484:1: RULE_OBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015211); 
             after(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__MathBrackets__OpenAssignment_0"


    // $ANTLR start "rule__MathBrackets__ObjAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7493:1: rule__MathBrackets__ObjAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__MathBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7497:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7498:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7498:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7499:1: ruleMathExpression
            {
             before(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115242);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MathBrackets__ObjAssignment_1"


    // $ANTLR start "rule__MathBrackets__CloseAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7508:1: rule__MathBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__MathBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7512:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7513:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7513:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7514:1: RULE_CBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215273); 
             after(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MathBrackets__CloseAssignment_2"


    // $ANTLR start "rule__ConcatenationExpression__OpAssignment_1_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7523:1: rule__ConcatenationExpression__OpAssignment_1_1 : ( RULE_CONCATENATION ) ;
    public final void rule__ConcatenationExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7527:1: ( ( RULE_CONCATENATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7528:1: ( RULE_CONCATENATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7528:1: ( RULE_CONCATENATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7529:1: RULE_CONCATENATION
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0()); 
            match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_115304); 
             after(grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ConcatenationExpression__OpAssignment_1_1"


    // $ANTLR start "rule__ConcatenationExpression__RightAssignment_1_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7538:1: rule__ConcatenationExpression__RightAssignment_1_2 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7542:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7543:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7543:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7544:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215335);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ConcatenationExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ConcatenationBrackets__OpenAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7553:1: rule__ConcatenationBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__ConcatenationBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7557:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7558:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7558:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7559:1: RULE_OBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015366); 
             after(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConcatenationBrackets__OpenAssignment_0"


    // $ANTLR start "rule__ConcatenationBrackets__ObjAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7568:1: rule__ConcatenationBrackets__ObjAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7572:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7573:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7573:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7574:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_115397);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConcatenationBrackets__ObjAssignment_1"


    // $ANTLR start "rule__ConcatenationBrackets__CloseAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7583:1: rule__ConcatenationBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__ConcatenationBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7587:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7588:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7588:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7589:1: RULE_CBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_215428); 
             after(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConcatenationBrackets__CloseAssignment_2"


    // $ANTLR start "rule__StringVariable__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7598:1: rule__StringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7602:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7603:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7603:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7604:1: RULE_ID
            {
             before(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_115459); 
             after(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringVariable__NameAssignment_1"


    // $ANTLR start "rule__StringVariable__ValueAssignment_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7613:1: rule__StringVariable__ValueAssignment_2_1 : ( ruleConcatenationExpression ) ;
    public final void rule__StringVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7617:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7618:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7618:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7619:1: ruleConcatenationExpression
            {
             before(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_115490);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__StringVariable__ValueAssignment_2_1"


    // $ANTLR start "rule__NumVariable__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7628:1: rule__NumVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7632:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7633:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7633:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7634:1: RULE_ID
            {
             before(grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_115521); 
             after(grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumVariable__NameAssignment_1"


    // $ANTLR start "rule__NumVariable__ValueAssignment_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7643:1: rule__NumVariable__ValueAssignment_2_1 : ( ruleMathExpression ) ;
    public final void rule__NumVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7647:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7648:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7648:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7649:1: ruleMathExpression
            {
             before(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_115552);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__NumVariable__ValueAssignment_2_1"


    // $ANTLR start "rule__BoolVariable__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7658:1: rule__BoolVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BoolVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7662:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7663:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7663:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7664:1: RULE_ID
            {
             before(grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_115583); 
             after(grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BoolVariable__NameAssignment_1"


    // $ANTLR start "rule__BoolVariable__ValueAssignment_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7673:1: rule__BoolVariable__ValueAssignment_2_1 : ( ruleBoolExpression ) ;
    public final void rule__BoolVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7677:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7678:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7678:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7679:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_115614);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__BoolVariable__ValueAssignment_2_1"


    // $ANTLR start "rule__Assigment__VaAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7688:1: rule__Assigment__VaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assigment__VaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7692:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7693:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7693:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7694:1: ( RULE_ID )
            {
             before(grammarAccess.getAssigmentAccess().getVaVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7695:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7696:1: RULE_ID
            {
             before(grammarAccess.getAssigmentAccess().getVaVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assigment__VaAssignment_015649); 
             after(grammarAccess.getAssigmentAccess().getVaVarsIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssigmentAccess().getVaVarsCrossReference_0_0()); 

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
    // $ANTLR end "rule__Assigment__VaAssignment_0"


    // $ANTLR start "rule__Assigment__RightAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7707:1: rule__Assigment__RightAssignment_2 : ( ruleMathExpression ) ;
    public final void rule__Assigment__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7711:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7712:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7712:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7713:1: ruleMathExpression
            {
             before(grammarAccess.getAssigmentAccess().getRightMathExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__Assigment__RightAssignment_215684);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getAssigmentAccess().getRightMathExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assigment__RightAssignment_2"


    // $ANTLR start "rule__Literal__VAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7722:1: rule__Literal__VAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Literal__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7726:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7727:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7727:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7728:1: ( RULE_ID )
            {
             before(grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7729:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7730:1: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getVVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Literal__VAssignment_015719); 
             after(grammarAccess.getLiteralAccess().getVVarsIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 

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
    // $ANTLR end "rule__Literal__VAssignment_0"


    // $ANTLR start "rule__Literal__NulAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7741:1: rule__Literal__NulAssignment_1 : ( RULE_NULL ) ;
    public final void rule__Literal__NulAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7745:1: ( ( RULE_NULL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7746:1: ( RULE_NULL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7746:1: ( RULE_NULL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7747:1: RULE_NULL
            {
             before(grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 
            match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_115754); 
             after(grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Literal__NulAssignment_1"


    // $ANTLR start "rule__Literal__SesAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7756:1: rule__Literal__SesAssignment_2 : ( RULE_SESSION ) ;
    public final void rule__Literal__SesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7760:1: ( ( RULE_SESSION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7761:1: ( RULE_SESSION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7761:1: ( RULE_SESSION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7762:1: RULE_SESSION
            {
             before(grammarAccess.getLiteralAccess().getSesSESSIONTerminalRuleCall_2_0()); 
            match(input,RULE_SESSION,FOLLOW_RULE_SESSION_in_rule__Literal__SesAssignment_215785); 
             after(grammarAccess.getLiteralAccess().getSesSESSIONTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Literal__SesAssignment_2"


    // $ANTLR start "rule__BoolLiteral__ValueAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7771:1: rule__BoolLiteral__ValueAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__BoolLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7775:1: ( ( RULE_BOOL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7776:1: ( RULE_BOOL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7776:1: ( RULE_BOOL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7777:1: RULE_BOOL
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_115816); 
             after(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BoolLiteral__ValueAssignment_1"


    // $ANTLR start "rule__NumLiteral__ValueAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7786:1: rule__NumLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7790:1: ( ( ruleNumber ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7791:1: ( ruleNumber )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7791:1: ( ruleNumber )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7792:1: ruleNumber
            {
             before(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_115847);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumLiteral__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7801:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7805:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7806:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7806:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7807:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_115878); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\10\3\11\5\uffff";
    static final String DFA5_minS =
        "\1\4\4\12\5\uffff";
    static final String DFA5_maxS =
        "\1\23\4\36\5\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\2\1\3\1\5\1\1\1\4";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\5\1\2\1\uffff\1\5\2\uffff\1\7\2\uffff\1\6\2\uffff\1\3\1\4"+
            "\1\1",
            "\1\10\1\uffff\1\10\1\5\14\uffff\1\10\3\uffff\1\10",
            "\1\11\1\uffff\1\11\1\5\14\uffff\1\11\3\uffff\1\11",
            "\1\11\1\uffff\1\11\1\5\14\uffff\1\11\3\uffff\1\11",
            "\1\11\1\uffff\1\11\1\5\14\uffff\1\11\3\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1510:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAbstractElement_in_entryRuleStateAbstractElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAbstractElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAbstractElement__Alternatives_in_ruleStateAbstractElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_in_ruleState334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoiceTag368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoiceTag__Alternatives_in_ruleVoiceTag394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_entryRuleDial421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDial428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__0_in_ruleDial454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_entryRulePlay481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlay488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__0_in_rulePlay514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0_in_ruleRecord574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_entryRuleReject601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReject608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reject__NameAssignment_in_ruleReject634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_entryRuleHangup661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHangup668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hangup__NameAssignment_in_ruleHangup694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_entryRuleGetDigits721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDigits728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__0_in_ruleGetDigits754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_entryRuleAsk781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsk788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__0_in_ruleAsk814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0_in_ruleSend874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0_in_ruleSendBlock934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0_in_ruleNotPrimaryParam994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleParam1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0_in_ruleSay1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStateExp_in_entryRuleIfStateExp1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStateExp1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group__0_in_ruleIfStateExp1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondStateBlock_in_entryRuleCondStateBlock1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondStateBlock1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondStateBlock__Group__0_in_ruleCondStateBlock1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockState_in_entryRuleBlockState1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockState1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockState__Group__0_in_ruleBlockState1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigment_in_entryRuleAssigment2401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigment2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__0_in_ruleAssigment2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_rule__Statement__Alternatives2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigment_in_rule__Statement__Alternatives2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ComAssignment_5_in_rule__Statement__Alternatives2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__StateAbstractElement__Alternatives2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__StateAbstractElement__Alternatives3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStateExp_in_rule__StateAbstractElement__Alternatives3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__LiteralAbs__Alternatives3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__LiteralAbs__Alternatives3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__LiteralAbs__Alternatives3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__SesAssignment_2_in_rule__Literal__Alternatives3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Document__Group__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13710 = new BitSet(new long[]{0x00FB1151B50000C0L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__23770 = new BitSet(new long[]{0x00FB1151B50000C0L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__23773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__StatesAssignment_2_in_rule__Document__Group__2__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__33831 = new BitSet(new long[]{0x00FB1151B50000C0L});
    public static final BitSet FOLLOW_rule__Document__Group__4_in_rule__Document__Group__33834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ElementsAssignment_3_in_rule__Document__Group__3__Impl3861 = new BitSet(new long[]{0x00DB1151A00000C2L});
    public static final BitSet FOLLOW_rule__Document__Group__4__Impl_in_rule__Document__Group__43892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__StaAssignment_4_in_rule__Document__Group__4__Impl3919 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__03960 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group_0__0__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__14022 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__24082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__04146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__04149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group_0_2__0__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__14208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__04269 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__04272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14330 = new BitSet(new long[]{0x00DB3151A80000C0L});
    public static final BitSet FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group_1__1__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24392 = new BitSet(new long[]{0x00DB3151A80000C0L});
    public static final BitSet FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__24395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl4422 = new BitSet(new long[]{0x00DB3151A00000C2L});
    public static final BitSet FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__34453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_1__3__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__04520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__04523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__State__Group_1_0__0__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__14582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__04643 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__04646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Dial__Group__0__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__14705 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__14708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__24765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Dial__Group__2__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__04830 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Play__Group__1_in_rule__Play__Group__04833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Play__Group__0__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__14892 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Play__Group__2_in_rule__Play__Group__14895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__24952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Play__Group__2__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Record__Group__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15079 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25139 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Record__Group__2__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35201 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Record__Group__4_in_rule__Record__Group__35204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Record__Group__3__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__45263 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Record__Group__5_in_rule__Record__Group__45266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__ActionAssignment_4_in_rule__Record__Group__4__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__5__Impl_in_rule__Record__Group__55323 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_rule__Record__Group__6_in_rule__Record__Group__55326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__0_in_rule__Record__Group__5__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__6__Impl_in_rule__Record__Group__65384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Record__Group__6__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__0__Impl_in_rule__Record__Group_5__05457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Record__Group_5__1_in_rule__Record__Group_5__05460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Record__Group_5__0__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__1__Impl_in_rule__Record__Group_5__15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__NameAssignment_5_1_in_rule__Record__Group_5__1__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__05580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__05583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GetDigits__Group__0__Impl5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__15642 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__15645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__25702 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__25705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GetDigits__Group__2__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__35764 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__4_in_rule__GetDigits__Group__35767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__QuestionAssignment_3_in_rule__GetDigits__Group__3__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__4__Impl_in_rule__GetDigits__Group__45824 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__5_in_rule__GetDigits__Group__45827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__GetDigits__Group__4__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__5__Impl_in_rule__GetDigits__Group__55886 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__6_in_rule__GetDigits__Group__55889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NameAssignment_5_in_rule__GetDigits__Group__5__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__6__Impl_in_rule__GetDigits__Group__65946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GetDigits__Group__6__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__06019 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Ask__Group__0__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__16081 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__16084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26141 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Ask__Group__3_in_rule__Ask__Group__26144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Ask__Group__2__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__3__Impl_in_rule__Ask__Group__36203 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__4_in_rule__Ask__Group__36206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__ChoicesAssignment_3_in_rule__Ask__Group__3__Impl6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__4__Impl_in_rule__Ask__Group__46263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Ask__Group__5_in_rule__Ask__Group__46266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Ask__Group__4__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__5__Impl_in_rule__Ask__Group__56325 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__6_in_rule__Ask__Group__56328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__NameAssignment_5_in_rule__Ask__Group__5__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__6__Impl_in_rule__Ask__Group__66385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Ask__Group__6__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06458 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Send__Group__0__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16520 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26580 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Send__Group__2__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36642 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Send__Group__4__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06771 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16832 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SendBlock__Group__1__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26894 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36954 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6984 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__47015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SendBlock__Group__4__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__07084 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__07087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NotPrimaryParam__Group__0__Impl7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__17146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07207 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ParamNameAssignment_0_in_rule__Param__Group__0__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17267 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Param__Group__1__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07392 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Say__Group__0__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17454 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Say__Group__2__Impl7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07579 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Transition__Group__0__Impl7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17641 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__27701 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__27704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Transition__Group__2__Impl7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__37763 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__37766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__47823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Transition__Group__4__Impl7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__07892 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__07895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__17952 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl7982 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__28013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__08077 = new BitSet(new long[]{0x00DB1151A00000C0L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__08080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IfExp__Group_1__0__Impl8108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__18139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__08200 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__08203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IfExp__Group_2__0__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__18262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08323 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18384 = new BitSet(new long[]{0x00DB1151A80000C0L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Block__Group__1__Impl8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28446 = new BitSet(new long[]{0x00DB1151A80000C0L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StmsAssignment_2_in_rule__Block__Group__2__Impl8476 = new BitSet(new long[]{0x00DB1151A00000C2L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Block__Group__3__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__08574 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__08577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CondBlock__Group__0__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__18636 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__18639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__28696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group__0__Impl_in_rule__IfStateExp__Group__08759 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group__1_in_rule__IfStateExp__Group__08762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__BlockAssignment_0_in_rule__IfStateExp__Group__0__Impl8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group__1__Impl_in_rule__IfStateExp__Group__18819 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group__2_in_rule__IfStateExp__Group__18822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_1__0_in_rule__IfStateExp__Group__1__Impl8849 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group__2__Impl_in_rule__IfStateExp__Group__28880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_2__0_in_rule__IfStateExp__Group__2__Impl8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_1__0__Impl_in_rule__IfStateExp__Group_1__08944 = new BitSet(new long[]{0x00DB3151A00000C0L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_1__1_in_rule__IfStateExp__Group_1__08947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IfStateExp__Group_1__0__Impl8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_1__1__Impl_in_rule__IfStateExp__Group_1__19006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__BlocksAssignment_1_1_in_rule__IfStateExp__Group_1__1__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_2__0__Impl_in_rule__IfStateExp__Group_2__09067 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_2__1_in_rule__IfStateExp__Group_2__09070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IfStateExp__Group_2__0__Impl9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__Group_2__1__Impl_in_rule__IfStateExp__Group_2__19129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStateExp__DefaultBlockAssignment_2_1_in_rule__IfStateExp__Group_2__1__Impl9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondStateBlock__Group__0__Impl_in_rule__CondStateBlock__Group__09190 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__CondStateBlock__Group__1_in_rule__CondStateBlock__Group__09193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CondStateBlock__Group__0__Impl9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondStateBlock__Group__1__Impl_in_rule__CondStateBlock__Group__19252 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CondStateBlock__Group__2_in_rule__CondStateBlock__Group__19255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondStateBlock__CondAssignment_1_in_rule__CondStateBlock__Group__1__Impl9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondStateBlock__Group__2__Impl_in_rule__CondStateBlock__Group__29312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondStateBlock__ActionAssignment_2_in_rule__CondStateBlock__Group__2__Impl9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockState__Group__0__Impl_in_rule__BlockState__Group__09375 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BlockState__Group__1_in_rule__BlockState__Group__09378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockState__Group__1__Impl_in_rule__BlockState__Group__19436 = new BitSet(new long[]{0x00DB3151A80000C0L});
    public static final BitSet FOLLOW_rule__BlockState__Group__2_in_rule__BlockState__Group__19439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BlockState__Group__1__Impl9467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockState__Group__2__Impl_in_rule__BlockState__Group__29498 = new BitSet(new long[]{0x00DB3151A80000C0L});
    public static final BitSet FOLLOW_rule__BlockState__Group__3_in_rule__BlockState__Group__29501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockState__StaAssignment_2_in_rule__BlockState__Group__2__Impl9528 = new BitSet(new long[]{0x00DB3151A00000C2L});
    public static final BitSet FOLLOW_rule__BlockState__Group__3__Impl_in_rule__BlockState__Group__39559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BlockState__Group__3__Impl9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__09626 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__09629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl9656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__19685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl9712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__09747 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__09750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__19808 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__19811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__29868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl9895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__09931 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__09934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__19991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__19994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110174 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010297 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010418 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__010539 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__010542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__110600 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__110603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__210660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__010723 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__010726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__110783 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__110786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl10813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__210843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl10870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__010906 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__010909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl10936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__110965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl10992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011027 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111088 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011211 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__StringVariable__Group__0__Impl11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111456 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__211516 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__211519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__311577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringVariable__Group__3__Impl11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__011644 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__011647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__StringVariable__Group_2__0__Impl11675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__111706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl11733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__011767 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__011770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NumVariable__Group__0__Impl11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__111829 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__111832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__211889 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__211892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__311950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NumVariable__Group__3__Impl11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012017 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NumVariable__Group_2__0__Impl12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__BoolVariable__Group__0__Impl12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112202 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212262 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BoolVariable__Group__3__Impl12351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012390 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BoolVariable__Group_2__0__Impl12421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__0__Impl_in_rule__Assigment__Group__012513 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Assigment__Group__1_in_rule__Assigment__Group__012516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__VaAssignment_0_in_rule__Assigment__Group__0__Impl12543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__1__Impl_in_rule__Assigment__Group__112573 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Assigment__Group__2_in_rule__Assigment__Group__112576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Assigment__Group__1__Impl12604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__2__Impl_in_rule__Assigment__Group__212635 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Assigment__Group__3_in_rule__Assigment__Group__212638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__RightAssignment_2_in_rule__Assigment__Group__2__Impl12665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__3__Impl_in_rule__Assigment__Group__312695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Assigment__Group__3__Impl12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__012762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__012765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__112823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__012884 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__012887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__112945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013006 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup13129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__013368 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__013371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__113396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Document__StatesAssignment_213464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Document__ElementsAssignment_313503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Document__StaAssignment_413534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_513565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_113596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_113627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_113658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAbstractElement_in_rule__State__StmsAssignment_1_213689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_113720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_113751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_113782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Record__ActionAssignment_413813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Record__NameAssignment_5_113844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Reject__NameAssignment13880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Hangup__NameAssignment13924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_113963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__GetDigits__QuestionAssignment_313994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetDigits__NameAssignment_514025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_114056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ask__ChoicesAssignment_314087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ask__NameAssignment_514118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Param__ParamNameAssignment_014304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_114401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EVENTENUM_in_rule__Transition__EventAssignment_314436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_014467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_114498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_114529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Block__StmsAssignment_214560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_114591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_214622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondStateBlock_in_rule__IfStateExp__BlockAssignment_014653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondStateBlock_in_rule__IfStateExp__BlocksAssignment_1_114684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockState_in_rule__IfStateExp__DefaultBlockAssignment_2_114715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__CondStateBlock__CondAssignment_114746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockState_in_rule__CondStateBlock__ActionAssignment_214777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAbstractElement_in_rule__BlockState__StaAssignment_214808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_114839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_214870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_014901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_114932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_214963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_014994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_115304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_115397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_215428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_115459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_115490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_115521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_115552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_115583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_115614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assigment__VaAssignment_015649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__Assigment__RightAssignment_215684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__VAssignment_015719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_115754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SESSION_in_rule__Literal__SesAssignment_215785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_115816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_115847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_115878 = new BitSet(new long[]{0x0000000000000002L});

}
