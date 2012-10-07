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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "' = '", "'Application'", "'State'", "'times'", "'{'", "'}'", "'timeout'", "';'", "'seconds'", "'digits'", "'to'", "','", "':'", "'subject'", "'from'", "'message'", "'when'", "'else'", "'if'", "'String'", "'Num'", "'Bool'", "'Const'", "'Call'", "'DialTo'", "'Play'", "'Record'", "'Reject;'", "'HangUp;'", "'Gather'", "'Send'", "'Say'", "'Sms'", "'Email'", "'GoTo'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'CALLER'", "'LASTSTATE'", "'CALLED'", "'DIGITS'", "'RECORD'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
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


    // $ANTLR start "entryRuleSend"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:396:1: entryRuleSend : ruleSend EOF ;
    public final void entryRuleSend() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:397:1: ( ruleSend EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:398:1: ruleSend EOF
            {
             before(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend781);
            ruleSend();

            state._fsp--;

             after(grammarAccess.getSendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend788); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:405:1: ruleSend : ( ( rule__Send__Group__0 ) ) ;
    public final void ruleSend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:409:2: ( ( ( rule__Send__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:410:1: ( ( rule__Send__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:410:1: ( ( rule__Send__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:411:1: ( rule__Send__Group__0 )
            {
             before(grammarAccess.getSendAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:412:1: ( rule__Send__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:412:2: rule__Send__Group__0
            {
            pushFollow(FOLLOW_rule__Send__Group__0_in_ruleSend814);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:424:1: entryRuleSendBlock : ruleSendBlock EOF ;
    public final void entryRuleSendBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:425:1: ( ruleSendBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:426:1: ruleSendBlock EOF
            {
             before(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock841);
            ruleSendBlock();

            state._fsp--;

             after(grammarAccess.getSendBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock848); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:433:1: ruleSendBlock : ( ( rule__SendBlock__Group__0 ) ) ;
    public final void ruleSendBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:437:2: ( ( ( rule__SendBlock__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:438:1: ( ( rule__SendBlock__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:438:1: ( ( rule__SendBlock__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:439:1: ( rule__SendBlock__Group__0 )
            {
             before(grammarAccess.getSendBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:440:1: ( rule__SendBlock__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:440:2: rule__SendBlock__Group__0
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0_in_ruleSendBlock874);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:452:1: entryRuleNotPrimaryParam : ruleNotPrimaryParam EOF ;
    public final void entryRuleNotPrimaryParam() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:453:1: ( ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:454:1: ruleNotPrimaryParam EOF
            {
             before(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam901);
            ruleNotPrimaryParam();

            state._fsp--;

             after(grammarAccess.getNotPrimaryParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam908); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:461:1: ruleNotPrimaryParam : ( ( rule__NotPrimaryParam__Group__0 ) ) ;
    public final void ruleNotPrimaryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:465:2: ( ( ( rule__NotPrimaryParam__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:466:1: ( ( rule__NotPrimaryParam__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:466:1: ( ( rule__NotPrimaryParam__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:467:1: ( rule__NotPrimaryParam__Group__0 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:468:1: ( rule__NotPrimaryParam__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:468:2: rule__NotPrimaryParam__Group__0
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0_in_ruleNotPrimaryParam934);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:480:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:481:1: ( ruleParam EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:482:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam961);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam968); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:489:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:493:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:494:1: ( ( rule__Param__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:494:1: ( ( rule__Param__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:495:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:496:1: ( rule__Param__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:496:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam994);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:508:1: entryRuleSay : ruleSay EOF ;
    public final void entryRuleSay() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:509:1: ( ruleSay EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:510:1: ruleSay EOF
            {
             before(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay1021);
            ruleSay();

            state._fsp--;

             after(grammarAccess.getSayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay1028); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:517:1: ruleSay : ( ( rule__Say__Group__0 ) ) ;
    public final void ruleSay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:521:2: ( ( ( rule__Say__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:522:1: ( ( rule__Say__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:522:1: ( ( rule__Say__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:523:1: ( rule__Say__Group__0 )
            {
             before(grammarAccess.getSayAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:524:1: ( rule__Say__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:524:2: rule__Say__Group__0
            {
            pushFollow(FOLLOW_rule__Say__Group__0_in_ruleSay1054);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:536:1: entryRuleSms : ruleSms EOF ;
    public final void entryRuleSms() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:537:1: ( ruleSms EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:538:1: ruleSms EOF
            {
             before(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_ruleSms_in_entryRuleSms1081);
            ruleSms();

            state._fsp--;

             after(grammarAccess.getSmsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSms1088); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:545:1: ruleSms : ( ( rule__Sms__Group__0 ) ) ;
    public final void ruleSms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:549:2: ( ( ( rule__Sms__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:550:1: ( ( rule__Sms__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:550:1: ( ( rule__Sms__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:551:1: ( rule__Sms__Group__0 )
            {
             before(grammarAccess.getSmsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:552:1: ( rule__Sms__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:552:2: rule__Sms__Group__0
            {
            pushFollow(FOLLOW_rule__Sms__Group__0_in_ruleSms1114);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:564:1: entryRuleEmail : ruleEmail EOF ;
    public final void entryRuleEmail() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:565:1: ( ruleEmail EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:566:1: ruleEmail EOF
            {
             before(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_ruleEmail_in_entryRuleEmail1141);
            ruleEmail();

            state._fsp--;

             after(grammarAccess.getEmailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmail1148); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:573:1: ruleEmail : ( ( rule__Email__Group__0 ) ) ;
    public final void ruleEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:577:2: ( ( ( rule__Email__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:578:1: ( ( rule__Email__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:578:1: ( ( rule__Email__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:579:1: ( rule__Email__Group__0 )
            {
             before(grammarAccess.getEmailAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:580:1: ( rule__Email__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:580:2: rule__Email__Group__0
            {
            pushFollow(FOLLOW_rule__Email__Group__0_in_ruleEmail1174);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:592:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:593:1: ( ruleTransition EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:594:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1201);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1208); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:601:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:605:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:606:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:606:1: ( ( rule__Transition__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:607:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:608:1: ( rule__Transition__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:608:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition1234);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:620:1: entryRuleIfExp : ruleIfExp EOF ;
    public final void entryRuleIfExp() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:621:1: ( ruleIfExp EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:622:1: ruleIfExp EOF
            {
             before(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp1261);
            ruleIfExp();

            state._fsp--;

             after(grammarAccess.getIfExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp1268); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:629:1: ruleIfExp : ( ( rule__IfExp__Group__0 ) ) ;
    public final void ruleIfExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:633:2: ( ( ( rule__IfExp__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__IfExp__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:634:1: ( ( rule__IfExp__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:635:1: ( rule__IfExp__Group__0 )
            {
             before(grammarAccess.getIfExpAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:1: ( rule__IfExp__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:636:2: rule__IfExp__Group__0
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1294);
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


    // $ANTLR start "entryRuleBlock"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:676:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:677:1: ( ruleBlock EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:678:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1381);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1388); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:685:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:689:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:690:1: ( ( rule__Block__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:691:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:1: ( rule__Block__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:692:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1414);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:704:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:705:1: ( ruleBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:706:1: ruleBoolExpression EOF
            {
             before(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1441);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression1448); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:713:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:717:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__BoolExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:718:1: ( ( rule__BoolExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:719:1: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:1: ( rule__BoolExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:720:2: rule__BoolExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1474);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:732:1: entryRuleTerminalBoolExpression : ruleTerminalBoolExpression EOF ;
    public final void entryRuleTerminalBoolExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:733:1: ( ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:734:1: ruleTerminalBoolExpression EOF
            {
             before(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1501);
            ruleTerminalBoolExpression();

            state._fsp--;

             after(grammarAccess.getTerminalBoolExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression1508); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:741:1: ruleTerminalBoolExpression : ( ( rule__TerminalBoolExpression__Alternatives ) ) ;
    public final void ruleTerminalBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:745:2: ( ( ( rule__TerminalBoolExpression__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:746:1: ( ( rule__TerminalBoolExpression__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:747:1: ( rule__TerminalBoolExpression__Alternatives )
            {
             before(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:1: ( rule__TerminalBoolExpression__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:748:2: rule__TerminalBoolExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1534);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:760:1: entryRuleBrackets : ruleBrackets EOF ;
    public final void entryRuleBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:761:1: ( ruleBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:762:1: ruleBrackets EOF
            {
             before(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets1561);
            ruleBrackets();

            state._fsp--;

             after(grammarAccess.getBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets1568); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:769:1: ruleBrackets : ( ( rule__Brackets__Group__0 ) ) ;
    public final void ruleBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:773:2: ( ( ( rule__Brackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__Brackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:774:1: ( ( rule__Brackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:775:1: ( rule__Brackets__Group__0 )
            {
             before(grammarAccess.getBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:1: ( rule__Brackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:776:2: rule__Brackets__Group__0
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1594);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:788:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:789:1: ( ruleCompareExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:790:1: ruleCompareExpression EOF
            {
             before(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1621);
            ruleCompareExpression();

            state._fsp--;

             after(grammarAccess.getCompareExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1628); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:797:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:801:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:802:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:803:1: ( rule__CompareExpression__Group__0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:1: ( rule__CompareExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:804:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1654);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:816:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:817:1: ( ruleNegExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:818:1: ruleNegExpression EOF
            {
             before(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression1681);
            ruleNegExpression();

            state._fsp--;

             after(grammarAccess.getNegExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression1688); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:825:1: ruleNegExpression : ( ( rule__NegExpression__Group__0 ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:829:2: ( ( ( rule__NegExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__NegExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:830:1: ( ( rule__NegExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:831:1: ( rule__NegExpression__Group__0 )
            {
             before(grammarAccess.getNegExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:1: ( rule__NegExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:832:2: rule__NegExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1714);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:844:1: entryRuleMathExpression : ruleMathExpression EOF ;
    public final void entryRuleMathExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:845:1: ( ruleMathExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:846:1: ruleMathExpression EOF
            {
             before(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression1741);
            ruleMathExpression();

            state._fsp--;

             after(grammarAccess.getMathExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression1748); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:853:1: ruleMathExpression : ( ( rule__MathExpression__Group__0 ) ) ;
    public final void ruleMathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:857:2: ( ( ( rule__MathExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__MathExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:858:1: ( ( rule__MathExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:859:1: ( rule__MathExpression__Group__0 )
            {
             before(grammarAccess.getMathExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:1: ( rule__MathExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:860:2: rule__MathExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1774);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:872:1: entryRuleMathTerminal : ruleMathTerminal EOF ;
    public final void entryRuleMathTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:873:1: ( ruleMathTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:874:1: ruleMathTerminal EOF
            {
             before(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1801);
            ruleMathTerminal();

            state._fsp--;

             after(grammarAccess.getMathTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal1808); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:881:1: ruleMathTerminal : ( ( rule__MathTerminal__Alternatives ) ) ;
    public final void ruleMathTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:885:2: ( ( ( rule__MathTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__MathTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:886:1: ( ( rule__MathTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:887:1: ( rule__MathTerminal__Alternatives )
            {
             before(grammarAccess.getMathTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:1: ( rule__MathTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:888:2: rule__MathTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1834);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:900:1: entryRuleMathBrackets : ruleMathBrackets EOF ;
    public final void entryRuleMathBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:901:1: ( ruleMathBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:902:1: ruleMathBrackets EOF
            {
             before(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1861);
            ruleMathBrackets();

            state._fsp--;

             after(grammarAccess.getMathBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets1868); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:909:1: ruleMathBrackets : ( ( rule__MathBrackets__Group__0 ) ) ;
    public final void ruleMathBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:913:2: ( ( ( rule__MathBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__MathBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:914:1: ( ( rule__MathBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:915:1: ( rule__MathBrackets__Group__0 )
            {
             before(grammarAccess.getMathBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:1: ( rule__MathBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:916:2: rule__MathBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1894);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:928:1: entryRuleConcatenationExpression : ruleConcatenationExpression EOF ;
    public final void entryRuleConcatenationExpression() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:929:1: ( ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:930:1: ruleConcatenationExpression EOF
            {
             before(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1921);
            ruleConcatenationExpression();

            state._fsp--;

             after(grammarAccess.getConcatenationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression1928); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:937:1: ruleConcatenationExpression : ( ( rule__ConcatenationExpression__Group__0 ) ) ;
    public final void ruleConcatenationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:941:2: ( ( ( rule__ConcatenationExpression__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:942:1: ( ( rule__ConcatenationExpression__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:943:1: ( rule__ConcatenationExpression__Group__0 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:1: ( rule__ConcatenationExpression__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:944:2: rule__ConcatenationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression1954);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:956:1: entryRuleConcatenationTerminal : ruleConcatenationTerminal EOF ;
    public final void entryRuleConcatenationTerminal() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:957:1: ( ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:958:1: ruleConcatenationTerminal EOF
            {
             before(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal1981);
            ruleConcatenationTerminal();

            state._fsp--;

             after(grammarAccess.getConcatenationTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal1988); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:965:1: ruleConcatenationTerminal : ( ( rule__ConcatenationTerminal__Alternatives ) ) ;
    public final void ruleConcatenationTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:969:2: ( ( ( rule__ConcatenationTerminal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:970:1: ( ( rule__ConcatenationTerminal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:971:1: ( rule__ConcatenationTerminal__Alternatives )
            {
             before(grammarAccess.getConcatenationTerminalAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:1: ( rule__ConcatenationTerminal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:972:2: rule__ConcatenationTerminal__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2014);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:984:1: entryRuleConcatenationBrackets : ruleConcatenationBrackets EOF ;
    public final void entryRuleConcatenationBrackets() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:985:1: ( ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:986:1: ruleConcatenationBrackets EOF
            {
             before(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2041);
            ruleConcatenationBrackets();

            state._fsp--;

             after(grammarAccess.getConcatenationBracketsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets2048); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:993:1: ruleConcatenationBrackets : ( ( rule__ConcatenationBrackets__Group__0 ) ) ;
    public final void ruleConcatenationBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:997:2: ( ( ( rule__ConcatenationBrackets__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:998:1: ( ( rule__ConcatenationBrackets__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:999:1: ( rule__ConcatenationBrackets__Group__0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:1: ( rule__ConcatenationBrackets__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1000:2: rule__ConcatenationBrackets__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2074);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1012:1: entryRuleStringVariable : ruleStringVariable EOF ;
    public final void entryRuleStringVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1013:1: ( ruleStringVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1014:1: ruleStringVariable EOF
            {
             before(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable2101);
            ruleStringVariable();

            state._fsp--;

             after(grammarAccess.getStringVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable2108); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1021:1: ruleStringVariable : ( ( rule__StringVariable__Group__0 ) ) ;
    public final void ruleStringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1025:2: ( ( ( rule__StringVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__StringVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1026:1: ( ( rule__StringVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1027:1: ( rule__StringVariable__Group__0 )
            {
             before(grammarAccess.getStringVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:1: ( rule__StringVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1028:2: rule__StringVariable__Group__0
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2134);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1040:1: entryRuleNumVariable : ruleNumVariable EOF ;
    public final void entryRuleNumVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1041:1: ( ruleNumVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1042:1: ruleNumVariable EOF
            {
             before(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable2161);
            ruleNumVariable();

            state._fsp--;

             after(grammarAccess.getNumVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable2168); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1049:1: ruleNumVariable : ( ( rule__NumVariable__Group__0 ) ) ;
    public final void ruleNumVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1053:2: ( ( ( rule__NumVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__NumVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1054:1: ( ( rule__NumVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1055:1: ( rule__NumVariable__Group__0 )
            {
             before(grammarAccess.getNumVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:1: ( rule__NumVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1056:2: rule__NumVariable__Group__0
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2194);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1068:1: entryRuleBoolVariable : ruleBoolVariable EOF ;
    public final void entryRuleBoolVariable() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1069:1: ( ruleBoolVariable EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1070:1: ruleBoolVariable EOF
            {
             before(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2221);
            ruleBoolVariable();

            state._fsp--;

             after(grammarAccess.getBoolVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable2228); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1077:1: ruleBoolVariable : ( ( rule__BoolVariable__Group__0 ) ) ;
    public final void ruleBoolVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1081:2: ( ( ( rule__BoolVariable__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__BoolVariable__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1082:1: ( ( rule__BoolVariable__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1083:1: ( rule__BoolVariable__Group__0 )
            {
             before(grammarAccess.getBoolVariableAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:1: ( rule__BoolVariable__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1084:2: rule__BoolVariable__Group__0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2254);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1096:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1097:1: ( ruleConstant EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1098:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2281);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2288); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1105:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1109:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1110:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1110:1: ( ( rule__Constant__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1111:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:1: ( rule__Constant__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1112:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant2314);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1124:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1125:1: ( rulePrimitive EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1126:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive2341);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive2348); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1133:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1137:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1138:1: ( ( rule__Primitive__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1138:1: ( ( rule__Primitive__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1139:1: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:1: ( rule__Primitive__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1140:2: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive2374);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1154:1: entryRuleLiteralAbs : ruleLiteralAbs EOF ;
    public final void entryRuleLiteralAbs() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1155:1: ( ruleLiteralAbs EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1156:1: ruleLiteralAbs EOF
            {
             before(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2403);
            ruleLiteralAbs();

            state._fsp--;

             after(grammarAccess.getLiteralAbsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs2410); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1163:1: ruleLiteralAbs : ( ( rule__LiteralAbs__Alternatives ) ) ;
    public final void ruleLiteralAbs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1167:2: ( ( ( rule__LiteralAbs__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:1: ( ( rule__LiteralAbs__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1168:1: ( ( rule__LiteralAbs__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1169:1: ( rule__LiteralAbs__Alternatives )
            {
             before(grammarAccess.getLiteralAbsAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1170:1: ( rule__LiteralAbs__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1170:2: rule__LiteralAbs__Alternatives
            {
            pushFollow(FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2436);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1182:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1183:1: ( ruleLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1184:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2463);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2470); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1191:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1195:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1196:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1196:1: ( ( rule__Literal__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1197:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1198:1: ( rule__Literal__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1198:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2496);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1210:1: entryRuleBoolLiteral : ruleBoolLiteral EOF ;
    public final void entryRuleBoolLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1211:1: ( ruleBoolLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1212:1: ruleBoolLiteral EOF
            {
             before(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2523);
            ruleBoolLiteral();

            state._fsp--;

             after(grammarAccess.getBoolLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral2530); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1219:1: ruleBoolLiteral : ( ( rule__BoolLiteral__Group__0 ) ) ;
    public final void ruleBoolLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1223:2: ( ( ( rule__BoolLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1224:1: ( ( rule__BoolLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1224:1: ( ( rule__BoolLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1225:1: ( rule__BoolLiteral__Group__0 )
            {
             before(grammarAccess.getBoolLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1226:1: ( rule__BoolLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1226:2: rule__BoolLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2556);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1238:1: entryRuleNumLiteral : ruleNumLiteral EOF ;
    public final void entryRuleNumLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1239:1: ( ruleNumLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1240:1: ruleNumLiteral EOF
            {
             before(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2583);
            ruleNumLiteral();

            state._fsp--;

             after(grammarAccess.getNumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral2590); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1247:1: ruleNumLiteral : ( ( rule__NumLiteral__Group__0 ) ) ;
    public final void ruleNumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1251:2: ( ( ( rule__NumLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1252:1: ( ( rule__NumLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1252:1: ( ( rule__NumLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1253:1: ( rule__NumLiteral__Group__0 )
            {
             before(grammarAccess.getNumLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1254:1: ( rule__NumLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1254:2: rule__NumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2616);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1266:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1267:1: ( ruleStringLiteral EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1268:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2643);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2650); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1275:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1279:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1280:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1280:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1281:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1282:1: ( rule__StringLiteral__Group__0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1282:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2676);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1294:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1295:1: ( ruleNumber EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1296:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2703);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2710); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1303:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1307:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1308:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1308:1: ( ( rule__Number__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1309:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1310:1: ( rule__Number__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1310:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber2736);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1322:1: entryRuleEVENT : ruleEVENT EOF ;
    public final void entryRuleEVENT() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1323:1: ( ruleEVENT EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1324:1: ruleEVENT EOF
            {
             before(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT2763);
            ruleEVENT();

            state._fsp--;

             after(grammarAccess.getEVENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT2770); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1331:1: ruleEVENT : ( ( rule__EVENT__Alternatives ) ) ;
    public final void ruleEVENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1335:2: ( ( ( rule__EVENT__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1336:1: ( ( rule__EVENT__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1336:1: ( ( rule__EVENT__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1337:1: ( rule__EVENT__Alternatives )
            {
             before(grammarAccess.getEVENTAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1338:1: ( rule__EVENT__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1338:2: rule__EVENT__Alternatives
            {
            pushFollow(FOLLOW_rule__EVENT__Alternatives_in_ruleEVENT2796);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1350:1: entryRuleSESSION : ruleSESSION EOF ;
    public final void entryRuleSESSION() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1351:1: ( ruleSESSION EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1352:1: ruleSESSION EOF
            {
             before(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION2823);
            ruleSESSION();

            state._fsp--;

             after(grammarAccess.getSESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION2830); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1359:1: ruleSESSION : ( ( rule__SESSION__Alternatives ) ) ;
    public final void ruleSESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1363:2: ( ( ( rule__SESSION__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1364:1: ( ( rule__SESSION__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1364:1: ( ( rule__SESSION__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1365:1: ( rule__SESSION__Alternatives )
            {
             before(grammarAccess.getSESSIONAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1366:1: ( rule__SESSION__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1366:2: rule__SESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__SESSION__Alternatives_in_ruleSESSION2856);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1378:1: entryRuleCALLSTATUS : ruleCALLSTATUS EOF ;
    public final void entryRuleCALLSTATUS() throws RecognitionException {
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1379:1: ( ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1380:1: ruleCALLSTATUS EOF
            {
             before(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS2883);
            ruleCALLSTATUS();

            state._fsp--;

             after(grammarAccess.getCALLSTATUSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS2890); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1387:1: ruleCALLSTATUS : ( ( rule__CALLSTATUS__Alternatives ) ) ;
    public final void ruleCALLSTATUS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1391:2: ( ( ( rule__CALLSTATUS__Alternatives ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1392:1: ( ( rule__CALLSTATUS__Alternatives ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1392:1: ( ( rule__CALLSTATUS__Alternatives ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1393:1: ( rule__CALLSTATUS__Alternatives )
            {
             before(grammarAccess.getCALLSTATUSAccess().getAlternatives()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1394:1: ( rule__CALLSTATUS__Alternatives )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1394:2: rule__CALLSTATUS__Alternatives
            {
            pushFollow(FOLLOW_rule__CALLSTATUS__Alternatives_in_ruleCALLSTATUS2916);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1406:1: rule__Statement__Alternatives : ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleConstant ) | ( ( rule__Statement__ComAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1410:1: ( ( ruleNumVariable ) | ( ruleStringVariable ) | ( ruleBoolVariable ) | ( ruleConstant ) | ( ( rule__Statement__ComAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 43:
                {
                alt1=3;
                }
                break;
            case 44:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1411:1: ( ruleNumVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1411:1: ( ruleNumVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1412:1: ruleNumVariable
                    {
                     before(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2952);
                    ruleNumVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1417:6: ( ruleStringVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1417:6: ( ruleStringVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1418:1: ruleStringVariable
                    {
                     before(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2969);
                    ruleStringVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1423:6: ( ruleBoolVariable )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1423:6: ( ruleBoolVariable )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1424:1: ruleBoolVariable
                    {
                     before(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2986);
                    ruleBoolVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1429:6: ( ruleConstant )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1429:6: ( ruleConstant )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1430:1: ruleConstant
                    {
                     before(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Statement__Alternatives3003);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1435:6: ( ( rule__Statement__ComAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1435:6: ( ( rule__Statement__ComAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1436:1: ( rule__Statement__ComAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getComAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1437:1: ( rule__Statement__ComAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1437:2: rule__Statement__ComAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Statement__ComAssignment_4_in_rule__Statement__Alternatives3020);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1446:1: rule__AbstractElement__Alternatives : ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) | ( ruleVoiceTag ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1450:1: ( ( ruleStatement ) | ( ruleTransition ) | ( ruleIfExp ) | ( ruleVoiceTag ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt2=1;
                }
                break;
            case 56:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1451:1: ( ruleStatement )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1451:1: ( ruleStatement )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1452:1: ruleStatement
                    {
                     before(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives3053);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1457:6: ( ruleTransition )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1457:6: ( ruleTransition )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1458:1: ruleTransition
                    {
                     before(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives3070);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1463:6: ( ruleIfExp )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1463:6: ( ruleIfExp )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1464:1: ruleIfExp
                    {
                     before(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives3087);
                    ruleIfExp();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1469:6: ( ruleVoiceTag )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1469:6: ( ruleVoiceTag )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1470:1: ruleVoiceTag
                    {
                     before(grammarAccess.getAbstractElementAccess().getVoiceTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVoiceTag_in_rule__AbstractElement__Alternatives3104);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1480:1: rule__VoiceTag__Alternatives : ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) | ( ruleSms ) | ( ruleEmail ) );
    public final void rule__VoiceTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1484:1: ( ( ruleSay ) | ( ruleDial ) | ( rulePlay ) | ( ruleRecord ) | ( ruleGetDigits ) | ( ruleSend ) | ( ruleReject ) | ( ruleHangup ) | ( ruleCall ) | ( ruleSms ) | ( ruleEmail ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            case 48:
                {
                alt3=4;
                }
                break;
            case 51:
                {
                alt3=5;
                }
                break;
            case 52:
                {
                alt3=6;
                }
                break;
            case 49:
                {
                alt3=7;
                }
                break;
            case 50:
                {
                alt3=8;
                }
                break;
            case 45:
                {
                alt3=9;
                }
                break;
            case 54:
                {
                alt3=10;
                }
                break;
            case 55:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1485:1: ( ruleSay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1485:1: ( ruleSay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1486:1: ruleSay
                    {
                     before(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3136);
                    ruleSay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1491:6: ( ruleDial )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1491:6: ( ruleDial )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1492:1: ruleDial
                    {
                     before(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3153);
                    ruleDial();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1497:6: ( rulePlay )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1497:6: ( rulePlay )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1498:1: rulePlay
                    {
                     before(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3170);
                    rulePlay();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1503:6: ( ruleRecord )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1503:6: ( ruleRecord )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1504:1: ruleRecord
                    {
                     before(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3187);
                    ruleRecord();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1509:6: ( ruleGetDigits )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1509:6: ( ruleGetDigits )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1510:1: ruleGetDigits
                    {
                     before(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3204);
                    ruleGetDigits();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1515:6: ( ruleSend )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1515:6: ( ruleSend )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1516:1: ruleSend
                    {
                     before(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3221);
                    ruleSend();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1521:6: ( ruleReject )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1521:6: ( ruleReject )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1522:1: ruleReject
                    {
                     before(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3238);
                    ruleReject();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1527:6: ( ruleHangup )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1527:6: ( ruleHangup )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1528:1: ruleHangup
                    {
                     before(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3255);
                    ruleHangup();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1533:6: ( ruleCall )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1533:6: ( ruleCall )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1534:1: ruleCall
                    {
                     before(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives3272);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1539:6: ( ruleSms )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1539:6: ( ruleSms )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1540:1: ruleSms
                    {
                     before(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleSms_in_rule__VoiceTag__Alternatives3289);
                    ruleSms();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1545:6: ( ruleEmail )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1545:6: ( ruleEmail )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1546:1: ruleEmail
                    {
                     before(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleEmail_in_rule__VoiceTag__Alternatives3306);
                    ruleEmail();

                    state._fsp--;

                     after(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_10()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1556:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) );
    public final void rule__TerminalBoolExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1560:1: ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1561:1: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1561:1: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1562:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3338);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:6: ( ruleCompareExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1567:6: ( ruleCompareExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1568:1: ruleCompareExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3355);
                    ruleCompareExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1573:6: ( ruleNegExpression )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1573:6: ( ruleNegExpression )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1574:1: ruleNegExpression
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3372);
                    ruleNegExpression();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1579:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1579:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1580:1: ruleLiteral
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3389);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1585:6: ( ruleBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1585:6: ( ruleBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1586:1: ruleBrackets
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3406);
                    ruleBrackets();

                    state._fsp--;

                     after(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1591:6: ( ruleCALLSTATUS )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1591:6: ( ruleCALLSTATUS )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1592:1: ruleCALLSTATUS
                    {
                     before(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_rule__TerminalBoolExpression__Alternatives3423);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1602:1: rule__MathTerminal__Alternatives : ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) );
    public final void rule__MathTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1606:1: ( ( ruleMathBrackets ) | ( ruleLiteral ) | ( ruleNumLiteral ) )
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
            case 61:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1607:1: ( ruleMathBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1607:1: ( ruleMathBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1608:1: ruleMathBrackets
                    {
                     before(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3455);
                    ruleMathBrackets();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1613:6: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1613:6: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1614:1: ruleLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3472);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1619:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1619:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1620:1: ruleNumLiteral
                    {
                     before(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3489);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1630:1: rule__ConcatenationTerminal__Alternatives : ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) );
    public final void rule__ConcatenationTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1634:1: ( ( ruleConcatenationBrackets ) | ( ruleLiteralAbs ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OBRACKET) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_DOUBLE && LA6_0<=RULE_ID)||LA6_0==RULE_STRING||(LA6_0>=RULE_NULL && LA6_0<=RULE_BOOL)||(LA6_0>=60 && LA6_0<=65)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1635:1: ( ruleConcatenationBrackets )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1635:1: ( ruleConcatenationBrackets )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1636:1: ruleConcatenationBrackets
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3521);
                    ruleConcatenationBrackets();

                    state._fsp--;

                     after(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1641:6: ( ruleLiteralAbs )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1641:6: ( ruleLiteralAbs )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1642:1: ruleLiteralAbs
                    {
                     before(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3538);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1652:1: rule__StringVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__StringVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1656:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1657:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1657:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1658:1: '='
                    {
                     before(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__StringVariable__Alternatives_2_03571); 
                     after(grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1665:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1665:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1666:1: ' = '
                    {
                     before(grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__StringVariable__Alternatives_2_03591); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1678:1: rule__NumVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__NumVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1682:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1683:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1683:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1684:1: '='
                    {
                     before(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__NumVariable__Alternatives_2_03626); 
                     after(grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1691:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1691:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1692:1: ' = '
                    {
                     before(grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__NumVariable__Alternatives_2_03646); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1704:1: rule__BoolVariable__Alternatives_2_0 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__BoolVariable__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1708:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1709:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1709:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1710:1: '='
                    {
                     before(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__BoolVariable__Alternatives_2_03681); 
                     after(grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1717:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1717:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1718:1: ' = '
                    {
                     before(grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__BoolVariable__Alternatives_2_03701); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1730:1: rule__Constant__Alternatives_2 : ( ( '=' ) | ( ' = ' ) );
    public final void rule__Constant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1734:1: ( ( '=' ) | ( ' = ' ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1735:1: ( '=' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1735:1: ( '=' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1736:1: '='
                    {
                     before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()); 
                    match(input,21,FOLLOW_21_in_rule__Constant__Alternatives_23736); 
                     after(grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1743:6: ( ' = ' )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1743:6: ( ' = ' )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1744:1: ' = '
                    {
                     before(grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1()); 
                    match(input,22,FOLLOW_22_in_rule__Constant__Alternatives_23756); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1756:1: rule__Primitive__Alternatives : ( ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1760:1: ( ( ruleStringLiteral ) | ( ruleBoolLiteral ) | ( ruleNumLiteral ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1761:1: ( ruleStringLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1761:1: ( ruleStringLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1762:1: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Primitive__Alternatives3790);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1767:6: ( ruleBoolLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1767:6: ( ruleBoolLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1768:1: ruleBoolLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rule__Primitive__Alternatives3807);
                    ruleBoolLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1773:6: ( ruleNumLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1773:6: ( ruleNumLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1774:1: ruleNumLiteral
                    {
                     before(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumLiteral_in_rule__Primitive__Alternatives3824);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1785:1: rule__LiteralAbs__Alternatives : ( ( ruleLiteral ) | ( rulePrimitive ) );
    public final void rule__LiteralAbs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1789:1: ( ( ruleLiteral ) | ( rulePrimitive ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==RULE_NULL||(LA12_0>=60 && LA12_0<=65)) ) {
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1790:1: ( ruleLiteral )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1790:1: ( ruleLiteral )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1791:1: ruleLiteral
                    {
                     before(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3857);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1796:6: ( rulePrimitive )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1796:6: ( rulePrimitive )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1797:1: rulePrimitive
                    {
                     before(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitive_in_rule__LiteralAbs__Alternatives3874);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1807:1: rule__Literal__Alternatives : ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ruleSESSION ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1811:1: ( ( ( rule__Literal__VAssignment_0 ) ) | ( ( rule__Literal__NulAssignment_1 ) ) | ( ruleSESSION ) )
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
            case 61:
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1812:1: ( ( rule__Literal__VAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1812:1: ( ( rule__Literal__VAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1813:1: ( rule__Literal__VAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getVAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1814:1: ( rule__Literal__VAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1814:2: rule__Literal__VAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3906);
                    rule__Literal__VAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getVAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1818:6: ( ( rule__Literal__NulAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1818:6: ( ( rule__Literal__NulAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1819:1: ( rule__Literal__NulAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getNulAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1820:1: ( rule__Literal__NulAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1820:2: rule__Literal__NulAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3924);
                    rule__Literal__NulAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getNulAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:6: ( ruleSESSION )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1824:6: ( ruleSESSION )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1825:1: ruleSESSION
                    {
                     before(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSESSION_in_rule__Literal__Alternatives3942);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1835:1: rule__Number__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1839:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1840:1: ( RULE_DOUBLE )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1840:1: ( RULE_DOUBLE )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1841:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3974); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1846:6: ( RULE_INT )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1846:6: ( RULE_INT )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1847:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives3991); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1857:1: rule__EVENT__Alternatives : ( ( ( rule__EVENT__NameAssignment_0 ) ) | ( ( rule__EVENT__NameAssignment_1 ) ) | ( ( rule__EVENT__NameAssignment_2 ) ) | ( ( rule__EVENT__NameAssignment_3 ) ) );
    public final void rule__EVENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1861:1: ( ( ( rule__EVENT__NameAssignment_0 ) ) | ( ( rule__EVENT__NameAssignment_1 ) ) | ( ( rule__EVENT__NameAssignment_2 ) ) | ( ( rule__EVENT__NameAssignment_3 ) ) )
            int alt15=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1862:1: ( ( rule__EVENT__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1862:1: ( ( rule__EVENT__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1863:1: ( rule__EVENT__NameAssignment_0 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1864:1: ( rule__EVENT__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1864:2: rule__EVENT__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_0_in_rule__EVENT__Alternatives4023);
                    rule__EVENT__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1868:6: ( ( rule__EVENT__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1868:6: ( ( rule__EVENT__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1869:1: ( rule__EVENT__NameAssignment_1 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1870:1: ( rule__EVENT__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1870:2: rule__EVENT__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_1_in_rule__EVENT__Alternatives4041);
                    rule__EVENT__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:6: ( ( rule__EVENT__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1874:6: ( ( rule__EVENT__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1875:1: ( rule__EVENT__NameAssignment_2 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1876:1: ( rule__EVENT__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1876:2: rule__EVENT__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_2_in_rule__EVENT__Alternatives4059);
                    rule__EVENT__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1880:6: ( ( rule__EVENT__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1880:6: ( ( rule__EVENT__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1881:1: ( rule__EVENT__NameAssignment_3 )
                    {
                     before(grammarAccess.getEVENTAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1882:1: ( rule__EVENT__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1882:2: rule__EVENT__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__EVENT__NameAssignment_3_in_rule__EVENT__Alternatives4077);
                    rule__EVENT__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTAccess().getNameAssignment_3()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1891:1: rule__SESSION__Alternatives : ( ( ( rule__SESSION__NameAssignment_0 ) ) | ( ( rule__SESSION__NameAssignment_1 ) ) | ( ( rule__SESSION__NameAssignment_2 ) ) | ( ( rule__SESSION__NameAssignment_3 ) ) | ( ( rule__SESSION__NameAssignment_4 ) ) | ( ( rule__SESSION__NameAssignment_5 ) ) );
    public final void rule__SESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1895:1: ( ( ( rule__SESSION__NameAssignment_0 ) ) | ( ( rule__SESSION__NameAssignment_1 ) ) | ( ( rule__SESSION__NameAssignment_2 ) ) | ( ( rule__SESSION__NameAssignment_3 ) ) | ( ( rule__SESSION__NameAssignment_4 ) ) | ( ( rule__SESSION__NameAssignment_5 ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt16=1;
                }
                break;
            case 62:
                {
                alt16=2;
                }
                break;
            case 63:
                {
                alt16=3;
                }
                break;
            case 64:
                {
                alt16=4;
                }
                break;
            case 65:
                {
                alt16=5;
                }
                break;
            case 60:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1896:1: ( ( rule__SESSION__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1896:1: ( ( rule__SESSION__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1897:1: ( rule__SESSION__NameAssignment_0 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1898:1: ( rule__SESSION__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1898:2: rule__SESSION__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_0_in_rule__SESSION__Alternatives4110);
                    rule__SESSION__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1902:6: ( ( rule__SESSION__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1902:6: ( ( rule__SESSION__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1903:1: ( rule__SESSION__NameAssignment_1 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1904:1: ( rule__SESSION__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1904:2: rule__SESSION__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_1_in_rule__SESSION__Alternatives4128);
                    rule__SESSION__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:6: ( ( rule__SESSION__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1908:6: ( ( rule__SESSION__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1909:1: ( rule__SESSION__NameAssignment_2 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1910:1: ( rule__SESSION__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1910:2: rule__SESSION__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_2_in_rule__SESSION__Alternatives4146);
                    rule__SESSION__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:6: ( ( rule__SESSION__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1914:6: ( ( rule__SESSION__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1915:1: ( rule__SESSION__NameAssignment_3 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1916:1: ( rule__SESSION__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1916:2: rule__SESSION__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_3_in_rule__SESSION__Alternatives4164);
                    rule__SESSION__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:6: ( ( rule__SESSION__NameAssignment_4 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1920:6: ( ( rule__SESSION__NameAssignment_4 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1921:1: ( rule__SESSION__NameAssignment_4 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_4()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1922:1: ( rule__SESSION__NameAssignment_4 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1922:2: rule__SESSION__NameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_4_in_rule__SESSION__Alternatives4182);
                    rule__SESSION__NameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1926:6: ( ( rule__SESSION__NameAssignment_5 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1926:6: ( ( rule__SESSION__NameAssignment_5 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1927:1: ( rule__SESSION__NameAssignment_5 )
                    {
                     before(grammarAccess.getSESSIONAccess().getNameAssignment_5()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1928:1: ( rule__SESSION__NameAssignment_5 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1928:2: rule__SESSION__NameAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SESSION__NameAssignment_5_in_rule__SESSION__Alternatives4200);
                    rule__SESSION__NameAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSESSIONAccess().getNameAssignment_5()); 

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1937:1: rule__CALLSTATUS__Alternatives : ( ( ( rule__CALLSTATUS__NameAssignment_0 ) ) | ( ( rule__CALLSTATUS__NameAssignment_1 ) ) | ( ( rule__CALLSTATUS__NameAssignment_2 ) ) | ( ( rule__CALLSTATUS__NameAssignment_3 ) ) );
    public final void rule__CALLSTATUS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1941:1: ( ( ( rule__CALLSTATUS__NameAssignment_0 ) ) | ( ( rule__CALLSTATUS__NameAssignment_1 ) ) | ( ( rule__CALLSTATUS__NameAssignment_2 ) ) | ( ( rule__CALLSTATUS__NameAssignment_3 ) ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:1: ( ( rule__CALLSTATUS__NameAssignment_0 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1942:1: ( ( rule__CALLSTATUS__NameAssignment_0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1943:1: ( rule__CALLSTATUS__NameAssignment_0 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1944:1: ( rule__CALLSTATUS__NameAssignment_0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1944:2: rule__CALLSTATUS__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_0_in_rule__CALLSTATUS__Alternatives4233);
                    rule__CALLSTATUS__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:6: ( ( rule__CALLSTATUS__NameAssignment_1 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1948:6: ( ( rule__CALLSTATUS__NameAssignment_1 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1949:1: ( rule__CALLSTATUS__NameAssignment_1 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1950:1: ( rule__CALLSTATUS__NameAssignment_1 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1950:2: rule__CALLSTATUS__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_1_in_rule__CALLSTATUS__Alternatives4251);
                    rule__CALLSTATUS__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:6: ( ( rule__CALLSTATUS__NameAssignment_2 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1954:6: ( ( rule__CALLSTATUS__NameAssignment_2 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1955:1: ( rule__CALLSTATUS__NameAssignment_2 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1956:1: ( rule__CALLSTATUS__NameAssignment_2 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1956:2: rule__CALLSTATUS__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_2_in_rule__CALLSTATUS__Alternatives4269);
                    rule__CALLSTATUS__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1960:6: ( ( rule__CALLSTATUS__NameAssignment_3 ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1960:6: ( ( rule__CALLSTATUS__NameAssignment_3 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1961:1: ( rule__CALLSTATUS__NameAssignment_3 )
                    {
                     before(grammarAccess.getCALLSTATUSAccess().getNameAssignment_3()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1962:1: ( rule__CALLSTATUS__NameAssignment_3 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1962:2: rule__CALLSTATUS__NameAssignment_3
                    {
                    pushFollow(FOLLOW_rule__CALLSTATUS__NameAssignment_3_in_rule__CALLSTATUS__Alternatives4287);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1973:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1977:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1978:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__04318);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__04321);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1985:1: rule__Document__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1989:1: ( ( 'Application' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1990:1: ( 'Application' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1990:1: ( 'Application' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:1991:1: 'Application'
            {
             before(grammarAccess.getDocumentAccess().getApplicationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Document__Group__0__Impl4349); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2004:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2008:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2009:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__14380);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__14383);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2016:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2020:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2021:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2021:1: ( ( rule__Document__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2022:1: ( rule__Document__NameAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2023:1: ( rule__Document__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2023:2: rule__Document__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl4410);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2033:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2037:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2038:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__24440);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__24443);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2045:1: rule__Document__Group__2__Impl : ( ( rule__Document__ElementsAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2049:1: ( ( ( rule__Document__ElementsAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2050:1: ( ( rule__Document__ElementsAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2050:1: ( ( rule__Document__ElementsAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2051:1: ( rule__Document__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDocumentAccess().getElementsAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2052:1: ( rule__Document__ElementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ML_COMMENT||(LA18_0>=41 && LA18_0<=44)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2052:2: rule__Document__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl4470);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2062:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2066:1: ( rule__Document__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2067:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__34501);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2073:1: rule__Document__Group__3__Impl : ( ( rule__Document__StaAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2077:1: ( ( ( rule__Document__StaAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2078:1: ( ( rule__Document__StaAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2078:1: ( ( rule__Document__StaAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2079:1: ( rule__Document__StaAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getStaAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2080:1: ( rule__Document__StaAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24||LA19_0==26||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2080:2: rule__Document__StaAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl4528);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2098:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2102:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2103:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__04567);
            rule__State__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__04570);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2110:1: rule__State__Group_0__0__Impl : ( 'State' ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2114:1: ( ( 'State' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2115:1: ( 'State' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2115:1: ( 'State' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2116:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__State__Group_0__0__Impl4598); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2129:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl rule__State__Group_0__2 ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2133:1: ( rule__State__Group_0__1__Impl rule__State__Group_0__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2134:2: rule__State__Group_0__1__Impl rule__State__Group_0__2
            {
            pushFollow(FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__14629);
            rule__State__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__14632);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2141:1: rule__State__Group_0__1__Impl : ( ( rule__State__NameAssignment_0_1 ) ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2145:1: ( ( ( rule__State__NameAssignment_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2146:1: ( ( rule__State__NameAssignment_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2146:1: ( ( rule__State__NameAssignment_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2147:1: ( rule__State__NameAssignment_0_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2148:1: ( rule__State__NameAssignment_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2148:2: rule__State__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl4659);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2158:1: rule__State__Group_0__2 : rule__State__Group_0__2__Impl ;
    public final void rule__State__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2162:1: ( rule__State__Group_0__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2163:2: rule__State__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__24689);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2169:1: rule__State__Group_0__2__Impl : ( ( rule__State__Group_0_2__0 )? ) ;
    public final void rule__State__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2173:1: ( ( ( rule__State__Group_0_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2174:1: ( ( rule__State__Group_0_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2174:1: ( ( rule__State__Group_0_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2175:1: ( rule__State__Group_0_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_0_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2176:1: ( rule__State__Group_0_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2176:2: rule__State__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl4716);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2192:1: rule__State__Group_0_2__0 : rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 ;
    public final void rule__State__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2196:1: ( rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2197:2: rule__State__Group_0_2__0__Impl rule__State__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__04753);
            rule__State__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__04756);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2204:1: rule__State__Group_0_2__0__Impl : ( 'times' ) ;
    public final void rule__State__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2208:1: ( ( 'times' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2209:1: ( 'times' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2209:1: ( 'times' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2210:1: 'times'
            {
             before(grammarAccess.getStateAccess().getTimesKeyword_0_2_0()); 
            match(input,25,FOLLOW_25_in_rule__State__Group_0_2__0__Impl4784); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2223:1: rule__State__Group_0_2__1 : rule__State__Group_0_2__1__Impl ;
    public final void rule__State__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2227:1: ( rule__State__Group_0_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2228:2: rule__State__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__14815);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2234:1: rule__State__Group_0_2__1__Impl : ( ( rule__State__TimesAssignment_0_2_1 ) ) ;
    public final void rule__State__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2238:1: ( ( ( rule__State__TimesAssignment_0_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2239:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2239:1: ( ( rule__State__TimesAssignment_0_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2240:1: ( rule__State__TimesAssignment_0_2_1 )
            {
             before(grammarAccess.getStateAccess().getTimesAssignment_0_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2241:1: ( rule__State__TimesAssignment_0_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2241:2: rule__State__TimesAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl4842);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2255:1: rule__State__Group_1__0 : rule__State__Group_1__0__Impl rule__State__Group_1__1 ;
    public final void rule__State__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2259:1: ( rule__State__Group_1__0__Impl rule__State__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2260:2: rule__State__Group_1__0__Impl rule__State__Group_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__04876);
            rule__State__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__04879);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2267:1: rule__State__Group_1__0__Impl : ( ( rule__State__Group_1_0__0 )? ) ;
    public final void rule__State__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2271:1: ( ( ( rule__State__Group_1_0__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2272:1: ( ( rule__State__Group_1_0__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2272:1: ( ( rule__State__Group_1_0__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2273:1: ( rule__State__Group_1_0__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2274:1: ( rule__State__Group_1_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2274:2: rule__State__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4906);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2284:1: rule__State__Group_1__1 : rule__State__Group_1__1__Impl rule__State__Group_1__2 ;
    public final void rule__State__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2288:1: ( rule__State__Group_1__1__Impl rule__State__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2289:2: rule__State__Group_1__1__Impl rule__State__Group_1__2
            {
            pushFollow(FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14937);
            rule__State__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14940);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2296:1: rule__State__Group_1__1__Impl : ( '{' ) ;
    public final void rule__State__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2300:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2301:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2301:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2302:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__State__Group_1__1__Impl4968); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2315:1: rule__State__Group_1__2 : rule__State__Group_1__2__Impl rule__State__Group_1__3 ;
    public final void rule__State__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2319:1: ( rule__State__Group_1__2__Impl rule__State__Group_1__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2320:2: rule__State__Group_1__2__Impl rule__State__Group_1__3
            {
            pushFollow(FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24999);
            rule__State__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__25002);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2327:1: rule__State__Group_1__2__Impl : ( ( rule__State__StmsAssignment_1_2 )* ) ;
    public final void rule__State__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2331:1: ( ( ( rule__State__StmsAssignment_1_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2332:1: ( ( rule__State__StmsAssignment_1_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2332:1: ( ( rule__State__StmsAssignment_1_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2333:1: ( rule__State__StmsAssignment_1_2 )*
            {
             before(grammarAccess.getStateAccess().getStmsAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2334:1: ( rule__State__StmsAssignment_1_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ML_COMMENT||(LA22_0>=40 && LA22_0<=56)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2334:2: rule__State__StmsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl5029);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2344:1: rule__State__Group_1__3 : rule__State__Group_1__3__Impl ;
    public final void rule__State__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2348:1: ( rule__State__Group_1__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2349:2: rule__State__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__35060);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2355:1: rule__State__Group_1__3__Impl : ( '}' ) ;
    public final void rule__State__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2359:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2360:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2360:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2361:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_1__3__Impl5088); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2382:1: rule__State__Group_1_0__0 : rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 ;
    public final void rule__State__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2386:1: ( rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2387:2: rule__State__Group_1_0__0__Impl rule__State__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__05127);
            rule__State__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__05130);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2394:1: rule__State__Group_1_0__0__Impl : ( 'timeout' ) ;
    public final void rule__State__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2398:1: ( ( 'timeout' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2399:1: ( 'timeout' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2399:1: ( 'timeout' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2400:1: 'timeout'
            {
             before(grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0()); 
            match(input,28,FOLLOW_28_in_rule__State__Group_1_0__0__Impl5158); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2413:1: rule__State__Group_1_0__1 : rule__State__Group_1_0__1__Impl ;
    public final void rule__State__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2417:1: ( rule__State__Group_1_0__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2418:2: rule__State__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__15189);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2424:1: rule__State__Group_1_0__1__Impl : ( ( rule__State__TimeoutAssignment_1_0_1 ) ) ;
    public final void rule__State__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2428:1: ( ( ( rule__State__TimeoutAssignment_1_0_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2429:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2429:1: ( ( rule__State__TimeoutAssignment_1_0_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2430:1: ( rule__State__TimeoutAssignment_1_0_1 )
            {
             before(grammarAccess.getStateAccess().getTimeoutAssignment_1_0_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2431:1: ( rule__State__TimeoutAssignment_1_0_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2431:2: rule__State__TimeoutAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl5216);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2445:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2449:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2450:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05250);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05253);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2457:1: rule__Call__Group__0__Impl : ( ( rule__Call__NameAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2461:1: ( ( ( rule__Call__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2462:1: ( ( rule__Call__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2462:1: ( ( rule__Call__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2463:1: ( rule__Call__NameAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2464:1: ( rule__Call__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2464:2: rule__Call__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5280);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2474:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2478:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2479:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15310);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15313);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2486:1: rule__Call__Group__1__Impl : ( ( rule__Call__ToAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2490:1: ( ( ( rule__Call__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2491:1: ( ( rule__Call__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2491:1: ( ( rule__Call__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2492:1: ( rule__Call__ToAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2493:1: ( rule__Call__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2493:2: rule__Call__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl5340);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2503:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2507:1: ( rule__Call__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2508:2: rule__Call__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25370);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2514:1: rule__Call__Group__2__Impl : ( ';' ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2518:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2519:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2519:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2520:1: ';'
            {
             before(grammarAccess.getCallAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Call__Group__2__Impl5398); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2539:1: rule__Dial__Group__0 : rule__Dial__Group__0__Impl rule__Dial__Group__1 ;
    public final void rule__Dial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2543:1: ( rule__Dial__Group__0__Impl rule__Dial__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2544:2: rule__Dial__Group__0__Impl rule__Dial__Group__1
            {
            pushFollow(FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__05435);
            rule__Dial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__05438);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2551:1: rule__Dial__Group__0__Impl : ( ( rule__Dial__NameAssignment_0 ) ) ;
    public final void rule__Dial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2555:1: ( ( ( rule__Dial__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2556:1: ( ( rule__Dial__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2556:1: ( ( rule__Dial__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2557:1: ( rule__Dial__NameAssignment_0 )
            {
             before(grammarAccess.getDialAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2558:1: ( rule__Dial__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2558:2: rule__Dial__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Dial__NameAssignment_0_in_rule__Dial__Group__0__Impl5465);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2568:1: rule__Dial__Group__1 : rule__Dial__Group__1__Impl rule__Dial__Group__2 ;
    public final void rule__Dial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2572:1: ( rule__Dial__Group__1__Impl rule__Dial__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2573:2: rule__Dial__Group__1__Impl rule__Dial__Group__2
            {
            pushFollow(FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__15495);
            rule__Dial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__15498);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2580:1: rule__Dial__Group__1__Impl : ( ( rule__Dial__ToAssignment_1 ) ) ;
    public final void rule__Dial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2584:1: ( ( ( rule__Dial__ToAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2585:1: ( ( rule__Dial__ToAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2585:1: ( ( rule__Dial__ToAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2586:1: ( rule__Dial__ToAssignment_1 )
            {
             before(grammarAccess.getDialAccess().getToAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2587:1: ( rule__Dial__ToAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2587:2: rule__Dial__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl5525);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2597:1: rule__Dial__Group__2 : rule__Dial__Group__2__Impl ;
    public final void rule__Dial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2601:1: ( rule__Dial__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2602:2: rule__Dial__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__25555);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2608:1: rule__Dial__Group__2__Impl : ( ';' ) ;
    public final void rule__Dial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2612:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2613:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2613:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2614:1: ';'
            {
             before(grammarAccess.getDialAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Dial__Group__2__Impl5583); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2633:1: rule__Play__Group__0 : rule__Play__Group__0__Impl rule__Play__Group__1 ;
    public final void rule__Play__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2637:1: ( rule__Play__Group__0__Impl rule__Play__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2638:2: rule__Play__Group__0__Impl rule__Play__Group__1
            {
            pushFollow(FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__05620);
            rule__Play__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__1_in_rule__Play__Group__05623);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2645:1: rule__Play__Group__0__Impl : ( ( rule__Play__NameAssignment_0 ) ) ;
    public final void rule__Play__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2649:1: ( ( ( rule__Play__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2650:1: ( ( rule__Play__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2650:1: ( ( rule__Play__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2651:1: ( rule__Play__NameAssignment_0 )
            {
             before(grammarAccess.getPlayAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2652:1: ( rule__Play__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2652:2: rule__Play__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Play__NameAssignment_0_in_rule__Play__Group__0__Impl5650);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2662:1: rule__Play__Group__1 : rule__Play__Group__1__Impl rule__Play__Group__2 ;
    public final void rule__Play__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2666:1: ( rule__Play__Group__1__Impl rule__Play__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2667:2: rule__Play__Group__1__Impl rule__Play__Group__2
            {
            pushFollow(FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__15680);
            rule__Play__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Play__Group__2_in_rule__Play__Group__15683);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2674:1: rule__Play__Group__1__Impl : ( ( rule__Play__FileAssignment_1 ) ) ;
    public final void rule__Play__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2678:1: ( ( ( rule__Play__FileAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2679:1: ( ( rule__Play__FileAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2679:1: ( ( rule__Play__FileAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2680:1: ( rule__Play__FileAssignment_1 )
            {
             before(grammarAccess.getPlayAccess().getFileAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2681:1: ( rule__Play__FileAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2681:2: rule__Play__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl5710);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2691:1: rule__Play__Group__2 : rule__Play__Group__2__Impl ;
    public final void rule__Play__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2695:1: ( rule__Play__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2696:2: rule__Play__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__25740);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2702:1: rule__Play__Group__2__Impl : ( ';' ) ;
    public final void rule__Play__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2706:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2707:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2707:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2708:1: ';'
            {
             before(grammarAccess.getPlayAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Play__Group__2__Impl5768); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2727:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2731:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2732:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05805);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05808);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2739:1: rule__Record__Group__0__Impl : ( ( rule__Record__NameAssignment_0 ) ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2743:1: ( ( ( rule__Record__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:1: ( ( rule__Record__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2744:1: ( ( rule__Record__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2745:1: ( rule__Record__NameAssignment_0 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2746:1: ( rule__Record__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2746:2: rule__Record__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Record__NameAssignment_0_in_rule__Record__Group__0__Impl5835);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2756:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2760:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2761:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15865);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15868);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2768:1: rule__Record__Group__1__Impl : ( ( rule__Record__TimeAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2772:1: ( ( ( rule__Record__TimeAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2773:1: ( ( rule__Record__TimeAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2773:1: ( ( rule__Record__TimeAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2774:1: ( rule__Record__TimeAssignment_1 )
            {
             before(grammarAccess.getRecordAccess().getTimeAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2775:1: ( rule__Record__TimeAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2775:2: rule__Record__TimeAssignment_1
            {
            pushFollow(FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5895);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2785:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2789:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2790:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25925);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25928);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2797:1: rule__Record__Group__2__Impl : ( 'seconds' ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2801:1: ( ( 'seconds' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2802:1: ( 'seconds' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2802:1: ( 'seconds' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2803:1: 'seconds'
            {
             before(grammarAccess.getRecordAccess().getSecondsKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Record__Group__2__Impl5956); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2816:1: rule__Record__Group__3 : rule__Record__Group__3__Impl ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2820:1: ( rule__Record__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2821:2: rule__Record__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35987);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2827:1: rule__Record__Group__3__Impl : ( ';' ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2831:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2832:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2832:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2833:1: ';'
            {
             before(grammarAccess.getRecordAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Record__Group__3__Impl6015); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2854:1: rule__GetDigits__Group__0 : rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 ;
    public final void rule__GetDigits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2858:1: ( rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2859:2: rule__GetDigits__Group__0__Impl rule__GetDigits__Group__1
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__06054);
            rule__GetDigits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__06057);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2866:1: rule__GetDigits__Group__0__Impl : ( ( rule__GetDigits__NameAssignment_0 ) ) ;
    public final void rule__GetDigits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2870:1: ( ( ( rule__GetDigits__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2871:1: ( ( rule__GetDigits__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2871:1: ( ( rule__GetDigits__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2872:1: ( rule__GetDigits__NameAssignment_0 )
            {
             before(grammarAccess.getGetDigitsAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2873:1: ( rule__GetDigits__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2873:2: rule__GetDigits__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__GetDigits__NameAssignment_0_in_rule__GetDigits__Group__0__Impl6084);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2883:1: rule__GetDigits__Group__1 : rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 ;
    public final void rule__GetDigits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2887:1: ( rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2888:2: rule__GetDigits__Group__1__Impl rule__GetDigits__Group__2
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__16114);
            rule__GetDigits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__16117);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2895:1: rule__GetDigits__Group__1__Impl : ( ( rule__GetDigits__NumDigitsAssignment_1 )? ) ;
    public final void rule__GetDigits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2899:1: ( ( ( rule__GetDigits__NumDigitsAssignment_1 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2900:1: ( ( rule__GetDigits__NumDigitsAssignment_1 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2900:1: ( ( rule__GetDigits__NumDigitsAssignment_1 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2901:1: ( rule__GetDigits__NumDigitsAssignment_1 )?
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2902:1: ( rule__GetDigits__NumDigitsAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2902:2: rule__GetDigits__NumDigitsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl6144);
                    rule__GetDigits__NumDigitsAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2912:1: rule__GetDigits__Group__2 : rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 ;
    public final void rule__GetDigits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2916:1: ( rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2917:2: rule__GetDigits__Group__2__Impl rule__GetDigits__Group__3
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__26175);
            rule__GetDigits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__26178);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2924:1: rule__GetDigits__Group__2__Impl : ( 'digits' ) ;
    public final void rule__GetDigits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2928:1: ( ( 'digits' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2929:1: ( 'digits' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2929:1: ( 'digits' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2930:1: 'digits'
            {
             before(grammarAccess.getGetDigitsAccess().getDigitsKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__GetDigits__Group__2__Impl6206); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2943:1: rule__GetDigits__Group__3 : rule__GetDigits__Group__3__Impl ;
    public final void rule__GetDigits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2947:1: ( rule__GetDigits__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2948:2: rule__GetDigits__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__36237);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2954:1: rule__GetDigits__Group__3__Impl : ( ';' ) ;
    public final void rule__GetDigits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2958:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2959:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2959:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2960:1: ';'
            {
             before(grammarAccess.getGetDigitsAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__GetDigits__Group__3__Impl6265); 
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


    // $ANTLR start "rule__Send__Group__0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2981:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2985:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2986:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06304);
            rule__Send__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06307);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2993:1: rule__Send__Group__0__Impl : ( ( rule__Send__NameAssignment_0 ) ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2997:1: ( ( ( rule__Send__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2998:1: ( ( rule__Send__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2998:1: ( ( rule__Send__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:2999:1: ( rule__Send__NameAssignment_0 )
            {
             before(grammarAccess.getSendAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3000:1: ( rule__Send__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3000:2: rule__Send__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Send__NameAssignment_0_in_rule__Send__Group__0__Impl6334);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3010:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3014:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3015:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16364);
            rule__Send__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16367);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3022:1: rule__Send__Group__1__Impl : ( ( rule__Send__ParamsAssignment_1 ) ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3026:1: ( ( ( rule__Send__ParamsAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3027:1: ( ( rule__Send__ParamsAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3027:1: ( ( rule__Send__ParamsAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3028:1: ( rule__Send__ParamsAssignment_1 )
            {
             before(grammarAccess.getSendAccess().getParamsAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3029:1: ( rule__Send__ParamsAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3029:2: rule__Send__ParamsAssignment_1
            {
            pushFollow(FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6394);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3039:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3043:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3044:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26424);
            rule__Send__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26427);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3051:1: rule__Send__Group__2__Impl : ( 'to' ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3055:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3056:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3056:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3057:1: 'to'
            {
             before(grammarAccess.getSendAccess().getToKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Send__Group__2__Impl6455); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3070:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3074:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3075:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36486);
            rule__Send__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36489);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3082:1: rule__Send__Group__3__Impl : ( ( rule__Send__UrlAssignment_3 ) ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3086:1: ( ( ( rule__Send__UrlAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3087:1: ( ( rule__Send__UrlAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3087:1: ( ( rule__Send__UrlAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3088:1: ( rule__Send__UrlAssignment_3 )
            {
             before(grammarAccess.getSendAccess().getUrlAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3089:1: ( rule__Send__UrlAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3089:2: rule__Send__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6516);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3099:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3103:1: ( rule__Send__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3104:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46546);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3110:1: rule__Send__Group__4__Impl : ( ';' ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3114:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3115:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3115:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3116:1: ';'
            {
             before(grammarAccess.getSendAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Send__Group__4__Impl6574); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3139:1: rule__SendBlock__Group__0 : rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 ;
    public final void rule__SendBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3143:1: ( rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3144:2: rule__SendBlock__Group__0__Impl rule__SendBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06615);
            rule__SendBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06618);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3151:1: rule__SendBlock__Group__0__Impl : ( () ) ;
    public final void rule__SendBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3155:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3156:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3156:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3157:1: ()
            {
             before(grammarAccess.getSendBlockAccess().getSendBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3158:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3160:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3170:1: rule__SendBlock__Group__1 : rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 ;
    public final void rule__SendBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3174:1: ( rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3175:2: rule__SendBlock__Group__1__Impl rule__SendBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16676);
            rule__SendBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16679);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3182:1: rule__SendBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SendBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3186:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3187:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3187:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3188:1: '{'
            {
             before(grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__SendBlock__Group__1__Impl6707); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3201:1: rule__SendBlock__Group__2 : rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 ;
    public final void rule__SendBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3205:1: ( rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3206:2: rule__SendBlock__Group__2__Impl rule__SendBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26738);
            rule__SendBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26741);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3213:1: rule__SendBlock__Group__2__Impl : ( ( rule__SendBlock__ValueAssignment_2 ) ) ;
    public final void rule__SendBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3217:1: ( ( ( rule__SendBlock__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3218:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3218:1: ( ( rule__SendBlock__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3219:1: ( rule__SendBlock__ValueAssignment_2 )
            {
             before(grammarAccess.getSendBlockAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3220:1: ( rule__SendBlock__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3220:2: rule__SendBlock__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6768);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3230:1: rule__SendBlock__Group__3 : rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 ;
    public final void rule__SendBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3234:1: ( rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3235:2: rule__SendBlock__Group__3__Impl rule__SendBlock__Group__4
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36798);
            rule__SendBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36801);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3242:1: rule__SendBlock__Group__3__Impl : ( ( rule__SendBlock__StmsAssignment_3 )* ) ;
    public final void rule__SendBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3246:1: ( ( ( rule__SendBlock__StmsAssignment_3 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3247:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3247:1: ( ( rule__SendBlock__StmsAssignment_3 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3248:1: ( rule__SendBlock__StmsAssignment_3 )*
            {
             before(grammarAccess.getSendBlockAccess().getStmsAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3249:1: ( rule__SendBlock__StmsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3249:2: rule__SendBlock__StmsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6828);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3259:1: rule__SendBlock__Group__4 : rule__SendBlock__Group__4__Impl ;
    public final void rule__SendBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3263:1: ( rule__SendBlock__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3264:2: rule__SendBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__46859);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3270:1: rule__SendBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SendBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3274:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3275:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3275:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3276:1: '}'
            {
             before(grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__SendBlock__Group__4__Impl6887); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3299:1: rule__NotPrimaryParam__Group__0 : rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 ;
    public final void rule__NotPrimaryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3303:1: ( rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3304:2: rule__NotPrimaryParam__Group__0__Impl rule__NotPrimaryParam__Group__1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__06928);
            rule__NotPrimaryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__06931);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3311:1: rule__NotPrimaryParam__Group__0__Impl : ( ',' ) ;
    public final void rule__NotPrimaryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3315:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3316:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3316:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3317:1: ','
            {
             before(grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NotPrimaryParam__Group__0__Impl6959); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3330:1: rule__NotPrimaryParam__Group__1 : rule__NotPrimaryParam__Group__1__Impl ;
    public final void rule__NotPrimaryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3334:1: ( rule__NotPrimaryParam__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3335:2: rule__NotPrimaryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__16990);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3341:1: rule__NotPrimaryParam__Group__1__Impl : ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) ;
    public final void rule__NotPrimaryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3345:1: ( ( ( rule__NotPrimaryParam__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3346:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3346:1: ( ( rule__NotPrimaryParam__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3347:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3348:1: ( rule__NotPrimaryParam__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3348:2: rule__NotPrimaryParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7017);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3362:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3366:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3367:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07051);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07054);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3374:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3378:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3379:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3379:1: ( ( rule__Param__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3380:1: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3381:1: ( rule__Param__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3381:2: rule__Param__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_0_in_rule__Param__Group__0__Impl7081);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3391:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3395:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3396:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17111);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17114);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3403:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3407:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3408:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3408:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3409:1: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Param__Group__1__Impl7142); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3422:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3426:1: ( rule__Param__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3427:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27173);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3433:1: rule__Param__Group__2__Impl : ( ( rule__Param__ValueAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3437:1: ( ( ( rule__Param__ValueAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3438:1: ( ( rule__Param__ValueAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3438:1: ( ( rule__Param__ValueAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3439:1: ( rule__Param__ValueAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3440:1: ( rule__Param__ValueAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3440:2: rule__Param__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7200);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3456:1: rule__Say__Group__0 : rule__Say__Group__0__Impl rule__Say__Group__1 ;
    public final void rule__Say__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3460:1: ( rule__Say__Group__0__Impl rule__Say__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3461:2: rule__Say__Group__0__Impl rule__Say__Group__1
            {
            pushFollow(FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07236);
            rule__Say__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07239);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3468:1: rule__Say__Group__0__Impl : ( ( rule__Say__NameAssignment_0 ) ) ;
    public final void rule__Say__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3472:1: ( ( ( rule__Say__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3473:1: ( ( rule__Say__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3473:1: ( ( rule__Say__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3474:1: ( rule__Say__NameAssignment_0 )
            {
             before(grammarAccess.getSayAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3475:1: ( rule__Say__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3475:2: rule__Say__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Say__NameAssignment_0_in_rule__Say__Group__0__Impl7266);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3485:1: rule__Say__Group__1 : rule__Say__Group__1__Impl rule__Say__Group__2 ;
    public final void rule__Say__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3489:1: ( rule__Say__Group__1__Impl rule__Say__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3490:2: rule__Say__Group__1__Impl rule__Say__Group__2
            {
            pushFollow(FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17296);
            rule__Say__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17299);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3497:1: rule__Say__Group__1__Impl : ( ( rule__Say__ThatAssignment_1 ) ) ;
    public final void rule__Say__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3501:1: ( ( ( rule__Say__ThatAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3502:1: ( ( rule__Say__ThatAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3502:1: ( ( rule__Say__ThatAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3503:1: ( rule__Say__ThatAssignment_1 )
            {
             before(grammarAccess.getSayAccess().getThatAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3504:1: ( rule__Say__ThatAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3504:2: rule__Say__ThatAssignment_1
            {
            pushFollow(FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7326);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3514:1: rule__Say__Group__2 : rule__Say__Group__2__Impl ;
    public final void rule__Say__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3518:1: ( rule__Say__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3519:2: rule__Say__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27356);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3525:1: rule__Say__Group__2__Impl : ( ';' ) ;
    public final void rule__Say__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3529:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3530:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3530:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3531:1: ';'
            {
             before(grammarAccess.getSayAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Say__Group__2__Impl7384); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3550:1: rule__Sms__Group__0 : rule__Sms__Group__0__Impl rule__Sms__Group__1 ;
    public final void rule__Sms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3554:1: ( rule__Sms__Group__0__Impl rule__Sms__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3555:2: rule__Sms__Group__0__Impl rule__Sms__Group__1
            {
            pushFollow(FOLLOW_rule__Sms__Group__0__Impl_in_rule__Sms__Group__07421);
            rule__Sms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__1_in_rule__Sms__Group__07424);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3562:1: rule__Sms__Group__0__Impl : ( ( rule__Sms__NameAssignment_0 ) ) ;
    public final void rule__Sms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3566:1: ( ( ( rule__Sms__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3567:1: ( ( rule__Sms__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3567:1: ( ( rule__Sms__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3568:1: ( rule__Sms__NameAssignment_0 )
            {
             before(grammarAccess.getSmsAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3569:1: ( rule__Sms__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3569:2: rule__Sms__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Sms__NameAssignment_0_in_rule__Sms__Group__0__Impl7451);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3579:1: rule__Sms__Group__1 : rule__Sms__Group__1__Impl rule__Sms__Group__2 ;
    public final void rule__Sms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3583:1: ( rule__Sms__Group__1__Impl rule__Sms__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3584:2: rule__Sms__Group__1__Impl rule__Sms__Group__2
            {
            pushFollow(FOLLOW_rule__Sms__Group__1__Impl_in_rule__Sms__Group__17481);
            rule__Sms__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__2_in_rule__Sms__Group__17484);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3591:1: rule__Sms__Group__1__Impl : ( ( rule__Sms__ValueAssignment_1 ) ) ;
    public final void rule__Sms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3595:1: ( ( ( rule__Sms__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3596:1: ( ( rule__Sms__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3596:1: ( ( rule__Sms__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3597:1: ( rule__Sms__ValueAssignment_1 )
            {
             before(grammarAccess.getSmsAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3598:1: ( rule__Sms__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3598:2: rule__Sms__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Sms__ValueAssignment_1_in_rule__Sms__Group__1__Impl7511);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3608:1: rule__Sms__Group__2 : rule__Sms__Group__2__Impl rule__Sms__Group__3 ;
    public final void rule__Sms__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3612:1: ( rule__Sms__Group__2__Impl rule__Sms__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3613:2: rule__Sms__Group__2__Impl rule__Sms__Group__3
            {
            pushFollow(FOLLOW_rule__Sms__Group__2__Impl_in_rule__Sms__Group__27541);
            rule__Sms__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__3_in_rule__Sms__Group__27544);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3620:1: rule__Sms__Group__2__Impl : ( 'to' ) ;
    public final void rule__Sms__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3624:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3625:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3625:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3626:1: 'to'
            {
             before(grammarAccess.getSmsAccess().getToKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Sms__Group__2__Impl7572); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3639:1: rule__Sms__Group__3 : rule__Sms__Group__3__Impl rule__Sms__Group__4 ;
    public final void rule__Sms__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3643:1: ( rule__Sms__Group__3__Impl rule__Sms__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3644:2: rule__Sms__Group__3__Impl rule__Sms__Group__4
            {
            pushFollow(FOLLOW_rule__Sms__Group__3__Impl_in_rule__Sms__Group__37603);
            rule__Sms__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sms__Group__4_in_rule__Sms__Group__37606);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3651:1: rule__Sms__Group__3__Impl : ( ( rule__Sms__ToAssignment_3 ) ) ;
    public final void rule__Sms__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3655:1: ( ( ( rule__Sms__ToAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3656:1: ( ( rule__Sms__ToAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3656:1: ( ( rule__Sms__ToAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3657:1: ( rule__Sms__ToAssignment_3 )
            {
             before(grammarAccess.getSmsAccess().getToAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3658:1: ( rule__Sms__ToAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3658:2: rule__Sms__ToAssignment_3
            {
            pushFollow(FOLLOW_rule__Sms__ToAssignment_3_in_rule__Sms__Group__3__Impl7633);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3668:1: rule__Sms__Group__4 : rule__Sms__Group__4__Impl ;
    public final void rule__Sms__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3672:1: ( rule__Sms__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3673:2: rule__Sms__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sms__Group__4__Impl_in_rule__Sms__Group__47663);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3679:1: rule__Sms__Group__4__Impl : ( ';' ) ;
    public final void rule__Sms__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3683:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3684:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3684:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3685:1: ';'
            {
             before(grammarAccess.getSmsAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Sms__Group__4__Impl7691); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3708:1: rule__Email__Group__0 : rule__Email__Group__0__Impl rule__Email__Group__1 ;
    public final void rule__Email__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3712:1: ( rule__Email__Group__0__Impl rule__Email__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3713:2: rule__Email__Group__0__Impl rule__Email__Group__1
            {
            pushFollow(FOLLOW_rule__Email__Group__0__Impl_in_rule__Email__Group__07732);
            rule__Email__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__1_in_rule__Email__Group__07735);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3720:1: rule__Email__Group__0__Impl : ( ( rule__Email__NameAssignment_0 ) ) ;
    public final void rule__Email__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3724:1: ( ( ( rule__Email__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3725:1: ( ( rule__Email__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3725:1: ( ( rule__Email__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3726:1: ( rule__Email__NameAssignment_0 )
            {
             before(grammarAccess.getEmailAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3727:1: ( rule__Email__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3727:2: rule__Email__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Email__NameAssignment_0_in_rule__Email__Group__0__Impl7762);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3737:1: rule__Email__Group__1 : rule__Email__Group__1__Impl rule__Email__Group__2 ;
    public final void rule__Email__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3741:1: ( rule__Email__Group__1__Impl rule__Email__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3742:2: rule__Email__Group__1__Impl rule__Email__Group__2
            {
            pushFollow(FOLLOW_rule__Email__Group__1__Impl_in_rule__Email__Group__17792);
            rule__Email__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__2_in_rule__Email__Group__17795);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3749:1: rule__Email__Group__1__Impl : ( '{' ) ;
    public final void rule__Email__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3753:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3754:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3754:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3755:1: '{'
            {
             before(grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Email__Group__1__Impl7823); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3768:1: rule__Email__Group__2 : rule__Email__Group__2__Impl rule__Email__Group__3 ;
    public final void rule__Email__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3772:1: ( rule__Email__Group__2__Impl rule__Email__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3773:2: rule__Email__Group__2__Impl rule__Email__Group__3
            {
            pushFollow(FOLLOW_rule__Email__Group__2__Impl_in_rule__Email__Group__27854);
            rule__Email__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__3_in_rule__Email__Group__27857);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3780:1: rule__Email__Group__2__Impl : ( 'subject' ) ;
    public final void rule__Email__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3784:1: ( ( 'subject' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3785:1: ( 'subject' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3785:1: ( 'subject' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3786:1: 'subject'
            {
             before(grammarAccess.getEmailAccess().getSubjectKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Email__Group__2__Impl7885); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3799:1: rule__Email__Group__3 : rule__Email__Group__3__Impl rule__Email__Group__4 ;
    public final void rule__Email__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3803:1: ( rule__Email__Group__3__Impl rule__Email__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3804:2: rule__Email__Group__3__Impl rule__Email__Group__4
            {
            pushFollow(FOLLOW_rule__Email__Group__3__Impl_in_rule__Email__Group__37916);
            rule__Email__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__4_in_rule__Email__Group__37919);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3811:1: rule__Email__Group__3__Impl : ( ':' ) ;
    public final void rule__Email__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3815:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3816:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3816:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3817:1: ':'
            {
             before(grammarAccess.getEmailAccess().getColonKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Email__Group__3__Impl7947); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3830:1: rule__Email__Group__4 : rule__Email__Group__4__Impl rule__Email__Group__5 ;
    public final void rule__Email__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3834:1: ( rule__Email__Group__4__Impl rule__Email__Group__5 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3835:2: rule__Email__Group__4__Impl rule__Email__Group__5
            {
            pushFollow(FOLLOW_rule__Email__Group__4__Impl_in_rule__Email__Group__47978);
            rule__Email__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__5_in_rule__Email__Group__47981);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3842:1: rule__Email__Group__4__Impl : ( ( rule__Email__TitleAssignment_4 ) ) ;
    public final void rule__Email__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3846:1: ( ( ( rule__Email__TitleAssignment_4 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3847:1: ( ( rule__Email__TitleAssignment_4 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3847:1: ( ( rule__Email__TitleAssignment_4 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3848:1: ( rule__Email__TitleAssignment_4 )
            {
             before(grammarAccess.getEmailAccess().getTitleAssignment_4()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3849:1: ( rule__Email__TitleAssignment_4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3849:2: rule__Email__TitleAssignment_4
            {
            pushFollow(FOLLOW_rule__Email__TitleAssignment_4_in_rule__Email__Group__4__Impl8008);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3859:1: rule__Email__Group__5 : rule__Email__Group__5__Impl rule__Email__Group__6 ;
    public final void rule__Email__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3863:1: ( rule__Email__Group__5__Impl rule__Email__Group__6 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3864:2: rule__Email__Group__5__Impl rule__Email__Group__6
            {
            pushFollow(FOLLOW_rule__Email__Group__5__Impl_in_rule__Email__Group__58038);
            rule__Email__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__6_in_rule__Email__Group__58041);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3871:1: rule__Email__Group__5__Impl : ( ',' ) ;
    public final void rule__Email__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3875:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3876:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3876:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3877:1: ','
            {
             before(grammarAccess.getEmailAccess().getCommaKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Email__Group__5__Impl8069); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3890:1: rule__Email__Group__6 : rule__Email__Group__6__Impl rule__Email__Group__7 ;
    public final void rule__Email__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3894:1: ( rule__Email__Group__6__Impl rule__Email__Group__7 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3895:2: rule__Email__Group__6__Impl rule__Email__Group__7
            {
            pushFollow(FOLLOW_rule__Email__Group__6__Impl_in_rule__Email__Group__68100);
            rule__Email__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__7_in_rule__Email__Group__68103);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3902:1: rule__Email__Group__6__Impl : ( 'from' ) ;
    public final void rule__Email__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3906:1: ( ( 'from' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3907:1: ( 'from' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3907:1: ( 'from' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3908:1: 'from'
            {
             before(grammarAccess.getEmailAccess().getFromKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__Email__Group__6__Impl8131); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3921:1: rule__Email__Group__7 : rule__Email__Group__7__Impl rule__Email__Group__8 ;
    public final void rule__Email__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3925:1: ( rule__Email__Group__7__Impl rule__Email__Group__8 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3926:2: rule__Email__Group__7__Impl rule__Email__Group__8
            {
            pushFollow(FOLLOW_rule__Email__Group__7__Impl_in_rule__Email__Group__78162);
            rule__Email__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__8_in_rule__Email__Group__78165);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3933:1: rule__Email__Group__7__Impl : ( ':' ) ;
    public final void rule__Email__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3937:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3938:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3938:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3939:1: ':'
            {
             before(grammarAccess.getEmailAccess().getColonKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__Email__Group__7__Impl8193); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3952:1: rule__Email__Group__8 : rule__Email__Group__8__Impl rule__Email__Group__9 ;
    public final void rule__Email__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3956:1: ( rule__Email__Group__8__Impl rule__Email__Group__9 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3957:2: rule__Email__Group__8__Impl rule__Email__Group__9
            {
            pushFollow(FOLLOW_rule__Email__Group__8__Impl_in_rule__Email__Group__88224);
            rule__Email__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__9_in_rule__Email__Group__88227);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3964:1: rule__Email__Group__8__Impl : ( ( rule__Email__FromAssignment_8 ) ) ;
    public final void rule__Email__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3968:1: ( ( ( rule__Email__FromAssignment_8 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3969:1: ( ( rule__Email__FromAssignment_8 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3969:1: ( ( rule__Email__FromAssignment_8 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3970:1: ( rule__Email__FromAssignment_8 )
            {
             before(grammarAccess.getEmailAccess().getFromAssignment_8()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3971:1: ( rule__Email__FromAssignment_8 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3971:2: rule__Email__FromAssignment_8
            {
            pushFollow(FOLLOW_rule__Email__FromAssignment_8_in_rule__Email__Group__8__Impl8254);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3981:1: rule__Email__Group__9 : rule__Email__Group__9__Impl rule__Email__Group__10 ;
    public final void rule__Email__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3985:1: ( rule__Email__Group__9__Impl rule__Email__Group__10 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3986:2: rule__Email__Group__9__Impl rule__Email__Group__10
            {
            pushFollow(FOLLOW_rule__Email__Group__9__Impl_in_rule__Email__Group__98284);
            rule__Email__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__10_in_rule__Email__Group__98287);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3993:1: rule__Email__Group__9__Impl : ( ',' ) ;
    public final void rule__Email__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3997:1: ( ( ',' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3998:1: ( ',' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3998:1: ( ',' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:3999:1: ','
            {
             before(grammarAccess.getEmailAccess().getCommaKeyword_9()); 
            match(input,33,FOLLOW_33_in_rule__Email__Group__9__Impl8315); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4012:1: rule__Email__Group__10 : rule__Email__Group__10__Impl rule__Email__Group__11 ;
    public final void rule__Email__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4016:1: ( rule__Email__Group__10__Impl rule__Email__Group__11 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4017:2: rule__Email__Group__10__Impl rule__Email__Group__11
            {
            pushFollow(FOLLOW_rule__Email__Group__10__Impl_in_rule__Email__Group__108346);
            rule__Email__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__11_in_rule__Email__Group__108349);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4024:1: rule__Email__Group__10__Impl : ( 'message' ) ;
    public final void rule__Email__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4028:1: ( ( 'message' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4029:1: ( 'message' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4029:1: ( 'message' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4030:1: 'message'
            {
             before(grammarAccess.getEmailAccess().getMessageKeyword_10()); 
            match(input,37,FOLLOW_37_in_rule__Email__Group__10__Impl8377); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4043:1: rule__Email__Group__11 : rule__Email__Group__11__Impl rule__Email__Group__12 ;
    public final void rule__Email__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4047:1: ( rule__Email__Group__11__Impl rule__Email__Group__12 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4048:2: rule__Email__Group__11__Impl rule__Email__Group__12
            {
            pushFollow(FOLLOW_rule__Email__Group__11__Impl_in_rule__Email__Group__118408);
            rule__Email__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__12_in_rule__Email__Group__118411);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4055:1: rule__Email__Group__11__Impl : ( ':' ) ;
    public final void rule__Email__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4059:1: ( ( ':' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4060:1: ( ':' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4060:1: ( ':' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4061:1: ':'
            {
             before(grammarAccess.getEmailAccess().getColonKeyword_11()); 
            match(input,34,FOLLOW_34_in_rule__Email__Group__11__Impl8439); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4074:1: rule__Email__Group__12 : rule__Email__Group__12__Impl rule__Email__Group__13 ;
    public final void rule__Email__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4078:1: ( rule__Email__Group__12__Impl rule__Email__Group__13 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4079:2: rule__Email__Group__12__Impl rule__Email__Group__13
            {
            pushFollow(FOLLOW_rule__Email__Group__12__Impl_in_rule__Email__Group__128470);
            rule__Email__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__13_in_rule__Email__Group__128473);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4086:1: rule__Email__Group__12__Impl : ( ( rule__Email__ValueAssignment_12 ) ) ;
    public final void rule__Email__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4090:1: ( ( ( rule__Email__ValueAssignment_12 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4091:1: ( ( rule__Email__ValueAssignment_12 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4091:1: ( ( rule__Email__ValueAssignment_12 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4092:1: ( rule__Email__ValueAssignment_12 )
            {
             before(grammarAccess.getEmailAccess().getValueAssignment_12()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4093:1: ( rule__Email__ValueAssignment_12 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4093:2: rule__Email__ValueAssignment_12
            {
            pushFollow(FOLLOW_rule__Email__ValueAssignment_12_in_rule__Email__Group__12__Impl8500);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4103:1: rule__Email__Group__13 : rule__Email__Group__13__Impl rule__Email__Group__14 ;
    public final void rule__Email__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4107:1: ( rule__Email__Group__13__Impl rule__Email__Group__14 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4108:2: rule__Email__Group__13__Impl rule__Email__Group__14
            {
            pushFollow(FOLLOW_rule__Email__Group__13__Impl_in_rule__Email__Group__138530);
            rule__Email__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__14_in_rule__Email__Group__138533);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4115:1: rule__Email__Group__13__Impl : ( '}' ) ;
    public final void rule__Email__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4119:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4120:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4120:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4121:1: '}'
            {
             before(grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_13()); 
            match(input,27,FOLLOW_27_in_rule__Email__Group__13__Impl8561); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4134:1: rule__Email__Group__14 : rule__Email__Group__14__Impl rule__Email__Group__15 ;
    public final void rule__Email__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4138:1: ( rule__Email__Group__14__Impl rule__Email__Group__15 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4139:2: rule__Email__Group__14__Impl rule__Email__Group__15
            {
            pushFollow(FOLLOW_rule__Email__Group__14__Impl_in_rule__Email__Group__148592);
            rule__Email__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__15_in_rule__Email__Group__148595);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4146:1: rule__Email__Group__14__Impl : ( 'to' ) ;
    public final void rule__Email__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4150:1: ( ( 'to' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4151:1: ( 'to' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4151:1: ( 'to' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4152:1: 'to'
            {
             before(grammarAccess.getEmailAccess().getToKeyword_14()); 
            match(input,32,FOLLOW_32_in_rule__Email__Group__14__Impl8623); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4165:1: rule__Email__Group__15 : rule__Email__Group__15__Impl rule__Email__Group__16 ;
    public final void rule__Email__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4169:1: ( rule__Email__Group__15__Impl rule__Email__Group__16 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4170:2: rule__Email__Group__15__Impl rule__Email__Group__16
            {
            pushFollow(FOLLOW_rule__Email__Group__15__Impl_in_rule__Email__Group__158654);
            rule__Email__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Email__Group__16_in_rule__Email__Group__158657);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4177:1: rule__Email__Group__15__Impl : ( ( rule__Email__ToAssignment_15 ) ) ;
    public final void rule__Email__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4181:1: ( ( ( rule__Email__ToAssignment_15 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4182:1: ( ( rule__Email__ToAssignment_15 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4182:1: ( ( rule__Email__ToAssignment_15 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4183:1: ( rule__Email__ToAssignment_15 )
            {
             before(grammarAccess.getEmailAccess().getToAssignment_15()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4184:1: ( rule__Email__ToAssignment_15 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4184:2: rule__Email__ToAssignment_15
            {
            pushFollow(FOLLOW_rule__Email__ToAssignment_15_in_rule__Email__Group__15__Impl8684);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4194:1: rule__Email__Group__16 : rule__Email__Group__16__Impl ;
    public final void rule__Email__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4198:1: ( rule__Email__Group__16__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4199:2: rule__Email__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__Email__Group__16__Impl_in_rule__Email__Group__168714);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4205:1: rule__Email__Group__16__Impl : ( ';' ) ;
    public final void rule__Email__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4209:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4210:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4210:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4211:1: ';'
            {
             before(grammarAccess.getEmailAccess().getSemicolonKeyword_16()); 
            match(input,29,FOLLOW_29_in_rule__Email__Group__16__Impl8742); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4258:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4262:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4263:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__08807);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__08810);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4270:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4274:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4275:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4275:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4276:1: ( rule__Transition__NameAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4277:1: ( rule__Transition__NameAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4277:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl8837);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4287:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4291:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4292:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18867);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__18870);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4299:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TargetAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4303:1: ( ( ( rule__Transition__TargetAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4304:1: ( ( rule__Transition__TargetAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4304:1: ( ( rule__Transition__TargetAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4305:1: ( rule__Transition__TargetAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4306:1: ( rule__Transition__TargetAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4306:2: rule__Transition__TargetAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl8897);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4316:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4320:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4321:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28927);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28930);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4328:1: rule__Transition__Group__2__Impl : ( 'when' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4332:1: ( ( 'when' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4333:1: ( 'when' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4333:1: ( 'when' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4334:1: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Transition__Group__2__Impl8958); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4347:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4351:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4352:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38989);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__38992);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4359:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__EventAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4363:1: ( ( ( rule__Transition__EventAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4364:1: ( ( rule__Transition__EventAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4364:1: ( ( rule__Transition__EventAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4365:1: ( rule__Transition__EventAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4366:1: ( rule__Transition__EventAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4366:2: rule__Transition__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl9019);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4376:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4380:1: ( rule__Transition__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4381:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__49049);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4387:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4391:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4392:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4392:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4393:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Transition__Group__4__Impl9077); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4416:1: rule__IfExp__Group__0 : rule__IfExp__Group__0__Impl rule__IfExp__Group__1 ;
    public final void rule__IfExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4420:1: ( rule__IfExp__Group__0__Impl rule__IfExp__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4421:2: rule__IfExp__Group__0__Impl rule__IfExp__Group__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__09118);
            rule__IfExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__09121);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4428:1: rule__IfExp__Group__0__Impl : ( ( rule__IfExp__BlockAssignment_0 ) ) ;
    public final void rule__IfExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4432:1: ( ( ( rule__IfExp__BlockAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4433:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4433:1: ( ( rule__IfExp__BlockAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4434:1: ( rule__IfExp__BlockAssignment_0 )
            {
             before(grammarAccess.getIfExpAccess().getBlockAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4435:1: ( rule__IfExp__BlockAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4435:2: rule__IfExp__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl9148);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4445:1: rule__IfExp__Group__1 : rule__IfExp__Group__1__Impl rule__IfExp__Group__2 ;
    public final void rule__IfExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4449:1: ( rule__IfExp__Group__1__Impl rule__IfExp__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4450:2: rule__IfExp__Group__1__Impl rule__IfExp__Group__2
            {
            pushFollow(FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__19178);
            rule__IfExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__19181);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4457:1: rule__IfExp__Group__1__Impl : ( ( rule__IfExp__Group_1__0 )* ) ;
    public final void rule__IfExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4461:1: ( ( ( rule__IfExp__Group_1__0 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4462:1: ( ( rule__IfExp__Group_1__0 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4462:1: ( ( rule__IfExp__Group_1__0 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4463:1: ( rule__IfExp__Group_1__0 )*
            {
             before(grammarAccess.getIfExpAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4464:1: ( rule__IfExp__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==40) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4464:2: rule__IfExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl9208);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4474:1: rule__IfExp__Group__2 : rule__IfExp__Group__2__Impl ;
    public final void rule__IfExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4478:1: ( rule__IfExp__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4479:2: rule__IfExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__29239);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4485:1: rule__IfExp__Group__2__Impl : ( ( rule__IfExp__Group_2__0 )? ) ;
    public final void rule__IfExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4489:1: ( ( ( rule__IfExp__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4490:1: ( ( rule__IfExp__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4490:1: ( ( rule__IfExp__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4491:1: ( rule__IfExp__Group_2__0 )?
            {
             before(grammarAccess.getIfExpAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4492:1: ( rule__IfExp__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4492:2: rule__IfExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl9266);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4508:1: rule__IfExp__Group_1__0 : rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 ;
    public final void rule__IfExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4512:1: ( rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4513:2: rule__IfExp__Group_1__0__Impl rule__IfExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__09303);
            rule__IfExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__09306);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4520:1: rule__IfExp__Group_1__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4524:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4525:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4525:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4526:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__IfExp__Group_1__0__Impl9334); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4539:1: rule__IfExp__Group_1__1 : rule__IfExp__Group_1__1__Impl ;
    public final void rule__IfExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4543:1: ( rule__IfExp__Group_1__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4544:2: rule__IfExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__19365);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4550:1: rule__IfExp__Group_1__1__Impl : ( ( rule__IfExp__BlocksAssignment_1_1 ) ) ;
    public final void rule__IfExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4554:1: ( ( ( rule__IfExp__BlocksAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4555:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4555:1: ( ( rule__IfExp__BlocksAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4556:1: ( rule__IfExp__BlocksAssignment_1_1 )
            {
             before(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4557:1: ( rule__IfExp__BlocksAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4557:2: rule__IfExp__BlocksAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl9392);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4571:1: rule__IfExp__Group_2__0 : rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 ;
    public final void rule__IfExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4575:1: ( rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4576:2: rule__IfExp__Group_2__0__Impl rule__IfExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__09426);
            rule__IfExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__09429);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4583:1: rule__IfExp__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__IfExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4587:1: ( ( 'else' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4588:1: ( 'else' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4588:1: ( 'else' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4589:1: 'else'
            {
             before(grammarAccess.getIfExpAccess().getElseKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__IfExp__Group_2__0__Impl9457); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4602:1: rule__IfExp__Group_2__1 : rule__IfExp__Group_2__1__Impl ;
    public final void rule__IfExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4606:1: ( rule__IfExp__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4607:2: rule__IfExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__19488);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4613:1: rule__IfExp__Group_2__1__Impl : ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) ;
    public final void rule__IfExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4617:1: ( ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4618:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4618:1: ( ( rule__IfExp__DefaultBlockAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4619:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4620:1: ( rule__IfExp__DefaultBlockAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4620:2: rule__IfExp__DefaultBlockAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl9515);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4634:1: rule__CondBlock__Group__0 : rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 ;
    public final void rule__CondBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4638:1: ( rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4639:2: rule__CondBlock__Group__0__Impl rule__CondBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__09549);
            rule__CondBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__09552);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4646:1: rule__CondBlock__Group__0__Impl : ( 'if' ) ;
    public final void rule__CondBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4650:1: ( ( 'if' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4651:1: ( 'if' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4651:1: ( 'if' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4652:1: 'if'
            {
             before(grammarAccess.getCondBlockAccess().getIfKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__CondBlock__Group__0__Impl9580); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4665:1: rule__CondBlock__Group__1 : rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 ;
    public final void rule__CondBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4669:1: ( rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4670:2: rule__CondBlock__Group__1__Impl rule__CondBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__19611);
            rule__CondBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__19614);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4677:1: rule__CondBlock__Group__1__Impl : ( ( rule__CondBlock__CondAssignment_1 ) ) ;
    public final void rule__CondBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4681:1: ( ( ( rule__CondBlock__CondAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4682:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4682:1: ( ( rule__CondBlock__CondAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4683:1: ( rule__CondBlock__CondAssignment_1 )
            {
             before(grammarAccess.getCondBlockAccess().getCondAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4684:1: ( rule__CondBlock__CondAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4684:2: rule__CondBlock__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl9641);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4694:1: rule__CondBlock__Group__2 : rule__CondBlock__Group__2__Impl ;
    public final void rule__CondBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4698:1: ( rule__CondBlock__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4699:2: rule__CondBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__29671);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4705:1: rule__CondBlock__Group__2__Impl : ( ( rule__CondBlock__ActionAssignment_2 ) ) ;
    public final void rule__CondBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4709:1: ( ( ( rule__CondBlock__ActionAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4710:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4710:1: ( ( rule__CondBlock__ActionAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4711:1: ( rule__CondBlock__ActionAssignment_2 )
            {
             before(grammarAccess.getCondBlockAccess().getActionAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4712:1: ( rule__CondBlock__ActionAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4712:2: rule__CondBlock__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl9698);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4728:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4732:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4733:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09734);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09737);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4740:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4744:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4745:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4745:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4746:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4747:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4749:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4759:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4763:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4764:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19795);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19798);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4771:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4775:1: ( ( '{' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4776:1: ( '{' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4776:1: ( '{' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4777:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Block__Group__1__Impl9826); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4790:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4794:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4795:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29857);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29860);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4802:1: rule__Block__Group__2__Impl : ( ( rule__Block__StaAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4806:1: ( ( ( rule__Block__StaAssignment_2 )* ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4807:1: ( ( rule__Block__StaAssignment_2 )* )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4807:1: ( ( rule__Block__StaAssignment_2 )* )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4808:1: ( rule__Block__StaAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getStaAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4809:1: ( rule__Block__StaAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ML_COMMENT||(LA27_0>=40 && LA27_0<=56)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4809:2: rule__Block__StaAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl9887);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4819:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4823:1: ( rule__Block__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4824:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__39918);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4830:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4834:1: ( ( '}' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4835:1: ( '}' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4835:1: ( '}' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4836:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Block__Group__3__Impl9946); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4857:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4861:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4862:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__09985);
            rule__BoolExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__09988);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4869:1: rule__BoolExpression__Group__0__Impl : ( ruleTerminalBoolExpression ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4873:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4874:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4874:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4875:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl10015);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4886:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4890:1: ( rule__BoolExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4891:2: rule__BoolExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__110044);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4897:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4901:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4902:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4902:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4903:1: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4904:1: ( rule__BoolExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LOGIC_WORD) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4904:2: rule__BoolExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl10071);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4918:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4922:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4923:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__010106);
            rule__BoolExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__010109);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4930:1: rule__BoolExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4934:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4935:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4935:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4936:1: ()
            {
             before(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4937:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4939:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4949:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4953:1: ( rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4954:2: rule__BoolExpression__Group_1__1__Impl rule__BoolExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__110167);
            rule__BoolExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__110170);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4961:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__OpAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4965:1: ( ( ( rule__BoolExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4966:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4966:1: ( ( rule__BoolExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4967:1: ( rule__BoolExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4968:1: ( rule__BoolExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4968:2: rule__BoolExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl10197);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4978:1: rule__BoolExpression__Group_1__2 : rule__BoolExpression__Group_1__2__Impl ;
    public final void rule__BoolExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4982:1: ( rule__BoolExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4983:2: rule__BoolExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__210227);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4989:1: rule__BoolExpression__Group_1__2__Impl : ( ( rule__BoolExpression__RightAssignment_1_2 ) ) ;
    public final void rule__BoolExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4993:1: ( ( ( rule__BoolExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4994:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4994:1: ( ( rule__BoolExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4995:1: ( rule__BoolExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4996:1: ( rule__BoolExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:4996:2: rule__BoolExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl10254);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5012:1: rule__Brackets__Group__0 : rule__Brackets__Group__0__Impl rule__Brackets__Group__1 ;
    public final void rule__Brackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5016:1: ( rule__Brackets__Group__0__Impl rule__Brackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5017:2: rule__Brackets__Group__0__Impl rule__Brackets__Group__1
            {
            pushFollow(FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__010290);
            rule__Brackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__010293);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5024:1: rule__Brackets__Group__0__Impl : ( ( rule__Brackets__OpenAssignment_0 ) ) ;
    public final void rule__Brackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5028:1: ( ( ( rule__Brackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5029:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5029:1: ( ( rule__Brackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5030:1: ( rule__Brackets__OpenAssignment_0 )
            {
             before(grammarAccess.getBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5031:1: ( rule__Brackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5031:2: rule__Brackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl10320);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5041:1: rule__Brackets__Group__1 : rule__Brackets__Group__1__Impl rule__Brackets__Group__2 ;
    public final void rule__Brackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5045:1: ( rule__Brackets__Group__1__Impl rule__Brackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5046:2: rule__Brackets__Group__1__Impl rule__Brackets__Group__2
            {
            pushFollow(FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__110350);
            rule__Brackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__110353);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5053:1: rule__Brackets__Group__1__Impl : ( ( rule__Brackets__ObjAssignment_1 ) ) ;
    public final void rule__Brackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5057:1: ( ( ( rule__Brackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5058:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5058:1: ( ( rule__Brackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5059:1: ( rule__Brackets__ObjAssignment_1 )
            {
             before(grammarAccess.getBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5060:1: ( rule__Brackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5060:2: rule__Brackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10380);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5070:1: rule__Brackets__Group__2 : rule__Brackets__Group__2__Impl ;
    public final void rule__Brackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5074:1: ( rule__Brackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5075:2: rule__Brackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210410);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5081:1: rule__Brackets__Group__2__Impl : ( ( rule__Brackets__CloseAssignment_2 ) ) ;
    public final void rule__Brackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5085:1: ( ( ( rule__Brackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5086:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5086:1: ( ( rule__Brackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5087:1: ( rule__Brackets__CloseAssignment_2 )
            {
             before(grammarAccess.getBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5088:1: ( rule__Brackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5088:2: rule__Brackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10437);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5104:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5108:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5109:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010473);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010476);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5116:1: rule__CompareExpression__Group__0__Impl : ( ( rule__CompareExpression__LeftAssignment_0 ) ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5120:1: ( ( ( rule__CompareExpression__LeftAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5121:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5121:1: ( ( rule__CompareExpression__LeftAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5122:1: ( rule__CompareExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5123:1: ( rule__CompareExpression__LeftAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5123:2: rule__CompareExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10503);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5133:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5137:1: ( rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5138:2: rule__CompareExpression__Group__1__Impl rule__CompareExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110533);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110536);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5145:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__OpAssignment_1 ) ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5149:1: ( ( ( rule__CompareExpression__OpAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5150:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5150:1: ( ( rule__CompareExpression__OpAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5151:1: ( rule__CompareExpression__OpAssignment_1 )
            {
             before(grammarAccess.getCompareExpressionAccess().getOpAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5152:1: ( rule__CompareExpression__OpAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5152:2: rule__CompareExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10563);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5162:1: rule__CompareExpression__Group__2 : rule__CompareExpression__Group__2__Impl ;
    public final void rule__CompareExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5166:1: ( rule__CompareExpression__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5167:2: rule__CompareExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210593);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5173:1: rule__CompareExpression__Group__2__Impl : ( ( rule__CompareExpression__RightAssignment_2 ) ) ;
    public final void rule__CompareExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5177:1: ( ( ( rule__CompareExpression__RightAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5178:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5178:1: ( ( rule__CompareExpression__RightAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5179:1: ( rule__CompareExpression__RightAssignment_2 )
            {
             before(grammarAccess.getCompareExpressionAccess().getRightAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5180:1: ( rule__CompareExpression__RightAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5180:2: rule__CompareExpression__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5196:1: rule__NegExpression__Group__0 : rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 ;
    public final void rule__NegExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5200:1: ( rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5201:2: rule__NegExpression__Group__0__Impl rule__NegExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010656);
            rule__NegExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010659);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5208:1: rule__NegExpression__Group__0__Impl : ( ( rule__NegExpression__OpAssignment_0 ) ) ;
    public final void rule__NegExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5212:1: ( ( ( rule__NegExpression__OpAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5213:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5213:1: ( ( rule__NegExpression__OpAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5214:1: ( rule__NegExpression__OpAssignment_0 )
            {
             before(grammarAccess.getNegExpressionAccess().getOpAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5215:1: ( rule__NegExpression__OpAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5215:2: rule__NegExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10686);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5225:1: rule__NegExpression__Group__1 : rule__NegExpression__Group__1__Impl ;
    public final void rule__NegExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5229:1: ( rule__NegExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5230:2: rule__NegExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110716);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5236:1: rule__NegExpression__Group__1__Impl : ( ( rule__NegExpression__ObjAssignment_1 ) ) ;
    public final void rule__NegExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5240:1: ( ( ( rule__NegExpression__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5241:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5241:1: ( ( rule__NegExpression__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5242:1: ( rule__NegExpression__ObjAssignment_1 )
            {
             before(grammarAccess.getNegExpressionAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5243:1: ( rule__NegExpression__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5243:2: rule__NegExpression__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10743);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5257:1: rule__MathExpression__Group__0 : rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 ;
    public final void rule__MathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5261:1: ( rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5262:2: rule__MathExpression__Group__0__Impl rule__MathExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010777);
            rule__MathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010780);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5269:1: rule__MathExpression__Group__0__Impl : ( ruleMathTerminal ) ;
    public final void rule__MathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5273:1: ( ( ruleMathTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5274:1: ( ruleMathTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5274:1: ( ruleMathTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5275:1: ruleMathTerminal
            {
             before(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10807);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5286:1: rule__MathExpression__Group__1 : rule__MathExpression__Group__1__Impl ;
    public final void rule__MathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5290:1: ( rule__MathExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5291:2: rule__MathExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110836);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5297:1: rule__MathExpression__Group__1__Impl : ( ( rule__MathExpression__Group_1__0 )? ) ;
    public final void rule__MathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5301:1: ( ( ( rule__MathExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5302:1: ( ( rule__MathExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5302:1: ( ( rule__MathExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5303:1: ( rule__MathExpression__Group_1__0 )?
            {
             before(grammarAccess.getMathExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5304:1: ( rule__MathExpression__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_MATH) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5304:2: rule__MathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10863);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5318:1: rule__MathExpression__Group_1__0 : rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 ;
    public final void rule__MathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5322:1: ( rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5323:2: rule__MathExpression__Group_1__0__Impl rule__MathExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__010898);
            rule__MathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__010901);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5330:1: rule__MathExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5334:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5335:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5335:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5336:1: ()
            {
             before(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5337:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5339:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5349:1: rule__MathExpression__Group_1__1 : rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 ;
    public final void rule__MathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5353:1: ( rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5354:2: rule__MathExpression__Group_1__1__Impl rule__MathExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__110959);
            rule__MathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__110962);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5361:1: rule__MathExpression__Group_1__1__Impl : ( ( rule__MathExpression__OpAssignment_1_1 ) ) ;
    public final void rule__MathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5365:1: ( ( ( rule__MathExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5366:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5366:1: ( ( rule__MathExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5367:1: ( rule__MathExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5368:1: ( rule__MathExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5368:2: rule__MathExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl10989);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5378:1: rule__MathExpression__Group_1__2 : rule__MathExpression__Group_1__2__Impl ;
    public final void rule__MathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5382:1: ( rule__MathExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5383:2: rule__MathExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__211019);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5389:1: rule__MathExpression__Group_1__2__Impl : ( ( rule__MathExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5393:1: ( ( ( rule__MathExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5394:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5394:1: ( ( rule__MathExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5395:1: ( rule__MathExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5396:1: ( rule__MathExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5396:2: rule__MathExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl11046);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5412:1: rule__MathBrackets__Group__0 : rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 ;
    public final void rule__MathBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5416:1: ( rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5417:2: rule__MathBrackets__Group__0__Impl rule__MathBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__011082);
            rule__MathBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__011085);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5424:1: rule__MathBrackets__Group__0__Impl : ( ( rule__MathBrackets__OpenAssignment_0 ) ) ;
    public final void rule__MathBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5428:1: ( ( ( rule__MathBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5429:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5429:1: ( ( rule__MathBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5430:1: ( rule__MathBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getMathBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5431:1: ( rule__MathBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5431:2: rule__MathBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl11112);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5441:1: rule__MathBrackets__Group__1 : rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 ;
    public final void rule__MathBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5445:1: ( rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5446:2: rule__MathBrackets__Group__1__Impl rule__MathBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__111142);
            rule__MathBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__111145);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5453:1: rule__MathBrackets__Group__1__Impl : ( ( rule__MathBrackets__ObjAssignment_1 ) ) ;
    public final void rule__MathBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5457:1: ( ( ( rule__MathBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5458:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5458:1: ( ( rule__MathBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5459:1: ( rule__MathBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getMathBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5460:1: ( rule__MathBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5460:2: rule__MathBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl11172);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5470:1: rule__MathBrackets__Group__2 : rule__MathBrackets__Group__2__Impl ;
    public final void rule__MathBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5474:1: ( rule__MathBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5475:2: rule__MathBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__211202);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5481:1: rule__MathBrackets__Group__2__Impl : ( ( rule__MathBrackets__CloseAssignment_2 ) ) ;
    public final void rule__MathBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5485:1: ( ( ( rule__MathBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5486:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5486:1: ( ( rule__MathBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5487:1: ( rule__MathBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getMathBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5488:1: ( rule__MathBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5488:2: rule__MathBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl11229);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5504:1: rule__ConcatenationExpression__Group__0 : rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 ;
    public final void rule__ConcatenationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5508:1: ( rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5509:2: rule__ConcatenationExpression__Group__0__Impl rule__ConcatenationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__011265);
            rule__ConcatenationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__011268);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5516:1: rule__ConcatenationExpression__Group__0__Impl : ( ruleConcatenationTerminal ) ;
    public final void rule__ConcatenationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5520:1: ( ( ruleConcatenationTerminal ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5521:1: ( ruleConcatenationTerminal )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5521:1: ( ruleConcatenationTerminal )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5522:1: ruleConcatenationTerminal
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl11295);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5533:1: rule__ConcatenationExpression__Group__1 : rule__ConcatenationExpression__Group__1__Impl ;
    public final void rule__ConcatenationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5537:1: ( rule__ConcatenationExpression__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5538:2: rule__ConcatenationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__111324);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5544:1: rule__ConcatenationExpression__Group__1__Impl : ( ( rule__ConcatenationExpression__Group_1__0 )? ) ;
    public final void rule__ConcatenationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5548:1: ( ( ( rule__ConcatenationExpression__Group_1__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5549:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5549:1: ( ( rule__ConcatenationExpression__Group_1__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5550:1: ( rule__ConcatenationExpression__Group_1__0 )?
            {
             before(grammarAccess.getConcatenationExpressionAccess().getGroup_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5551:1: ( rule__ConcatenationExpression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_CONCATENATION) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5551:2: rule__ConcatenationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl11351);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5565:1: rule__ConcatenationExpression__Group_1__0 : rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 ;
    public final void rule__ConcatenationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5569:1: ( rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5570:2: rule__ConcatenationExpression__Group_1__0__Impl rule__ConcatenationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011386);
            rule__ConcatenationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011389);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5577:1: rule__ConcatenationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConcatenationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5581:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5582:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5582:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5583:1: ()
            {
             before(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5584:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5586:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5596:1: rule__ConcatenationExpression__Group_1__1 : rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 ;
    public final void rule__ConcatenationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5600:1: ( rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5601:2: rule__ConcatenationExpression__Group_1__1__Impl rule__ConcatenationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111447);
            rule__ConcatenationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111450);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5608:1: rule__ConcatenationExpression__Group_1__1__Impl : ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5612:1: ( ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5613:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5613:1: ( ( rule__ConcatenationExpression__OpAssignment_1_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5614:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5615:1: ( rule__ConcatenationExpression__OpAssignment_1_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5615:2: rule__ConcatenationExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11477);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5625:1: rule__ConcatenationExpression__Group_1__2 : rule__ConcatenationExpression__Group_1__2__Impl ;
    public final void rule__ConcatenationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5629:1: ( rule__ConcatenationExpression__Group_1__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5630:2: rule__ConcatenationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211507);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5636:1: rule__ConcatenationExpression__Group_1__2__Impl : ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConcatenationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5640:1: ( ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5641:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5641:1: ( ( rule__ConcatenationExpression__RightAssignment_1_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5642:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5643:1: ( rule__ConcatenationExpression__RightAssignment_1_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5643:2: rule__ConcatenationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11534);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5659:1: rule__ConcatenationBrackets__Group__0 : rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 ;
    public final void rule__ConcatenationBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5663:1: ( rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5664:2: rule__ConcatenationBrackets__Group__0__Impl rule__ConcatenationBrackets__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011570);
            rule__ConcatenationBrackets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011573);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5671:1: rule__ConcatenationBrackets__Group__0__Impl : ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) ;
    public final void rule__ConcatenationBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5675:1: ( ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5676:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5676:1: ( ( rule__ConcatenationBrackets__OpenAssignment_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5677:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5678:1: ( rule__ConcatenationBrackets__OpenAssignment_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5678:2: rule__ConcatenationBrackets__OpenAssignment_0
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11600);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5688:1: rule__ConcatenationBrackets__Group__1 : rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 ;
    public final void rule__ConcatenationBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5692:1: ( rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5693:2: rule__ConcatenationBrackets__Group__1__Impl rule__ConcatenationBrackets__Group__2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111630);
            rule__ConcatenationBrackets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111633);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5700:1: rule__ConcatenationBrackets__Group__1__Impl : ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) ;
    public final void rule__ConcatenationBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5704:1: ( ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5705:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5705:1: ( ( rule__ConcatenationBrackets__ObjAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5706:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5707:1: ( rule__ConcatenationBrackets__ObjAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5707:2: rule__ConcatenationBrackets__ObjAssignment_1
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11660);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5717:1: rule__ConcatenationBrackets__Group__2 : rule__ConcatenationBrackets__Group__2__Impl ;
    public final void rule__ConcatenationBrackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5721:1: ( rule__ConcatenationBrackets__Group__2__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5722:2: rule__ConcatenationBrackets__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211690);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5728:1: rule__ConcatenationBrackets__Group__2__Impl : ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) ;
    public final void rule__ConcatenationBrackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5732:1: ( ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5733:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5733:1: ( ( rule__ConcatenationBrackets__CloseAssignment_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5734:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5735:1: ( rule__ConcatenationBrackets__CloseAssignment_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5735:2: rule__ConcatenationBrackets__CloseAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11717);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5751:1: rule__StringVariable__Group__0 : rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 ;
    public final void rule__StringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5755:1: ( rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5756:2: rule__StringVariable__Group__0__Impl rule__StringVariable__Group__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011753);
            rule__StringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011756);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5763:1: rule__StringVariable__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5767:1: ( ( 'String' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5768:1: ( 'String' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5768:1: ( 'String' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5769:1: 'String'
            {
             before(grammarAccess.getStringVariableAccess().getStringKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__StringVariable__Group__0__Impl11784); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5782:1: rule__StringVariable__Group__1 : rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 ;
    public final void rule__StringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5786:1: ( rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5787:2: rule__StringVariable__Group__1__Impl rule__StringVariable__Group__2
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111815);
            rule__StringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111818);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5794:1: rule__StringVariable__Group__1__Impl : ( ( rule__StringVariable__NameAssignment_1 ) ) ;
    public final void rule__StringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5798:1: ( ( ( rule__StringVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5799:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5799:1: ( ( rule__StringVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5800:1: ( rule__StringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getStringVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5801:1: ( rule__StringVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5801:2: rule__StringVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11845);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5811:1: rule__StringVariable__Group__2 : rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 ;
    public final void rule__StringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5815:1: ( rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5816:2: rule__StringVariable__Group__2__Impl rule__StringVariable__Group__3
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__211875);
            rule__StringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__211878);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5823:1: rule__StringVariable__Group__2__Impl : ( ( rule__StringVariable__Group_2__0 )? ) ;
    public final void rule__StringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5827:1: ( ( ( rule__StringVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5828:1: ( ( rule__StringVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5828:1: ( ( rule__StringVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5829:1: ( rule__StringVariable__Group_2__0 )?
            {
             before(grammarAccess.getStringVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5830:1: ( rule__StringVariable__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=21 && LA31_0<=22)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5830:2: rule__StringVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl11905);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5840:1: rule__StringVariable__Group__3 : rule__StringVariable__Group__3__Impl ;
    public final void rule__StringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5844:1: ( rule__StringVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5845:2: rule__StringVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__311936);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5851:1: rule__StringVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__StringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5855:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5856:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5856:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5857:1: ';'
            {
             before(grammarAccess.getStringVariableAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__StringVariable__Group__3__Impl11964); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5878:1: rule__StringVariable__Group_2__0 : rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 ;
    public final void rule__StringVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5882:1: ( rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5883:2: rule__StringVariable__Group_2__0__Impl rule__StringVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__012003);
            rule__StringVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__012006);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5890:1: rule__StringVariable__Group_2__0__Impl : ( ( rule__StringVariable__Alternatives_2_0 ) ) ;
    public final void rule__StringVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5894:1: ( ( ( rule__StringVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5895:1: ( ( rule__StringVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5895:1: ( ( rule__StringVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5896:1: ( rule__StringVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getStringVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5897:1: ( rule__StringVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5897:2: rule__StringVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__StringVariable__Alternatives_2_0_in_rule__StringVariable__Group_2__0__Impl12033);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5907:1: rule__StringVariable__Group_2__1 : rule__StringVariable__Group_2__1__Impl ;
    public final void rule__StringVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5911:1: ( rule__StringVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5912:2: rule__StringVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__112063);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5918:1: rule__StringVariable__Group_2__1__Impl : ( ( rule__StringVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__StringVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5922:1: ( ( ( rule__StringVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5923:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5923:1: ( ( rule__StringVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5924:1: ( rule__StringVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getStringVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5925:1: ( rule__StringVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5925:2: rule__StringVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl12090);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5939:1: rule__NumVariable__Group__0 : rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 ;
    public final void rule__NumVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5943:1: ( rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5944:2: rule__NumVariable__Group__0__Impl rule__NumVariable__Group__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__012124);
            rule__NumVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__012127);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5951:1: rule__NumVariable__Group__0__Impl : ( 'Num' ) ;
    public final void rule__NumVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5955:1: ( ( 'Num' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5956:1: ( 'Num' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5956:1: ( 'Num' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5957:1: 'Num'
            {
             before(grammarAccess.getNumVariableAccess().getNumKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__NumVariable__Group__0__Impl12155); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5970:1: rule__NumVariable__Group__1 : rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 ;
    public final void rule__NumVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5974:1: ( rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5975:2: rule__NumVariable__Group__1__Impl rule__NumVariable__Group__2
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__112186);
            rule__NumVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__112189);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5982:1: rule__NumVariable__Group__1__Impl : ( ( rule__NumVariable__NameAssignment_1 ) ) ;
    public final void rule__NumVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5986:1: ( ( ( rule__NumVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5987:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5987:1: ( ( rule__NumVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5988:1: ( rule__NumVariable__NameAssignment_1 )
            {
             before(grammarAccess.getNumVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5989:1: ( rule__NumVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5989:2: rule__NumVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl12216);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:5999:1: rule__NumVariable__Group__2 : rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 ;
    public final void rule__NumVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6003:1: ( rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6004:2: rule__NumVariable__Group__2__Impl rule__NumVariable__Group__3
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__212246);
            rule__NumVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__212249);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6011:1: rule__NumVariable__Group__2__Impl : ( ( rule__NumVariable__Group_2__0 )? ) ;
    public final void rule__NumVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6015:1: ( ( ( rule__NumVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6016:1: ( ( rule__NumVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6016:1: ( ( rule__NumVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6017:1: ( rule__NumVariable__Group_2__0 )?
            {
             before(grammarAccess.getNumVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6018:1: ( rule__NumVariable__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=21 && LA32_0<=22)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6018:2: rule__NumVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl12276);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6028:1: rule__NumVariable__Group__3 : rule__NumVariable__Group__3__Impl ;
    public final void rule__NumVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6032:1: ( rule__NumVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6033:2: rule__NumVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__312307);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6039:1: rule__NumVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__NumVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6043:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6044:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6044:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6045:1: ';'
            {
             before(grammarAccess.getNumVariableAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__NumVariable__Group__3__Impl12335); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6066:1: rule__NumVariable__Group_2__0 : rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 ;
    public final void rule__NumVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6070:1: ( rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6071:2: rule__NumVariable__Group_2__0__Impl rule__NumVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012374);
            rule__NumVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012377);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6078:1: rule__NumVariable__Group_2__0__Impl : ( ( rule__NumVariable__Alternatives_2_0 ) ) ;
    public final void rule__NumVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6082:1: ( ( ( rule__NumVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6083:1: ( ( rule__NumVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6083:1: ( ( rule__NumVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6084:1: ( rule__NumVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getNumVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6085:1: ( rule__NumVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6085:2: rule__NumVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__NumVariable__Alternatives_2_0_in_rule__NumVariable__Group_2__0__Impl12404);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6095:1: rule__NumVariable__Group_2__1 : rule__NumVariable__Group_2__1__Impl ;
    public final void rule__NumVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6099:1: ( rule__NumVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6100:2: rule__NumVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112434);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6106:1: rule__NumVariable__Group_2__1__Impl : ( ( rule__NumVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__NumVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6110:1: ( ( ( rule__NumVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6111:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6111:1: ( ( rule__NumVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6112:1: ( rule__NumVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNumVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6113:1: ( rule__NumVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6113:2: rule__NumVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12461);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6127:1: rule__BoolVariable__Group__0 : rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 ;
    public final void rule__BoolVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6131:1: ( rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6132:2: rule__BoolVariable__Group__0__Impl rule__BoolVariable__Group__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012495);
            rule__BoolVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012498);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6139:1: rule__BoolVariable__Group__0__Impl : ( 'Bool' ) ;
    public final void rule__BoolVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6143:1: ( ( 'Bool' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6144:1: ( 'Bool' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6144:1: ( 'Bool' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6145:1: 'Bool'
            {
             before(grammarAccess.getBoolVariableAccess().getBoolKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__BoolVariable__Group__0__Impl12526); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6158:1: rule__BoolVariable__Group__1 : rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 ;
    public final void rule__BoolVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6162:1: ( rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6163:2: rule__BoolVariable__Group__1__Impl rule__BoolVariable__Group__2
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112557);
            rule__BoolVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112560);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6170:1: rule__BoolVariable__Group__1__Impl : ( ( rule__BoolVariable__NameAssignment_1 ) ) ;
    public final void rule__BoolVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6174:1: ( ( ( rule__BoolVariable__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6175:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6175:1: ( ( rule__BoolVariable__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6176:1: ( rule__BoolVariable__NameAssignment_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6177:1: ( rule__BoolVariable__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6177:2: rule__BoolVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12587);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6187:1: rule__BoolVariable__Group__2 : rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 ;
    public final void rule__BoolVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6191:1: ( rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6192:2: rule__BoolVariable__Group__2__Impl rule__BoolVariable__Group__3
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212617);
            rule__BoolVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212620);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6199:1: rule__BoolVariable__Group__2__Impl : ( ( rule__BoolVariable__Group_2__0 )? ) ;
    public final void rule__BoolVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6203:1: ( ( ( rule__BoolVariable__Group_2__0 )? ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6204:1: ( ( rule__BoolVariable__Group_2__0 )? )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6204:1: ( ( rule__BoolVariable__Group_2__0 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6205:1: ( rule__BoolVariable__Group_2__0 )?
            {
             before(grammarAccess.getBoolVariableAccess().getGroup_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6206:1: ( rule__BoolVariable__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=21 && LA33_0<=22)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6206:2: rule__BoolVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12647);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6216:1: rule__BoolVariable__Group__3 : rule__BoolVariable__Group__3__Impl ;
    public final void rule__BoolVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6220:1: ( rule__BoolVariable__Group__3__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6221:2: rule__BoolVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312678);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6227:1: rule__BoolVariable__Group__3__Impl : ( ';' ) ;
    public final void rule__BoolVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6231:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6232:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6232:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6233:1: ';'
            {
             before(grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__BoolVariable__Group__3__Impl12706); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6254:1: rule__BoolVariable__Group_2__0 : rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 ;
    public final void rule__BoolVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6258:1: ( rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6259:2: rule__BoolVariable__Group_2__0__Impl rule__BoolVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012745);
            rule__BoolVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012748);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6266:1: rule__BoolVariable__Group_2__0__Impl : ( ( rule__BoolVariable__Alternatives_2_0 ) ) ;
    public final void rule__BoolVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6270:1: ( ( ( rule__BoolVariable__Alternatives_2_0 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6271:1: ( ( rule__BoolVariable__Alternatives_2_0 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6271:1: ( ( rule__BoolVariable__Alternatives_2_0 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6272:1: ( rule__BoolVariable__Alternatives_2_0 )
            {
             before(grammarAccess.getBoolVariableAccess().getAlternatives_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6273:1: ( rule__BoolVariable__Alternatives_2_0 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6273:2: rule__BoolVariable__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__BoolVariable__Alternatives_2_0_in_rule__BoolVariable__Group_2__0__Impl12775);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6283:1: rule__BoolVariable__Group_2__1 : rule__BoolVariable__Group_2__1__Impl ;
    public final void rule__BoolVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6287:1: ( rule__BoolVariable__Group_2__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6288:2: rule__BoolVariable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112805);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6294:1: rule__BoolVariable__Group_2__1__Impl : ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) ;
    public final void rule__BoolVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6298:1: ( ( ( rule__BoolVariable__ValueAssignment_2_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6299:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6299:1: ( ( rule__BoolVariable__ValueAssignment_2_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6300:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6301:1: ( rule__BoolVariable__ValueAssignment_2_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6301:2: rule__BoolVariable__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12832);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6315:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6319:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6320:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__012866);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__012869);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6327:1: rule__Constant__Group__0__Impl : ( 'Const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6331:1: ( ( 'Const' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6332:1: ( 'Const' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6332:1: ( 'Const' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6333:1: 'Const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Constant__Group__0__Impl12897); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6346:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6350:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6351:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__112928);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__112931);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6358:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6362:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6363:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6363:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6364:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6365:1: ( rule__Constant__NameAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6365:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl12958);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6375:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6379:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6380:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__212988);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__212991);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6387:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__Alternatives_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6391:1: ( ( ( rule__Constant__Alternatives_2 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6392:1: ( ( rule__Constant__Alternatives_2 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6392:1: ( ( rule__Constant__Alternatives_2 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6393:1: ( rule__Constant__Alternatives_2 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_2()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6394:1: ( rule__Constant__Alternatives_2 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6394:2: rule__Constant__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_2_in_rule__Constant__Group__2__Impl13018);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6404:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6408:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6409:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__313048);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__313051);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6416:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6420:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6421:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6421:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6422:1: ( rule__Constant__ValueAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6423:1: ( rule__Constant__ValueAssignment_3 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6423:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl13078);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6433:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6437:1: ( rule__Constant__Group__4__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6438:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__413108);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6444:1: rule__Constant__Group__4__Impl : ( ';' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6448:1: ( ( ';' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6449:1: ( ';' )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6449:1: ( ';' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6450:1: ';'
            {
             before(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Constant__Group__4__Impl13136); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6473:1: rule__BoolLiteral__Group__0 : rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 ;
    public final void rule__BoolLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6477:1: ( rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6478:2: rule__BoolLiteral__Group__0__Impl rule__BoolLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__013177);
            rule__BoolLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__013180);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6485:1: rule__BoolLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BoolLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6489:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6490:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6490:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6491:1: ()
            {
             before(grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6492:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6494:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6504:1: rule__BoolLiteral__Group__1 : rule__BoolLiteral__Group__1__Impl ;
    public final void rule__BoolLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6508:1: ( rule__BoolLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6509:2: rule__BoolLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__113238);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6515:1: rule__BoolLiteral__Group__1__Impl : ( ( rule__BoolLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BoolLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6519:1: ( ( ( rule__BoolLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6520:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6520:1: ( ( rule__BoolLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6521:1: ( rule__BoolLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBoolLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6522:1: ( rule__BoolLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6522:2: rule__BoolLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl13265);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6536:1: rule__NumLiteral__Group__0 : rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 ;
    public final void rule__NumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6540:1: ( rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6541:2: rule__NumLiteral__Group__0__Impl rule__NumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__013299);
            rule__NumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__013302);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6548:1: rule__NumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6552:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6553:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6553:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6554:1: ()
            {
             before(grammarAccess.getNumLiteralAccess().getNumLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6555:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6557:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6567:1: rule__NumLiteral__Group__1 : rule__NumLiteral__Group__1__Impl ;
    public final void rule__NumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6571:1: ( rule__NumLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6572:2: rule__NumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__113360);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6578:1: rule__NumLiteral__Group__1__Impl : ( ( rule__NumLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6582:1: ( ( ( rule__NumLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6583:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6583:1: ( ( rule__NumLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6584:1: ( rule__NumLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6585:1: ( rule__NumLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6585:2: rule__NumLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl13387);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6599:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6603:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6604:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013421);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013424);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6611:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6615:1: ( ( () ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6616:1: ( () )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6616:1: ( () )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6617:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6618:1: ()
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6620:1: 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6630:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6634:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6635:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113482);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6641:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6645:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6646:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6646:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6647:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6648:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6648:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13509);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6663:1: rule__State__UnorderedGroup : rule__State__UnorderedGroup__0 {...}?;
    public final void rule__State__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup());
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6668:1: ( rule__State__UnorderedGroup__0 {...}?)
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6669:2: rule__State__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup13544);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6680:1: rule__State__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) ;
    public final void rule__State__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6685:1: ( ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6686:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6686:3: ( ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) ) )
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6688:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6688:4: ({...}? => ( ( ( rule__State__Group_0__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6689:5: {...}? => ( ( ( rule__State__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6689:100: ( ( ( rule__State__Group_0__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6690:6: ( ( rule__State__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6696:6: ( ( rule__State__Group_0__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6698:7: ( rule__State__Group_0__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_0()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6699:7: ( rule__State__Group_0__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6699:8: rule__State__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl13633);
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6705:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    {
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6705:4: ({...}? => ( ( ( rule__State__Group_1__0 ) ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6706:5: {...}? => ( ( ( rule__State__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6706:100: ( ( ( rule__State__Group_1__0 ) ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6707:6: ( ( rule__State__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6713:6: ( ( rule__State__Group_1__0 ) )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6715:7: ( rule__State__Group_1__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_1()); 
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6716:7: ( rule__State__Group_1__0 )
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6716:8: rule__State__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl13724);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6731:1: rule__State__UnorderedGroup__0 : rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? ;
    public final void rule__State__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6735:1: ( rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )? )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6736:2: rule__State__UnorderedGroup__Impl ( rule__State__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__013783);
            rule__State__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6737:2: ( rule__State__UnorderedGroup__1 )?
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
                    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6737:2: rule__State__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__013786);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6744:1: rule__State__UnorderedGroup__1 : rule__State__UnorderedGroup__Impl ;
    public final void rule__State__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6748:1: ( rule__State__UnorderedGroup__Impl )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6749:2: rule__State__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__113811);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6760:1: rule__Document__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6764:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6765:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6765:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6766:1: RULE_ID
            {
             before(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113843); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6775:1: rule__Document__ElementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Document__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6779:1: ( ( ruleStatement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6780:1: ( ruleStatement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6780:1: ( ruleStatement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6781:1: ruleStatement
            {
             before(grammarAccess.getDocumentAccess().getElementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_213874);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6790:1: rule__Document__StaAssignment_3 : ( ruleState ) ;
    public final void rule__Document__StaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6794:1: ( ( ruleState ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6795:1: ( ruleState )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6795:1: ( ruleState )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6796:1: ruleState
            {
             before(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Document__StaAssignment_313905);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6805:1: rule__Statement__ComAssignment_4 : ( RULE_ML_COMMENT ) ;
    public final void rule__Statement__ComAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6809:1: ( ( RULE_ML_COMMENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6810:1: ( RULE_ML_COMMENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6810:1: ( RULE_ML_COMMENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6811:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_413936); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6820:1: rule__State__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6824:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6825:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6825:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6826:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_113967); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6835:1: rule__State__TimesAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__State__TimesAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6839:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6840:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6840:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6841:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_113998); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6850:1: rule__State__TimeoutAssignment_1_0_1 : ( RULE_INT ) ;
    public final void rule__State__TimeoutAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6854:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6855:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6855:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6856:1: RULE_INT
            {
             before(grammarAccess.getStateAccess().getTimeoutINTTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_114029); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6865:1: rule__State__StmsAssignment_1_2 : ( ruleAbstractElement ) ;
    public final void rule__State__StmsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6869:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6870:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6870:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6871:1: ruleAbstractElement
            {
             before(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_1_214060);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6880:1: rule__Call__NameAssignment_0 : ( ( 'Call' ) ) ;
    public final void rule__Call__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6884:1: ( ( ( 'Call' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6885:1: ( ( 'Call' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6885:1: ( ( 'Call' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6886:1: ( 'Call' )
            {
             before(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6887:1: ( 'Call' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6888:1: 'Call'
            {
             before(grammarAccess.getCallAccess().getNameCallKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Call__NameAssignment_014096); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6903:1: rule__Call__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Call__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6907:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6908:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6908:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6909:1: ruleConcatenationExpression
            {
             before(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_114135);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6918:1: rule__Dial__NameAssignment_0 : ( ( 'DialTo' ) ) ;
    public final void rule__Dial__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6922:1: ( ( ( 'DialTo' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6923:1: ( ( 'DialTo' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6923:1: ( ( 'DialTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6924:1: ( 'DialTo' )
            {
             before(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6925:1: ( 'DialTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6926:1: 'DialTo'
            {
             before(grammarAccess.getDialAccess().getNameDialToKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Dial__NameAssignment_014171); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6941:1: rule__Dial__ToAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Dial__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6945:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6946:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6946:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6947:1: ruleConcatenationExpression
            {
             before(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_114210);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6956:1: rule__Play__NameAssignment_0 : ( ( 'Play' ) ) ;
    public final void rule__Play__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6960:1: ( ( ( 'Play' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6961:1: ( ( 'Play' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6961:1: ( ( 'Play' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6962:1: ( 'Play' )
            {
             before(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6963:1: ( 'Play' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6964:1: 'Play'
            {
             before(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Play__NameAssignment_014246); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6979:1: rule__Play__FileAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Play__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6983:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6984:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6984:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6985:1: ruleConcatenationExpression
            {
             before(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_114285);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6994:1: rule__Record__NameAssignment_0 : ( ( 'Record' ) ) ;
    public final void rule__Record__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6998:1: ( ( ( 'Record' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6999:1: ( ( 'Record' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:6999:1: ( ( 'Record' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7000:1: ( 'Record' )
            {
             before(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7001:1: ( 'Record' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7002:1: 'Record'
            {
             before(grammarAccess.getRecordAccess().getNameRecordKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Record__NameAssignment_014321); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7017:1: rule__Record__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Record__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7021:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7022:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7022:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7023:1: RULE_INT
            {
             before(grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_114360); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7032:1: rule__Reject__NameAssignment : ( ( 'Reject;' ) ) ;
    public final void rule__Reject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7036:1: ( ( ( 'Reject;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7037:1: ( ( 'Reject;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7037:1: ( ( 'Reject;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7038:1: ( 'Reject;' )
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7039:1: ( 'Reject;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7040:1: 'Reject;'
            {
             before(grammarAccess.getRejectAccess().getNameRejectKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Reject__NameAssignment14396); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7055:1: rule__Hangup__NameAssignment : ( ( 'HangUp;' ) ) ;
    public final void rule__Hangup__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7059:1: ( ( ( 'HangUp;' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7060:1: ( ( 'HangUp;' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7060:1: ( ( 'HangUp;' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7061:1: ( 'HangUp;' )
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7062:1: ( 'HangUp;' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7063:1: 'HangUp;'
            {
             before(grammarAccess.getHangupAccess().getNameHangUpKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Hangup__NameAssignment14440); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7078:1: rule__GetDigits__NameAssignment_0 : ( ( 'Gather' ) ) ;
    public final void rule__GetDigits__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7082:1: ( ( ( 'Gather' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7083:1: ( ( 'Gather' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7083:1: ( ( 'Gather' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7084:1: ( 'Gather' )
            {
             before(grammarAccess.getGetDigitsAccess().getNameGatherKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7085:1: ( 'Gather' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7086:1: 'Gather'
            {
             before(grammarAccess.getGetDigitsAccess().getNameGatherKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__GetDigits__NameAssignment_014484); 
             after(grammarAccess.getGetDigitsAccess().getNameGatherKeyword_0_0()); 

            }

             after(grammarAccess.getGetDigitsAccess().getNameGatherKeyword_0_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7101:1: rule__GetDigits__NumDigitsAssignment_1 : ( RULE_INT ) ;
    public final void rule__GetDigits__NumDigitsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7105:1: ( ( RULE_INT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7106:1: ( RULE_INT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7106:1: ( RULE_INT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7107:1: RULE_INT
            {
             before(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_114523); 
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


    // $ANTLR start "rule__Send__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7116:1: rule__Send__NameAssignment_0 : ( ( 'Send' ) ) ;
    public final void rule__Send__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7120:1: ( ( ( 'Send' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7121:1: ( ( 'Send' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7121:1: ( ( 'Send' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7122:1: ( 'Send' )
            {
             before(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7123:1: ( 'Send' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7124:1: 'Send'
            {
             before(grammarAccess.getSendAccess().getNameSendKeyword_0_0()); 
            match(input,52,FOLLOW_52_in_rule__Send__NameAssignment_014559); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7139:1: rule__Send__ParamsAssignment_1 : ( ruleSendBlock ) ;
    public final void rule__Send__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7143:1: ( ( ruleSendBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7144:1: ( ruleSendBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7144:1: ( ruleSendBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7145:1: ruleSendBlock
            {
             before(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114598);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7154:1: rule__Send__UrlAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Send__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7158:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7159:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7159:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7160:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314629);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7169:1: rule__SendBlock__ValueAssignment_2 : ( ruleParam ) ;
    public final void rule__SendBlock__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7173:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7174:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7174:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7175:1: ruleParam
            {
             before(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214660);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7184:1: rule__SendBlock__StmsAssignment_3 : ( ruleNotPrimaryParam ) ;
    public final void rule__SendBlock__StmsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7188:1: ( ( ruleNotPrimaryParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7189:1: ( ruleNotPrimaryParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7189:1: ( ruleNotPrimaryParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7190:1: ruleNotPrimaryParam
            {
             before(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314691);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7199:1: rule__NotPrimaryParam__ValueAssignment_1 : ( ruleParam ) ;
    public final void rule__NotPrimaryParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7203:1: ( ( ruleParam ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7204:1: ( ruleParam )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7204:1: ( ruleParam )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7205:1: ruleParam
            {
             before(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114722);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7214:1: rule__Param__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7218:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7219:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7219:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7220:1: RULE_STRING
            {
             before(grammarAccess.getParamAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Param__NameAssignment_014753); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7229:1: rule__Param__ValueAssignment_2 : ( ruleConcatenationExpression ) ;
    public final void rule__Param__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7233:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7234:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7234:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7235:1: ruleConcatenationExpression
            {
             before(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214784);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7244:1: rule__Say__NameAssignment_0 : ( ( 'Say' ) ) ;
    public final void rule__Say__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7248:1: ( ( ( 'Say' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7249:1: ( ( 'Say' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7249:1: ( ( 'Say' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7250:1: ( 'Say' )
            {
             before(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7251:1: ( 'Say' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7252:1: 'Say'
            {
             before(grammarAccess.getSayAccess().getNameSayKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__Say__NameAssignment_014820); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7267:1: rule__Say__ThatAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Say__ThatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7271:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7272:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7272:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7273:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114859);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7282:1: rule__Sms__NameAssignment_0 : ( ( 'Sms' ) ) ;
    public final void rule__Sms__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7286:1: ( ( ( 'Sms' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7287:1: ( ( 'Sms' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7287:1: ( ( 'Sms' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7288:1: ( 'Sms' )
            {
             before(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7289:1: ( 'Sms' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7290:1: 'Sms'
            {
             before(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0()); 
            match(input,54,FOLLOW_54_in_rule__Sms__NameAssignment_014895); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7305:1: rule__Sms__ValueAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__Sms__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7309:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7310:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7310:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7311:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Sms__ValueAssignment_114934);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7320:1: rule__Sms__ToAssignment_3 : ( ruleConcatenationExpression ) ;
    public final void rule__Sms__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7324:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7325:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7325:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7326:1: ruleConcatenationExpression
            {
             before(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Sms__ToAssignment_314965);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7335:1: rule__Email__NameAssignment_0 : ( ( 'Email' ) ) ;
    public final void rule__Email__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7339:1: ( ( ( 'Email' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7340:1: ( ( 'Email' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7340:1: ( ( 'Email' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7341:1: ( 'Email' )
            {
             before(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7342:1: ( 'Email' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7343:1: 'Email'
            {
             before(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__Email__NameAssignment_015001); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7358:1: rule__Email__TitleAssignment_4 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7362:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7363:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7363:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7364:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__TitleAssignment_415040);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7373:1: rule__Email__FromAssignment_8 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__FromAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7377:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7378:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7378:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7379:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__FromAssignment_815071);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7388:1: rule__Email__ValueAssignment_12 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__ValueAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7392:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7393:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7393:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7394:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__ValueAssignment_1215102);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7403:1: rule__Email__ToAssignment_15 : ( ruleConcatenationExpression ) ;
    public final void rule__Email__ToAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7407:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7408:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7408:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7409:1: ruleConcatenationExpression
            {
             before(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__Email__ToAssignment_1515133);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7418:1: rule__Transition__NameAssignment_0 : ( ( 'GoTo' ) ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7422:1: ( ( ( 'GoTo' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7423:1: ( ( 'GoTo' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7423:1: ( ( 'GoTo' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7424:1: ( 'GoTo' )
            {
             before(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7425:1: ( 'GoTo' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7426:1: 'GoTo'
            {
             before(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0()); 
            match(input,56,FOLLOW_56_in_rule__Transition__NameAssignment_015169); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7441:1: rule__Transition__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7445:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7446:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7446:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7447:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7448:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7449:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_115212); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7460:1: rule__Transition__EventAssignment_3 : ( ruleEVENT ) ;
    public final void rule__Transition__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7464:1: ( ( ruleEVENT ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7465:1: ( ruleEVENT )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7465:1: ( ruleEVENT )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7466:1: ruleEVENT
            {
             before(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEVENT_in_rule__Transition__EventAssignment_315247);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7475:1: rule__IfExp__BlockAssignment_0 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7479:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7480:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7480:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7481:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_015278);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7490:1: rule__IfExp__BlocksAssignment_1_1 : ( ruleCondBlock ) ;
    public final void rule__IfExp__BlocksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7494:1: ( ( ruleCondBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7495:1: ( ruleCondBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7495:1: ( ruleCondBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7496:1: ruleCondBlock
            {
             before(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_115309);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7505:1: rule__IfExp__DefaultBlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__IfExp__DefaultBlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7509:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7510:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7510:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7511:1: ruleBlock
            {
             before(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_115340);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7520:1: rule__CondBlock__CondAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__CondBlock__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7524:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7525:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7525:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7526:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_115371);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7535:1: rule__CondBlock__ActionAssignment_2 : ( ruleBlock ) ;
    public final void rule__CondBlock__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7539:1: ( ( ruleBlock ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7540:1: ( ruleBlock )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7540:1: ( ruleBlock )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7541:1: ruleBlock
            {
             before(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_215402);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7550:1: rule__Block__StaAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Block__StaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7554:1: ( ( ruleAbstractElement ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7555:1: ( ruleAbstractElement )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7555:1: ( ruleAbstractElement )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7556:1: ruleAbstractElement
            {
             before(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_215433);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7565:1: rule__BoolExpression__OpAssignment_1_1 : ( RULE_LOGIC_WORD ) ;
    public final void rule__BoolExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7569:1: ( ( RULE_LOGIC_WORD ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7570:1: ( RULE_LOGIC_WORD )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7570:1: ( RULE_LOGIC_WORD )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7571:1: RULE_LOGIC_WORD
            {
             before(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 
            match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_115464); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7580:1: rule__BoolExpression__RightAssignment_1_2 : ( ruleBoolExpression ) ;
    public final void rule__BoolExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7584:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7585:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7585:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7586:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_215495);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7595:1: rule__Brackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__Brackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7599:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7600:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7600:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7601:1: RULE_OBRACKET
            {
             before(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_015526); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7610:1: rule__Brackets__ObjAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__Brackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7614:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7615:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7615:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7616:1: ruleBoolExpression
            {
             before(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_115557);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7625:1: rule__Brackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__Brackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7629:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7630:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7630:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7631:1: RULE_CBRACKET
            {
             before(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_215588); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7640:1: rule__CompareExpression__LeftAssignment_0 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7644:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7645:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7645:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7646:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_015619);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7655:1: rule__CompareExpression__OpAssignment_1 : ( RULE_COMPARE ) ;
    public final void rule__CompareExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7659:1: ( ( RULE_COMPARE ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7660:1: ( RULE_COMPARE )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7660:1: ( RULE_COMPARE )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7661:1: RULE_COMPARE
            {
             before(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 
            match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115650); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7670:1: rule__CompareExpression__RightAssignment_2 : ( ruleLiteralAbs ) ;
    public final void rule__CompareExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7674:1: ( ( ruleLiteralAbs ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7675:1: ( ruleLiteralAbs )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7675:1: ( ruleLiteralAbs )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7676:1: ruleLiteralAbs
            {
             before(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215681);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7685:1: rule__NegExpression__OpAssignment_0 : ( RULE_NEGATION ) ;
    public final void rule__NegExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7689:1: ( ( RULE_NEGATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7690:1: ( RULE_NEGATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7690:1: ( RULE_NEGATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7691:1: RULE_NEGATION
            {
             before(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 
            match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015712); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7700:1: rule__NegExpression__ObjAssignment_1 : ( ruleTerminalBoolExpression ) ;
    public final void rule__NegExpression__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7704:1: ( ( ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7705:1: ( ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7705:1: ( ruleTerminalBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7706:1: ruleTerminalBoolExpression
            {
             before(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115743);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7715:1: rule__MathExpression__OpAssignment_1_1 : ( RULE_MATH ) ;
    public final void rule__MathExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7719:1: ( ( RULE_MATH ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7720:1: ( RULE_MATH )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7720:1: ( RULE_MATH )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7721:1: RULE_MATH
            {
             before(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 
            match(input,RULE_MATH,FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115774); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7730:1: rule__MathExpression__RightAssignment_1_2 : ( ruleMathExpression ) ;
    public final void rule__MathExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7734:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7735:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7735:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7736:1: ruleMathExpression
            {
             before(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215805);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7745:1: rule__MathBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__MathBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7749:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7750:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7750:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7751:1: RULE_OBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015836); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7760:1: rule__MathBrackets__ObjAssignment_1 : ( ruleMathExpression ) ;
    public final void rule__MathBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7764:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7765:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7765:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7766:1: ruleMathExpression
            {
             before(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115867);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7775:1: rule__MathBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__MathBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7779:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7780:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7780:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7781:1: RULE_CBRACKET
            {
             before(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215898); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7790:1: rule__ConcatenationExpression__OpAssignment_1_1 : ( RULE_CONCATENATION ) ;
    public final void rule__ConcatenationExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7794:1: ( ( RULE_CONCATENATION ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7795:1: ( RULE_CONCATENATION )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7795:1: ( RULE_CONCATENATION )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7796:1: RULE_CONCATENATION
            {
             before(grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0()); 
            match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_115929); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7805:1: rule__ConcatenationExpression__RightAssignment_1_2 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7809:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7810:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7810:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7811:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215960);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7820:1: rule__ConcatenationBrackets__OpenAssignment_0 : ( RULE_OBRACKET ) ;
    public final void rule__ConcatenationBrackets__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7824:1: ( ( RULE_OBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7825:1: ( RULE_OBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7825:1: ( RULE_OBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7826:1: RULE_OBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015991); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7835:1: rule__ConcatenationBrackets__ObjAssignment_1 : ( ruleConcatenationExpression ) ;
    public final void rule__ConcatenationBrackets__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7839:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7840:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7840:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7841:1: ruleConcatenationExpression
            {
             before(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_116022);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7850:1: rule__ConcatenationBrackets__CloseAssignment_2 : ( RULE_CBRACKET ) ;
    public final void rule__ConcatenationBrackets__CloseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7854:1: ( ( RULE_CBRACKET ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7855:1: ( RULE_CBRACKET )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7855:1: ( RULE_CBRACKET )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7856:1: RULE_CBRACKET
            {
             before(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_216053); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7865:1: rule__StringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7869:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7870:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7870:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7871:1: RULE_ID
            {
             before(grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_116084); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7880:1: rule__StringVariable__ValueAssignment_2_1 : ( ruleConcatenationExpression ) ;
    public final void rule__StringVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7884:1: ( ( ruleConcatenationExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7885:1: ( ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7885:1: ( ruleConcatenationExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7886:1: ruleConcatenationExpression
            {
             before(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_116115);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7895:1: rule__NumVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7899:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7900:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7900:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7901:1: RULE_ID
            {
             before(grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_116146); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7910:1: rule__NumVariable__ValueAssignment_2_1 : ( ruleMathExpression ) ;
    public final void rule__NumVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7914:1: ( ( ruleMathExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7915:1: ( ruleMathExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7915:1: ( ruleMathExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7916:1: ruleMathExpression
            {
             before(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_116177);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7925:1: rule__BoolVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BoolVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7929:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7930:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7930:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7931:1: RULE_ID
            {
             before(grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_116208); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7940:1: rule__BoolVariable__ValueAssignment_2_1 : ( ruleBoolExpression ) ;
    public final void rule__BoolVariable__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7944:1: ( ( ruleBoolExpression ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7945:1: ( ruleBoolExpression )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7945:1: ( ruleBoolExpression )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7946:1: ruleBoolExpression
            {
             before(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_116239);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7955:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7959:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7960:1: ( RULE_ID )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7960:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7961:1: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_116270); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7970:1: rule__Constant__ValueAssignment_3 : ( rulePrimitive ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7974:1: ( ( rulePrimitive ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7975:1: ( rulePrimitive )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7975:1: ( rulePrimitive )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7976:1: rulePrimitive
            {
             before(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__Constant__ValueAssignment_316301);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7985:1: rule__Literal__VAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Literal__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7989:1: ( ( ( RULE_ID ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7990:1: ( ( RULE_ID ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7990:1: ( ( RULE_ID ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7991:1: ( RULE_ID )
            {
             before(grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7992:1: ( RULE_ID )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:7993:1: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getVVarsIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Literal__VAssignment_016336); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8004:1: rule__Literal__NulAssignment_1 : ( RULE_NULL ) ;
    public final void rule__Literal__NulAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8008:1: ( ( RULE_NULL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8009:1: ( RULE_NULL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8009:1: ( RULE_NULL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8010:1: RULE_NULL
            {
             before(grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 
            match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_116371); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8019:1: rule__BoolLiteral__ValueAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__BoolLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8023:1: ( ( RULE_BOOL ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8024:1: ( RULE_BOOL )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8024:1: ( RULE_BOOL )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8025:1: RULE_BOOL
            {
             before(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_116402); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8034:1: rule__NumLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8038:1: ( ( ruleNumber ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8039:1: ( ruleNumber )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8039:1: ( ruleNumber )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8040:1: ruleNumber
            {
             before(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_116433);
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8049:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8053:1: ( ( RULE_STRING ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8054:1: ( RULE_STRING )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8054:1: ( RULE_STRING )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8055:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116464); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8064:1: rule__EVENT__NameAssignment_0 : ( ( 'HANGUP' ) ) ;
    public final void rule__EVENT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8068:1: ( ( ( 'HANGUP' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8069:1: ( ( 'HANGUP' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8069:1: ( ( 'HANGUP' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8070:1: ( 'HANGUP' )
            {
             before(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8071:1: ( 'HANGUP' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8072:1: 'HANGUP'
            {
             before(grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__EVENT__NameAssignment_016500); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8087:1: rule__EVENT__NameAssignment_1 : ( ( 'COMPLETED' ) ) ;
    public final void rule__EVENT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8091:1: ( ( ( 'COMPLETED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8092:1: ( ( 'COMPLETED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8092:1: ( ( 'COMPLETED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8093:1: ( 'COMPLETED' )
            {
             before(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8094:1: ( 'COMPLETED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8095:1: 'COMPLETED'
            {
             before(grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0()); 
            match(input,58,FOLLOW_58_in_rule__EVENT__NameAssignment_116544); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8110:1: rule__EVENT__NameAssignment_2 : ( ( 'ERROR' ) ) ;
    public final void rule__EVENT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8114:1: ( ( ( 'ERROR' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8115:1: ( ( 'ERROR' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8115:1: ( ( 'ERROR' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8116:1: ( 'ERROR' )
            {
             before(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8117:1: ( 'ERROR' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8118:1: 'ERROR'
            {
             before(grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__EVENT__NameAssignment_216588); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8133:1: rule__EVENT__NameAssignment_3 : ( ( 'TIMES' ) ) ;
    public final void rule__EVENT__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8137:1: ( ( ( 'TIMES' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8138:1: ( ( 'TIMES' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8138:1: ( ( 'TIMES' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8139:1: ( 'TIMES' )
            {
             before(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8140:1: ( 'TIMES' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8141:1: 'TIMES'
            {
             before(grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0()); 
            match(input,60,FOLLOW_60_in_rule__EVENT__NameAssignment_316632); 
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


    // $ANTLR start "rule__SESSION__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8156:1: rule__SESSION__NameAssignment_0 : ( ( 'CALLER' ) ) ;
    public final void rule__SESSION__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8160:1: ( ( ( 'CALLER' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8161:1: ( ( 'CALLER' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8161:1: ( ( 'CALLER' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8162:1: ( 'CALLER' )
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8163:1: ( 'CALLER' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8164:1: 'CALLER'
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0()); 
            match(input,61,FOLLOW_61_in_rule__SESSION__NameAssignment_016676); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8179:1: rule__SESSION__NameAssignment_1 : ( ( 'LASTSTATE' ) ) ;
    public final void rule__SESSION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8183:1: ( ( ( 'LASTSTATE' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8184:1: ( ( 'LASTSTATE' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8184:1: ( ( 'LASTSTATE' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8185:1: ( 'LASTSTATE' )
            {
             before(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8186:1: ( 'LASTSTATE' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8187:1: 'LASTSTATE'
            {
             before(grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0()); 
            match(input,62,FOLLOW_62_in_rule__SESSION__NameAssignment_116720); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8202:1: rule__SESSION__NameAssignment_2 : ( ( 'CALLED' ) ) ;
    public final void rule__SESSION__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8206:1: ( ( ( 'CALLED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8207:1: ( ( 'CALLED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8207:1: ( ( 'CALLED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8208:1: ( 'CALLED' )
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8209:1: ( 'CALLED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8210:1: 'CALLED'
            {
             before(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_2_0()); 
            match(input,63,FOLLOW_63_in_rule__SESSION__NameAssignment_216764); 
             after(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_2_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_2_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8225:1: rule__SESSION__NameAssignment_3 : ( ( 'DIGITS' ) ) ;
    public final void rule__SESSION__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8229:1: ( ( ( 'DIGITS' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8230:1: ( ( 'DIGITS' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8230:1: ( ( 'DIGITS' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8231:1: ( 'DIGITS' )
            {
             before(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8232:1: ( 'DIGITS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8233:1: 'DIGITS'
            {
             before(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_3_0()); 
            match(input,64,FOLLOW_64_in_rule__SESSION__NameAssignment_316808); 
             after(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_3_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_3_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8248:1: rule__SESSION__NameAssignment_4 : ( ( 'RECORD' ) ) ;
    public final void rule__SESSION__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8252:1: ( ( ( 'RECORD' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8253:1: ( ( 'RECORD' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8253:1: ( ( 'RECORD' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8254:1: ( 'RECORD' )
            {
             before(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_4_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8255:1: ( 'RECORD' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8256:1: 'RECORD'
            {
             before(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_4_0()); 
            match(input,65,FOLLOW_65_in_rule__SESSION__NameAssignment_416852); 
             after(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_4_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameRECORDKeyword_4_0()); 

            }


            }

        }
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8271:1: rule__SESSION__NameAssignment_5 : ( ( 'TIMES' ) ) ;
    public final void rule__SESSION__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8275:1: ( ( ( 'TIMES' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8276:1: ( ( 'TIMES' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8276:1: ( ( 'TIMES' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8277:1: ( 'TIMES' )
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_5_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8278:1: ( 'TIMES' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8279:1: 'TIMES'
            {
             before(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_5_0()); 
            match(input,60,FOLLOW_60_in_rule__SESSION__NameAssignment_516896); 
             after(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_5_0()); 

            }

             after(grammarAccess.getSESSIONAccess().getNameTIMESKeyword_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CALLSTATUS__NameAssignment_0"
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8294:1: rule__CALLSTATUS__NameAssignment_0 : ( ( 'RINGING' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8298:1: ( ( ( 'RINGING' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8299:1: ( ( 'RINGING' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8299:1: ( ( 'RINGING' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8300:1: ( 'RINGING' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8301:1: ( 'RINGING' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8302:1: 'RINGING'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0()); 
            match(input,66,FOLLOW_66_in_rule__CALLSTATUS__NameAssignment_016940); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8317:1: rule__CALLSTATUS__NameAssignment_1 : ( ( 'IN-PROGRESS' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8321:1: ( ( ( 'IN-PROGRESS' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8322:1: ( ( 'IN-PROGRESS' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8322:1: ( ( 'IN-PROGRESS' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8323:1: ( 'IN-PROGRESS' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8324:1: ( 'IN-PROGRESS' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8325:1: 'IN-PROGRESS'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0()); 
            match(input,67,FOLLOW_67_in_rule__CALLSTATUS__NameAssignment_116984); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8340:1: rule__CALLSTATUS__NameAssignment_2 : ( ( 'DISCONNECTED' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8344:1: ( ( ( 'DISCONNECTED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8345:1: ( ( 'DISCONNECTED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8345:1: ( ( 'DISCONNECTED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8346:1: ( 'DISCONNECTED' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8347:1: ( 'DISCONNECTED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8348:1: 'DISCONNECTED'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0()); 
            match(input,68,FOLLOW_68_in_rule__CALLSTATUS__NameAssignment_217028); 
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
    // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8363:1: rule__CALLSTATUS__NameAssignment_3 : ( ( 'FAILED' ) ) ;
    public final void rule__CALLSTATUS__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8367:1: ( ( ( 'FAILED' ) ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8368:1: ( ( 'FAILED' ) )
            {
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8368:1: ( ( 'FAILED' ) )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8369:1: ( 'FAILED' )
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8370:1: ( 'FAILED' )
            // ../org.telcodev.dsl.ui/src-gen/org/telcodev/dsl/ui/contentassist/antlr/internal/InternalDime.g:8371:1: 'FAILED'
            {
             before(grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0()); 
            match(input,69,FOLLOW_69_in_rule__CALLSTATUS__NameAssignment_317072); 
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
        "\20\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\16\10\17\6\uffff";
    static final String DFA4_minS =
        "\1\4\11\11\6\uffff";
    static final String DFA4_maxS =
        "\1\105\11\35\6\uffff";
    static final String DFA4_acceptS =
        "\12\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\12\1\2\1\uffff\1\12\1\uffff\1\14\2\uffff\1\13\2\uffff\1\3"+
            "\1\1\52\uffff\1\11\1\4\1\5\1\6\1\7\1\10\4\15",
            "\1\16\1\uffff\1\16\1\12\15\uffff\1\16\2\uffff\1\16",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
            "\1\17\1\uffff\1\17\1\12\15\uffff\1\17\2\uffff\1\17",
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
            return "1556:1: rule__TerminalBoolExpression__Alternatives : ( ( ruleBoolLiteral ) | ( ruleCompareExpression ) | ( ruleNegExpression ) | ( ruleLiteral ) | ( ruleBrackets ) | ( ruleCALLSTATUS ) );";
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
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0_in_ruleSend814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0_in_ruleSendBlock874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0_in_ruleNotPrimaryParam934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleParam994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0_in_ruleSay1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_entryRuleSms1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSms1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__0_in_ruleSms1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_entryRuleEmail1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmail1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__0_in_ruleEmail1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0_in_ruleIfExp1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0_in_ruleCondBlock1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0_in_ruleBoolExpression1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalBoolExpression__Alternatives_in_ruleTerminalBoolExpression1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0_in_ruleBrackets1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0_in_ruleNegExpression1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0_in_ruleMathExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathTerminal__Alternatives_in_ruleMathTerminal1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0_in_ruleMathBrackets1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0_in_ruleConcatenationExpression1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationTerminal__Alternatives_in_ruleConcatenationTerminal2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0_in_ruleConcatenationBrackets2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0_in_ruleStringVariable2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0_in_ruleNumVariable2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0_in_ruleBoolVariable2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Alternatives_in_rulePrimitive2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralAbs__Alternatives_in_ruleLiteralAbs2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0_in_ruleBoolLiteral2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0_in_ruleNumLiteral2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT2763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__Alternatives_in_ruleEVENT2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION2823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__Alternatives_in_ruleSESSION2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__Alternatives_in_ruleCALLSTATUS2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_rule__Statement__Alternatives2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_rule__Statement__Alternatives2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_rule__Statement__Alternatives2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Statement__Alternatives3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ComAssignment_4_in_rule__Statement__Alternatives3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AbstractElement__Alternatives3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AbstractElement__Alternatives3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rule__AbstractElement__Alternatives3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_rule__AbstractElement__Alternatives3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_rule__VoiceTag__Alternatives3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_rule__VoiceTag__Alternatives3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_rule__VoiceTag__Alternatives3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_rule__VoiceTag__Alternatives3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_rule__VoiceTag__Alternatives3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__VoiceTag__Alternatives3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_rule__VoiceTag__Alternatives3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_rule__VoiceTag__Alternatives3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__VoiceTag__Alternatives3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_rule__VoiceTag__Alternatives3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_rule__VoiceTag__Alternatives3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__TerminalBoolExpression__Alternatives3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__TerminalBoolExpression__Alternatives3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_rule__TerminalBoolExpression__Alternatives3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TerminalBoolExpression__Alternatives3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_rule__TerminalBoolExpression__Alternatives3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_rule__TerminalBoolExpression__Alternatives3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_rule__MathTerminal__Alternatives3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MathTerminal__Alternatives3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__MathTerminal__Alternatives3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_rule__ConcatenationTerminal__Alternatives3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__ConcatenationTerminal__Alternatives3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringVariable__Alternatives_2_03571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringVariable__Alternatives_2_03591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NumVariable__Alternatives_2_03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NumVariable__Alternatives_2_03646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BoolVariable__Alternatives_2_03681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BoolVariable__Alternatives_2_03701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constant__Alternatives_23736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Constant__Alternatives_23756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Primitive__Alternatives3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rule__Primitive__Alternatives3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rule__Primitive__Alternatives3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LiteralAbs__Alternatives3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__LiteralAbs__Alternatives3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__VAssignment_0_in_rule__Literal__Alternatives3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NulAssignment_1_in_rule__Literal__Alternatives3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_rule__Literal__Alternatives3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_0_in_rule__EVENT__Alternatives4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_1_in_rule__EVENT__Alternatives4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_2_in_rule__EVENT__Alternatives4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EVENT__NameAssignment_3_in_rule__EVENT__Alternatives4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_0_in_rule__SESSION__Alternatives4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_1_in_rule__SESSION__Alternatives4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_2_in_rule__SESSION__Alternatives4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_3_in_rule__SESSION__Alternatives4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_4_in_rule__SESSION__Alternatives4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SESSION__NameAssignment_5_in_rule__SESSION__Alternatives4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_0_in_rule__CALLSTATUS__Alternatives4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_1_in_rule__CALLSTATUS__Alternatives4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_2_in_rule__CALLSTATUS__Alternatives4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CALLSTATUS__NameAssignment_3_in_rule__CALLSTATUS__Alternatives4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__04318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__04321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Document__Group__0__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__14380 = new BitSet(new long[]{0x00001E0015000080L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__14383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__NameAssignment_1_in_rule__Document__Group__1__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__24440 = new BitSet(new long[]{0x00001E0015000080L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__24443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ElementsAssignment_2_in_rule__Document__Group__2__Impl4470 = new BitSet(new long[]{0x00001E0000000082L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__34501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__StaAssignment_3_in_rule__Document__Group__3__Impl4528 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__04567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group_0__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__14629 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_1_in_rule__State__Group_0__1__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__24689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0_in_rule__State__Group_0__2__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0__Impl_in_rule__State__Group_0_2__04753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__04756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group_0_2__0__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1__Impl_in_rule__State__Group_0_2__14815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimesAssignment_0_2_1_in_rule__State__Group_0_2__1__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__04876 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__04879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0_in_rule__State__Group_1__0__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__14937 = new BitSet(new long[]{0x01FFFF0008000080L});
    public static final BitSet FOLLOW_rule__State__Group_1__2_in_rule__State__Group_1__14940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group_1__1__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__2__Impl_in_rule__State__Group_1__24999 = new BitSet(new long[]{0x01FFFF0008000080L});
    public static final BitSet FOLLOW_rule__State__Group_1__3_in_rule__State__Group_1__25002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StmsAssignment_1_2_in_rule__State__Group_1__2__Impl5029 = new BitSet(new long[]{0x01FFFF0000000082L});
    public static final BitSet FOLLOW_rule__State__Group_1__3__Impl_in_rule__State__Group_1__35060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_1__3__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__0__Impl_in_rule__State__Group_1_0__05127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1_in_rule__State__Group_1_0__05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__State__Group_1_0__0__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1_0__1__Impl_in_rule__State__Group_1_0__15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TimeoutAssignment_1_0_1_in_rule__State__Group_1_0__1__Impl5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05250 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15310 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ToAssignment_1_in_rule__Call__Group__1__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group__2__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__0__Impl_in_rule__Dial__Group__05435 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Dial__Group__1_in_rule__Dial__Group__05438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__NameAssignment_0_in_rule__Dial__Group__0__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__1__Impl_in_rule__Dial__Group__15495 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Dial__Group__2_in_rule__Dial__Group__15498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__ToAssignment_1_in_rule__Dial__Group__1__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dial__Group__2__Impl_in_rule__Dial__Group__25555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Dial__Group__2__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__0__Impl_in_rule__Play__Group__05620 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Play__Group__1_in_rule__Play__Group__05623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__NameAssignment_0_in_rule__Play__Group__0__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__1__Impl_in_rule__Play__Group__15680 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Play__Group__2_in_rule__Play__Group__15683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__FileAssignment_1_in_rule__Play__Group__1__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Play__Group__2__Impl_in_rule__Play__Group__25740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Play__Group__2__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__05805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Record__Group__1_in_rule__Record__Group__05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__NameAssignment_0_in_rule__Record__Group__0__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__15865 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Record__Group__2_in_rule__Record__Group__15868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__TimeAssignment_1_in_rule__Record__Group__1__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__25925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Record__Group__3_in_rule__Record__Group__25928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Record__Group__2__Impl5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__35987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Record__Group__3__Impl6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__0__Impl_in_rule__GetDigits__Group__06054 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1_in_rule__GetDigits__Group__06057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NameAssignment_0_in_rule__GetDigits__Group__0__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__1__Impl_in_rule__GetDigits__Group__16114 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2_in_rule__GetDigits__Group__16117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__NumDigitsAssignment_1_in_rule__GetDigits__Group__1__Impl6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__2__Impl_in_rule__GetDigits__Group__26175 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3_in_rule__GetDigits__Group__26178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GetDigits__Group__2__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetDigits__Group__3__Impl_in_rule__GetDigits__Group__36237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GetDigits__Group__3__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__06304 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__06307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__NameAssignment_0_in_rule__Send__Group__0__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__16364 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__16367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__ParamsAssignment_1_in_rule__Send__Group__1__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__26424 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Send__Group__2__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__36486 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__36489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__UrlAssignment_3_in_rule__Send__Group__3__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__46546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Send__Group__4__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__0__Impl_in_rule__SendBlock__Group__06615 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1_in_rule__SendBlock__Group__06618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__1__Impl_in_rule__SendBlock__Group__16676 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2_in_rule__SendBlock__Group__16679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SendBlock__Group__1__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__2__Impl_in_rule__SendBlock__Group__26738 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3_in_rule__SendBlock__Group__26741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__ValueAssignment_2_in_rule__SendBlock__Group__2__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__3__Impl_in_rule__SendBlock__Group__36798 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4_in_rule__SendBlock__Group__36801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendBlock__StmsAssignment_3_in_rule__SendBlock__Group__3__Impl6828 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__SendBlock__Group__4__Impl_in_rule__SendBlock__Group__46859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SendBlock__Group__4__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__0__Impl_in_rule__NotPrimaryParam__Group__06928 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1_in_rule__NotPrimaryParam__Group__06931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NotPrimaryParam__Group__0__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__Group__1__Impl_in_rule__NotPrimaryParam__Group__16990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPrimaryParam__ValueAssignment_1_in_rule__NotPrimaryParam__Group__1__Impl7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__07051 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__07054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_0_in_rule__Param__Group__0__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__17111 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Param__Group__2_in_rule__Param__Group__17114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Param__Group__1__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__27173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ValueAssignment_2_in_rule__Param__Group__2__Impl7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__0__Impl_in_rule__Say__Group__07236 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Say__Group__1_in_rule__Say__Group__07239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__NameAssignment_0_in_rule__Say__Group__0__Impl7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__1__Impl_in_rule__Say__Group__17296 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Say__Group__2_in_rule__Say__Group__17299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__ThatAssignment_1_in_rule__Say__Group__1__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Say__Group__2__Impl_in_rule__Say__Group__27356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Say__Group__2__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__0__Impl_in_rule__Sms__Group__07421 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Sms__Group__1_in_rule__Sms__Group__07424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__NameAssignment_0_in_rule__Sms__Group__0__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__1__Impl_in_rule__Sms__Group__17481 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Sms__Group__2_in_rule__Sms__Group__17484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__ValueAssignment_1_in_rule__Sms__Group__1__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__2__Impl_in_rule__Sms__Group__27541 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Sms__Group__3_in_rule__Sms__Group__27544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Sms__Group__2__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__3__Impl_in_rule__Sms__Group__37603 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Sms__Group__4_in_rule__Sms__Group__37606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__ToAssignment_3_in_rule__Sms__Group__3__Impl7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sms__Group__4__Impl_in_rule__Sms__Group__47663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Sms__Group__4__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__0__Impl_in_rule__Email__Group__07732 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Email__Group__1_in_rule__Email__Group__07735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__NameAssignment_0_in_rule__Email__Group__0__Impl7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__1__Impl_in_rule__Email__Group__17792 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Email__Group__2_in_rule__Email__Group__17795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Email__Group__1__Impl7823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__2__Impl_in_rule__Email__Group__27854 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Email__Group__3_in_rule__Email__Group__27857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Email__Group__2__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__3__Impl_in_rule__Email__Group__37916 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Email__Group__4_in_rule__Email__Group__37919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Email__Group__3__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__4__Impl_in_rule__Email__Group__47978 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Email__Group__5_in_rule__Email__Group__47981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__TitleAssignment_4_in_rule__Email__Group__4__Impl8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__5__Impl_in_rule__Email__Group__58038 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Email__Group__6_in_rule__Email__Group__58041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Email__Group__5__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__6__Impl_in_rule__Email__Group__68100 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Email__Group__7_in_rule__Email__Group__68103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Email__Group__6__Impl8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__7__Impl_in_rule__Email__Group__78162 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Email__Group__8_in_rule__Email__Group__78165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Email__Group__7__Impl8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__8__Impl_in_rule__Email__Group__88224 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Email__Group__9_in_rule__Email__Group__88227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__FromAssignment_8_in_rule__Email__Group__8__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__9__Impl_in_rule__Email__Group__98284 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Email__Group__10_in_rule__Email__Group__98287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Email__Group__9__Impl8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__10__Impl_in_rule__Email__Group__108346 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Email__Group__11_in_rule__Email__Group__108349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Email__Group__10__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__11__Impl_in_rule__Email__Group__118408 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Email__Group__12_in_rule__Email__Group__118411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Email__Group__11__Impl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__12__Impl_in_rule__Email__Group__128470 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Email__Group__13_in_rule__Email__Group__128473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__ValueAssignment_12_in_rule__Email__Group__12__Impl8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__13__Impl_in_rule__Email__Group__138530 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Email__Group__14_in_rule__Email__Group__138533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Email__Group__13__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__14__Impl_in_rule__Email__Group__148592 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Email__Group__15_in_rule__Email__Group__148595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Email__Group__14__Impl8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__15__Impl_in_rule__Email__Group__158654 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Email__Group__16_in_rule__Email__Group__158657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__ToAssignment_15_in_rule__Email__Group__15__Impl8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Email__Group__16__Impl_in_rule__Email__Group__168714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Email__Group__16__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__08807 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__08810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18867 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__18870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_1_in_rule__Transition__Group__1__Impl8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28927 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transition__Group__2__Impl8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38989 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__38992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_3_in_rule__Transition__Group__3__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__49049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Transition__Group__4__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__0__Impl_in_rule__IfExp__Group__09118 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1_in_rule__IfExp__Group__09121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlockAssignment_0_in_rule__IfExp__Group__0__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__1__Impl_in_rule__IfExp__Group__19178 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2_in_rule__IfExp__Group__19181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0_in_rule__IfExp__Group__1__Impl9208 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group__2__Impl_in_rule__IfExp__Group__29239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0_in_rule__IfExp__Group__2__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__0__Impl_in_rule__IfExp__Group_1__09303 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1_in_rule__IfExp__Group_1__09306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IfExp__Group_1__0__Impl9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_1__1__Impl_in_rule__IfExp__Group_1__19365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__BlocksAssignment_1_1_in_rule__IfExp__Group_1__1__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__0__Impl_in_rule__IfExp__Group_2__09426 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1_in_rule__IfExp__Group_2__09429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IfExp__Group_2__0__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__Group_2__1__Impl_in_rule__IfExp__Group_2__19488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfExp__DefaultBlockAssignment_2_1_in_rule__IfExp__Group_2__1__Impl9515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__0__Impl_in_rule__CondBlock__Group__09549 = new BitSet(new long[]{0xF000000000032570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1_in_rule__CondBlock__Group__09552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__CondBlock__Group__0__Impl9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__1__Impl_in_rule__CondBlock__Group__19611 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2_in_rule__CondBlock__Group__19614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__CondAssignment_1_in_rule__CondBlock__Group__1__Impl9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__Group__2__Impl_in_rule__CondBlock__Group__29671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondBlock__ActionAssignment_2_in_rule__CondBlock__Group__2__Impl9698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09734 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19795 = new BitSet(new long[]{0x01FFFF0008000080L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Block__Group__1__Impl9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29857 = new BitSet(new long[]{0x01FFFF0008000080L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StaAssignment_2_in_rule__Block__Group__2__Impl9887 = new BitSet(new long[]{0x01FFFF0000000082L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__39918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Block__Group__3__Impl9946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__0__Impl_in_rule__BoolExpression__Group__09985 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1_in_rule__BoolExpression__Group__09988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__BoolExpression__Group__0__Impl10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group__1__Impl_in_rule__BoolExpression__Group__110044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0_in_rule__BoolExpression__Group__1__Impl10071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__0__Impl_in_rule__BoolExpression__Group_1__010106 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1_in_rule__BoolExpression__Group_1__010109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__1__Impl_in_rule__BoolExpression__Group_1__110167 = new BitSet(new long[]{0xF000000000032570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2_in_rule__BoolExpression__Group_1__110170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__OpAssignment_1_1_in_rule__BoolExpression__Group_1__1__Impl10197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__Group_1__2__Impl_in_rule__BoolExpression__Group_1__210227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpression__RightAssignment_1_2_in_rule__BoolExpression__Group_1__2__Impl10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__0__Impl_in_rule__Brackets__Group__010290 = new BitSet(new long[]{0xF000000000032570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__Brackets__Group__1_in_rule__Brackets__Group__010293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__OpenAssignment_0_in_rule__Brackets__Group__0__Impl10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__1__Impl_in_rule__Brackets__Group__110350 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2_in_rule__Brackets__Group__110353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__ObjAssignment_1_in_rule__Brackets__Group__1__Impl10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__Group__2__Impl_in_rule__Brackets__Group__210410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brackets__CloseAssignment_2_in_rule__Brackets__Group__2__Impl10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__010473 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__010476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__LeftAssignment_0_in_rule__CompareExpression__Group__0__Impl10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__110533 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2_in_rule__CompareExpression__Group__110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OpAssignment_1_in_rule__CompareExpression__Group__1__Impl10563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__2__Impl_in_rule__CompareExpression__Group__210593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_2_in_rule__CompareExpression__Group__2__Impl10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__0__Impl_in_rule__NegExpression__Group__010656 = new BitSet(new long[]{0xF000000000032570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1_in_rule__NegExpression__Group__010659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__OpAssignment_0_in_rule__NegExpression__Group__0__Impl10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__Group__1__Impl_in_rule__NegExpression__Group__110716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegExpression__ObjAssignment_1_in_rule__NegExpression__Group__1__Impl10743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__0__Impl_in_rule__MathExpression__Group__010777 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1_in_rule__MathExpression__Group__010780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_rule__MathExpression__Group__0__Impl10807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group__1__Impl_in_rule__MathExpression__Group__110836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0_in_rule__MathExpression__Group__1__Impl10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__0__Impl_in_rule__MathExpression__Group_1__010898 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1_in_rule__MathExpression__Group_1__010901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__1__Impl_in_rule__MathExpression__Group_1__110959 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2_in_rule__MathExpression__Group_1__110962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__OpAssignment_1_1_in_rule__MathExpression__Group_1__1__Impl10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__Group_1__2__Impl_in_rule__MathExpression__Group_1__211019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathExpression__RightAssignment_1_2_in_rule__MathExpression__Group_1__2__Impl11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__0__Impl_in_rule__MathBrackets__Group__011082 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1_in_rule__MathBrackets__Group__011085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__OpenAssignment_0_in_rule__MathBrackets__Group__0__Impl11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__1__Impl_in_rule__MathBrackets__Group__111142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2_in_rule__MathBrackets__Group__111145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__ObjAssignment_1_in_rule__MathBrackets__Group__1__Impl11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__Group__2__Impl_in_rule__MathBrackets__Group__211202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathBrackets__CloseAssignment_2_in_rule__MathBrackets__Group__2__Impl11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__0__Impl_in_rule__ConcatenationExpression__Group__011265 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1_in_rule__ConcatenationExpression__Group__011268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_rule__ConcatenationExpression__Group__0__Impl11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group__1__Impl_in_rule__ConcatenationExpression__Group__111324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0_in_rule__ConcatenationExpression__Group__1__Impl11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__0__Impl_in_rule__ConcatenationExpression__Group_1__011386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1_in_rule__ConcatenationExpression__Group_1__011389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__1__Impl_in_rule__ConcatenationExpression__Group_1__111447 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2_in_rule__ConcatenationExpression__Group_1__111450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__OpAssignment_1_1_in_rule__ConcatenationExpression__Group_1__1__Impl11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__Group_1__2__Impl_in_rule__ConcatenationExpression__Group_1__211507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationExpression__RightAssignment_1_2_in_rule__ConcatenationExpression__Group_1__2__Impl11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__0__Impl_in_rule__ConcatenationBrackets__Group__011570 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1_in_rule__ConcatenationBrackets__Group__011573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__OpenAssignment_0_in_rule__ConcatenationBrackets__Group__0__Impl11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__1__Impl_in_rule__ConcatenationBrackets__Group__111630 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2_in_rule__ConcatenationBrackets__Group__111633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__ObjAssignment_1_in_rule__ConcatenationBrackets__Group__1__Impl11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__Group__2__Impl_in_rule__ConcatenationBrackets__Group__211690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatenationBrackets__CloseAssignment_2_in_rule__ConcatenationBrackets__Group__2__Impl11717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__0__Impl_in_rule__StringVariable__Group__011753 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1_in_rule__StringVariable__Group__011756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringVariable__Group__0__Impl11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__1__Impl_in_rule__StringVariable__Group__111815 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2_in_rule__StringVariable__Group__111818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__NameAssignment_1_in_rule__StringVariable__Group__1__Impl11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__2__Impl_in_rule__StringVariable__Group__211875 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3_in_rule__StringVariable__Group__211878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0_in_rule__StringVariable__Group__2__Impl11905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group__3__Impl_in_rule__StringVariable__Group__311936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringVariable__Group__3__Impl11964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__0__Impl_in_rule__StringVariable__Group_2__012003 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1_in_rule__StringVariable__Group_2__012006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Alternatives_2_0_in_rule__StringVariable__Group_2__0__Impl12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__Group_2__1__Impl_in_rule__StringVariable__Group_2__112063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVariable__ValueAssignment_2_1_in_rule__StringVariable__Group_2__1__Impl12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__0__Impl_in_rule__NumVariable__Group__012124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1_in_rule__NumVariable__Group__012127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NumVariable__Group__0__Impl12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__1__Impl_in_rule__NumVariable__Group__112186 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2_in_rule__NumVariable__Group__112189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__NameAssignment_1_in_rule__NumVariable__Group__1__Impl12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__2__Impl_in_rule__NumVariable__Group__212246 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3_in_rule__NumVariable__Group__212249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0_in_rule__NumVariable__Group__2__Impl12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group__3__Impl_in_rule__NumVariable__Group__312307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NumVariable__Group__3__Impl12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__0__Impl_in_rule__NumVariable__Group_2__012374 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1_in_rule__NumVariable__Group_2__012377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Alternatives_2_0_in_rule__NumVariable__Group_2__0__Impl12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__Group_2__1__Impl_in_rule__NumVariable__Group_2__112434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumVariable__ValueAssignment_2_1_in_rule__NumVariable__Group_2__1__Impl12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__0__Impl_in_rule__BoolVariable__Group__012495 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1_in_rule__BoolVariable__Group__012498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__BoolVariable__Group__0__Impl12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__1__Impl_in_rule__BoolVariable__Group__112557 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2_in_rule__BoolVariable__Group__112560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__NameAssignment_1_in_rule__BoolVariable__Group__1__Impl12587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__2__Impl_in_rule__BoolVariable__Group__212617 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3_in_rule__BoolVariable__Group__212620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0_in_rule__BoolVariable__Group__2__Impl12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group__3__Impl_in_rule__BoolVariable__Group__312678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BoolVariable__Group__3__Impl12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__0__Impl_in_rule__BoolVariable__Group_2__012745 = new BitSet(new long[]{0xF000000000032570L,0x000000000000003FL});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1_in_rule__BoolVariable__Group_2__012748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Alternatives_2_0_in_rule__BoolVariable__Group_2__0__Impl12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__Group_2__1__Impl_in_rule__BoolVariable__Group_2__112805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVariable__ValueAssignment_2_1_in_rule__BoolVariable__Group_2__1__Impl12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__012866 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__012869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Constant__Group__0__Impl12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__112928 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__112931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__212988 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__212991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_2_in_rule__Constant__Group__2__Impl13018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__313048 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__313051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl13078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__413108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constant__Group__4__Impl13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__0__Impl_in_rule__BoolLiteral__Group__013177 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1_in_rule__BoolLiteral__Group__013180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__Group__1__Impl_in_rule__BoolLiteral__Group__113238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolLiteral__ValueAssignment_1_in_rule__BoolLiteral__Group__1__Impl13265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__0__Impl_in_rule__NumLiteral__Group__013299 = new BitSet(new long[]{0xF000000000030570L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1_in_rule__NumLiteral__Group__013302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__Group__1__Impl_in_rule__NumLiteral__Group__113360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumLiteral__ValueAssignment_1_in_rule__NumLiteral__Group__1__Impl13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__013421 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__013424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__113482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl13509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__0_in_rule__State__UnorderedGroup13544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0_in_rule__State__UnorderedGroup__Impl13633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0_in_rule__State__UnorderedGroup__Impl13724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__013783 = new BitSet(new long[]{0x0000000015000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__1_in_rule__State__UnorderedGroup__013786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup__Impl_in_rule__State__UnorderedGroup__113811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Document__NameAssignment_113843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Document__ElementsAssignment_213874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Document__StaAssignment_313905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Statement__ComAssignment_413936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_113967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimesAssignment_0_2_113998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__State__TimeoutAssignment_1_0_114029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__State__StmsAssignment_1_214060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Call__NameAssignment_014096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Call__ToAssignment_114135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Dial__NameAssignment_014171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Dial__ToAssignment_114210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Play__NameAssignment_014246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Play__FileAssignment_114285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Record__NameAssignment_014321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Record__TimeAssignment_114360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Reject__NameAssignment14396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Hangup__NameAssignment14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__GetDigits__NameAssignment_014484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GetDigits__NumDigitsAssignment_114523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Send__NameAssignment_014559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_rule__Send__ParamsAssignment_114598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Send__UrlAssignment_314629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SendBlock__ValueAssignment_214660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_rule__SendBlock__StmsAssignment_314691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__NotPrimaryParam__ValueAssignment_114722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Param__NameAssignment_014753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Param__ValueAssignment_214784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Say__NameAssignment_014820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Say__ThatAssignment_114859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Sms__NameAssignment_014895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Sms__ValueAssignment_114934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Sms__ToAssignment_314965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Email__NameAssignment_015001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__TitleAssignment_415040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__FromAssignment_815071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__ValueAssignment_1215102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__Email__ToAssignment_1515133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Transition__NameAssignment_015169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_115212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_rule__Transition__EventAssignment_315247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlockAssignment_015278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_rule__IfExp__BlocksAssignment_1_115309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__IfExp__DefaultBlockAssignment_2_115340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__CondBlock__CondAssignment_115371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CondBlock__ActionAssignment_215402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Block__StaAssignment_215433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_rule__BoolExpression__OpAssignment_1_115464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolExpression__RightAssignment_1_215495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__Brackets__OpenAssignment_015526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Brackets__ObjAssignment_115557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__Brackets__CloseAssignment_215588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__LeftAssignment_015619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_rule__CompareExpression__OpAssignment_115650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_rule__CompareExpression__RightAssignment_215681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_rule__NegExpression__OpAssignment_015712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_rule__NegExpression__ObjAssignment_115743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_rule__MathExpression__OpAssignment_1_115774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathExpression__RightAssignment_1_215805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__MathBrackets__OpenAssignment_015836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__MathBrackets__ObjAssignment_115867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__MathBrackets__CloseAssignment_215898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_rule__ConcatenationExpression__OpAssignment_1_115929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationExpression__RightAssignment_1_215960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_rule__ConcatenationBrackets__OpenAssignment_015991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__ConcatenationBrackets__ObjAssignment_116022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_rule__ConcatenationBrackets__CloseAssignment_216053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringVariable__NameAssignment_116084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rule__StringVariable__ValueAssignment_2_116115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NumVariable__NameAssignment_116146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rule__NumVariable__ValueAssignment_2_116177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolVariable__NameAssignment_116208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_rule__BoolVariable__ValueAssignment_2_116239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_116270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__Constant__ValueAssignment_316301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__VAssignment_016336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__NulAssignment_116371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__BoolLiteral__ValueAssignment_116402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumLiteral__ValueAssignment_116433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_116464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EVENT__NameAssignment_016500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__EVENT__NameAssignment_116544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__EVENT__NameAssignment_216588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EVENT__NameAssignment_316632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SESSION__NameAssignment_016676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SESSION__NameAssignment_116720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SESSION__NameAssignment_216764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SESSION__NameAssignment_316808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SESSION__NameAssignment_416852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SESSION__NameAssignment_516896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__CALLSTATUS__NameAssignment_016940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__CALLSTATUS__NameAssignment_116984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__CALLSTATUS__NameAssignment_217028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__CALLSTATUS__NameAssignment_317072 = new BitSet(new long[]{0x0000000000000002L});

}
