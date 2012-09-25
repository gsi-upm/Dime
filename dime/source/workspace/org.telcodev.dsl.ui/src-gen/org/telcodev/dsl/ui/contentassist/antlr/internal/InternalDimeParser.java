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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "' = '", "'Application'", "'State'", "'{'", "'}'", "'times'", "';'", "'seconds'", "'digits'", "'to'", "','", "':'", "'subject'", "'from'", "'message'", "'when'", "'else'", "'if'", "'String'", "'Num'", "'Bool'", "'Const'", "'Call'", "'DialTo'", "'Play'", "'Record'", "'Reject;'", "'HangUp;'", "'Get'", "'Ask'", "'Send'", "'Say'", "'Sms'", "'Email'", "'GoTo'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'TIMEOUT'", "'CALLER'", "'LASTSTATE'", "'TIME'", "'CALLED'", "'ANSWER'", "'DIGITS'", "'RECORD'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
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
    public static final int RULE_BOOL=17;
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
    public static final int RULE_CONCATENATION=15;
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
    public static final int RULE_NULL=16;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int RULE_LOGIC_WORD=9;
    public static final int T__35=35;
    public static final int T__70=70;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:153:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:157:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:158:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:158:1: ( ( rule__State__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:159:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:160:1: ( rule__State__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:160:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState274);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEmail"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:592:1: entryRuleEmail : ruleEmail EOF ;
    public final void entryRuleEmail() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:593:1: ( ruleEmail EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:594:1: ruleEmail EOF
            {
             before(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_ruleEmail_in_entryRuleEmail1201);
            ruleEmail();

            state._fsp--;

             after(grammarAccess.getEmailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmail1208); 

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
    // $ANTLR end "entryRuleEmail"


    // $ANTLR start "ruleEmail"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:601:1: ruleEmail : ( ( rule__Email__Group__0 ) ) ;
    public final void ruleEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:605:2: ( ( ( rule__Email__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:606:1: ( ( rule__Email__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:606:1: ( ( rule__Email__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:607:1: ( rule__Email__Group__0 )
            {
             before(grammarAccess.getEmailAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:608:1: ( rule__Email__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:608:2: rule__Email__Group__0
            {
            pushFollow(FOLLOW_rule__Email__Group__0_in_ruleEmail1234);
            rule__Email__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmail"


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:620:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:621:1: ( ruleTransition EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:622:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1261);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1268); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:629:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:633:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__Transition__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:635:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:1: ( rule__Transition__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition1294);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:648:1: entryRuleIfExp : ruleIfExp EOF ;
    public final void entryRuleIfExp() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:649:1: ( ruleIfExp EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:650:1: ruleIfExp EOF
            {
             before(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp1321);
            ruleIfExp();

            state._fsp--;

             after(grammarAccess.getIfExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp1328); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:657:1: ruleIfExp : ( ( rule__IfExp__Group__0 ) ) ;
    public final void ruleIfExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:661:2: ( ( ( rule__IfExp__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:662:1: ( ( rule__IfExp__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:662:1: ( ( rule__IfExp__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:663:1: ( rule__IfExp__Group__0 )
            {
             before(grammarAccess.getIfExpAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:664:1: ( rule__IfExp__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:664:2: rule__IfExp__Group__0
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1354);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:676:1: entryRuleCondBlock : ruleCondBlock EOF ;
    public final void entryRuleCondBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:677:1: ( ruleCondBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:678:1: ruleCondBlock EOF
            {
             before(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock1381);
            ruleCondBlock();

            state._fsp--;

             after(grammarAccess.getCondBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock1388); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:685:1: ruleCondBlock : ( ( rule__CondBlock__Group__0 ) ) ;
    public final void ruleCondBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:689:2: ( ( ( rule__CondBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__CondBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__CondBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:691:1: ( rule__CondBlock__Group__0 )
            {
             before(grammarAccess.getCondBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:1: ( rule__CondBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:2: rule__CondBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1414);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:704:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:705:1: ( ruleBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:706:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1441);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1448); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:713:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:717:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__Block__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:719:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:1: ( rule__Block__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1474);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:732:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:733:1: ( ruleBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:734:1: ruleBoolExpression EOF
            {
             before(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1501);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression1508); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:741:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:745:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__BoolExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__BoolExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:747:1: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:1: ( rule__BoolExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:2: rule__BoolExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1534);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:760:1: entryRuleTerminalBoolExpression : ruleTerminalBoolExpression EOF ;
    public final void entryRuleTerminalBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:761:1: ( ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:762:1: ruleTerminalBoolExpression EOF
            {
             before(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1561);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getTerminalBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression1568); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:769:1: ruleTerminalBoolExpression : ( ( rule__TerminalBoolExpression__Alternatives ) ) ;
    public final void ruleTerminalBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:773:2: ( ( ( rule__TerminalBoolExpression__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:775:1: ( rule__TerminalBoolExpression__Alternatives )
            {
             before(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:1: ( rule__TerminalBoolExpression__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:2: rule__TerminalBoolExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1594);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:788:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:789:1: ( ruleBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:790:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1621);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1628); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:797:1: ruleBrackets : ( ( rule__Brackets__Group__0 ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:801:2: ( ( ( rule__Brackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__Brackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__Brackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:803:1: ( rule__Brackets__Group__0 )
            {
             before(grammarAccess.getBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:1: ( rule__Brackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:2: rule__Brackets__Group__0
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1654);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:816:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:817:1: ( ruleCompareExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:818:1: ruleCompareExpression EOF
            {
             before(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1681);
            ruleCompareExpression();

            state._fsp--;

             after(grammarAccess.getCompareExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1688); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:825:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:829:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:831:1: ( rule__CompareExpression__Group__0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:1: ( rule__CompareExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1714);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:844:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:845:1: ( ruleNegExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:846:1: ruleNegExpression EOF
            {
             before(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression1741);
            ruleNegExpression();

            state._fsp--;

             after(grammarAccess.getNegExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression1748); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:853:1: ruleNegExpression : ( ( rule__NegExpression__Group__0 ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:857:2: ( ( ( rule__NegExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__NegExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__NegExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:859:1: ( rule__NegExpression__Group__0 )
            {
             before(grammarAccess.getNegExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:1: ( rule__NegExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:2: rule__NegExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1774);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:872:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:873:1: ( ruleMathExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:874:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression1801);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression1808); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:881:1: ruleMathExpression : ( ( rule__MathExpression__Group__0 ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:885:2: ( ( ( rule__MathExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__MathExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__MathExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:887:1: ( rule__MathExpression__Group__0 )
            {
             before(grammarAccess.getMathExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:1: ( rule__MathExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:2: rule__MathExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1834);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:900:1: entryRuleMathTerminal : ruleMathTerminal EOF ;
    public final void entryRuleMathTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:901:1: ( ruleMathTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:902:1: ruleMathTerminal EOF
            {
             before(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1861);
            ruleMathTerminal();

            state._fsp--;

             after(grammarAccess.getMathTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal1868); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:909:1: ruleMathTerminal : ( ( rule__MathTerminal__Alternatives ) ) ;
    public final void ruleMathTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:913:2: ( ( ( rule__MathTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__MathTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__MathTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:915:1: ( rule__MathTerminal__Alternatives )
            {
             before(grammarAccess.getMathTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:1: ( rule__MathTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:2: rule__MathTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1894);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:928:1: entryRuleMathBrackets : ruleMathBrackets EOF ;
    public final void entryRuleMathBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:929:1: ( ruleMathBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:930:1: ruleMathBrackets EOF
            {
             before(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1921);
            ruleMathBrackets();

            state._fsp--;

             after(grammarAccess.getMathBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets1928); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:937:1: ruleMathBrackets : ( ( rule__MathBrackets__Group__0 ) ) ;
    public final void ruleMathBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:941:2: ( ( ( rule__MathBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__MathBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__MathBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:943:1: ( rule__MathBrackets__Group__0 )
            {
             before(grammarAccess.getMathBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:1: ( rule__MathBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:2: rule__MathBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1954);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:956:1: entryRuleConcatenationExpression : ruleConcatenationExpression EOF ;
    public final void entryRuleConcatenationExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:957:1: ( ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:958:1: ruleConcatenationExpression EOF
            {
             before(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1981);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression1988); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:965:1: ruleConcatenationExpression : ( ( rule__ConcatenationExpression__Group__0 ) ) ;
    public final void ruleConcatenationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:969:2: ( ( ( rule__ConcatenationExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:971:1: ( rule__ConcatenationExpression__Group__0 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:1: ( rule__ConcatenationExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:2: rule__ConcatenationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression2014);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:984:1: entryRuleConcatenationTerminal : ruleConcatenationTerminal EOF ;
    public final void entryRuleConcatenationTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:985:1: ( ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:986:1: ruleConcatenationTerminal EOF
            {
             before(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal2041);
            ruleConcatenationTerminal();

            state._fsp--;

             after(grammarAccess.getConcatenationTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal2048); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:993:1: ruleConcatenationTerminal : ( ( rule__ConcatenationTerminal__Alternatives ) ) ;
    public final void ruleConcatenationTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:997:2: ( ( ( rule__ConcatenationTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:999:1: ( rule__ConcatenationTerminal__Alternatives )
            {
             before(grammarAccess.getConcatenationTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:1: ( rule__ConcatenationTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:2: rule__ConcatenationTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2074);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1012:1: entryRuleConcatenationBrackets : ruleConcatenationBrackets EOF ;
    public final void entryRuleConcatenationBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1013:1: ( ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1014:1: ruleConcatenationBrackets EOF
            {
             before(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2101);
            ruleConcatenationBrackets();

            state._fsp--;

             after(grammarAccess.getConcatenationBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets2108); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1021:1: ruleConcatenationBrackets : ( ( rule__ConcatenationBrackets__Group__0 ) ) ;
    public final void ruleConcatenationBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1025:2: ( ( ( rule__ConcatenationBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1027:1: ( rule__ConcatenationBrackets__Group__0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:1: ( rule__ConcatenationBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:2: rule__ConcatenationBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2134);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1040:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1041:1: ( ruleStringVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1042:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable2161);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable2168); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1049:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1053:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__StringVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__StringVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1055:1: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:1: ( rule__StringVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:2: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2194);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1068:1: entryRuleNumVariable : ruleNumVariable EOF ;
    public final void entryRuleNumVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1069:1: ( ruleNumVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1070:1: ruleNumVariable EOF
            {
             before(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable2221);
            ruleNumVariable();

            state._fsp--;

             after(grammarAccess.getNumVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable2228); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1077:1: ruleNumVariable : ( ( rule__NumVariable__Group__0 ) ) ;
    public final void ruleNumVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1081:2: ( ( ( rule__NumVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__NumVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__NumVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1083:1: ( rule__NumVariable__Group__0 )
            {
             before(grammarAccess.getNumVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:1: ( rule__NumVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:2: rule__NumVariable__Group__0
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2254);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1096:1: entryRuleBoolVariable : ruleBoolVariable EOF ;
    public final void entryRuleBoolVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1097:1: ( ruleBoolVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1098:1: ruleBoolVariable EOF
            {
             before(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2281);
            ruleBoolVariable();

            state._fsp--;

             after(grammarAccess.getBoolVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable2288); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1105:1: ruleBoolVariable : ( ( rule__BoolVariable__Group__0 ) ) ;
    public final void ruleBoolVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1109:2: ( ( ( rule__BoolVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1110:1: ( ( rule__BoolVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1110:1: ( ( rule__BoolVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1111:1: ( rule__BoolVariable__Group__0 )
            {
             before(grammarAccess.getBoolVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:1: ( rule__BoolVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:2: rule__BoolVariable__Group__0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2314);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1124:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1125:1: ( ruleConstant EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1126:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2341);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2348); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1133:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1137:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1138:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1138:1: ( ( rule__Constant__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1139:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:1: ( rule__Constant__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant2374);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1152:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1153:1: ( rulePrimitive EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1154:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive2401);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive2408); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1161:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1165:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1166:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1166:1: ( ( rule__Primitive__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1167:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:1: ( rule__Primitive__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:2: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive2434);
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


    // $ANTLR start "entryRuleEVENT"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1350:1: entryRuleEVENT : ruleEVENT EOF ;
    public final void entryRuleEVENT() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1351:1: ( ruleEVENT EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1352:1: ruleEVENT EOF
            {
             before(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT2823);
            ruleEVENT();

            state._fsp--;

             after(grammarAccess.getEVENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT2830); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1359:1: ruleEVENT : ( ( rule__EVENT__Alternatives ) ) ;
    public final void ruleEVENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1363:2: ( ( ( rule__EVENT__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1364:1: ( ( rule__EVENT__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1364:1: ( ( rule__EVENT__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1365:1: ( rule__EVENT__Alternatives )
            {
             before(grammarAccess.getEVENTAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1366:1: ( rule__EVENT__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1366:2: rule__EVENT__Alternatives
            {
            pushFollow(FOLLOW_rule__EVENT__Alternatives_in_ruleEVENT2856);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1378:1: entryRuleSESSION : ruleSESSION EOF ;
    public final void entryRuleSESSION() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1379:1: ( ruleSESSION EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1380:1: ruleSESSION EOF
            {
             before(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION2883);
            ruleSESSION();

            state._fsp--;

             after(grammarAccess.getSESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION2890); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1387:1: ruleSESSION : ( ( rule__SESSION__Alternatives ) ) ;
    public final void ruleSESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1391:2: ( ( ( rule__SESSION__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1392:1: ( ( rule__SESSION__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1392:1: ( ( rule__SESSION__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1393:1: ( rule__SESSION__Alternatives )
            {
             before(grammarAccess.getSESSIONAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1394:1: ( rule__SESSION__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1394:2: rule__SESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__SESSION__Alternatives_in_ruleSESSION2916);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1406:1: entryRuleCALLSTATUS : ruleCALLSTATUS EOF ;
    public final void entryRuleCALLSTATUS() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1407:1: ( ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1408:1: ruleCALLSTATUS EOF
            {
             before(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS2943);
            ruleCALLSTATUS();

            state._fsp--;

             after(grammarAccess.getCALLSTATUSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS2950); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1415:1: ruleCALLSTATUS : ( ( rule__CALLSTATUS__Alternatives ) ) ;
    public final void ruleCALLSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1419:2: ( ( ( rule__CALLSTATUS__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1420:1: ( ( rule__CALLSTATUS__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1420:1: ( ( rule__CALLSTATUS__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1421:1: ( rule__CALLSTATUS__Alternatives )
            {
             before(grammarAccess.getCALLSTATUSAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1422:1: ( rule__CALLSTATUS__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1422:2: rule__CALLSTATUS__Alternatives
            {
            pushFollow(FOLLOW_rule__CALLSTATUS__Alternatives_in_ruleCALLSTATUS2976);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1434:1: rule__Statement__Alternatives : ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleConstant ) | ( ( rule__Statement__ComAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1438:1: ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleConstant ) | ( ( rule__Statement__ComAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case 43:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1439:1: ( ruleNumVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1439:1: ( ruleNumVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1440:1: ruleNumVariable
                    {
                     before(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives3012);
                    ruleNumVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1445:6: ( ruleStringVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1445:6: ( ruleStringVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1446:1: ruleStringVariable
                    {
                     before(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives3029);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1451:6: ( ruleBoolVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1451:6: ( ruleBoolVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1452:1: ruleBoolVariable
                    {
                     before(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives3046);
                    ruleBoolVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1457:6: ( ruleConstant )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1457:6: ( ruleConstant )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1458:1: ruleConstant
                    {
                     before(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Statement__Alternatives3063);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1463:6: ( ( rule__Statement__ComAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1463:6: ( ( rule__Statement__ComAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1464:1: ( rule__Statement__ComAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getComAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1465:1: ( rule__Statement__ComAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1465:2: rule__Statement__ComAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Statement__ComAssignment_4_in_rule__Statement__Alternatives3080);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1474:1: rule__AbstractElement__Alternatives : ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) | ( ruleVoiceTag ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1478:1: ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) | ( ruleVoiceTag ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt2=1;
                }
                break;
            case 56:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
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
            case 54:
            case 55:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1479:1: ( ruleStatement )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1479:1: ( ruleStatement )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1480:1: ruleStatement
                    {
                     before(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives3113);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1485:6: ( ruleTransition )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1485:6: ( ruleTransition )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1486:1: ruleTransition
                    {
                     before(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives3130);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1491:6: ( ruleIfExp )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1491:6: ( ruleIfExp )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1492:1: ruleIfExp
                    {
                     before(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives3147);
                    ruleIfExp();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1497:6: ( ruleVoiceTag )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1497:6: ( ruleVoiceTag )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1498:1: ruleVoiceTag
                    {
                     before(grammarAccess.getAbstractElementAccess().getVoiceTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVoiceTag_in_rule__AbstractElement__Alternatives3164);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1508:1: rule__VoiceTag__Alternatives : ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) | ( ruleSms ) | ( ruleEmail ) );
    public final void rule__VoiceTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1512:1: ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleAsk ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) | ( ruleSms ) | ( ruleEmail ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt3=1;
                }
                break;
            case 45:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                alt3=3;
                }
                break;
            case 47:
                {
                alt3=4;
                }
                break;
            case 50:
                {
                alt3=5;
                }
                break;
            case 51:
                {
                alt3=6;
                }
                break;
            case 52:
                {
                alt3=7;
                }
                break;
            case 48:
                {
                alt3=8;
                }
                break;
            case 49:
                {
                alt3=9;
                }
                break;
            case 44:
                {
                alt3=10;
                }
                break;
            case 54:
                {
                alt3=11;
                }
                break;
            case 55:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1513:1: ( ruleSay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1513:1: ( ruleSay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1514:1: ruleSay
                    {
                     before(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3196);
                    ruleSay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1519:6: ( ruleDial )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1519:6: ( ruleDial )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1520:1: ruleDial
                    {
                     before(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3213);
                    ruleDial();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1525:6: ( rulePlay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1525:6: ( rulePlay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1526:1: rulePlay
                    {
                     before(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3230);
                    rulePlay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1531:6: ( ruleRecord )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1531:6: ( ruleRecord )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1532:1: ruleRecord
                    {
                     before(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3247);
                    ruleRecord();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1537:6: ( ruleGetDigits )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1537:6: ( ruleGetDigits )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1538:1: ruleGetDigits
                    {
                     before(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3264);
                    ruleGetDigits();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1543:6: ( ruleAsk )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1543:6: ( ruleAsk )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1544:1: ruleAsk
                    {
                     before(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives3281);
                    ruleAsk();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1549:6: ( ruleSend )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1549:6: ( ruleSend )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1550:1: ruleSend
                    {
                     before(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3298);
                    ruleSend();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1555:6: ( ruleReject )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1555:6: ( ruleReject )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1556:1: ruleReject
                    {
                     before(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3315);
                    ruleReject();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1561:6: ( ruleHangup )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1561:6: ( ruleHangup )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1562:1: ruleHangup
                    {
                     before(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3332);
                    ruleHangup();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:6: ( ruleCall )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:6: ( ruleCall )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1568:1: ruleCall
                    {
                     before(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives3349);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1573:6: ( ruleSms )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1573:6: ( ruleSms )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1574:1: ruleSms
                    {
                     before(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleSms_in_rule__VoiceTag__Alternatives3366);
                    ruleSms();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1579:6: ( ruleEmail )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1579:6: ( ruleEmail )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1580:1: ruleEmail
                    {
                     before(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleEmail_in_rule__VoiceTag__Alternatives3383);
                    ruleEmail();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_11()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1590:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) );
    public final void rule__TerminalBoolExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1594:1: ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1595:1: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1595:1: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1596:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3415);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1601:6: ( ruleCompareExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1601:6: ( ruleCompareExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1602:1: ruleCompareExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3432);
                    ruleCompareExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1607:6: ( ruleNegExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1607:6: ( ruleNegExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1608:1: ruleNegExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3449);
                    ruleNegExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1613:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1613:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1614:1: ruleLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3466);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1619:6: ( ruleBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1619:6: ( ruleBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1620:1: ruleBrackets
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3483);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1625:6: ( ruleCALLSTATUS )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1625:6: ( ruleCALLSTATUS )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1626:1: ruleCALLSTATUS
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_rule__TerminalBoolExpression__Alternatives3500);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1636:1: rule__MathTerminal__Alternatives : ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) );
    public final void rule__MathTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1640:1: ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1641:1: ( ruleMathBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1641:1: ( ruleMathBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1642:1: ruleMathBrackets
                    {
                     before(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3532);
                    ruleMathBrackets();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1647:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1647:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1648:1: ruleLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3549);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1653:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1653:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1654:1: ruleNumLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3566);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1664:1: rule__ConcatenationTerminal__Alternatives : ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) );
    public final void rule__ConcatenationTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1668:1: ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OBRACKET) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_DOUBLE && LA6_0<=RULE_ID)||LA6_0==RULE_STRING||(LA6_0>=RULE_NULL && LA6_0<=RULE_BOOL)||LA6_0==60||(LA6_0>=62 && LA6_0<=68)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1669:1: ( ruleConcatenationBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1669:1: ( ruleConcatenationBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1670:1: ruleConcatenationBrackets
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3598);
                    ruleConcatenationBrackets();

                    state._fsp--;

                     after(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1675:6: ( ruleLiteralAbs )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1675:6: ( ruleLiteralAbs )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1676:1: ruleLiteralAbs
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3615);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1686:1: rule__StringVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__StringVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1690:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1691:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1691:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1692:1: '='
                    {
                     before(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__StringVariable__Alternatives_2_03648); 
                     after(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1699:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1699:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1700:1: ' = '
                    {
                     before(grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__StringVariable__Alternatives_2_03668); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1712:1: rule__NumVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__NumVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1716:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1717:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1717:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1718:1: '='
                    {
                     before(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__NumVariable__Alternatives_2_03703); 
                     after(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1725:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1725:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1726:1: ' = '
                    {
                     before(grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__NumVariable__Alternatives_2_03723); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1738:1: rule__BoolVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__BoolVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1742:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1743:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1743:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1744:1: '='
                    {
                     before(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__BoolVariable__Alternatives_2_03758); 
                     after(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1751:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1751:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1752:1: ' = '
                    {
                     before(grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__BoolVariable__Alternatives_2_03778); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1764:1: rule__Constant__Alternatives_2 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__Constant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1768:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1769:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1769:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1770:1: '='
                    {
                     before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()); 
                    match(input,21,FOLLOW_21_in_rule__Constant__Alternatives_23813); 
                     after(grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1777:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1777:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1778:1: ' = '
                    {
                     before(grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1()); 
                    match(input,22,FOLLOW_22_in_rule__Constant__Alternatives_23833); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1790:1: rule__Primitive__Alternatives : ( ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1794:1: ( ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1795:1: ( ruleStringLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1795:1: ( ruleStringLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1796:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Primitive__Alternatives3867);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1801:6: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1801:6: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1802:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__Primitive__Alternatives3884);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1807:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1807:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1808:1: ruleNumLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__Primitive__Alternatives3901);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1819:1: rule__LiteralAbs__Alternatives : ( ( ruleLiteral ) | ( rulePrimitive ) );
    public final void rule__LiteralAbs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1823:1: ( ( ruleLiteral ) | ( rulePrimitive ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==RULE_NULL||LA12_0==60||(LA12_0>=62 && LA12_0<=68)) ) {
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:1: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:1: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1825:1: ruleLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3934);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1830:6: ( rulePrimitive )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1830:6: ( rulePrimitive )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1831:1: rulePrimitive
                    {
                     before(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitive_in_rule__LiteralAbs__Alternatives3951);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1841:1: rule__Literal__Alternatives : ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ruleSESSION ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1845:1: ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ruleSESSION ) )
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
            case 60:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1846:1: ( ( rule__Literal__VAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1846:1: ( ( rule__Literal__VAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1847:1: ( rule__Literal__VAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getVAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1848:1: ( rule__Literal__VAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1848:2: rule__Literal__VAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3983);
                    rule__Literal__VAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getVAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1852:6: ( ( rule__Literal__NulAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1852:6: ( ( rule__Literal__NulAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1853:1: ( rule__Literal__NulAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getNulAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1854:1: ( rule__Literal__NulAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1854:2: rule__Literal__NulAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives4001);
                    rule__Literal__NulAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getNulAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1858:6: ( ruleSESSION )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1858:6: ( ruleSESSION )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1859:1: ruleSESSION
                    {
                     before(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSESSION_in_rule__Literal__Alternatives4019);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1869:1: rule__Number__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1873:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:1: ( RULE_DOUBLE )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:1: ( RULE_DOUBLE )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1875:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives4051); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1880:6: ( RULE_INT )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1880:6: ( RULE_INT )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1881:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives4068); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1891:1: rule__EVENT__Alternatives : ( ( ( rule__EVENT__NameAssignment_0 ) ) | ( ( rule__EVENT__NameAssignment_1 ) ) | ( ( rule__EVENT__NameAssignment_2 ) ) | ( ( rule__EVENT__NameAssignment_3 ) ) | ( ( rule__EVENT__NameAssignment_4 ) ) );
    public final void rule__EVENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1895:1: ( ( ( rule__EVENT__NameAssignment_0 ) ) | ( ( rule__EVENT__NameAssignment_1 ) ) | ( ( rule__EVENT__NameAssignment_2 ) ) | ( ( rule__EVENT__NameAssignment_3 ) ) | ( ( rule__EVENT__NameAssignment_4 ) ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1896:1: ( ( rule__EVENT__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1896:1: ( ( rule__EVENT__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1897:1: ( rule__EVENT__NameAssignment_0 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1898:1: ( rule__EVENT__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1898:2: rule__EVENT__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_0_in_rule__EVENT__Alternatives4100);
                    rule__EVENT__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1902:6: ( ( rule__EVENT__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1902:6: ( ( rule__EVENT__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1903:1: ( rule__EVENT__NameAssignment_1 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1904:1: ( rule__EVENT__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1904:2: rule__EVENT__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_1_in_rule__EVENT__Alternatives4118);
                    rule__EVENT__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:6: ( ( rule__EVENT__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:6: ( ( rule__EVENT__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1909:1: ( rule__EVENT__NameAssignment_2 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1910:1: ( rule__EVENT__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1910:2: rule__EVENT__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_2_in_rule__EVENT__Alternatives4136);
                    rule__EVENT__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:6: ( ( rule__EVENT__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:6: ( ( rule__EVENT__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1915:1: ( rule__EVENT__NameAssignment_3 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1916:1: ( rule__EVENT__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1916:2: rule__EVENT__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_3_in_rule__EVENT__Alternatives4154);
                    rule__EVENT__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:6: ( ( rule__EVENT__NameAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:6: ( ( rule__EVENT__NameAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1921:1: ( rule__EVENT__NameAssignment_4 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1922:1: ( rule__EVENT__NameAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1922:2: rule__EVENT__NameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_4_in_rule__EVENT__Alternatives4172);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1931:1: rule__SESSION__Alternatives : ( ( ( rule__SESSION__NameAssignment_0 ) ) | ( ( rule__SESSION__NameAssignment_1 ) ) | ( ( rule__SESSION__NameAssignment_2 ) ) | ( ( rule__SESSION__NameAssignment_3 ) ) | ( ( rule__SESSION__NameAssignment_4 ) ) | ( ( rule__SESSION__NameAssignment_5 ) ) | ( ( rule__SESSION__NameAssignment_6 ) ) | ( ( rule__SESSION__NameAssignment_7 ) ) );
    public final void rule__SESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1935:1: ( ( ( rule__SESSION__NameAssignment_0 ) ) | ( ( rule__SESSION__NameAssignment_1 ) ) | ( ( rule__SESSION__NameAssignment_2 ) ) | ( ( rule__SESSION__NameAssignment_3 ) ) | ( ( rule__SESSION__NameAssignment_4 ) ) | ( ( rule__SESSION__NameAssignment_5 ) ) | ( ( rule__SESSION__NameAssignment_6 ) ) | ( ( rule__SESSION__NameAssignment_7 ) ) )
            int alt16=8;
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
            case 66:
                {
                alt16=5;
                }
                break;
            case 67:
                {
                alt16=6;
                }
                break;
            case 68:
                {
                alt16=7;
                }
                break;
            case 60:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1936:1: ( ( rule__SESSION__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1936:1: ( ( rule__SESSION__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1937:1: ( rule__SESSION__NameAssignment_0 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1938:1: ( rule__SESSION__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1938:2: rule__SESSION__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_0_in_rule__SESSION__Alternatives4205);
                    rule__SESSION__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:6: ( ( rule__SESSION__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:6: ( ( rule__SESSION__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1943:1: ( rule__SESSION__NameAssignment_1 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1944:1: ( rule__SESSION__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1944:2: rule__SESSION__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_1_in_rule__SESSION__Alternatives4223);
                    rule__SESSION__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:6: ( ( rule__SESSION__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:6: ( ( rule__SESSION__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1949:1: ( rule__SESSION__NameAssignment_2 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1950:1: ( rule__SESSION__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1950:2: rule__SESSION__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_2_in_rule__SESSION__Alternatives4241);
                    rule__SESSION__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:6: ( ( rule__SESSION__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:6: ( ( rule__SESSION__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1955:1: ( rule__SESSION__NameAssignment_3 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1956:1: ( rule__SESSION__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1956:2: rule__SESSION__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_3_in_rule__SESSION__Alternatives4259);
                    rule__SESSION__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1960:6: ( ( rule__SESSION__NameAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1960:6: ( ( rule__SESSION__NameAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1961:1: ( rule__SESSION__NameAssignment_4 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1962:1: ( rule__SESSION__NameAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1962:2: rule__SESSION__NameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_4_in_rule__SESSION__Alternatives4277);
                    rule__SESSION__NameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1966:6: ( ( rule__SESSION__NameAssignment_5 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1966:6: ( ( rule__SESSION__NameAssignment_5 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1967:1: ( rule__SESSION__NameAssignment_5 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_5()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1968:1: ( rule__SESSION__NameAssignment_5 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1968:2: rule__SESSION__NameAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_5_in_rule__SESSION__Alternatives4295);
                    rule__SESSION__NameAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1972:6: ( ( rule__SESSION__NameAssignment_6 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1972:6: ( ( rule__SESSION__NameAssignment_6 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1973:1: ( rule__SESSION__NameAssignment_6 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_6()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1974:1: ( rule__SESSION__NameAssignment_6 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1974:2: rule__SESSION__NameAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_6_in_rule__SESSION__Alternatives4313);
                    rule__SESSION__NameAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1978:6: ( ( rule__SESSION__NameAssignment_7 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1978:6: ( ( rule__SESSION__NameAssignment_7 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1979:1: ( rule__SESSION__NameAssignment_7 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_7()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1980:1: ( rule__SESSION__NameAssignment_7 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1980:2: rule__SESSION__NameAssignment_7
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_7_in_rule__SESSION__Alternatives4331);
                    rule__SESSION__NameAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_7()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1989:1: rule__CALLSTATUS__Alternatives : ( ( ( rule__CALLSTATUS__NameAssignment_0 ) ) | ( ( rule__CALLSTATUS__NameAssignment_1 ) ) | ( ( rule__CALLSTATUS__NameAssignment_2 ) ) | ( ( rule__CALLSTATUS__NameAssignment_3 ) ) );
    public final void rule__CALLSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1993:1: ( ( ( rule__CALLSTATUS__NameAssignment_0 ) ) | ( ( rule__CALLSTATUS__NameAssignment_1 ) ) | ( ( rule__CALLSTATUS__NameAssignment_2 ) ) | ( ( rule__CALLSTATUS__NameAssignment_3 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt17=1;
                }
                break;
            case 70:
                {
                alt17=2;
                }
                break;
            case 71:
                {
                alt17=3;
                }
                break;
            case 72:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1994:1: ( ( rule__CALLSTATUS__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1994:1: ( ( rule__CALLSTATUS__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1995:1: ( rule__CALLSTATUS__NameAssignment_0 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1996:1: ( rule__CALLSTATUS__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1996:2: rule__CALLSTATUS__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_0_in_rule__CALLSTATUS__Alternatives4364);
                    rule__CALLSTATUS__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2000:6: ( ( rule__CALLSTATUS__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2000:6: ( ( rule__CALLSTATUS__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2001:1: ( rule__CALLSTATUS__NameAssignment_1 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2002:1: ( rule__CALLSTATUS__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2002:2: rule__CALLSTATUS__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_1_in_rule__CALLSTATUS__Alternatives4382);
                    rule__CALLSTATUS__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2006:6: ( ( rule__CALLSTATUS__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2006:6: ( ( rule__CALLSTATUS__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2007:1: ( rule__CALLSTATUS__NameAssignment_2 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2008:1: ( rule__CALLSTATUS__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2008:2: rule__CALLSTATUS__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_2_in_rule__CALLSTATUS__Alternatives4400);
                    rule__CALLSTATUS__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2012:6: ( ( rule__CALLSTATUS__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2012:6: ( ( rule__CALLSTATUS__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2013:1: ( rule__CALLSTATUS__NameAssignment_3 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2014:1: ( rule__CALLSTATUS__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2014:2: rule__CALLSTATUS__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_3_in_rule__CALLSTATUS__Alternatives4418);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2025:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2029:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2030:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__04449);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__04452);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2037:1: rule__Document__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2041:1: ( ( 'Application' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2042:1: ( 'Application' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2042:1: ( 'Application' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2043:1: 'Application'
            {
             before(grammarAccess.getDocumentAccess().getApplicationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Document__Group__0__Impl4480); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2056:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2060:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2061:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__14511);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__14514);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2068:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2072:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2073:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2073:1: ( ( rule__Document__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2074:1: ( rule__Document__NameAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2075:1: ( rule__Document__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2075:2: rule__Document__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl4541);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2085:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2089:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2090:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__24571);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__24574);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2097:1: rule__Document__Group__2__Impl : ( ( rule__Document__ElementsAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2101:1: ( ( ( rule__Document__ElementsAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2102:1: ( ( rule__Document__ElementsAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2102:1: ( ( rule__Document__ElementsAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2103:1: ( rule__Document__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDocumentAccess().getElementsAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2104:1: ( rule__Document__ElementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ML_COMMENT||(LA18_0>=40 && LA18_0<=43)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2104:2: rule__Document__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl4601);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2114:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2118:1: ( rule__Document__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2119:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__34632);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2125:1: rule__Document__Group__3__Impl : ( ( rule__Document__StaAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2129:1: ( ( ( rule__Document__StaAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2130:1: ( ( rule__Document__StaAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2130:1: ( ( rule__Document__StaAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2131:1: ( rule__Document__StaAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getStaAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2132:1: ( rule__Document__StaAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2132:2: rule__Document__StaAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl4659);
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


    // $ANTLR start "rule__State__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2150:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2154:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2155:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__04698);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__04701);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2162:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2166:1: ( ( 'State' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2167:1: ( 'State' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2167:1: ( 'State' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2168:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__State__Group__0__Impl4729); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2181:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2185:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2186:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__14760);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__14763);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2193:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2197:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2198:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2198:1: ( ( rule__State__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2199:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2200:1: ( rule__State__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2200:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl4790);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2210:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2214:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2215:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__24820);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__24823);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2222:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2226:1: ( ( ( rule__State__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2227:1: ( ( rule__State__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2227:1: ( ( rule__State__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2228:1: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2229:1: ( rule__State__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2229:2: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl4850);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2239:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2243:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2244:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__34881);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__34884);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2251:1: rule__State__Group__3__Impl : ( '{' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2255:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2256:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2256:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2257:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__State__Group__3__Impl4912); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2270:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2274:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2275:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44943);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__44946);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2282:1: rule__State__Group__4__Impl : ( ( rule__State__StmsAssignment_4 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2286:1: ( ( ( rule__State__StmsAssignment_4 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2287:1: ( ( rule__State__StmsAssignment_4 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2287:1: ( ( rule__State__StmsAssignment_4 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2288:1: ( rule__State__StmsAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getStmsAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2289:1: ( rule__State__StmsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ML_COMMENT||(LA21_0>=39 && LA21_0<=56)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2289:2: rule__State__StmsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__State__StmsAssignment_4_in_rule__State__Group__4__Impl4973);
            	    rule__State__StmsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getStmsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2299:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2303:1: ( rule__State__Group__5__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2304:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__55004);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2310:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2314:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2315:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2315:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2316:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__State__Group__5__Impl5032); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2341:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2345:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2346:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__05075);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__05078);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2353:1: rule__State__Group_2__0__Impl : ( 'times' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2357:1: ( ( 'times' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2358:1: ( 'times' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2358:1: ( 'times' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2359:1: 'times'
            {
             before(grammarAccess.getStateAccess().getTimesKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_2__0__Impl5106); 
             after(grammarAccess.getStateAccess().getTimesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2372:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2376:1: ( rule__State__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2377:2: rule__State__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__15137);
            rule__State__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2383:1: rule__State__Group_2__1__Impl : ( ( rule__State__TimesAssignment_2_1 ) ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2387:1: ( ( ( rule__State__TimesAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2388:1: ( ( rule__State__TimesAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2388:1: ( ( rule__State__TimesAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2389:1: ( rule__State__TimesAssignment_2_1 )
            {
             before(grammarAccess.getStateAccess().getTimesAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2390:1: ( rule__State__TimesAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2390:2: rule__State__TimesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__State__TimesAssignment_2_1_in_rule__State__Group_2__1__Impl5164);
            rule__State__TimesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTimesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2404:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2408:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2409:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05198);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05201);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2416:1: rule__Call__Group__0__Impl : ( ( rule__Call__NameAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2420:1: ( ( ( rule__Call__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2421:1: ( ( rule__Call__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2421:1: ( ( rule__Call__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2422:1: ( rule__Call__NameAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2423:1: ( rule__Call__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2423:2: rule__Call__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5228);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2433:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2437:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2438:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15258);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15261);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2445:1: rule__Call__Group__1__Impl : ( ( rule__Call__ToAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2449:1: ( ( ( rule__Call__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2450:1: ( ( rule__Call__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2450:1: ( ( rule__Call__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2451:1: ( rule__Call__ToAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2452:1: ( rule__Call__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2452:2: rule__Call__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl5288);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2462:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2466:1: ( rule__Call__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2467:2: rule__Call__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25318);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2473:1: rule__Call__Group__2__Impl : ( ';' ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2477:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2478:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2478:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2479:1: ';'
            {
             before(grammarAccess.getCallAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Call__Group__2__Impl5346); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2498:1: rule__Dial__Group__0 : rule__Dial__Group__0__Impl rule__Dial__Group__1 ;
    public final void rule__Dial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2502:1: ( rule__Dial__Group__0__Impl rule__Dial__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2503:2: rule__Dial__Group__0__Impl rule__Dial__Group__1
            {
            pushFollow(FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__05383);
            rule__Dial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__05386);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2510:1: rule__Dial__Group__0__Impl : ( ( rule__Dial__NameAssignment_0 ) ) ;
    public final void rule__Dial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2514:1: ( ( ( rule__Dial__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2515:1: ( ( rule__Dial__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2515:1: ( ( rule__Dial__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2516:1: ( rule__Dial__NameAssignment_0 )
            {
             before(grammarAccess.getDialAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2517:1: ( rule__Dial__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2517:2: rule__Dial__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Dial__NameAssignment_0_in_rule__Dial__Group__0__Impl5413);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2527:1: rule__Dial__Group__1 : rule__Dial__Group__1__Impl rule__Dial__Group__2 ;
    public final void rule__Dial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2531:1: ( rule__Dial__Group__1__Impl rule__Dial__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2532:2: rule__Dial__Group__1__Impl rule__Dial__Group__2
            {
            pushFollow(FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__15443);
            rule__Dial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__15446);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2539:1: rule__Dial__Group__1__Impl : ( ( rule__Dial__ToAssignment_1 ) ) ;
    public final void rule__Dial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2543:1: ( ( ( rule__Dial__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2544:1: ( ( rule__Dial__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2544:1: ( ( rule__Dial__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2545:1: ( rule__Dial__ToAssignment_1 )
            {
             before(grammarAccess.getDialAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2546:1: ( rule__Dial__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2546:2: rule__Dial__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl5473);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2556:1: rule__Dial__Group__2 : rule__Dial__Group__2__Impl ;
    public final void rule__Dial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2560:1: ( rule__Dial__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2561:2: rule__Dial__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__25503);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2567:1: rule__Dial__Group__2__Impl : ( ';' ) ;
    public final void rule__Dial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2571:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2572:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2572:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2573:1: ';'
            {
             before(grammarAccess.getDialAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Dial__Group__2__Impl5531); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2592:1: rule__Play__Group__0 : rule__Play__Group__0__Impl rule__Play__Group__1 ;
    public final void rule__Play__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2596:1: ( rule__Play__Group__0__Impl rule__Play__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2597:2: rule__Play__Group__0__Impl rule__Play__Group__1
            {
            pushFollow(FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__05568);
            rule__Play__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__1_in_rule__Play__Group__05571);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2604:1: rule__Play__Group__0__Impl : ( ( rule__Play__NameAssignment_0 ) ) ;
    public final void rule__Play__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2608:1: ( ( ( rule__Play__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2609:1: ( ( rule__Play__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2609:1: ( ( rule__Play__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2610:1: ( rule__Play__NameAssignment_0 )
            {
             before(grammarAccess.getPlayAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2611:1: ( rule__Play__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2611:2: rule__Play__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Play__NameAssignment_0_in_rule__Play__Group__0__Impl5598);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2621:1: rule__Play__Group__1 : rule__Play__Group__1__Impl rule__Play__Group__2 ;
    public final void rule__Play__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2625:1: ( rule__Play__Group__1__Impl rule__Play__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2626:2: rule__Play__Group__1__Impl rule__Play__Group__2
            {
            pushFollow(FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__15628);
            rule__Play__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__2_in_rule__Play__Group__15631);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2633:1: rule__Play__Group__1__Impl : ( ( rule__Play__FileAssignment_1 ) ) ;
    public final void rule__Play__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2637:1: ( ( ( rule__Play__FileAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2638:1: ( ( rule__Play__FileAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2638:1: ( ( rule__Play__FileAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2639:1: ( rule__Play__FileAssignment_1 )
            {
             before(grammarAccess.getPlayAccess().getFileAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2640:1: ( rule__Play__FileAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2640:2: rule__Play__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl5658);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2650:1: rule__Play__Group__2 : rule__Play__Group__2__Impl ;
    public final void rule__Play__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2654:1: ( rule__Play__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2655:2: rule__Play__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__25688);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2661:1: rule__Play__Group__2__Impl : ( ';' ) ;
    public final void rule__Play__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2665:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2666:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2666:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2667:1: ';'
            {
             before(grammarAccess.getPlayAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Play__Group__2__Impl5716); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2686:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2690:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2691:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05753);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05756);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2698:1: rule__Record__Group__0__Impl : ( ( rule__Record__NameAssignment_0 ) ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2702:1: ( ( ( rule__Record__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2703:1: ( ( rule__Record__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2703:1: ( ( rule__Record__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2704:1: ( rule__Record__NameAssignment_0 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2705:1: ( rule__Record__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2705:2: rule__Record__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Record__NameAssignment_0_in_rule__Record__Group__0__Impl5783);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2715:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2719:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2720:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15813);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15816);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2727:1: rule__Record__Group__1__Impl : ( ( rule__Record__TimeAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2731:1: ( ( ( rule__Record__TimeAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2732:1: ( ( rule__Record__TimeAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2732:1: ( ( rule__Record__TimeAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2733:1: ( rule__Record__TimeAssignment_1 )
            {
             before(grammarAccess.getRecordAccess().getTimeAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2734:1: ( rule__Record__TimeAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2734:2: rule__Record__TimeAssignment_1
            {
            pushFollow(FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5843);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2748:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2749:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25873);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25876);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2756:1: rule__Record__Group__2__Impl : ( 'seconds' ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2760:1: ( ( 'seconds' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2761:1: ( 'seconds' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2761:1: ( 'seconds' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2762:1: 'seconds'
            {
             before(grammarAccess.getRecordAccess().getSecondsKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Record__Group__2__Impl5904); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2775:1: rule__Record__Group__3 : rule__Record__Group__3__Impl ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2779:1: ( rule__Record__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2780:2: rule__Record__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35935);
            rule__Record__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2786:1: rule__Record__Group__3__Impl : ( ';' ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2790:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2791:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2791:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2792:1: ';'
            {
             before(grammarAccess.getRecordAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Record__Group__3__Impl5963); 
             after(grammarAccess.getRecordAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__GetDigits__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2813:1: rule__GetDigits__Group__0 : rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 ;
    public final void rule__GetDigits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2817:1: ( rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2818:2: rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__06002);
            rule__GetDigits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__06005);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2825:1: rule__GetDigits__Group__0__Impl : ( ( rule__GetDigits__NameAssignment_0 ) ) ;
    public final void rule__GetDigits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2829:1: ( ( ( rule__GetDigits__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2830:1: ( ( rule__GetDigits__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2830:1: ( ( rule__GetDigits__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2831:1: ( rule__GetDigits__NameAssignment_0 )
            {
             before(grammarAccess.getGetDigitsAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2832:1: ( rule__GetDigits__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2832:2: rule__GetDigits__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__GetDigits__NameAssignment_0_in_rule__GetDigits__Group__0__Impl6032);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2842:1: rule__GetDigits__Group__1 : rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 ;
    public final void rule__GetDigits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2846:1: ( rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2847:2: rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__16062);
            rule__GetDigits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__16065);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2854:1: rule__GetDigits__Group__1__Impl : ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) ;
    public final void rule__GetDigits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2858:1: ( ( ( rule__GetDigits__NumDigitsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2859:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2859:1: ( ( rule__GetDigits__NumDigitsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2860:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2861:1: ( rule__GetDigits__NumDigitsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2861:2: rule__GetDigits__NumDigitsAssignment_1
            {
            pushFollow(FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl6092);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2871:1: rule__GetDigits__Group__2 : rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 ;
    public final void rule__GetDigits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2875:1: ( rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2876:2: rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__26122);
            rule__GetDigits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__26125);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2883:1: rule__GetDigits__Group__2__Impl : ( 'digits' ) ;
    public final void rule__GetDigits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2887:1: ( ( 'digits' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2888:1: ( 'digits' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2888:1: ( 'digits' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2889:1: 'digits'
            {
             before(grammarAccess.getGetDigitsAccess().getDigitsKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__GetDigits__Group__2__Impl6153); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2902:1: rule__GetDigits__Group__3 : rule__GetDigits__Group__3__Impl ;
    public final void rule__GetDigits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2906:1: ( rule__GetDigits__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2907:2: rule__GetDigits__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__36184);
            rule__GetDigits__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2913:1: rule__GetDigits__Group__3__Impl : ( ';' ) ;
    public final void rule__GetDigits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2917:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2918:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2918:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2919:1: ';'
            {
             before(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__GetDigits__Group__3__Impl6212); 
             after(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ask__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2940:1: rule__Ask__Group__0 : rule__Ask__Group__0__Impl rule__Ask__Group__1 ;
    public final void rule__Ask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2944:1: ( rule__Ask__Group__0__Impl rule__Ask__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2945:2: rule__Ask__Group__0__Impl rule__Ask__Group__1
            {
            pushFollow(FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__06251);
            rule__Ask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__06254);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2952:1: rule__Ask__Group__0__Impl : ( ( rule__Ask__NameAssignment_0 ) ) ;
    public final void rule__Ask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2956:1: ( ( ( rule__Ask__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2957:1: ( ( rule__Ask__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2957:1: ( ( rule__Ask__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2958:1: ( rule__Ask__NameAssignment_0 )
            {
             before(grammarAccess.getAskAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2959:1: ( rule__Ask__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2959:2: rule__Ask__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Ask__NameAssignment_0_in_rule__Ask__Group__0__Impl6281);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2969:1: rule__Ask__Group__1 : rule__Ask__Group__1__Impl rule__Ask__Group__2 ;
    public final void rule__Ask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2973:1: ( rule__Ask__Group__1__Impl rule__Ask__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2974:2: rule__Ask__Group__1__Impl rule__Ask__Group__2
            {
            pushFollow(FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__16311);
            rule__Ask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__16314);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2981:1: rule__Ask__Group__1__Impl : ( ( rule__Ask__QuestionAssignment_1 ) ) ;
    public final void rule__Ask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2985:1: ( ( ( rule__Ask__QuestionAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2986:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2986:1: ( ( rule__Ask__QuestionAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2987:1: ( rule__Ask__QuestionAssignment_1 )
            {
             before(grammarAccess.getAskAccess().getQuestionAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2988:1: ( rule__Ask__QuestionAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2988:2: rule__Ask__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6341);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2998:1: rule__Ask__Group__2 : rule__Ask__Group__2__Impl ;
    public final void rule__Ask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3002:1: ( rule__Ask__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3003:2: rule__Ask__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26371);
            rule__Ask__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3009:1: rule__Ask__Group__2__Impl : ( ';' ) ;
    public final void rule__Ask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3013:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3014:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3014:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3015:1: ';'
            {
             before(grammarAccess.getAskAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Ask__Group__2__Impl6399); 
             after(grammarAccess.getAskAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Send__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3034:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3038:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3039:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06436);
            rule__Send__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06439);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3046:1: rule__Send__Group__0__Impl : ( ( rule__Send__NameAssignment_0 ) ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3050:1: ( ( ( rule__Send__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3051:1: ( ( rule__Send__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3051:1: ( ( rule__Send__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3052:1: ( rule__Send__NameAssignment_0 )
            {
             before(grammarAccess.getSendAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3053:1: ( rule__Send__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3053:2: rule__Send__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Send__NameAssignment_0_in_rule__Send__Group__0__Impl6466);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3063:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3067:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3068:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16496);
            rule__Send__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16499);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3075:1: rule__Send__Group__1__Impl : ( ( rule__Send__ParamsAssignment_1 ) ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3079:1: ( ( ( rule__Send__ParamsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3080:1: ( ( rule__Send__ParamsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3080:1: ( ( rule__Send__ParamsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3081:1: ( rule__Send__ParamsAssignment_1 )
            {
             before(grammarAccess.getSendAccess().getParamsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3082:1: ( rule__Send__ParamsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3082:2: rule__Send__ParamsAssignment_1
            {
            pushFollow(FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6526);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3092:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3096:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3097:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26556);
            rule__Send__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26559);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3104:1: rule__Send__Group__2__Impl : ( 'to' ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3108:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3109:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3109:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3110:1: 'to'
            {
             before(grammarAccess.getSendAccess().getToKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Send__Group__2__Impl6587); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3123:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3127:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3128:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36618);
            rule__Send__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36621);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3135:1: rule__Send__Group__3__Impl : ( ( rule__Send__UrlAssignment_3 ) ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3139:1: ( ( ( rule__Send__UrlAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3140:1: ( ( rule__Send__UrlAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3140:1: ( ( rule__Send__UrlAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3141:1: ( rule__Send__UrlAssignment_3 )
            {
             before(grammarAccess.getSendAccess().getUrlAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3142:1: ( rule__Send__UrlAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3142:2: rule__Send__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6648);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3152:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3156:1: ( rule__Send__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3157:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46678);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3163:1: rule__Send__Group__4__Impl : ( ';' ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3167:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3168:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3168:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3169:1: ';'
            {
             before(grammarAccess.getSendAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Send__Group__4__Impl6706); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3192:1: rule__SendBlock__Group__0 : rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 ;
    public final void rule__SendBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3196:1: ( rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3197:2: rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06747);
            rule__SendBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06750);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3204:1: rule__SendBlock__Group__0__Impl : ( () ) ;
    public final void rule__SendBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3208:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3209:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3209:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3210:1: ()
            {
             before(grammarAccess.getSendBlockAccess().getSendBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3211:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3213:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3223:1: rule__SendBlock__Group__1 : rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 ;
    public final void rule__SendBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3227:1: ( rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3228:2: rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16808);
            rule__SendBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16811);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3235:1: rule__SendBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SendBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3239:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3240:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3240:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3241:1: '{'
            {
             before(grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__SendBlock__Group__1__Impl6839); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3254:1: rule__SendBlock__Group__2 : rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 ;
    public final void rule__SendBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3258:1: ( rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3259:2: rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26870);
            rule__SendBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26873);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3266:1: rule__SendBlock__Group__2__Impl : ( ( rule__SendBlock__ValueAssignment_2 ) ) ;
    public final void rule__SendBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3270:1: ( ( ( rule__SendBlock__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3271:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3271:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3272:1: ( rule__SendBlock__ValueAssignment_2 )
            {
             before(grammarAccess.getSendBlockAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3273:1: ( rule__SendBlock__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3273:2: rule__SendBlock__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6900);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3283:1: rule__SendBlock__Group__3 : rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 ;
    public final void rule__SendBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3287:1: ( rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3288:2: rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36930);
            rule__SendBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36933);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3295:1: rule__SendBlock__Group__3__Impl : ( ( rule__SendBlock__StmsAssignment_3 )* ) ;
    public final void rule__SendBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3299:1: ( ( ( rule__SendBlock__StmsAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3300:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3300:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3301:1: ( rule__SendBlock__StmsAssignment_3 )*
            {
             before(grammarAccess.getSendBlockAccess().getStmsAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3302:1: ( rule__SendBlock__StmsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3302:2: rule__SendBlock__StmsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6960);
            	    rule__SendBlock__StmsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3312:1: rule__SendBlock__Group__4 : rule__SendBlock__Group__4__Impl ;
    public final void rule__SendBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3316:1: ( rule__SendBlock__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3317:2: rule__SendBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__46991);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3323:1: rule__SendBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SendBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3327:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3328:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3328:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3329:1: '}'
            {
             before(grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__SendBlock__Group__4__Impl7019); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3352:1: rule__NotPrimaryParam__Group__0 : rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 ;
    public final void rule__NotPrimaryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3356:1: ( rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3357:2: rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__07060);
            rule__NotPrimaryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__07063);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3364:1: rule__NotPrimaryParam__Group__0__Impl : ( ',' ) ;
    public final void rule__NotPrimaryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3368:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3369:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3369:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3370:1: ','
            {
             before(grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__NotPrimaryParam__Group__0__Impl7091); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3383:1: rule__NotPrimaryParam__Group__1 : rule__NotPrimaryParam__Group__1__Impl ;
    public final void rule__NotPrimaryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3387:1: ( rule__NotPrimaryParam__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3388:2: rule__NotPrimaryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__17122);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3394:1: rule__NotPrimaryParam__Group__1__Impl : ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) ;
    public final void rule__NotPrimaryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3398:1: ( ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3399:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3399:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3400:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3401:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3401:2: rule__NotPrimaryParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7149);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3415:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3419:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3420:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07183);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07186);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3427:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3431:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3432:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3432:1: ( ( rule__Param__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3433:1: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3434:1: ( rule__Param__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3434:2: rule__Param__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_0_in_rule__Param__Group__0__Impl7213);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3444:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3448:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3449:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17243);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17246);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3456:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3460:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3461:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3461:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3462:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Param__Group__1__Impl7274); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3475:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3479:1: ( rule__Param__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3480:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27305);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3486:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3490:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3491:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3491:1: ( ( rule__Param__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3492:1: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3493:1: ( rule__Param__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3493:2: rule__Param__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7332);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3509:1: rule__Say__Group__0 : rule__Say__Group__0__Impl rule__Say__Group__1 ;
    public final void rule__Say__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3513:1: ( rule__Say__Group__0__Impl rule__Say__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3514:2: rule__Say__Group__0__Impl rule__Say__Group__1
            {
            pushFollow(FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07368);
            rule__Say__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07371);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3521:1: rule__Say__Group__0__Impl : ( ( rule__Say__NameAssignment_0 ) ) ;
    public final void rule__Say__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3525:1: ( ( ( rule__Say__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3526:1: ( ( rule__Say__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3526:1: ( ( rule__Say__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3527:1: ( rule__Say__NameAssignment_0 )
            {
             before(grammarAccess.getSayAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3528:1: ( rule__Say__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3528:2: rule__Say__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Say__NameAssignment_0_in_rule__Say__Group__0__Impl7398);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3538:1: rule__Say__Group__1 : rule__Say__Group__1__Impl rule__Say__Group__2 ;
    public final void rule__Say__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3542:1: ( rule__Say__Group__1__Impl rule__Say__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3543:2: rule__Say__Group__1__Impl rule__Say__Group__2
            {
            pushFollow(FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17428);
            rule__Say__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17431);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3550:1: rule__Say__Group__1__Impl : ( ( rule__Say__ThatAssignment_1 ) ) ;
    public final void rule__Say__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3554:1: ( ( ( rule__Say__ThatAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3555:1: ( ( rule__Say__ThatAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3555:1: ( ( rule__Say__ThatAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3556:1: ( rule__Say__ThatAssignment_1 )
            {
             before(grammarAccess.getSayAccess().getThatAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3557:1: ( rule__Say__ThatAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3557:2: rule__Say__ThatAssignment_1
            {
            pushFollow(FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7458);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3567:1: rule__Say__Group__2 : rule__Say__Group__2__Impl ;
    public final void rule__Say__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3571:1: ( rule__Say__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3572:2: rule__Say__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27488);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3578:1: rule__Say__Group__2__Impl : ( ';' ) ;
    public final void rule__Say__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3582:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3583:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3583:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3584:1: ';'
            {
             before(grammarAccess.getSayAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Say__Group__2__Impl7516); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3603:1: rule__Sms__Group__0 : rule__Sms__Group__0__Impl rule__Sms__Group__1 ;
    public final void rule__Sms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3607:1: ( rule__Sms__Group__0__Impl rule__Sms__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3608:2: rule__Sms__Group__0__Impl rule__Sms__Group__1
            {
            pushFollow(FOLLOW_rule__Sms__Group__0__Impl_in_rule__Sms__Group__07553);
            rule__Sms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__1_in_rule__Sms__Group__07556);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3615:1: rule__Sms__Group__0__Impl : ( ( rule__Sms__NameAssignment_0 ) ) ;
    public final void rule__Sms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3619:1: ( ( ( rule__Sms__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3620:1: ( ( rule__Sms__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3620:1: ( ( rule__Sms__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3621:1: ( rule__Sms__NameAssignment_0 )
            {
             before(grammarAccess.getSmsAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3622:1: ( rule__Sms__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3622:2: rule__Sms__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Sms__NameAssignment_0_in_rule__Sms__Group__0__Impl7583);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3632:1: rule__Sms__Group__1 : rule__Sms__Group__1__Impl rule__Sms__Group__2 ;
    public final void rule__Sms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3636:1: ( rule__Sms__Group__1__Impl rule__Sms__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3637:2: rule__Sms__Group__1__Impl rule__Sms__Group__2
            {
            pushFollow(FOLLOW_rule__Sms__Group__1__Impl_in_rule__Sms__Group__17613);
            rule__Sms__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__2_in_rule__Sms__Group__17616);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3644:1: rule__Sms__Group__1__Impl : ( ( rule__Sms__ValueAssignment_1 ) ) ;
    public final void rule__Sms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3648:1: ( ( ( rule__Sms__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3649:1: ( ( rule__Sms__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3649:1: ( ( rule__Sms__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3650:1: ( rule__Sms__ValueAssignment_1 )
            {
             before(grammarAccess.getSmsAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3651:1: ( rule__Sms__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3651:2: rule__Sms__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Sms__ValueAssignment_1_in_rule__Sms__Group__1__Impl7643);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3661:1: rule__Sms__Group__2 : rule__Sms__Group__2__Impl rule__Sms__Group__3 ;
    public final void rule__Sms__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3665:1: ( rule__Sms__Group__2__Impl rule__Sms__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3666:2: rule__Sms__Group__2__Impl rule__Sms__Group__3
            {
            pushFollow(FOLLOW_rule__Sms__Group__2__Impl_in_rule__Sms__Group__27673);
            rule__Sms__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__3_in_rule__Sms__Group__27676);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3673:1: rule__Sms__Group__2__Impl : ( 'to' ) ;
    public final void rule__Sms__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3677:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3678:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3678:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3679:1: 'to'
            {
             before(grammarAccess.getSmsAccess().getToKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Sms__Group__2__Impl7704); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3692:1: rule__Sms__Group__3 : rule__Sms__Group__3__Impl rule__Sms__Group__4 ;
    public final void rule__Sms__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3696:1: ( rule__Sms__Group__3__Impl rule__Sms__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3697:2: rule__Sms__Group__3__Impl rule__Sms__Group__4
            {
            pushFollow(FOLLOW_rule__Sms__Group__3__Impl_in_rule__Sms__Group__37735);
            rule__Sms__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__4_in_rule__Sms__Group__37738);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3704:1: rule__Sms__Group__3__Impl : ( ( rule__Sms__ToAssignment_3 ) ) ;
    public final void rule__Sms__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3708:1: ( ( ( rule__Sms__ToAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3709:1: ( ( rule__Sms__ToAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3709:1: ( ( rule__Sms__ToAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3710:1: ( rule__Sms__ToAssignment_3 )
            {
             before(grammarAccess.getSmsAccess().getToAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3711:1: ( rule__Sms__ToAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3711:2: rule__Sms__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__Sms__ToAssignment_3_in_rule__Sms__Group__3__Impl7765);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3721:1: rule__Sms__Group__4 : rule__Sms__Group__4__Impl ;
    public final void rule__Sms__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3725:1: ( rule__Sms__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3726:2: rule__Sms__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sms__Group__4__Impl_in_rule__Sms__Group__47795);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3732:1: rule__Sms__Group__4__Impl : ( ';' ) ;
    public final void rule__Sms__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3736:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3737:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3737:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3738:1: ';'
            {
             before(grammarAccess.getSmsAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Sms__Group__4__Impl7823); 
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


    // $ANTLR start "rule__Email__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3761:1: rule__Email__Group__0 : rule__Email__Group__0__Impl rule__Email__Group__1 ;
    public final void rule__Email__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3765:1: ( rule__Email__Group__0__Impl rule__Email__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3766:2: rule__Email__Group__0__Impl rule__Email__Group__1
            {
            pushFollow(FOLLOW_rule__Email__Group__0__Impl_in_rule__Email__Group__07864);
            rule__Email__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__1_in_rule__Email__Group__07867);
            rule__Email__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__0"


    // $ANTLR start "rule__Email__Group__0__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3773:1: rule__Email__Group__0__Impl : ( ( rule__Email__NameAssignment_0 ) ) ;
    public final void rule__Email__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3777:1: ( ( ( rule__Email__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3778:1: ( ( rule__Email__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3778:1: ( ( rule__Email__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3779:1: ( rule__Email__NameAssignment_0 )
            {
             before(grammarAccess.getEmailAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3780:1: ( rule__Email__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3780:2: rule__Email__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Email__NameAssignment_0_in_rule__Email__Group__0__Impl7894);
            rule__Email__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__0__Impl"


    // $ANTLR start "rule__Email__Group__1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3790:1: rule__Email__Group__1 : rule__Email__Group__1__Impl rule__Email__Group__2 ;
    public final void rule__Email__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3794:1: ( rule__Email__Group__1__Impl rule__Email__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3795:2: rule__Email__Group__1__Impl rule__Email__Group__2
            {
            pushFollow(FOLLOW_rule__Email__Group__1__Impl_in_rule__Email__Group__17924);
            rule__Email__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__2_in_rule__Email__Group__17927);
            rule__Email__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__1"


    // $ANTLR start "rule__Email__Group__1__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3802:1: rule__Email__Group__1__Impl : ( '{' ) ;
    public final void rule__Email__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3806:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3807:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3807:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3808:1: '{'
            {
             before(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Email__Group__1__Impl7955); 
             after(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__1__Impl"


    // $ANTLR start "rule__Email__Group__2"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3821:1: rule__Email__Group__2 : rule__Email__Group__2__Impl rule__Email__Group__3 ;
    public final void rule__Email__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3825:1: ( rule__Email__Group__2__Impl rule__Email__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3826:2: rule__Email__Group__2__Impl rule__Email__Group__3
            {
            pushFollow(FOLLOW_rule__Email__Group__2__Impl_in_rule__Email__Group__27986);
            rule__Email__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__3_in_rule__Email__Group__27989);
            rule__Email__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__2"


    // $ANTLR start "rule__Email__Group__2__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3833:1: rule__Email__Group__2__Impl : ( 'subject' ) ;
    public final void rule__Email__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3837:1: ( ( 'subject' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3838:1: ( 'subject' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3838:1: ( 'subject' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3839:1: 'subject'
            {
             before(grammarAccess.getEmailAccess().getSubjectKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Email__Group__2__Impl8017); 
             after(grammarAccess.getEmailAccess().getSubjectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__2__Impl"


    // $ANTLR start "rule__Email__Group__3"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3852:1: rule__Email__Group__3 : rule__Email__Group__3__Impl rule__Email__Group__4 ;
    public final void rule__Email__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3856:1: ( rule__Email__Group__3__Impl rule__Email__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3857:2: rule__Email__Group__3__Impl rule__Email__Group__4
            {
            pushFollow(FOLLOW_rule__Email__Group__3__Impl_in_rule__Email__Group__38048);
            rule__Email__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__4_in_rule__Email__Group__38051);
            rule__Email__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__3"


    // $ANTLR start "rule__Email__Group__3__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3864:1: rule__Email__Group__3__Impl : ( ':' ) ;
    public final void rule__Email__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3868:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3869:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3869:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3870:1: ':'
            {
             before(grammarAccess.getEmailAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Email__Group__3__Impl8079); 
             after(grammarAccess.getEmailAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__3__Impl"


    // $ANTLR start "rule__Email__Group__4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3883:1: rule__Email__Group__4 : rule__Email__Group__4__Impl rule__Email__Group__5 ;
    public final void rule__Email__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3887:1: ( rule__Email__Group__4__Impl rule__Email__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3888:2: rule__Email__Group__4__Impl rule__Email__Group__5
            {
            pushFollow(FOLLOW_rule__Email__Group__4__Impl_in_rule__Email__Group__48110);
            rule__Email__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__5_in_rule__Email__Group__48113);
            rule__Email__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__4"


    // $ANTLR start "rule__Email__Group__4__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3895:1: rule__Email__Group__4__Impl : ( ( rule__Email__TitleAssignment_4 ) ) ;
    public final void rule__Email__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3899:1: ( ( ( rule__Email__TitleAssignment_4 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3900:1: ( ( rule__Email__TitleAssignment_4 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3900:1: ( ( rule__Email__TitleAssignment_4 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3901:1: ( rule__Email__TitleAssignment_4 )
            {
             before(grammarAccess.getEmailAccess().getTitleAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3902:1: ( rule__Email__TitleAssignment_4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3902:2: rule__Email__TitleAssignment_4
            {
            pushFollow(FOLLOW_rule__Email__TitleAssignment_4_in_rule__Email__Group__4__Impl8140);
            rule__Email__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getTitleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__4__Impl"


    // $ANTLR start "rule__Email__Group__5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3912:1: rule__Email__Group__5 : rule__Email__Group__5__Impl rule__Email__Group__6 ;
    public final void rule__Email__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3916:1: ( rule__Email__Group__5__Impl rule__Email__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3917:2: rule__Email__Group__5__Impl rule__Email__Group__6
            {
            pushFollow(FOLLOW_rule__Email__Group__5__Impl_in_rule__Email__Group__58170);
            rule__Email__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__6_in_rule__Email__Group__58173);
            rule__Email__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__5"


    // $ANTLR start "rule__Email__Group__5__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3924:1: rule__Email__Group__5__Impl : ( ',' ) ;
    public final void rule__Email__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3928:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3929:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3929:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3930:1: ','
            {
             before(grammarAccess.getEmailAccess().getCommaKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__Email__Group__5__Impl8201); 
             after(grammarAccess.getEmailAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__5__Impl"


    // $ANTLR start "rule__Email__Group__6"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3943:1: rule__Email__Group__6 : rule__Email__Group__6__Impl rule__Email__Group__7 ;
    public final void rule__Email__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3947:1: ( rule__Email__Group__6__Impl rule__Email__Group__7 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3948:2: rule__Email__Group__6__Impl rule__Email__Group__7
            {
            pushFollow(FOLLOW_rule__Email__Group__6__Impl_in_rule__Email__Group__68232);
            rule__Email__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__7_in_rule__Email__Group__68235);
            rule__Email__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__6"


    // $ANTLR start "rule__Email__Group__6__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3955:1: rule__Email__Group__6__Impl : ( 'from' ) ;
    public final void rule__Email__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3959:1: ( ( 'from' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3960:1: ( 'from' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3960:1: ( 'from' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3961:1: 'from'
            {
             before(grammarAccess.getEmailAccess().getFromKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__Email__Group__6__Impl8263); 
             after(grammarAccess.getEmailAccess().getFromKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__6__Impl"


    // $ANTLR start "rule__Email__Group__7"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3974:1: rule__Email__Group__7 : rule__Email__Group__7__Impl rule__Email__Group__8 ;
    public final void rule__Email__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3978:1: ( rule__Email__Group__7__Impl rule__Email__Group__8 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3979:2: rule__Email__Group__7__Impl rule__Email__Group__8
            {
            pushFollow(FOLLOW_rule__Email__Group__7__Impl_in_rule__Email__Group__78294);
            rule__Email__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__8_in_rule__Email__Group__78297);
            rule__Email__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__7"


    // $ANTLR start "rule__Email__Group__7__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3986:1: rule__Email__Group__7__Impl : ( ':' ) ;
    public final void rule__Email__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3990:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3991:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3991:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3992:1: ':'
            {
             before(grammarAccess.getEmailAccess().getColonKeyword_7()); 
            match(input,33,FOLLOW_33_in_rule__Email__Group__7__Impl8325); 
             after(grammarAccess.getEmailAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__7__Impl"


    // $ANTLR start "rule__Email__Group__8"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4005:1: rule__Email__Group__8 : rule__Email__Group__8__Impl rule__Email__Group__9 ;
    public final void rule__Email__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4009:1: ( rule__Email__Group__8__Impl rule__Email__Group__9 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4010:2: rule__Email__Group__8__Impl rule__Email__Group__9
            {
            pushFollow(FOLLOW_rule__Email__Group__8__Impl_in_rule__Email__Group__88356);
            rule__Email__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__9_in_rule__Email__Group__88359);
            rule__Email__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__8"


    // $ANTLR start "rule__Email__Group__8__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4017:1: rule__Email__Group__8__Impl : ( ( rule__Email__FromAssignment_8 ) ) ;
    public final void rule__Email__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4021:1: ( ( ( rule__Email__FromAssignment_8 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4022:1: ( ( rule__Email__FromAssignment_8 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4022:1: ( ( rule__Email__FromAssignment_8 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4023:1: ( rule__Email__FromAssignment_8 )
            {
             before(grammarAccess.getEmailAccess().getFromAssignment_8()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4024:1: ( rule__Email__FromAssignment_8 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4024:2: rule__Email__FromAssignment_8
            {
            pushFollow(FOLLOW_rule__Email__FromAssignment_8_in_rule__Email__Group__8__Impl8386);
            rule__Email__FromAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getFromAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__8__Impl"


    // $ANTLR start "rule__Email__Group__9"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4034:1: rule__Email__Group__9 : rule__Email__Group__9__Impl rule__Email__Group__10 ;
    public final void rule__Email__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4038:1: ( rule__Email__Group__9__Impl rule__Email__Group__10 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4039:2: rule__Email__Group__9__Impl rule__Email__Group__10
            {
            pushFollow(FOLLOW_rule__Email__Group__9__Impl_in_rule__Email__Group__98416);
            rule__Email__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__10_in_rule__Email__Group__98419);
            rule__Email__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__9"


    // $ANTLR start "rule__Email__Group__9__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4046:1: rule__Email__Group__9__Impl : ( ',' ) ;
    public final void rule__Email__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4050:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4051:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4051:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4052:1: ','
            {
             before(grammarAccess.getEmailAccess().getCommaKeyword_9()); 
            match(input,32,FOLLOW_32_in_rule__Email__Group__9__Impl8447); 
             after(grammarAccess.getEmailAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__9__Impl"


    // $ANTLR start "rule__Email__Group__10"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4065:1: rule__Email__Group__10 : rule__Email__Group__10__Impl rule__Email__Group__11 ;
    public final void rule__Email__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4069:1: ( rule__Email__Group__10__Impl rule__Email__Group__11 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4070:2: rule__Email__Group__10__Impl rule__Email__Group__11
            {
            pushFollow(FOLLOW_rule__Email__Group__10__Impl_in_rule__Email__Group__108478);
            rule__Email__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__11_in_rule__Email__Group__108481);
            rule__Email__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__10"


    // $ANTLR start "rule__Email__Group__10__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4077:1: rule__Email__Group__10__Impl : ( 'message' ) ;
    public final void rule__Email__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4081:1: ( ( 'message' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4082:1: ( 'message' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4082:1: ( 'message' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4083:1: 'message'
            {
             before(grammarAccess.getEmailAccess().getMessageKeyword_10()); 
            match(input,36,FOLLOW_36_in_rule__Email__Group__10__Impl8509); 
             after(grammarAccess.getEmailAccess().getMessageKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__10__Impl"


    // $ANTLR start "rule__Email__Group__11"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4096:1: rule__Email__Group__11 : rule__Email__Group__11__Impl rule__Email__Group__12 ;
    public final void rule__Email__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4100:1: ( rule__Email__Group__11__Impl rule__Email__Group__12 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4101:2: rule__Email__Group__11__Impl rule__Email__Group__12
            {
            pushFollow(FOLLOW_rule__Email__Group__11__Impl_in_rule__Email__Group__118540);
            rule__Email__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__12_in_rule__Email__Group__118543);
            rule__Email__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__11"


    // $ANTLR start "rule__Email__Group__11__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4108:1: rule__Email__Group__11__Impl : ( ':' ) ;
    public final void rule__Email__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4112:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4113:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4113:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4114:1: ':'
            {
             before(grammarAccess.getEmailAccess().getColonKeyword_11()); 
            match(input,33,FOLLOW_33_in_rule__Email__Group__11__Impl8571); 
             after(grammarAccess.getEmailAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__11__Impl"


    // $ANTLR start "rule__Email__Group__12"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4127:1: rule__Email__Group__12 : rule__Email__Group__12__Impl rule__Email__Group__13 ;
    public final void rule__Email__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4131:1: ( rule__Email__Group__12__Impl rule__Email__Group__13 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4132:2: rule__Email__Group__12__Impl rule__Email__Group__13
            {
            pushFollow(FOLLOW_rule__Email__Group__12__Impl_in_rule__Email__Group__128602);
            rule__Email__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__13_in_rule__Email__Group__128605);
            rule__Email__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__12"


    // $ANTLR start "rule__Email__Group__12__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4139:1: rule__Email__Group__12__Impl : ( ( rule__Email__ValueAssignment_12 ) ) ;
    public final void rule__Email__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4143:1: ( ( ( rule__Email__ValueAssignment_12 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4144:1: ( ( rule__Email__ValueAssignment_12 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4144:1: ( ( rule__Email__ValueAssignment_12 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4145:1: ( rule__Email__ValueAssignment_12 )
            {
             before(grammarAccess.getEmailAccess().getValueAssignment_12()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4146:1: ( rule__Email__ValueAssignment_12 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4146:2: rule__Email__ValueAssignment_12
            {
            pushFollow(FOLLOW_rule__Email__ValueAssignment_12_in_rule__Email__Group__12__Impl8632);
            rule__Email__ValueAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getValueAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__12__Impl"


    // $ANTLR start "rule__Email__Group__13"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4156:1: rule__Email__Group__13 : rule__Email__Group__13__Impl rule__Email__Group__14 ;
    public final void rule__Email__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4160:1: ( rule__Email__Group__13__Impl rule__Email__Group__14 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4161:2: rule__Email__Group__13__Impl rule__Email__Group__14
            {
            pushFollow(FOLLOW_rule__Email__Group__13__Impl_in_rule__Email__Group__138662);
            rule__Email__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__14_in_rule__Email__Group__138665);
            rule__Email__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__13"


    // $ANTLR start "rule__Email__Group__13__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4168:1: rule__Email__Group__13__Impl : ( '}' ) ;
    public final void rule__Email__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4172:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4173:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4173:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4174:1: '}'
            {
             before(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FOLLOW_26_in_rule__Email__Group__13__Impl8693); 
             after(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__13__Impl"


    // $ANTLR start "rule__Email__Group__14"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4187:1: rule__Email__Group__14 : rule__Email__Group__14__Impl rule__Email__Group__15 ;
    public final void rule__Email__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4191:1: ( rule__Email__Group__14__Impl rule__Email__Group__15 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4192:2: rule__Email__Group__14__Impl rule__Email__Group__15
            {
            pushFollow(FOLLOW_rule__Email__Group__14__Impl_in_rule__Email__Group__148724);
            rule__Email__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__15_in_rule__Email__Group__148727);
            rule__Email__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__14"


    // $ANTLR start "rule__Email__Group__14__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4199:1: rule__Email__Group__14__Impl : ( 'to' ) ;
    public final void rule__Email__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4203:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4204:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4204:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4205:1: 'to'
            {
             before(grammarAccess.getEmailAccess().getToKeyword_14()); 
            match(input,31,FOLLOW_31_in_rule__Email__Group__14__Impl8755); 
             after(grammarAccess.getEmailAccess().getToKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__14__Impl"


    // $ANTLR start "rule__Email__Group__15"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4218:1: rule__Email__Group__15 : rule__Email__Group__15__Impl rule__Email__Group__16 ;
    public final void rule__Email__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4222:1: ( rule__Email__Group__15__Impl rule__Email__Group__16 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4223:2: rule__Email__Group__15__Impl rule__Email__Group__16
            {
            pushFollow(FOLLOW_rule__Email__Group__15__Impl_in_rule__Email__Group__158786);
            rule__Email__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__16_in_rule__Email__Group__158789);
            rule__Email__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__15"


    // $ANTLR start "rule__Email__Group__15__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4230:1: rule__Email__Group__15__Impl : ( ( rule__Email__ToAssignment_15 ) ) ;
    public final void rule__Email__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4234:1: ( ( ( rule__Email__ToAssignment_15 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4235:1: ( ( rule__Email__ToAssignment_15 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4235:1: ( ( rule__Email__ToAssignment_15 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4236:1: ( rule__Email__ToAssignment_15 )
            {
             before(grammarAccess.getEmailAccess().getToAssignment_15()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4237:1: ( rule__Email__ToAssignment_15 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4237:2: rule__Email__ToAssignment_15
            {
            pushFollow(FOLLOW_rule__Email__ToAssignment_15_in_rule__Email__Group__15__Impl8816);
            rule__Email__ToAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getToAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__15__Impl"


    // $ANTLR start "rule__Email__Group__16"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4247:1: rule__Email__Group__16 : rule__Email__Group__16__Impl ;
    public final void rule__Email__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4251:1: ( rule__Email__Group__16__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4252:2: rule__Email__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__Email__Group__16__Impl_in_rule__Email__Group__168846);
            rule__Email__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__16"


    // $ANTLR start "rule__Email__Group__16__Impl"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4258:1: rule__Email__Group__16__Impl : ( ';' ) ;
    public final void rule__Email__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4262:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4263:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4263:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4264:1: ';'
            {
             before(grammarAccess.getEmailAccess().getSemicolonKeyword_16()); 
            match(input,28,FOLLOW_28_in_rule__Email__Group__16__Impl8874); 
             after(grammarAccess.getEmailAccess().getSemicolonKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__16__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4311:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4315:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4316:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__08939);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__08942);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4323:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4327:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4328:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4328:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4329:1: ( rule__Transition__NameAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4330:1: ( rule__Transition__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4330:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl8969);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4340:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4344:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4345:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18999);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__19002);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4352:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TargetAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4356:1: ( ( ( rule__Transition__TargetAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4357:1: ( ( rule__Transition__TargetAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4357:1: ( ( rule__Transition__TargetAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4358:1: ( rule__Transition__TargetAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4359:1: ( rule__Transition__TargetAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4359:2: rule__Transition__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl9029);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4369:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4373:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4374:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__29059);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__29062);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4381:1: rule__Transition__Group__2__Impl : ( 'when' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4385:1: ( ( 'when' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4386:1: ( 'when' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4386:1: ( 'when' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4387:1: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Transition__Group__2__Impl9090); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4400:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4404:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4405:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__39121);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__39124);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4412:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__EventAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4416:1: ( ( ( rule__Transition__EventAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4417:1: ( ( rule__Transition__EventAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4417:1: ( ( rule__Transition__EventAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4418:1: ( rule__Transition__EventAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4419:1: ( rule__Transition__EventAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4419:2: rule__Transition__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl9151);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4429:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4433:1: ( rule__Transition__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4434:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__49181);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4440:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4444:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4445:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4445:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4446:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Transition__Group__4__Impl9209); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4469:1: rule__IfExp__Group__0 : rule__IfExp__Group__0__Impl rule__IfExp__Group__1 ;
    public final void rule__IfExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4473:1: ( rule__IfExp__Group__0__Impl rule__IfExp__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4474:2: rule__IfExp__Group__0__Impl rule__IfExp__Group__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__09250);
            rule__IfExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__09253);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4481:1: rule__IfExp__Group__0__Impl : ( ( rule__IfExp__BlockAssignment_0 ) ) ;
    public final void rule__IfExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4485:1: ( ( ( rule__IfExp__BlockAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4486:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4486:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4487:1: ( rule__IfExp__BlockAssignment_0 )
            {
             before(grammarAccess.getIfExpAccess().getBlockAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4488:1: ( rule__IfExp__BlockAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4488:2: rule__IfExp__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl9280);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4498:1: rule__IfExp__Group__1 : rule__IfExp__Group__1__Impl rule__IfExp__Group__2 ;
    public final void rule__IfExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4502:1: ( rule__IfExp__Group__1__Impl rule__IfExp__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4503:2: rule__IfExp__Group__1__Impl rule__IfExp__Group__2
            {
            pushFollow(FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__19310);
            rule__IfExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__19313);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4510:1: rule__IfExp__Group__1__Impl : ( ( rule__IfExp__Group_1__0 )* ) ;
    public final void rule__IfExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4514:1: ( ( ( rule__IfExp__Group_1__0 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4515:1: ( ( rule__IfExp__Group_1__0 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4515:1: ( ( rule__IfExp__Group_1__0 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4516:1: ( rule__IfExp__Group_1__0 )*
            {
             before(grammarAccess.getIfExpAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4517:1: ( rule__IfExp__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==39) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4517:2: rule__IfExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl9340);
            	    rule__IfExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4527:1: rule__IfExp__Group__2 : rule__IfExp__Group__2__Impl ;
    public final void rule__IfExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4531:1: ( rule__IfExp__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4532:2: rule__IfExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__29371);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4538:1: rule__IfExp__Group__2__Impl : ( ( rule__IfExp__Group_2__0 )? ) ;
    public final void rule__IfExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4542:1: ( ( ( rule__IfExp__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4543:1: ( ( rule__IfExp__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4543:1: ( ( rule__IfExp__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4544:1: ( rule__IfExp__Group_2__0 )?
            {
             before(grammarAccess.getIfExpAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4545:1: ( rule__IfExp__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4545:2: rule__IfExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl9398);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4561:1: rule__IfExp__Group_1__0 : rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 ;
    public final void rule__IfExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4565:1: ( rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4566:2: rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__09435);
            rule__IfExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__09438);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4573:1: rule__IfExp__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4577:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4578:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4578:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4579:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__IfExp__Group_1__0__Impl9466); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4592:1: rule__IfExp__Group_1__1 : rule__IfExp__Group_1__1__Impl ;
    public final void rule__IfExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4596:1: ( rule__IfExp__Group_1__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4597:2: rule__IfExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__19497);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4603:1: rule__IfExp__Group_1__1__Impl : ( ( rule__IfExp__BlocksAssignment_1_1 ) ) ;
    public final void rule__IfExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4607:1: ( ( ( rule__IfExp__BlocksAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4608:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4608:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4609:1: ( rule__IfExp__BlocksAssignment_1_1 )
            {
             before(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4610:1: ( rule__IfExp__BlocksAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4610:2: rule__IfExp__BlocksAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl9524);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4624:1: rule__IfExp__Group_2__0 : rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 ;
    public final void rule__IfExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4628:1: ( rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4629:2: rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__09558);
            rule__IfExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__09561);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4636:1: rule__IfExp__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4640:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4641:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4641:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4642:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__IfExp__Group_2__0__Impl9589); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4655:1: rule__IfExp__Group_2__1 : rule__IfExp__Group_2__1__Impl ;
    public final void rule__IfExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4659:1: ( rule__IfExp__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4660:2: rule__IfExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__19620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4666:1: rule__IfExp__Group_2__1__Impl : ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) ;
    public final void rule__IfExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4670:1: ( ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4671:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4671:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4672:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4673:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4673:2: rule__IfExp__DefaultBlockAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl9647);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4687:1: rule__CondBlock__Group__0 : rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 ;
    public final void rule__CondBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4691:1: ( rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4692:2: rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__09681);
            rule__CondBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__09684);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4699:1: rule__CondBlock__Group__0__Impl : ( 'if' ) ;
    public final void rule__CondBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4703:1: ( ( 'if' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4704:1: ( 'if' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4704:1: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4705:1: 'if'
            {
             before(grammarAccess.getCondBlockAccess().getIfKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__CondBlock__Group__0__Impl9712); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4718:1: rule__CondBlock__Group__1 : rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 ;
    public final void rule__CondBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4722:1: ( rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4723:2: rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__19743);
            rule__CondBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__19746);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4730:1: rule__CondBlock__Group__1__Impl : ( ( rule__CondBlock__CondAssignment_1 ) ) ;
    public final void rule__CondBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4734:1: ( ( ( rule__CondBlock__CondAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4735:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4735:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4736:1: ( rule__CondBlock__CondAssignment_1 )
            {
             before(grammarAccess.getCondBlockAccess().getCondAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4737:1: ( rule__CondBlock__CondAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4737:2: rule__CondBlock__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl9773);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4747:1: rule__CondBlock__Group__2 : rule__CondBlock__Group__2__Impl ;
    public final void rule__CondBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4751:1: ( rule__CondBlock__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4752:2: rule__CondBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__29803);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4758:1: rule__CondBlock__Group__2__Impl : ( ( rule__CondBlock__ActionAssignment_2 ) ) ;
    public final void rule__CondBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4762:1: ( ( ( rule__CondBlock__ActionAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4763:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4763:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4764:1: ( rule__CondBlock__ActionAssignment_2 )
            {
             before(grammarAccess.getCondBlockAccess().getActionAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4765:1: ( rule__CondBlock__ActionAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4765:2: rule__CondBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl9830);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4781:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4785:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4786:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09866);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09869);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4793:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4797:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4798:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4798:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4799:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4800:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4802:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4812:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4816:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4817:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19927);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19930);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4824:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4828:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4829:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4829:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4830:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Block__Group__1__Impl9958); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4843:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4847:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4848:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29989);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29992);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4855:1: rule__Block__Group__2__Impl : ( ( rule__Block__StaAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4859:1: ( ( ( rule__Block__StaAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4860:1: ( ( rule__Block__StaAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4860:1: ( ( rule__Block__StaAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4861:1: ( rule__Block__StaAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getStaAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4862:1: ( rule__Block__StaAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ML_COMMENT||(LA25_0>=39 && LA25_0<=56)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4862:2: rule__Block__StaAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl10019);
            	    rule__Block__StaAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4872:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4876:1: ( rule__Block__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4877:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__310050);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4883:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4887:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4888:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4888:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4889:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Block__Group__3__Impl10078); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4910:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4914:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4915:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__010117);
            rule__BoolExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__010120);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4922:1: rule__BoolExpression__Group__0__Impl : ( ruleTerminalBoolExpression ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4926:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4927:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4927:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4928:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl10147);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4939:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4943:1: ( rule__BoolExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4944:2: rule__BoolExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__110176);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4950:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4954:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4955:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4955:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4956:1: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4957:1: ( rule__BoolExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_LOGIC_WORD) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4957:2: rule__BoolExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl10203);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4971:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4975:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4976:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__010238);
            rule__BoolExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__010241);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4983:1: rule__BoolExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4987:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4988:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4988:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4989:1: ()
            {
             before(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4990:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4992:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5002:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5006:1: ( rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5007:2: rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__110299);
            rule__BoolExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__110302);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5014:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5018:1: ( ( ( rule__BoolExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5019:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5019:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5020:1: ( rule__BoolExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5021:1: ( rule__BoolExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5021:2: rule__BoolExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl10329);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5031:1: rule__BoolExpression__Group_1__2 : rule__BoolExpression__Group_1__2__Impl ;
    public final void rule__BoolExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5035:1: ( rule__BoolExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5036:2: rule__BoolExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__210359);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5042:1: rule__BoolExpression__Group_1__2__Impl : ( ( rule__BoolExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5046:1: ( ( ( rule__BoolExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5047:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5047:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5048:1: ( rule__BoolExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5049:1: ( rule__BoolExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5049:2: rule__BoolExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl10386);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5065:1: rule__Brackets__Group__0 : rule__Brackets__Group__0__Impl rule__Brackets__Group__1 ;
    public final void rule__Brackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5069:1: ( rule__Brackets__Group__0__Impl rule__Brackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5070:2: rule__Brackets__Group__0__Impl rule__Brackets__Group__1
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__010422);
            rule__Brackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__010425);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5077:1: rule__Brackets__Group__0__Impl : ( ( rule__Brackets__OpenAssignment_0 ) ) ;
    public final void rule__Brackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5081:1: ( ( ( rule__Brackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5082:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5082:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5083:1: ( rule__Brackets__OpenAssignment_0 )
            {
             before(grammarAccess.getBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5084:1: ( rule__Brackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5084:2: rule__Brackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl10452);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5094:1: rule__Brackets__Group__1 : rule__Brackets__Group__1__Impl rule__Brackets__Group__2 ;
    public final void rule__Brackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5098:1: ( rule__Brackets__Group__1__Impl rule__Brackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5099:2: rule__Brackets__Group__1__Impl rule__Brackets__Group__2
            {
            pushFollow(FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__110482);
            rule__Brackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__110485);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5106:1: rule__Brackets__Group__1__Impl : ( ( rule__Brackets__ObjAssignment_1 ) ) ;
    public final void rule__Brackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5110:1: ( ( ( rule__Brackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5111:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5111:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5112:1: ( rule__Brackets__ObjAssignment_1 )
            {
             before(grammarAccess.getBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5113:1: ( rule__Brackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5113:2: rule__Brackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10512);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5123:1: rule__Brackets__Group__2 : rule__Brackets__Group__2__Impl ;
    public final void rule__Brackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5127:1: ( rule__Brackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5128:2: rule__Brackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210542);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5134:1: rule__Brackets__Group__2__Impl : ( ( rule__Brackets__CloseAssignment_2 ) ) ;
    public final void rule__Brackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5138:1: ( ( ( rule__Brackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5139:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5139:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5140:1: ( rule__Brackets__CloseAssignment_2 )
            {
             before(grammarAccess.getBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5141:1: ( rule__Brackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5141:2: rule__Brackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10569);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5157:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5161:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5162:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010605);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010608);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5169:1: rule__CompareExpression__Group__0__Impl : ( ( rule__CompareExpression__LeftAssignment_0 ) ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5173:1: ( ( ( rule__CompareExpression__LeftAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5174:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5174:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5175:1: ( rule__CompareExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5176:1: ( rule__CompareExpression__LeftAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5176:2: rule__CompareExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10635);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5186:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5190:1: ( rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5191:2: rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110665);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110668);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5198:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__OpAssignment_1 ) ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5202:1: ( ( ( rule__CompareExpression__OpAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5203:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5203:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5204:1: ( rule__CompareExpression__OpAssignment_1 )
            {
             before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5205:1: ( rule__CompareExpression__OpAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5205:2: rule__CompareExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10695);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5215:1: rule__CompareExpression__Group__2 : rule__CompareExpression__Group__2__Impl ;
    public final void rule__CompareExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5219:1: ( rule__CompareExpression__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5220:2: rule__CompareExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210725);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5226:1: rule__CompareExpression__Group__2__Impl : ( ( rule__CompareExpression__RightAssignment_2 ) ) ;
    public final void rule__CompareExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5230:1: ( ( ( rule__CompareExpression__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5231:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5231:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5232:1: ( rule__CompareExpression__RightAssignment_2 )
            {
             before(grammarAccess.getCompareExpressionAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5233:1: ( rule__CompareExpression__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5233:2: rule__CompareExpression__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10752);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5249:1: rule__NegExpression__Group__0 : rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 ;
    public final void rule__NegExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5253:1: ( rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5254:2: rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010788);
            rule__NegExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010791);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5261:1: rule__NegExpression__Group__0__Impl : ( ( rule__NegExpression__OpAssignment_0 ) ) ;
    public final void rule__NegExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5265:1: ( ( ( rule__NegExpression__OpAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5266:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5266:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5267:1: ( rule__NegExpression__OpAssignment_0 )
            {
             before(grammarAccess.getNegExpressionAccess().getOpAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5268:1: ( rule__NegExpression__OpAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5268:2: rule__NegExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10818);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5278:1: rule__NegExpression__Group__1 : rule__NegExpression__Group__1__Impl ;
    public final void rule__NegExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5282:1: ( rule__NegExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5283:2: rule__NegExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110848);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5289:1: rule__NegExpression__Group__1__Impl : ( ( rule__NegExpression__ObjAssignment_1 ) ) ;
    public final void rule__NegExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5293:1: ( ( ( rule__NegExpression__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5294:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5294:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5295:1: ( rule__NegExpression__ObjAssignment_1 )
            {
             before(grammarAccess.getNegExpressionAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5296:1: ( rule__NegExpression__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5296:2: rule__NegExpression__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10875);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5310:1: rule__MathExpression__Group__0 : rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 ;
    public final void rule__MathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5314:1: ( rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5315:2: rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010909);
            rule__MathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010912);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5322:1: rule__MathExpression__Group__0__Impl : ( ruleMathTerminal ) ;
    public final void rule__MathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5326:1: ( ( ruleMathTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5327:1: ( ruleMathTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5327:1: ( ruleMathTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5328:1: ruleMathTerminal
            {
             before(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10939);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5339:1: rule__MathExpression__Group__1 : rule__MathExpression__Group__1__Impl ;
    public final void rule__MathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5343:1: ( rule__MathExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5344:2: rule__MathExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110968);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5350:1: rule__MathExpression__Group__1__Impl : ( ( rule__MathExpression__Group_1__0 )? ) ;
    public final void rule__MathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5354:1: ( ( ( rule__MathExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5355:1: ( ( rule__MathExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5355:1: ( ( rule__MathExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5356:1: ( rule__MathExpression__Group_1__0 )?
            {
             before(grammarAccess.getMathExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5357:1: ( rule__MathExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_MATH) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5357:2: rule__MathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10995);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5371:1: rule__MathExpression__Group_1__0 : rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 ;
    public final void rule__MathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5375:1: ( rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5376:2: rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__011030);
            rule__MathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__011033);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5383:1: rule__MathExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5387:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5388:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5388:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5389:1: ()
            {
             before(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5390:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5392:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5402:1: rule__MathExpression__Group_1__1 : rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 ;
    public final void rule__MathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5406:1: ( rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5407:2: rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__111091);
            rule__MathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__111094);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5414:1: rule__MathExpression__Group_1__1__Impl : ( ( rule__MathExpression__OpAssignment_1_1 ) ) ;
    public final void rule__MathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5418:1: ( ( ( rule__MathExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5419:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5419:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5420:1: ( rule__MathExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5421:1: ( rule__MathExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5421:2: rule__MathExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl11121);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5431:1: rule__MathExpression__Group_1__2 : rule__MathExpression__Group_1__2__Impl ;
    public final void rule__MathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5435:1: ( rule__MathExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5436:2: rule__MathExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__211151);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5442:1: rule__MathExpression__Group_1__2__Impl : ( ( rule__MathExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5446:1: ( ( ( rule__MathExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5447:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5447:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5448:1: ( rule__MathExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5449:1: ( rule__MathExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5449:2: rule__MathExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl11178);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5465:1: rule__MathBrackets__Group__0 : rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 ;
    public final void rule__MathBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5469:1: ( rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5470:2: rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__011214);
            rule__MathBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__011217);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5477:1: rule__MathBrackets__Group__0__Impl : ( ( rule__MathBrackets__OpenAssignment_0 ) ) ;
    public final void rule__MathBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5481:1: ( ( ( rule__MathBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5482:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5482:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5483:1: ( rule__MathBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getMathBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5484:1: ( rule__MathBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5484:2: rule__MathBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl11244);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5494:1: rule__MathBrackets__Group__1 : rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 ;
    public final void rule__MathBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5498:1: ( rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5499:2: rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__111274);
            rule__MathBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__111277);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5506:1: rule__MathBrackets__Group__1__Impl : ( ( rule__MathBrackets__ObjAssignment_1 ) ) ;
    public final void rule__MathBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5510:1: ( ( ( rule__MathBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5511:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5511:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5512:1: ( rule__MathBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getMathBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5513:1: ( rule__MathBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5513:2: rule__MathBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl11304);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5523:1: rule__MathBrackets__Group__2 : rule__MathBrackets__Group__2__Impl ;
    public final void rule__MathBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5527:1: ( rule__MathBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5528:2: rule__MathBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__211334);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5534:1: rule__MathBrackets__Group__2__Impl : ( ( rule__MathBrackets__CloseAssignment_2 ) ) ;
    public final void rule__MathBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5538:1: ( ( ( rule__MathBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5539:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5539:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5540:1: ( rule__MathBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getMathBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5541:1: ( rule__MathBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5541:2: rule__MathBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl11361);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5557:1: rule__ConcatenationExpression__Group__0 : rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 ;
    public final void rule__ConcatenationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5561:1: ( rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5562:2: rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__011397);
            rule__ConcatenationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__011400);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5569:1: rule__ConcatenationExpression__Group__0__Impl : ( ruleConcatenationTerminal ) ;
    public final void rule__ConcatenationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5573:1: ( ( ruleConcatenationTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5574:1: ( ruleConcatenationTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5574:1: ( ruleConcatenationTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5575:1: ruleConcatenationTerminal
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl11427);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5586:1: rule__ConcatenationExpression__Group__1 : rule__ConcatenationExpression__Group__1__Impl ;
    public final void rule__ConcatenationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5590:1: ( rule__ConcatenationExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5591:2: rule__ConcatenationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__111456);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5597:1: rule__ConcatenationExpression__Group__1__Impl : ( ( rule__ConcatenationExpression__Group_1__0 )? ) ;
    public final void rule__ConcatenationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5601:1: ( ( ( rule__ConcatenationExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5602:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5602:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5603:1: ( rule__ConcatenationExpression__Group_1__0 )?
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5604:1: ( rule__ConcatenationExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_CONCATENATION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5604:2: rule__ConcatenationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl11483);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5618:1: rule__ConcatenationExpression__Group_1__0 : rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 ;
    public final void rule__ConcatenationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5622:1: ( rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5623:2: rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011518);
            rule__ConcatenationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011521);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5630:1: rule__ConcatenationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatenationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5634:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5635:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5635:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5636:1: ()
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5637:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5639:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5649:1: rule__ConcatenationExpression__Group_1__1 : rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 ;
    public final void rule__ConcatenationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5653:1: ( rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5654:2: rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111579);
            rule__ConcatenationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111582);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5661:1: rule__ConcatenationExpression__Group_1__1__Impl : ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5665:1: ( ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5666:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5666:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5667:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5668:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5668:2: rule__ConcatenationExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11609);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5678:1: rule__ConcatenationExpression__Group_1__2 : rule__ConcatenationExpression__Group_1__2__Impl ;
    public final void rule__ConcatenationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5682:1: ( rule__ConcatenationExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5683:2: rule__ConcatenationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211639);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5689:1: rule__ConcatenationExpression__Group_1__2__Impl : ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5693:1: ( ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5694:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5694:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5695:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5696:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5696:2: rule__ConcatenationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11666);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5712:1: rule__ConcatenationBrackets__Group__0 : rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 ;
    public final void rule__ConcatenationBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5716:1: ( rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5717:2: rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011702);
            rule__ConcatenationBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011705);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5724:1: rule__ConcatenationBrackets__Group__0__Impl : ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) ;
    public final void rule__ConcatenationBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5728:1: ( ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5729:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5729:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5730:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5731:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5731:2: rule__ConcatenationBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11732);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5741:1: rule__ConcatenationBrackets__Group__1 : rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 ;
    public final void rule__ConcatenationBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5745:1: ( rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5746:2: rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111762);
            rule__ConcatenationBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111765);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5753:1: rule__ConcatenationBrackets__Group__1__Impl : ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) ;
    public final void rule__ConcatenationBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5757:1: ( ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5758:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5758:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5759:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5760:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5760:2: rule__ConcatenationBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11792);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5770:1: rule__ConcatenationBrackets__Group__2 : rule__ConcatenationBrackets__Group__2__Impl ;
    public final void rule__ConcatenationBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5774:1: ( rule__ConcatenationBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5775:2: rule__ConcatenationBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211822);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5781:1: rule__ConcatenationBrackets__Group__2__Impl : ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) ;
    public final void rule__ConcatenationBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5785:1: ( ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5786:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5786:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5787:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5788:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5788:2: rule__ConcatenationBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11849);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5804:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5808:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5809:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011885);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011888);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5816:1: rule__StringVariable__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5820:1: ( ( 'String' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5821:1: ( 'String' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5821:1: ( 'String' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5822:1: 'String'
            {
             before(grammarAccess.getStringVariableAccess().getStringKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__StringVariable__Group__0__Impl11916); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5835:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5839:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5840:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111947);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111950);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5847:1: rule__StringVariable__Group__1__Impl : ( ( rule__StringVariable__NameAssignment_1 ) ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5851:1: ( ( ( rule__StringVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5852:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5852:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5853:1: ( rule__StringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5854:1: ( rule__StringVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5854:2: rule__StringVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11977);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5864:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5868:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5869:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__212007);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__212010);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5876:1: rule__StringVariable__Group__2__Impl : ( ( rule__StringVariable__Group_2__0 )? ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5880:1: ( ( ( rule__StringVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5881:1: ( ( rule__StringVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5881:1: ( ( rule__StringVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5882:1: ( rule__StringVariable__Group_2__0 )?
            {
             before(grammarAccess.getStringVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5883:1: ( rule__StringVariable__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=21 && LA29_0<=22)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5883:2: rule__StringVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl12037);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5893:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5897:1: ( rule__StringVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5898:2: rule__StringVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__312068);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5904:1: rule__StringVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5908:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5909:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5909:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5910:1: ';'
            {
             before(grammarAccess.getStringVariableAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__StringVariable__Group__3__Impl12096); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5931:1: rule__StringVariable__Group_2__0 : rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 ;
    public final void rule__StringVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5935:1: ( rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5936:2: rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__012135);
            rule__StringVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__012138);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5943:1: rule__StringVariable__Group_2__0__Impl : ( ( rule__StringVariable__Alternatives_2_0 ) ) ;
    public final void rule__StringVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5947:1: ( ( ( rule__StringVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5948:1: ( ( rule__StringVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5948:1: ( ( rule__StringVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5949:1: ( rule__StringVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getStringVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5950:1: ( rule__StringVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5950:2: rule__StringVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__StringVariable__Alternatives_2_0_in_rule__StringVariable__Group_2__0__Impl12165);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5960:1: rule__StringVariable__Group_2__1 : rule__StringVariable__Group_2__1__Impl ;
    public final void rule__StringVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5964:1: ( rule__StringVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5965:2: rule__StringVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__112195);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5971:1: rule__StringVariable__Group_2__1__Impl : ( ( rule__StringVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__StringVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5975:1: ( ( ( rule__StringVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5976:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5976:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5977:1: ( rule__StringVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getStringVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5978:1: ( rule__StringVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5978:2: rule__StringVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl12222);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5992:1: rule__NumVariable__Group__0 : rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 ;
    public final void rule__NumVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5996:1: ( rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5997:2: rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__012256);
            rule__NumVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__012259);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6004:1: rule__NumVariable__Group__0__Impl : ( 'Num' ) ;
    public final void rule__NumVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6008:1: ( ( 'Num' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6009:1: ( 'Num' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6009:1: ( 'Num' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6010:1: 'Num'
            {
             before(grammarAccess.getNumVariableAccess().getNumKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__NumVariable__Group__0__Impl12287); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6023:1: rule__NumVariable__Group__1 : rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 ;
    public final void rule__NumVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6027:1: ( rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6028:2: rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__112318);
            rule__NumVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__112321);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6035:1: rule__NumVariable__Group__1__Impl : ( ( rule__NumVariable__NameAssignment_1 ) ) ;
    public final void rule__NumVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6039:1: ( ( ( rule__NumVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6040:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6040:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6041:1: ( rule__NumVariable__NameAssignment_1 )
            {
             before(grammarAccess.getNumVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6042:1: ( rule__NumVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6042:2: rule__NumVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl12348);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6052:1: rule__NumVariable__Group__2 : rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 ;
    public final void rule__NumVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6056:1: ( rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6057:2: rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__212378);
            rule__NumVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__212381);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6064:1: rule__NumVariable__Group__2__Impl : ( ( rule__NumVariable__Group_2__0 )? ) ;
    public final void rule__NumVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6068:1: ( ( ( rule__NumVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6069:1: ( ( rule__NumVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6069:1: ( ( rule__NumVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6070:1: ( rule__NumVariable__Group_2__0 )?
            {
             before(grammarAccess.getNumVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6071:1: ( rule__NumVariable__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=21 && LA30_0<=22)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6071:2: rule__NumVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl12408);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6081:1: rule__NumVariable__Group__3 : rule__NumVariable__Group__3__Impl ;
    public final void rule__NumVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6085:1: ( rule__NumVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6086:2: rule__NumVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__312439);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6092:1: rule__NumVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__NumVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6096:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6097:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6097:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6098:1: ';'
            {
             before(grammarAccess.getNumVariableAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__NumVariable__Group__3__Impl12467); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6119:1: rule__NumVariable__Group_2__0 : rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 ;
    public final void rule__NumVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6123:1: ( rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6124:2: rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012506);
            rule__NumVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012509);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6131:1: rule__NumVariable__Group_2__0__Impl : ( ( rule__NumVariable__Alternatives_2_0 ) ) ;
    public final void rule__NumVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6135:1: ( ( ( rule__NumVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6136:1: ( ( rule__NumVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6136:1: ( ( rule__NumVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6137:1: ( rule__NumVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getNumVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6138:1: ( rule__NumVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6138:2: rule__NumVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__NumVariable__Alternatives_2_0_in_rule__NumVariable__Group_2__0__Impl12536);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6148:1: rule__NumVariable__Group_2__1 : rule__NumVariable__Group_2__1__Impl ;
    public final void rule__NumVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6152:1: ( rule__NumVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6153:2: rule__NumVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112566);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6159:1: rule__NumVariable__Group_2__1__Impl : ( ( rule__NumVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__NumVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6163:1: ( ( ( rule__NumVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6164:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6164:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6165:1: ( rule__NumVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNumVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6166:1: ( rule__NumVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6166:2: rule__NumVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12593);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6180:1: rule__BoolVariable__Group__0 : rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 ;
    public final void rule__BoolVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6184:1: ( rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6185:2: rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012627);
            rule__BoolVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012630);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6192:1: rule__BoolVariable__Group__0__Impl : ( 'Bool' ) ;
    public final void rule__BoolVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6196:1: ( ( 'Bool' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6197:1: ( 'Bool' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6197:1: ( 'Bool' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6198:1: 'Bool'
            {
             before(grammarAccess.getBoolVariableAccess().getBoolKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__BoolVariable__Group__0__Impl12658); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6211:1: rule__BoolVariable__Group__1 : rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 ;
    public final void rule__BoolVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6215:1: ( rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6216:2: rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112689);
            rule__BoolVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112692);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6223:1: rule__BoolVariable__Group__1__Impl : ( ( rule__BoolVariable__NameAssignment_1 ) ) ;
    public final void rule__BoolVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6227:1: ( ( ( rule__BoolVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6228:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6228:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6229:1: ( rule__BoolVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6230:1: ( rule__BoolVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6230:2: rule__BoolVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12719);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6240:1: rule__BoolVariable__Group__2 : rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 ;
    public final void rule__BoolVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6244:1: ( rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6245:2: rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212749);
            rule__BoolVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212752);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6252:1: rule__BoolVariable__Group__2__Impl : ( ( rule__BoolVariable__Group_2__0 )? ) ;
    public final void rule__BoolVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6256:1: ( ( ( rule__BoolVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6257:1: ( ( rule__BoolVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6257:1: ( ( rule__BoolVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6258:1: ( rule__BoolVariable__Group_2__0 )?
            {
             before(grammarAccess.getBoolVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6259:1: ( rule__BoolVariable__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=21 && LA31_0<=22)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6259:2: rule__BoolVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12779);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6269:1: rule__BoolVariable__Group__3 : rule__BoolVariable__Group__3__Impl ;
    public final void rule__BoolVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6273:1: ( rule__BoolVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6274:2: rule__BoolVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312810);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6280:1: rule__BoolVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__BoolVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6284:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6285:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6285:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6286:1: ';'
            {
             before(grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__BoolVariable__Group__3__Impl12838); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6307:1: rule__BoolVariable__Group_2__0 : rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 ;
    public final void rule__BoolVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6311:1: ( rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6312:2: rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012877);
            rule__BoolVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012880);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6319:1: rule__BoolVariable__Group_2__0__Impl : ( ( rule__BoolVariable__Alternatives_2_0 ) ) ;
    public final void rule__BoolVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6323:1: ( ( ( rule__BoolVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6324:1: ( ( rule__BoolVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6324:1: ( ( rule__BoolVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6325:1: ( rule__BoolVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getBoolVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6326:1: ( rule__BoolVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6326:2: rule__BoolVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Alternatives_2_0_in_rule__BoolVariable__Group_2__0__Impl12907);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6336:1: rule__BoolVariable__Group_2__1 : rule__BoolVariable__Group_2__1__Impl ;
    public final void rule__BoolVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6340:1: ( rule__BoolVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6341:2: rule__BoolVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112937);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6347:1: rule__BoolVariable__Group_2__1__Impl : ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__BoolVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6351:1: ( ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6352:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6352:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6353:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6354:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6354:2: rule__BoolVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12964);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6368:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6372:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6373:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__012998);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__013001);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6380:1: rule__Constant__Group__0__Impl : ( 'Const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6384:1: ( ( 'Const' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6385:1: ( 'Const' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6385:1: ( 'Const' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6386:1: 'Const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Constant__Group__0__Impl13029); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6399:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6403:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6404:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__113060);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__113063);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6411:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6415:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6416:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6416:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6417:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6418:1: ( rule__Constant__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6418:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl13090);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6428:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6432:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6433:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__213120);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__213123);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6440:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Alternatives_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6444:1: ( ( ( rule__Constant__Alternatives_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6445:1: ( ( rule__Constant__Alternatives_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6445:1: ( ( rule__Constant__Alternatives_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6446:1: ( rule__Constant__Alternatives_2 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6447:1: ( rule__Constant__Alternatives_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6447:2: rule__Constant__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_2_in_rule__Constant__Group__2__Impl13150);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6457:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6461:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6462:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__313180);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__313183);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6469:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6473:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6474:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6474:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6475:1: ( rule__Constant__ValueAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6476:1: ( rule__Constant__ValueAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6476:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl13210);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6486:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6490:1: ( rule__Constant__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6491:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__413240);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6497:1: rule__Constant__Group__4__Impl : ( ';' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6501:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6502:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6502:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6503:1: ';'
            {
             before(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Constant__Group__4__Impl13268); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6526:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6530:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6531:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__013309);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__013312);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6538:1: rule__BoolLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6542:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6543:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6543:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6544:1: ()
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6545:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6547:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6557:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6561:1: ( rule__BoolLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6562:2: rule__BoolLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__113370);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6568:1: rule__BoolLiteral__Group__1__Impl : ( ( rule__BoolLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6572:1: ( ( ( rule__BoolLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6573:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6573:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6574:1: ( rule__BoolLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6575:1: ( rule__BoolLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6575:2: rule__BoolLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl13397);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6589:1: rule__NumLiteral__Group__0 : rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 ;
    public final void rule__NumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6593:1: ( rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6594:2: rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__013431);
            rule__NumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__013434);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6601:1: rule__NumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6605:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6606:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6606:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6607:1: ()
            {
             before(grammarAccess.getNumLiteralAccess().getNumLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6608:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6610:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6620:1: rule__NumLiteral__Group__1 : rule__NumLiteral__Group__1__Impl ;
    public final void rule__NumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6624:1: ( rule__NumLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6625:2: rule__NumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__113492);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6631:1: rule__NumLiteral__Group__1__Impl : ( ( rule__NumLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6635:1: ( ( ( rule__NumLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6636:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6636:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6637:1: ( rule__NumLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6638:1: ( rule__NumLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6638:2: rule__NumLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl13519);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6652:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6656:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6657:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013553);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013556);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6664:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6668:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6669:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6669:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6670:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6671:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6673:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6683:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6687:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6688:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113614);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6694:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6698:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6699:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6699:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6700:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6701:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6701:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13641);
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


    // $ANTLR start "rule__Document__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6716:1: rule__Document__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6720:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6721:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6721:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6722:1: RULE_ID
            {
             before(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113680); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6731:1: rule__Document__ElementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Document__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6735:1: ( ( ruleStatement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6736:1: ( ruleStatement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6736:1: ( ruleStatement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6737:1: ruleStatement
            {
             before(grammarAccess.getDocumentAccess().getElementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_213711);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6746:1: rule__Document__StaAssignment_3 : ( ruleState ) ;
    public final void rule__Document__StaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6750:1: ( ( ruleState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6751:1: ( ruleState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6751:1: ( ruleState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6752:1: ruleState
            {
             before(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Document__StaAssignment_313742);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6761:1: rule__Statement__ComAssignment_4 : ( RULE_ML_COMMENT ) ;
    public final void rule__Statement__ComAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6765:1: ( ( RULE_ML_COMMENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6766:1: ( RULE_ML_COMMENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6766:1: ( RULE_ML_COMMENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6767:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_413773); 
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


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6776:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6780:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6781:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6781:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6782:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_113804); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__TimesAssignment_2_1"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6791:1: rule__State__TimesAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__State__TimesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6795:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6796:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6796:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6797:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimesAssignment_2_113835); 
             after(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TimesAssignment_2_1"


    // $ANTLR start "rule__State__StmsAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6806:1: rule__State__StmsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__State__StmsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6810:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6811:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6811:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6812:1: ruleAbstractElement
            {
             before(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_413866);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StmsAssignment_4"


    // $ANTLR start "rule__Call__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6821:1: rule__Call__NameAssignment_0 : ( ( 'Call' ) ) ;
    public final void rule__Call__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6825:1: ( ( ( 'Call' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6826:1: ( ( 'Call' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6826:1: ( ( 'Call' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6827:1: ( 'Call' )
            {
             before(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6828:1: ( 'Call' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6829:1: 'Call'
            {
             before(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Call__NameAssignment_013902); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6844:1: rule__Call__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Call__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6848:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6849:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6849:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6850:1: ruleConcatenationExpression
            {
             before(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_113941);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6859:1: rule__Dial__NameAssignment_0 : ( ( 'DialTo' ) ) ;
    public final void rule__Dial__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6863:1: ( ( ( 'DialTo' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6864:1: ( ( 'DialTo' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6864:1: ( ( 'DialTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6865:1: ( 'DialTo' )
            {
             before(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6866:1: ( 'DialTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6867:1: 'DialTo'
            {
             before(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Dial__NameAssignment_013977); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6882:1: rule__Dial__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Dial__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6886:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6887:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6887:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6888:1: ruleConcatenationExpression
            {
             before(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_114016);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6897:1: rule__Play__NameAssignment_0 : ( ( 'Play' ) ) ;
    public final void rule__Play__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6901:1: ( ( ( 'Play' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6902:1: ( ( 'Play' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6902:1: ( ( 'Play' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6903:1: ( 'Play' )
            {
             before(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6904:1: ( 'Play' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6905:1: 'Play'
            {
             before(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Play__NameAssignment_014052); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6920:1: rule__Play__FileAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Play__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6924:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6925:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6925:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6926:1: ruleConcatenationExpression
            {
             before(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_114091);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6935:1: rule__Record__NameAssignment_0 : ( ( 'Record' ) ) ;
    public final void rule__Record__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6939:1: ( ( ( 'Record' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6940:1: ( ( 'Record' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6940:1: ( ( 'Record' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6941:1: ( 'Record' )
            {
             before(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6942:1: ( 'Record' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6943:1: 'Record'
            {
             before(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Record__NameAssignment_014127); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6958:1: rule__Record__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Record__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6962:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6963:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6963:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6964:1: RULE_INT
            {
             before(grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_114166); 
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


    // $ANTLR start "rule__Reject__NameAssignment"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6973:1: rule__Reject__NameAssignment : ( ( 'Reject;' ) ) ;
    public final void rule__Reject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6977:1: ( ( ( 'Reject;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6978:1: ( ( 'Reject;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6978:1: ( ( 'Reject;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6979:1: ( 'Reject;' )
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6980:1: ( 'Reject;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6981:1: 'Reject;'
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Reject__NameAssignment14202); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6996:1: rule__Hangup__NameAssignment : ( ( 'HangUp;' ) ) ;
    public final void rule__Hangup__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7000:1: ( ( ( 'HangUp;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7001:1: ( ( 'HangUp;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7001:1: ( ( 'HangUp;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7002:1: ( 'HangUp;' )
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7003:1: ( 'HangUp;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7004:1: 'HangUp;'
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Hangup__NameAssignment14246); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7019:1: rule__GetDigits__NameAssignment_0 : ( ( 'Get' ) ) ;
    public final void rule__GetDigits__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7023:1: ( ( ( 'Get' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7024:1: ( ( 'Get' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7024:1: ( ( 'Get' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7025:1: ( 'Get' )
            {
             before(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7026:1: ( 'Get' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7027:1: 'Get'
            {
             before(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__GetDigits__NameAssignment_014290); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7042:1: rule__GetDigits__NumDigitsAssignment_1 : ( RULE_INT ) ;
    public final void rule__GetDigits__NumDigitsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7046:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7047:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7047:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7048:1: RULE_INT
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_114329); 
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


    // $ANTLR start "rule__Ask__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7057:1: rule__Ask__NameAssignment_0 : ( ( 'Ask' ) ) ;
    public final void rule__Ask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7061:1: ( ( ( 'Ask' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7062:1: ( ( 'Ask' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7062:1: ( ( 'Ask' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7063:1: ( 'Ask' )
            {
             before(grammarAccess.getAskAccess().getNameAskKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7064:1: ( 'Ask' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7065:1: 'Ask'
            {
             before(grammarAccess.getAskAccess().getNameAskKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Ask__NameAssignment_014365); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7080:1: rule__Ask__QuestionAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Ask__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7084:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7085:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7085:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7086:1: ruleConcatenationExpression
            {
             before(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_114404);
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


    // $ANTLR start "rule__Send__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7095:1: rule__Send__NameAssignment_0 : ( ( 'Send' ) ) ;
    public final void rule__Send__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7099:1: ( ( ( 'Send' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7100:1: ( ( 'Send' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7100:1: ( ( 'Send' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7101:1: ( 'Send' )
            {
             before(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7102:1: ( 'Send' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7103:1: 'Send'
            {
             before(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 
            match(input,52,FOLLOW_52_in_rule__Send__NameAssignment_014440); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7118:1: rule__Send__ParamsAssignment_1 : ( ruleSendBlock ) ;
    public final void rule__Send__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7122:1: ( ( ruleSendBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( ruleSendBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( ruleSendBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7124:1: ruleSendBlock
            {
             before(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114479);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7133:1: rule__Send__UrlAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Send__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7137:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7138:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7138:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7139:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314510);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7148:1: rule__SendBlock__ValueAssignment_2 : ( ruleParam ) ;
    public final void rule__SendBlock__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7152:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7153:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7153:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7154:1: ruleParam
            {
             before(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214541);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7163:1: rule__SendBlock__StmsAssignment_3 : ( ruleNotPrimaryParam ) ;
    public final void rule__SendBlock__StmsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7167:1: ( ( ruleNotPrimaryParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7168:1: ( ruleNotPrimaryParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7168:1: ( ruleNotPrimaryParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7169:1: ruleNotPrimaryParam
            {
             before(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314572);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7178:1: rule__NotPrimaryParam__ValueAssignment_1 : ( ruleParam ) ;
    public final void rule__NotPrimaryParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7182:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7183:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7183:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7184:1: ruleParam
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114603);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7193:1: rule__Param__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7197:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7198:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7198:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7199:1: RULE_STRING
            {
             before(grammarAccess.getParamAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Param__NameAssignment_014634); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7208:1: rule__Param__ValueAssignment_2 : ( ruleConcatenationExpression ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7212:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7213:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7213:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7214:1: ruleConcatenationExpression
            {
             before(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214665);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7223:1: rule__Say__NameAssignment_0 : ( ( 'Say' ) ) ;
    public final void rule__Say__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7227:1: ( ( ( 'Say' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7228:1: ( ( 'Say' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7228:1: ( ( 'Say' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7229:1: ( 'Say' )
            {
             before(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7230:1: ( 'Say' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7231:1: 'Say'
            {
             before(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__Say__NameAssignment_014701); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7246:1: rule__Say__ThatAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Say__ThatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7250:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7251:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7251:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7252:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114740);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7261:1: rule__Sms__NameAssignment_0 : ( ( 'Sms' ) ) ;
    public final void rule__Sms__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7265:1: ( ( ( 'Sms' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7266:1: ( ( 'Sms' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7266:1: ( ( 'Sms' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7267:1: ( 'Sms' )
            {
             before(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7268:1: ( 'Sms' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7269:1: 'Sms'
            {
             before(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 
            match(input,54,FOLLOW_54_in_rule__Sms__NameAssignment_014776); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7284:1: rule__Sms__ValueAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Sms__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7288:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7289:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7289:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7290:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Sms__ValueAssignment_114815);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7299:1: rule__Sms__ToAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Sms__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7303:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7304:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7304:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7305:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Sms__ToAssignment_314846);
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


    // $ANTLR start "rule__Email__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7314:1: rule__Email__NameAssignment_0 : ( ( 'Email' ) ) ;
    public final void rule__Email__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7318:1: ( ( ( 'Email' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7319:1: ( ( 'Email' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7319:1: ( ( 'Email' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7320:1: ( 'Email' )
            {
             before(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7321:1: ( 'Email' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7322:1: 'Email'
            {
             before(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__Email__NameAssignment_014882); 
             after(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0()); 

            }

             after(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__NameAssignment_0"


    // $ANTLR start "rule__Email__TitleAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7337:1: rule__Email__TitleAssignment_4 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7341:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7342:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7342:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7343:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__TitleAssignment_414921);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__TitleAssignment_4"


    // $ANTLR start "rule__Email__FromAssignment_8"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7352:1: rule__Email__FromAssignment_8 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__FromAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7356:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7357:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7357:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7358:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__FromAssignment_814952);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__FromAssignment_8"


    // $ANTLR start "rule__Email__ValueAssignment_12"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7367:1: rule__Email__ValueAssignment_12 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__ValueAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7371:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7372:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7372:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7373:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__ValueAssignment_1214983);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__ValueAssignment_12"


    // $ANTLR start "rule__Email__ToAssignment_15"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7382:1: rule__Email__ToAssignment_15 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__ToAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7386:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7387:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7387:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7388:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__ToAssignment_1515014);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__ToAssignment_15"


    // $ANTLR start "rule__Transition__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7397:1: rule__Transition__NameAssignment_0 : ( ( 'GoTo' ) ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7401:1: ( ( ( 'GoTo' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7402:1: ( ( 'GoTo' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7402:1: ( ( 'GoTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7403:1: ( 'GoTo' )
            {
             before(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7404:1: ( 'GoTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7405:1: 'GoTo'
            {
             before(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 
            match(input,56,FOLLOW_56_in_rule__Transition__NameAssignment_015050); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7420:1: rule__Transition__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7424:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7425:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7425:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7426:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7427:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7428:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_115093); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7439:1: rule__Transition__EventAssignment_3 : ( ruleEVENT ) ;
    public final void rule__Transition__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7443:1: ( ( ruleEVENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7444:1: ( ruleEVENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7444:1: ( ruleEVENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7445:1: ruleEVENT
            {
             before(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEVENT_in_rule__Transition__EventAssignment_315128);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7454:1: rule__IfExp__BlockAssignment_0 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7458:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7459:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7459:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7460:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_015159);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7469:1: rule__IfExp__BlocksAssignment_1_1 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlocksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7473:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7474:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7474:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7475:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_115190);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7484:1: rule__IfExp__DefaultBlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__IfExp__DefaultBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7488:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7489:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7489:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7490:1: ruleBlock
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_115221);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7499:1: rule__CondBlock__CondAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__CondBlock__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7503:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7504:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7504:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7505:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_115252);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7514:1: rule__CondBlock__ActionAssignment_2 : ( ruleBlock ) ;
    public final void rule__CondBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7518:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7519:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7519:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7520:1: ruleBlock
            {
             before(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_215283);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7529:1: rule__Block__StaAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Block__StaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7533:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7534:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7534:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7535:1: ruleAbstractElement
            {
             before(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_215314);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7544:1: rule__BoolExpression__OpAssignment_1_1 : ( RULE_LOGIC_WORD ) ;
    public final void rule__BoolExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7548:1: ( ( RULE_LOGIC_WORD ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7549:1: ( RULE_LOGIC_WORD )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7549:1: ( RULE_LOGIC_WORD )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7550:1: RULE_LOGIC_WORD
            {
             before(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 
            match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_115345); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7559:1: rule__BoolExpression__RightAssignment_1_2 : ( ruleBoolExpression ) ;
    public final void rule__BoolExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7563:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7564:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7564:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7565:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_215376);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7574:1: rule__Brackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__Brackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7578:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7579:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7579:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7580:1: RULE_OBRACKET
            {
             before(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_015407); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7589:1: rule__Brackets__ObjAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__Brackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7593:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7594:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7594:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7595:1: ruleBoolExpression
            {
             before(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_115438);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7604:1: rule__Brackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__Brackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7608:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7609:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7609:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7610:1: RULE_CBRACKET
            {
             before(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_215469); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7619:1: rule__CompareExpression__LeftAssignment_0 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7623:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7624:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7624:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7625:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_015500);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7634:1: rule__CompareExpression__OpAssignment_1 : ( RULE_COMPARE ) ;
    public final void rule__CompareExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7638:1: ( ( RULE_COMPARE ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7639:1: ( RULE_COMPARE )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7639:1: ( RULE_COMPARE )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7640:1: RULE_COMPARE
            {
             before(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 
            match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115531); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7649:1: rule__CompareExpression__RightAssignment_2 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7653:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7654:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7654:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7655:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215562);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7664:1: rule__NegExpression__OpAssignment_0 : ( RULE_NEGATION ) ;
    public final void rule__NegExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7668:1: ( ( RULE_NEGATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7669:1: ( RULE_NEGATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7669:1: ( RULE_NEGATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7670:1: RULE_NEGATION
            {
             before(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 
            match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015593); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7679:1: rule__NegExpression__ObjAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__NegExpression__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7683:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7684:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7684:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7685:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115624);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7694:1: rule__MathExpression__OpAssignment_1_1 : ( RULE_MATH ) ;
    public final void rule__MathExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7698:1: ( ( RULE_MATH ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7699:1: ( RULE_MATH )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7699:1: ( RULE_MATH )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7700:1: RULE_MATH
            {
             before(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 
            match(input,RULE_MATH,FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115655); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7709:1: rule__MathExpression__RightAssignment_1_2 : ( ruleMathExpression ) ;
    public final void rule__MathExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7713:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7714:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7714:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7715:1: ruleMathExpression
            {
             before(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215686);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7724:1: rule__MathBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__MathBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7728:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7729:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7729:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7730:1: RULE_OBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015717); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7739:1: rule__MathBrackets__ObjAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__MathBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7743:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7744:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7744:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7745:1: ruleMathExpression
            {
             before(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115748);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7754:1: rule__MathBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__MathBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7758:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7759:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7759:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7760:1: RULE_CBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215779); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7769:1: rule__ConcatenationExpression__OpAssignment_1_1 : ( RULE_CONCATENATION ) ;
    public final void rule__ConcatenationExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7773:1: ( ( RULE_CONCATENATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7774:1: ( RULE_CONCATENATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7774:1: ( RULE_CONCATENATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7775:1: RULE_CONCATENATION
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0()); 
            match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_115810); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7784:1: rule__ConcatenationExpression__RightAssignment_1_2 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7788:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7789:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7789:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7790:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215841);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7799:1: rule__ConcatenationBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__ConcatenationBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7803:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7804:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7804:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7805:1: RULE_OBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015872); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7814:1: rule__ConcatenationBrackets__ObjAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7818:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7819:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7819:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7820:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_115903);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7829:1: rule__ConcatenationBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__ConcatenationBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7833:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7834:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7834:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7835:1: RULE_CBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_215934); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7844:1: rule__StringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7848:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7849:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7849:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7850:1: RULE_ID
            {
             before(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_115965); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7859:1: rule__StringVariable__ValueAssignment_2_1 : ( ruleConcatenationExpression ) ;
    public final void rule__StringVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7863:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7864:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7864:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7865:1: ruleConcatenationExpression
            {
             before(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_115996);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7874:1: rule__NumVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7878:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7879:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7879:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7880:1: RULE_ID
            {
             before(grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_116027); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7889:1: rule__NumVariable__ValueAssignment_2_1 : ( ruleMathExpression ) ;
    public final void rule__NumVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7893:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7894:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7894:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7895:1: ruleMathExpression
            {
             before(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_116058);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7904:1: rule__BoolVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BoolVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7908:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7909:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7909:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7910:1: RULE_ID
            {
             before(grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_116089); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7919:1: rule__BoolVariable__ValueAssignment_2_1 : ( ruleBoolExpression ) ;
    public final void rule__BoolVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7923:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7924:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7924:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7925:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_116120);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7934:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7938:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7939:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7939:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7940:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_116151); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7949:1: rule__Constant__ValueAssignment_3 : ( rulePrimitive ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7953:1: ( ( rulePrimitive ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7954:1: ( rulePrimitive )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7954:1: ( rulePrimitive )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7955:1: rulePrimitive
            {
             before(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Constant__ValueAssignment_316182);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7964:1: rule__Literal__VAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Literal__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7968:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7969:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7969:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7970:1: ( RULE_ID )
            {
             before(grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7971:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7972:1: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getVVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Literal__VAssignment_016217); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7983:1: rule__Literal__NulAssignment_1 : ( RULE_NULL ) ;
    public final void rule__Literal__NulAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7987:1: ( ( RULE_NULL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7988:1: ( RULE_NULL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7988:1: ( RULE_NULL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7989:1: RULE_NULL
            {
             before(grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 
            match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_116252); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7998:1: rule__BoolLiteral__ValueAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__BoolLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8002:1: ( ( RULE_BOOL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8003:1: ( RULE_BOOL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8003:1: ( RULE_BOOL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8004:1: RULE_BOOL
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_116283); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8013:1: rule__NumLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8017:1: ( ( ruleNumber ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8018:1: ( ruleNumber )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8018:1: ( ruleNumber )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8019:1: ruleNumber
            {
             before(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_116314);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8028:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8032:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8033:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8033:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8034:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116345); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8043:1: rule__EVENT__NameAssignment_0 : ( ( 'HANGUP' ) ) ;
    public final void rule__EVENT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8047:1: ( ( ( 'HANGUP' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8048:1: ( ( 'HANGUP' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8048:1: ( ( 'HANGUP' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8049:1: ( 'HANGUP' )
            {
             before(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8050:1: ( 'HANGUP' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8051:1: 'HANGUP'
            {
             before(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__EVENT__NameAssignment_016381); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8066:1: rule__EVENT__NameAssignment_1 : ( ( 'COMPLETED' ) ) ;
    public final void rule__EVENT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8070:1: ( ( ( 'COMPLETED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8071:1: ( ( 'COMPLETED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8071:1: ( ( 'COMPLETED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8072:1: ( 'COMPLETED' )
            {
             before(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8073:1: ( 'COMPLETED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8074:1: 'COMPLETED'
            {
             before(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__EVENT__NameAssignment_116425); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8089:1: rule__EVENT__NameAssignment_2 : ( ( 'ERROR' ) ) ;
    public final void rule__EVENT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8093:1: ( ( ( 'ERROR' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8094:1: ( ( 'ERROR' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8094:1: ( ( 'ERROR' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8095:1: ( 'ERROR' )
            {
             before(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8096:1: ( 'ERROR' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8097:1: 'ERROR'
            {
             before(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__EVENT__NameAssignment_216469); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8112:1: rule__EVENT__NameAssignment_3 : ( ( 'TIMES' ) ) ;
    public final void rule__EVENT__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8116:1: ( ( ( 'TIMES' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8117:1: ( ( 'TIMES' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8117:1: ( ( 'TIMES' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8118:1: ( 'TIMES' )
            {
             before(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8119:1: ( 'TIMES' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8120:1: 'TIMES'
            {
             before(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 
            match(input,60,FOLLOW_60_in_rule__EVENT__NameAssignment_316513); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8135:1: rule__EVENT__NameAssignment_4 : ( ( 'TIMEOUT' ) ) ;
    public final void rule__EVENT__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8139:1: ( ( ( 'TIMEOUT' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8140:1: ( ( 'TIMEOUT' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8140:1: ( ( 'TIMEOUT' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8141:1: ( 'TIMEOUT' )
            {
             before(grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8142:1: ( 'TIMEOUT' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8143:1: 'TIMEOUT'
            {
             before(grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0()); 
            match(input,61,FOLLOW_61_in_rule__EVENT__NameAssignment_416557); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8158:1: rule__SESSION__NameAssignment_0 : ( ( 'CALLER' ) ) ;
    public final void rule__SESSION__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8162:1: ( ( ( 'CALLER' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8163:1: ( ( 'CALLER' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8163:1: ( ( 'CALLER' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8164:1: ( 'CALLER' )
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8165:1: ( 'CALLER' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8166:1: 'CALLER'
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 
            match(input,62,FOLLOW_62_in_rule__SESSION__NameAssignment_016601); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8181:1: rule__SESSION__NameAssignment_1 : ( ( 'LASTSTATE' ) ) ;
    public final void rule__SESSION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8185:1: ( ( ( 'LASTSTATE' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8186:1: ( ( 'LASTSTATE' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8186:1: ( ( 'LASTSTATE' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8187:1: ( 'LASTSTATE' )
            {
             before(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8188:1: ( 'LASTSTATE' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8189:1: 'LASTSTATE'
            {
             before(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 
            match(input,63,FOLLOW_63_in_rule__SESSION__NameAssignment_116645); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8204:1: rule__SESSION__NameAssignment_2 : ( ( 'TIME' ) ) ;
    public final void rule__SESSION__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8208:1: ( ( ( 'TIME' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8209:1: ( ( 'TIME' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8209:1: ( ( 'TIME' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8210:1: ( 'TIME' )
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8211:1: ( 'TIME' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8212:1: 'TIME'
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0()); 
            match(input,64,FOLLOW_64_in_rule__SESSION__NameAssignment_216689); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8227:1: rule__SESSION__NameAssignment_3 : ( ( 'CALLED' ) ) ;
    public final void rule__SESSION__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8231:1: ( ( ( 'CALLED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8232:1: ( ( 'CALLED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8232:1: ( ( 'CALLED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8233:1: ( 'CALLED' )
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8234:1: ( 'CALLED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8235:1: 'CALLED'
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0()); 
            match(input,65,FOLLOW_65_in_rule__SESSION__NameAssignment_316733); 
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


    // $ANTLR start "rule__SESSION__NameAssignment_4"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8250:1: rule__SESSION__NameAssignment_4 : ( ( 'ANSWER' ) ) ;
    public final void rule__SESSION__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8254:1: ( ( ( 'ANSWER' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8255:1: ( ( 'ANSWER' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8255:1: ( ( 'ANSWER' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8256:1: ( 'ANSWER' )
            {
             before(grammarAccess.getSESSIONAccess().getNameANSWERKeyword_4_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8257:1: ( 'ANSWER' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8258:1: 'ANSWER'
            {
             before(grammarAccess.getSESSIONAccess().getNameANSWERKeyword_4_0()); 
            match(input,66,FOLLOW_66_in_rule__SESSION__NameAssignment_416777); 
             after(grammarAccess.getSESSIONAccess().getNameANSWERKeyword_4_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameANSWERKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_4"


    // $ANTLR start "rule__SESSION__NameAssignment_5"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8273:1: rule__SESSION__NameAssignment_5 : ( ( 'DIGITS' ) ) ;
    public final void rule__SESSION__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8277:1: ( ( ( 'DIGITS' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8278:1: ( ( 'DIGITS' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8278:1: ( ( 'DIGITS' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8279:1: ( 'DIGITS' )
            {
             before(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_5_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8280:1: ( 'DIGITS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8281:1: 'DIGITS'
            {
             before(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_5_0()); 
            match(input,67,FOLLOW_67_in_rule__SESSION__NameAssignment_516821); 
             after(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_5_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_5"


    // $ANTLR start "rule__SESSION__NameAssignment_6"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8296:1: rule__SESSION__NameAssignment_6 : ( ( 'RECORD' ) ) ;
    public final void rule__SESSION__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8300:1: ( ( ( 'RECORD' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8301:1: ( ( 'RECORD' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8301:1: ( ( 'RECORD' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8302:1: ( 'RECORD' )
            {
             before(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_6_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8303:1: ( 'RECORD' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8304:1: 'RECORD'
            {
             before(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_6_0()); 
            match(input,68,FOLLOW_68_in_rule__SESSION__NameAssignment_616865); 
             after(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_6_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_6"


    // $ANTLR start "rule__SESSION__NameAssignment_7"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8319:1: rule__SESSION__NameAssignment_7 : ( ( 'TIMES' ) ) ;
    public final void rule__SESSION__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8323:1: ( ( ( 'TIMES' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8324:1: ( ( 'TIMES' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8324:1: ( ( 'TIMES' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8325:1: ( 'TIMES' )
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_7_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8326:1: ( 'TIMES' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8327:1: 'TIMES'
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_7_0()); 
            match(input,60,FOLLOW_60_in_rule__SESSION__NameAssignment_716909); 
             after(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_7_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SESSION__NameAssignment_7"


    // $ANTLR start "rule__CALLSTATUS__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8342:1: rule__CALLSTATUS__NameAssignment_0 : ( ( 'RINGING' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8346:1: ( ( ( 'RINGING' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8347:1: ( ( 'RINGING' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8347:1: ( ( 'RINGING' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8348:1: ( 'RINGING' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8349:1: ( 'RINGING' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8350:1: 'RINGING'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 
            match(input,69,FOLLOW_69_in_rule__CALLSTATUS__NameAssignment_016953); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8365:1: rule__CALLSTATUS__NameAssignment_1 : ( ( 'IN-PROGRESS' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8369:1: ( ( ( 'IN-PROGRESS' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8370:1: ( ( 'IN-PROGRESS' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8370:1: ( ( 'IN-PROGRESS' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8371:1: ( 'IN-PROGRESS' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8372:1: ( 'IN-PROGRESS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8373:1: 'IN-PROGRESS'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 
            match(input,70,FOLLOW_70_in_rule__CALLSTATUS__NameAssignment_116997); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8388:1: rule__CALLSTATUS__NameAssignment_2 : ( ( 'DISCONNECTED' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8392:1: ( ( ( 'DISCONNECTED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:1: ( ( 'DISCONNECTED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8393:1: ( ( 'DISCONNECTED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8394:1: ( 'DISCONNECTED' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8395:1: ( 'DISCONNECTED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8396:1: 'DISCONNECTED'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 
            match(input,71,FOLLOW_71_in_rule__CALLSTATUS__NameAssignment_217041); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8411:1: rule__CALLSTATUS__NameAssignment_3 : ( ( 'FAILED' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8415:1: ( ( ( 'FAILED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8416:1: ( ( 'FAILED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8416:1: ( ( 'FAILED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8417:1: ( 'FAILED' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8418:1: ( 'FAILED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8419:1: 'FAILED'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 
            match(input,72,FOLLOW_72_in_rule__CALLSTATUS__NameAssignment_317085); 
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
        "\22\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\20\12\21\6\uffff";
    static final String DFA4_minS =
        "\1\4\13\11\6\uffff";
    static final String DFA4_maxS =
        "\1\110\13\34\6\uffff";
    static final String DFA4_acceptS =
        "\14\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA4_specialS =
        "\22\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\14\1\2\1\uffff\1\14\1\uffff\1\16\2\uffff\1\15\2\uffff\1\3"+
            "\1\1\52\uffff\1\13\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\4"+
            "\17",
            "\1\20\1\uffff\1\20\1\14\14\uffff\1\20\2\uffff\1\20",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\1\14\14\uffff\1\21\2\uffff\1\21",
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
            return "1590:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) );";
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
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState274 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleEmail_in_entryRuleEmail1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmail1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__0_in_ruleEmail1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive2401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive2434 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT2823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__Alternatives_in_ruleEVENT2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__Alternatives_in_ruleSESSION2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS2943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__Alternatives_in_ruleCALLSTATUS2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Statement__Alternatives3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ComAssignment_4_in_rule__Statement__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_rule__AbstractElement__Alternatives3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_rule__VoiceTag__Alternatives3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_rule__VoiceTag__Alternatives3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_rule__VoiceTag__Alternatives3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_rule__TerminalBoolExpression__Alternatives3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringVariable__Alternatives_2_03648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringVariable__Alternatives_2_03668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NumVariable__Alternatives_2_03703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NumVariable__Alternatives_2_03723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BoolVariable__Alternatives_2_03758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BoolVariable__Alternatives_2_03778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constant__Alternatives_23813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constant__Alternatives_23833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Primitive__Alternatives3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__Primitive__Alternatives3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__Primitive__Alternatives3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__LiteralAbs__Alternatives3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_rule__Literal__Alternatives4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_0_in_rule__EVENT__Alternatives4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_1_in_rule__EVENT__Alternatives4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_2_in_rule__EVENT__Alternatives4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_3_in_rule__EVENT__Alternatives4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_4_in_rule__EVENT__Alternatives4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_0_in_rule__SESSION__Alternatives4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_1_in_rule__SESSION__Alternatives4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_2_in_rule__SESSION__Alternatives4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_3_in_rule__SESSION__Alternatives4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_4_in_rule__SESSION__Alternatives4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_5_in_rule__SESSION__Alternatives4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_6_in_rule__SESSION__Alternatives4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_7_in_rule__SESSION__Alternatives4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_0_in_rule__CALLSTATUS__Alternatives4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_1_in_rule__CALLSTATUS__Alternatives4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_2_in_rule__CALLSTATUS__Alternatives4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_3_in_rule__CALLSTATUS__Alternatives4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__04449 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__04452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Document__Group__0__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__14511 = new BitSet(new long[]{0x00000F0001000080L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__14514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__24571 = new BitSet(new long[]{0x00000F0001000080L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__24574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl4601 = new BitSet(new long[]{0x00000F0000000082L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__34632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl4659 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__04698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__04701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group__0__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__14760 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__14763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__24820 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__24823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__34881 = new BitSet(new long[]{0x01FFFF8004000080L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__34884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group__3__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44943 = new BitSet(new long[]{0x01FFFF8004000080L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__44946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StmsAssignment_4_in_rule__State__Group__4__Impl4973 = new BitSet(new long[]{0x01FFFF8000000082L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__55004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group__5__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__05075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__05078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_2__0__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimesAssignment_2_1_in_rule__State__Group_2__1__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05198 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15258 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Call__Group__2__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__05383 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__05386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__NameAssignment_0_in_rule__Dial__Group__0__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__15443 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__15446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__25503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Dial__Group__2__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__05568 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Play__Group__1_in_rule__Play__Group__05571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__NameAssignment_0_in_rule__Play__Group__0__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__15628 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Play__Group__2_in_rule__Play__Group__15631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__25688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Play__Group__2__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__NameAssignment_0_in_rule__Record__Group__0__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15813 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25873 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Record__Group__2__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Record__Group__3__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__06002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__06005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NameAssignment_0_in_rule__GetDigits__Group__0__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__16062 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__16065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__26122 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__26125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GetDigits__Group__2__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__36184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GetDigits__Group__3__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__0__Impl_in_rule__Ask__Group__06251 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Ask__Group__1_in_rule__Ask__Group__06254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__NameAssignment_0_in_rule__Ask__Group__0__Impl6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__1__Impl_in_rule__Ask__Group__16311 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Ask__Group__2_in_rule__Ask__Group__16314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__QuestionAssignment_1_in_rule__Ask__Group__1__Impl6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ask__Group__2__Impl_in_rule__Ask__Group__26371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Ask__Group__2__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06436 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__NameAssignment_0_in_rule__Send__Group__0__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16496 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26556 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Send__Group__2__Impl6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36618 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Send__Group__4__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06747 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16808 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SendBlock__Group__1__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26870 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36930 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6960 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__46991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SendBlock__Group__4__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__07060 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__07063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__NotPrimaryParam__Group__0__Impl7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__17122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07183 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_0_in_rule__Param__Group__0__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17243 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Param__Group__1__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07368 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__NameAssignment_0_in_rule__Say__Group__0__Impl7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17428 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Say__Group__2__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__0__Impl_in_rule__Sms__Group__07553 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Sms__Group__1_in_rule__Sms__Group__07556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__NameAssignment_0_in_rule__Sms__Group__0__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__1__Impl_in_rule__Sms__Group__17613 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Sms__Group__2_in_rule__Sms__Group__17616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__ValueAssignment_1_in_rule__Sms__Group__1__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__2__Impl_in_rule__Sms__Group__27673 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Sms__Group__3_in_rule__Sms__Group__27676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Sms__Group__2__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__3__Impl_in_rule__Sms__Group__37735 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Sms__Group__4_in_rule__Sms__Group__37738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__ToAssignment_3_in_rule__Sms__Group__3__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__4__Impl_in_rule__Sms__Group__47795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Sms__Group__4__Impl7823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__0__Impl_in_rule__Email__Group__07864 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Email__Group__1_in_rule__Email__Group__07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__NameAssignment_0_in_rule__Email__Group__0__Impl7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__1__Impl_in_rule__Email__Group__17924 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Email__Group__2_in_rule__Email__Group__17927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Email__Group__1__Impl7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__2__Impl_in_rule__Email__Group__27986 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Email__Group__3_in_rule__Email__Group__27989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Email__Group__2__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__3__Impl_in_rule__Email__Group__38048 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Email__Group__4_in_rule__Email__Group__38051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Email__Group__3__Impl8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__4__Impl_in_rule__Email__Group__48110 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Email__Group__5_in_rule__Email__Group__48113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__TitleAssignment_4_in_rule__Email__Group__4__Impl8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__5__Impl_in_rule__Email__Group__58170 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Email__Group__6_in_rule__Email__Group__58173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Email__Group__5__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__6__Impl_in_rule__Email__Group__68232 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Email__Group__7_in_rule__Email__Group__68235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Email__Group__6__Impl8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__7__Impl_in_rule__Email__Group__78294 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Email__Group__8_in_rule__Email__Group__78297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Email__Group__7__Impl8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__8__Impl_in_rule__Email__Group__88356 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Email__Group__9_in_rule__Email__Group__88359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__FromAssignment_8_in_rule__Email__Group__8__Impl8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__9__Impl_in_rule__Email__Group__98416 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Email__Group__10_in_rule__Email__Group__98419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Email__Group__9__Impl8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__10__Impl_in_rule__Email__Group__108478 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Email__Group__11_in_rule__Email__Group__108481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Email__Group__10__Impl8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__11__Impl_in_rule__Email__Group__118540 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Email__Group__12_in_rule__Email__Group__118543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Email__Group__11__Impl8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__12__Impl_in_rule__Email__Group__128602 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Email__Group__13_in_rule__Email__Group__128605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__ValueAssignment_12_in_rule__Email__Group__12__Impl8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__13__Impl_in_rule__Email__Group__138662 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Email__Group__14_in_rule__Email__Group__138665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Email__Group__13__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__14__Impl_in_rule__Email__Group__148724 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Email__Group__15_in_rule__Email__Group__148727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Email__Group__14__Impl8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__15__Impl_in_rule__Email__Group__158786 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Email__Group__16_in_rule__Email__Group__158789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__ToAssignment_15_in_rule__Email__Group__15__Impl8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__16__Impl_in_rule__Email__Group__168846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Email__Group__16__Impl8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__08939 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__08942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18999 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__19002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__29059 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__29062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Transition__Group__2__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__39121 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__39124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__49181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Transition__Group__4__Impl9209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__09250 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__09253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__19310 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__19313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl9340 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__29371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__09435 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__09438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfExp__Group_1__0__Impl9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__19497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__09558 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__09561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfExp__Group_2__0__Impl9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__19620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl9647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__09681 = new BitSet(new long[]{0xD000000000032570L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__09684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CondBlock__Group__0__Impl9712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__19743 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__19746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__29803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl9830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09866 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19927 = new BitSet(new long[]{0x01FFFF8004000080L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Block__Group__1__Impl9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29989 = new BitSet(new long[]{0x01FFFF8004000080L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl10019 = new BitSet(new long[]{0x01FFFF8000000082L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__310050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Block__Group__3__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__010117 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__010120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__110176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__010238 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__010241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__110299 = new BitSet(new long[]{0xD000000000032570L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__110302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__210359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl10386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__010422 = new BitSet(new long[]{0xD000000000032570L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__010425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl10452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__110482 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__110485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110665 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010788 = new BitSet(new long[]{0xD000000000032570L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010909 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__011030 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__011033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__111091 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__111094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__211151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__011214 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__011217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__111274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__111277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl11304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__211334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__011397 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__011400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__111456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011518 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111579 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011702 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111762 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StringVariable__Group__0__Impl11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111947 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__212007 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__212010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl12037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__312068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringVariable__Group__3__Impl12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__012135 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__012138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Alternatives_2_0_in_rule__StringVariable__Group_2__0__Impl12165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__112195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__012256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__012259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NumVariable__Group__0__Impl12287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__112318 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__112321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__212378 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__212381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl12408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__312439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NumVariable__Group__3__Impl12467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012506 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Alternatives_2_0_in_rule__NumVariable__Group_2__0__Impl12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012627 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__BoolVariable__Group__0__Impl12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112689 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212749 = new BitSet(new long[]{0x0000000010600000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BoolVariable__Group__3__Impl12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012877 = new BitSet(new long[]{0xD000000000032570L,0x00000000000001FFL});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Alternatives_2_0_in_rule__BoolVariable__Group_2__0__Impl12907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__012998 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__013001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Constant__Group__0__Impl13029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__113060 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__113063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__213120 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__213123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_2_in_rule__Constant__Group__2__Impl13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__313180 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__313183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl13210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__413240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constant__Group__4__Impl13268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__013309 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__013312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__113370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__013431 = new BitSet(new long[]{0xD000000000030570L,0x000000000000001FL});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__013434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__113492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013553 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_213711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Document__StaAssignment_313742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_413773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_113804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimesAssignment_2_113835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_413866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Call__NameAssignment_013902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_113941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Dial__NameAssignment_013977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_114016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Play__NameAssignment_014052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_114091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Record__NameAssignment_014127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_114166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Reject__NameAssignment14202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Hangup__NameAssignment14246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__GetDigits__NameAssignment_014290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_114329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Ask__NameAssignment_014365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Ask__QuestionAssignment_114404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Send__NameAssignment_014440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Param__NameAssignment_014634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Say__NameAssignment_014701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Sms__NameAssignment_014776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Sms__ValueAssignment_114815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Sms__ToAssignment_314846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Email__NameAssignment_014882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__TitleAssignment_414921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__FromAssignment_814952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__ValueAssignment_1214983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__ToAssignment_1515014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Transition__NameAssignment_015050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_115093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_rule__Transition__EventAssignment_315128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_015159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_115190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_115221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_115252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_215283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_215314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_115345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_215376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_015407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_115438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_215469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_015500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_115810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_115903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_215934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_115965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_115996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_116027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_116058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_116089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_116120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_116151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Constant__ValueAssignment_316182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__VAssignment_016217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_116252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_116283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_116314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EVENT__NameAssignment_016381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EVENT__NameAssignment_116425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EVENT__NameAssignment_216469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EVENT__NameAssignment_316513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__EVENT__NameAssignment_416557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SESSION__NameAssignment_016601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SESSION__NameAssignment_116645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SESSION__NameAssignment_216689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SESSION__NameAssignment_316733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__SESSION__NameAssignment_416777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__SESSION__NameAssignment_516821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__SESSION__NameAssignment_616865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SESSION__NameAssignment_716909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__CALLSTATUS__NameAssignment_016953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__CALLSTATUS__NameAssignment_116997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__CALLSTATUS__NameAssignment_217041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__CALLSTATUS__NameAssignment_317085 = new BitSet(new long[]{0x0000000000000002L});

}