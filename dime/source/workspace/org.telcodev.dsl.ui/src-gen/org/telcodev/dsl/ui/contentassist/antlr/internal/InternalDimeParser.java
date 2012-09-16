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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_NULL", "RULE_BOOL", "RULE_CONCATENATION", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "' = '", "'Application'", "'State'", "'times'", "'{'", "'}'", "'timeout'", "';'", "'seconds'", "'in'", "' -> '", "'digits'", "'to'", "','", "':'", "'when'", "'else'", "'String'", "'Num'", "'Bool'", "'Const'", "'Call'", "'DialTo'", "'Play'", "'Record'", "'Reject;'", "'HangUp;'", "'Get'", "'Ask'", "'Send'", "'Say'", "'Sms'", "'GoTo'", "'if'", "'+'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'TIMEOUT'", "'CALLER'", "'LASTSTATE'", "'TIME'", "'CALLED'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_OBRACKET=10;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__21=21;
    public static final int RULE_BOOL=16;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_CONCATENATION=17;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int RULE_COMPARE=12;
    public static final int RULE_CBRACKET=11;
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
    public static final int RULE_NEGATION=13;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_DOUBLE=4;
    public static final int RULE_NULL=15;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_LOGIC_WORD=9;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=19;
    public static final int RULE_MATH=14;

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


    // $ANTLR start "entryRuleSms"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:564:1: entryRuleSms : ruleSms EOF ;
    public final void entryRuleSms() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:565:1: ( ruleSms EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:566:1: ruleSms EOF
            {
             before(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_ruleSms_in_entryRuleSms1141);
            ruleSms();

            state._fsp--;

             after(grammarAccess.getSmsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSms1148); 

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
    // $ANTLR end "entryRuleSms"


    // $ANTLR start "ruleSms"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:573:1: ruleSms : ( ( rule__Sms__Group__0 ) ) ;
    public final void ruleSms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:577:2: ( ( ( rule__Sms__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:578:1: ( ( rule__Sms__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:578:1: ( ( rule__Sms__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:579:1: ( rule__Sms__Group__0 )
            {
             before(grammarAccess.getSmsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:580:1: ( rule__Sms__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:580:2: rule__Sms__Group__0
            {
            pushFollow(FOLLOW_rule__Sms__Group__0_in_ruleSms1174);
            rule__Sms__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSms"


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:596:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:597:1: ( ruleTransition EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:598:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1205);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1212); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:605:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:609:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:610:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:610:1: ( ( rule__Transition__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:611:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:612:1: ( rule__Transition__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:612:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition1238);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:624:1: entryRuleIfExp : ruleIfExp EOF ;
    public final void entryRuleIfExp() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:625:1: ( ruleIfExp EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:626:1: ruleIfExp EOF
            {
             before(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp1265);
            ruleIfExp();

            state._fsp--;

             after(grammarAccess.getIfExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp1272); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:633:1: ruleIfExp : ( ( rule__IfExp__Group__0 ) ) ;
    public final void ruleIfExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:637:2: ( ( ( rule__IfExp__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:638:1: ( ( rule__IfExp__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:638:1: ( ( rule__IfExp__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:639:1: ( rule__IfExp__Group__0 )
            {
             before(grammarAccess.getIfExpAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:640:1: ( rule__IfExp__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:640:2: rule__IfExp__Group__0
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1298);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:652:1: entryRuleCondBlock : ruleCondBlock EOF ;
    public final void entryRuleCondBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:653:1: ( ruleCondBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:654:1: ruleCondBlock EOF
            {
             before(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock1325);
            ruleCondBlock();

            state._fsp--;

             after(grammarAccess.getCondBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock1332); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:661:1: ruleCondBlock : ( ( rule__CondBlock__Group__0 ) ) ;
    public final void ruleCondBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:665:2: ( ( ( rule__CondBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:666:1: ( ( rule__CondBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:666:1: ( ( rule__CondBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:667:1: ( rule__CondBlock__Group__0 )
            {
             before(grammarAccess.getCondBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:668:1: ( rule__CondBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:668:2: rule__CondBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1358);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:680:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:681:1: ( ruleBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:682:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1385);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1392); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:689:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:693:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:694:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:694:1: ( ( rule__Block__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:695:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:696:1: ( rule__Block__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:696:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1418);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:708:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:709:1: ( ruleBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:710:1: ruleBoolExpression EOF
            {
             before(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1445);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression1452); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:717:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:721:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:722:1: ( ( rule__BoolExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:722:1: ( ( rule__BoolExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:723:1: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:724:1: ( rule__BoolExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:724:2: rule__BoolExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1478);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:736:1: entryRuleTerminalBoolExpression : ruleTerminalBoolExpression EOF ;
    public final void entryRuleTerminalBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:737:1: ( ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:738:1: ruleTerminalBoolExpression EOF
            {
             before(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1505);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getTerminalBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression1512); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:745:1: ruleTerminalBoolExpression : ( ( rule__TerminalBoolExpression__Alternatives ) ) ;
    public final void ruleTerminalBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:749:2: ( ( ( rule__TerminalBoolExpression__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:750:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:750:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:751:1: ( rule__TerminalBoolExpression__Alternatives )
            {
             before(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:752:1: ( rule__TerminalBoolExpression__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:752:2: rule__TerminalBoolExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1538);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:764:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:765:1: ( ruleBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:766:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1565);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1572); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:773:1: ruleBrackets : ( ( rule__Brackets__Group__0 ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:777:2: ( ( ( rule__Brackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:778:1: ( ( rule__Brackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:778:1: ( ( rule__Brackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:779:1: ( rule__Brackets__Group__0 )
            {
             before(grammarAccess.getBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:780:1: ( rule__Brackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:780:2: rule__Brackets__Group__0
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1598);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:792:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:793:1: ( ruleCompareExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:794:1: ruleCompareExpression EOF
            {
             before(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1625);
            ruleCompareExpression();

            state._fsp--;

             after(grammarAccess.getCompareExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1632); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:801:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:805:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:806:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:806:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:807:1: ( rule__CompareExpression__Group__0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:808:1: ( rule__CompareExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:808:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1658);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:820:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:821:1: ( ruleNegExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:822:1: ruleNegExpression EOF
            {
             before(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression1685);
            ruleNegExpression();

            state._fsp--;

             after(grammarAccess.getNegExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression1692); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:829:1: ruleNegExpression : ( ( rule__NegExpression__Group__0 ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:833:2: ( ( ( rule__NegExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:834:1: ( ( rule__NegExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:834:1: ( ( rule__NegExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:835:1: ( rule__NegExpression__Group__0 )
            {
             before(grammarAccess.getNegExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:836:1: ( rule__NegExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:836:2: rule__NegExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1718);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:848:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:849:1: ( ruleMathExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:850:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression1745);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression1752); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:857:1: ruleMathExpression : ( ( rule__MathExpression__Group__0 ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:861:2: ( ( ( rule__MathExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:862:1: ( ( rule__MathExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:862:1: ( ( rule__MathExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:863:1: ( rule__MathExpression__Group__0 )
            {
             before(grammarAccess.getMathExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:864:1: ( rule__MathExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:864:2: rule__MathExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1778);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:876:1: entryRuleMathTerminal : ruleMathTerminal EOF ;
    public final void entryRuleMathTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:877:1: ( ruleMathTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:878:1: ruleMathTerminal EOF
            {
             before(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1805);
            ruleMathTerminal();

            state._fsp--;

             after(grammarAccess.getMathTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal1812); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:885:1: ruleMathTerminal : ( ( rule__MathTerminal__Alternatives ) ) ;
    public final void ruleMathTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:889:2: ( ( ( rule__MathTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:890:1: ( ( rule__MathTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:890:1: ( ( rule__MathTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:891:1: ( rule__MathTerminal__Alternatives )
            {
             before(grammarAccess.getMathTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:892:1: ( rule__MathTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:892:2: rule__MathTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1838);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:904:1: entryRuleMathBrackets : ruleMathBrackets EOF ;
    public final void entryRuleMathBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:905:1: ( ruleMathBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:906:1: ruleMathBrackets EOF
            {
             before(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1865);
            ruleMathBrackets();

            state._fsp--;

             after(grammarAccess.getMathBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets1872); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:913:1: ruleMathBrackets : ( ( rule__MathBrackets__Group__0 ) ) ;
    public final void ruleMathBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:917:2: ( ( ( rule__MathBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:918:1: ( ( rule__MathBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:918:1: ( ( rule__MathBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:919:1: ( rule__MathBrackets__Group__0 )
            {
             before(grammarAccess.getMathBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:920:1: ( rule__MathBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:920:2: rule__MathBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1898);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:932:1: entryRuleConcatenationExpression : ruleConcatenationExpression EOF ;
    public final void entryRuleConcatenationExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:933:1: ( ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:934:1: ruleConcatenationExpression EOF
            {
             before(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1925);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression1932); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:941:1: ruleConcatenationExpression : ( ( rule__ConcatenationExpression__Group__0 ) ) ;
    public final void ruleConcatenationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:945:2: ( ( ( rule__ConcatenationExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:946:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:946:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:947:1: ( rule__ConcatenationExpression__Group__0 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:948:1: ( rule__ConcatenationExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:948:2: rule__ConcatenationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression1958);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:960:1: entryRuleConcatenationTerminal : ruleConcatenationTerminal EOF ;
    public final void entryRuleConcatenationTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:961:1: ( ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:962:1: ruleConcatenationTerminal EOF
            {
             before(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal1985);
            ruleConcatenationTerminal();

            state._fsp--;

             after(grammarAccess.getConcatenationTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal1992); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:969:1: ruleConcatenationTerminal : ( ( rule__ConcatenationTerminal__Alternatives ) ) ;
    public final void ruleConcatenationTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:973:2: ( ( ( rule__ConcatenationTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:974:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:974:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:975:1: ( rule__ConcatenationTerminal__Alternatives )
            {
             before(grammarAccess.getConcatenationTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:976:1: ( rule__ConcatenationTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:976:2: rule__ConcatenationTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2018);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:988:1: entryRuleConcatenationBrackets : ruleConcatenationBrackets EOF ;
    public final void entryRuleConcatenationBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:989:1: ( ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:990:1: ruleConcatenationBrackets EOF
            {
             before(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2045);
            ruleConcatenationBrackets();

            state._fsp--;

             after(grammarAccess.getConcatenationBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets2052); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:997:1: ruleConcatenationBrackets : ( ( rule__ConcatenationBrackets__Group__0 ) ) ;
    public final void ruleConcatenationBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1001:2: ( ( ( rule__ConcatenationBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1002:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1002:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1003:1: ( rule__ConcatenationBrackets__Group__0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1004:1: ( rule__ConcatenationBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1004:2: rule__ConcatenationBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2078);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1016:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1017:1: ( ruleStringVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1018:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable2105);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable2112); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1025:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1029:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1030:1: ( ( rule__StringVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1030:1: ( ( rule__StringVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1031:1: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1032:1: ( rule__StringVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1032:2: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2138);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1044:1: entryRuleNumVariable : ruleNumVariable EOF ;
    public final void entryRuleNumVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1045:1: ( ruleNumVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1046:1: ruleNumVariable EOF
            {
             before(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable2165);
            ruleNumVariable();

            state._fsp--;

             after(grammarAccess.getNumVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable2172); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1053:1: ruleNumVariable : ( ( rule__NumVariable__Group__0 ) ) ;
    public final void ruleNumVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1057:2: ( ( ( rule__NumVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1058:1: ( ( rule__NumVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1058:1: ( ( rule__NumVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1059:1: ( rule__NumVariable__Group__0 )
            {
             before(grammarAccess.getNumVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1060:1: ( rule__NumVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1060:2: rule__NumVariable__Group__0
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2198);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1072:1: entryRuleBoolVariable : ruleBoolVariable EOF ;
    public final void entryRuleBoolVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1073:1: ( ruleBoolVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1074:1: ruleBoolVariable EOF
            {
             before(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2225);
            ruleBoolVariable();

            state._fsp--;

             after(grammarAccess.getBoolVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable2232); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1081:1: ruleBoolVariable : ( ( rule__BoolVariable__Group__0 ) ) ;
    public final void ruleBoolVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1085:2: ( ( ( rule__BoolVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1086:1: ( ( rule__BoolVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1086:1: ( ( rule__BoolVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1087:1: ( rule__BoolVariable__Group__0 )
            {
             before(grammarAccess.getBoolVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1088:1: ( rule__BoolVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1088:2: rule__BoolVariable__Group__0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2258);
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


    // $ANTLR start "entryRuleConstant"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1100:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1101:1: ( ruleConstant EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1102:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2285);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2292); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1109:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1113:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1114:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1114:1: ( ( rule__Constant__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1115:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1116:1: ( rule__Constant__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1116:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant2318);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRulePrimitive"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1128:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1129:1: ( rulePrimitive EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1130:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive2345);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive2352); 

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1137:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1141:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1142:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1142:1: ( ( rule__Primitive__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1143:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1144:1: ( rule__Primitive__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1144:2: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive2378);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleLiteralAbs"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1158:1: entryRuleLiteralAbs : ruleLiteralAbs EOF ;
    public final void entryRuleLiteralAbs() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1159:1: ( ruleLiteralAbs EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1160:1: ruleLiteralAbs EOF
            {
             before(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2407);
            ruleLiteralAbs();

            state._fsp--;

             after(grammarAccess.getLiteralAbsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs2414); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1167:1: ruleLiteralAbs : ( ( rule__LiteralAbs__Alternatives ) ) ;
    public final void ruleLiteralAbs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1171:2: ( ( ( rule__LiteralAbs__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1172:1: ( ( rule__LiteralAbs__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1172:1: ( ( rule__LiteralAbs__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1173:1: ( rule__LiteralAbs__Alternatives )
            {
             before(grammarAccess.getLiteralAbsAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1174:1: ( rule__LiteralAbs__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1174:2: rule__LiteralAbs__Alternatives
            {
            pushFollow(FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2440);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1186:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1187:1: ( ruleLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1188:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2467);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2474); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1195:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1199:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1200:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1200:1: ( ( rule__Literal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1201:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1202:1: ( rule__Literal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1202:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2500);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1214:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1215:1: ( ruleBoolLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1216:1: ruleBoolLiteral EOF
            {
             before(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2527);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getBoolLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral2534); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1223:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Group__0 ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1227:2: ( ( ( rule__BoolLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1228:1: ( ( rule__BoolLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1228:1: ( ( rule__BoolLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1229:1: ( rule__BoolLiteral__Group__0 )
            {
             before(grammarAccess.getBoolLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1230:1: ( rule__BoolLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1230:2: rule__BoolLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2560);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1242:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1243:1: ( ruleNumLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1244:1: ruleNumLiteral EOF
            {
             before(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2587);
            ruleNumLiteral();

            state._fsp--;

             after(grammarAccess.getNumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral2594); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1251:1: ruleNumLiteral : ( ( rule__NumLiteral__Group__0 ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1255:2: ( ( ( rule__NumLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1256:1: ( ( rule__NumLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1256:1: ( ( rule__NumLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1257:1: ( rule__NumLiteral__Group__0 )
            {
             before(grammarAccess.getNumLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1258:1: ( rule__NumLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1258:2: rule__NumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1270:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1271:1: ( ruleStringLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1272:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2647);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2654); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1279:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1283:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1284:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1284:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1285:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1286:1: ( rule__StringLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1286:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2680);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1298:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1299:1: ( ruleNumber EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1300:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2707);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2714); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1307:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1311:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1312:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1312:1: ( ( rule__Number__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1313:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1314:1: ( rule__Number__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1314:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber2740);
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


    // $ANTLR start "entryRuleEVENT"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1326:1: entryRuleEVENT : ruleEVENT EOF ;
    public final void entryRuleEVENT() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1327:1: ( ruleEVENT EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1328:1: ruleEVENT EOF
            {
             before(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT2767);
            ruleEVENT();

            state._fsp--;

             after(grammarAccess.getEVENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT2774); 

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
    // $ANTLR end "entryRuleEVENT"


    // $ANTLR start "ruleEVENT"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1335:1: ruleEVENT : ( ( rule__EVENT__Alternatives ) ) ;
    public final void ruleEVENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1339:2: ( ( ( rule__EVENT__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1340:1: ( ( rule__EVENT__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1340:1: ( ( rule__EVENT__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1341:1: ( rule__EVENT__Alternatives )
            {
             before(grammarAccess.getEVENTAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1342:1: ( rule__EVENT__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1342:2: rule__EVENT__Alternatives
            {
            pushFollow(FOLLOW_rule__EVENT__Alternatives_in_ruleEVENT2800);
            rule__EVENT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVENTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVENT"


    // $ANTLR start "entryRuleSESSION"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1354:1: entryRuleSESSION : ruleSESSION EOF ;
    public final void entryRuleSESSION() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1355:1: ( ruleSESSION EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1356:1: ruleSESSION EOF
            {
             before(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION2827);
            ruleSESSION();

            state._fsp--;

             after(grammarAccess.getSESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION2834); 

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
    // $ANTLR end "entryRuleSESSION"


    // $ANTLR start "ruleSESSION"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1363:1: ruleSESSION : ( ( rule__SESSION__Alternatives ) ) ;
    public final void ruleSESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1367:2: ( ( ( rule__SESSION__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1368:1: ( ( rule__SESSION__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1368:1: ( ( rule__SESSION__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1369:1: ( rule__SESSION__Alternatives )
            {
             before(grammarAccess.getSESSIONAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1370:1: ( rule__SESSION__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1370:2: rule__SESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__SESSION__Alternatives_in_ruleSESSION2860);
            rule__SESSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSESSIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSESSION"


    // $ANTLR start "entryRuleCALLSTATUS"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1382:1: entryRuleCALLSTATUS : ruleCALLSTATUS EOF ;
    public final void entryRuleCALLSTATUS() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1383:1: ( ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1384:1: ruleCALLSTATUS EOF
            {
             before(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS2887);
            ruleCALLSTATUS();

            state._fsp--;

             after(grammarAccess.getCALLSTATUSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS2894); 

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
    // $ANTLR end "entryRuleCALLSTATUS"


    // $ANTLR start "ruleCALLSTATUS"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1391:1: ruleCALLSTATUS : ( ( rule__CALLSTATUS__Alternatives ) ) ;
    public final void ruleCALLSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1395:2: ( ( ( rule__CALLSTATUS__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1396:1: ( ( rule__CALLSTATUS__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1396:1: ( ( rule__CALLSTATUS__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1397:1: ( rule__CALLSTATUS__Alternatives )
            {
             before(grammarAccess.getCALLSTATUSAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1398:1: ( rule__CALLSTATUS__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1398:2: rule__CALLSTATUS__Alternatives
            {
            pushFollow(FOLLOW_rule__CALLSTATUS__Alternatives_in_ruleCALLSTATUS2920);
            rule__CALLSTATUS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCALLSTATUSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCALLSTATUS"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1410:1: rule__Statement__Alternatives : ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleConstant ) | ( ( rule__Statement__ComAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1414:1: ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleConstant ) | ( ( rule__Statement__ComAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 42:
                {
                alt1=4;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1415:1: ( ruleNumVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1415:1: ( ruleNumVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1416:1: ruleNumVariable
                    {
                     before(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2956);
                    ruleNumVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1421:6: ( ruleStringVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1421:6: ( ruleStringVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1422:1: ruleStringVariable
                    {
                     before(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2973);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1427:6: ( ruleBoolVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1427:6: ( ruleBoolVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1428:1: ruleBoolVariable
                    {
                     before(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2990);
                    ruleBoolVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1433:6: ( ruleConstant )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1433:6: ( ruleConstant )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1434:1: ruleConstant
                    {
                     before(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Statement__Alternatives3007);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1439:6: ( ( rule__Statement__ComAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1439:6: ( ( rule__Statement__ComAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1440:1: ( rule__Statement__ComAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getComAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1441:1: ( rule__Statement__ComAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1441:2: rule__Statement__ComAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Statement__ComAssignment_4_in_rule__Statement__Alternatives3024);
                    rule__Statement__ComAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getComAssignment_4()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1450:1: rule__AbstractElement__Alternatives : ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) | ( ruleVoiceTag ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1454:1: ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) | ( ruleVoiceTag ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt2=1;
                }
                break;
            case 54:
                {
                alt2=2;
                }
                break;
            case 55:
                {
                alt2=3;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1455:1: ( ruleStatement )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1455:1: ( ruleStatement )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1456:1: ruleStatement
                    {
                     before(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives3057);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1461:6: ( ruleTransition )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1461:6: ( ruleTransition )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1462:1: ruleTransition
                    {
                     before(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives3074);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1467:6: ( ruleIfExp )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1467:6: ( ruleIfExp )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1468:1: ruleIfExp
                    {
                     before(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives3091);
                    ruleIfExp();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1473:6: ( ruleVoiceTag )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1473:6: ( ruleVoiceTag )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1474:1: ruleVoiceTag
                    {
                     before(grammarAccess.getAbstractElementAccess().getVoiceTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVoiceTag_in_rule__AbstractElement__Alternatives3108);
                    ruleVoiceTag();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVoiceTagParserRuleCall_3()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1484:1: rule__VoiceTag__Alternatives : ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) | ( ruleSms ) );
    public final void rule__VoiceTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1488:1: ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) | ( ruleSms ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case 45:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            case 49:
                {
                alt3=5;
                }
                break;
            case 50:
                {
                alt3=6;
                }
                break;
            case 51:
                {
                alt3=7;
                }
                break;
            case 47:
                {
                alt3=8;
                }
                break;
            case 48:
                {
                alt3=9;
                }
                break;
            case 43:
                {
                alt3=10;
                }
                break;
            case 53:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1489:1: ( ruleSay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1489:1: ( ruleSay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1490:1: ruleSay
                    {
                     before(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3140);
                    ruleSay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1495:6: ( ruleDial )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1495:6: ( ruleDial )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1496:1: ruleDial
                    {
                     before(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3157);
                    ruleDial();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1501:6: ( rulePlay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1501:6: ( rulePlay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1502:1: rulePlay
                    {
                     before(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3174);
                    rulePlay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1507:6: ( ruleRecord )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1507:6: ( ruleRecord )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1508:1: ruleRecord
                    {
                     before(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3191);
                    ruleRecord();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1513:6: ( ruleGetDigits )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1513:6: ( ruleGetDigits )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1514:1: ruleGetDigits
                    {
                     before(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3208);
                    ruleGetDigits();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1519:6: ( ruleAsk )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1519:6: ( ruleAsk )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1520:1: ruleAsk
                    {
                     before(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives3225);
                    ruleAsk();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1525:6: ( ruleSend )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1525:6: ( ruleSend )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1526:1: ruleSend
                    {
                     before(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3242);
                    ruleSend();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1531:6: ( ruleReject )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1531:6: ( ruleReject )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1532:1: ruleReject
                    {
                     before(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3259);
                    ruleReject();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1537:6: ( ruleHangup )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1537:6: ( ruleHangup )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1538:1: ruleHangup
                    {
                     before(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3276);
                    ruleHangup();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1543:6: ( ruleCall )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1543:6: ( ruleCall )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1544:1: ruleCall
                    {
                     before(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives3293);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1549:6: ( ruleSms )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1549:6: ( ruleSms )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1550:1: ruleSms
                    {
                     before(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleSms_in_rule__VoiceTag__Alternatives3310);
                    ruleSms();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_10()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1560:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) );
    public final void rule__TerminalBoolExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1564:1: ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1565:1: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1565:1: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1566:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3342);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1571:6: ( ruleCompareExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1571:6: ( ruleCompareExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1572:1: ruleCompareExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3359);
                    ruleCompareExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1577:6: ( ruleNegExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1577:6: ( ruleNegExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1578:1: ruleNegExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3376);
                    ruleNegExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1583:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1583:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1584:1: ruleLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3393);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1589:6: ( ruleBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1589:6: ( ruleBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1590:1: ruleBrackets
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3410);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1595:6: ( ruleCALLSTATUS )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1595:6: ( ruleCALLSTATUS )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1596:1: ruleCALLSTATUS
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_rule__TerminalBoolExpression__Alternatives3427);
                    ruleCALLSTATUS();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1606:1: rule__MathTerminal__Alternatives : ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) );
    public final void rule__MathTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1610:1: ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case 62:
            case 63:
            case 64:
            case 65:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1611:1: ( ruleMathBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1611:1: ( ruleMathBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1612:1: ruleMathBrackets
                    {
                     before(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3459);
                    ruleMathBrackets();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1617:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1617:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1618:1: ruleLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3476);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1623:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1623:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1624:1: ruleNumLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3493);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1634:1: rule__ConcatenationTerminal__Alternatives : ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) );
    public final void rule__ConcatenationTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1638:1: ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OBRACKET) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_DOUBLE && LA6_0<=RULE_ID)||LA6_0==RULE_STRING||(LA6_0>=RULE_NULL && LA6_0<=RULE_BOOL)||(LA6_0>=62 && LA6_0<=65)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1639:1: ( ruleConcatenationBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1639:1: ( ruleConcatenationBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1640:1: ruleConcatenationBrackets
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3525);
                    ruleConcatenationBrackets();

                    state._fsp--;

                     after(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1645:6: ( ruleLiteralAbs )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1645:6: ( ruleLiteralAbs )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1646:1: ruleLiteralAbs
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3542);
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


    // $ANTLR start "rule__StringVariable__Alternatives_2_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1656:1: rule__StringVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__StringVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1660:1: ( ( '=' ) | ( ' = ' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1661:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1661:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1662:1: '='
                    {
                     before(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__StringVariable__Alternatives_2_03575); 
                     after(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1669:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1669:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1670:1: ' = '
                    {
                     before(grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__StringVariable__Alternatives_2_03595); 
                     after(grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 

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
    // $ANTLR end "rule__StringVariable__Alternatives_2_0"


    // $ANTLR start "rule__NumVariable__Alternatives_2_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1682:1: rule__NumVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__NumVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1686:1: ( ( '=' ) | ( ' = ' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1687:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1687:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1688:1: '='
                    {
                     before(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__NumVariable__Alternatives_2_03630); 
                     after(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1695:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1695:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1696:1: ' = '
                    {
                     before(grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__NumVariable__Alternatives_2_03650); 
                     after(grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 

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
    // $ANTLR end "rule__NumVariable__Alternatives_2_0"


    // $ANTLR start "rule__BoolVariable__Alternatives_2_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1708:1: rule__BoolVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__BoolVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1712:1: ( ( '=' ) | ( ' = ' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1713:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1713:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1714:1: '='
                    {
                     before(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__BoolVariable__Alternatives_2_03685); 
                     after(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1721:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1721:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1722:1: ' = '
                    {
                     before(grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__BoolVariable__Alternatives_2_03705); 
                     after(grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 

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
    // $ANTLR end "rule__BoolVariable__Alternatives_2_0"


    // $ANTLR start "rule__Constant__Alternatives_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1734:1: rule__Constant__Alternatives_2 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__Constant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1738:1: ( ( '=' ) | ( ' = ' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1739:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1739:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1740:1: '='
                    {
                     before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()); 
                    match(input,21,FOLLOW_21_in_rule__Constant__Alternatives_23740); 
                     after(grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1747:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1747:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1748:1: ' = '
                    {
                     before(grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1()); 
                    match(input,22,FOLLOW_22_in_rule__Constant__Alternatives_23760); 
                     after(grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives_2"


    // $ANTLR start "rule__Primitive__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1760:1: rule__Primitive__Alternatives : ( ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1764:1: ( ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_BOOL:
                {
                alt11=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1765:1: ( ruleStringLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1765:1: ( ruleStringLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1766:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Primitive__Alternatives3794);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1771:6: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1771:6: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1772:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__Primitive__Alternatives3811);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1777:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1777:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1778:1: ruleNumLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__Primitive__Alternatives3828);
                    ruleNumLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__LiteralAbs__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1789:1: rule__LiteralAbs__Alternatives : ( ( ruleLiteral ) | ( rulePrimitive ) );
    public final void rule__LiteralAbs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1793:1: ( ( ruleLiteral ) | ( rulePrimitive ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==RULE_NULL||(LA12_0>=62 && LA12_0<=65)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_DOUBLE && LA12_0<=RULE_INT)||LA12_0==RULE_STRING||LA12_0==RULE_BOOL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1794:1: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1794:1: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1795:1: ruleLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3861);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1800:6: ( rulePrimitive )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1800:6: ( rulePrimitive )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1801:1: rulePrimitive
                    {
                     before(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitive_in_rule__LiteralAbs__Alternatives3878);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1811:1: rule__Literal__Alternatives : ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ruleSESSION ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1815:1: ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ruleSESSION ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_NULL:
                {
                alt13=2;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1816:1: ( ( rule__Literal__VAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1816:1: ( ( rule__Literal__VAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1817:1: ( rule__Literal__VAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getVAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1818:1: ( rule__Literal__VAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1818:2: rule__Literal__VAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3910);
                    rule__Literal__VAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getVAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1822:6: ( ( rule__Literal__NulAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1822:6: ( ( rule__Literal__NulAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1823:1: ( rule__Literal__NulAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getNulAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:1: ( rule__Literal__NulAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:2: rule__Literal__NulAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3928);
                    rule__Literal__NulAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getNulAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1828:6: ( ruleSESSION )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1828:6: ( ruleSESSION )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1829:1: ruleSESSION
                    {
                     before(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSESSION_in_rule__Literal__Alternatives3946);
                    ruleSESSION();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1839:1: rule__Number__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1843:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOUBLE) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1844:1: ( RULE_DOUBLE )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1844:1: ( RULE_DOUBLE )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1845:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3978); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1850:6: ( RULE_INT )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1850:6: ( RULE_INT )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1851:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives3995); 
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


    // $ANTLR start "rule__EVENT__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1861:1: rule__EVENT__Alternatives : ( ( ( rule__EVENT__NameAssignment_0 ) ) | ( ( rule__EVENT__NameAssignment_1 ) ) | ( ( rule__EVENT__NameAssignment_2 ) ) | ( ( rule__EVENT__NameAssignment_3 ) ) | ( ( rule__EVENT__NameAssignment_4 ) ) );
    public final void rule__EVENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1865:1: ( ( ( rule__EVENT__NameAssignment_0 ) ) | ( ( rule__EVENT__NameAssignment_1 ) ) | ( ( rule__EVENT__NameAssignment_2 ) ) | ( ( rule__EVENT__NameAssignment_3 ) ) | ( ( rule__EVENT__NameAssignment_4 ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt15=1;
                }
                break;
            case 58:
                {
                alt15=2;
                }
                break;
            case 59:
                {
                alt15=3;
                }
                break;
            case 60:
                {
                alt15=4;
                }
                break;
            case 61:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1866:1: ( ( rule__EVENT__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1866:1: ( ( rule__EVENT__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1867:1: ( rule__EVENT__NameAssignment_0 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1868:1: ( rule__EVENT__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1868:2: rule__EVENT__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_0_in_rule__EVENT__Alternatives4027);
                    rule__EVENT__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1872:6: ( ( rule__EVENT__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1872:6: ( ( rule__EVENT__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1873:1: ( rule__EVENT__NameAssignment_1 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:1: ( rule__EVENT__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:2: rule__EVENT__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_1_in_rule__EVENT__Alternatives4045);
                    rule__EVENT__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1878:6: ( ( rule__EVENT__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1878:6: ( ( rule__EVENT__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1879:1: ( rule__EVENT__NameAssignment_2 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1880:1: ( rule__EVENT__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1880:2: rule__EVENT__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_2_in_rule__EVENT__Alternatives4063);
                    rule__EVENT__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1884:6: ( ( rule__EVENT__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1884:6: ( ( rule__EVENT__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1885:1: ( rule__EVENT__NameAssignment_3 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1886:1: ( rule__EVENT__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1886:2: rule__EVENT__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_3_in_rule__EVENT__Alternatives4081);
                    rule__EVENT__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1890:6: ( ( rule__EVENT__NameAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1890:6: ( ( rule__EVENT__NameAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1891:1: ( rule__EVENT__NameAssignment_4 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1892:1: ( rule__EVENT__NameAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1892:2: rule__EVENT__NameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_4_in_rule__EVENT__Alternatives4099);
                    rule__EVENT__NameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__EVENT__Alternatives"


    // $ANTLR start "rule__SESSION__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1901:1: rule__SESSION__Alternatives : ( ( ( rule__SESSION__NameAssignment_0 ) ) | ( ( rule__SESSION__NameAssignment_1 ) ) | ( ( rule__SESSION__NameAssignment_2 ) ) | ( ( rule__SESSION__NameAssignment_3 ) ) );
    public final void rule__SESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1905:1: ( ( ( rule__SESSION__NameAssignment_0 ) ) | ( ( rule__SESSION__NameAssignment_1 ) ) | ( ( rule__SESSION__NameAssignment_2 ) ) | ( ( rule__SESSION__NameAssignment_3 ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt16=1;
                }
                break;
            case 63:
                {
                alt16=2;
                }
                break;
            case 64:
                {
                alt16=3;
                }
                break;
            case 65:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1906:1: ( ( rule__SESSION__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1906:1: ( ( rule__SESSION__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1907:1: ( rule__SESSION__NameAssignment_0 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:1: ( rule__SESSION__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:2: rule__SESSION__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_0_in_rule__SESSION__Alternatives4132);
                    rule__SESSION__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1912:6: ( ( rule__SESSION__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1912:6: ( ( rule__SESSION__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1913:1: ( rule__SESSION__NameAssignment_1 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:1: ( rule__SESSION__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:2: rule__SESSION__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_1_in_rule__SESSION__Alternatives4150);
                    rule__SESSION__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1918:6: ( ( rule__SESSION__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1918:6: ( ( rule__SESSION__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1919:1: ( rule__SESSION__NameAssignment_2 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:1: ( rule__SESSION__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:2: rule__SESSION__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_2_in_rule__SESSION__Alternatives4168);
                    rule__SESSION__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1924:6: ( ( rule__SESSION__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1924:6: ( ( rule__SESSION__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1925:1: ( rule__SESSION__NameAssignment_3 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1926:1: ( rule__SESSION__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1926:2: rule__SESSION__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_3_in_rule__SESSION__Alternatives4186);
                    rule__SESSION__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__SESSION__Alternatives"


    // $ANTLR start "rule__CALLSTATUS__Alternatives"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1935:1: rule__CALLSTATUS__Alternatives : ( ( ( rule__CALLSTATUS__NameAssignment_0 ) ) | ( ( rule__CALLSTATUS__NameAssignment_1 ) ) | ( ( rule__CALLSTATUS__NameAssignment_2 ) ) | ( ( rule__CALLSTATUS__NameAssignment_3 ) ) );
    public final void rule__CALLSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1939:1: ( ( ( rule__CALLSTATUS__NameAssignment_0 ) ) | ( ( rule__CALLSTATUS__NameAssignment_1 ) ) | ( ( rule__CALLSTATUS__NameAssignment_2 ) ) | ( ( rule__CALLSTATUS__NameAssignment_3 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt17=1;
                }
                break;
            case 67:
                {
                alt17=2;
                }
                break;
            case 68:
                {
                alt17=3;
                }
                break;
            case 69:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1940:1: ( ( rule__CALLSTATUS__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1940:1: ( ( rule__CALLSTATUS__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1941:1: ( rule__CALLSTATUS__NameAssignment_0 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:1: ( rule__CALLSTATUS__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:2: rule__CALLSTATUS__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_0_in_rule__CALLSTATUS__Alternatives4219);
                    rule__CALLSTATUS__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1946:6: ( ( rule__CALLSTATUS__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1946:6: ( ( rule__CALLSTATUS__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1947:1: ( rule__CALLSTATUS__NameAssignment_1 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:1: ( rule__CALLSTATUS__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:2: rule__CALLSTATUS__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_1_in_rule__CALLSTATUS__Alternatives4237);
                    rule__CALLSTATUS__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1952:6: ( ( rule__CALLSTATUS__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1952:6: ( ( rule__CALLSTATUS__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1953:1: ( rule__CALLSTATUS__NameAssignment_2 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:1: ( rule__CALLSTATUS__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:2: rule__CALLSTATUS__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_2_in_rule__CALLSTATUS__Alternatives4255);
                    rule__CALLSTATUS__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1958:6: ( ( rule__CALLSTATUS__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1958:6: ( ( rule__CALLSTATUS__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1959:1: ( rule__CALLSTATUS__NameAssignment_3 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1960:1: ( rule__CALLSTATUS__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1960:2: rule__CALLSTATUS__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_3_in_rule__CALLSTATUS__Alternatives4273);
                    rule__CALLSTATUS__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__CALLSTATUS__Alternatives"


    // $ANTLR start "rule__Document__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1971:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1975:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1976:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__04304);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__04307);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1983:1: rule__Document__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1987:1: ( ( 'Application' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1988:1: ( 'Application' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1988:1: ( 'Application' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1989:1: 'Application'
            {
             before(grammarAccess.getDocumentAccess().getApplicationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Document__Group__0__Impl4335); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2002:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2006:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2007:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__14366);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__14369);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2014:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2018:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2019:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2019:1: ( ( rule__Document__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2020:1: ( rule__Document__NameAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2021:1: ( rule__Document__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2021:2: rule__Document__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl4396);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2031:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2035:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2036:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__24426);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__24429);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2043:1: rule__Document__Group__2__Impl : ( ( rule__Document__ElementsAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2047:1: ( ( ( rule__Document__ElementsAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2048:1: ( ( rule__Document__ElementsAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2048:1: ( ( rule__Document__ElementsAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2049:1: ( rule__Document__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDocumentAccess().getElementsAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2050:1: ( rule__Document__ElementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ML_COMMENT||(LA18_0>=39 && LA18_0<=42)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2050:2: rule__Document__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl4456);
            	    rule__Document__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2060:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2064:1: ( rule__Document__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2065:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__34487);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2071:1: rule__Document__Group__3__Impl : ( ( rule__Document__StaAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2075:1: ( ( ( rule__Document__StaAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2076:1: ( ( rule__Document__StaAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2076:1: ( ( rule__Document__StaAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2077:1: ( rule__Document__StaAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getStaAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2078:1: ( rule__Document__StaAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24||LA19_0==26||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2078:2: rule__Document__StaAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl4514);
            	    rule__Document__StaAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2096:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2100:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2101:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__04553);
            rule__State__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__04556);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2108:1: rule__State__Group_0__0__Impl : ( 'State' ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2112:1: ( ( 'State' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2113:1: ( 'State' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2113:1: ( 'State' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2114:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__State__Group_0__0__Impl4584); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2127:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl rule__State__Group_0__2 ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2131:1: ( rule__State__Group_0__1__Impl rule__State__Group_0__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2132:2: rule__State__Group_0__1__Impl rule__State__Group_0__2
            {
            pushFollow(FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__14615);
            rule__State__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__14618);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2139:1: rule__State__Group_0__1__Impl : ( ( rule__State__NameAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2143:1: ( ( ( rule__State__NameAssignment_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2144:1: ( ( rule__State__NameAssignment_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2144:1: ( ( rule__State__NameAssignment_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2145:1: ( rule__State__NameAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2146:1: ( rule__State__NameAssignment_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2146:2: rule__State__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl4645);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2156:1: rule__State__Group_0__2 : rule__State__Group_0__2__Impl ;
    public final void rule__State__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2160:1: ( rule__State__Group_0__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2161:2: rule__State__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__24675);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2167:1: rule__State__Group_0__2__Impl : ( ( rule__State__Group_0_2__0 )? ) ;
    public final void rule__State__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2171:1: ( ( ( rule__State__Group_0_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2172:1: ( ( rule__State__Group_0_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2172:1: ( ( rule__State__Group_0_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2173:1: ( rule__State__Group_0_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2174:1: ( rule__State__Group_0_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2174:2: rule__State__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl4702);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2190:1: rule__State__Group_0_2__0 : rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 ;
    public final void rule__State__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2194:1: ( rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2195:2: rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__04739);
            rule__State__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__04742);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2202:1: rule__State__Group_0_2__0__Impl : ( 'times' ) ;
    public final void rule__State__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2206:1: ( ( 'times' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2207:1: ( 'times' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2207:1: ( 'times' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2208:1: 'times'
            {
             before(grammarAccess.getStateAccess().getTimesKeyword_0_2_0()); 
            match(input,25,FOLLOW_25_in_rule__State__Group_0_2__0__Impl4770); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2221:1: rule__State__Group_0_2__1 : rule__State__Group_0_2__1__Impl ;
    public final void rule__State__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2225:1: ( rule__State__Group_0_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2226:2: rule__State__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__14801);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2232:1: rule__State__Group_0_2__1__Impl : ( ( rule__State__TimesAssignment_0_2_1 ) ) ;
    public final void rule__State__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2236:1: ( ( ( rule__State__TimesAssignment_0_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2237:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2237:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2238:1: ( rule__State__TimesAssignment_0_2_1 )
            {
             before(grammarAccess.getStateAccess().getTimesAssignment_0_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2239:1: ( rule__State__TimesAssignment_0_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2239:2: rule__State__TimesAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl4828);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2253:1: rule__State__Group_1__0 : rule__State__Group_1__0__Impl rule__State__Group_1__1 ;
    public final void rule__State__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2257:1: ( rule__State__Group_1__0__Impl rule__State__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2258:2: rule__State__Group_1__0__Impl rule__State__Group_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__04862);
            rule__State__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__04865);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2265:1: rule__State__Group_1__0__Impl : ( ( rule__State__Group_1_0__0 )? ) ;
    public final void rule__State__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2269:1: ( ( ( rule__State__Group_1_0__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2270:1: ( ( rule__State__Group_1_0__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2270:1: ( ( rule__State__Group_1_0__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2271:1: ( rule__State__Group_1_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2272:1: ( rule__State__Group_1_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2272:2: rule__State__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4892);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2282:1: rule__State__Group_1__1 : rule__State__Group_1__1__Impl rule__State__Group_1__2 ;
    public final void rule__State__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2286:1: ( rule__State__Group_1__1__Impl rule__State__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2287:2: rule__State__Group_1__1__Impl rule__State__Group_1__2
            {
            pushFollow(FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14923);
            rule__State__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14926);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2294:1: rule__State__Group_1__1__Impl : ( '{' ) ;
    public final void rule__State__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2298:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2299:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2299:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2300:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__State__Group_1__1__Impl4954); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2313:1: rule__State__Group_1__2 : rule__State__Group_1__2__Impl rule__State__Group_1__3 ;
    public final void rule__State__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2317:1: ( rule__State__Group_1__2__Impl rule__State__Group_1__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2318:2: rule__State__Group_1__2__Impl rule__State__Group_1__3
            {
            pushFollow(FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24985);
            rule__State__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__24988);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2325:1: rule__State__Group_1__2__Impl : ( ( rule__State__StmsAssignment_1_2 )* ) ;
    public final void rule__State__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2329:1: ( ( ( rule__State__StmsAssignment_1_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2330:1: ( ( rule__State__StmsAssignment_1_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2330:1: ( ( rule__State__StmsAssignment_1_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2331:1: ( rule__State__StmsAssignment_1_2 )*
            {
             before(grammarAccess.getStateAccess().getStmsAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2332:1: ( rule__State__StmsAssignment_1_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ML_COMMENT||(LA22_0>=39 && LA22_0<=55)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2332:2: rule__State__StmsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl5015);
            	    rule__State__StmsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2342:1: rule__State__Group_1__3 : rule__State__Group_1__3__Impl ;
    public final void rule__State__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2346:1: ( rule__State__Group_1__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2347:2: rule__State__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__35046);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2353:1: rule__State__Group_1__3__Impl : ( '}' ) ;
    public final void rule__State__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2357:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2358:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2358:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2359:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_1__3__Impl5074); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2380:1: rule__State__Group_1_0__0 : rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 ;
    public final void rule__State__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2384:1: ( rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2385:2: rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__05113);
            rule__State__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__05116);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2392:1: rule__State__Group_1_0__0__Impl : ( 'timeout' ) ;
    public final void rule__State__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2396:1: ( ( 'timeout' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2397:1: ( 'timeout' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2397:1: ( 'timeout' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2398:1: 'timeout'
            {
             before(grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0()); 
            match(input,28,FOLLOW_28_in_rule__State__Group_1_0__0__Impl5144); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2411:1: rule__State__Group_1_0__1 : rule__State__Group_1_0__1__Impl ;
    public final void rule__State__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2415:1: ( rule__State__Group_1_0__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2416:2: rule__State__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__15175);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2422:1: rule__State__Group_1_0__1__Impl : ( ( rule__State__TimeoutAssignment_1_0_1 ) ) ;
    public final void rule__State__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2426:1: ( ( ( rule__State__TimeoutAssignment_1_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2427:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2427:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2428:1: ( rule__State__TimeoutAssignment_1_0_1 )
            {
             before(grammarAccess.getStateAccess().getTimeoutAssignment_1_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2429:1: ( rule__State__TimeoutAssignment_1_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2429:2: rule__State__TimeoutAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl5202);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2443:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2447:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2448:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05236);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05239);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2455:1: rule__Call__Group__0__Impl : ( ( rule__Call__NameAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2459:1: ( ( ( rule__Call__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2460:1: ( ( rule__Call__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2460:1: ( ( rule__Call__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2461:1: ( rule__Call__NameAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2462:1: ( rule__Call__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2462:2: rule__Call__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5266);
            rule__Call__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2472:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2476:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2477:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15296);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15299);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2484:1: rule__Call__Group__1__Impl : ( ( rule__Call__ToAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2488:1: ( ( ( rule__Call__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2489:1: ( ( rule__Call__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2489:1: ( ( rule__Call__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2490:1: ( rule__Call__ToAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2491:1: ( rule__Call__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2491:2: rule__Call__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl5326);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2501:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2505:1: ( rule__Call__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2506:2: rule__Call__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25356);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2512:1: rule__Call__Group__2__Impl : ( ';' ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2516:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2517:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2517:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2518:1: ';'
            {
             before(grammarAccess.getCallAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Call__Group__2__Impl5384); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2537:1: rule__Dial__Group__0 : rule__Dial__Group__0__Impl rule__Dial__Group__1 ;
    public final void rule__Dial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2541:1: ( rule__Dial__Group__0__Impl rule__Dial__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2542:2: rule__Dial__Group__0__Impl rule__Dial__Group__1
            {
            pushFollow(FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__05421);
            rule__Dial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__05424);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2549:1: rule__Dial__Group__0__Impl : ( ( rule__Dial__NameAssignment_0 ) ) ;
    public final void rule__Dial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2553:1: ( ( ( rule__Dial__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2554:1: ( ( rule__Dial__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2554:1: ( ( rule__Dial__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2555:1: ( rule__Dial__NameAssignment_0 )
            {
             before(grammarAccess.getDialAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2556:1: ( rule__Dial__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2556:2: rule__Dial__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Dial__NameAssignment_0_in_rule__Dial__Group__0__Impl5451);
            rule__Dial__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDialAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2566:1: rule__Dial__Group__1 : rule__Dial__Group__1__Impl rule__Dial__Group__2 ;
    public final void rule__Dial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2570:1: ( rule__Dial__Group__1__Impl rule__Dial__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2571:2: rule__Dial__Group__1__Impl rule__Dial__Group__2
            {
            pushFollow(FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__15481);
            rule__Dial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__15484);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2578:1: rule__Dial__Group__1__Impl : ( ( rule__Dial__ToAssignment_1 ) ) ;
    public final void rule__Dial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2582:1: ( ( ( rule__Dial__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2583:1: ( ( rule__Dial__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2583:1: ( ( rule__Dial__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2584:1: ( rule__Dial__ToAssignment_1 )
            {
             before(grammarAccess.getDialAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2585:1: ( rule__Dial__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2585:2: rule__Dial__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl5511);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2595:1: rule__Dial__Group__2 : rule__Dial__Group__2__Impl ;
    public final void rule__Dial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2599:1: ( rule__Dial__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2600:2: rule__Dial__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__25541);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2606:1: rule__Dial__Group__2__Impl : ( ';' ) ;
    public final void rule__Dial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2610:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2611:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2611:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2612:1: ';'
            {
             before(grammarAccess.getDialAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Dial__Group__2__Impl5569); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2631:1: rule__Play__Group__0 : rule__Play__Group__0__Impl rule__Play__Group__1 ;
    public final void rule__Play__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2635:1: ( rule__Play__Group__0__Impl rule__Play__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2636:2: rule__Play__Group__0__Impl rule__Play__Group__1
            {
            pushFollow(FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__05606);
            rule__Play__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__1_in_rule__Play__Group__05609);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2643:1: rule__Play__Group__0__Impl : ( ( rule__Play__NameAssignment_0 ) ) ;
    public final void rule__Play__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2647:1: ( ( ( rule__Play__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2648:1: ( ( rule__Play__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2648:1: ( ( rule__Play__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2649:1: ( rule__Play__NameAssignment_0 )
            {
             before(grammarAccess.getPlayAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2650:1: ( rule__Play__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2650:2: rule__Play__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Play__NameAssignment_0_in_rule__Play__Group__0__Impl5636);
            rule__Play__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlayAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2660:1: rule__Play__Group__1 : rule__Play__Group__1__Impl rule__Play__Group__2 ;
    public final void rule__Play__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2664:1: ( rule__Play__Group__1__Impl rule__Play__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2665:2: rule__Play__Group__1__Impl rule__Play__Group__2
            {
            pushFollow(FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__15666);
            rule__Play__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__2_in_rule__Play__Group__15669);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2672:1: rule__Play__Group__1__Impl : ( ( rule__Play__FileAssignment_1 ) ) ;
    public final void rule__Play__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2676:1: ( ( ( rule__Play__FileAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2677:1: ( ( rule__Play__FileAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2677:1: ( ( rule__Play__FileAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2678:1: ( rule__Play__FileAssignment_1 )
            {
             before(grammarAccess.getPlayAccess().getFileAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2679:1: ( rule__Play__FileAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2679:2: rule__Play__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl5696);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2689:1: rule__Play__Group__2 : rule__Play__Group__2__Impl ;
    public final void rule__Play__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2693:1: ( rule__Play__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2694:2: rule__Play__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__25726);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2700:1: rule__Play__Group__2__Impl : ( ';' ) ;
    public final void rule__Play__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2704:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2705:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2705:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2706:1: ';'
            {
             before(grammarAccess.getPlayAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Play__Group__2__Impl5754); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2725:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2729:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2730:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05791);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05794);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2737:1: rule__Record__Group__0__Impl : ( ( rule__Record__NameAssignment_0 ) ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2741:1: ( ( ( rule__Record__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2742:1: ( ( rule__Record__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2742:1: ( ( rule__Record__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2743:1: ( rule__Record__NameAssignment_0 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:1: ( rule__Record__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:2: rule__Record__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Record__NameAssignment_0_in_rule__Record__Group__0__Impl5821);
            rule__Record__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2754:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2758:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2759:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15851);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15854);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2766:1: rule__Record__Group__1__Impl : ( ( rule__Record__TimeAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2770:1: ( ( ( rule__Record__TimeAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2771:1: ( ( rule__Record__TimeAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2771:1: ( ( rule__Record__TimeAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2772:1: ( rule__Record__TimeAssignment_1 )
            {
             before(grammarAccess.getRecordAccess().getTimeAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2773:1: ( rule__Record__TimeAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2773:2: rule__Record__TimeAssignment_1
            {
            pushFollow(FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5881);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2783:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2787:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2788:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25911);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25914);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2795:1: rule__Record__Group__2__Impl : ( 'seconds' ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2799:1: ( ( 'seconds' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2800:1: ( 'seconds' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2800:1: ( 'seconds' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2801:1: 'seconds'
            {
             before(grammarAccess.getRecordAccess().getSecondsKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Record__Group__2__Impl5942); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2814:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2818:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2819:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35973);
            rule__Record__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__4_in_rule__Record__Group__35976);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2826:1: rule__Record__Group__3__Impl : ( 'in' ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2830:1: ( ( 'in' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2831:1: ( 'in' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2831:1: ( 'in' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2832:1: 'in'
            {
             before(grammarAccess.getRecordAccess().getInKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Record__Group__3__Impl6004); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2845:1: rule__Record__Group__4 : rule__Record__Group__4__Impl rule__Record__Group__5 ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2849:1: ( rule__Record__Group__4__Impl rule__Record__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2850:2: rule__Record__Group__4__Impl rule__Record__Group__5
            {
            pushFollow(FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__46035);
            rule__Record__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__5_in_rule__Record__Group__46038);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2857:1: rule__Record__Group__4__Impl : ( ( rule__Record__ActionAssignment_4 ) ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2861:1: ( ( ( rule__Record__ActionAssignment_4 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2862:1: ( ( rule__Record__ActionAssignment_4 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2862:1: ( ( rule__Record__ActionAssignment_4 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2863:1: ( rule__Record__ActionAssignment_4 )
            {
             before(grammarAccess.getRecordAccess().getActionAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2864:1: ( rule__Record__ActionAssignment_4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2864:2: rule__Record__ActionAssignment_4
            {
            pushFollow(FOLLOW_rule__Record__ActionAssignment_4_in_rule__Record__Group__4__Impl6065);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2874:1: rule__Record__Group__5 : rule__Record__Group__5__Impl rule__Record__Group__6 ;
    public final void rule__Record__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2878:1: ( rule__Record__Group__5__Impl rule__Record__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2879:2: rule__Record__Group__5__Impl rule__Record__Group__6
            {
            pushFollow(FOLLOW_rule__Record__Group__5__Impl_in_rule__Record__Group__56095);
            rule__Record__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__6_in_rule__Record__Group__56098);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2886:1: rule__Record__Group__5__Impl : ( ( rule__Record__Group_5__0 )? ) ;
    public final void rule__Record__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2890:1: ( ( ( rule__Record__Group_5__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2891:1: ( ( rule__Record__Group_5__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2891:1: ( ( rule__Record__Group_5__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2892:1: ( rule__Record__Group_5__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2893:1: ( rule__Record__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2893:2: rule__Record__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Record__Group_5__0_in_rule__Record__Group__5__Impl6125);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2903:1: rule__Record__Group__6 : rule__Record__Group__6__Impl ;
    public final void rule__Record__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2907:1: ( rule__Record__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2908:2: rule__Record__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group__6__Impl_in_rule__Record__Group__66156);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2914:1: rule__Record__Group__6__Impl : ( ';' ) ;
    public final void rule__Record__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2918:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2919:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2919:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2920:1: ';'
            {
             before(grammarAccess.getRecordAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__Record__Group__6__Impl6184); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2947:1: rule__Record__Group_5__0 : rule__Record__Group_5__0__Impl rule__Record__Group_5__1 ;
    public final void rule__Record__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2951:1: ( rule__Record__Group_5__0__Impl rule__Record__Group_5__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2952:2: rule__Record__Group_5__0__Impl rule__Record__Group_5__1
            {
            pushFollow(FOLLOW_rule__Record__Group_5__0__Impl_in_rule__Record__Group_5__06229);
            rule__Record__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group_5__1_in_rule__Record__Group_5__06232);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2959:1: rule__Record__Group_5__0__Impl : ( ' -> ' ) ;
    public final void rule__Record__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2963:1: ( ( ' -> ' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2964:1: ( ' -> ' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2964:1: ( ' -> ' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2965:1: ' -> '
            {
             before(grammarAccess.getRecordAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5_0()); 
            match(input,32,FOLLOW_32_in_rule__Record__Group_5__0__Impl6260); 
             after(grammarAccess.getRecordAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2978:1: rule__Record__Group_5__1 : rule__Record__Group_5__1__Impl ;
    public final void rule__Record__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2982:1: ( rule__Record__Group_5__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2983:2: rule__Record__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group_5__1__Impl_in_rule__Record__Group_5__16291);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2989:1: rule__Record__Group_5__1__Impl : ( ( rule__Record__VariAssignment_5_1 ) ) ;
    public final void rule__Record__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2993:1: ( ( ( rule__Record__VariAssignment_5_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2994:1: ( ( rule__Record__VariAssignment_5_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2994:1: ( ( rule__Record__VariAssignment_5_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2995:1: ( rule__Record__VariAssignment_5_1 )
            {
             before(grammarAccess.getRecordAccess().getVariAssignment_5_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2996:1: ( rule__Record__VariAssignment_5_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2996:2: rule__Record__VariAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Record__VariAssignment_5_1_in_rule__Record__Group_5__1__Impl6318);
            rule__Record__VariAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getVariAssignment_5_1()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3010:1: rule__GetDigits__Group__0 : rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 ;
    public final void rule__GetDigits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3014:1: ( rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3015:2: rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__06352);
            rule__GetDigits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__06355);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3022:1: rule__GetDigits__Group__0__Impl : ( ( rule__GetDigits__NameAssignment_0 ) ) ;
    public final void rule__GetDigits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3026:1: ( ( ( rule__GetDigits__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3027:1: ( ( rule__GetDigits__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3027:1: ( ( rule__GetDigits__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3028:1: ( rule__GetDigits__NameAssignment_0 )
            {
             before(grammarAccess.getGetDigitsAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3029:1: ( rule__GetDigits__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3029:2: rule__GetDigits__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__GetDigits__NameAssignment_0_in_rule__GetDigits__Group__0__Impl6382);
            rule__GetDigits__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGetDigitsAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3039:1: rule__GetDigits__Group__1 : rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 ;
    public final void rule__GetDigits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3043:1: ( rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3044:2: rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__16412);
            rule__GetDigits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__16415);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3051:1: rule__GetDigits__Group__1__Impl : ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) ;
    public final void rule__GetDigits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3055:1: ( ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3056:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3056:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3057:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3058:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3058:2: rule__GetDigits__NumDigitsAssignment_1
            {
            pushFollow(FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl6442);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3068:1: rule__GetDigits__Group__2 : rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 ;
    public final void rule__GetDigits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3072:1: ( rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3073:2: rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__26472);
            rule__GetDigits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__26475);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3080:1: rule__GetDigits__Group__2__Impl : ( 'digits' ) ;
    public final void rule__GetDigits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3084:1: ( ( 'digits' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3085:1: ( 'digits' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3085:1: ( 'digits' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3086:1: 'digits'
            {
             before(grammarAccess.getGetDigitsAccess().getDigitsKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__GetDigits__Group__2__Impl6503); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3099:1: rule__GetDigits__Group__3 : rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4 ;
    public final void rule__GetDigits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3103:1: ( rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3104:2: rule__GetDigits__Group__3__Impl rule__GetDigits__Group__4
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__36534);
            rule__GetDigits__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__4_in_rule__GetDigits__Group__36537);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3111:1: rule__GetDigits__Group__3__Impl : ( ( rule__GetDigits__QuestionAssignment_3 ) ) ;
    public final void rule__GetDigits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3115:1: ( ( ( rule__GetDigits__QuestionAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3116:1: ( ( rule__GetDigits__QuestionAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3116:1: ( ( rule__GetDigits__QuestionAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3117:1: ( rule__GetDigits__QuestionAssignment_3 )
            {
             before(grammarAccess.getGetDigitsAccess().getQuestionAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3118:1: ( rule__GetDigits__QuestionAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3118:2: rule__GetDigits__QuestionAssignment_3
            {
            pushFollow(FOLLOW_rule__GetDigits__QuestionAssignment_3_in_rule__GetDigits__Group__3__Impl6564);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3128:1: rule__GetDigits__Group__4 : rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5 ;
    public final void rule__GetDigits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3132:1: ( rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3133:2: rule__GetDigits__Group__4__Impl rule__GetDigits__Group__5
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__4__Impl_in_rule__GetDigits__Group__46594);
            rule__GetDigits__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__5_in_rule__GetDigits__Group__46597);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3140:1: rule__GetDigits__Group__4__Impl : ( ' -> ' ) ;
    public final void rule__GetDigits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3144:1: ( ( ' -> ' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3145:1: ( ' -> ' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3145:1: ( ' -> ' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3146:1: ' -> '
            {
             before(grammarAccess.getGetDigitsAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__GetDigits__Group__4__Impl6625); 
             after(grammarAccess.getGetDigitsAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3159:1: rule__GetDigits__Group__5 : rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6 ;
    public final void rule__GetDigits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3163:1: ( rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3164:2: rule__GetDigits__Group__5__Impl rule__GetDigits__Group__6
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__5__Impl_in_rule__GetDigits__Group__56656);
            rule__GetDigits__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__6_in_rule__GetDigits__Group__56659);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3171:1: rule__GetDigits__Group__5__Impl : ( ( rule__GetDigits__VariAssignment_5 ) ) ;
    public final void rule__GetDigits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3175:1: ( ( ( rule__GetDigits__VariAssignment_5 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3176:1: ( ( rule__GetDigits__VariAssignment_5 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3176:1: ( ( rule__GetDigits__VariAssignment_5 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3177:1: ( rule__GetDigits__VariAssignment_5 )
            {
             before(grammarAccess.getGetDigitsAccess().getVariAssignment_5()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3178:1: ( rule__GetDigits__VariAssignment_5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3178:2: rule__GetDigits__VariAssignment_5
            {
            pushFollow(FOLLOW_rule__GetDigits__VariAssignment_5_in_rule__GetDigits__Group__5__Impl6686);
            rule__GetDigits__VariAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGetDigitsAccess().getVariAssignment_5()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3188:1: rule__GetDigits__Group__6 : rule__GetDigits__Group__6__Impl ;
    public final void rule__GetDigits__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3192:1: ( rule__GetDigits__Group__6__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3193:2: rule__GetDigits__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__6__Impl_in_rule__GetDigits__Group__66716);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3199:1: rule__GetDigits__Group__6__Impl : ( ';' ) ;
    public final void rule__GetDigits__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3203:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3204:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3204:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3205:1: ';'
            {
             before(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__GetDigits__Group__6__Impl6744); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3232:1: rule__Ask__Group__0 : rule__Ask__Group__0__Impl rule__Ask__Group__1 ;
    public final void rule__Ask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3236:1: ( rule__Ask__Group__0__Impl rule__Ask__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3237:2: rule__Ask__Group__0__Impl rule__Ask__Group__1
            {
            pushFollow(FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__06789);
            rule__Ask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__06792);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3244:1: rule__Ask__Group__0__Impl : ( ( rule__Ask__NameAssignment_0 ) ) ;
    public final void rule__Ask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3248:1: ( ( ( rule__Ask__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3249:1: ( ( rule__Ask__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3249:1: ( ( rule__Ask__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3250:1: ( rule__Ask__NameAssignment_0 )
            {
             before(grammarAccess.getAskAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3251:1: ( rule__Ask__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3251:2: rule__Ask__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Ask__NameAssignment_0_in_rule__Ask__Group__0__Impl6819);
            rule__Ask__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3261:1: rule__Ask__Group__1 : rule__Ask__Group__1__Impl rule__Ask__Group__2 ;
    public final void rule__Ask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3265:1: ( rule__Ask__Group__1__Impl rule__Ask__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3266:2: rule__Ask__Group__1__Impl rule__Ask__Group__2
            {
            pushFollow(FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__16849);
            rule__Ask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__16852);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3273:1: rule__Ask__Group__1__Impl : ( ( rule__Ask__QuestionAssignment_1 ) ) ;
    public final void rule__Ask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3277:1: ( ( ( rule__Ask__QuestionAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3278:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3278:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3279:1: ( rule__Ask__QuestionAssignment_1 )
            {
             before(grammarAccess.getAskAccess().getQuestionAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3280:1: ( rule__Ask__QuestionAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3280:2: rule__Ask__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6879);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3290:1: rule__Ask__Group__2 : rule__Ask__Group__2__Impl rule__Ask__Group__3 ;
    public final void rule__Ask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3294:1: ( rule__Ask__Group__2__Impl rule__Ask__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3295:2: rule__Ask__Group__2__Impl rule__Ask__Group__3
            {
            pushFollow(FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26909);
            rule__Ask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__3_in_rule__Ask__Group__26912);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3302:1: rule__Ask__Group__2__Impl : ( ' -> ' ) ;
    public final void rule__Ask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3306:1: ( ( ' -> ' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3307:1: ( ' -> ' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3307:1: ( ' -> ' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3308:1: ' -> '
            {
             before(grammarAccess.getAskAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Ask__Group__2__Impl6940); 
             after(grammarAccess.getAskAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_2()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3321:1: rule__Ask__Group__3 : rule__Ask__Group__3__Impl rule__Ask__Group__4 ;
    public final void rule__Ask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3325:1: ( rule__Ask__Group__3__Impl rule__Ask__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3326:2: rule__Ask__Group__3__Impl rule__Ask__Group__4
            {
            pushFollow(FOLLOW_rule__Ask__Group__3__Impl_in_rule__Ask__Group__36971);
            rule__Ask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__4_in_rule__Ask__Group__36974);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3333:1: rule__Ask__Group__3__Impl : ( ( rule__Ask__VariAssignment_3 ) ) ;
    public final void rule__Ask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3337:1: ( ( ( rule__Ask__VariAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3338:1: ( ( rule__Ask__VariAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3338:1: ( ( rule__Ask__VariAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3339:1: ( rule__Ask__VariAssignment_3 )
            {
             before(grammarAccess.getAskAccess().getVariAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3340:1: ( rule__Ask__VariAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3340:2: rule__Ask__VariAssignment_3
            {
            pushFollow(FOLLOW_rule__Ask__VariAssignment_3_in_rule__Ask__Group__3__Impl7001);
            rule__Ask__VariAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getVariAssignment_3()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3350:1: rule__Ask__Group__4 : rule__Ask__Group__4__Impl ;
    public final void rule__Ask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3354:1: ( rule__Ask__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3355:2: rule__Ask__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ask__Group__4__Impl_in_rule__Ask__Group__47031);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3361:1: rule__Ask__Group__4__Impl : ( ';' ) ;
    public final void rule__Ask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3365:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3366:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3366:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3367:1: ';'
            {
             before(grammarAccess.getAskAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Ask__Group__4__Impl7059); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3390:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3394:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3395:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__07100);
            rule__Send__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__07103);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3402:1: rule__Send__Group__0__Impl : ( ( rule__Send__NameAssignment_0 ) ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3406:1: ( ( ( rule__Send__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3407:1: ( ( rule__Send__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3407:1: ( ( rule__Send__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3408:1: ( rule__Send__NameAssignment_0 )
            {
             before(grammarAccess.getSendAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3409:1: ( rule__Send__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3409:2: rule__Send__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Send__NameAssignment_0_in_rule__Send__Group__0__Impl7130);
            rule__Send__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSendAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3419:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3423:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3424:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__17160);
            rule__Send__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__17163);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3431:1: rule__Send__Group__1__Impl : ( ( rule__Send__ParamsAssignment_1 ) ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3435:1: ( ( ( rule__Send__ParamsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3436:1: ( ( rule__Send__ParamsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3436:1: ( ( rule__Send__ParamsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3437:1: ( rule__Send__ParamsAssignment_1 )
            {
             before(grammarAccess.getSendAccess().getParamsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3438:1: ( rule__Send__ParamsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3438:2: rule__Send__ParamsAssignment_1
            {
            pushFollow(FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl7190);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3448:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3452:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3453:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__27220);
            rule__Send__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__27223);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3460:1: rule__Send__Group__2__Impl : ( 'to' ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3464:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3465:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3465:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3466:1: 'to'
            {
             before(grammarAccess.getSendAccess().getToKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Send__Group__2__Impl7251); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3479:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3483:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3484:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__37282);
            rule__Send__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__37285);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3491:1: rule__Send__Group__3__Impl : ( ( rule__Send__UrlAssignment_3 ) ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3495:1: ( ( ( rule__Send__UrlAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3496:1: ( ( rule__Send__UrlAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3496:1: ( ( rule__Send__UrlAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3497:1: ( rule__Send__UrlAssignment_3 )
            {
             before(grammarAccess.getSendAccess().getUrlAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3498:1: ( rule__Send__UrlAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3498:2: rule__Send__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl7312);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3508:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3512:1: ( rule__Send__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3513:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__47342);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3519:1: rule__Send__Group__4__Impl : ( ';' ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3523:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3524:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3524:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3525:1: ';'
            {
             before(grammarAccess.getSendAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Send__Group__4__Impl7370); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3548:1: rule__SendBlock__Group__0 : rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 ;
    public final void rule__SendBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3552:1: ( rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3553:2: rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__07411);
            rule__SendBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__07414);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3560:1: rule__SendBlock__Group__0__Impl : ( () ) ;
    public final void rule__SendBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3564:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3565:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3565:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3566:1: ()
            {
             before(grammarAccess.getSendBlockAccess().getSendBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3567:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3569:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3579:1: rule__SendBlock__Group__1 : rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 ;
    public final void rule__SendBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3583:1: ( rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3584:2: rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__17472);
            rule__SendBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__17475);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3591:1: rule__SendBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SendBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3595:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3596:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3596:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3597:1: '{'
            {
             before(grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__SendBlock__Group__1__Impl7503); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3610:1: rule__SendBlock__Group__2 : rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 ;
    public final void rule__SendBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3614:1: ( rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3615:2: rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__27534);
            rule__SendBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__27537);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3622:1: rule__SendBlock__Group__2__Impl : ( ( rule__SendBlock__ValueAssignment_2 ) ) ;
    public final void rule__SendBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3626:1: ( ( ( rule__SendBlock__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3627:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3627:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3628:1: ( rule__SendBlock__ValueAssignment_2 )
            {
             before(grammarAccess.getSendBlockAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3629:1: ( rule__SendBlock__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3629:2: rule__SendBlock__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl7564);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3639:1: rule__SendBlock__Group__3 : rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 ;
    public final void rule__SendBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3643:1: ( rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3644:2: rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__37594);
            rule__SendBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__37597);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3651:1: rule__SendBlock__Group__3__Impl : ( ( rule__SendBlock__StmsAssignment_3 )* ) ;
    public final void rule__SendBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3655:1: ( ( ( rule__SendBlock__StmsAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3656:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3656:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3657:1: ( rule__SendBlock__StmsAssignment_3 )*
            {
             before(grammarAccess.getSendBlockAccess().getStmsAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3658:1: ( rule__SendBlock__StmsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3658:2: rule__SendBlock__StmsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl7624);
            	    rule__SendBlock__StmsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3668:1: rule__SendBlock__Group__4 : rule__SendBlock__Group__4__Impl ;
    public final void rule__SendBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3672:1: ( rule__SendBlock__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3673:2: rule__SendBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__47655);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3679:1: rule__SendBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SendBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3683:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3684:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3684:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3685:1: '}'
            {
             before(grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__SendBlock__Group__4__Impl7683); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3708:1: rule__NotPrimaryParam__Group__0 : rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 ;
    public final void rule__NotPrimaryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3712:1: ( rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3713:2: rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__07724);
            rule__NotPrimaryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__07727);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3720:1: rule__NotPrimaryParam__Group__0__Impl : ( ',' ) ;
    public final void rule__NotPrimaryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3724:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3725:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3725:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3726:1: ','
            {
             before(grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__NotPrimaryParam__Group__0__Impl7755); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3739:1: rule__NotPrimaryParam__Group__1 : rule__NotPrimaryParam__Group__1__Impl ;
    public final void rule__NotPrimaryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3743:1: ( rule__NotPrimaryParam__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3744:2: rule__NotPrimaryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__17786);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3750:1: rule__NotPrimaryParam__Group__1__Impl : ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) ;
    public final void rule__NotPrimaryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3754:1: ( ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3755:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3755:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3756:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3757:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3757:2: rule__NotPrimaryParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7813);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3771:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3775:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3776:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07847);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07850);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3783:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3787:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3788:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3788:1: ( ( rule__Param__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3789:1: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3790:1: ( rule__Param__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3790:2: rule__Param__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_0_in_rule__Param__Group__0__Impl7877);
            rule__Param__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3800:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3804:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3805:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17907);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17910);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3812:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3816:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3817:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3817:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3818:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Param__Group__1__Impl7938); 
             after(grammarAccess.getParamAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3831:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3835:1: ( rule__Param__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3836:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27969);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3842:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3846:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3847:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3847:1: ( ( rule__Param__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3848:1: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3849:1: ( rule__Param__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3849:2: rule__Param__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7996);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3865:1: rule__Say__Group__0 : rule__Say__Group__0__Impl rule__Say__Group__1 ;
    public final void rule__Say__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3869:1: ( rule__Say__Group__0__Impl rule__Say__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3870:2: rule__Say__Group__0__Impl rule__Say__Group__1
            {
            pushFollow(FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__08032);
            rule__Say__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__1_in_rule__Say__Group__08035);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3877:1: rule__Say__Group__0__Impl : ( ( rule__Say__NameAssignment_0 ) ) ;
    public final void rule__Say__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3881:1: ( ( ( rule__Say__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3882:1: ( ( rule__Say__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3882:1: ( ( rule__Say__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3883:1: ( rule__Say__NameAssignment_0 )
            {
             before(grammarAccess.getSayAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3884:1: ( rule__Say__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3884:2: rule__Say__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Say__NameAssignment_0_in_rule__Say__Group__0__Impl8062);
            rule__Say__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSayAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3894:1: rule__Say__Group__1 : rule__Say__Group__1__Impl rule__Say__Group__2 ;
    public final void rule__Say__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3898:1: ( rule__Say__Group__1__Impl rule__Say__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3899:2: rule__Say__Group__1__Impl rule__Say__Group__2
            {
            pushFollow(FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__18092);
            rule__Say__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__2_in_rule__Say__Group__18095);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3906:1: rule__Say__Group__1__Impl : ( ( rule__Say__ThatAssignment_1 ) ) ;
    public final void rule__Say__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3910:1: ( ( ( rule__Say__ThatAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3911:1: ( ( rule__Say__ThatAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3911:1: ( ( rule__Say__ThatAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3912:1: ( rule__Say__ThatAssignment_1 )
            {
             before(grammarAccess.getSayAccess().getThatAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3913:1: ( rule__Say__ThatAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3913:2: rule__Say__ThatAssignment_1
            {
            pushFollow(FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl8122);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3923:1: rule__Say__Group__2 : rule__Say__Group__2__Impl ;
    public final void rule__Say__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3927:1: ( rule__Say__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3928:2: rule__Say__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__28152);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3934:1: rule__Say__Group__2__Impl : ( ';' ) ;
    public final void rule__Say__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3938:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3939:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3939:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3940:1: ';'
            {
             before(grammarAccess.getSayAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Say__Group__2__Impl8180); 
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


    // $ANTLR start "rule__Sms__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3959:1: rule__Sms__Group__0 : rule__Sms__Group__0__Impl rule__Sms__Group__1 ;
    public final void rule__Sms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3963:1: ( rule__Sms__Group__0__Impl rule__Sms__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3964:2: rule__Sms__Group__0__Impl rule__Sms__Group__1
            {
            pushFollow(FOLLOW_rule__Sms__Group__0__Impl_in_rule__Sms__Group__08217);
            rule__Sms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__1_in_rule__Sms__Group__08220);
            rule__Sms__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__0"


    // $ANTLR start "rule__Sms__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3971:1: rule__Sms__Group__0__Impl : ( ( rule__Sms__NameAssignment_0 ) ) ;
    public final void rule__Sms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3975:1: ( ( ( rule__Sms__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3976:1: ( ( rule__Sms__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3976:1: ( ( rule__Sms__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3977:1: ( rule__Sms__NameAssignment_0 )
            {
             before(grammarAccess.getSmsAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3978:1: ( rule__Sms__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3978:2: rule__Sms__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Sms__NameAssignment_0_in_rule__Sms__Group__0__Impl8247);
            rule__Sms__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSmsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__0__Impl"


    // $ANTLR start "rule__Sms__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3988:1: rule__Sms__Group__1 : rule__Sms__Group__1__Impl rule__Sms__Group__2 ;
    public final void rule__Sms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3992:1: ( rule__Sms__Group__1__Impl rule__Sms__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3993:2: rule__Sms__Group__1__Impl rule__Sms__Group__2
            {
            pushFollow(FOLLOW_rule__Sms__Group__1__Impl_in_rule__Sms__Group__18277);
            rule__Sms__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__2_in_rule__Sms__Group__18280);
            rule__Sms__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__1"


    // $ANTLR start "rule__Sms__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4000:1: rule__Sms__Group__1__Impl : ( ( rule__Sms__ValueAssignment_1 ) ) ;
    public final void rule__Sms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4004:1: ( ( ( rule__Sms__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4005:1: ( ( rule__Sms__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4005:1: ( ( rule__Sms__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4006:1: ( rule__Sms__ValueAssignment_1 )
            {
             before(grammarAccess.getSmsAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4007:1: ( rule__Sms__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4007:2: rule__Sms__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Sms__ValueAssignment_1_in_rule__Sms__Group__1__Impl8307);
            rule__Sms__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmsAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__1__Impl"


    // $ANTLR start "rule__Sms__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4017:1: rule__Sms__Group__2 : rule__Sms__Group__2__Impl rule__Sms__Group__3 ;
    public final void rule__Sms__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4021:1: ( rule__Sms__Group__2__Impl rule__Sms__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4022:2: rule__Sms__Group__2__Impl rule__Sms__Group__3
            {
            pushFollow(FOLLOW_rule__Sms__Group__2__Impl_in_rule__Sms__Group__28337);
            rule__Sms__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__3_in_rule__Sms__Group__28340);
            rule__Sms__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__2"


    // $ANTLR start "rule__Sms__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4029:1: rule__Sms__Group__2__Impl : ( 'to' ) ;
    public final void rule__Sms__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4033:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4034:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4034:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4035:1: 'to'
            {
             before(grammarAccess.getSmsAccess().getToKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Sms__Group__2__Impl8368); 
             after(grammarAccess.getSmsAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__2__Impl"


    // $ANTLR start "rule__Sms__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4048:1: rule__Sms__Group__3 : rule__Sms__Group__3__Impl rule__Sms__Group__4 ;
    public final void rule__Sms__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4052:1: ( rule__Sms__Group__3__Impl rule__Sms__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4053:2: rule__Sms__Group__3__Impl rule__Sms__Group__4
            {
            pushFollow(FOLLOW_rule__Sms__Group__3__Impl_in_rule__Sms__Group__38399);
            rule__Sms__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__4_in_rule__Sms__Group__38402);
            rule__Sms__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__3"


    // $ANTLR start "rule__Sms__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4060:1: rule__Sms__Group__3__Impl : ( ( rule__Sms__ToAssignment_3 ) ) ;
    public final void rule__Sms__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4064:1: ( ( ( rule__Sms__ToAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4065:1: ( ( rule__Sms__ToAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4065:1: ( ( rule__Sms__ToAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4066:1: ( rule__Sms__ToAssignment_3 )
            {
             before(grammarAccess.getSmsAccess().getToAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4067:1: ( rule__Sms__ToAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4067:2: rule__Sms__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__Sms__ToAssignment_3_in_rule__Sms__Group__3__Impl8429);
            rule__Sms__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSmsAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__3__Impl"


    // $ANTLR start "rule__Sms__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4077:1: rule__Sms__Group__4 : rule__Sms__Group__4__Impl ;
    public final void rule__Sms__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4081:1: ( rule__Sms__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4082:2: rule__Sms__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sms__Group__4__Impl_in_rule__Sms__Group__48459);
            rule__Sms__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__4"


    // $ANTLR start "rule__Sms__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4088:1: rule__Sms__Group__4__Impl : ( ';' ) ;
    public final void rule__Sms__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4092:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4093:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4093:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4094:1: ';'
            {
             before(grammarAccess.getSmsAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Sms__Group__4__Impl8487); 
             after(grammarAccess.getSmsAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4119:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4123:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4124:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__08530);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__08533);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4131:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4135:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4136:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4136:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4137:1: ( rule__Transition__NameAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4138:1: ( rule__Transition__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4138:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl8560);
            rule__Transition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4148:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4152:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4153:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18590);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__18593);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4160:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TargetAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4164:1: ( ( ( rule__Transition__TargetAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4165:1: ( ( rule__Transition__TargetAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4165:1: ( ( rule__Transition__TargetAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4166:1: ( rule__Transition__TargetAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4167:1: ( rule__Transition__TargetAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4167:2: rule__Transition__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl8620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4177:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4181:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4182:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28650);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28653);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4189:1: rule__Transition__Group__2__Impl : ( 'when' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4193:1: ( ( 'when' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4194:1: ( 'when' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4194:1: ( 'when' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4195:1: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Transition__Group__2__Impl8681); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4208:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4212:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4213:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38712);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__38715);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4220:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__EventAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4224:1: ( ( ( rule__Transition__EventAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4225:1: ( ( rule__Transition__EventAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4225:1: ( ( rule__Transition__EventAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4226:1: ( rule__Transition__EventAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4227:1: ( rule__Transition__EventAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4227:2: rule__Transition__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl8742);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4237:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4241:1: ( rule__Transition__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4242:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__48772);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4248:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4252:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4253:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4253:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4254:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Transition__Group__4__Impl8800); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4277:1: rule__IfExp__Group__0 : rule__IfExp__Group__0__Impl rule__IfExp__Group__1 ;
    public final void rule__IfExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4281:1: ( rule__IfExp__Group__0__Impl rule__IfExp__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4282:2: rule__IfExp__Group__0__Impl rule__IfExp__Group__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__08841);
            rule__IfExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__08844);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4289:1: rule__IfExp__Group__0__Impl : ( ( rule__IfExp__BlockAssignment_0 ) ) ;
    public final void rule__IfExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4293:1: ( ( ( rule__IfExp__BlockAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4294:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4294:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4295:1: ( rule__IfExp__BlockAssignment_0 )
            {
             before(grammarAccess.getIfExpAccess().getBlockAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4296:1: ( rule__IfExp__BlockAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4296:2: rule__IfExp__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl8871);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4306:1: rule__IfExp__Group__1 : rule__IfExp__Group__1__Impl rule__IfExp__Group__2 ;
    public final void rule__IfExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4310:1: ( rule__IfExp__Group__1__Impl rule__IfExp__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4311:2: rule__IfExp__Group__1__Impl rule__IfExp__Group__2
            {
            pushFollow(FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__18901);
            rule__IfExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__18904);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4318:1: rule__IfExp__Group__1__Impl : ( ( rule__IfExp__Group_1__0 )* ) ;
    public final void rule__IfExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4322:1: ( ( ( rule__IfExp__Group_1__0 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4323:1: ( ( rule__IfExp__Group_1__0 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4323:1: ( ( rule__IfExp__Group_1__0 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4324:1: ( rule__IfExp__Group_1__0 )*
            {
             before(grammarAccess.getIfExpAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4325:1: ( rule__IfExp__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==55) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4325:2: rule__IfExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl8931);
            	    rule__IfExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4335:1: rule__IfExp__Group__2 : rule__IfExp__Group__2__Impl ;
    public final void rule__IfExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4339:1: ( rule__IfExp__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4340:2: rule__IfExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__28962);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4346:1: rule__IfExp__Group__2__Impl : ( ( rule__IfExp__Group_2__0 )? ) ;
    public final void rule__IfExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4350:1: ( ( ( rule__IfExp__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4351:1: ( ( rule__IfExp__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4351:1: ( ( rule__IfExp__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4352:1: ( rule__IfExp__Group_2__0 )?
            {
             before(grammarAccess.getIfExpAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4353:1: ( rule__IfExp__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4353:2: rule__IfExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl8989);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4369:1: rule__IfExp__Group_1__0 : rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 ;
    public final void rule__IfExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4373:1: ( rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4374:2: rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__09026);
            rule__IfExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__09029);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4381:1: rule__IfExp__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4385:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4386:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4386:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4387:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__IfExp__Group_1__0__Impl9057); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4400:1: rule__IfExp__Group_1__1 : rule__IfExp__Group_1__1__Impl ;
    public final void rule__IfExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4404:1: ( rule__IfExp__Group_1__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4405:2: rule__IfExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__19088);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4411:1: rule__IfExp__Group_1__1__Impl : ( ( rule__IfExp__BlocksAssignment_1_1 ) ) ;
    public final void rule__IfExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4415:1: ( ( ( rule__IfExp__BlocksAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4416:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4416:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4417:1: ( rule__IfExp__BlocksAssignment_1_1 )
            {
             before(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4418:1: ( rule__IfExp__BlocksAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4418:2: rule__IfExp__BlocksAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl9115);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4432:1: rule__IfExp__Group_2__0 : rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 ;
    public final void rule__IfExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4436:1: ( rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4437:2: rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__09149);
            rule__IfExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__09152);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4444:1: rule__IfExp__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4448:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4449:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4449:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4450:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__IfExp__Group_2__0__Impl9180); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4463:1: rule__IfExp__Group_2__1 : rule__IfExp__Group_2__1__Impl ;
    public final void rule__IfExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4467:1: ( rule__IfExp__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4468:2: rule__IfExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__19211);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4474:1: rule__IfExp__Group_2__1__Impl : ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) ;
    public final void rule__IfExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4478:1: ( ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4479:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4479:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4480:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4481:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4481:2: rule__IfExp__DefaultBlockAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl9238);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4495:1: rule__CondBlock__Group__0 : rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 ;
    public final void rule__CondBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4499:1: ( rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4500:2: rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__09272);
            rule__CondBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__09275);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4507:1: rule__CondBlock__Group__0__Impl : ( ( rule__CondBlock__NameAssignment_0 ) ) ;
    public final void rule__CondBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4511:1: ( ( ( rule__CondBlock__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4512:1: ( ( rule__CondBlock__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4512:1: ( ( rule__CondBlock__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4513:1: ( rule__CondBlock__NameAssignment_0 )
            {
             before(grammarAccess.getCondBlockAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4514:1: ( rule__CondBlock__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4514:2: rule__CondBlock__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CondBlock__NameAssignment_0_in_rule__CondBlock__Group__0__Impl9302);
            rule__CondBlock__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCondBlockAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4524:1: rule__CondBlock__Group__1 : rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 ;
    public final void rule__CondBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4528:1: ( rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4529:2: rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__19332);
            rule__CondBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__19335);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4536:1: rule__CondBlock__Group__1__Impl : ( ( rule__CondBlock__CondAssignment_1 ) ) ;
    public final void rule__CondBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4540:1: ( ( ( rule__CondBlock__CondAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4541:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4541:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4542:1: ( rule__CondBlock__CondAssignment_1 )
            {
             before(grammarAccess.getCondBlockAccess().getCondAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4543:1: ( rule__CondBlock__CondAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4543:2: rule__CondBlock__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl9362);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4553:1: rule__CondBlock__Group__2 : rule__CondBlock__Group__2__Impl ;
    public final void rule__CondBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4557:1: ( rule__CondBlock__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4558:2: rule__CondBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__29392);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4564:1: rule__CondBlock__Group__2__Impl : ( ( rule__CondBlock__ActionAssignment_2 ) ) ;
    public final void rule__CondBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4568:1: ( ( ( rule__CondBlock__ActionAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4569:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4569:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4570:1: ( rule__CondBlock__ActionAssignment_2 )
            {
             before(grammarAccess.getCondBlockAccess().getActionAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4571:1: ( rule__CondBlock__ActionAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4571:2: rule__CondBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl9419);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4587:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4591:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4592:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09455);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09458);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4599:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4603:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4604:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4604:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4605:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4606:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4608:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4618:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4622:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4623:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19516);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19519);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4630:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4634:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4635:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4635:1: ( ( rule__Block__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4636:1: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4637:1: ( rule__Block__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4637:2: rule__Block__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl9546);
            rule__Block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4647:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4651:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4652:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29576);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29579);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4659:1: rule__Block__Group__2__Impl : ( ( rule__Block__StaAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4663:1: ( ( ( rule__Block__StaAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4664:1: ( ( rule__Block__StaAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4664:1: ( ( rule__Block__StaAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4665:1: ( rule__Block__StaAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getStaAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4666:1: ( rule__Block__StaAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ML_COMMENT||(LA27_0>=39 && LA27_0<=55)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4666:2: rule__Block__StaAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl9606);
            	    rule__Block__StaAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4676:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4680:1: ( rule__Block__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4681:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__39637);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4687:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4691:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4692:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4692:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4693:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Block__Group__3__Impl9665); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4714:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4718:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4719:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__09704);
            rule__BoolExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__09707);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4726:1: rule__BoolExpression__Group__0__Impl : ( ruleTerminalBoolExpression ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4730:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4731:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4731:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4732:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl9734);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4743:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4747:1: ( rule__BoolExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4748:2: rule__BoolExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__19763);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4754:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4758:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4759:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4759:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4760:1: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4761:1: ( rule__BoolExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LOGIC_WORD) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4761:2: rule__BoolExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl9790);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4775:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4779:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4780:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__09825);
            rule__BoolExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__09828);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4787:1: rule__BoolExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4791:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4792:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4792:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4793:1: ()
            {
             before(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4794:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4796:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4806:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4810:1: ( rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4811:2: rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__19886);
            rule__BoolExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__19889);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4818:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4822:1: ( ( ( rule__BoolExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4823:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4823:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4824:1: ( rule__BoolExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4825:1: ( rule__BoolExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4825:2: rule__BoolExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl9916);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4835:1: rule__BoolExpression__Group_1__2 : rule__BoolExpression__Group_1__2__Impl ;
    public final void rule__BoolExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4839:1: ( rule__BoolExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4840:2: rule__BoolExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__29946);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4846:1: rule__BoolExpression__Group_1__2__Impl : ( ( rule__BoolExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4850:1: ( ( ( rule__BoolExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4851:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4851:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4852:1: ( rule__BoolExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4853:1: ( rule__BoolExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4853:2: rule__BoolExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl9973);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4869:1: rule__Brackets__Group__0 : rule__Brackets__Group__0__Impl rule__Brackets__Group__1 ;
    public final void rule__Brackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4873:1: ( rule__Brackets__Group__0__Impl rule__Brackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4874:2: rule__Brackets__Group__0__Impl rule__Brackets__Group__1
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__010009);
            rule__Brackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__010012);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4881:1: rule__Brackets__Group__0__Impl : ( ( rule__Brackets__OpenAssignment_0 ) ) ;
    public final void rule__Brackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4885:1: ( ( ( rule__Brackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4886:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4886:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4887:1: ( rule__Brackets__OpenAssignment_0 )
            {
             before(grammarAccess.getBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4888:1: ( rule__Brackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4888:2: rule__Brackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl10039);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4898:1: rule__Brackets__Group__1 : rule__Brackets__Group__1__Impl rule__Brackets__Group__2 ;
    public final void rule__Brackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4902:1: ( rule__Brackets__Group__1__Impl rule__Brackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4903:2: rule__Brackets__Group__1__Impl rule__Brackets__Group__2
            {
            pushFollow(FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__110069);
            rule__Brackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__110072);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4910:1: rule__Brackets__Group__1__Impl : ( ( rule__Brackets__ObjAssignment_1 ) ) ;
    public final void rule__Brackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4914:1: ( ( ( rule__Brackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4915:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4915:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4916:1: ( rule__Brackets__ObjAssignment_1 )
            {
             before(grammarAccess.getBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4917:1: ( rule__Brackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4917:2: rule__Brackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10099);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4927:1: rule__Brackets__Group__2 : rule__Brackets__Group__2__Impl ;
    public final void rule__Brackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4931:1: ( rule__Brackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4932:2: rule__Brackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210129);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4938:1: rule__Brackets__Group__2__Impl : ( ( rule__Brackets__CloseAssignment_2 ) ) ;
    public final void rule__Brackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4942:1: ( ( ( rule__Brackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4943:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4943:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4944:1: ( rule__Brackets__CloseAssignment_2 )
            {
             before(grammarAccess.getBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4945:1: ( rule__Brackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4945:2: rule__Brackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10156);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4961:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4965:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4966:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010192);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010195);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4973:1: rule__CompareExpression__Group__0__Impl : ( ( rule__CompareExpression__LeftAssignment_0 ) ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4977:1: ( ( ( rule__CompareExpression__LeftAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4978:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4978:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4979:1: ( rule__CompareExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4980:1: ( rule__CompareExpression__LeftAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4980:2: rule__CompareExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10222);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4990:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4994:1: ( rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4995:2: rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110252);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110255);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5002:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__OpAssignment_1 ) ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5006:1: ( ( ( rule__CompareExpression__OpAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5007:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5007:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5008:1: ( rule__CompareExpression__OpAssignment_1 )
            {
             before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5009:1: ( rule__CompareExpression__OpAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5009:2: rule__CompareExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10282);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5019:1: rule__CompareExpression__Group__2 : rule__CompareExpression__Group__2__Impl ;
    public final void rule__CompareExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5023:1: ( rule__CompareExpression__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5024:2: rule__CompareExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210312);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5030:1: rule__CompareExpression__Group__2__Impl : ( ( rule__CompareExpression__RightAssignment_2 ) ) ;
    public final void rule__CompareExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5034:1: ( ( ( rule__CompareExpression__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5035:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5035:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5036:1: ( rule__CompareExpression__RightAssignment_2 )
            {
             before(grammarAccess.getCompareExpressionAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5037:1: ( rule__CompareExpression__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5037:2: rule__CompareExpression__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10339);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5053:1: rule__NegExpression__Group__0 : rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 ;
    public final void rule__NegExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5057:1: ( rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5058:2: rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010375);
            rule__NegExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010378);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5065:1: rule__NegExpression__Group__0__Impl : ( ( rule__NegExpression__OpAssignment_0 ) ) ;
    public final void rule__NegExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5069:1: ( ( ( rule__NegExpression__OpAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5070:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5070:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5071:1: ( rule__NegExpression__OpAssignment_0 )
            {
             before(grammarAccess.getNegExpressionAccess().getOpAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5072:1: ( rule__NegExpression__OpAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5072:2: rule__NegExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10405);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5082:1: rule__NegExpression__Group__1 : rule__NegExpression__Group__1__Impl ;
    public final void rule__NegExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5086:1: ( rule__NegExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5087:2: rule__NegExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110435);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5093:1: rule__NegExpression__Group__1__Impl : ( ( rule__NegExpression__ObjAssignment_1 ) ) ;
    public final void rule__NegExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5097:1: ( ( ( rule__NegExpression__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5098:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5098:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5099:1: ( rule__NegExpression__ObjAssignment_1 )
            {
             before(grammarAccess.getNegExpressionAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5100:1: ( rule__NegExpression__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5100:2: rule__NegExpression__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10462);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5114:1: rule__MathExpression__Group__0 : rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 ;
    public final void rule__MathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5118:1: ( rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5119:2: rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010496);
            rule__MathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010499);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5126:1: rule__MathExpression__Group__0__Impl : ( ruleMathTerminal ) ;
    public final void rule__MathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5130:1: ( ( ruleMathTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5131:1: ( ruleMathTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5131:1: ( ruleMathTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5132:1: ruleMathTerminal
            {
             before(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10526);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5143:1: rule__MathExpression__Group__1 : rule__MathExpression__Group__1__Impl ;
    public final void rule__MathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5147:1: ( rule__MathExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5148:2: rule__MathExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110555);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5154:1: rule__MathExpression__Group__1__Impl : ( ( rule__MathExpression__Group_1__0 )? ) ;
    public final void rule__MathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5158:1: ( ( ( rule__MathExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5159:1: ( ( rule__MathExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5159:1: ( ( rule__MathExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5160:1: ( rule__MathExpression__Group_1__0 )?
            {
             before(grammarAccess.getMathExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5161:1: ( rule__MathExpression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_MATH) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5161:2: rule__MathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10582);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5175:1: rule__MathExpression__Group_1__0 : rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 ;
    public final void rule__MathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5179:1: ( rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5180:2: rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__010617);
            rule__MathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__010620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5187:1: rule__MathExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5191:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5192:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5192:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5193:1: ()
            {
             before(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5194:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5196:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5206:1: rule__MathExpression__Group_1__1 : rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 ;
    public final void rule__MathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5210:1: ( rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5211:2: rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__110678);
            rule__MathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__110681);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5218:1: rule__MathExpression__Group_1__1__Impl : ( ( rule__MathExpression__OpAssignment_1_1 ) ) ;
    public final void rule__MathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5222:1: ( ( ( rule__MathExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5223:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5223:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5224:1: ( rule__MathExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5225:1: ( rule__MathExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5225:2: rule__MathExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl10708);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5235:1: rule__MathExpression__Group_1__2 : rule__MathExpression__Group_1__2__Impl ;
    public final void rule__MathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5239:1: ( rule__MathExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5240:2: rule__MathExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__210738);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5246:1: rule__MathExpression__Group_1__2__Impl : ( ( rule__MathExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5250:1: ( ( ( rule__MathExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5251:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5251:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5252:1: ( rule__MathExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5253:1: ( rule__MathExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5253:2: rule__MathExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl10765);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5269:1: rule__MathBrackets__Group__0 : rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 ;
    public final void rule__MathBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5273:1: ( rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5274:2: rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__010801);
            rule__MathBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__010804);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5281:1: rule__MathBrackets__Group__0__Impl : ( ( rule__MathBrackets__OpenAssignment_0 ) ) ;
    public final void rule__MathBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5285:1: ( ( ( rule__MathBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5286:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5286:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5287:1: ( rule__MathBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getMathBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5288:1: ( rule__MathBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5288:2: rule__MathBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl10831);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5298:1: rule__MathBrackets__Group__1 : rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 ;
    public final void rule__MathBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5302:1: ( rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5303:2: rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__110861);
            rule__MathBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__110864);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5310:1: rule__MathBrackets__Group__1__Impl : ( ( rule__MathBrackets__ObjAssignment_1 ) ) ;
    public final void rule__MathBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5314:1: ( ( ( rule__MathBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5315:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5315:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5316:1: ( rule__MathBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getMathBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5317:1: ( rule__MathBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5317:2: rule__MathBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl10891);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5327:1: rule__MathBrackets__Group__2 : rule__MathBrackets__Group__2__Impl ;
    public final void rule__MathBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5331:1: ( rule__MathBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5332:2: rule__MathBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__210921);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5338:1: rule__MathBrackets__Group__2__Impl : ( ( rule__MathBrackets__CloseAssignment_2 ) ) ;
    public final void rule__MathBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5342:1: ( ( ( rule__MathBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5343:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5343:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5344:1: ( rule__MathBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getMathBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5345:1: ( rule__MathBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5345:2: rule__MathBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl10948);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5361:1: rule__ConcatenationExpression__Group__0 : rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 ;
    public final void rule__ConcatenationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5365:1: ( rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5366:2: rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__010984);
            rule__ConcatenationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__010987);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5373:1: rule__ConcatenationExpression__Group__0__Impl : ( ruleConcatenationTerminal ) ;
    public final void rule__ConcatenationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5377:1: ( ( ruleConcatenationTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5378:1: ( ruleConcatenationTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5378:1: ( ruleConcatenationTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5379:1: ruleConcatenationTerminal
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl11014);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5390:1: rule__ConcatenationExpression__Group__1 : rule__ConcatenationExpression__Group__1__Impl ;
    public final void rule__ConcatenationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5394:1: ( rule__ConcatenationExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5395:2: rule__ConcatenationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__111043);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5401:1: rule__ConcatenationExpression__Group__1__Impl : ( ( rule__ConcatenationExpression__Group_1__0 )? ) ;
    public final void rule__ConcatenationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5405:1: ( ( ( rule__ConcatenationExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5406:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5406:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5407:1: ( rule__ConcatenationExpression__Group_1__0 )?
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5408:1: ( rule__ConcatenationExpression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5408:2: rule__ConcatenationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl11070);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5422:1: rule__ConcatenationExpression__Group_1__0 : rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 ;
    public final void rule__ConcatenationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5426:1: ( rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5427:2: rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011105);
            rule__ConcatenationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011108);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5434:1: rule__ConcatenationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatenationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5438:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5439:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5439:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5440:1: ()
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5441:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5443:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5453:1: rule__ConcatenationExpression__Group_1__1 : rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 ;
    public final void rule__ConcatenationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5457:1: ( rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5458:2: rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111166);
            rule__ConcatenationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111169);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5465:1: rule__ConcatenationExpression__Group_1__1__Impl : ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5469:1: ( ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5470:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5470:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5471:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5472:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5472:2: rule__ConcatenationExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11196);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5482:1: rule__ConcatenationExpression__Group_1__2 : rule__ConcatenationExpression__Group_1__2__Impl ;
    public final void rule__ConcatenationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5486:1: ( rule__ConcatenationExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5487:2: rule__ConcatenationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211226);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5493:1: rule__ConcatenationExpression__Group_1__2__Impl : ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5497:1: ( ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5498:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5498:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5499:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5500:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5500:2: rule__ConcatenationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11253);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5516:1: rule__ConcatenationBrackets__Group__0 : rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 ;
    public final void rule__ConcatenationBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5520:1: ( rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5521:2: rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011289);
            rule__ConcatenationBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011292);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5528:1: rule__ConcatenationBrackets__Group__0__Impl : ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) ;
    public final void rule__ConcatenationBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5532:1: ( ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5533:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5533:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5534:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5535:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5535:2: rule__ConcatenationBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11319);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5545:1: rule__ConcatenationBrackets__Group__1 : rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 ;
    public final void rule__ConcatenationBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5549:1: ( rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5550:2: rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111349);
            rule__ConcatenationBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111352);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5557:1: rule__ConcatenationBrackets__Group__1__Impl : ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) ;
    public final void rule__ConcatenationBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5561:1: ( ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5562:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5562:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5563:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5564:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5564:2: rule__ConcatenationBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11379);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5574:1: rule__ConcatenationBrackets__Group__2 : rule__ConcatenationBrackets__Group__2__Impl ;
    public final void rule__ConcatenationBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5578:1: ( rule__ConcatenationBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5579:2: rule__ConcatenationBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211409);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5585:1: rule__ConcatenationBrackets__Group__2__Impl : ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) ;
    public final void rule__ConcatenationBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5589:1: ( ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5590:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5590:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5591:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5592:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5592:2: rule__ConcatenationBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11436);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5608:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5612:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5613:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011472);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011475);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5620:1: rule__StringVariable__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5624:1: ( ( 'String' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5625:1: ( 'String' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5625:1: ( 'String' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5626:1: 'String'
            {
             before(grammarAccess.getStringVariableAccess().getStringKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__StringVariable__Group__0__Impl11503); 
             after(grammarAccess.getStringVariableAccess().getStringKeyword_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5639:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5643:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5644:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111534);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111537);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5651:1: rule__StringVariable__Group__1__Impl : ( ( rule__StringVariable__NameAssignment_1 ) ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5655:1: ( ( ( rule__StringVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5656:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5656:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5657:1: ( rule__StringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5658:1: ( rule__StringVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5658:2: rule__StringVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11564);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5668:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5672:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5673:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__211594);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__211597);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5680:1: rule__StringVariable__Group__2__Impl : ( ( rule__StringVariable__Group_2__0 )? ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5684:1: ( ( ( rule__StringVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5685:1: ( ( rule__StringVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5685:1: ( ( rule__StringVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5686:1: ( rule__StringVariable__Group_2__0 )?
            {
             before(grammarAccess.getStringVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5687:1: ( rule__StringVariable__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=21 && LA31_0<=22)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5687:2: rule__StringVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl11624);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5697:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5701:1: ( rule__StringVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5702:2: rule__StringVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__311655);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5708:1: rule__StringVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5712:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5713:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5713:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5714:1: ';'
            {
             before(grammarAccess.getStringVariableAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__StringVariable__Group__3__Impl11683); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5735:1: rule__StringVariable__Group_2__0 : rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 ;
    public final void rule__StringVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5739:1: ( rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5740:2: rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__011722);
            rule__StringVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__011725);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5747:1: rule__StringVariable__Group_2__0__Impl : ( ( rule__StringVariable__Alternatives_2_0 ) ) ;
    public final void rule__StringVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5751:1: ( ( ( rule__StringVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5752:1: ( ( rule__StringVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5752:1: ( ( rule__StringVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5753:1: ( rule__StringVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getStringVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5754:1: ( rule__StringVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5754:2: rule__StringVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__StringVariable__Alternatives_2_0_in_rule__StringVariable__Group_2__0__Impl11752);
            rule__StringVariable__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStringVariableAccess().getAlternatives_2_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5764:1: rule__StringVariable__Group_2__1 : rule__StringVariable__Group_2__1__Impl ;
    public final void rule__StringVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5768:1: ( rule__StringVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5769:2: rule__StringVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__111782);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5775:1: rule__StringVariable__Group_2__1__Impl : ( ( rule__StringVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__StringVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5779:1: ( ( ( rule__StringVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5780:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5780:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5781:1: ( rule__StringVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getStringVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5782:1: ( rule__StringVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5782:2: rule__StringVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl11809);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5796:1: rule__NumVariable__Group__0 : rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 ;
    public final void rule__NumVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5800:1: ( rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5801:2: rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__011843);
            rule__NumVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__011846);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5808:1: rule__NumVariable__Group__0__Impl : ( 'Num' ) ;
    public final void rule__NumVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5812:1: ( ( 'Num' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5813:1: ( 'Num' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5813:1: ( 'Num' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5814:1: 'Num'
            {
             before(grammarAccess.getNumVariableAccess().getNumKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__NumVariable__Group__0__Impl11874); 
             after(grammarAccess.getNumVariableAccess().getNumKeyword_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5827:1: rule__NumVariable__Group__1 : rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 ;
    public final void rule__NumVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5831:1: ( rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5832:2: rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__111905);
            rule__NumVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__111908);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5839:1: rule__NumVariable__Group__1__Impl : ( ( rule__NumVariable__NameAssignment_1 ) ) ;
    public final void rule__NumVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5843:1: ( ( ( rule__NumVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5844:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5844:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5845:1: ( rule__NumVariable__NameAssignment_1 )
            {
             before(grammarAccess.getNumVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5846:1: ( rule__NumVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5846:2: rule__NumVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl11935);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5856:1: rule__NumVariable__Group__2 : rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 ;
    public final void rule__NumVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5860:1: ( rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5861:2: rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__211965);
            rule__NumVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__211968);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5868:1: rule__NumVariable__Group__2__Impl : ( ( rule__NumVariable__Group_2__0 )? ) ;
    public final void rule__NumVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5872:1: ( ( ( rule__NumVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5873:1: ( ( rule__NumVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5873:1: ( ( rule__NumVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5874:1: ( rule__NumVariable__Group_2__0 )?
            {
             before(grammarAccess.getNumVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5875:1: ( rule__NumVariable__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=21 && LA32_0<=22)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5875:2: rule__NumVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl11995);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5885:1: rule__NumVariable__Group__3 : rule__NumVariable__Group__3__Impl ;
    public final void rule__NumVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5889:1: ( rule__NumVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5890:2: rule__NumVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__312026);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5896:1: rule__NumVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__NumVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5900:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5901:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5901:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5902:1: ';'
            {
             before(grammarAccess.getNumVariableAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__NumVariable__Group__3__Impl12054); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5923:1: rule__NumVariable__Group_2__0 : rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 ;
    public final void rule__NumVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5927:1: ( rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5928:2: rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012093);
            rule__NumVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012096);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5935:1: rule__NumVariable__Group_2__0__Impl : ( ( rule__NumVariable__Alternatives_2_0 ) ) ;
    public final void rule__NumVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5939:1: ( ( ( rule__NumVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5940:1: ( ( rule__NumVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5940:1: ( ( rule__NumVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5941:1: ( rule__NumVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getNumVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5942:1: ( rule__NumVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5942:2: rule__NumVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__NumVariable__Alternatives_2_0_in_rule__NumVariable__Group_2__0__Impl12123);
            rule__NumVariable__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNumVariableAccess().getAlternatives_2_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5952:1: rule__NumVariable__Group_2__1 : rule__NumVariable__Group_2__1__Impl ;
    public final void rule__NumVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5956:1: ( rule__NumVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5957:2: rule__NumVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112153);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5963:1: rule__NumVariable__Group_2__1__Impl : ( ( rule__NumVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__NumVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5967:1: ( ( ( rule__NumVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5968:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5968:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5969:1: ( rule__NumVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNumVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5970:1: ( rule__NumVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5970:2: rule__NumVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12180);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5984:1: rule__BoolVariable__Group__0 : rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 ;
    public final void rule__BoolVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5988:1: ( rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5989:2: rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012214);
            rule__BoolVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012217);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5996:1: rule__BoolVariable__Group__0__Impl : ( 'Bool' ) ;
    public final void rule__BoolVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6000:1: ( ( 'Bool' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6001:1: ( 'Bool' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6001:1: ( 'Bool' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6002:1: 'Bool'
            {
             before(grammarAccess.getBoolVariableAccess().getBoolKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__BoolVariable__Group__0__Impl12245); 
             after(grammarAccess.getBoolVariableAccess().getBoolKeyword_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6015:1: rule__BoolVariable__Group__1 : rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 ;
    public final void rule__BoolVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6019:1: ( rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6020:2: rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112276);
            rule__BoolVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112279);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6027:1: rule__BoolVariable__Group__1__Impl : ( ( rule__BoolVariable__NameAssignment_1 ) ) ;
    public final void rule__BoolVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6031:1: ( ( ( rule__BoolVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6032:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6032:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6033:1: ( rule__BoolVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6034:1: ( rule__BoolVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6034:2: rule__BoolVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12306);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6044:1: rule__BoolVariable__Group__2 : rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 ;
    public final void rule__BoolVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6048:1: ( rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6049:2: rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212336);
            rule__BoolVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212339);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6056:1: rule__BoolVariable__Group__2__Impl : ( ( rule__BoolVariable__Group_2__0 )? ) ;
    public final void rule__BoolVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6060:1: ( ( ( rule__BoolVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6061:1: ( ( rule__BoolVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6061:1: ( ( rule__BoolVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6062:1: ( rule__BoolVariable__Group_2__0 )?
            {
             before(grammarAccess.getBoolVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6063:1: ( rule__BoolVariable__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=21 && LA33_0<=22)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6063:2: rule__BoolVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12366);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6073:1: rule__BoolVariable__Group__3 : rule__BoolVariable__Group__3__Impl ;
    public final void rule__BoolVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6077:1: ( rule__BoolVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6078:2: rule__BoolVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312397);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6084:1: rule__BoolVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__BoolVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6088:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6089:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6089:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6090:1: ';'
            {
             before(grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__BoolVariable__Group__3__Impl12425); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6111:1: rule__BoolVariable__Group_2__0 : rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 ;
    public final void rule__BoolVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6115:1: ( rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6116:2: rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012464);
            rule__BoolVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012467);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6123:1: rule__BoolVariable__Group_2__0__Impl : ( ( rule__BoolVariable__Alternatives_2_0 ) ) ;
    public final void rule__BoolVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6127:1: ( ( ( rule__BoolVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6128:1: ( ( rule__BoolVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6128:1: ( ( rule__BoolVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6129:1: ( rule__BoolVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getBoolVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6130:1: ( rule__BoolVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6130:2: rule__BoolVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Alternatives_2_0_in_rule__BoolVariable__Group_2__0__Impl12494);
            rule__BoolVariable__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolVariableAccess().getAlternatives_2_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6140:1: rule__BoolVariable__Group_2__1 : rule__BoolVariable__Group_2__1__Impl ;
    public final void rule__BoolVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6144:1: ( rule__BoolVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6145:2: rule__BoolVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112524);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6151:1: rule__BoolVariable__Group_2__1__Impl : ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__BoolVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6155:1: ( ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6156:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6156:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6157:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6158:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6158:2: rule__BoolVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12551);
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


    // $ANTLR start "rule__Constant__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6172:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6176:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6177:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__012585);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__012588);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6184:1: rule__Constant__Group__0__Impl : ( 'Const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6188:1: ( ( 'Const' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6189:1: ( 'Const' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6189:1: ( 'Const' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6190:1: 'Const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Constant__Group__0__Impl12616); 
             after(grammarAccess.getConstantAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6203:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6207:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6208:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__112647);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__112650);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6215:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6219:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6220:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6220:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6221:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6222:1: ( rule__Constant__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6222:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl12677);
            rule__Constant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6232:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6236:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6237:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__212707);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__212710);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6244:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Alternatives_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6248:1: ( ( ( rule__Constant__Alternatives_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6249:1: ( ( rule__Constant__Alternatives_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6249:1: ( ( rule__Constant__Alternatives_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6250:1: ( rule__Constant__Alternatives_2 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6251:1: ( rule__Constant__Alternatives_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6251:2: rule__Constant__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_2_in_rule__Constant__Group__2__Impl12737);
            rule__Constant__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6261:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6265:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6266:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__312767);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__312770);
            rule__Constant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6273:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6277:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6278:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6278:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6279:1: ( rule__Constant__ValueAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6280:1: ( rule__Constant__ValueAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6280:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl12797);
            rule__Constant__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6290:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6294:1: ( rule__Constant__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6295:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__412827);
            rule__Constant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6301:1: rule__Constant__Group__4__Impl : ( ';' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6305:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6306:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6306:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6307:1: ';'
            {
             before(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Constant__Group__4__Impl12855); 
             after(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__BoolLiteral__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6330:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6334:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6335:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__012896);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__012899);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6342:1: rule__BoolLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6346:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6347:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6347:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6348:1: ()
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6349:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6351:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6361:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6365:1: ( rule__BoolLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6366:2: rule__BoolLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__112957);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6372:1: rule__BoolLiteral__Group__1__Impl : ( ( rule__BoolLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6376:1: ( ( ( rule__BoolLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6377:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6377:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6378:1: ( rule__BoolLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6379:1: ( rule__BoolLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6379:2: rule__BoolLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl12984);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6393:1: rule__NumLiteral__Group__0 : rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 ;
    public final void rule__NumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6397:1: ( rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6398:2: rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__013018);
            rule__NumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__013021);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6405:1: rule__NumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6409:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6410:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6410:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6411:1: ()
            {
             before(grammarAccess.getNumLiteralAccess().getNumLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6412:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6414:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6424:1: rule__NumLiteral__Group__1 : rule__NumLiteral__Group__1__Impl ;
    public final void rule__NumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6428:1: ( rule__NumLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6429:2: rule__NumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__113079);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6435:1: rule__NumLiteral__Group__1__Impl : ( ( rule__NumLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6439:1: ( ( ( rule__NumLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6440:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6440:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6441:1: ( rule__NumLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6442:1: ( rule__NumLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6442:2: rule__NumLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl13106);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6456:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6460:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6461:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013140);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013143);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6468:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6472:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6473:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6473:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6474:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6475:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6477:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6487:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6491:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6492:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113201);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6498:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6502:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6503:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6503:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6504:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6505:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6505:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13228);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6520:1: rule__State__UnorderedGroup : rule__State__UnorderedGroup__0 {...}?;
    public final void rule__State__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup());
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6525:1: ( rule__State__UnorderedGroup__0 {...}?)
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6526:2: rule__State__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup13263);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6537:1: rule__State__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) ;
    public final void rule__State__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6542:1: ( ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6543:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6543:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                alt34=1;
            }
            else if ( (LA34_0==26||LA34_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6545:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6545:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6546:5: {...}? => ( ( ( rule__State__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6546:100: ( ( ( rule__State__Group_0__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6547:6: ( ( rule__State__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6553:6: ( ( rule__State__Group_0__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6555:7: ( rule__State__Group_0__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6556:7: ( rule__State__Group_0__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6556:8: rule__State__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl13352);
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6562:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6562:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6563:5: {...}? => ( ( ( rule__State__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6563:100: ( ( ( rule__State__Group_1__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6564:6: ( ( rule__State__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6570:6: ( ( rule__State__Group_1__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6572:7: ( rule__State__Group_1__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6573:7: ( rule__State__Group_1__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6573:8: rule__State__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl13443);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6588:1: rule__State__UnorderedGroup__0 : rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? ;
    public final void rule__State__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6592:1: ( rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6593:2: rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__013502);
            rule__State__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6594:2: ( rule__State__UnorderedGroup__1 )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA35_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        alt35=1;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA35_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt35=1;
                    }
                    }
                    break;
                case 26:
                    {
                    int LA35_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt35=1;
                    }
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6594:2: rule__State__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__013505);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6601:1: rule__State__UnorderedGroup__1 : rule__State__UnorderedGroup__Impl ;
    public final void rule__State__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6605:1: ( rule__State__UnorderedGroup__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6606:2: rule__State__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__113530);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6617:1: rule__Document__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6621:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6622:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6622:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6623:1: RULE_ID
            {
             before(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113562); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6632:1: rule__Document__ElementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Document__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6636:1: ( ( ruleStatement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6637:1: ( ruleStatement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6637:1: ( ruleStatement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6638:1: ruleStatement
            {
             before(grammarAccess.getDocumentAccess().getElementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_213593);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6647:1: rule__Document__StaAssignment_3 : ( ruleState ) ;
    public final void rule__Document__StaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6651:1: ( ( ruleState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6652:1: ( ruleState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6652:1: ( ruleState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6653:1: ruleState
            {
             before(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Document__StaAssignment_313624);
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


    // $ANTLR start "rule__Statement__ComAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6662:1: rule__Statement__ComAssignment_4 : ( RULE_ML_COMMENT ) ;
    public final void rule__Statement__ComAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6666:1: ( ( RULE_ML_COMMENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6667:1: ( RULE_ML_COMMENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6667:1: ( RULE_ML_COMMENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6668:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_413655); 
             after(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ComAssignment_4"


    // $ANTLR start "rule__State__NameAssignment_0_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6677:1: rule__State__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6681:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6682:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6682:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6683:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_113686); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6692:1: rule__State__TimesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__State__TimesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6696:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6697:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6697:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6698:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_113717); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6707:1: rule__State__TimeoutAssignment_1_0_1 : ( RULE_INT ) ;
    public final void rule__State__TimeoutAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6711:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6712:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6712:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6713:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimeoutINTTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_113748); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6722:1: rule__State__StmsAssignment_1_2 : ( ruleAbstractElement ) ;
    public final void rule__State__StmsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6726:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6727:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6727:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6728:1: ruleAbstractElement
            {
             before(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_1_213779);
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


    // $ANTLR start "rule__Call__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6737:1: rule__Call__NameAssignment_0 : ( ( 'Call' ) ) ;
    public final void rule__Call__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6741:1: ( ( ( 'Call' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6742:1: ( ( 'Call' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6742:1: ( ( 'Call' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6743:1: ( 'Call' )
            {
             before(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6744:1: ( 'Call' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6745:1: 'Call'
            {
             before(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Call__NameAssignment_013815); 
             after(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 

            }

             after(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__NameAssignment_0"


    // $ANTLR start "rule__Call__ToAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6760:1: rule__Call__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Call__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6764:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6765:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6765:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6766:1: ruleConcatenationExpression
            {
             before(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_113854);
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


    // $ANTLR start "rule__Dial__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6775:1: rule__Dial__NameAssignment_0 : ( ( 'DialTo' ) ) ;
    public final void rule__Dial__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6779:1: ( ( ( 'DialTo' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6780:1: ( ( 'DialTo' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6780:1: ( ( 'DialTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6781:1: ( 'DialTo' )
            {
             before(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6782:1: ( 'DialTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6783:1: 'DialTo'
            {
             before(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Dial__NameAssignment_013890); 
             after(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 

            }

             after(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dial__NameAssignment_0"


    // $ANTLR start "rule__Dial__ToAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6798:1: rule__Dial__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Dial__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6802:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6803:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6803:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6804:1: ruleConcatenationExpression
            {
             before(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_113929);
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


    // $ANTLR start "rule__Play__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6813:1: rule__Play__NameAssignment_0 : ( ( 'Play' ) ) ;
    public final void rule__Play__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6817:1: ( ( ( 'Play' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6818:1: ( ( 'Play' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6818:1: ( ( 'Play' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6819:1: ( 'Play' )
            {
             before(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6820:1: ( 'Play' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6821:1: 'Play'
            {
             before(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Play__NameAssignment_013965); 
             after(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 

            }

             after(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Play__NameAssignment_0"


    // $ANTLR start "rule__Play__FileAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6836:1: rule__Play__FileAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Play__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6840:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6841:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6841:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6842:1: ruleConcatenationExpression
            {
             before(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_114004);
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


    // $ANTLR start "rule__Record__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6851:1: rule__Record__NameAssignment_0 : ( ( 'Record' ) ) ;
    public final void rule__Record__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6855:1: ( ( ( 'Record' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6856:1: ( ( 'Record' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6856:1: ( ( 'Record' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6857:1: ( 'Record' )
            {
             before(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6858:1: ( 'Record' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6859:1: 'Record'
            {
             before(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Record__NameAssignment_014040); 
             after(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 

            }

             after(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__NameAssignment_0"


    // $ANTLR start "rule__Record__TimeAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6874:1: rule__Record__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Record__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6878:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6879:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6879:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6880:1: RULE_INT
            {
             before(grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_114079); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6889:1: rule__Record__ActionAssignment_4 : ( ruleConcatenationExpression ) ;
    public final void rule__Record__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6893:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6894:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6894:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6895:1: ruleConcatenationExpression
            {
             before(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Record__ActionAssignment_414110);
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


    // $ANTLR start "rule__Record__VariAssignment_5_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6904:1: rule__Record__VariAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Record__VariAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6908:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6909:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6909:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6910:1: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getVariIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Record__VariAssignment_5_114141); 
             after(grammarAccess.getRecordAccess().getVariIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__VariAssignment_5_1"


    // $ANTLR start "rule__Reject__NameAssignment"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6919:1: rule__Reject__NameAssignment : ( ( 'Reject;' ) ) ;
    public final void rule__Reject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6923:1: ( ( ( 'Reject;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6924:1: ( ( 'Reject;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6924:1: ( ( 'Reject;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6925:1: ( 'Reject;' )
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6926:1: ( 'Reject;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6927:1: 'Reject;'
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Reject__NameAssignment14177); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6942:1: rule__Hangup__NameAssignment : ( ( 'HangUp;' ) ) ;
    public final void rule__Hangup__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6946:1: ( ( ( 'HangUp;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6947:1: ( ( 'HangUp;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6947:1: ( ( 'HangUp;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6948:1: ( 'HangUp;' )
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6949:1: ( 'HangUp;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6950:1: 'HangUp;'
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Hangup__NameAssignment14221); 
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


    // $ANTLR start "rule__GetDigits__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6965:1: rule__GetDigits__NameAssignment_0 : ( ( 'Get' ) ) ;
    public final void rule__GetDigits__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6969:1: ( ( ( 'Get' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6970:1: ( ( 'Get' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6970:1: ( ( 'Get' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6971:1: ( 'Get' )
            {
             before(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6972:1: ( 'Get' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6973:1: 'Get'
            {
             before(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__GetDigits__NameAssignment_014265); 
             after(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0()); 

            }

             after(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDigits__NameAssignment_0"


    // $ANTLR start "rule__GetDigits__NumDigitsAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6988:1: rule__GetDigits__NumDigitsAssignment_1 : ( RULE_INT ) ;
    public final void rule__GetDigits__NumDigitsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6992:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6993:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6993:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6994:1: RULE_INT
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_114304); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7003:1: rule__GetDigits__QuestionAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__GetDigits__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7007:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7008:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7008:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7009:1: ruleConcatenationExpression
            {
             before(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__GetDigits__QuestionAssignment_314335);
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


    // $ANTLR start "rule__GetDigits__VariAssignment_5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7018:1: rule__GetDigits__VariAssignment_5 : ( RULE_ID ) ;
    public final void rule__GetDigits__VariAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7022:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7023:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7023:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7024:1: RULE_ID
            {
             before(grammarAccess.getGetDigitsAccess().getVariIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetDigits__VariAssignment_514366); 
             after(grammarAccess.getGetDigitsAccess().getVariIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetDigits__VariAssignment_5"


    // $ANTLR start "rule__Ask__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7033:1: rule__Ask__NameAssignment_0 : ( ( 'Ask' ) ) ;
    public final void rule__Ask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7037:1: ( ( ( 'Ask' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7038:1: ( ( 'Ask' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7038:1: ( ( 'Ask' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7039:1: ( 'Ask' )
            {
             before(grammarAccess.getAskAccess().getNameAskKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7040:1: ( 'Ask' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7041:1: 'Ask'
            {
             before(grammarAccess.getAskAccess().getNameAskKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__Ask__NameAssignment_014402); 
             after(grammarAccess.getAskAccess().getNameAskKeyword_0_0()); 

            }

             after(grammarAccess.getAskAccess().getNameAskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ask__NameAssignment_0"


    // $ANTLR start "rule__Ask__QuestionAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7056:1: rule__Ask__QuestionAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Ask__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7060:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7061:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7061:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7062:1: ruleConcatenationExpression
            {
             before(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_114441);
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


    // $ANTLR start "rule__Ask__VariAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7071:1: rule__Ask__VariAssignment_3 : ( RULE_ID ) ;
    public final void rule__Ask__VariAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7075:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7076:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7076:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7077:1: RULE_ID
            {
             before(grammarAccess.getAskAccess().getVariIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ask__VariAssignment_314472); 
             after(grammarAccess.getAskAccess().getVariIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ask__VariAssignment_3"


    // $ANTLR start "rule__Send__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7086:1: rule__Send__NameAssignment_0 : ( ( 'Send' ) ) ;
    public final void rule__Send__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7090:1: ( ( ( 'Send' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7091:1: ( ( 'Send' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7091:1: ( ( 'Send' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7092:1: ( 'Send' )
            {
             before(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7093:1: ( 'Send' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7094:1: 'Send'
            {
             before(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Send__NameAssignment_014508); 
             after(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 

            }

             after(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Send__NameAssignment_0"


    // $ANTLR start "rule__Send__ParamsAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7109:1: rule__Send__ParamsAssignment_1 : ( ruleSendBlock ) ;
    public final void rule__Send__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7113:1: ( ( ruleSendBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7114:1: ( ruleSendBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7114:1: ( ruleSendBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7115:1: ruleSendBlock
            {
             before(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114547);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7124:1: rule__Send__UrlAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Send__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7128:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7129:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7129:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7130:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314578);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7139:1: rule__SendBlock__ValueAssignment_2 : ( ruleParam ) ;
    public final void rule__SendBlock__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7143:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7144:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7144:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7145:1: ruleParam
            {
             before(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214609);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7154:1: rule__SendBlock__StmsAssignment_3 : ( ruleNotPrimaryParam ) ;
    public final void rule__SendBlock__StmsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7158:1: ( ( ruleNotPrimaryParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7159:1: ( ruleNotPrimaryParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7159:1: ( ruleNotPrimaryParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7160:1: ruleNotPrimaryParam
            {
             before(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314640);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7169:1: rule__NotPrimaryParam__ValueAssignment_1 : ( ruleParam ) ;
    public final void rule__NotPrimaryParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7173:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7174:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7174:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7175:1: ruleParam
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114671);
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


    // $ANTLR start "rule__Param__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7184:1: rule__Param__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7188:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7189:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7189:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7190:1: RULE_STRING
            {
             before(grammarAccess.getParamAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Param__NameAssignment_014702); 
             after(grammarAccess.getParamAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__NameAssignment_0"


    // $ANTLR start "rule__Param__ValueAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7199:1: rule__Param__ValueAssignment_2 : ( ruleConcatenationExpression ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7203:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7204:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7204:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7205:1: ruleConcatenationExpression
            {
             before(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214733);
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


    // $ANTLR start "rule__Say__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7214:1: rule__Say__NameAssignment_0 : ( ( 'Say' ) ) ;
    public final void rule__Say__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7218:1: ( ( ( 'Say' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7219:1: ( ( 'Say' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7219:1: ( ( 'Say' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7220:1: ( 'Say' )
            {
             before(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7221:1: ( 'Say' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7222:1: 'Say'
            {
             before(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 
            match(input,52,FOLLOW_52_in_rule__Say__NameAssignment_014769); 
             after(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 

            }

             after(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Say__NameAssignment_0"


    // $ANTLR start "rule__Say__ThatAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7237:1: rule__Say__ThatAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Say__ThatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7241:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7242:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7242:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7243:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114808);
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


    // $ANTLR start "rule__Sms__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7252:1: rule__Sms__NameAssignment_0 : ( ( 'Sms' ) ) ;
    public final void rule__Sms__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7256:1: ( ( ( 'Sms' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7257:1: ( ( 'Sms' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7257:1: ( ( 'Sms' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7258:1: ( 'Sms' )
            {
             before(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7259:1: ( 'Sms' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7260:1: 'Sms'
            {
             before(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__Sms__NameAssignment_014844); 
             after(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 

            }

             after(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__NameAssignment_0"


    // $ANTLR start "rule__Sms__ValueAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7275:1: rule__Sms__ValueAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Sms__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7279:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7280:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7280:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7281:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Sms__ValueAssignment_114883);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__ValueAssignment_1"


    // $ANTLR start "rule__Sms__ToAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7290:1: rule__Sms__ToAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Sms__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7294:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7295:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7295:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7296:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Sms__ToAssignment_314914);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sms__ToAssignment_3"


    // $ANTLR start "rule__Transition__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7312:1: rule__Transition__NameAssignment_0 : ( ( 'GoTo' ) ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7316:1: ( ( ( 'GoTo' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7317:1: ( ( 'GoTo' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7317:1: ( ( 'GoTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7318:1: ( 'GoTo' )
            {
             before(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7319:1: ( 'GoTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7320:1: 'GoTo'
            {
             before(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 
            match(input,54,FOLLOW_54_in_rule__Transition__NameAssignment_014957); 
             after(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_0"


    // $ANTLR start "rule__Transition__TargetAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7335:1: rule__Transition__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7339:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7340:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7340:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7341:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7342:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7343:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_115000); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7354:1: rule__Transition__EventAssignment_3 : ( ruleEVENT ) ;
    public final void rule__Transition__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7358:1: ( ( ruleEVENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7359:1: ( ruleEVENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7359:1: ( ruleEVENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7360:1: ruleEVENT
            {
             before(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEVENT_in_rule__Transition__EventAssignment_315035);
            ruleEVENT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7369:1: rule__IfExp__BlockAssignment_0 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7373:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7374:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7374:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7375:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_015066);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7384:1: rule__IfExp__BlocksAssignment_1_1 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlocksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7388:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7389:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7389:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7390:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_115097);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7399:1: rule__IfExp__DefaultBlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__IfExp__DefaultBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7403:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7404:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7404:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7405:1: ruleBlock
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_115128);
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


    // $ANTLR start "rule__CondBlock__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7414:1: rule__CondBlock__NameAssignment_0 : ( ( 'if' ) ) ;
    public final void rule__CondBlock__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7418:1: ( ( ( 'if' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7419:1: ( ( 'if' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7419:1: ( ( 'if' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7420:1: ( 'if' )
            {
             before(grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7421:1: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7422:1: 'if'
            {
             before(grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__CondBlock__NameAssignment_015164); 
             after(grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0()); 

            }

             after(grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondBlock__NameAssignment_0"


    // $ANTLR start "rule__CondBlock__CondAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7437:1: rule__CondBlock__CondAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__CondBlock__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7441:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7442:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7442:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7443:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_115203);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7452:1: rule__CondBlock__ActionAssignment_2 : ( ruleBlock ) ;
    public final void rule__CondBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7456:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7457:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7457:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7458:1: ruleBlock
            {
             before(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_215234);
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


    // $ANTLR start "rule__Block__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7467:1: rule__Block__NameAssignment_1 : ( ( '{' ) ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7471:1: ( ( ( '{' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7472:1: ( ( '{' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7472:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7473:1: ( '{' )
            {
             before(grammarAccess.getBlockAccess().getNameLeftCurlyBracketKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7474:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7475:1: '{'
            {
             before(grammarAccess.getBlockAccess().getNameLeftCurlyBracketKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Block__NameAssignment_115270); 
             after(grammarAccess.getBlockAccess().getNameLeftCurlyBracketKeyword_1_0()); 

            }

             after(grammarAccess.getBlockAccess().getNameLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_1"


    // $ANTLR start "rule__Block__StaAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7490:1: rule__Block__StaAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Block__StaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7494:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7495:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7495:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7496:1: ruleAbstractElement
            {
             before(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_215309);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7505:1: rule__BoolExpression__OpAssignment_1_1 : ( RULE_LOGIC_WORD ) ;
    public final void rule__BoolExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7509:1: ( ( RULE_LOGIC_WORD ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7510:1: ( RULE_LOGIC_WORD )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7510:1: ( RULE_LOGIC_WORD )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7511:1: RULE_LOGIC_WORD
            {
             before(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 
            match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_115340); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7520:1: rule__BoolExpression__RightAssignment_1_2 : ( ruleBoolExpression ) ;
    public final void rule__BoolExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7524:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7525:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7525:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7526:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_215371);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7535:1: rule__Brackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__Brackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7539:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7540:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7540:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7541:1: RULE_OBRACKET
            {
             before(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_015402); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7550:1: rule__Brackets__ObjAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__Brackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7554:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7555:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7555:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7556:1: ruleBoolExpression
            {
             before(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_115433);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7565:1: rule__Brackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__Brackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7569:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7570:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7570:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7571:1: RULE_CBRACKET
            {
             before(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_215464); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7580:1: rule__CompareExpression__LeftAssignment_0 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7584:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7585:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7585:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7586:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_015495);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7595:1: rule__CompareExpression__OpAssignment_1 : ( RULE_COMPARE ) ;
    public final void rule__CompareExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7599:1: ( ( RULE_COMPARE ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7600:1: ( RULE_COMPARE )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7600:1: ( RULE_COMPARE )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7601:1: RULE_COMPARE
            {
             before(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 
            match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115526); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7610:1: rule__CompareExpression__RightAssignment_2 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7614:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7615:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7615:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7616:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215557);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7625:1: rule__NegExpression__OpAssignment_0 : ( RULE_NEGATION ) ;
    public final void rule__NegExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7629:1: ( ( RULE_NEGATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7630:1: ( RULE_NEGATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7630:1: ( RULE_NEGATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7631:1: RULE_NEGATION
            {
             before(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 
            match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015588); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7640:1: rule__NegExpression__ObjAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__NegExpression__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7644:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7645:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7645:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7646:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115619);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7655:1: rule__MathExpression__OpAssignment_1_1 : ( RULE_MATH ) ;
    public final void rule__MathExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7659:1: ( ( RULE_MATH ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7660:1: ( RULE_MATH )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7660:1: ( RULE_MATH )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7661:1: RULE_MATH
            {
             before(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 
            match(input,RULE_MATH,FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115650); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7670:1: rule__MathExpression__RightAssignment_1_2 : ( ruleMathExpression ) ;
    public final void rule__MathExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7674:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7675:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7675:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7676:1: ruleMathExpression
            {
             before(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215681);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7685:1: rule__MathBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__MathBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7689:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7690:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7690:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7691:1: RULE_OBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015712); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7700:1: rule__MathBrackets__ObjAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__MathBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7704:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7705:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7705:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7706:1: ruleMathExpression
            {
             before(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115743);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7715:1: rule__MathBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__MathBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7719:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7720:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7720:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7721:1: RULE_CBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215774); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7730:1: rule__ConcatenationExpression__OpAssignment_1_1 : ( ( '+' ) ) ;
    public final void rule__ConcatenationExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7734:1: ( ( ( '+' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7735:1: ( ( '+' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7735:1: ( ( '+' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7736:1: ( '+' )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7737:1: ( '+' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7738:1: '+'
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0()); 
            match(input,56,FOLLOW_56_in_rule__ConcatenationExpression__OpAssignment_1_115810); 
             after(grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0()); 

            }

             after(grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7753:1: rule__ConcatenationExpression__RightAssignment_1_2 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7757:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7758:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7758:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7759:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215849);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7768:1: rule__ConcatenationBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__ConcatenationBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7772:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7773:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7773:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7774:1: RULE_OBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015880); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7783:1: rule__ConcatenationBrackets__ObjAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7787:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7788:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7788:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7789:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_115911);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7798:1: rule__ConcatenationBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__ConcatenationBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7802:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7803:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7803:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7804:1: RULE_CBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_215942); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7813:1: rule__StringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7817:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7818:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7818:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7819:1: RULE_ID
            {
             before(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_115973); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7828:1: rule__StringVariable__ValueAssignment_2_1 : ( ruleConcatenationExpression ) ;
    public final void rule__StringVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7832:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7833:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7833:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7834:1: ruleConcatenationExpression
            {
             before(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_116004);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7843:1: rule__NumVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7847:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7848:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7848:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7849:1: RULE_ID
            {
             before(grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_116035); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7858:1: rule__NumVariable__ValueAssignment_2_1 : ( ruleMathExpression ) ;
    public final void rule__NumVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7862:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7863:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7863:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7864:1: ruleMathExpression
            {
             before(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_116066);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7873:1: rule__BoolVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BoolVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7877:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7878:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7878:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7879:1: RULE_ID
            {
             before(grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_116097); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7888:1: rule__BoolVariable__ValueAssignment_2_1 : ( ruleBoolExpression ) ;
    public final void rule__BoolVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7892:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7893:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7893:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7894:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_116128);
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


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7903:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7907:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7908:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7908:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7909:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_116159); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__ValueAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7918:1: rule__Constant__ValueAssignment_3 : ( rulePrimitive ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7922:1: ( ( rulePrimitive ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7923:1: ( rulePrimitive )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7923:1: ( rulePrimitive )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7924:1: rulePrimitive
            {
             before(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Constant__ValueAssignment_316190);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_3"


    // $ANTLR start "rule__Literal__VAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7933:1: rule__Literal__VAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Literal__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7937:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7938:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7938:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7939:1: ( RULE_ID )
            {
             before(grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7940:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7941:1: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getVVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Literal__VAssignment_016225); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7952:1: rule__Literal__NulAssignment_1 : ( RULE_NULL ) ;
    public final void rule__Literal__NulAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7956:1: ( ( RULE_NULL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7957:1: ( RULE_NULL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7957:1: ( RULE_NULL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7958:1: RULE_NULL
            {
             before(grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 
            match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_116260); 
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


    // $ANTLR start "rule__BoolLiteral__ValueAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7967:1: rule__BoolLiteral__ValueAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__BoolLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7971:1: ( ( RULE_BOOL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7972:1: ( RULE_BOOL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7972:1: ( RULE_BOOL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7973:1: RULE_BOOL
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_116291); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7982:1: rule__NumLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7986:1: ( ( ruleNumber ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7987:1: ( ruleNumber )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7987:1: ( ruleNumber )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7988:1: ruleNumber
            {
             before(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_116322);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7997:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8001:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8002:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8002:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8003:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116353); 
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


    // $ANTLR start "rule__EVENT__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8012:1: rule__EVENT__NameAssignment_0 : ( ( 'HANGUP' ) ) ;
    public final void rule__EVENT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8016:1: ( ( ( 'HANGUP' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8017:1: ( ( 'HANGUP' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8017:1: ( ( 'HANGUP' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8018:1: ( 'HANGUP' )
            {
             before(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8019:1: ( 'HANGUP' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8020:1: 'HANGUP'
            {
             before(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__EVENT__NameAssignment_016389); 
             after(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 

            }

             after(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__NameAssignment_0"


    // $ANTLR start "rule__EVENT__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8035:1: rule__EVENT__NameAssignment_1 : ( ( 'COMPLETED' ) ) ;
    public final void rule__EVENT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8039:1: ( ( ( 'COMPLETED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8040:1: ( ( 'COMPLETED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8040:1: ( ( 'COMPLETED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8041:1: ( 'COMPLETED' )
            {
             before(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8042:1: ( 'COMPLETED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8043:1: 'COMPLETED'
            {
             before(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__EVENT__NameAssignment_116433); 
             after(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 

            }

             after(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__NameAssignment_1"


    // $ANTLR start "rule__EVENT__NameAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8058:1: rule__EVENT__NameAssignment_2 : ( ( 'ERROR' ) ) ;
    public final void rule__EVENT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8062:1: ( ( ( 'ERROR' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8063:1: ( ( 'ERROR' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8063:1: ( ( 'ERROR' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8064:1: ( 'ERROR' )
            {
             before(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8065:1: ( 'ERROR' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8066:1: 'ERROR'
            {
             before(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__EVENT__NameAssignment_216477); 
             after(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 

            }

             after(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__NameAssignment_2"


    // $ANTLR start "rule__EVENT__NameAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8081:1: rule__EVENT__NameAssignment_3 : ( ( 'TIMES' ) ) ;
    public final void rule__EVENT__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8085:1: ( ( ( 'TIMES' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8086:1: ( ( 'TIMES' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8086:1: ( ( 'TIMES' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8087:1: ( 'TIMES' )
            {
             before(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8088:1: ( 'TIMES' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8089:1: 'TIMES'
            {
             before(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 
            match(input,60,FOLLOW_60_in_rule__EVENT__NameAssignment_316521); 
             after(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 

            }

             after(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__NameAssignment_3"


    // $ANTLR start "rule__EVENT__NameAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8104:1: rule__EVENT__NameAssignment_4 : ( ( 'TIMEOUT' ) ) ;
    public final void rule__EVENT__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8108:1: ( ( ( 'TIMEOUT' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8109:1: ( ( 'TIMEOUT' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8109:1: ( ( 'TIMEOUT' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8110:1: ( 'TIMEOUT' )
            {
             before(grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8111:1: ( 'TIMEOUT' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8112:1: 'TIMEOUT'
            {
             before(grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0()); 
            match(input,61,FOLLOW_61_in_rule__EVENT__NameAssignment_416565); 
             after(grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0()); 

            }

             after(grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EVENT__NameAssignment_4"


    // $ANTLR start "rule__SESSION__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8127:1: rule__SESSION__NameAssignment_0 : ( ( 'CALLER' ) ) ;
    public final void rule__SESSION__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8131:1: ( ( ( 'CALLER' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8132:1: ( ( 'CALLER' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8132:1: ( ( 'CALLER' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8133:1: ( 'CALLER' )
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8134:1: ( 'CALLER' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8135:1: 'CALLER'
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 
            match(input,62,FOLLOW_62_in_rule__SESSION__NameAssignment_016609); 
             after(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_0"


    // $ANTLR start "rule__SESSION__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8150:1: rule__SESSION__NameAssignment_1 : ( ( 'LASTSTATE' ) ) ;
    public final void rule__SESSION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8154:1: ( ( ( 'LASTSTATE' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8155:1: ( ( 'LASTSTATE' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8155:1: ( ( 'LASTSTATE' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8156:1: ( 'LASTSTATE' )
            {
             before(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8157:1: ( 'LASTSTATE' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8158:1: 'LASTSTATE'
            {
             before(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 
            match(input,63,FOLLOW_63_in_rule__SESSION__NameAssignment_116653); 
             after(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_1"


    // $ANTLR start "rule__SESSION__NameAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8173:1: rule__SESSION__NameAssignment_2 : ( ( 'TIME' ) ) ;
    public final void rule__SESSION__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8177:1: ( ( ( 'TIME' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8178:1: ( ( 'TIME' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8178:1: ( ( 'TIME' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8179:1: ( 'TIME' )
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8180:1: ( 'TIME' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8181:1: 'TIME'
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0()); 
            match(input,64,FOLLOW_64_in_rule__SESSION__NameAssignment_216697); 
             after(grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_2"


    // $ANTLR start "rule__SESSION__NameAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8196:1: rule__SESSION__NameAssignment_3 : ( ( 'CALLED' ) ) ;
    public final void rule__SESSION__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8200:1: ( ( ( 'CALLED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8201:1: ( ( 'CALLED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8201:1: ( ( 'CALLED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8202:1: ( 'CALLED' )
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8203:1: ( 'CALLED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8204:1: 'CALLED'
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0()); 
            match(input,65,FOLLOW_65_in_rule__SESSION__NameAssignment_316741); 
             after(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_3"


    // $ANTLR start "rule__CALLSTATUS__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8219:1: rule__CALLSTATUS__NameAssignment_0 : ( ( 'RINGING' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8223:1: ( ( ( 'RINGING' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8224:1: ( ( 'RINGING' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8224:1: ( ( 'RINGING' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8225:1: ( 'RINGING' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8226:1: ( 'RINGING' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8227:1: 'RINGING'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 
            match(input,66,FOLLOW_66_in_rule__CALLSTATUS__NameAssignment_016785); 
             after(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 

            }

             after(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CALLSTATUS__NameAssignment_0"


    // $ANTLR start "rule__CALLSTATUS__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8242:1: rule__CALLSTATUS__NameAssignment_1 : ( ( 'IN-PROGRESS' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8246:1: ( ( ( 'IN-PROGRESS' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8247:1: ( ( 'IN-PROGRESS' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8247:1: ( ( 'IN-PROGRESS' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8248:1: ( 'IN-PROGRESS' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8249:1: ( 'IN-PROGRESS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8250:1: 'IN-PROGRESS'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 
            match(input,67,FOLLOW_67_in_rule__CALLSTATUS__NameAssignment_116829); 
             after(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 

            }

             after(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CALLSTATUS__NameAssignment_1"


    // $ANTLR start "rule__CALLSTATUS__NameAssignment_2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8265:1: rule__CALLSTATUS__NameAssignment_2 : ( ( 'DISCONNECTED' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8269:1: ( ( ( 'DISCONNECTED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8270:1: ( ( 'DISCONNECTED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8270:1: ( ( 'DISCONNECTED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8271:1: ( 'DISCONNECTED' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8272:1: ( 'DISCONNECTED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8273:1: 'DISCONNECTED'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 
            match(input,68,FOLLOW_68_in_rule__CALLSTATUS__NameAssignment_216873); 
             after(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 

            }

             after(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CALLSTATUS__NameAssignment_2"


    // $ANTLR start "rule__CALLSTATUS__NameAssignment_3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8288:1: rule__CALLSTATUS__NameAssignment_3 : ( ( 'FAILED' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8292:1: ( ( ( 'FAILED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8293:1: ( ( 'FAILED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8293:1: ( ( 'FAILED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8294:1: ( 'FAILED' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8295:1: ( 'FAILED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8296:1: 'FAILED'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 
            match(input,69,FOLLOW_69_in_rule__CALLSTATUS__NameAssignment_316917); 
             after(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 

            }

             after(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CALLSTATUS__NameAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\14\6\15\6\uffff";
    static final String DFA4_minS =
        "\1\4\7\11\6\uffff";
    static final String DFA4_maxS =
        "\1\105\7\35\6\uffff";
    static final String DFA4_acceptS =
        "\10\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\10\1\2\1\uffff\1\10\1\uffff\1\12\2\uffff\1\11\1\uffff\1\3"+
            "\1\1\55\uffff\1\4\1\5\1\6\1\7\4\13",
            "\1\14\1\uffff\1\14\1\10\15\uffff\1\14\2\uffff\1\14",
            "\1\15\1\uffff\1\15\1\10\15\uffff\1\15\2\uffff\1\15",
            "\1\15\1\uffff\1\15\1\10\15\uffff\1\15\2\uffff\1\15",
            "\1\15\1\uffff\1\15\1\10\15\uffff\1\15\2\uffff\1\15",
            "\1\15\1\uffff\1\15\1\10\15\uffff\1\15\2\uffff\1\15",
            "\1\15\1\uffff\1\15\1\10\15\uffff\1\15\2\uffff\1\15",
            "\1\15\1\uffff\1\15\1\10\15\uffff\1\15\2\uffff\1\15",
            "",
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
            return "1560:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) );";
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
    public static final BitSet FOLLOW_ruleSms_in_entryRuleSms1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSms1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__0_in_ruleSms1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable2105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive2345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT2767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__Alternatives_in_ruleEVENT2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION2827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__Alternatives_in_ruleSESSION2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS2887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__Alternatives_in_ruleCALLSTATUS2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Statement__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ComAssignment_4_in_rule__Statement__Alternatives3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_rule__AbstractElement__Alternatives3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_rule__VoiceTag__Alternatives3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_rule__TerminalBoolExpression__Alternatives3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringVariable__Alternatives_2_03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringVariable__Alternatives_2_03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NumVariable__Alternatives_2_03630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NumVariable__Alternatives_2_03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BoolVariable__Alternatives_2_03685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BoolVariable__Alternatives_2_03705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constant__Alternatives_23740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constant__Alternatives_23760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Primitive__Alternatives3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__Primitive__Alternatives3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__Primitive__Alternatives3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__LiteralAbs__Alternatives3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_rule__Literal__Alternatives3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_0_in_rule__EVENT__Alternatives4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_1_in_rule__EVENT__Alternatives4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_2_in_rule__EVENT__Alternatives4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_3_in_rule__EVENT__Alternatives4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_4_in_rule__EVENT__Alternatives4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_0_in_rule__SESSION__Alternatives4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_1_in_rule__SESSION__Alternatives4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_2_in_rule__SESSION__Alternatives4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_3_in_rule__SESSION__Alternatives4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_0_in_rule__CALLSTATUS__Alternatives4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_1_in_rule__CALLSTATUS__Alternatives4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_2_in_rule__CALLSTATUS__Alternatives4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_3_in_rule__CALLSTATUS__Alternatives4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__04304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__04307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Document__Group__0__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__14366 = new BitSet(new long[]{0x0000078015000080L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__14369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__24426 = new BitSet(new long[]{0x0000078015000080L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__24429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl4456 = new BitSet(new long[]{0x0000078000000082L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__34487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl4514 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__04553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__04556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group_0__0__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__14615 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__14618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__24675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__04739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__04742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group_0_2__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__14801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__04862 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__04865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14923 = new BitSet(new long[]{0x00FFFF8008000080L});
    public static final BitSet FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group_1__1__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24985 = new BitSet(new long[]{0x00FFFF8008000080L});
    public static final BitSet FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__24988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl5015 = new BitSet(new long[]{0x00FFFF8000000082L});
    public static final BitSet FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__35046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_1__3__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__05113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__05116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__State__Group_1_0__0__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05236 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15296 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__05421 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__05424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__NameAssignment_0_in_rule__Dial__Group__0__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__15481 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__15484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__25541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Dial__Group__2__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__05606 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Play__Group__1_in_rule__Play__Group__05609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__NameAssignment_0_in_rule__Play__Group__0__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__15666 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Play__Group__2_in_rule__Play__Group__15669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__25726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Play__Group__2__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__NameAssignment_0_in_rule__Record__Group__0__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15851 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25911 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Record__Group__2__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35973 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Record__Group__4_in_rule__Record__Group__35976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Record__Group__3__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__46035 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Record__Group__5_in_rule__Record__Group__46038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__ActionAssignment_4_in_rule__Record__Group__4__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__5__Impl_in_rule__Record__Group__56095 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Record__Group__6_in_rule__Record__Group__56098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__0_in_rule__Record__Group__5__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__6__Impl_in_rule__Record__Group__66156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Record__Group__6__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__0__Impl_in_rule__Record__Group_5__06229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Record__Group_5__1_in_rule__Record__Group_5__06232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Record__Group_5__0__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group_5__1__Impl_in_rule__Record__Group_5__16291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__VariAssignment_5_1_in_rule__Record__Group_5__1__Impl6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__06352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__06355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NameAssignment_0_in_rule__GetDigits__Group__0__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__16412 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__16415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__26472 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__26475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GetDigits__Group__2__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__36534 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__4_in_rule__GetDigits__Group__36537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__QuestionAssignment_3_in_rule__GetDigits__Group__3__Impl6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__4__Impl_in_rule__GetDigits__Group__46594 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__5_in_rule__GetDigits__Group__46597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__GetDigits__Group__4__Impl6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__5__Impl_in_rule__GetDigits__Group__56656 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__6_in_rule__GetDigits__Group__56659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__VariAssignment_5_in_rule__GetDigits__Group__5__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__6__Impl_in_rule__GetDigits__Group__66716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GetDigits__Group__6__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__06789 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__06792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__NameAssignment_0_in_rule__Ask__Group__0__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__16849 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__16852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26909 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Ask__Group__3_in_rule__Ask__Group__26912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Ask__Group__2__Impl6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__3__Impl_in_rule__Ask__Group__36971 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__4_in_rule__Ask__Group__36974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__VariAssignment_3_in_rule__Ask__Group__3__Impl7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__4__Impl_in_rule__Ask__Group__47031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Ask__Group__4__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__07100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__07103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__NameAssignment_0_in_rule__Send__Group__0__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__17160 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__17163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__27220 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__27223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Send__Group__2__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__37282 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__37285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__47342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Send__Group__4__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__07411 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__07414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__17472 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__17475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SendBlock__Group__1__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__27534 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__27537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__37594 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__37597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl7624 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__47655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SendBlock__Group__4__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__07724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__07727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NotPrimaryParam__Group__0__Impl7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__17786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07847 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_0_in_rule__Param__Group__0__Impl7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17907 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Param__Group__1__Impl7938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__08032 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Say__Group__1_in_rule__Say__Group__08035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__NameAssignment_0_in_rule__Say__Group__0__Impl8062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__18092 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Say__Group__2_in_rule__Say__Group__18095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__28152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Say__Group__2__Impl8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__0__Impl_in_rule__Sms__Group__08217 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Sms__Group__1_in_rule__Sms__Group__08220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__NameAssignment_0_in_rule__Sms__Group__0__Impl8247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__1__Impl_in_rule__Sms__Group__18277 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Sms__Group__2_in_rule__Sms__Group__18280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__ValueAssignment_1_in_rule__Sms__Group__1__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__2__Impl_in_rule__Sms__Group__28337 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Sms__Group__3_in_rule__Sms__Group__28340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Sms__Group__2__Impl8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__3__Impl_in_rule__Sms__Group__38399 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Sms__Group__4_in_rule__Sms__Group__38402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__ToAssignment_3_in_rule__Sms__Group__3__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__4__Impl_in_rule__Sms__Group__48459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Sms__Group__4__Impl8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__08530 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__08533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18590 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__18593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28650 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Transition__Group__2__Impl8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38712 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__38715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__48772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Transition__Group__4__Impl8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__08841 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__08844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__18901 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__18904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl8931 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__28962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__09026 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__09029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfExp__Group_1__0__Impl9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__19088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__09149 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__09152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfExp__Group_2__0__Impl9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__19211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__09272 = new BitSet(new long[]{0xC00000000001A570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__09275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__NameAssignment_0_in_rule__CondBlock__Group__0__Impl9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__19332 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__19335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__29392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09455 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19516 = new BitSet(new long[]{0x00FFFF8008000080L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29576 = new BitSet(new long[]{0x00FFFF8008000080L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl9606 = new BitSet(new long[]{0x00FFFF8000000082L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__39637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Block__Group__3__Impl9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__09704 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__09707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__19763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__09825 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__09828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__19886 = new BitSet(new long[]{0xC00000000001A570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__19889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__29946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__010009 = new BitSet(new long[]{0xC00000000001A570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__010012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__110069 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__110072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010192 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110252 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010375 = new BitSet(new long[]{0xC00000000001A570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__010617 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__010620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__110678 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__110681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl10708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__210738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__010801 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__010804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl10831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__110861 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__110864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__210921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__010984 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__010987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__111043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011105 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111166 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011289 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111349 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011472 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StringVariable__Group__0__Impl11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111534 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__211594 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__211597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__311655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringVariable__Group__3__Impl11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__011722 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__011725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Alternatives_2_0_in_rule__StringVariable__Group_2__0__Impl11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__111782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__011843 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__011846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NumVariable__Group__0__Impl11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__111905 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__111908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__211965 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__211968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl11995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__312026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NumVariable__Group__3__Impl12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012093 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Alternatives_2_0_in_rule__NumVariable__Group_2__0__Impl12123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012214 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BoolVariable__Group__0__Impl12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112276 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212336 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BoolVariable__Group__3__Impl12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012464 = new BitSet(new long[]{0xC00000000001A570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Alternatives_2_0_in_rule__BoolVariable__Group_2__0__Impl12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__012585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__012588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Constant__Group__0__Impl12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__112647 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__112650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__212707 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__212710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_2_in_rule__Constant__Group__2__Impl12737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__312767 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__312770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl12797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__412827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constant__Group__4__Impl12855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__012896 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__012899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__112957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__013018 = new BitSet(new long[]{0xC000000000018570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__013021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__113079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl13106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup13263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl13443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__013502 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__013505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__113530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_213593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Document__StaAssignment_313624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_413655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_113686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_113717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_113748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_1_213779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Call__NameAssignment_013815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_113854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Dial__NameAssignment_013890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_113929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Play__NameAssignment_013965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_114004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Record__NameAssignment_014040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_114079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Record__ActionAssignment_414110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Record__VariAssignment_5_114141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Reject__NameAssignment14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Hangup__NameAssignment14221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__GetDigits__NameAssignment_014265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_114304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__GetDigits__QuestionAssignment_314335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetDigits__VariAssignment_514366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Ask__NameAssignment_014402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_114441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ask__VariAssignment_314472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Send__NameAssignment_014508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Param__NameAssignment_014702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Say__NameAssignment_014769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Sms__NameAssignment_014844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Sms__ValueAssignment_114883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Sms__ToAssignment_314914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Transition__NameAssignment_014957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_115000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_rule__Transition__EventAssignment_315035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_015066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_115097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_115128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__CondBlock__NameAssignment_015164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_115203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_215234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Block__NameAssignment_115270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_215309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_115340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_215371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_015402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_115433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_215464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_015495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ConcatenationExpression__OpAssignment_1_115810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_115911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_215942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_115973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_116004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_116035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_116066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_116097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_116128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_116159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Constant__ValueAssignment_316190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__VAssignment_016225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_116260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_116291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_116322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EVENT__NameAssignment_016389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EVENT__NameAssignment_116433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EVENT__NameAssignment_216477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EVENT__NameAssignment_316521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EVENT__NameAssignment_416565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SESSION__NameAssignment_016609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SESSION__NameAssignment_116653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SESSION__NameAssignment_216697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SESSION__NameAssignment_316741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__CALLSTATUS__NameAssignment_016785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__CALLSTATUS__NameAssignment_116829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__CALLSTATUS__NameAssignment_216873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__CALLSTATUS__NameAssignment_316917 = new BitSet(new long[]{0x0000000000000002L});

}
