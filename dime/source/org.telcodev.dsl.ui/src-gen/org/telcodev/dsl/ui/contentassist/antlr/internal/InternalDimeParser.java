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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_EVENTENUM", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_SESSION", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'state'", "'times'", "'{'", "'}'", "'timeout'", "'call'", "';'", "'dialTo'", "'play'", "'record'", "'seconds'", "'in'", "'->'", "'get'", "'digits'", "'ask'", "'send'", "'to'", "','", "'=>'", "'say'", "'goTo'", "'when'", "'else'", "'if'", "'varString'", "'='", "'varNum'", "'varBool'", "'reject;'", "'hangUp;'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_OBRACKET=11;
    public static final int T__23=23;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_BOOL=19;
    public static final int EOF=-1;
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


    // $ANTLR start "entryRuleStatement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:89:1: ( ruleStatement EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement121);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement128); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:104:1: ( rule__Statement__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement154);
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


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:116:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:117:1: ( ruleAbstractElement EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:118:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement181);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement188); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:125:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:129:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:130:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:130:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:131:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:132:1: ( rule__AbstractElement__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:132:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement214);
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


    // $ANTLR start "entryRuleState"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:144:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:145:1: ( ruleState EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:146:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState241);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState248); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:153:1: ruleState : ( ( rule__State__UnorderedGroup ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:157:2: ( ( ( rule__State__UnorderedGroup ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:158:1: ( ( rule__State__UnorderedGroup ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:158:1: ( ( rule__State__UnorderedGroup ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:159:1: ( rule__State__UnorderedGroup )
            {
             before(grammarAccess.getStateAccess().getUnorderedGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:160:1: ( rule__State__UnorderedGroup )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:160:2: rule__State__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup_in_ruleState274);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:172:1: entryRuleVoiceTag : ruleVoiceTag EOF ;
    public final void entryRuleVoiceTag() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:173:1: ( ruleVoiceTag EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:174:1: ruleVoiceTag EOF
            {
             before(grammarAccess.getVoiceTagRule()); 
            pushFollow(FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag301);
            ruleVoiceTag();

            state._fsp--;

             after(grammarAccess.getVoiceTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoiceTag308); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:181:1: ruleVoiceTag : ( ( rule__VoiceTag__Alternatives ) ) ;
    public final void ruleVoiceTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:185:2: ( ( ( rule__VoiceTag__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:186:1: ( ( rule__VoiceTag__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:186:1: ( ( rule__VoiceTag__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:187:1: ( rule__VoiceTag__Alternatives )
            {
             before(grammarAccess.getVoiceTagAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:188:1: ( rule__VoiceTag__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:188:2: rule__VoiceTag__Alternatives
            {
            pushFollow(FOLLOW_rule__VoiceTag__Alternatives_in_ruleVoiceTag334);
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


    // $ANTLR start "entryRuleCall"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:200:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:201:1: ( ruleCall EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:202:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall361);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall368); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:209:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:213:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:214:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:214:1: ( ( rule__Call__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:215:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:216:1: ( rule__Call__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:216:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall394);
            rule__Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


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


    // $ANTLR start "entryRuleCondBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:620:1: entryRuleCondBlock : ruleCondBlock EOF ;
    public final void entryRuleCondBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:621:1: ( ruleCondBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:622:1: ruleCondBlock EOF
            {
             before(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock1261);
            ruleCondBlock();

            state._fsp--;

             after(grammarAccess.getCondBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock1268); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:629:1: ruleCondBlock : ( ( rule__CondBlock__Group__0 ) ) ;
    public final void ruleCondBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:633:2: ( ( ( rule__CondBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__CondBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__CondBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:635:1: ( rule__CondBlock__Group__0 )
            {
             before(grammarAccess.getCondBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:1: ( rule__CondBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:2: rule__CondBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1294);
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


    // $ANTLR start "entryRuleBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:648:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:649:1: ( ruleBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:650:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1321);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1328); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:657:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:661:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:662:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:662:1: ( ( rule__Block__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:663:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:664:1: ( rule__Block__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:664:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1354);
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


    // $ANTLR start "entryRuleBoolExpression"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:676:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:677:1: ( ruleBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:678:1: ruleBoolExpression EOF
            {
             before(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1381);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression1388); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:685:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:689:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__BoolExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__BoolExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:691:1: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:1: ( rule__BoolExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:2: rule__BoolExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1414);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:704:1: entryRuleTerminalBoolExpression : ruleTerminalBoolExpression EOF ;
    public final void entryRuleTerminalBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:705:1: ( ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:706:1: ruleTerminalBoolExpression EOF
            {
             before(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1441);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getTerminalBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression1448); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:713:1: ruleTerminalBoolExpression : ( ( rule__TerminalBoolExpression__Alternatives ) ) ;
    public final void ruleTerminalBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:717:2: ( ( ( rule__TerminalBoolExpression__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:719:1: ( rule__TerminalBoolExpression__Alternatives )
            {
             before(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:1: ( rule__TerminalBoolExpression__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:2: rule__TerminalBoolExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1474);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:732:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:733:1: ( ruleBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:734:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1501);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1508); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:741:1: ruleBrackets : ( ( rule__Brackets__Group__0 ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:745:2: ( ( ( rule__Brackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__Brackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__Brackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:747:1: ( rule__Brackets__Group__0 )
            {
             before(grammarAccess.getBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:1: ( rule__Brackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:2: rule__Brackets__Group__0
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1534);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:760:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:761:1: ( ruleCompareExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:762:1: ruleCompareExpression EOF
            {
             before(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1561);
            ruleCompareExpression();

            state._fsp--;

             after(grammarAccess.getCompareExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1568); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:769:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:773:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:775:1: ( rule__CompareExpression__Group__0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:1: ( rule__CompareExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1594);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:788:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:789:1: ( ruleNegExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:790:1: ruleNegExpression EOF
            {
             before(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression1621);
            ruleNegExpression();

            state._fsp--;

             after(grammarAccess.getNegExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression1628); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:797:1: ruleNegExpression : ( ( rule__NegExpression__Group__0 ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:801:2: ( ( ( rule__NegExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__NegExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__NegExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:803:1: ( rule__NegExpression__Group__0 )
            {
             before(grammarAccess.getNegExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:1: ( rule__NegExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:2: rule__NegExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1654);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:816:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:817:1: ( ruleMathExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:818:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression1681);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression1688); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:825:1: ruleMathExpression : ( ( rule__MathExpression__Group__0 ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:829:2: ( ( ( rule__MathExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__MathExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__MathExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:831:1: ( rule__MathExpression__Group__0 )
            {
             before(grammarAccess.getMathExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:1: ( rule__MathExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:2: rule__MathExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1714);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:844:1: entryRuleMathTerminal : ruleMathTerminal EOF ;
    public final void entryRuleMathTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:845:1: ( ruleMathTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:846:1: ruleMathTerminal EOF
            {
             before(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1741);
            ruleMathTerminal();

            state._fsp--;

             after(grammarAccess.getMathTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal1748); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:853:1: ruleMathTerminal : ( ( rule__MathTerminal__Alternatives ) ) ;
    public final void ruleMathTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:857:2: ( ( ( rule__MathTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__MathTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__MathTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:859:1: ( rule__MathTerminal__Alternatives )
            {
             before(grammarAccess.getMathTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:1: ( rule__MathTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:2: rule__MathTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1774);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:872:1: entryRuleMathBrackets : ruleMathBrackets EOF ;
    public final void entryRuleMathBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:873:1: ( ruleMathBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:874:1: ruleMathBrackets EOF
            {
             before(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1801);
            ruleMathBrackets();

            state._fsp--;

             after(grammarAccess.getMathBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets1808); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:881:1: ruleMathBrackets : ( ( rule__MathBrackets__Group__0 ) ) ;
    public final void ruleMathBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:885:2: ( ( ( rule__MathBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__MathBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__MathBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:887:1: ( rule__MathBrackets__Group__0 )
            {
             before(grammarAccess.getMathBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:1: ( rule__MathBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:2: rule__MathBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1834);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:900:1: entryRuleConcatenationExpression : ruleConcatenationExpression EOF ;
    public final void entryRuleConcatenationExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:901:1: ( ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:902:1: ruleConcatenationExpression EOF
            {
             before(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1861);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression1868); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:909:1: ruleConcatenationExpression : ( ( rule__ConcatenationExpression__Group__0 ) ) ;
    public final void ruleConcatenationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:913:2: ( ( ( rule__ConcatenationExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:915:1: ( rule__ConcatenationExpression__Group__0 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:1: ( rule__ConcatenationExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:2: rule__ConcatenationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression1894);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:928:1: entryRuleConcatenationTerminal : ruleConcatenationTerminal EOF ;
    public final void entryRuleConcatenationTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:929:1: ( ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:930:1: ruleConcatenationTerminal EOF
            {
             before(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal1921);
            ruleConcatenationTerminal();

            state._fsp--;

             after(grammarAccess.getConcatenationTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal1928); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:937:1: ruleConcatenationTerminal : ( ( rule__ConcatenationTerminal__Alternatives ) ) ;
    public final void ruleConcatenationTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:941:2: ( ( ( rule__ConcatenationTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:943:1: ( rule__ConcatenationTerminal__Alternatives )
            {
             before(grammarAccess.getConcatenationTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:1: ( rule__ConcatenationTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:2: rule__ConcatenationTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal1954);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:956:1: entryRuleConcatenationBrackets : ruleConcatenationBrackets EOF ;
    public final void entryRuleConcatenationBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:957:1: ( ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:958:1: ruleConcatenationBrackets EOF
            {
             before(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets1981);
            ruleConcatenationBrackets();

            state._fsp--;

             after(grammarAccess.getConcatenationBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets1988); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:965:1: ruleConcatenationBrackets : ( ( rule__ConcatenationBrackets__Group__0 ) ) ;
    public final void ruleConcatenationBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:969:2: ( ( ( rule__ConcatenationBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:971:1: ( rule__ConcatenationBrackets__Group__0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:1: ( rule__ConcatenationBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:2: rule__ConcatenationBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2014);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:984:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:985:1: ( ruleStringVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:986:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable2041);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable2048); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:993:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:997:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__StringVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__StringVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:999:1: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:1: ( rule__StringVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:2: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2074);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1012:1: entryRuleNumVariable : ruleNumVariable EOF ;
    public final void entryRuleNumVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1013:1: ( ruleNumVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1014:1: ruleNumVariable EOF
            {
             before(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable2101);
            ruleNumVariable();

            state._fsp--;

             after(grammarAccess.getNumVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable2108); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1021:1: ruleNumVariable : ( ( rule__NumVariable__Group__0 ) ) ;
    public final void ruleNumVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1025:2: ( ( ( rule__NumVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__NumVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__NumVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1027:1: ( rule__NumVariable__Group__0 )
            {
             before(grammarAccess.getNumVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:1: ( rule__NumVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:2: rule__NumVariable__Group__0
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2134);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1040:1: entryRuleBoolVariable : ruleBoolVariable EOF ;
    public final void entryRuleBoolVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1041:1: ( ruleBoolVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1042:1: ruleBoolVariable EOF
            {
             before(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2161);
            ruleBoolVariable();

            state._fsp--;

             after(grammarAccess.getBoolVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable2168); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1049:1: ruleBoolVariable : ( ( rule__BoolVariable__Group__0 ) ) ;
    public final void ruleBoolVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1053:2: ( ( ( rule__BoolVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__BoolVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__BoolVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1055:1: ( rule__BoolVariable__Group__0 )
            {
             before(grammarAccess.getBoolVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:1: ( rule__BoolVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:2: rule__BoolVariable__Group__0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2194);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1068:1: entryRuleAssigment : ruleAssigment EOF ;
    public final void entryRuleAssigment() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1069:1: ( ruleAssigment EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1070:1: ruleAssigment EOF
            {
             before(grammarAccess.getAssigmentRule()); 
            pushFollow(FOLLOW_ruleAssigment_in_entryRuleAssigment2221);
            ruleAssigment();

            state._fsp--;

             after(grammarAccess.getAssigmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigment2228); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1077:1: ruleAssigment : ( ( rule__Assigment__Group__0 ) ) ;
    public final void ruleAssigment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1081:2: ( ( ( rule__Assigment__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__Assigment__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__Assigment__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1083:1: ( rule__Assigment__Group__0 )
            {
             before(grammarAccess.getAssigmentAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:1: ( rule__Assigment__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:2: rule__Assigment__Group__0
            {
            pushFollow(FOLLOW_rule__Assigment__Group__0_in_ruleAssigment2254);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1098:1: entryRuleLiteralAbs : ruleLiteralAbs EOF ;
    public final void entryRuleLiteralAbs() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1099:1: ( ruleLiteralAbs EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1100:1: ruleLiteralAbs EOF
            {
             before(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2283);
            ruleLiteralAbs();

            state._fsp--;

             after(grammarAccess.getLiteralAbsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs2290); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1107:1: ruleLiteralAbs : ( ( rule__LiteralAbs__Alternatives ) ) ;
    public final void ruleLiteralAbs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1111:2: ( ( ( rule__LiteralAbs__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:1: ( ( rule__LiteralAbs__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:1: ( ( rule__LiteralAbs__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1113:1: ( rule__LiteralAbs__Alternatives )
            {
             before(grammarAccess.getLiteralAbsAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1114:1: ( rule__LiteralAbs__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1114:2: rule__LiteralAbs__Alternatives
            {
            pushFollow(FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2316);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1126:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1127:1: ( ruleLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1128:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2343);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2350); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1135:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1139:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:1: ( ( rule__Literal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1141:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1142:1: ( rule__Literal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1142:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2376);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1154:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1155:1: ( ruleBoolLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1156:1: ruleBoolLiteral EOF
            {
             before(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2403);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getBoolLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral2410); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1163:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Group__0 ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1167:2: ( ( ( rule__BoolLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:1: ( ( rule__BoolLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:1: ( ( rule__BoolLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1169:1: ( rule__BoolLiteral__Group__0 )
            {
             before(grammarAccess.getBoolLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1170:1: ( rule__BoolLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1170:2: rule__BoolLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2436);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1182:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1183:1: ( ruleNumLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1184:1: ruleNumLiteral EOF
            {
             before(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2463);
            ruleNumLiteral();

            state._fsp--;

             after(grammarAccess.getNumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral2470); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1191:1: ruleNumLiteral : ( ( rule__NumLiteral__Group__0 ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1195:2: ( ( ( rule__NumLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1196:1: ( ( rule__NumLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1196:1: ( ( rule__NumLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1197:1: ( rule__NumLiteral__Group__0 )
            {
             before(grammarAccess.getNumLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1198:1: ( rule__NumLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1198:2: rule__NumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2496);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1210:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1211:1: ( ruleStringLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1212:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2523);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2530); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1219:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1223:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1224:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1224:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1225:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1226:1: ( rule__StringLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1226:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2556);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1238:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1239:1: ( ruleNumber EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1240:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2583);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2590); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1247:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1251:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1252:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1252:1: ( ( rule__Number__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1253:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1254:1: ( rule__Number__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1254:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber2616);
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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1266:1: rule__Statement__Alternatives : ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleVoiceTag ) | ( ruleAssigment ) | ( ( rule__Statement__ComAssignment_5 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1270:1: ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleVoiceTag ) | ( ruleAssigment ) | ( ( rule__Statement__ComAssignment_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt1=1;
                }
                break;
            case 49:
                {
                alt1=2;
                }
                break;
            case 52:
                {
                alt1=3;
                }
                break;
            case 29:
            case 31:
            case 32:
            case 33:
            case 37:
            case 39:
            case 40:
            case 44:
            case 53:
            case 54:
                {
                alt1=4;
                }
                break;
            case RULE_ID:
                {
                alt1=5;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1271:1: ( ruleNumVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1271:1: ( ruleNumVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1272:1: ruleNumVariable
                    {
                     before(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2652);
                    ruleNumVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1277:6: ( ruleStringVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1277:6: ( ruleStringVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1278:1: ruleStringVariable
                    {
                     before(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2669);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1283:6: ( ruleBoolVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1283:6: ( ruleBoolVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1284:1: ruleBoolVariable
                    {
                     before(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2686);
                    ruleBoolVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1289:6: ( ruleVoiceTag )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1289:6: ( ruleVoiceTag )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1290:1: ruleVoiceTag
                    {
                     before(grammarAccess.getStatementAccess().getVoiceTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVoiceTag_in_rule__Statement__Alternatives2703);
                    ruleVoiceTag();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVoiceTagParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1295:6: ( ruleAssigment )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1295:6: ( ruleAssigment )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1296:1: ruleAssigment
                    {
                     before(grammarAccess.getStatementAccess().getAssigmentParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAssigment_in_rule__Statement__Alternatives2720);
                    ruleAssigment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssigmentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1301:6: ( ( rule__Statement__ComAssignment_5 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1301:6: ( ( rule__Statement__ComAssignment_5 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1302:1: ( rule__Statement__ComAssignment_5 )
                    {
                     before(grammarAccess.getStatementAccess().getComAssignment_5()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1303:1: ( rule__Statement__ComAssignment_5 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1303:2: rule__Statement__ComAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Statement__ComAssignment_5_in_rule__Statement__Alternatives2737);
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1312:1: rule__AbstractElement__Alternatives : ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1316:1: ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_ML_COMMENT:
            case 29:
            case 31:
            case 32:
            case 33:
            case 37:
            case 39:
            case 40:
            case 44:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 48:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1317:1: ( ruleStatement )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1317:1: ( ruleStatement )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1318:1: ruleStatement
                    {
                     before(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives2770);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1323:6: ( ruleTransition )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1323:6: ( ruleTransition )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1324:1: ruleTransition
                    {
                     before(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives2787);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1329:6: ( ruleIfExp )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1329:6: ( ruleIfExp )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1330:1: ruleIfExp
                    {
                     before(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives2804);
                    ruleIfExp();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 

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


    // $ANTLR start "rule__VoiceTag__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1340:1: rule__VoiceTag__Alternatives : ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) );
    public final void rule__VoiceTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1344:1: ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 37:
                {
                alt3=5;
                }
                break;
            case 39:
                {
                alt3=6;
                }
                break;
            case 40:
                {
                alt3=7;
                }
                break;
            case 53:
                {
                alt3=8;
                }
                break;
            case 54:
                {
                alt3=9;
                }
                break;
            case 29:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1345:1: ( ruleSay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1345:1: ( ruleSay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1346:1: ruleSay
                    {
                     before(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives2836);
                    ruleSay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1351:6: ( ruleDial )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1351:6: ( ruleDial )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1352:1: ruleDial
                    {
                     before(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives2853);
                    ruleDial();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1357:6: ( rulePlay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1357:6: ( rulePlay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1358:1: rulePlay
                    {
                     before(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives2870);
                    rulePlay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1363:6: ( ruleRecord )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1363:6: ( ruleRecord )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1364:1: ruleRecord
                    {
                     before(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives2887);
                    ruleRecord();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1369:6: ( ruleGetDigits )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1369:6: ( ruleGetDigits )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1370:1: ruleGetDigits
                    {
                     before(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives2904);
                    ruleGetDigits();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1375:6: ( ruleAsk )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1375:6: ( ruleAsk )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1376:1: ruleAsk
                    {
                     before(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives2921);
                    ruleAsk();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1381:6: ( ruleSend )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1381:6: ( ruleSend )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1382:1: ruleSend
                    {
                     before(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives2938);
                    ruleSend();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1387:6: ( ruleReject )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1387:6: ( ruleReject )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1388:1: ruleReject
                    {
                     before(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives2955);
                    ruleReject();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1393:6: ( ruleHangup )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1393:6: ( ruleHangup )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1394:1: ruleHangup
                    {
                     before(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives2972);
                    ruleHangup();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1399:6: ( ruleCall )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1399:6: ( ruleCall )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1400:1: ruleCall
                    {
                     before(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives2989);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1410:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) );
    public final void rule__TerminalBoolExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1414:1: ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1415:1: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1415:1: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1416:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3021);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1421:6: ( ruleCompareExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1421:6: ( ruleCompareExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1422:1: ruleCompareExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3038);
                    ruleCompareExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1427:6: ( ruleNegExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1427:6: ( ruleNegExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1428:1: ruleNegExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3055);
                    ruleNegExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1433:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1433:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1434:1: ruleLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3072);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1439:6: ( ruleBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1439:6: ( ruleBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1440:1: ruleBrackets
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3089);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1450:1: rule__MathTerminal__Alternatives : ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) );
    public final void rule__MathTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1454:1: ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case RULE_SESSION:
                {
                alt5=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1455:1: ( ruleMathBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1455:1: ( ruleMathBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1456:1: ruleMathBrackets
                    {
                     before(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3121);
                    ruleMathBrackets();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1461:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1461:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1462:1: ruleLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3138);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1467:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1467:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1468:1: ruleNumLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3155);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1478:1: rule__ConcatenationTerminal__Alternatives : ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) );
    public final void rule__ConcatenationTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1482:1: ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OBRACKET) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_DOUBLE && LA6_0<=RULE_ID)||LA6_0==RULE_STRING||(LA6_0>=RULE_NULL && LA6_0<=RULE_BOOL)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1483:1: ( ruleConcatenationBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1483:1: ( ruleConcatenationBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1484:1: ruleConcatenationBrackets
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3187);
                    ruleConcatenationBrackets();

                    state._fsp--;

                     after(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1489:6: ( ruleLiteralAbs )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1489:6: ( ruleLiteralAbs )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1490:1: ruleLiteralAbs
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3204);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1501:1: rule__LiteralAbs__Alternatives : ( ( ruleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) );
    public final void rule__LiteralAbs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1505:1: ( ( ruleLiteral ) | ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_NULL:
            case RULE_SESSION:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_BOOL:
                {
                alt7=3;
                }
                break;
            case RULE_DOUBLE:
            case RULE_INT:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1506:1: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1506:1: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1507:1: ruleLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3237);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1512:6: ( ruleStringLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1512:6: ( ruleStringLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1513:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__LiteralAbs__Alternatives3254);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1518:6: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1518:6: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1519:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getBoolLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__LiteralAbs__Alternatives3271);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getBoolLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1524:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1524:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1525:1: ruleNumLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getNumLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__LiteralAbs__Alternatives3288);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1535:1: rule__Literal__Alternatives : ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ( rule__Literal__SesAssignment_2 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1539:1: ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ( rule__Literal__SesAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_NULL:
                {
                alt8=2;
                }
                break;
            case RULE_SESSION:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1540:1: ( ( rule__Literal__VAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1540:1: ( ( rule__Literal__VAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1541:1: ( rule__Literal__VAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getVAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1542:1: ( rule__Literal__VAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1542:2: rule__Literal__VAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3320);
                    rule__Literal__VAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getVAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1546:6: ( ( rule__Literal__NulAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1546:6: ( ( rule__Literal__NulAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1547:1: ( rule__Literal__NulAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getNulAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1548:1: ( rule__Literal__NulAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1548:2: rule__Literal__NulAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3338);
                    rule__Literal__NulAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getNulAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1552:6: ( ( rule__Literal__SesAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1552:6: ( ( rule__Literal__SesAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1553:1: ( rule__Literal__SesAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getSesAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1554:1: ( rule__Literal__SesAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1554:2: rule__Literal__SesAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__SesAssignment_2_in_rule__Literal__Alternatives3356);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1563:1: rule__Number__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOUBLE) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1568:1: ( RULE_DOUBLE )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1568:1: ( RULE_DOUBLE )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1569:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3389); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1574:6: ( RULE_INT )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1574:6: ( RULE_INT )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1575:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives3406); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1587:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1591:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1592:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03436);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03439);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1599:1: rule__Document__Group__0__Impl : ( 'application' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1603:1: ( ( 'application' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1604:1: ( 'application' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1604:1: ( 'application' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1605:1: 'application'
            {
             before(grammarAccess.getDocumentAccess().getApplicationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Document__Group__0__Impl3467); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1618:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1622:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1623:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13498);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__13501);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1630:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1634:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1635:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1635:1: ( ( rule__Document__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1636:1: ( rule__Document__NameAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1637:1: ( rule__Document__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1637:2: rule__Document__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl3528);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1647:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1651:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1652:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__23558);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__23561);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1659:1: rule__Document__Group__2__Impl : ( ( rule__Document__ElementsAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1663:1: ( ( ( rule__Document__ElementsAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1664:1: ( ( rule__Document__ElementsAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1664:1: ( ( rule__Document__ElementsAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1665:1: ( rule__Document__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDocumentAccess().getElementsAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1666:1: ( rule__Document__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_ML_COMMENT)||LA10_0==29||(LA10_0>=31 && LA10_0<=33)||LA10_0==37||(LA10_0>=39 && LA10_0<=40)||LA10_0==44||LA10_0==49||(LA10_0>=51 && LA10_0<=54)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1666:2: rule__Document__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl3588);
            	    rule__Document__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getElementsAssignment_2()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1676:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1680:1: ( rule__Document__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1681:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__33619);
            rule__Document__Group__3__Impl();

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1687:1: rule__Document__Group__3__Impl : ( ( rule__Document__StaAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1691:1: ( ( ( rule__Document__StaAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1692:1: ( ( rule__Document__StaAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1692:1: ( ( rule__Document__StaAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1693:1: ( rule__Document__StaAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getStaAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1694:1: ( rule__Document__StaAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||LA11_0==26||LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1694:2: rule__Document__StaAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl3646);
            	    rule__Document__StaAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getStaAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group_0__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1712:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1716:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1717:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__03685);
            rule__State__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__03688);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1724:1: rule__State__Group_0__0__Impl : ( 'state' ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1728:1: ( ( 'state' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1729:1: ( 'state' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1729:1: ( 'state' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1730:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__State__Group_0__0__Impl3716); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1743:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl rule__State__Group_0__2 ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1747:1: ( rule__State__Group_0__1__Impl rule__State__Group_0__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1748:2: rule__State__Group_0__1__Impl rule__State__Group_0__2
            {
            pushFollow(FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__13747);
            rule__State__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__13750);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1755:1: rule__State__Group_0__1__Impl : ( ( rule__State__NameAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1759:1: ( ( ( rule__State__NameAssignment_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1760:1: ( ( rule__State__NameAssignment_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1760:1: ( ( rule__State__NameAssignment_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1761:1: ( rule__State__NameAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1762:1: ( rule__State__NameAssignment_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1762:2: rule__State__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl3777);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1772:1: rule__State__Group_0__2 : rule__State__Group_0__2__Impl ;
    public final void rule__State__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1776:1: ( rule__State__Group_0__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1777:2: rule__State__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__23807);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1783:1: rule__State__Group_0__2__Impl : ( ( rule__State__Group_0_2__0 )? ) ;
    public final void rule__State__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1787:1: ( ( ( rule__State__Group_0_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1788:1: ( ( rule__State__Group_0_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1788:1: ( ( rule__State__Group_0_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1789:1: ( rule__State__Group_0_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1790:1: ( rule__State__Group_0_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1790:2: rule__State__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl3834);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1806:1: rule__State__Group_0_2__0 : rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 ;
    public final void rule__State__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1810:1: ( rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1811:2: rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__03871);
            rule__State__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__03874);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1818:1: rule__State__Group_0_2__0__Impl : ( 'times' ) ;
    public final void rule__State__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1822:1: ( ( 'times' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1823:1: ( 'times' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1823:1: ( 'times' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:1: 'times'
            {
             before(grammarAccess.getStateAccess().getTimesKeyword_0_2_0()); 
            match(input,25,FOLLOW_25_in_rule__State__Group_0_2__0__Impl3902); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1837:1: rule__State__Group_0_2__1 : rule__State__Group_0_2__1__Impl ;
    public final void rule__State__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1841:1: ( rule__State__Group_0_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1842:2: rule__State__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__13933);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1848:1: rule__State__Group_0_2__1__Impl : ( ( rule__State__TimesAssignment_0_2_1 ) ) ;
    public final void rule__State__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1852:1: ( ( ( rule__State__TimesAssignment_0_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1853:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1853:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1854:1: ( rule__State__TimesAssignment_0_2_1 )
            {
             before(grammarAccess.getStateAccess().getTimesAssignment_0_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1855:1: ( rule__State__TimesAssignment_0_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1855:2: rule__State__TimesAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl3960);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1869:1: rule__State__Group_1__0 : rule__State__Group_1__0__Impl rule__State__Group_1__1 ;
    public final void rule__State__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1873:1: ( rule__State__Group_1__0__Impl rule__State__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:2: rule__State__Group_1__0__Impl rule__State__Group_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__03994);
            rule__State__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__03997);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1881:1: rule__State__Group_1__0__Impl : ( ( rule__State__Group_1_0__0 )? ) ;
    public final void rule__State__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1885:1: ( ( ( rule__State__Group_1_0__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1886:1: ( ( rule__State__Group_1_0__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1886:1: ( ( rule__State__Group_1_0__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1887:1: ( rule__State__Group_1_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1888:1: ( rule__State__Group_1_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1888:2: rule__State__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4024);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1898:1: rule__State__Group_1__1 : rule__State__Group_1__1__Impl rule__State__Group_1__2 ;
    public final void rule__State__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1902:1: ( rule__State__Group_1__1__Impl rule__State__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1903:2: rule__State__Group_1__1__Impl rule__State__Group_1__2
            {
            pushFollow(FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14055);
            rule__State__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14058);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1910:1: rule__State__Group_1__1__Impl : ( '{' ) ;
    public final void rule__State__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1915:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1915:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1916:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__State__Group_1__1__Impl4086); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1929:1: rule__State__Group_1__2 : rule__State__Group_1__2__Impl rule__State__Group_1__3 ;
    public final void rule__State__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1933:1: ( rule__State__Group_1__2__Impl rule__State__Group_1__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1934:2: rule__State__Group_1__2__Impl rule__State__Group_1__3
            {
            pushFollow(FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24117);
            rule__State__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__24120);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1941:1: rule__State__Group_1__2__Impl : ( ( rule__State__StmsAssignment_1_2 )* ) ;
    public final void rule__State__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1945:1: ( ( ( rule__State__StmsAssignment_1_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1946:1: ( ( rule__State__StmsAssignment_1_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1946:1: ( ( rule__State__StmsAssignment_1_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1947:1: ( rule__State__StmsAssignment_1_2 )*
            {
             before(grammarAccess.getStateAccess().getStmsAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:1: ( rule__State__StmsAssignment_1_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_ML_COMMENT)||LA14_0==29||(LA14_0>=31 && LA14_0<=33)||LA14_0==37||(LA14_0>=39 && LA14_0<=40)||(LA14_0>=44 && LA14_0<=45)||(LA14_0>=48 && LA14_0<=49)||(LA14_0>=51 && LA14_0<=54)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:2: rule__State__StmsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl4147);
            	    rule__State__StmsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1958:1: rule__State__Group_1__3 : rule__State__Group_1__3__Impl ;
    public final void rule__State__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1962:1: ( rule__State__Group_1__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1963:2: rule__State__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__34178);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1969:1: rule__State__Group_1__3__Impl : ( '}' ) ;
    public final void rule__State__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1973:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1974:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1974:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1975:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_1__3__Impl4206); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1996:1: rule__State__Group_1_0__0 : rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 ;
    public final void rule__State__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2000:1: ( rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2001:2: rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__04245);
            rule__State__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__04248);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2008:1: rule__State__Group_1_0__0__Impl : ( 'timeout' ) ;
    public final void rule__State__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2012:1: ( ( 'timeout' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2013:1: ( 'timeout' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2013:1: ( 'timeout' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2014:1: 'timeout'
            {
             before(grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0()); 
            match(input,28,FOLLOW_28_in_rule__State__Group_1_0__0__Impl4276); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2027:1: rule__State__Group_1_0__1 : rule__State__Group_1_0__1__Impl ;
    public final void rule__State__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2031:1: ( rule__State__Group_1_0__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2032:2: rule__State__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__14307);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2038:1: rule__State__Group_1_0__1__Impl : ( ( rule__State__TimeoutAssignment_1_0_1 ) ) ;
    public final void rule__State__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2042:1: ( ( ( rule__State__TimeoutAssignment_1_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2043:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2043:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2044:1: ( rule__State__TimeoutAssignment_1_0_1 )
            {
             before(grammarAccess.getStateAccess().getTimeoutAssignment_1_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2045:1: ( rule__State__TimeoutAssignment_1_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2045:2: rule__State__TimeoutAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl4334);
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


    // $ANTLR start "rule__Call__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2059:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2063:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2064:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__04368);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__04371);
            rule__Call__Group__1();

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
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2071:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2075:1: ( ( 'call' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2076:1: ( 'call' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2076:1: ( 'call' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2077:1: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Call__Group__0__Impl4399); 
             after(grammarAccess.getCallAccess().getCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2090:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2094:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2095:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__14430);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__14433);
            rule__Call__Group__2();

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
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2102:1: rule__Call__Group__1__Impl : ( ( rule__Call__ToAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2106:1: ( ( ( rule__Call__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2107:1: ( ( rule__Call__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2107:1: ( ( rule__Call__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2108:1: ( rule__Call__ToAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2109:1: ( rule__Call__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2109:2: rule__Call__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl4460);
            rule__Call__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getToAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2119:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2123:1: ( rule__Call__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2124:2: rule__Call__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__24490);
            rule__Call__Group__2__Impl();

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
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2130:1: rule__Call__Group__2__Impl : ( ';' ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2134:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2135:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2135:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2136:1: ';'
            {
             before(grammarAccess.getCallAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Call__Group__2__Impl4518); 
             after(grammarAccess.getCallAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Dial__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2155:1: rule__Dial__Group__0 : rule__Dial__Group__0__Impl rule__Dial__Group__1 ;
    public final void rule__Dial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2159:1: ( rule__Dial__Group__0__Impl rule__Dial__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2160:2: rule__Dial__Group__0__Impl rule__Dial__Group__1
            {
            pushFollow(FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__04555);
            rule__Dial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__04558);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2167:1: rule__Dial__Group__0__Impl : ( 'dialTo' ) ;
    public final void rule__Dial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2171:1: ( ( 'dialTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2172:1: ( 'dialTo' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2172:1: ( 'dialTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2173:1: 'dialTo'
            {
             before(grammarAccess.getDialAccess().getDialToKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Dial__Group__0__Impl4586); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2186:1: rule__Dial__Group__1 : rule__Dial__Group__1__Impl rule__Dial__Group__2 ;
    public final void rule__Dial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2190:1: ( rule__Dial__Group__1__Impl rule__Dial__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2191:2: rule__Dial__Group__1__Impl rule__Dial__Group__2
            {
            pushFollow(FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__14617);
            rule__Dial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__14620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2198:1: rule__Dial__Group__1__Impl : ( ( rule__Dial__ToAssignment_1 ) ) ;
    public final void rule__Dial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2202:1: ( ( ( rule__Dial__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2203:1: ( ( rule__Dial__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2203:1: ( ( rule__Dial__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2204:1: ( rule__Dial__ToAssignment_1 )
            {
             before(grammarAccess.getDialAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2205:1: ( rule__Dial__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2205:2: rule__Dial__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl4647);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2215:1: rule__Dial__Group__2 : rule__Dial__Group__2__Impl ;
    public final void rule__Dial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2219:1: ( rule__Dial__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2220:2: rule__Dial__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__24677);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2226:1: rule__Dial__Group__2__Impl : ( ';' ) ;
    public final void rule__Dial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2230:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2231:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2231:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2232:1: ';'
            {
             before(grammarAccess.getDialAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Dial__Group__2__Impl4705); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2251:1: rule__Play__Group__0 : rule__Play__Group__0__Impl rule__Play__Group__1 ;
    public final void rule__Play__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2255:1: ( rule__Play__Group__0__Impl rule__Play__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2256:2: rule__Play__Group__0__Impl rule__Play__Group__1
            {
            pushFollow(FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__04742);
            rule__Play__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__1_in_rule__Play__Group__04745);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2263:1: rule__Play__Group__0__Impl : ( 'play' ) ;
    public final void rule__Play__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2267:1: ( ( 'play' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2268:1: ( 'play' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2268:1: ( 'play' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2269:1: 'play'
            {
             before(grammarAccess.getPlayAccess().getPlayKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Play__Group__0__Impl4773); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2282:1: rule__Play__Group__1 : rule__Play__Group__1__Impl rule__Play__Group__2 ;
    public final void rule__Play__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2286:1: ( rule__Play__Group__1__Impl rule__Play__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2287:2: rule__Play__Group__1__Impl rule__Play__Group__2
            {
            pushFollow(FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__14804);
            rule__Play__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__2_in_rule__Play__Group__14807);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2294:1: rule__Play__Group__1__Impl : ( ( rule__Play__FileAssignment_1 ) ) ;
    public final void rule__Play__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2298:1: ( ( ( rule__Play__FileAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2299:1: ( ( rule__Play__FileAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2299:1: ( ( rule__Play__FileAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2300:1: ( rule__Play__FileAssignment_1 )
            {
             before(grammarAccess.getPlayAccess().getFileAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2301:1: ( rule__Play__FileAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2301:2: rule__Play__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl4834);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2311:1: rule__Play__Group__2 : rule__Play__Group__2__Impl ;
    public final void rule__Play__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2315:1: ( rule__Play__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2316:2: rule__Play__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__24864);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2322:1: rule__Play__Group__2__Impl : ( ';' ) ;
    public final void rule__Play__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2326:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2327:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2327:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2328:1: ';'
            {
             before(grammarAccess.getPlayAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Play__Group__2__Impl4892); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2347:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2351:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2352:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__04929);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__1_in_rule__Record__Group__04932);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2359:1: rule__Record__Group__0__Impl : ( 'record' ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2363:1: ( ( 'record' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2364:1: ( 'record' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2364:1: ( 'record' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2365:1: 'record'
            {
             before(grammarAccess.getRecordAccess().getRecordKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Record__Group__0__Impl4960); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2378:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2382:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2383:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__14991);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__2_in_rule__Record__Group__14994);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2390:1: rule__Record__Group__1__Impl : ( ( rule__Record__TimeAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2394:1: ( ( ( rule__Record__TimeAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2395:1: ( ( rule__Record__TimeAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2395:1: ( ( rule__Record__TimeAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2396:1: ( rule__Record__TimeAssignment_1 )
            {
             before(grammarAccess.getRecordAccess().getTimeAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2397:1: ( rule__Record__TimeAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2397:2: rule__Record__TimeAssignment_1
            {
            pushFollow(FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5021);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2407:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2411:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2412:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25051);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25054);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2419:1: rule__Record__Group__2__Impl : ( 'seconds' ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2423:1: ( ( 'seconds' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2424:1: ( 'seconds' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2424:1: ( 'seconds' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2425:1: 'seconds'
            {
             before(grammarAccess.getRecordAccess().getSecondsKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Record__Group__2__Impl5082); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2438:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2442:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2443:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35113);
            rule__Record__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__4_in_rule__Record__Group__35116);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2450:1: rule__Record__Group__3__Impl : ( 'in' ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2454:1: ( ( 'in' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2455:1: ( 'in' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2455:1: ( 'in' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2456:1: 'in'
            {
             before(grammarAccess.getRecordAccess().getInKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__Record__Group__3__Impl5144); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2469:1: rule__Record__Group__4 : rule__Record__Group__4__Impl rule__Record__Group__5 ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2473:1: ( rule__Record__Group__4__Impl rule__Record__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2474:2: rule__Record__Group__4__Impl rule__Record__Group__5
            {
            pushFollow(FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__45175);
            rule__Record__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__5_in_rule__Record__Group__45178);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2481:1: rule__Record__Group__4__Impl : ( ( rule__Record__ActionAssignment_4 ) ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2485:1: ( ( ( rule__Record__ActionAssignment_4 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2486:1: ( ( rule__Record__ActionAssignment_4 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2486:1: ( ( rule__Record__ActionAssignment_4 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2487:1: ( rule__Record__ActionAssignment_4 )
            {
             before(grammarAccess.getRecordAccess().getActionAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2488:1: ( rule__Record__ActionAssignment_4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2488:2: rule__Record__ActionAssignment_4
            {
            pushFollow(FOLLOW_rule__Record__ActionAssignment_4_in_rule__Record__Group__4__Impl5205);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2498:1: rule__Record__Group__5 : rule__Record__Group__5__Impl rule__Record__Group__6 ;
    public final void rule__Record__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2502:1: ( rule__Record__Group__5__Impl rule__Record__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2503:2: rule__Record__Group__5__Impl rule__Record__Group__6
            {
            pushFollow(FOLLOW_rule__Record__Group__5__Impl_in_rule__Record__Group__55235);
            rule__Record__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__6_in_rule__Record__Group__55238);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2510:1: rule__Record__Group__5__Impl : ( ( rule__Record__Group_5__0 )? ) ;
    public final void rule__Record__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2514:1: ( ( ( rule__Record__Group_5__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2515:1: ( ( rule__Record__Group_5__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2515:1: ( ( rule__Record__Group_5__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2516:1: ( rule__Record__Group_5__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2517:1: ( rule__Record__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2517:2: rule__Record__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Record__Group_5__0_in_rule__Record__Group__5__Impl5265);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2527:1: rule__Record__Group__6 : rule__Record__Group__6__Impl ;
    public final void rule__Record__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2531:1: ( rule__Record__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2532:2: rule__Record__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group__6__Impl_in_rule__Record__Group__65296);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2538:1: rule__Record__Group__6__Impl : ( ';' ) ;
    public final void rule__Record__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2542:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2543:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2543:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2544:1: ';'
            {
             before(grammarAccess.getRecordAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Record__Group__6__Impl5324); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2571:1: rule__Record__Group_5__0 : rule__Record__Group_5__0__Impl rule__Record__Group_5__1 ;
    public final void rule__Record__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2575:1: ( rule__Record__Group_5__0__Impl rule__Record__Group_5__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2576:2: rule__Record__Group_5__0__Impl rule__Record__Group_5__1
            {
            pushFollow(FOLLOW_rule__Record__Group_5__0__Impl_in_rule__Record__Group_5__05369);
            rule__Record__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group_5__1_in_rule__Record__Group_5__05372);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2583:1: rule__Record__Group_5__0__Impl : ( '->' ) ;
    public final void rule__Record__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2587:1: ( ( '->' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2588:1: ( '->' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2588:1: ( '->' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2589:1: '->'
            {
             before(grammarAccess.getRecordAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__Record__Group_5__0__Impl5400); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2602:1: rule__Record__Group_5__1 : rule__Record__Group_5__1__Impl ;
    public final void rule__Record__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2606:1: ( rule__Record__Group_5__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2607:2: rule__Record__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group_5__1__Impl_in_rule__Record__Group_5__15431);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2613:1: rule__Record__Group_5__1__Impl : ( ( rule__Record__NameAssignment_5_1 ) ) ;
    public final void rule__Record__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2617:1: ( ( ( rule__Record__NameAssignment_5_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2618:1: ( ( rule__Record__NameAssignment_5_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2618:1: ( ( rule__Record__NameAssignment_5_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2619:1: ( rule__Record__NameAssignment_5_1 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_5_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2620:1: ( rule__Record__NameAssignment_5_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2620:2: rule__Record__NameAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Record__NameAssignment_5_1_in_rule__Record__Group_5__1__Impl5458);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2634:1: rule__GetDigits__Group__0 : rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 ;
    public final void rule__GetDigits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2638:1: ( rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2639:2: rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__05492);
            rule__GetDigits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__05495);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2646:1: rule__GetDigits__Group__0__Impl : ( 'get' ) ;
    public final void rule__GetDigits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2650:1: ( ( 'get' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2651:1: ( 'get' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2651:1: ( 'get' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2652:1: 'get'
            {
             before(grammarAccess.getGetDigitsAccess().getGetKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__GetDigits__Group__0__Impl5523); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2665:1: rule__GetDigits__Group__1 : rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 ;
    public final void rule__GetDigits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2669:1: ( rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2670:2: rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__15554);
            rule__GetDigits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__15557);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2677:1: rule__GetDigits__Group__1__Impl : ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) ;
    public final void rule__GetDigits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2681:1: ( ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2682:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2682:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2683:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2684:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2684:2: rule__GetDigits__NumDigitsAssignment_1
            {
            pushFollow(FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl5584);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2694:1: rule__GetDigits__Group__2 : rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 ;
    public final void rule__GetDigits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2698:1: ( rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2699:2: rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__25614);
            rule__GetDigits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__25617);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2706:1: rule__GetDigits__Group__2__Impl : ( 'digits' ) ;
    public final void rule__GetDigits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2710:1: ( ( 'digits' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2711:1: ( 'digits' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2711:1: ( 'digits' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2712:1: 'digits'
            {
             before(grammarAccess.getGetDigitsAccess().getDigitsKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__GetDigits__Group__2__Impl5645); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2725:1: rule__GetDigits__Group__3 : rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4 ;
    public final void rule__GetDigits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2729:1: ( rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2730:2: rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__35676);
            rule__GetDigits__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__4_in_rule__GetDigits__Group__35679);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2737:1: rule__GetDigits__Group__3__Impl : ( ( rule__GetDigits__QuestionAssignment_3 ) ) ;
    public final void rule__GetDigits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2741:1: ( ( ( rule__GetDigits__QuestionAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2742:1: ( ( rule__GetDigits__QuestionAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2742:1: ( ( rule__GetDigits__QuestionAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2743:1: ( rule__GetDigits__QuestionAssignment_3 )
            {
             before(grammarAccess.getGetDigitsAccess().getQuestionAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:1: ( rule__GetDigits__QuestionAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:2: rule__GetDigits__QuestionAssignment_3
            {
            pushFollow(FOLLOW_rule__GetDigits__QuestionAssignment_3_in_rule__GetDigits__Group__3__Impl5706);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2754:1: rule__GetDigits__Group__4 : rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5 ;
    public final void rule__GetDigits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2758:1: ( rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2759:2: rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__4__Impl_in_rule__GetDigits__Group__45736);
            rule__GetDigits__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__5_in_rule__GetDigits__Group__45739);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2766:1: rule__GetDigits__Group__4__Impl : ( '->' ) ;
    public final void rule__GetDigits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2770:1: ( ( '->' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2771:1: ( '->' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2771:1: ( '->' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2772:1: '->'
            {
             before(grammarAccess.getGetDigitsAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__GetDigits__Group__4__Impl5767); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2785:1: rule__GetDigits__Group__5 : rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6 ;
    public final void rule__GetDigits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2789:1: ( rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2790:2: rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__5__Impl_in_rule__GetDigits__Group__55798);
            rule__GetDigits__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__6_in_rule__GetDigits__Group__55801);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2797:1: rule__GetDigits__Group__5__Impl : ( ( rule__GetDigits__NameAssignment_5 ) ) ;
    public final void rule__GetDigits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2801:1: ( ( ( rule__GetDigits__NameAssignment_5 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2802:1: ( ( rule__GetDigits__NameAssignment_5 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2802:1: ( ( rule__GetDigits__NameAssignment_5 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2803:1: ( rule__GetDigits__NameAssignment_5 )
            {
             before(grammarAccess.getGetDigitsAccess().getNameAssignment_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2804:1: ( rule__GetDigits__NameAssignment_5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2804:2: rule__GetDigits__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__GetDigits__NameAssignment_5_in_rule__GetDigits__Group__5__Impl5828);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2814:1: rule__GetDigits__Group__6 : rule__GetDigits__Group__6__Impl ;
    public final void rule__GetDigits__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2818:1: ( rule__GetDigits__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2819:2: rule__GetDigits__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__6__Impl_in_rule__GetDigits__Group__65858);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2825:1: rule__GetDigits__Group__6__Impl : ( ';' ) ;
    public final void rule__GetDigits__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2829:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2830:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2830:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2831:1: ';'
            {
             before(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__GetDigits__Group__6__Impl5886); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2858:1: rule__Ask__Group__0 : rule__Ask__Group__0__Impl rule__Ask__Group__1 ;
    public final void rule__Ask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2862:1: ( rule__Ask__Group__0__Impl rule__Ask__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2863:2: rule__Ask__Group__0__Impl rule__Ask__Group__1
            {
            pushFollow(FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__05931);
            rule__Ask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__05934);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2870:1: rule__Ask__Group__0__Impl : ( 'ask' ) ;
    public final void rule__Ask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2874:1: ( ( 'ask' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2875:1: ( 'ask' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2875:1: ( 'ask' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2876:1: 'ask'
            {
             before(grammarAccess.getAskAccess().getAskKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Ask__Group__0__Impl5962); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2889:1: rule__Ask__Group__1 : rule__Ask__Group__1__Impl rule__Ask__Group__2 ;
    public final void rule__Ask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2893:1: ( rule__Ask__Group__1__Impl rule__Ask__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2894:2: rule__Ask__Group__1__Impl rule__Ask__Group__2
            {
            pushFollow(FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__15993);
            rule__Ask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__15996);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2901:1: rule__Ask__Group__1__Impl : ( ( rule__Ask__QuestionAssignment_1 ) ) ;
    public final void rule__Ask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2905:1: ( ( ( rule__Ask__QuestionAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2906:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2906:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2907:1: ( rule__Ask__QuestionAssignment_1 )
            {
             before(grammarAccess.getAskAccess().getQuestionAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2908:1: ( rule__Ask__QuestionAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2908:2: rule__Ask__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6023);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2918:1: rule__Ask__Group__2 : rule__Ask__Group__2__Impl rule__Ask__Group__3 ;
    public final void rule__Ask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2922:1: ( rule__Ask__Group__2__Impl rule__Ask__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2923:2: rule__Ask__Group__2__Impl rule__Ask__Group__3
            {
            pushFollow(FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26053);
            rule__Ask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__3_in_rule__Ask__Group__26056);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2930:1: rule__Ask__Group__2__Impl : ( '->' ) ;
    public final void rule__Ask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2934:1: ( ( '->' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2935:1: ( '->' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2935:1: ( '->' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2936:1: '->'
            {
             before(grammarAccess.getAskAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Ask__Group__2__Impl6084); 
             after(grammarAccess.getAskAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2949:1: rule__Ask__Group__3 : rule__Ask__Group__3__Impl rule__Ask__Group__4 ;
    public final void rule__Ask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2953:1: ( rule__Ask__Group__3__Impl rule__Ask__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2954:2: rule__Ask__Group__3__Impl rule__Ask__Group__4
            {
            pushFollow(FOLLOW_rule__Ask__Group__3__Impl_in_rule__Ask__Group__36115);
            rule__Ask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__4_in_rule__Ask__Group__36118);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2961:1: rule__Ask__Group__3__Impl : ( ( rule__Ask__NameAssignment_3 ) ) ;
    public final void rule__Ask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2965:1: ( ( ( rule__Ask__NameAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2966:1: ( ( rule__Ask__NameAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2966:1: ( ( rule__Ask__NameAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2967:1: ( rule__Ask__NameAssignment_3 )
            {
             before(grammarAccess.getAskAccess().getNameAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2968:1: ( rule__Ask__NameAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2968:2: rule__Ask__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Ask__NameAssignment_3_in_rule__Ask__Group__3__Impl6145);
            rule__Ask__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2978:1: rule__Ask__Group__4 : rule__Ask__Group__4__Impl ;
    public final void rule__Ask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2982:1: ( rule__Ask__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2983:2: rule__Ask__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ask__Group__4__Impl_in_rule__Ask__Group__46175);
            rule__Ask__Group__4__Impl();

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2989:1: rule__Ask__Group__4__Impl : ( ';' ) ;
    public final void rule__Ask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2993:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2994:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2994:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2995:1: ';'
            {
             before(grammarAccess.getAskAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Ask__Group__4__Impl6203); 
             after(grammarAccess.getAskAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Send__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3018:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3022:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3023:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06244);
            rule__Send__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06247);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3030:1: rule__Send__Group__0__Impl : ( 'send' ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3034:1: ( ( 'send' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3035:1: ( 'send' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3035:1: ( 'send' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3036:1: 'send'
            {
             before(grammarAccess.getSendAccess().getSendKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Send__Group__0__Impl6275); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3049:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3053:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3054:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16306);
            rule__Send__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16309);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3061:1: rule__Send__Group__1__Impl : ( ( rule__Send__ParamsAssignment_1 ) ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3065:1: ( ( ( rule__Send__ParamsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3066:1: ( ( rule__Send__ParamsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3066:1: ( ( rule__Send__ParamsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3067:1: ( rule__Send__ParamsAssignment_1 )
            {
             before(grammarAccess.getSendAccess().getParamsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3068:1: ( rule__Send__ParamsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3068:2: rule__Send__ParamsAssignment_1
            {
            pushFollow(FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6336);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3078:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3082:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3083:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26366);
            rule__Send__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26369);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3090:1: rule__Send__Group__2__Impl : ( 'to' ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3094:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3095:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3095:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3096:1: 'to'
            {
             before(grammarAccess.getSendAccess().getToKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Send__Group__2__Impl6397); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3109:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3113:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3114:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36428);
            rule__Send__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36431);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3121:1: rule__Send__Group__3__Impl : ( ( rule__Send__UrlAssignment_3 ) ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3125:1: ( ( ( rule__Send__UrlAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3126:1: ( ( rule__Send__UrlAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3126:1: ( ( rule__Send__UrlAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3127:1: ( rule__Send__UrlAssignment_3 )
            {
             before(grammarAccess.getSendAccess().getUrlAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3128:1: ( rule__Send__UrlAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3128:2: rule__Send__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6458);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3138:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3142:1: ( rule__Send__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3143:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46488);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3149:1: rule__Send__Group__4__Impl : ( ';' ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3153:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3154:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3154:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3155:1: ';'
            {
             before(grammarAccess.getSendAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Send__Group__4__Impl6516); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3178:1: rule__SendBlock__Group__0 : rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 ;
    public final void rule__SendBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3182:1: ( rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3183:2: rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06557);
            rule__SendBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06560);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3190:1: rule__SendBlock__Group__0__Impl : ( () ) ;
    public final void rule__SendBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3194:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3195:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3195:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3196:1: ()
            {
             before(grammarAccess.getSendBlockAccess().getSendBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3197:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3199:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3209:1: rule__SendBlock__Group__1 : rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 ;
    public final void rule__SendBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3213:1: ( rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3214:2: rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16618);
            rule__SendBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16621);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3221:1: rule__SendBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SendBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3225:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3226:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3226:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3227:1: '{'
            {
             before(grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__SendBlock__Group__1__Impl6649); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3240:1: rule__SendBlock__Group__2 : rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 ;
    public final void rule__SendBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3244:1: ( rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3245:2: rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26680);
            rule__SendBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26683);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3252:1: rule__SendBlock__Group__2__Impl : ( ( rule__SendBlock__ValueAssignment_2 ) ) ;
    public final void rule__SendBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3256:1: ( ( ( rule__SendBlock__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3257:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3257:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3258:1: ( rule__SendBlock__ValueAssignment_2 )
            {
             before(grammarAccess.getSendBlockAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3259:1: ( rule__SendBlock__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3259:2: rule__SendBlock__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6710);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3269:1: rule__SendBlock__Group__3 : rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 ;
    public final void rule__SendBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3273:1: ( rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3274:2: rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36740);
            rule__SendBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36743);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3281:1: rule__SendBlock__Group__3__Impl : ( ( rule__SendBlock__StmsAssignment_3 )* ) ;
    public final void rule__SendBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3285:1: ( ( ( rule__SendBlock__StmsAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3286:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3286:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3287:1: ( rule__SendBlock__StmsAssignment_3 )*
            {
             before(grammarAccess.getSendBlockAccess().getStmsAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3288:1: ( rule__SendBlock__StmsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3288:2: rule__SendBlock__StmsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6770);
            	    rule__SendBlock__StmsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3298:1: rule__SendBlock__Group__4 : rule__SendBlock__Group__4__Impl ;
    public final void rule__SendBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3302:1: ( rule__SendBlock__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3303:2: rule__SendBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__46801);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3309:1: rule__SendBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SendBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3313:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3314:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3314:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3315:1: '}'
            {
             before(grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__SendBlock__Group__4__Impl6829); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3338:1: rule__NotPrimaryParam__Group__0 : rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 ;
    public final void rule__NotPrimaryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3342:1: ( rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3343:2: rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__06870);
            rule__NotPrimaryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__06873);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3350:1: rule__NotPrimaryParam__Group__0__Impl : ( ',' ) ;
    public final void rule__NotPrimaryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3354:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3355:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3355:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3356:1: ','
            {
             before(grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__NotPrimaryParam__Group__0__Impl6901); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3369:1: rule__NotPrimaryParam__Group__1 : rule__NotPrimaryParam__Group__1__Impl ;
    public final void rule__NotPrimaryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3373:1: ( rule__NotPrimaryParam__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3374:2: rule__NotPrimaryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__16932);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3380:1: rule__NotPrimaryParam__Group__1__Impl : ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) ;
    public final void rule__NotPrimaryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3384:1: ( ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3385:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3385:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3386:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3387:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3387:2: rule__NotPrimaryParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl6959);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3401:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3405:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3406:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__06993);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__06996);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3413:1: rule__Param__Group__0__Impl : ( ( rule__Param__ParamNameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3417:1: ( ( ( rule__Param__ParamNameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3418:1: ( ( rule__Param__ParamNameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3418:1: ( ( rule__Param__ParamNameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3419:1: ( rule__Param__ParamNameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getParamNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3420:1: ( rule__Param__ParamNameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3420:2: rule__Param__ParamNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__ParamNameAssignment_0_in_rule__Param__Group__0__Impl7023);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3430:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3434:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3435:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17053);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17056);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3442:1: rule__Param__Group__1__Impl : ( '=>' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3446:1: ( ( '=>' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3447:1: ( '=>' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3447:1: ( '=>' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3448:1: '=>'
            {
             before(grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__Param__Group__1__Impl7084); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3461:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3465:1: ( rule__Param__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3466:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27115);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3472:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3476:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3477:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3477:1: ( ( rule__Param__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3478:1: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3479:1: ( rule__Param__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3479:2: rule__Param__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7142);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3495:1: rule__Say__Group__0 : rule__Say__Group__0__Impl rule__Say__Group__1 ;
    public final void rule__Say__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3499:1: ( rule__Say__Group__0__Impl rule__Say__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3500:2: rule__Say__Group__0__Impl rule__Say__Group__1
            {
            pushFollow(FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07178);
            rule__Say__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07181);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3507:1: rule__Say__Group__0__Impl : ( 'say' ) ;
    public final void rule__Say__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3511:1: ( ( 'say' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3512:1: ( 'say' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3512:1: ( 'say' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3513:1: 'say'
            {
             before(grammarAccess.getSayAccess().getSayKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Say__Group__0__Impl7209); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3526:1: rule__Say__Group__1 : rule__Say__Group__1__Impl rule__Say__Group__2 ;
    public final void rule__Say__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3530:1: ( rule__Say__Group__1__Impl rule__Say__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3531:2: rule__Say__Group__1__Impl rule__Say__Group__2
            {
            pushFollow(FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17240);
            rule__Say__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17243);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3538:1: rule__Say__Group__1__Impl : ( ( rule__Say__ThatAssignment_1 ) ) ;
    public final void rule__Say__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3542:1: ( ( ( rule__Say__ThatAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3543:1: ( ( rule__Say__ThatAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3543:1: ( ( rule__Say__ThatAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3544:1: ( rule__Say__ThatAssignment_1 )
            {
             before(grammarAccess.getSayAccess().getThatAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3545:1: ( rule__Say__ThatAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3545:2: rule__Say__ThatAssignment_1
            {
            pushFollow(FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7270);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3555:1: rule__Say__Group__2 : rule__Say__Group__2__Impl ;
    public final void rule__Say__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3559:1: ( rule__Say__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3560:2: rule__Say__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27300);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3566:1: rule__Say__Group__2__Impl : ( ';' ) ;
    public final void rule__Say__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3570:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3571:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3571:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3572:1: ';'
            {
             before(grammarAccess.getSayAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Say__Group__2__Impl7328); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3591:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3595:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3596:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07365);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07368);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3603:1: rule__Transition__Group__0__Impl : ( 'goTo' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3607:1: ( ( 'goTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3608:1: ( 'goTo' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3608:1: ( 'goTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3609:1: 'goTo'
            {
             before(grammarAccess.getTransitionAccess().getGoToKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Transition__Group__0__Impl7396); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3622:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3626:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3627:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17427);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17430);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3634:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TargetAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3638:1: ( ( ( rule__Transition__TargetAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3639:1: ( ( rule__Transition__TargetAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3639:1: ( ( rule__Transition__TargetAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3640:1: ( rule__Transition__TargetAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3641:1: ( rule__Transition__TargetAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3641:2: rule__Transition__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl7457);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3651:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3655:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3656:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__27487);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__27490);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3663:1: rule__Transition__Group__2__Impl : ( 'when' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3667:1: ( ( 'when' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3668:1: ( 'when' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3668:1: ( 'when' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3669:1: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__Transition__Group__2__Impl7518); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3682:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3686:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3687:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__37549);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__37552);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3694:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__EventAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3698:1: ( ( ( rule__Transition__EventAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3699:1: ( ( rule__Transition__EventAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3699:1: ( ( rule__Transition__EventAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3700:1: ( rule__Transition__EventAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3701:1: ( rule__Transition__EventAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3701:2: rule__Transition__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl7579);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3711:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3715:1: ( rule__Transition__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3716:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__47609);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3722:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3726:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3727:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3727:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3728:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Transition__Group__4__Impl7637); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3751:1: rule__IfExp__Group__0 : rule__IfExp__Group__0__Impl rule__IfExp__Group__1 ;
    public final void rule__IfExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3755:1: ( rule__IfExp__Group__0__Impl rule__IfExp__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3756:2: rule__IfExp__Group__0__Impl rule__IfExp__Group__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__07678);
            rule__IfExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__07681);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3763:1: rule__IfExp__Group__0__Impl : ( ( rule__IfExp__BlockAssignment_0 ) ) ;
    public final void rule__IfExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3767:1: ( ( ( rule__IfExp__BlockAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3768:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3768:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3769:1: ( rule__IfExp__BlockAssignment_0 )
            {
             before(grammarAccess.getIfExpAccess().getBlockAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3770:1: ( rule__IfExp__BlockAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3770:2: rule__IfExp__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl7708);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3780:1: rule__IfExp__Group__1 : rule__IfExp__Group__1__Impl rule__IfExp__Group__2 ;
    public final void rule__IfExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3784:1: ( rule__IfExp__Group__1__Impl rule__IfExp__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3785:2: rule__IfExp__Group__1__Impl rule__IfExp__Group__2
            {
            pushFollow(FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__17738);
            rule__IfExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__17741);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3792:1: rule__IfExp__Group__1__Impl : ( ( rule__IfExp__Group_1__0 )* ) ;
    public final void rule__IfExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3796:1: ( ( ( rule__IfExp__Group_1__0 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3797:1: ( ( rule__IfExp__Group_1__0 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3797:1: ( ( rule__IfExp__Group_1__0 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3798:1: ( rule__IfExp__Group_1__0 )*
            {
             before(grammarAccess.getIfExpAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3799:1: ( rule__IfExp__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==47) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==48) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3799:2: rule__IfExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl7768);
            	    rule__IfExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3809:1: rule__IfExp__Group__2 : rule__IfExp__Group__2__Impl ;
    public final void rule__IfExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3813:1: ( rule__IfExp__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3814:2: rule__IfExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__27799);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3820:1: rule__IfExp__Group__2__Impl : ( ( rule__IfExp__Group_2__0 )? ) ;
    public final void rule__IfExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3824:1: ( ( ( rule__IfExp__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3825:1: ( ( rule__IfExp__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3825:1: ( ( rule__IfExp__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3826:1: ( rule__IfExp__Group_2__0 )?
            {
             before(grammarAccess.getIfExpAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3827:1: ( rule__IfExp__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3827:2: rule__IfExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl7826);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3843:1: rule__IfExp__Group_1__0 : rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 ;
    public final void rule__IfExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3847:1: ( rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3848:2: rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__07863);
            rule__IfExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__07866);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3855:1: rule__IfExp__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3859:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3860:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3860:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3861:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__IfExp__Group_1__0__Impl7894); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3874:1: rule__IfExp__Group_1__1 : rule__IfExp__Group_1__1__Impl ;
    public final void rule__IfExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3878:1: ( rule__IfExp__Group_1__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3879:2: rule__IfExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__17925);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3885:1: rule__IfExp__Group_1__1__Impl : ( ( rule__IfExp__BlocksAssignment_1_1 ) ) ;
    public final void rule__IfExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3889:1: ( ( ( rule__IfExp__BlocksAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3890:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3890:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3891:1: ( rule__IfExp__BlocksAssignment_1_1 )
            {
             before(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3892:1: ( rule__IfExp__BlocksAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3892:2: rule__IfExp__BlocksAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl7952);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3906:1: rule__IfExp__Group_2__0 : rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 ;
    public final void rule__IfExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3910:1: ( rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3911:2: rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__07986);
            rule__IfExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__07989);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3918:1: rule__IfExp__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3922:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3923:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3923:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3924:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__IfExp__Group_2__0__Impl8017); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3937:1: rule__IfExp__Group_2__1 : rule__IfExp__Group_2__1__Impl ;
    public final void rule__IfExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3941:1: ( rule__IfExp__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3942:2: rule__IfExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__18048);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3948:1: rule__IfExp__Group_2__1__Impl : ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) ;
    public final void rule__IfExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3952:1: ( ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3953:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3953:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3954:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3955:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3955:2: rule__IfExp__DefaultBlockAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl8075);
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


    // $ANTLR start "rule__CondBlock__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3969:1: rule__CondBlock__Group__0 : rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 ;
    public final void rule__CondBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3973:1: ( rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3974:2: rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__08109);
            rule__CondBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__08112);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3981:1: rule__CondBlock__Group__0__Impl : ( 'if' ) ;
    public final void rule__CondBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3985:1: ( ( 'if' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3986:1: ( 'if' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3986:1: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3987:1: 'if'
            {
             before(grammarAccess.getCondBlockAccess().getIfKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__CondBlock__Group__0__Impl8140); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4000:1: rule__CondBlock__Group__1 : rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 ;
    public final void rule__CondBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4004:1: ( rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4005:2: rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__18171);
            rule__CondBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__18174);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4012:1: rule__CondBlock__Group__1__Impl : ( ( rule__CondBlock__CondAssignment_1 ) ) ;
    public final void rule__CondBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4016:1: ( ( ( rule__CondBlock__CondAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4017:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4017:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4018:1: ( rule__CondBlock__CondAssignment_1 )
            {
             before(grammarAccess.getCondBlockAccess().getCondAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4019:1: ( rule__CondBlock__CondAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4019:2: rule__CondBlock__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl8201);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4029:1: rule__CondBlock__Group__2 : rule__CondBlock__Group__2__Impl ;
    public final void rule__CondBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4033:1: ( rule__CondBlock__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4034:2: rule__CondBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__28231);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4040:1: rule__CondBlock__Group__2__Impl : ( ( rule__CondBlock__ActionAssignment_2 ) ) ;
    public final void rule__CondBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4044:1: ( ( ( rule__CondBlock__ActionAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4045:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4045:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4046:1: ( rule__CondBlock__ActionAssignment_2 )
            {
             before(grammarAccess.getCondBlockAccess().getActionAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4047:1: ( rule__CondBlock__ActionAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4047:2: rule__CondBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl8258);
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


    // $ANTLR start "rule__Block__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4063:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4067:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4068:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08294);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08297);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4075:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4079:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4080:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4080:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4081:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4082:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4084:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4094:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4098:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4099:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18355);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18358);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4106:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4110:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4111:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4111:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4112:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Block__Group__1__Impl8386); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4125:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4129:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4130:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28417);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28420);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4137:1: rule__Block__Group__2__Impl : ( ( rule__Block__StaAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4141:1: ( ( ( rule__Block__StaAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4142:1: ( ( rule__Block__StaAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4142:1: ( ( rule__Block__StaAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4143:1: ( rule__Block__StaAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getStaAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4144:1: ( rule__Block__StaAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_ML_COMMENT)||LA19_0==29||(LA19_0>=31 && LA19_0<=33)||LA19_0==37||(LA19_0>=39 && LA19_0<=40)||(LA19_0>=44 && LA19_0<=45)||(LA19_0>=48 && LA19_0<=49)||(LA19_0>=51 && LA19_0<=54)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4144:2: rule__Block__StaAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl8447);
            	    rule__Block__StaAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStaAssignment_2()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4154:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4158:1: ( rule__Block__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4159:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38478);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4165:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4169:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4170:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4170:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4171:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Block__Group__3__Impl8506); 
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


    // $ANTLR start "rule__BoolExpression__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4192:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4196:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4197:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__08545);
            rule__BoolExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__08548);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4204:1: rule__BoolExpression__Group__0__Impl : ( ruleTerminalBoolExpression ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4208:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4209:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4209:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4210:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl8575);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4221:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4225:1: ( rule__BoolExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4226:2: rule__BoolExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__18604);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4232:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4236:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4237:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4237:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4238:1: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4239:1: ( rule__BoolExpression__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LOGIC_WORD) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4239:2: rule__BoolExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl8631);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4253:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4257:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4258:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__08666);
            rule__BoolExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__08669);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4265:1: rule__BoolExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4269:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4270:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4270:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4271:1: ()
            {
             before(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4272:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4274:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4284:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4288:1: ( rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4289:2: rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__18727);
            rule__BoolExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__18730);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4296:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4300:1: ( ( ( rule__BoolExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4301:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4301:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4302:1: ( rule__BoolExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4303:1: ( rule__BoolExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4303:2: rule__BoolExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl8757);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4313:1: rule__BoolExpression__Group_1__2 : rule__BoolExpression__Group_1__2__Impl ;
    public final void rule__BoolExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4317:1: ( rule__BoolExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4318:2: rule__BoolExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__28787);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4324:1: rule__BoolExpression__Group_1__2__Impl : ( ( rule__BoolExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4328:1: ( ( ( rule__BoolExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4329:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4329:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4330:1: ( rule__BoolExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4331:1: ( rule__BoolExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4331:2: rule__BoolExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl8814);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4347:1: rule__Brackets__Group__0 : rule__Brackets__Group__0__Impl rule__Brackets__Group__1 ;
    public final void rule__Brackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4351:1: ( rule__Brackets__Group__0__Impl rule__Brackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4352:2: rule__Brackets__Group__0__Impl rule__Brackets__Group__1
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__08850);
            rule__Brackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__08853);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4359:1: rule__Brackets__Group__0__Impl : ( ( rule__Brackets__OpenAssignment_0 ) ) ;
    public final void rule__Brackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4363:1: ( ( ( rule__Brackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4364:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4364:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4365:1: ( rule__Brackets__OpenAssignment_0 )
            {
             before(grammarAccess.getBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4366:1: ( rule__Brackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4366:2: rule__Brackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl8880);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4376:1: rule__Brackets__Group__1 : rule__Brackets__Group__1__Impl rule__Brackets__Group__2 ;
    public final void rule__Brackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4380:1: ( rule__Brackets__Group__1__Impl rule__Brackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4381:2: rule__Brackets__Group__1__Impl rule__Brackets__Group__2
            {
            pushFollow(FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__18910);
            rule__Brackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__18913);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4388:1: rule__Brackets__Group__1__Impl : ( ( rule__Brackets__ObjAssignment_1 ) ) ;
    public final void rule__Brackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4392:1: ( ( ( rule__Brackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4393:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4393:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4394:1: ( rule__Brackets__ObjAssignment_1 )
            {
             before(grammarAccess.getBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4395:1: ( rule__Brackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4395:2: rule__Brackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl8940);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4405:1: rule__Brackets__Group__2 : rule__Brackets__Group__2__Impl ;
    public final void rule__Brackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4409:1: ( rule__Brackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4410:2: rule__Brackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__28970);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4416:1: rule__Brackets__Group__2__Impl : ( ( rule__Brackets__CloseAssignment_2 ) ) ;
    public final void rule__Brackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4420:1: ( ( ( rule__Brackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4421:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4421:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4422:1: ( rule__Brackets__CloseAssignment_2 )
            {
             before(grammarAccess.getBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4423:1: ( rule__Brackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4423:2: rule__Brackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl8997);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4439:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4443:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4444:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__09033);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__09036);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4451:1: rule__CompareExpression__Group__0__Impl : ( ( rule__CompareExpression__LeftAssignment_0 ) ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4455:1: ( ( ( rule__CompareExpression__LeftAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4456:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4456:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4457:1: ( rule__CompareExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4458:1: ( rule__CompareExpression__LeftAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4458:2: rule__CompareExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl9063);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4468:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4472:1: ( rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4473:2: rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__19093);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__19096);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4480:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__OpAssignment_1 ) ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4484:1: ( ( ( rule__CompareExpression__OpAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4485:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4485:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4486:1: ( rule__CompareExpression__OpAssignment_1 )
            {
             before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4487:1: ( rule__CompareExpression__OpAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4487:2: rule__CompareExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl9123);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4497:1: rule__CompareExpression__Group__2 : rule__CompareExpression__Group__2__Impl ;
    public final void rule__CompareExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4501:1: ( rule__CompareExpression__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4502:2: rule__CompareExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__29153);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4508:1: rule__CompareExpression__Group__2__Impl : ( ( rule__CompareExpression__RightAssignment_2 ) ) ;
    public final void rule__CompareExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4512:1: ( ( ( rule__CompareExpression__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4513:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4513:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4514:1: ( rule__CompareExpression__RightAssignment_2 )
            {
             before(grammarAccess.getCompareExpressionAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4515:1: ( rule__CompareExpression__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4515:2: rule__CompareExpression__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl9180);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4531:1: rule__NegExpression__Group__0 : rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 ;
    public final void rule__NegExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4535:1: ( rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4536:2: rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__09216);
            rule__NegExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__09219);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4543:1: rule__NegExpression__Group__0__Impl : ( ( rule__NegExpression__OpAssignment_0 ) ) ;
    public final void rule__NegExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4547:1: ( ( ( rule__NegExpression__OpAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4548:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4548:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4549:1: ( rule__NegExpression__OpAssignment_0 )
            {
             before(grammarAccess.getNegExpressionAccess().getOpAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4550:1: ( rule__NegExpression__OpAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4550:2: rule__NegExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl9246);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4560:1: rule__NegExpression__Group__1 : rule__NegExpression__Group__1__Impl ;
    public final void rule__NegExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4564:1: ( rule__NegExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4565:2: rule__NegExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__19276);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4571:1: rule__NegExpression__Group__1__Impl : ( ( rule__NegExpression__ObjAssignment_1 ) ) ;
    public final void rule__NegExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4575:1: ( ( ( rule__NegExpression__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4576:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4576:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4577:1: ( rule__NegExpression__ObjAssignment_1 )
            {
             before(grammarAccess.getNegExpressionAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4578:1: ( rule__NegExpression__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4578:2: rule__NegExpression__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl9303);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4592:1: rule__MathExpression__Group__0 : rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 ;
    public final void rule__MathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4596:1: ( rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4597:2: rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__09337);
            rule__MathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__09340);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4604:1: rule__MathExpression__Group__0__Impl : ( ruleMathTerminal ) ;
    public final void rule__MathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4608:1: ( ( ruleMathTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4609:1: ( ruleMathTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4609:1: ( ruleMathTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4610:1: ruleMathTerminal
            {
             before(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl9367);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4621:1: rule__MathExpression__Group__1 : rule__MathExpression__Group__1__Impl ;
    public final void rule__MathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4625:1: ( rule__MathExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4626:2: rule__MathExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__19396);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4632:1: rule__MathExpression__Group__1__Impl : ( ( rule__MathExpression__Group_1__0 )? ) ;
    public final void rule__MathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4636:1: ( ( ( rule__MathExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4637:1: ( ( rule__MathExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4637:1: ( ( rule__MathExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4638:1: ( rule__MathExpression__Group_1__0 )?
            {
             before(grammarAccess.getMathExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4639:1: ( rule__MathExpression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_MATH) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4639:2: rule__MathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl9423);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4653:1: rule__MathExpression__Group_1__0 : rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 ;
    public final void rule__MathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4657:1: ( rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4658:2: rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__09458);
            rule__MathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__09461);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4665:1: rule__MathExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4669:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4670:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4670:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4671:1: ()
            {
             before(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4672:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4674:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4684:1: rule__MathExpression__Group_1__1 : rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 ;
    public final void rule__MathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4688:1: ( rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4689:2: rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__19519);
            rule__MathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__19522);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4696:1: rule__MathExpression__Group_1__1__Impl : ( ( rule__MathExpression__OpAssignment_1_1 ) ) ;
    public final void rule__MathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4700:1: ( ( ( rule__MathExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4701:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4701:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4702:1: ( rule__MathExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4703:1: ( rule__MathExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4703:2: rule__MathExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl9549);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4713:1: rule__MathExpression__Group_1__2 : rule__MathExpression__Group_1__2__Impl ;
    public final void rule__MathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4717:1: ( rule__MathExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4718:2: rule__MathExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__29579);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4724:1: rule__MathExpression__Group_1__2__Impl : ( ( rule__MathExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4728:1: ( ( ( rule__MathExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4729:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4729:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4730:1: ( rule__MathExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4731:1: ( rule__MathExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4731:2: rule__MathExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl9606);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4747:1: rule__MathBrackets__Group__0 : rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 ;
    public final void rule__MathBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4751:1: ( rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4752:2: rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__09642);
            rule__MathBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__09645);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4759:1: rule__MathBrackets__Group__0__Impl : ( ( rule__MathBrackets__OpenAssignment_0 ) ) ;
    public final void rule__MathBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4763:1: ( ( ( rule__MathBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4764:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4764:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4765:1: ( rule__MathBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getMathBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4766:1: ( rule__MathBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4766:2: rule__MathBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl9672);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4776:1: rule__MathBrackets__Group__1 : rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 ;
    public final void rule__MathBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4780:1: ( rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4781:2: rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__19702);
            rule__MathBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__19705);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4788:1: rule__MathBrackets__Group__1__Impl : ( ( rule__MathBrackets__ObjAssignment_1 ) ) ;
    public final void rule__MathBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4792:1: ( ( ( rule__MathBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4793:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4793:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4794:1: ( rule__MathBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getMathBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4795:1: ( rule__MathBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4795:2: rule__MathBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl9732);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4805:1: rule__MathBrackets__Group__2 : rule__MathBrackets__Group__2__Impl ;
    public final void rule__MathBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4809:1: ( rule__MathBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4810:2: rule__MathBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__29762);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4816:1: rule__MathBrackets__Group__2__Impl : ( ( rule__MathBrackets__CloseAssignment_2 ) ) ;
    public final void rule__MathBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4820:1: ( ( ( rule__MathBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4821:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4821:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4822:1: ( rule__MathBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getMathBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4823:1: ( rule__MathBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4823:2: rule__MathBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl9789);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4839:1: rule__ConcatenationExpression__Group__0 : rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 ;
    public final void rule__ConcatenationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4843:1: ( rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4844:2: rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__09825);
            rule__ConcatenationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__09828);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4851:1: rule__ConcatenationExpression__Group__0__Impl : ( ruleConcatenationTerminal ) ;
    public final void rule__ConcatenationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4855:1: ( ( ruleConcatenationTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4856:1: ( ruleConcatenationTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4856:1: ( ruleConcatenationTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4857:1: ruleConcatenationTerminal
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl9855);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4868:1: rule__ConcatenationExpression__Group__1 : rule__ConcatenationExpression__Group__1__Impl ;
    public final void rule__ConcatenationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4872:1: ( rule__ConcatenationExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4873:2: rule__ConcatenationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__19884);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4879:1: rule__ConcatenationExpression__Group__1__Impl : ( ( rule__ConcatenationExpression__Group_1__0 )? ) ;
    public final void rule__ConcatenationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4883:1: ( ( ( rule__ConcatenationExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4884:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4884:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4885:1: ( rule__ConcatenationExpression__Group_1__0 )?
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4886:1: ( rule__ConcatenationExpression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CONCATENATION) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4886:2: rule__ConcatenationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl9911);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4900:1: rule__ConcatenationExpression__Group_1__0 : rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 ;
    public final void rule__ConcatenationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4904:1: ( rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4905:2: rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__09946);
            rule__ConcatenationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__09949);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4912:1: rule__ConcatenationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatenationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4916:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4917:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4917:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4918:1: ()
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4919:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4921:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4931:1: rule__ConcatenationExpression__Group_1__1 : rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 ;
    public final void rule__ConcatenationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4935:1: ( rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4936:2: rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__110007);
            rule__ConcatenationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__110010);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4943:1: rule__ConcatenationExpression__Group_1__1__Impl : ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4947:1: ( ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4948:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4948:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4949:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4950:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4950:2: rule__ConcatenationExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl10037);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4960:1: rule__ConcatenationExpression__Group_1__2 : rule__ConcatenationExpression__Group_1__2__Impl ;
    public final void rule__ConcatenationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4964:1: ( rule__ConcatenationExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4965:2: rule__ConcatenationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__210067);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4971:1: rule__ConcatenationExpression__Group_1__2__Impl : ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4975:1: ( ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4976:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4976:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4977:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4978:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4978:2: rule__ConcatenationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl10094);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4994:1: rule__ConcatenationBrackets__Group__0 : rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 ;
    public final void rule__ConcatenationBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4998:1: ( rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4999:2: rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__010130);
            rule__ConcatenationBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__010133);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5006:1: rule__ConcatenationBrackets__Group__0__Impl : ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) ;
    public final void rule__ConcatenationBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5010:1: ( ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5011:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5011:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5012:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5013:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5013:2: rule__ConcatenationBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl10160);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5023:1: rule__ConcatenationBrackets__Group__1 : rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 ;
    public final void rule__ConcatenationBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5027:1: ( rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5028:2: rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__110190);
            rule__ConcatenationBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__110193);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5035:1: rule__ConcatenationBrackets__Group__1__Impl : ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) ;
    public final void rule__ConcatenationBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5039:1: ( ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5040:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5040:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5041:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5042:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5042:2: rule__ConcatenationBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl10220);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5052:1: rule__ConcatenationBrackets__Group__2 : rule__ConcatenationBrackets__Group__2__Impl ;
    public final void rule__ConcatenationBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5056:1: ( rule__ConcatenationBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5057:2: rule__ConcatenationBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__210250);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5063:1: rule__ConcatenationBrackets__Group__2__Impl : ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) ;
    public final void rule__ConcatenationBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5067:1: ( ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5068:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5068:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5069:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5070:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5070:2: rule__ConcatenationBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl10277);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5086:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5090:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5091:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__010313);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__010316);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5098:1: rule__StringVariable__Group__0__Impl : ( 'varString' ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5102:1: ( ( 'varString' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5103:1: ( 'varString' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5103:1: ( 'varString' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5104:1: 'varString'
            {
             before(grammarAccess.getStringVariableAccess().getVarStringKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__StringVariable__Group__0__Impl10344); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5117:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5121:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5122:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__110375);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__110378);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5129:1: rule__StringVariable__Group__1__Impl : ( ( rule__StringVariable__NameAssignment_1 ) ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5133:1: ( ( ( rule__StringVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5134:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5134:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5135:1: ( rule__StringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5136:1: ( rule__StringVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5136:2: rule__StringVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl10405);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5146:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5150:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5151:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__210435);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__210438);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5158:1: rule__StringVariable__Group__2__Impl : ( ( rule__StringVariable__Group_2__0 )? ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5162:1: ( ( ( rule__StringVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5163:1: ( ( rule__StringVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5163:1: ( ( rule__StringVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5164:1: ( rule__StringVariable__Group_2__0 )?
            {
             before(grammarAccess.getStringVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5165:1: ( rule__StringVariable__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5165:2: rule__StringVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl10465);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5175:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5179:1: ( rule__StringVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5180:2: rule__StringVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__310496);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5186:1: rule__StringVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5190:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5191:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5191:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5192:1: ';'
            {
             before(grammarAccess.getStringVariableAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__StringVariable__Group__3__Impl10524); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5213:1: rule__StringVariable__Group_2__0 : rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 ;
    public final void rule__StringVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5217:1: ( rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5218:2: rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__010563);
            rule__StringVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__010566);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5225:1: rule__StringVariable__Group_2__0__Impl : ( '=' ) ;
    public final void rule__StringVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5229:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5230:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5230:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5231:1: '='
            {
             before(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__StringVariable__Group_2__0__Impl10594); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5244:1: rule__StringVariable__Group_2__1 : rule__StringVariable__Group_2__1__Impl ;
    public final void rule__StringVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5248:1: ( rule__StringVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5249:2: rule__StringVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__110625);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5255:1: rule__StringVariable__Group_2__1__Impl : ( ( rule__StringVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__StringVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5259:1: ( ( ( rule__StringVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5260:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5260:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5261:1: ( rule__StringVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getStringVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5262:1: ( rule__StringVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5262:2: rule__StringVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl10652);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5276:1: rule__NumVariable__Group__0 : rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 ;
    public final void rule__NumVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5280:1: ( rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5281:2: rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__010686);
            rule__NumVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__010689);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5288:1: rule__NumVariable__Group__0__Impl : ( 'varNum' ) ;
    public final void rule__NumVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5292:1: ( ( 'varNum' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5293:1: ( 'varNum' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5293:1: ( 'varNum' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5294:1: 'varNum'
            {
             before(grammarAccess.getNumVariableAccess().getVarNumKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__NumVariable__Group__0__Impl10717); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5307:1: rule__NumVariable__Group__1 : rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 ;
    public final void rule__NumVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5311:1: ( rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5312:2: rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__110748);
            rule__NumVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__110751);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5319:1: rule__NumVariable__Group__1__Impl : ( ( rule__NumVariable__NameAssignment_1 ) ) ;
    public final void rule__NumVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5323:1: ( ( ( rule__NumVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5324:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5324:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5325:1: ( rule__NumVariable__NameAssignment_1 )
            {
             before(grammarAccess.getNumVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5326:1: ( rule__NumVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5326:2: rule__NumVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl10778);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5336:1: rule__NumVariable__Group__2 : rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 ;
    public final void rule__NumVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5340:1: ( rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5341:2: rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__210808);
            rule__NumVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__210811);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5348:1: rule__NumVariable__Group__2__Impl : ( ( rule__NumVariable__Group_2__0 )? ) ;
    public final void rule__NumVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5352:1: ( ( ( rule__NumVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5353:1: ( ( rule__NumVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5353:1: ( ( rule__NumVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5354:1: ( rule__NumVariable__Group_2__0 )?
            {
             before(grammarAccess.getNumVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5355:1: ( rule__NumVariable__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5355:2: rule__NumVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl10838);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5365:1: rule__NumVariable__Group__3 : rule__NumVariable__Group__3__Impl ;
    public final void rule__NumVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5369:1: ( rule__NumVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5370:2: rule__NumVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__310869);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5376:1: rule__NumVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__NumVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5380:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5381:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5381:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5382:1: ';'
            {
             before(grammarAccess.getNumVariableAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__NumVariable__Group__3__Impl10897); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5403:1: rule__NumVariable__Group_2__0 : rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 ;
    public final void rule__NumVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5407:1: ( rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5408:2: rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__010936);
            rule__NumVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__010939);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5415:1: rule__NumVariable__Group_2__0__Impl : ( '=' ) ;
    public final void rule__NumVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5419:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5420:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5420:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5421:1: '='
            {
             before(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__NumVariable__Group_2__0__Impl10967); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5434:1: rule__NumVariable__Group_2__1 : rule__NumVariable__Group_2__1__Impl ;
    public final void rule__NumVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5438:1: ( rule__NumVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5439:2: rule__NumVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__110998);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5445:1: rule__NumVariable__Group_2__1__Impl : ( ( rule__NumVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__NumVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5449:1: ( ( ( rule__NumVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5450:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5450:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5451:1: ( rule__NumVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNumVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5452:1: ( rule__NumVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5452:2: rule__NumVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl11025);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5466:1: rule__BoolVariable__Group__0 : rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 ;
    public final void rule__BoolVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5470:1: ( rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5471:2: rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__011059);
            rule__BoolVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__011062);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5478:1: rule__BoolVariable__Group__0__Impl : ( 'varBool' ) ;
    public final void rule__BoolVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5482:1: ( ( 'varBool' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5483:1: ( 'varBool' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5483:1: ( 'varBool' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5484:1: 'varBool'
            {
             before(grammarAccess.getBoolVariableAccess().getVarBoolKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__BoolVariable__Group__0__Impl11090); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5497:1: rule__BoolVariable__Group__1 : rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 ;
    public final void rule__BoolVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5501:1: ( rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5502:2: rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__111121);
            rule__BoolVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__111124);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5509:1: rule__BoolVariable__Group__1__Impl : ( ( rule__BoolVariable__NameAssignment_1 ) ) ;
    public final void rule__BoolVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5513:1: ( ( ( rule__BoolVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5514:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5514:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5515:1: ( rule__BoolVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5516:1: ( rule__BoolVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5516:2: rule__BoolVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl11151);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5526:1: rule__BoolVariable__Group__2 : rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 ;
    public final void rule__BoolVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5530:1: ( rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5531:2: rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__211181);
            rule__BoolVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__211184);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5538:1: rule__BoolVariable__Group__2__Impl : ( ( rule__BoolVariable__Group_2__0 )? ) ;
    public final void rule__BoolVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5542:1: ( ( ( rule__BoolVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5543:1: ( ( rule__BoolVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5543:1: ( ( rule__BoolVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5544:1: ( rule__BoolVariable__Group_2__0 )?
            {
             before(grammarAccess.getBoolVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5545:1: ( rule__BoolVariable__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5545:2: rule__BoolVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl11211);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5555:1: rule__BoolVariable__Group__3 : rule__BoolVariable__Group__3__Impl ;
    public final void rule__BoolVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5559:1: ( rule__BoolVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5560:2: rule__BoolVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__311242);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5566:1: rule__BoolVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__BoolVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5570:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5571:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5571:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5572:1: ';'
            {
             before(grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__BoolVariable__Group__3__Impl11270); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5593:1: rule__BoolVariable__Group_2__0 : rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 ;
    public final void rule__BoolVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5597:1: ( rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5598:2: rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__011309);
            rule__BoolVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__011312);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5605:1: rule__BoolVariable__Group_2__0__Impl : ( '=' ) ;
    public final void rule__BoolVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5609:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5610:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5610:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5611:1: '='
            {
             before(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0()); 
            match(input,50,FOLLOW_50_in_rule__BoolVariable__Group_2__0__Impl11340); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5624:1: rule__BoolVariable__Group_2__1 : rule__BoolVariable__Group_2__1__Impl ;
    public final void rule__BoolVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5628:1: ( rule__BoolVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5629:2: rule__BoolVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__111371);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5635:1: rule__BoolVariable__Group_2__1__Impl : ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__BoolVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5639:1: ( ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5640:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5640:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5641:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5642:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5642:2: rule__BoolVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl11398);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5656:1: rule__Assigment__Group__0 : rule__Assigment__Group__0__Impl rule__Assigment__Group__1 ;
    public final void rule__Assigment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5660:1: ( rule__Assigment__Group__0__Impl rule__Assigment__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5661:2: rule__Assigment__Group__0__Impl rule__Assigment__Group__1
            {
            pushFollow(FOLLOW_rule__Assigment__Group__0__Impl_in_rule__Assigment__Group__011432);
            rule__Assigment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigment__Group__1_in_rule__Assigment__Group__011435);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5668:1: rule__Assigment__Group__0__Impl : ( ( rule__Assigment__VaAssignment_0 ) ) ;
    public final void rule__Assigment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5672:1: ( ( ( rule__Assigment__VaAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5673:1: ( ( rule__Assigment__VaAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5673:1: ( ( rule__Assigment__VaAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5674:1: ( rule__Assigment__VaAssignment_0 )
            {
             before(grammarAccess.getAssigmentAccess().getVaAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5675:1: ( rule__Assigment__VaAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5675:2: rule__Assigment__VaAssignment_0
            {
            pushFollow(FOLLOW_rule__Assigment__VaAssignment_0_in_rule__Assigment__Group__0__Impl11462);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5685:1: rule__Assigment__Group__1 : rule__Assigment__Group__1__Impl rule__Assigment__Group__2 ;
    public final void rule__Assigment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5689:1: ( rule__Assigment__Group__1__Impl rule__Assigment__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5690:2: rule__Assigment__Group__1__Impl rule__Assigment__Group__2
            {
            pushFollow(FOLLOW_rule__Assigment__Group__1__Impl_in_rule__Assigment__Group__111492);
            rule__Assigment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigment__Group__2_in_rule__Assigment__Group__111495);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5697:1: rule__Assigment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assigment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5701:1: ( ( '=' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5702:1: ( '=' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5702:1: ( '=' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5703:1: '='
            {
             before(grammarAccess.getAssigmentAccess().getEqualsSignKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__Assigment__Group__1__Impl11523); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5716:1: rule__Assigment__Group__2 : rule__Assigment__Group__2__Impl rule__Assigment__Group__3 ;
    public final void rule__Assigment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5720:1: ( rule__Assigment__Group__2__Impl rule__Assigment__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5721:2: rule__Assigment__Group__2__Impl rule__Assigment__Group__3
            {
            pushFollow(FOLLOW_rule__Assigment__Group__2__Impl_in_rule__Assigment__Group__211554);
            rule__Assigment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigment__Group__3_in_rule__Assigment__Group__211557);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5728:1: rule__Assigment__Group__2__Impl : ( ( rule__Assigment__RightAssignment_2 ) ) ;
    public final void rule__Assigment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5732:1: ( ( ( rule__Assigment__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5733:1: ( ( rule__Assigment__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5733:1: ( ( rule__Assigment__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5734:1: ( rule__Assigment__RightAssignment_2 )
            {
             before(grammarAccess.getAssigmentAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5735:1: ( rule__Assigment__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5735:2: rule__Assigment__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Assigment__RightAssignment_2_in_rule__Assigment__Group__2__Impl11584);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5745:1: rule__Assigment__Group__3 : rule__Assigment__Group__3__Impl ;
    public final void rule__Assigment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5749:1: ( rule__Assigment__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5750:2: rule__Assigment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assigment__Group__3__Impl_in_rule__Assigment__Group__311614);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5756:1: rule__Assigment__Group__3__Impl : ( ';' ) ;
    public final void rule__Assigment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5760:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5761:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5761:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5762:1: ';'
            {
             before(grammarAccess.getAssigmentAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Assigment__Group__3__Impl11642); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5783:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5787:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5788:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__011681);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__011684);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5795:1: rule__BoolLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5799:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5800:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5800:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5801:1: ()
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5802:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5804:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5814:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5818:1: ( rule__BoolLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5819:2: rule__BoolLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__111742);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5825:1: rule__BoolLiteral__Group__1__Impl : ( ( rule__BoolLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5829:1: ( ( ( rule__BoolLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5830:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5830:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5831:1: ( rule__BoolLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5832:1: ( rule__BoolLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5832:2: rule__BoolLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl11769);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5846:1: rule__NumLiteral__Group__0 : rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 ;
    public final void rule__NumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5850:1: ( rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5851:2: rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__011803);
            rule__NumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__011806);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5858:1: rule__NumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5862:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5863:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5863:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5864:1: ()
            {
             before(grammarAccess.getNumLiteralAccess().getNumLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5865:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5867:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5877:1: rule__NumLiteral__Group__1 : rule__NumLiteral__Group__1__Impl ;
    public final void rule__NumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5881:1: ( rule__NumLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5882:2: rule__NumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__111864);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5888:1: rule__NumLiteral__Group__1__Impl : ( ( rule__NumLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5892:1: ( ( ( rule__NumLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5893:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5893:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5894:1: ( rule__NumLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5895:1: ( rule__NumLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5895:2: rule__NumLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl11891);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5909:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5913:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5914:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__011925);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__011928);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5921:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5925:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5926:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5926:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5927:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5928:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5930:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5940:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5944:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5945:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__111986);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5951:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5955:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5956:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5956:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5957:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5958:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5958:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl12013);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5973:1: rule__State__UnorderedGroup : rule__State__UnorderedGroup__0 {...}?;
    public final void rule__State__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup());
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5978:1: ( rule__State__UnorderedGroup__0 {...}?)
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5979:2: rule__State__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup12048);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5990:1: rule__State__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) ;
    public final void rule__State__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5995:1: ( ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5996:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5996:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( (LA26_0==26||LA26_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5998:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5998:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5999:5: {...}? => ( ( ( rule__State__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5999:100: ( ( ( rule__State__Group_0__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6000:6: ( ( rule__State__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6006:6: ( ( rule__State__Group_0__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6008:7: ( rule__State__Group_0__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6009:7: ( rule__State__Group_0__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6009:8: rule__State__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl12137);
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6015:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6015:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6016:5: {...}? => ( ( ( rule__State__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6016:100: ( ( ( rule__State__Group_1__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6017:6: ( ( rule__State__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6023:6: ( ( rule__State__Group_1__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6025:7: ( rule__State__Group_1__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6026:7: ( rule__State__Group_1__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6026:8: rule__State__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl12228);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6041:1: rule__State__UnorderedGroup__0 : rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? ;
    public final void rule__State__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6045:1: ( rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6046:2: rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__012287);
            rule__State__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6047:2: ( rule__State__UnorderedGroup__1 )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA27_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA27_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt27=1;
                    }
                    }
                    break;
                case 26:
                    {
                    int LA27_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt27=1;
                    }
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6047:2: rule__State__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__012290);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6054:1: rule__State__UnorderedGroup__1 : rule__State__UnorderedGroup__Impl ;
    public final void rule__State__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6058:1: ( rule__State__UnorderedGroup__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6059:2: rule__State__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__112315);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6070:1: rule__Document__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6074:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6075:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6075:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6076:1: RULE_ID
            {
             before(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Document__NameAssignment_112347); 
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


    // $ANTLR start "rule__Document__ElementsAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6085:1: rule__Document__ElementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Document__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6089:1: ( ( ruleStatement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6090:1: ( ruleStatement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6090:1: ( ruleStatement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6091:1: ruleStatement
            {
             before(grammarAccess.getDocumentAccess().getElementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_212378);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getElementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__ElementsAssignment_2"


    // $ANTLR start "rule__Document__StaAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6100:1: rule__Document__StaAssignment_3 : ( ruleState ) ;
    public final void rule__Document__StaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6104:1: ( ( ruleState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6105:1: ( ruleState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6105:1: ( ruleState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6106:1: ruleState
            {
             before(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Document__StaAssignment_312409);
            ruleState();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__StaAssignment_3"


    // $ANTLR start "rule__Statement__ComAssignment_5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6115:1: rule__Statement__ComAssignment_5 : ( RULE_ML_COMMENT ) ;
    public final void rule__Statement__ComAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6119:1: ( ( RULE_ML_COMMENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6120:1: ( RULE_ML_COMMENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6120:1: ( RULE_ML_COMMENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6121:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_5_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_512440); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6130:1: rule__State__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6134:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6135:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6135:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6136:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_112471); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6145:1: rule__State__TimesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__State__TimesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6149:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6150:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6150:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6151:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_112502); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6160:1: rule__State__TimeoutAssignment_1_0_1 : ( RULE_INT ) ;
    public final void rule__State__TimeoutAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6164:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6165:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6165:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6166:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimeoutINTTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_112533); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6175:1: rule__State__StmsAssignment_1_2 : ( ruleAbstractElement ) ;
    public final void rule__State__StmsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6179:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6180:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6180:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6181:1: ruleAbstractElement
            {
             before(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_1_212564);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Call__ToAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6190:1: rule__Call__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Call__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6194:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6195:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6195:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6196:1: ruleConcatenationExpression
            {
             before(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_112595);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ToAssignment_1"


    // $ANTLR start "rule__Dial__ToAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6205:1: rule__Dial__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Dial__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6209:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6210:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6210:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6211:1: ruleConcatenationExpression
            {
             before(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_112626);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6220:1: rule__Play__FileAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Play__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6224:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6225:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6225:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6226:1: ruleConcatenationExpression
            {
             before(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_112657);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6235:1: rule__Record__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Record__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6239:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6240:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6240:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6241:1: RULE_INT
            {
             before(grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_112688); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6250:1: rule__Record__ActionAssignment_4 : ( ruleConcatenationExpression ) ;
    public final void rule__Record__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6254:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6255:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6255:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6256:1: ruleConcatenationExpression
            {
             before(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Record__ActionAssignment_412719);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6265:1: rule__Record__NameAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Record__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6269:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6270:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6270:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6271:1: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Record__NameAssignment_5_112750); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6280:1: rule__Reject__NameAssignment : ( ( 'reject;' ) ) ;
    public final void rule__Reject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6284:1: ( ( ( 'reject;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6285:1: ( ( 'reject;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6285:1: ( ( 'reject;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6286:1: ( 'reject;' )
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6287:1: ( 'reject;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6288:1: 'reject;'
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__Reject__NameAssignment12786); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6303:1: rule__Hangup__NameAssignment : ( ( 'hangUp;' ) ) ;
    public final void rule__Hangup__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6307:1: ( ( ( 'hangUp;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6308:1: ( ( 'hangUp;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6308:1: ( ( 'hangUp;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6309:1: ( 'hangUp;' )
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6310:1: ( 'hangUp;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6311:1: 'hangUp;'
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Hangup__NameAssignment12830); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6326:1: rule__GetDigits__NumDigitsAssignment_1 : ( RULE_INT ) ;
    public final void rule__GetDigits__NumDigitsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6330:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6331:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6331:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6332:1: RULE_INT
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_112869); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6341:1: rule__GetDigits__QuestionAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__GetDigits__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6345:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6346:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6346:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6347:1: ruleConcatenationExpression
            {
             before(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__GetDigits__QuestionAssignment_312900);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6356:1: rule__GetDigits__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__GetDigits__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6360:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6361:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6361:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6362:1: RULE_ID
            {
             before(grammarAccess.getGetDigitsAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetDigits__NameAssignment_512931); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6371:1: rule__Ask__QuestionAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Ask__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6375:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6376:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6376:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6377:1: ruleConcatenationExpression
            {
             before(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_112962);
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


    // $ANTLR start "rule__Ask__NameAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6386:1: rule__Ask__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Ask__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6390:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6391:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6391:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6392:1: RULE_ID
            {
             before(grammarAccess.getAskAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ask__NameAssignment_312993); 
             after(grammarAccess.getAskAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ask__NameAssignment_3"


    // $ANTLR start "rule__Send__ParamsAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6401:1: rule__Send__ParamsAssignment_1 : ( ruleSendBlock ) ;
    public final void rule__Send__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6405:1: ( ( ruleSendBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6406:1: ( ruleSendBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6406:1: ( ruleSendBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6407:1: ruleSendBlock
            {
             before(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_113024);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6416:1: rule__Send__UrlAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Send__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6420:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6421:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6421:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6422:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_313055);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6431:1: rule__SendBlock__ValueAssignment_2 : ( ruleParam ) ;
    public final void rule__SendBlock__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6435:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6436:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6436:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6437:1: ruleParam
            {
             before(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_213086);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6446:1: rule__SendBlock__StmsAssignment_3 : ( ruleNotPrimaryParam ) ;
    public final void rule__SendBlock__StmsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6450:1: ( ( ruleNotPrimaryParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6451:1: ( ruleNotPrimaryParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6451:1: ( ruleNotPrimaryParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6452:1: ruleNotPrimaryParam
            {
             before(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_313117);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6461:1: rule__NotPrimaryParam__ValueAssignment_1 : ( ruleParam ) ;
    public final void rule__NotPrimaryParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6465:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6466:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6466:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6467:1: ruleParam
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_113148);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6476:1: rule__Param__ParamNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Param__ParamNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6480:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6481:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6481:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6482:1: RULE_STRING
            {
             before(grammarAccess.getParamAccess().getParamNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Param__ParamNameAssignment_013179); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6491:1: rule__Param__ValueAssignment_2 : ( ruleConcatenationExpression ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6495:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6496:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6496:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6497:1: ruleConcatenationExpression
            {
             before(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_213210);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6506:1: rule__Say__ThatAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Say__ThatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6510:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6511:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6511:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6512:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_113241);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6521:1: rule__Transition__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6525:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6526:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6526:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6527:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6528:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6529:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_113276); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6540:1: rule__Transition__EventAssignment_3 : ( RULE_EVENTENUM ) ;
    public final void rule__Transition__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6544:1: ( ( RULE_EVENTENUM ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6545:1: ( RULE_EVENTENUM )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6545:1: ( RULE_EVENTENUM )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6546:1: RULE_EVENTENUM
            {
             before(grammarAccess.getTransitionAccess().getEventEventEnumTerminalRuleCall_3_0()); 
            match(input,RULE_EVENTENUM,FOLLOW_RULE_EVENTENUM_in_rule__Transition__EventAssignment_313311); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6555:1: rule__IfExp__BlockAssignment_0 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6559:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6560:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6560:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6561:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_013342);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6570:1: rule__IfExp__BlocksAssignment_1_1 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlocksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6574:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6575:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6575:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6576:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_113373);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6585:1: rule__IfExp__DefaultBlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__IfExp__DefaultBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6589:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6590:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6590:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6591:1: ruleBlock
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_113404);
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


    // $ANTLR start "rule__CondBlock__CondAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6600:1: rule__CondBlock__CondAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__CondBlock__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6604:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6605:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6605:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6606:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_113435);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6615:1: rule__CondBlock__ActionAssignment_2 : ( ruleBlock ) ;
    public final void rule__CondBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6619:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6620:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6620:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6621:1: ruleBlock
            {
             before(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_213466);
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


    // $ANTLR start "rule__Block__StaAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6630:1: rule__Block__StaAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Block__StaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6634:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6635:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6635:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6636:1: ruleAbstractElement
            {
             before(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_213497);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StaAssignment_2"


    // $ANTLR start "rule__BoolExpression__OpAssignment_1_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6645:1: rule__BoolExpression__OpAssignment_1_1 : ( RULE_LOGIC_WORD ) ;
    public final void rule__BoolExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6649:1: ( ( RULE_LOGIC_WORD ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6650:1: ( RULE_LOGIC_WORD )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6650:1: ( RULE_LOGIC_WORD )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6651:1: RULE_LOGIC_WORD
            {
             before(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 
            match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_113528); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6660:1: rule__BoolExpression__RightAssignment_1_2 : ( ruleBoolExpression ) ;
    public final void rule__BoolExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6664:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6665:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6665:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6666:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_213559);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6675:1: rule__Brackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__Brackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6679:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6680:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6680:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6681:1: RULE_OBRACKET
            {
             before(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_013590); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6690:1: rule__Brackets__ObjAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__Brackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6694:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6695:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6695:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6696:1: ruleBoolExpression
            {
             before(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_113621);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6705:1: rule__Brackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__Brackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6709:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6710:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6710:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6711:1: RULE_CBRACKET
            {
             before(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_213652); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6720:1: rule__CompareExpression__LeftAssignment_0 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6724:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6725:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6725:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6726:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_013683);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6735:1: rule__CompareExpression__OpAssignment_1 : ( RULE_COMPARE ) ;
    public final void rule__CompareExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6739:1: ( ( RULE_COMPARE ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6740:1: ( RULE_COMPARE )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6740:1: ( RULE_COMPARE )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6741:1: RULE_COMPARE
            {
             before(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 
            match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_113714); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6750:1: rule__CompareExpression__RightAssignment_2 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6754:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6755:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6755:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6756:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_213745);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6765:1: rule__NegExpression__OpAssignment_0 : ( RULE_NEGATION ) ;
    public final void rule__NegExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6769:1: ( ( RULE_NEGATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6770:1: ( RULE_NEGATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6770:1: ( RULE_NEGATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6771:1: RULE_NEGATION
            {
             before(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 
            match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_013776); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6780:1: rule__NegExpression__ObjAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__NegExpression__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6784:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6785:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6785:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6786:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_113807);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6795:1: rule__MathExpression__OpAssignment_1_1 : ( RULE_MATH ) ;
    public final void rule__MathExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6799:1: ( ( RULE_MATH ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6800:1: ( RULE_MATH )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6800:1: ( RULE_MATH )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6801:1: RULE_MATH
            {
             before(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 
            match(input,RULE_MATH,FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_113838); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6810:1: rule__MathExpression__RightAssignment_1_2 : ( ruleMathExpression ) ;
    public final void rule__MathExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6814:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6815:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6815:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6816:1: ruleMathExpression
            {
             before(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_213869);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6825:1: rule__MathBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__MathBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6829:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6830:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6830:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6831:1: RULE_OBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_013900); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6840:1: rule__MathBrackets__ObjAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__MathBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6844:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6845:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6845:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6846:1: ruleMathExpression
            {
             before(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_113931);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6855:1: rule__MathBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__MathBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6859:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6860:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6860:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6861:1: RULE_CBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_213962); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6870:1: rule__ConcatenationExpression__OpAssignment_1_1 : ( RULE_CONCATENATION ) ;
    public final void rule__ConcatenationExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6874:1: ( ( RULE_CONCATENATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6875:1: ( RULE_CONCATENATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6875:1: ( RULE_CONCATENATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6876:1: RULE_CONCATENATION
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0()); 
            match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_113993); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6885:1: rule__ConcatenationExpression__RightAssignment_1_2 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6889:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6890:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6890:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6891:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_214024);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6900:1: rule__ConcatenationBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__ConcatenationBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6904:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6905:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6905:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6906:1: RULE_OBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_014055); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6915:1: rule__ConcatenationBrackets__ObjAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6919:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6920:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6920:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6921:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_114086);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6930:1: rule__ConcatenationBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__ConcatenationBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6934:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6935:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6935:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6936:1: RULE_CBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_214117); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6945:1: rule__StringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6949:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6950:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6950:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6951:1: RULE_ID
            {
             before(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_114148); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6960:1: rule__StringVariable__ValueAssignment_2_1 : ( ruleConcatenationExpression ) ;
    public final void rule__StringVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6964:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6965:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6965:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6966:1: ruleConcatenationExpression
            {
             before(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_114179);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6975:1: rule__NumVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6979:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6980:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6980:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6981:1: RULE_ID
            {
             before(grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_114210); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6990:1: rule__NumVariable__ValueAssignment_2_1 : ( ruleMathExpression ) ;
    public final void rule__NumVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6994:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6995:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6995:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6996:1: ruleMathExpression
            {
             before(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_114241);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7005:1: rule__BoolVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BoolVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7009:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7010:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7010:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7011:1: RULE_ID
            {
             before(grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_114272); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7020:1: rule__BoolVariable__ValueAssignment_2_1 : ( ruleBoolExpression ) ;
    public final void rule__BoolVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7024:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7025:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7025:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7026:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_114303);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7035:1: rule__Assigment__VaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assigment__VaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7039:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7040:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7040:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7041:1: ( RULE_ID )
            {
             before(grammarAccess.getAssigmentAccess().getVaVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7042:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7043:1: RULE_ID
            {
             before(grammarAccess.getAssigmentAccess().getVaVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assigment__VaAssignment_014338); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7054:1: rule__Assigment__RightAssignment_2 : ( ruleMathExpression ) ;
    public final void rule__Assigment__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7058:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7059:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7059:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7060:1: ruleMathExpression
            {
             before(grammarAccess.getAssigmentAccess().getRightMathExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__Assigment__RightAssignment_214373);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7069:1: rule__Literal__VAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Literal__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7073:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7074:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7074:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7075:1: ( RULE_ID )
            {
             before(grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7076:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7077:1: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getVVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Literal__VAssignment_014408); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7088:1: rule__Literal__NulAssignment_1 : ( RULE_NULL ) ;
    public final void rule__Literal__NulAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7092:1: ( ( RULE_NULL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7093:1: ( RULE_NULL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7093:1: ( RULE_NULL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7094:1: RULE_NULL
            {
             before(grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 
            match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_114443); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7103:1: rule__Literal__SesAssignment_2 : ( RULE_SESSION ) ;
    public final void rule__Literal__SesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7107:1: ( ( RULE_SESSION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7108:1: ( RULE_SESSION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7108:1: ( RULE_SESSION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7109:1: RULE_SESSION
            {
             before(grammarAccess.getLiteralAccess().getSesSESSIONTerminalRuleCall_2_0()); 
            match(input,RULE_SESSION,FOLLOW_RULE_SESSION_in_rule__Literal__SesAssignment_214474); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7118:1: rule__BoolLiteral__ValueAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__BoolLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7122:1: ( ( RULE_BOOL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( RULE_BOOL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( RULE_BOOL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7124:1: RULE_BOOL
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_114505); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7133:1: rule__NumLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7137:1: ( ( ruleNumber ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7138:1: ( ruleNumber )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7138:1: ( ruleNumber )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7139:1: ruleNumber
            {
             before(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_114536);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7148:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7152:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7153:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7153:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7154:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_114567); 
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\10\3\11\5\uffff";
    static final String DFA4_minS =
        "\1\4\4\12\5\uffff";
    static final String DFA4_maxS =
        "\1\23\4\36\5\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\2\1\3\1\5\1\1\1\4";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1410:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_in_ruleState274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoiceTag308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoiceTag__Alternatives_in_ruleVoiceTag334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall394 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigment_in_entryRuleAssigment2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigment2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__0_in_ruleAssigment2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_rule__Statement__Alternatives2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigment_in_rule__Statement__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ComAssignment_5_in_rule__Statement__Alternatives2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__LiteralAbs__Alternatives3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__LiteralAbs__Alternatives3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__LiteralAbs__Alternatives3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__SesAssignment_2_in_rule__Literal__Alternatives3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Document__Group__0__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13498 = new BitSet(new long[]{0x007A11A3B50000C0L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__23558 = new BitSet(new long[]{0x007A11A3B50000C0L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__23561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl3588 = new BitSet(new long[]{0x007A11A3A00000C2L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__33619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl3646 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__03685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__03688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group_0__0__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__13747 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__13750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__23807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__03871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__03874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group_0_2__0__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__13933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__03994 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__03997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14055 = new BitSet(new long[]{0x007B31A3A80000C0L});
    public static final BitSet FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group_1__1__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24117 = new BitSet(new long[]{0x007B31A3A80000C0L});
    public static final BitSet FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__24120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl4147 = new BitSet(new long[]{0x007B31A3A00000C2L});
    public static final BitSet FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__34178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_1__3__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__04245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__04248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__State__Group_1_0__0__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__04368 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__14430 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__24490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Call__Group__2__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__04555 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__04558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Dial__Group__0__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__14617 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__24677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Dial__Group__2__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__04742 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Play__Group__1_in_rule__Play__Group__04745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Play__Group__0__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__14804 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Play__Group__2_in_rule__Play__Group__14807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__24864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Play__Group__2__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__04929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Record__Group__1_in_rule__Record__Group__04932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Record__Group__0__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__14991 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Record__Group__2_in_rule__Record__Group__14994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25051 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Record__Group__2__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35113 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Record__Group__4_in_rule__Record__Group__35116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Record__Group__3__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__45175 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__Record__Group__5_in_rule__Record__Group__45178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__ActionAssignment_4_in_rule__Record__Group__4__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__5__Impl_in_rule__Record__Group__55235 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__Record__Group__6_in_rule__Record__Group__55238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__0_in_rule__Record__Group__5__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__6__Impl_in_rule__Record__Group__65296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Record__Group__6__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__0__Impl_in_rule__Record__Group_5__05369 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Record__Group_5__1_in_rule__Record__Group_5__05372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Record__Group_5__0__Impl5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__1__Impl_in_rule__Record__Group_5__15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__NameAssignment_5_1_in_rule__Record__Group_5__1__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__05492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__05495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GetDigits__Group__0__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__15554 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__25614 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__25617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GetDigits__Group__2__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__35676 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__4_in_rule__GetDigits__Group__35679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__QuestionAssignment_3_in_rule__GetDigits__Group__3__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__4__Impl_in_rule__GetDigits__Group__45736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__5_in_rule__GetDigits__Group__45739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GetDigits__Group__4__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__5__Impl_in_rule__GetDigits__Group__55798 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__6_in_rule__GetDigits__Group__55801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NameAssignment_5_in_rule__GetDigits__Group__5__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__6__Impl_in_rule__GetDigits__Group__65858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GetDigits__Group__6__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__05931 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__05934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Ask__Group__0__Impl5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__15993 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Ask__Group__3_in_rule__Ask__Group__26056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Ask__Group__2__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__3__Impl_in_rule__Ask__Group__36115 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__4_in_rule__Ask__Group__36118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__NameAssignment_3_in_rule__Ask__Group__3__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__4__Impl_in_rule__Ask__Group__46175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Ask__Group__4__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06244 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Send__Group__0__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16306 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26366 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Send__Group__2__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36428 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Send__Group__4__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06557 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SendBlock__Group__1__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26680 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36740 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6770 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__46801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SendBlock__Group__4__Impl6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__06870 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__06873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NotPrimaryParam__Group__0__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__16932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__06993 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__06996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ParamNameAssignment_0_in_rule__Param__Group__0__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17053 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Param__Group__1__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07178 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Say__Group__0__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17240 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Say__Group__2__Impl7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Transition__Group__0__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17427 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__27487 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__27490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Transition__Group__2__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__37549 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__37552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__47609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Transition__Group__4__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__07678 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__07681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__17738 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__17741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl7768 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__27799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__07863 = new BitSet(new long[]{0x007B31A3A00000C0L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__07866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IfExp__Group_1__0__Impl7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__17925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__07986 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__07989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IfExp__Group_2__0__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__18048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__08109 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__08112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CondBlock__Group__0__Impl8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__18171 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__18174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__28231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08294 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18355 = new BitSet(new long[]{0x007B31A3A80000C0L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Block__Group__1__Impl8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28417 = new BitSet(new long[]{0x007B31A3A80000C0L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl8447 = new BitSet(new long[]{0x007B31A3A00000C2L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Block__Group__3__Impl8506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__08545 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__08548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__18604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__08666 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__08669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__18727 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__28787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__08850 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__08853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl8880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__18910 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__18913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__28970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__09033 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__09036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__19093 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__19096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__29153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__09216 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__09219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__19276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__09337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__09340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__19396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__09458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__09461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__19519 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__19522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__29579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl9606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__09642 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__09645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__19702 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__19705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__29762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__09825 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__09828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__19884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__09946 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__09949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__110007 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__110010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__210067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl10094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__010130 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__010133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl10160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__110190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__210250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl10277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__010313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__010316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__StringVariable__Group__0__Impl10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__110375 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__110378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__210435 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__210438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__310496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringVariable__Group__3__Impl10524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__010563 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__010566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__StringVariable__Group_2__0__Impl10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__110625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl10652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__010686 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__010689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NumVariable__Group__0__Impl10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__110748 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__110751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__210808 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__210811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__310869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NumVariable__Group__3__Impl10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__010936 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__010939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NumVariable__Group_2__0__Impl10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__110998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__011059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__011062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__BoolVariable__Group__0__Impl11090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__111121 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__111124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl11151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__211181 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__211184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__311242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BoolVariable__Group__3__Impl11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__011309 = new BitSet(new long[]{0x00000000000E4970L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__011312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BoolVariable__Group_2__0__Impl11340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__111371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__0__Impl_in_rule__Assigment__Group__011432 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Assigment__Group__1_in_rule__Assigment__Group__011435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__VaAssignment_0_in_rule__Assigment__Group__0__Impl11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__1__Impl_in_rule__Assigment__Group__111492 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__Assigment__Group__2_in_rule__Assigment__Group__111495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Assigment__Group__1__Impl11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__2__Impl_in_rule__Assigment__Group__211554 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Assigment__Group__3_in_rule__Assigment__Group__211557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__RightAssignment_2_in_rule__Assigment__Group__2__Impl11584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigment__Group__3__Impl_in_rule__Assigment__Group__311614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Assigment__Group__3__Impl11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__011681 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__011684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__111742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__011803 = new BitSet(new long[]{0x00000000000E0970L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__011806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__111864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl11891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__011925 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__011928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__111986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl12228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__012287 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__012290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__112315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Document__NameAssignment_112347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_212378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Document__StaAssignment_312409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_512440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_112471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_112502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_112533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_1_212564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_112595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_112626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_112657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_112688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Record__ActionAssignment_412719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Record__NameAssignment_5_112750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Reject__NameAssignment12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Hangup__NameAssignment12830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_112869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__GetDigits__QuestionAssignment_312900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetDigits__NameAssignment_512931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_112962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ask__NameAssignment_312993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_113024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_313055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_213086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_313117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_113148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Param__ParamNameAssignment_013179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_213210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_113241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_113276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EVENTENUM_in_rule__Transition__EventAssignment_313311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_013342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_113373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_113404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_113435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_213466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_213497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_113528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_213559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_013590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_113621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_213652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_013683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_113714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_213745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_013776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_113807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_113838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_213869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_013900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_113931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_213962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_113993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_214024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_014055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_114086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_214117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_114148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_114179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_114210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_114241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_114272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_114303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assigment__VaAssignment_014338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__Assigment__RightAssignment_214373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__VAssignment_014408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_114443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SESSION_in_rule__Literal__SesAssignment_214474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_114505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_114536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_114567 = new BitSet(new long[]{0x0000000000000002L});

}
