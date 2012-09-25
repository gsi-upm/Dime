package org.telcodev.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.telcodev.dsl.services.DimeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDimeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_BOOL", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'State'", "'times'", "'{'", "'}'", "'Call'", "';'", "'DialTo'", "'Play'", "'Record'", "'seconds'", "'Reject;'", "'HangUp;'", "'Get'", "'digits'", "'Ask'", "'Send'", "'to'", "','", "':'", "'Say'", "'Sms'", "'Email'", "'subject'", "'from'", "'message'", "'GoTo'", "'when'", "'else'", "'if'", "'String'", "'='", "' = '", "'Num'", "'Bool'", "'Const'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'TIMEOUT'", "'CALLER'", "'LASTSTATE'", "'TIME'", "'CALLED'", "'ANSWER'", "'DIGITS'", "'RECORD'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int RULE_OBRACKET=9;
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
    public static final int RULE_CONCATENATION=14;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_COMPARE=11;
    public static final int RULE_CBRACKET=10;
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
    public static final int RULE_NEGATION=12;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_DOUBLE=17;
    public static final int RULE_NULL=15;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int RULE_LOGIC_WORD=8;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=19;
    public static final int RULE_MATH=13;

    // delegates
    // delegators


        public InternalDimeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDimeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDimeParser.tokenNames; }
    public String getGrammarFileName() { return "../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g"; }



     	private DimeGrammarAccess grammarAccess;
     	
        public InternalDimeParser(TokenStream input, DimeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected DimeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:67:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:68:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:69:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:76:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleStatement ) )* ( (lv_sta_3_0= ruleState ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_sta_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:79:28: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleStatement ) )* ( (lv_sta_3_0= ruleState ) )* ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:80:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleStatement ) )* ( (lv_sta_3_0= ruleState ) )* )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:80:1: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleStatement ) )* ( (lv_sta_3_0= ruleState ) )* )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:80:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleStatement ) )* ( (lv_sta_3_0= ruleState ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDocument122); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getApplicationKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDocument139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:102:2: ( (lv_elements_2_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ML_COMMENT||LA1_0==51||(LA1_0>=54 && LA1_0<=56)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:103:1: (lv_elements_2_0= ruleStatement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:103:1: (lv_elements_2_0= ruleStatement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:104:3: lv_elements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getElementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleDocument165);
            	    lv_elements_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:120:3: ( (lv_sta_3_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:121:1: (lv_sta_3_0= ruleState )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:121:1: (lv_sta_3_0= ruleState )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:122:3: lv_sta_3_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleDocument187);
            	    lv_sta_3_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sta",
            	            		lv_sta_3_0, 
            	            		"State");
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleStatement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:146:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:147:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:148:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement224);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement234); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:155:1: ruleStatement returns [EObject current=null] : (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_Constant_3= ruleConstant | ( (lv_com_4_0= RULE_ML_COMMENT ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_com_4_0=null;
        EObject this_NumVariable_0 = null;

        EObject this_StringVariable_1 = null;

        EObject this_BoolVariable_2 = null;

        EObject this_Constant_3 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:158:28: ( (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_Constant_3= ruleConstant | ( (lv_com_4_0= RULE_ML_COMMENT ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:159:1: (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_Constant_3= ruleConstant | ( (lv_com_4_0= RULE_ML_COMMENT ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:159:1: (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_Constant_3= ruleConstant | ( (lv_com_4_0= RULE_ML_COMMENT ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            case 55:
                {
                alt3=3;
                }
                break;
            case 56:
                {
                alt3=4;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:160:5: this_NumVariable_0= ruleNumVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumVariable_in_ruleStatement281);
                    this_NumVariable_0=ruleNumVariable();

                    state._fsp--;

                     
                            current = this_NumVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:170:5: this_StringVariable_1= ruleStringVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringVariable_in_ruleStatement308);
                    this_StringVariable_1=ruleStringVariable();

                    state._fsp--;

                     
                            current = this_StringVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:180:5: this_BoolVariable_2= ruleBoolVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoolVariable_in_ruleStatement335);
                    this_BoolVariable_2=ruleBoolVariable();

                    state._fsp--;

                     
                            current = this_BoolVariable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:190:5: this_Constant_3= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getConstantParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleStatement362);
                    this_Constant_3=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:199:6: ( (lv_com_4_0= RULE_ML_COMMENT ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:199:6: ( (lv_com_4_0= RULE_ML_COMMENT ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:200:1: (lv_com_4_0= RULE_ML_COMMENT )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:200:1: (lv_com_4_0= RULE_ML_COMMENT )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:201:3: lv_com_4_0= RULE_ML_COMMENT
                    {
                    lv_com_4_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleStatement384); 

                    			newLeafNode(lv_com_4_0, grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"com",
                            		lv_com_4_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:225:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:226:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:227:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement425);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement435); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:234:1: ruleAbstractElement returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfExp_2= ruleIfExp | this_VoiceTag_3= ruleVoiceTag ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Transition_1 = null;

        EObject this_IfExp_2 = null;

        EObject this_VoiceTag_3 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:237:28: ( (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfExp_2= ruleIfExp | this_VoiceTag_3= ruleVoiceTag ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:238:1: (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfExp_2= ruleIfExp | this_VoiceTag_3= ruleVoiceTag )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:238:1: (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfExp_2= ruleIfExp | this_VoiceTag_3= ruleVoiceTag )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
            case 51:
            case 54:
            case 55:
            case 56:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            case 50:
                {
                alt4=3;
                }
                break;
            case 26:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 41:
            case 42:
            case 43:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:239:5: this_Statement_0= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleAbstractElement482);
                    this_Statement_0=ruleStatement();

                    state._fsp--;

                     
                            current = this_Statement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:249:5: this_Transition_1= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleAbstractElement509);
                    this_Transition_1=ruleTransition();

                    state._fsp--;

                     
                            current = this_Transition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:259:5: this_IfExp_2= ruleIfExp
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIfExp_in_ruleAbstractElement536);
                    this_IfExp_2=ruleIfExp();

                    state._fsp--;

                     
                            current = this_IfExp_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:269:5: this_VoiceTag_3= ruleVoiceTag
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getVoiceTagParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVoiceTag_in_ruleAbstractElement563);
                    this_VoiceTag_3=ruleVoiceTag();

                    state._fsp--;

                     
                            current = this_VoiceTag_3; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleState"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:285:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:286:2: (iv_ruleState= ruleState EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:287:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState598);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState608); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:294:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_stms_5_0= ruleAbstractElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_times_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_stms_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:297:28: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_stms_5_0= ruleAbstractElement ) )* otherlv_6= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:298:1: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_stms_5_0= ruleAbstractElement ) )* otherlv_6= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:298:1: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_stms_5_0= ruleAbstractElement ) )* otherlv_6= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:298:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_stms_5_0= ruleAbstractElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleState645); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:302:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:303:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:303:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:304:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState662); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:320:2: (otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:320:4: otherlv_2= 'times' ( (lv_times_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleState680); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getTimesKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:324:1: ( (lv_times_3_0= RULE_INT ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:325:1: (lv_times_3_0= RULE_INT )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:325:1: (lv_times_3_0= RULE_INT )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:326:3: lv_times_3_0= RULE_INT
                    {
                    lv_times_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleState697); 

                    			newLeafNode(lv_times_3_0, grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"times",
                            		lv_times_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleState716); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:346:1: ( (lv_stms_5_0= ruleAbstractElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ML_COMMENT||LA6_0==26||(LA6_0>=28 && LA6_0<=30)||(LA6_0>=32 && LA6_0<=34)||(LA6_0>=36 && LA6_0<=37)||(LA6_0>=41 && LA6_0<=43)||LA6_0==47||(LA6_0>=50 && LA6_0<=51)||(LA6_0>=54 && LA6_0<=56)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:347:1: (lv_stms_5_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:347:1: (lv_stms_5_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:348:3: lv_stms_5_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleState737);
            	    lv_stms_5_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stms",
            	            		lv_stms_5_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleState750); 

                	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVoiceTag"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:376:1: entryRuleVoiceTag returns [EObject current=null] : iv_ruleVoiceTag= ruleVoiceTag EOF ;
    public final EObject entryRuleVoiceTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoiceTag = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:377:2: (iv_ruleVoiceTag= ruleVoiceTag EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:378:2: iv_ruleVoiceTag= ruleVoiceTag EOF
            {
             newCompositeNode(grammarAccess.getVoiceTagRule()); 
            pushFollow(FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag786);
            iv_ruleVoiceTag=ruleVoiceTag();

            state._fsp--;

             current =iv_ruleVoiceTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoiceTag796); 

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
    // $ANTLR end "entryRuleVoiceTag"


    // $ANTLR start "ruleVoiceTag"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:385:1: ruleVoiceTag returns [EObject current=null] : (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail ) ;
    public final EObject ruleVoiceTag() throws RecognitionException {
        EObject current = null;

        EObject this_Say_0 = null;

        EObject this_Dial_1 = null;

        EObject this_Play_2 = null;

        EObject this_Record_3 = null;

        EObject this_GetDigits_4 = null;

        EObject this_Ask_5 = null;

        EObject this_Send_6 = null;

        EObject this_Reject_7 = null;

        EObject this_Hangup_8 = null;

        EObject this_Call_9 = null;

        EObject this_Sms_10 = null;

        EObject this_Email_11 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:388:28: ( (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:389:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:389:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                alt7=5;
                }
                break;
            case 36:
                {
                alt7=6;
                }
                break;
            case 37:
                {
                alt7=7;
                }
                break;
            case 32:
                {
                alt7=8;
                }
                break;
            case 33:
                {
                alt7=9;
                }
                break;
            case 26:
                {
                alt7=10;
                }
                break;
            case 42:
                {
                alt7=11;
                }
                break;
            case 43:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:390:5: this_Say_0= ruleSay
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSay_in_ruleVoiceTag843);
                    this_Say_0=ruleSay();

                    state._fsp--;

                     
                            current = this_Say_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:400:5: this_Dial_1= ruleDial
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDial_in_ruleVoiceTag870);
                    this_Dial_1=ruleDial();

                    state._fsp--;

                     
                            current = this_Dial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:410:5: this_Play_2= rulePlay
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePlay_in_ruleVoiceTag897);
                    this_Play_2=rulePlay();

                    state._fsp--;

                     
                            current = this_Play_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:420:5: this_Record_3= ruleRecord
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRecord_in_ruleVoiceTag924);
                    this_Record_3=ruleRecord();

                    state._fsp--;

                     
                            current = this_Record_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:430:5: this_GetDigits_4= ruleGetDigits
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetDigits_in_ruleVoiceTag951);
                    this_GetDigits_4=ruleGetDigits();

                    state._fsp--;

                     
                            current = this_GetDigits_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:440:5: this_Ask_5= ruleAsk
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAsk_in_ruleVoiceTag978);
                    this_Ask_5=ruleAsk();

                    state._fsp--;

                     
                            current = this_Ask_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:450:5: this_Send_6= ruleSend
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSend_in_ruleVoiceTag1005);
                    this_Send_6=ruleSend();

                    state._fsp--;

                     
                            current = this_Send_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:460:5: this_Reject_7= ruleReject
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleReject_in_ruleVoiceTag1032);
                    this_Reject_7=ruleReject();

                    state._fsp--;

                     
                            current = this_Reject_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:470:5: this_Hangup_8= ruleHangup
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHangup_in_ruleVoiceTag1059);
                    this_Hangup_8=ruleHangup();

                    state._fsp--;

                     
                            current = this_Hangup_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:480:5: this_Call_9= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleVoiceTag1086);
                    this_Call_9=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:490:5: this_Sms_10= ruleSms
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleSms_in_ruleVoiceTag1113);
                    this_Sms_10=ruleSms();

                    state._fsp--;

                     
                            current = this_Sms_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:500:5: this_Email_11= ruleEmail
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleEmail_in_ruleVoiceTag1140);
                    this_Email_11=ruleEmail();

                    state._fsp--;

                     
                            current = this_Email_11; 
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
    // $ANTLR end "ruleVoiceTag"


    // $ANTLR start "entryRuleCall"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:516:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:517:2: (iv_ruleCall= ruleCall EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:518:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1175);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1185); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:525:1: ruleCall returns [EObject current=null] : ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:528:28: ( ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:529:1: ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:529:1: ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:529:2: ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:529:2: ( (lv_name_0_0= 'Call' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:530:1: (lv_name_0_0= 'Call' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:530:1: (lv_name_0_0= 'Call' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:531:3: lv_name_0_0= 'Call'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_26_in_ruleCall1228); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCallAccess().getNameCallKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCallRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Call");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:544:2: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:545:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:545:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:546:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleCall1262);
            lv_to_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCall1274); 

                	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleDial"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:574:1: entryRuleDial returns [EObject current=null] : iv_ruleDial= ruleDial EOF ;
    public final EObject entryRuleDial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDial = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:575:2: (iv_ruleDial= ruleDial EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:576:2: iv_ruleDial= ruleDial EOF
            {
             newCompositeNode(grammarAccess.getDialRule()); 
            pushFollow(FOLLOW_ruleDial_in_entryRuleDial1310);
            iv_ruleDial=ruleDial();

            state._fsp--;

             current =iv_ruleDial; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDial1320); 

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
    // $ANTLR end "entryRuleDial"


    // $ANTLR start "ruleDial"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:583:1: ruleDial returns [EObject current=null] : ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleDial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:586:28: ( ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:587:1: ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:587:1: ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:587:2: ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:587:2: ( (lv_name_0_0= 'DialTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:588:1: (lv_name_0_0= 'DialTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:588:1: (lv_name_0_0= 'DialTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:589:3: lv_name_0_0= 'DialTo'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleDial1363); 

                    newLeafNode(lv_name_0_0, grammarAccess.getDialAccess().getNameDialToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDialRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "DialTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:602:2: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:603:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:603:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:604:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleDial1397);
            lv_to_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDialRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleDial1409); 

                	newLeafNode(otherlv_2, grammarAccess.getDialAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleDial"


    // $ANTLR start "entryRulePlay"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:632:1: entryRulePlay returns [EObject current=null] : iv_rulePlay= rulePlay EOF ;
    public final EObject entryRulePlay() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:633:2: (iv_rulePlay= rulePlay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:634:2: iv_rulePlay= rulePlay EOF
            {
             newCompositeNode(grammarAccess.getPlayRule()); 
            pushFollow(FOLLOW_rulePlay_in_entryRulePlay1445);
            iv_rulePlay=rulePlay();

            state._fsp--;

             current =iv_rulePlay; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlay1455); 

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
    // $ANTLR end "entryRulePlay"


    // $ANTLR start "rulePlay"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:641:1: rulePlay returns [EObject current=null] : ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject rulePlay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_file_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:644:28: ( ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:645:1: ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:645:1: ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:645:2: ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:645:2: ( (lv_name_0_0= 'Play' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:646:1: (lv_name_0_0= 'Play' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:646:1: (lv_name_0_0= 'Play' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:647:3: lv_name_0_0= 'Play'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_rulePlay1498); 

                    newLeafNode(lv_name_0_0, grammarAccess.getPlayAccess().getNamePlayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Play");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:660:2: ( (lv_file_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:661:1: (lv_file_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:661:1: (lv_file_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:662:3: lv_file_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rulePlay1532);
            lv_file_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlayRule());
            	        }
                   		set(
                   			current, 
                   			"file",
                    		lv_file_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePlay1544); 

                	newLeafNode(otherlv_2, grammarAccess.getPlayAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "rulePlay"


    // $ANTLR start "entryRuleRecord"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:690:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:691:2: (iv_ruleRecord= ruleRecord EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:692:2: iv_ruleRecord= ruleRecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord1580);
            iv_ruleRecord=ruleRecord();

            state._fsp--;

             current =iv_ruleRecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord1590); 

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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:699:1: ruleRecord returns [EObject current=null] : ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:702:28: ( ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:703:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:703:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:703:2: ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:703:2: ( (lv_name_0_0= 'Record' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:704:1: (lv_name_0_0= 'Record' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:704:1: (lv_name_0_0= 'Record' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:705:3: lv_name_0_0= 'Record'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleRecord1633); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRecordAccess().getNameRecordKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Record");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:718:2: ( (lv_time_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:719:1: (lv_time_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:719:1: (lv_time_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:720:3: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRecord1663); 

            			newLeafNode(lv_time_1_0, grammarAccess.getRecordAccess().getTimeINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleRecord1680); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordAccess().getSecondsKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleRecord1692); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleReject"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:752:1: entryRuleReject returns [EObject current=null] : iv_ruleReject= ruleReject EOF ;
    public final EObject entryRuleReject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReject = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:753:2: (iv_ruleReject= ruleReject EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:754:2: iv_ruleReject= ruleReject EOF
            {
             newCompositeNode(grammarAccess.getRejectRule()); 
            pushFollow(FOLLOW_ruleReject_in_entryRuleReject1728);
            iv_ruleReject=ruleReject();

            state._fsp--;

             current =iv_ruleReject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReject1738); 

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
    // $ANTLR end "entryRuleReject"


    // $ANTLR start "ruleReject"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:761:1: ruleReject returns [EObject current=null] : ( (lv_name_0_0= 'Reject;' ) ) ;
    public final EObject ruleReject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:764:28: ( ( (lv_name_0_0= 'Reject;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:765:1: ( (lv_name_0_0= 'Reject;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:765:1: ( (lv_name_0_0= 'Reject;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:766:1: (lv_name_0_0= 'Reject;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:766:1: (lv_name_0_0= 'Reject;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:767:3: lv_name_0_0= 'Reject;'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_ruleReject1780); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRejectAccess().getNameRejectKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRejectRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Reject;");
            	    

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
    // $ANTLR end "ruleReject"


    // $ANTLR start "entryRuleHangup"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:788:1: entryRuleHangup returns [EObject current=null] : iv_ruleHangup= ruleHangup EOF ;
    public final EObject entryRuleHangup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHangup = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:789:2: (iv_ruleHangup= ruleHangup EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:790:2: iv_ruleHangup= ruleHangup EOF
            {
             newCompositeNode(grammarAccess.getHangupRule()); 
            pushFollow(FOLLOW_ruleHangup_in_entryRuleHangup1828);
            iv_ruleHangup=ruleHangup();

            state._fsp--;

             current =iv_ruleHangup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHangup1838); 

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
    // $ANTLR end "entryRuleHangup"


    // $ANTLR start "ruleHangup"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:797:1: ruleHangup returns [EObject current=null] : ( (lv_name_0_0= 'HangUp;' ) ) ;
    public final EObject ruleHangup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:800:28: ( ( (lv_name_0_0= 'HangUp;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:801:1: ( (lv_name_0_0= 'HangUp;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:801:1: ( (lv_name_0_0= 'HangUp;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:802:1: (lv_name_0_0= 'HangUp;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:802:1: (lv_name_0_0= 'HangUp;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:803:3: lv_name_0_0= 'HangUp;'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_33_in_ruleHangup1880); 

                    newLeafNode(lv_name_0_0, grammarAccess.getHangupAccess().getNameHangUpKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHangupRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "HangUp;");
            	    

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
    // $ANTLR end "ruleHangup"


    // $ANTLR start "entryRuleGetDigits"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:824:1: entryRuleGetDigits returns [EObject current=null] : iv_ruleGetDigits= ruleGetDigits EOF ;
    public final EObject entryRuleGetDigits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDigits = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:825:2: (iv_ruleGetDigits= ruleGetDigits EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:826:2: iv_ruleGetDigits= ruleGetDigits EOF
            {
             newCompositeNode(grammarAccess.getGetDigitsRule()); 
            pushFollow(FOLLOW_ruleGetDigits_in_entryRuleGetDigits1928);
            iv_ruleGetDigits=ruleGetDigits();

            state._fsp--;

             current =iv_ruleGetDigits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDigits1938); 

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
    // $ANTLR end "entryRuleGetDigits"


    // $ANTLR start "ruleGetDigits"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:833:1: ruleGetDigits returns [EObject current=null] : ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' otherlv_3= ';' ) ;
    public final EObject ruleGetDigits() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_numDigits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:836:28: ( ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' otherlv_3= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:837:1: ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' otherlv_3= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:837:1: ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' otherlv_3= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:837:2: ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' otherlv_3= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:837:2: ( (lv_name_0_0= 'Get' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:838:1: (lv_name_0_0= 'Get' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:838:1: (lv_name_0_0= 'Get' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:839:3: lv_name_0_0= 'Get'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_ruleGetDigits1981); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Get");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:852:2: ( (lv_numDigits_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:853:1: (lv_numDigits_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:853:1: (lv_numDigits_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:854:3: lv_numDigits_1_0= RULE_INT
            {
            lv_numDigits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGetDigits2011); 

            			newLeafNode(lv_numDigits_1_0, grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numDigits",
                    		lv_numDigits_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleGetDigits2028); 

                	newLeafNode(otherlv_2, grammarAccess.getGetDigitsAccess().getDigitsKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleGetDigits2040); 

                	newLeafNode(otherlv_3, grammarAccess.getGetDigitsAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleGetDigits"


    // $ANTLR start "entryRuleAsk"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:886:1: entryRuleAsk returns [EObject current=null] : iv_ruleAsk= ruleAsk EOF ;
    public final EObject entryRuleAsk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsk = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:887:2: (iv_ruleAsk= ruleAsk EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:888:2: iv_ruleAsk= ruleAsk EOF
            {
             newCompositeNode(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_ruleAsk_in_entryRuleAsk2076);
            iv_ruleAsk=ruleAsk();

            state._fsp--;

             current =iv_ruleAsk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsk2086); 

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
    // $ANTLR end "entryRuleAsk"


    // $ANTLR start "ruleAsk"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:895:1: ruleAsk returns [EObject current=null] : ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleAsk() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_question_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:898:28: ( ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:899:1: ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:899:1: ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:899:2: ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:899:2: ( (lv_name_0_0= 'Ask' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:900:1: (lv_name_0_0= 'Ask' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:900:1: (lv_name_0_0= 'Ask' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:901:3: lv_name_0_0= 'Ask'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_36_in_ruleAsk2129); 

                    newLeafNode(lv_name_0_0, grammarAccess.getAskAccess().getNameAskKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAskRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Ask");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:914:2: ( (lv_question_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:915:1: (lv_question_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:915:1: (lv_question_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:916:3: lv_question_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleAsk2163);
            lv_question_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAskRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAsk2175); 

                	newLeafNode(otherlv_2, grammarAccess.getAskAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleAsk"


    // $ANTLR start "entryRuleSend"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:944:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:945:2: (iv_ruleSend= ruleSend EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:946:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend2211);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend2221); 

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
    // $ANTLR end "entryRuleSend"


    // $ANTLR start "ruleSend"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:953:1: ruleSend returns [EObject current=null] : ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_url_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:956:28: ( ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:957:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:957:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:957:2: ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:957:2: ( (lv_name_0_0= 'Send' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:958:1: (lv_name_0_0= 'Send' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:958:1: (lv_name_0_0= 'Send' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:959:3: lv_name_0_0= 'Send'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_37_in_ruleSend2264); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSendAccess().getNameSendKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSendRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Send");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:972:2: ( (lv_params_1_0= ruleSendBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:973:1: (lv_params_1_0= ruleSendBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:973:1: (lv_params_1_0= ruleSendBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:974:3: lv_params_1_0= ruleSendBlock
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSendBlock_in_ruleSend2298);
            lv_params_1_0=ruleSendBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSendRule());
            	        }
                   		set(
                   			current, 
                   			"params",
                    		lv_params_1_0, 
                    		"SendBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSend2310); 

                	newLeafNode(otherlv_2, grammarAccess.getSendAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:994:1: ( (lv_url_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:995:1: (lv_url_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:995:1: (lv_url_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:996:3: lv_url_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSend2331);
            lv_url_3_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSendRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_3_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleSend2343); 

                	newLeafNode(otherlv_4, grammarAccess.getSendAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSend"


    // $ANTLR start "entryRuleSendBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1024:1: entryRuleSendBlock returns [EObject current=null] : iv_ruleSendBlock= ruleSendBlock EOF ;
    public final EObject entryRuleSendBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1025:2: (iv_ruleSendBlock= ruleSendBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1026:2: iv_ruleSendBlock= ruleSendBlock EOF
            {
             newCompositeNode(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock2379);
            iv_ruleSendBlock=ruleSendBlock();

            state._fsp--;

             current =iv_ruleSendBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock2389); 

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
    // $ANTLR end "entryRuleSendBlock"


    // $ANTLR start "ruleSendBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1033:1: ruleSendBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleSendBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        EObject lv_stms_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1036:28: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1037:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1037:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1037:2: () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1037:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1038:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendBlockAccess().getSendBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSendBlock2435); 

                	newLeafNode(otherlv_1, grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1047:1: ( (lv_value_2_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1048:1: (lv_value_2_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1048:1: (lv_value_2_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1049:3: lv_value_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleSendBlock2456);
            lv_value_2_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSendBlockRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1065:2: ( (lv_stms_3_0= ruleNotPrimaryParam ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1066:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1066:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1067:3: lv_stms_3_0= ruleNotPrimaryParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2477);
            	    lv_stms_3_0=ruleNotPrimaryParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSendBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stms",
            	            		lv_stms_3_0, 
            	            		"NotPrimaryParam");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleSendBlock2490); 

                	newLeafNode(otherlv_4, grammarAccess.getSendBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSendBlock"


    // $ANTLR start "entryRuleNotPrimaryParam"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1095:1: entryRuleNotPrimaryParam returns [EObject current=null] : iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF ;
    public final EObject entryRuleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotPrimaryParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1096:2: (iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1097:2: iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF
            {
             newCompositeNode(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2526);
            iv_ruleNotPrimaryParam=ruleNotPrimaryParam();

            state._fsp--;

             current =iv_ruleNotPrimaryParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam2536); 

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
    // $ANTLR end "entryRuleNotPrimaryParam"


    // $ANTLR start "ruleNotPrimaryParam"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1104:1: ruleNotPrimaryParam returns [EObject current=null] : (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) ;
    public final EObject ruleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1107:28: ( (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1108:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1108:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1108:3: otherlv_0= ',' ( (lv_value_1_0= ruleParam ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleNotPrimaryParam2573); 

                	newLeafNode(otherlv_0, grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1112:1: ( (lv_value_1_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1113:1: (lv_value_1_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1113:1: (lv_value_1_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1114:3: lv_value_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleNotPrimaryParam2594);
            lv_value_1_0=ruleParam();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNotPrimaryParamRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Param");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNotPrimaryParam"


    // $ANTLR start "entryRuleParam"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1138:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1139:2: (iv_ruleParam= ruleParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1140:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2630);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2640); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1147:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1150:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1151:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1151:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1151:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1151:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1152:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1152:1: (lv_name_0_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1153:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParam2682); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleParam2699); 

                	newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1173:1: ( (lv_value_2_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1174:1: (lv_value_2_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1174:1: (lv_value_2_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1175:3: lv_value_2_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleParam2720);
            lv_value_2_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleSay"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1199:1: entryRuleSay returns [EObject current=null] : iv_ruleSay= ruleSay EOF ;
    public final EObject entryRuleSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1200:2: (iv_ruleSay= ruleSay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1201:2: iv_ruleSay= ruleSay EOF
            {
             newCompositeNode(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay2756);
            iv_ruleSay=ruleSay();

            state._fsp--;

             current =iv_ruleSay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay2766); 

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
    // $ANTLR end "entryRuleSay"


    // $ANTLR start "ruleSay"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1208:1: ruleSay returns [EObject current=null] : ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_that_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1211:28: ( ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1212:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1212:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1212:2: ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1212:2: ( (lv_name_0_0= 'Say' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1213:1: (lv_name_0_0= 'Say' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1213:1: (lv_name_0_0= 'Say' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1214:3: lv_name_0_0= 'Say'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_41_in_ruleSay2809); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSayAccess().getNameSayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Say");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1227:2: ( (lv_that_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1228:1: (lv_that_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1228:1: (lv_that_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1229:3: lv_that_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSay2843);
            lv_that_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSayRule());
            	        }
                   		set(
                   			current, 
                   			"that",
                    		lv_that_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSay2855); 

                	newLeafNode(otherlv_2, grammarAccess.getSayAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleSay"


    // $ANTLR start "entryRuleSms"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1257:1: entryRuleSms returns [EObject current=null] : iv_ruleSms= ruleSms EOF ;
    public final EObject entryRuleSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSms = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1258:2: (iv_ruleSms= ruleSms EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1259:2: iv_ruleSms= ruleSms EOF
            {
             newCompositeNode(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_ruleSms_in_entryRuleSms2891);
            iv_ruleSms=ruleSms();

            state._fsp--;

             current =iv_ruleSms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSms2901); 

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
    // $ANTLR end "entryRuleSms"


    // $ANTLR start "ruleSms"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1266:1: ruleSms returns [EObject current=null] : ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSms() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1269:28: ( ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1270:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1270:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1270:2: ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1270:2: ( (lv_name_0_0= 'Sms' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1271:1: (lv_name_0_0= 'Sms' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1271:1: (lv_name_0_0= 'Sms' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1272:3: lv_name_0_0= 'Sms'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_42_in_ruleSms2944); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSmsAccess().getNameSmsKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Sms");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1285:2: ( (lv_value_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1286:1: (lv_value_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1286:1: (lv_value_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1287:3: lv_value_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms2978);
            lv_value_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmsRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSms2990); 

                	newLeafNode(otherlv_2, grammarAccess.getSmsAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1307:1: ( (lv_to_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1308:1: (lv_to_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1308:1: (lv_to_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1309:3: lv_to_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3011);
            lv_to_3_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmsRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_3_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleSms3023); 

                	newLeafNode(otherlv_4, grammarAccess.getSmsAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSms"


    // $ANTLR start "entryRuleEmail"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1337:1: entryRuleEmail returns [EObject current=null] : iv_ruleEmail= ruleEmail EOF ;
    public final EObject entryRuleEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmail = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1338:2: (iv_ruleEmail= ruleEmail EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1339:2: iv_ruleEmail= ruleEmail EOF
            {
             newCompositeNode(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_ruleEmail_in_entryRuleEmail3059);
            iv_ruleEmail=ruleEmail();

            state._fsp--;

             current =iv_ruleEmail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmail3069); 

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
    // $ANTLR end "entryRuleEmail"


    // $ANTLR start "ruleEmail"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1346:1: ruleEmail returns [EObject current=null] : ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' ) ;
    public final EObject ruleEmail() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_title_4_0 = null;

        EObject lv_from_8_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_to_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1349:28: ( ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1350:1: ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1350:1: ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1350:2: ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1350:2: ( (lv_name_0_0= 'Email' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1351:1: (lv_name_0_0= 'Email' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1351:1: (lv_name_0_0= 'Email' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1352:3: lv_name_0_0= 'Email'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_43_in_ruleEmail3112); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEmailAccess().getNameEmailKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmailRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Email");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEmail3137); 

                	newLeafNode(otherlv_1, grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleEmail3149); 

                	newLeafNode(otherlv_2, grammarAccess.getEmailAccess().getSubjectKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleEmail3161); 

                	newLeafNode(otherlv_3, grammarAccess.getEmailAccess().getColonKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1377:1: ( (lv_title_4_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1378:1: (lv_title_4_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1378:1: (lv_title_4_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1379:3: lv_title_4_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3182);
            lv_title_4_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmailRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleEmail3194); 

                	newLeafNode(otherlv_5, grammarAccess.getEmailAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleEmail3206); 

                	newLeafNode(otherlv_6, grammarAccess.getEmailAccess().getFromKeyword_6());
                
            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleEmail3218); 

                	newLeafNode(otherlv_7, grammarAccess.getEmailAccess().getColonKeyword_7());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1407:1: ( (lv_from_8_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1408:1: (lv_from_8_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1408:1: (lv_from_8_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1409:3: lv_from_8_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3239);
            lv_from_8_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmailRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_8_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleEmail3251); 

                	newLeafNode(otherlv_9, grammarAccess.getEmailAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleEmail3263); 

                	newLeafNode(otherlv_10, grammarAccess.getEmailAccess().getMessageKeyword_10());
                
            otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleEmail3275); 

                	newLeafNode(otherlv_11, grammarAccess.getEmailAccess().getColonKeyword_11());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1437:1: ( (lv_value_12_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1438:1: (lv_value_12_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1438:1: (lv_value_12_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1439:3: lv_value_12_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3296);
            lv_value_12_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmailRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_12_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleEmail3308); 

                	newLeafNode(otherlv_13, grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_13());
                
            otherlv_14=(Token)match(input,38,FOLLOW_38_in_ruleEmail3320); 

                	newLeafNode(otherlv_14, grammarAccess.getEmailAccess().getToKeyword_14());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1463:1: ( (lv_to_15_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1464:1: (lv_to_15_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1464:1: (lv_to_15_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1465:3: lv_to_15_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3341);
            lv_to_15_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmailRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_15_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleEmail3353); 

                	newLeafNode(otherlv_16, grammarAccess.getEmailAccess().getSemicolonKeyword_16());
                

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
    // $ANTLR end "ruleEmail"


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1493:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1494:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1495:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3389);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3399); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1502:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_event_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1505:28: ( ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1506:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1506:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1506:2: ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1506:2: ( (lv_name_0_0= 'GoTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1507:1: (lv_name_0_0= 'GoTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1507:1: (lv_name_0_0= 'GoTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1508:3: lv_name_0_0= 'GoTo'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_47_in_ruleTransition3442); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GoTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1521:2: ( (otherlv_1= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1522:1: (otherlv_1= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1522:1: (otherlv_1= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1523:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3475); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleTransition3487); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getWhenKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1538:1: ( (lv_event_3_0= ruleEVENT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1539:1: (lv_event_3_0= ruleEVENT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1539:1: (lv_event_3_0= ruleEVENT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1540:3: lv_event_3_0= ruleEVENT
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEVENT_in_ruleTransition3508);
            lv_event_3_0=ruleEVENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_3_0, 
                    		"EVENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleTransition3520); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleIfExp"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1568:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1569:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1570:2: iv_ruleIfExp= ruleIfExp EOF
            {
             newCompositeNode(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp3556);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;

             current =iv_ruleIfExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp3566); 

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
    // $ANTLR end "entryRuleIfExp"


    // $ANTLR start "ruleIfExp"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1577:1: ruleIfExp returns [EObject current=null] : ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_block_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1580:28: ( ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1581:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1581:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1581:2: ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1581:2: ( (lv_block_0_0= ruleCondBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1582:1: (lv_block_0_0= ruleCondBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1582:1: (lv_block_0_0= ruleCondBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1583:3: lv_block_0_0= ruleCondBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3612);
            lv_block_0_0=ruleCondBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExpRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_0_0, 
                    		"CondBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1599:2: (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==49) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==50) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1599:4: otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleIfExp3625); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIfExpAccess().getElseKeyword_1_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1603:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1604:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1604:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1605:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3646);
            	    lv_blocks_2_0=ruleCondBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_2_0, 
            	            		"CondBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1621:4: (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==49) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1621:6: otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleIfExp3661); 

                        	newLeafNode(otherlv_3, grammarAccess.getIfExpAccess().getElseKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1625:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1626:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1626:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1627:3: lv_defaultBlock_4_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp3682);
                    lv_defaultBlock_4_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfExpRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultBlock",
                            		lv_defaultBlock_4_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleIfExp"


    // $ANTLR start "entryRuleCondBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1651:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1652:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1653:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
             newCompositeNode(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock3720);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;

             current =iv_ruleCondBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock3730); 

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
    // $ANTLR end "entryRuleCondBlock"


    // $ANTLR start "ruleCondBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1660:1: ruleCondBlock returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1663:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1664:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1664:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1664:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleCondBlock3767); 

                	newLeafNode(otherlv_0, grammarAccess.getCondBlockAccess().getIfKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1668:1: ( (lv_cond_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1669:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1669:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1670:3: lv_cond_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3788);
            lv_cond_1_0=ruleTerminalBoolExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCondBlockRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_1_0, 
                    		"TerminalBoolExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1686:2: ( (lv_action_2_0= ruleBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1687:1: (lv_action_2_0= ruleBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1687:1: (lv_action_2_0= ruleBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1688:3: lv_action_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock3809);
            lv_action_2_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCondBlockRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_2_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleCondBlock"


    // $ANTLR start "entryRuleBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1712:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1713:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1714:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock3845);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock3855); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1721:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sta_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1724:28: ( ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1725:1: ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1725:1: ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1725:2: () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1725:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleBlock3901); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1735:1: ( (lv_sta_2_0= ruleAbstractElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==26||(LA11_0>=28 && LA11_0<=30)||(LA11_0>=32 && LA11_0<=34)||(LA11_0>=36 && LA11_0<=37)||(LA11_0>=41 && LA11_0<=43)||LA11_0==47||(LA11_0>=50 && LA11_0<=51)||(LA11_0>=54 && LA11_0<=56)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1736:1: (lv_sta_2_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1736:1: (lv_sta_2_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1737:3: lv_sta_2_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleBlock3922);
            	    lv_sta_2_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sta",
            	            		lv_sta_2_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleBlock3935); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBoolExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1765:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1766:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1767:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3971);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression3981); 

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
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1774:1: ruleBoolExpression returns [EObject current=null] : (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalBoolExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1777:28: ( (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1778:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1778:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1779:5: this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4028);
            this_TerminalBoolExpression_0=ruleTerminalBoolExpression();

            state._fsp--;

             
                    current = this_TerminalBoolExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1787:1: ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LOGIC_WORD) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1787:2: () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1787:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1788:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1793:2: ( (lv_op_2_0= RULE_LOGIC_WORD ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1794:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1794:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1795:3: lv_op_2_0= RULE_LOGIC_WORD
                    {
                    lv_op_2_0=(Token)match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4054); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBoolExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"LOGIC_WORD");
                    	    

                    }


                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1811:2: ( (lv_right_3_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1812:1: (lv_right_3_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1812:1: (lv_right_3_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1813:3: lv_right_3_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolExpression4080);
                    lv_right_3_0=ruleBoolExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoolExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"BoolExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleTerminalBoolExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1837:1: entryRuleTerminalBoolExpression returns [EObject current=null] : iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF ;
    public final EObject entryRuleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1838:2: (iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1839:2: iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4118);
            iv_ruleTerminalBoolExpression=ruleTerminalBoolExpression();

            state._fsp--;

             current =iv_ruleTerminalBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression4128); 

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
    // $ANTLR end "entryRuleTerminalBoolExpression"


    // $ANTLR start "ruleTerminalBoolExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1846:1: ruleTerminalBoolExpression returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) ;
    public final EObject ruleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_CompareExpression_1 = null;

        EObject this_NegExpression_2 = null;

        EObject this_Literal_3 = null;

        EObject this_Brackets_4 = null;

        EObject this_CALLSTATUS_5 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1849:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1850:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1850:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            int alt13=6;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1851:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4175);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1861:5: this_CompareExpression_1= ruleCompareExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4202);
                    this_CompareExpression_1=ruleCompareExpression();

                    state._fsp--;

                     
                            current = this_CompareExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1871:5: this_NegExpression_2= ruleNegExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4229);
                    this_NegExpression_2=ruleNegExpression();

                    state._fsp--;

                     
                            current = this_NegExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1881:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4256);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1891:5: this_Brackets_4= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4283);
                    this_Brackets_4=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1901:5: this_CALLSTATUS_5= ruleCALLSTATUS
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4310);
                    this_CALLSTATUS_5=ruleCALLSTATUS();

                    state._fsp--;

                     
                            current = this_CALLSTATUS_5; 
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
    // $ANTLR end "ruleTerminalBoolExpression"


    // $ANTLR start "entryRuleBrackets"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1917:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1918:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1919:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets4345);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets4355); 

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
    // $ANTLR end "entryRuleBrackets"


    // $ANTLR start "ruleBrackets"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1926:1: ruleBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1929:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1930:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1930:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1930:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1930:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1931:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1931:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1932:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleBrackets4397); 

            			newLeafNode(lv_open_0_0, grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBracketsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"open",
                    		lv_open_0_0, 
                    		"OBRACKET");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1948:2: ( (lv_obj_1_0= ruleBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1949:1: (lv_obj_1_0= ruleBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1949:1: (lv_obj_1_0= ruleBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1950:3: lv_obj_1_0= ruleBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolExpression_in_ruleBrackets4423);
            lv_obj_1_0=ruleBoolExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBracketsRule());
            	        }
                   		set(
                   			current, 
                   			"obj",
                    		lv_obj_1_0, 
                    		"BoolExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1966:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1967:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1967:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1968:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleBrackets4440); 

            			newLeafNode(lv_close_2_0, grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBracketsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"close",
                    		lv_close_2_0, 
                    		"CBRACKET");
            	    

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
    // $ANTLR end "ruleBrackets"


    // $ANTLR start "entryRuleCompareExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1992:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1993:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1994:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
             newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4481);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;

             current =iv_ruleCompareExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression4491); 

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
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2001:1: ruleCompareExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2004:28: ( ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2005:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2005:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2005:2: ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2005:2: ( (lv_left_0_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2006:1: (lv_left_0_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2006:1: (lv_left_0_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2007:3: lv_left_0_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4537);
            lv_left_0_0=ruleLiteralAbs();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"LiteralAbs");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2023:2: ( (lv_op_1_0= RULE_COMPARE ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2024:1: (lv_op_1_0= RULE_COMPARE )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2024:1: (lv_op_1_0= RULE_COMPARE )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2025:3: lv_op_1_0= RULE_COMPARE
            {
            lv_op_1_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareExpression4554); 

            			newLeafNode(lv_op_1_0, grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompareExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"COMPARE");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2041:2: ( (lv_right_2_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2042:1: (lv_right_2_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2042:1: (lv_right_2_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2043:3: lv_right_2_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4580);
            lv_right_2_0=ruleLiteralAbs();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"LiteralAbs");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2067:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2068:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2069:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
             newCompositeNode(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4616);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;

             current =iv_ruleNegExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4626); 

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
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2076:1: ruleNegExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2079:28: ( ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2080:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2080:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2080:2: ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2080:2: ( (lv_op_0_0= RULE_NEGATION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2081:1: (lv_op_0_0= RULE_NEGATION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2081:1: (lv_op_0_0= RULE_NEGATION )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2082:3: lv_op_0_0= RULE_NEGATION
            {
            lv_op_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_ruleNegExpression4668); 

            			newLeafNode(lv_op_0_0, grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNegExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"NEGATION");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2098:2: ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2099:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2099:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2100:3: lv_obj_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4694);
            lv_obj_1_0=ruleTerminalBoolExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"obj",
                    		lv_obj_1_0, 
                    		"TerminalBoolExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleMathExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2124:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2125:2: (iv_ruleMathExpression= ruleMathExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2126:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression4730);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression4740); 

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
    // $ANTLR end "entryRuleMathExpression"


    // $ANTLR start "ruleMathExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2133:1: ruleMathExpression returns [EObject current=null] : (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MathTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2136:28: ( (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2137:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2137:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2138:5: this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMathTerminal_in_ruleMathExpression4787);
            this_MathTerminal_0=ruleMathTerminal();

            state._fsp--;

             
                    current = this_MathTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2146:1: ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_MATH) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2146:2: () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2146:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2147:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2152:2: ( (lv_op_2_0= RULE_MATH ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2153:1: (lv_op_2_0= RULE_MATH )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2153:1: (lv_op_2_0= RULE_MATH )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2154:3: lv_op_2_0= RULE_MATH
                    {
                    lv_op_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathExpression4813); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"MATH");
                    	    

                    }


                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2170:2: ( (lv_right_3_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2171:1: (lv_right_3_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2171:1: (lv_right_3_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2172:3: lv_right_3_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleMathExpression4839);
                    lv_right_3_0=ruleMathExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMathExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"MathExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMathExpression"


    // $ANTLR start "entryRuleMathTerminal"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2196:1: entryRuleMathTerminal returns [EObject current=null] : iv_ruleMathTerminal= ruleMathTerminal EOF ;
    public final EObject entryRuleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2197:2: (iv_ruleMathTerminal= ruleMathTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2198:2: iv_ruleMathTerminal= ruleMathTerminal EOF
            {
             newCompositeNode(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4877);
            iv_ruleMathTerminal=ruleMathTerminal();

            state._fsp--;

             current =iv_ruleMathTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal4887); 

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
    // $ANTLR end "entryRuleMathTerminal"


    // $ANTLR start "ruleMathTerminal"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2205:1: ruleMathTerminal returns [EObject current=null] : (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject ruleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_MathBrackets_0 = null;

        EObject this_Literal_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2208:28: ( (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2209:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2209:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt15=1;
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
                alt15=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2210:5: this_MathBrackets_0= ruleMathBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMathBrackets_in_ruleMathTerminal4934);
                    this_MathBrackets_0=ruleMathBrackets();

                    state._fsp--;

                     
                            current = this_MathBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2220:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleMathTerminal4961);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2230:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_ruleMathTerminal4988);
                    this_NumLiteral_2=ruleNumLiteral();

                    state._fsp--;

                     
                            current = this_NumLiteral_2; 
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
    // $ANTLR end "ruleMathTerminal"


    // $ANTLR start "entryRuleMathBrackets"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2246:1: entryRuleMathBrackets returns [EObject current=null] : iv_ruleMathBrackets= ruleMathBrackets EOF ;
    public final EObject entryRuleMathBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2247:2: (iv_ruleMathBrackets= ruleMathBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2248:2: iv_ruleMathBrackets= ruleMathBrackets EOF
            {
             newCompositeNode(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5023);
            iv_ruleMathBrackets=ruleMathBrackets();

            state._fsp--;

             current =iv_ruleMathBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets5033); 

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
    // $ANTLR end "entryRuleMathBrackets"


    // $ANTLR start "ruleMathBrackets"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2255:1: ruleMathBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleMathBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2258:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2259:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2259:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2259:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2259:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2260:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2260:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2261:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5075); 

            			newLeafNode(lv_open_0_0, grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMathBracketsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"open",
                    		lv_open_0_0, 
                    		"OBRACKET");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2277:2: ( (lv_obj_1_0= ruleMathExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2278:1: (lv_obj_1_0= ruleMathExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2278:1: (lv_obj_1_0= ruleMathExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2279:3: lv_obj_1_0= ruleMathExpression
            {
             
            	        newCompositeNode(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathExpression_in_ruleMathBrackets5101);
            lv_obj_1_0=ruleMathExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMathBracketsRule());
            	        }
                   		set(
                   			current, 
                   			"obj",
                    		lv_obj_1_0, 
                    		"MathExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2295:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2296:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2296:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2297:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5118); 

            			newLeafNode(lv_close_2_0, grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMathBracketsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"close",
                    		lv_close_2_0, 
                    		"CBRACKET");
            	    

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
    // $ANTLR end "ruleMathBrackets"


    // $ANTLR start "entryRuleConcatenationExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2321:1: entryRuleConcatenationExpression returns [EObject current=null] : iv_ruleConcatenationExpression= ruleConcatenationExpression EOF ;
    public final EObject entryRuleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2322:2: (iv_ruleConcatenationExpression= ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2323:2: iv_ruleConcatenationExpression= ruleConcatenationExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5159);
            iv_ruleConcatenationExpression=ruleConcatenationExpression();

            state._fsp--;

             current =iv_ruleConcatenationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression5169); 

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
    // $ANTLR end "entryRuleConcatenationExpression"


    // $ANTLR start "ruleConcatenationExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2330:1: ruleConcatenationExpression returns [EObject current=null] : (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) ;
    public final EObject ruleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ConcatenationTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2333:28: ( (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2334:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2334:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2335:5: this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5216);
            this_ConcatenationTerminal_0=ruleConcatenationTerminal();

            state._fsp--;

             
                    current = this_ConcatenationTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2343:1: ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CONCATENATION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2343:2: () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2343:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2344:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2349:2: ( (lv_op_2_0= RULE_CONCATENATION ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2350:1: (lv_op_2_0= RULE_CONCATENATION )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2350:1: (lv_op_2_0= RULE_CONCATENATION )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2351:3: lv_op_2_0= RULE_CONCATENATION
                    {
                    lv_op_2_0=(Token)match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_ruleConcatenationExpression5242); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConcatenationExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"CONCATENATION");
                    	    

                    }


                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2367:2: ( (lv_right_3_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2368:1: (lv_right_3_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2368:1: (lv_right_3_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2369:3: lv_right_3_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5268);
                    lv_right_3_0=ruleConcatenationExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConcatenationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"ConcatenationExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConcatenationExpression"


    // $ANTLR start "entryRuleConcatenationTerminal"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2393:1: entryRuleConcatenationTerminal returns [EObject current=null] : iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF ;
    public final EObject entryRuleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2394:2: (iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2395:2: iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF
            {
             newCompositeNode(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5306);
            iv_ruleConcatenationTerminal=ruleConcatenationTerminal();

            state._fsp--;

             current =iv_ruleConcatenationTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal5316); 

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
    // $ANTLR end "entryRuleConcatenationTerminal"


    // $ANTLR start "ruleConcatenationTerminal"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2402:1: ruleConcatenationTerminal returns [EObject current=null] : (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) ;
    public final EObject ruleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_ConcatenationBrackets_0 = null;

        EObject this_LiteralAbs_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2405:28: ( (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2406:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2406:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OBRACKET) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||(LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||(LA17_0>=RULE_NULL && LA17_0<=RULE_DOUBLE)||LA17_0==60||(LA17_0>=62 && LA17_0<=68)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2407:5: this_ConcatenationBrackets_0= ruleConcatenationBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5363);
                    this_ConcatenationBrackets_0=ruleConcatenationBrackets();

                    state._fsp--;

                     
                            current = this_ConcatenationBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2417:5: this_LiteralAbs_1= ruleLiteralAbs
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5390);
                    this_LiteralAbs_1=ruleLiteralAbs();

                    state._fsp--;

                     
                            current = this_LiteralAbs_1; 
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
    // $ANTLR end "ruleConcatenationTerminal"


    // $ANTLR start "entryRuleConcatenationBrackets"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2433:1: entryRuleConcatenationBrackets returns [EObject current=null] : iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF ;
    public final EObject entryRuleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2434:2: (iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2435:2: iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF
            {
             newCompositeNode(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5425);
            iv_ruleConcatenationBrackets=ruleConcatenationBrackets();

            state._fsp--;

             current =iv_ruleConcatenationBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets5435); 

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
    // $ANTLR end "entryRuleConcatenationBrackets"


    // $ANTLR start "ruleConcatenationBrackets"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2442:1: ruleConcatenationBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2445:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2446:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2446:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2446:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2446:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2447:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2447:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2448:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5477); 

            			newLeafNode(lv_open_0_0, grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcatenationBracketsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"open",
                    		lv_open_0_0, 
                    		"OBRACKET");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2464:2: ( (lv_obj_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2465:1: (lv_obj_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2465:1: (lv_obj_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2466:3: lv_obj_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5503);
            lv_obj_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcatenationBracketsRule());
            	        }
                   		set(
                   			current, 
                   			"obj",
                    		lv_obj_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2482:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2483:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2483:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2484:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5520); 

            			newLeafNode(lv_close_2_0, grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcatenationBracketsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"close",
                    		lv_close_2_0, 
                    		"CBRACKET");
            	    

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
    // $ANTLR end "ruleConcatenationBrackets"


    // $ANTLR start "entryRuleStringVariable"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2508:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2509:2: (iv_ruleStringVariable= ruleStringVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2510:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable5561);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable5571); 

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
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2517:1: ruleStringVariable returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2520:28: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2521:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2521:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2521:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleStringVariable5608); 

                	newLeafNode(otherlv_0, grammarAccess.getStringVariableAccess().getStringKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2525:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2526:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2526:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2527:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariable5625); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2543:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=52 && LA19_0<=53)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2543:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2543:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==52) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==53) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2543:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleStringVariable5644); 

                                	newLeafNode(otherlv_2, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2548:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleStringVariable5662); 

                                	newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2552:2: ( (lv_value_4_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2553:1: (lv_value_4_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2553:1: (lv_value_4_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2554:3: lv_value_4_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5684);
                    lv_value_4_0=ruleConcatenationExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"ConcatenationExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleStringVariable5698); 

                	newLeafNode(otherlv_5, grammarAccess.getStringVariableAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleNumVariable"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2582:1: entryRuleNumVariable returns [EObject current=null] : iv_ruleNumVariable= ruleNumVariable EOF ;
    public final EObject entryRuleNumVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2583:2: (iv_ruleNumVariable= ruleNumVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2584:2: iv_ruleNumVariable= ruleNumVariable EOF
            {
             newCompositeNode(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable5734);
            iv_ruleNumVariable=ruleNumVariable();

            state._fsp--;

             current =iv_ruleNumVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable5744); 

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
    // $ANTLR end "entryRuleNumVariable"


    // $ANTLR start "ruleNumVariable"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2591:1: ruleNumVariable returns [EObject current=null] : (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleNumVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2594:28: ( (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2595:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2595:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2595:3: otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleNumVariable5781); 

                	newLeafNode(otherlv_0, grammarAccess.getNumVariableAccess().getNumKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2599:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2600:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2600:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2601:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumVariable5798); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNumVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=52 && LA21_0<=53)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==52) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==53) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleNumVariable5817); 

                                	newLeafNode(otherlv_2, grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2622:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleNumVariable5835); 

                                	newLeafNode(otherlv_3, grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2626:2: ( (lv_value_4_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2627:1: (lv_value_4_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2627:1: (lv_value_4_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2628:3: lv_value_4_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleNumVariable5857);
                    lv_value_4_0=ruleMathExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"MathExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleNumVariable5871); 

                	newLeafNode(otherlv_5, grammarAccess.getNumVariableAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleNumVariable"


    // $ANTLR start "entryRuleBoolVariable"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2656:1: entryRuleBoolVariable returns [EObject current=null] : iv_ruleBoolVariable= ruleBoolVariable EOF ;
    public final EObject entryRuleBoolVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2657:2: (iv_ruleBoolVariable= ruleBoolVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2658:2: iv_ruleBoolVariable= ruleBoolVariable EOF
            {
             newCompositeNode(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5907);
            iv_ruleBoolVariable=ruleBoolVariable();

            state._fsp--;

             current =iv_ruleBoolVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable5917); 

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
    // $ANTLR end "entryRuleBoolVariable"


    // $ANTLR start "ruleBoolVariable"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2665:1: ruleBoolVariable returns [EObject current=null] : (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleBoolVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2668:28: ( (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2669:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2669:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2669:3: otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleBoolVariable5954); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolVariableAccess().getBoolKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2673:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2674:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2674:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2675:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolVariable5971); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBoolVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoolVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2691:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=52 && LA23_0<=53)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2691:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2691:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==52) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==53) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2691:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBoolVariable5990); 

                                	newLeafNode(otherlv_2, grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2696:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleBoolVariable6008); 

                                	newLeafNode(otherlv_3, grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2700:2: ( (lv_value_4_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2701:1: (lv_value_4_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2701:1: (lv_value_4_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2702:3: lv_value_4_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolVariable6030);
                    lv_value_4_0=ruleBoolExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoolVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"BoolExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleBoolVariable6044); 

                	newLeafNode(otherlv_5, grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleBoolVariable"


    // $ANTLR start "entryRuleConstant"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2730:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2731:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2732:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant6080);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant6090); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2739:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2742:28: ( (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2743:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2743:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2743:3: otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleConstant6127); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2747:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2748:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2748:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2749:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant6144); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2765:2: (otherlv_2= '=' | otherlv_3= ' = ' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            else if ( (LA24_0==53) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2765:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleConstant6162); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2770:7: otherlv_3= ' = '
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleConstant6180); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2774:2: ( (lv_value_4_0= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2775:1: (lv_value_4_0= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2775:1: (lv_value_4_0= rulePrimitive )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2776:3: lv_value_4_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitive_in_ruleConstant6202);
            lv_value_4_0=rulePrimitive();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"Primitive");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleConstant6214); 

                	newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRulePrimitive"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2804:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2805:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2806:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive6250);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive6260); 

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2813:1: rulePrimitive returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2816:28: ( (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2817:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2817:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case RULE_BOOL:
                {
                alt25=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2818:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitive6307);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2828:5: this_BoolLiteral_1= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rulePrimitive6334);
                    this_BoolLiteral_1=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2838:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_rulePrimitive6361);
                    this_NumLiteral_2=ruleNumLiteral();

                    state._fsp--;

                     
                            current = this_NumLiteral_2; 
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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleLiteralAbs"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2856:1: entryRuleLiteralAbs returns [EObject current=null] : iv_ruleLiteralAbs= ruleLiteralAbs EOF ;
    public final EObject entryRuleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAbs = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2857:2: (iv_ruleLiteralAbs= ruleLiteralAbs EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2858:2: iv_ruleLiteralAbs= ruleLiteralAbs EOF
            {
             newCompositeNode(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6398);
            iv_ruleLiteralAbs=ruleLiteralAbs();

            state._fsp--;

             current =iv_ruleLiteralAbs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs6408); 

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
    // $ANTLR end "entryRuleLiteralAbs"


    // $ANTLR start "ruleLiteralAbs"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2865:1: ruleLiteralAbs returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) ;
    public final EObject ruleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Primitive_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2868:28: ( (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2869:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2869:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==RULE_NULL||LA26_0==60||(LA26_0>=62 && LA26_0<=68)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||(LA26_0>=RULE_BOOL && LA26_0<=RULE_DOUBLE)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2870:5: this_Literal_0= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleLiteralAbs6455);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2880:5: this_Primitive_1= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleLiteralAbs6482);
                    this_Primitive_1=rulePrimitive();

                    state._fsp--;

                     
                            current = this_Primitive_1; 
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
    // $ANTLR end "ruleLiteralAbs"


    // $ANTLR start "entryRuleLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2896:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2897:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2898:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6517);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6527); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:1: ruleLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nul_1_0=null;
        EObject this_SESSION_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2908:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case RULE_NULL:
                {
                alt27=2;
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
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2909:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2910:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2910:1: (otherlv_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2911:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral6572); 

                    		newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2923:6: ( (lv_nul_1_0= RULE_NULL ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2923:6: ( (lv_nul_1_0= RULE_NULL ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2924:1: (lv_nul_1_0= RULE_NULL )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2924:1: (lv_nul_1_0= RULE_NULL )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2925:3: lv_nul_1_0= RULE_NULL
                    {
                    lv_nul_1_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral6595); 

                    			newLeafNode(lv_nul_1_0, grammarAccess.getLiteralAccess().getNulNULLTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nul",
                            		lv_nul_1_0, 
                            		"NULL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2943:5: this_SESSION_2= ruleSESSION
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSESSION_in_ruleLiteral6628);
                    this_SESSION_2=ruleSESSION();

                    state._fsp--;

                     
                            current = this_SESSION_2; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2959:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2960:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2961:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6663);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral6673); 

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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2968:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2971:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2972:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2972:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2972:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2972:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2973:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2978:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2979:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2979:1: (lv_value_1_0= RULE_BOOL )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2980:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral6724); 

            			newLeafNode(lv_value_1_0, grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoolLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BOOL");
            	    

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
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleNumLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3004:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3005:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3006:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6765);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;

             current =iv_ruleNumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral6775); 

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
    // $ANTLR end "entryRuleNumLiteral"


    // $ANTLR start "ruleNumLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3013:1: ruleNumLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3016:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3017:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3017:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3017:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3017:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3018:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumLiteralAccess().getNumLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3023:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3024:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3024:1: (lv_value_1_0= ruleNumber )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3025:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumLiteral6830);
            lv_value_1_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Number");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNumLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3049:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3050:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3051:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6866);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6876); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3058:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3061:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3062:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3062:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3062:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3062:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3063:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3068:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3069:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3069:1: (lv_value_1_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3070:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6927); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumber"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3094:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3095:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3096:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber6969);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber6980); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3103:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3106:28: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3107:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3107:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DOUBLE) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_INT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3107:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumber7020); 

                    		current.merge(this_DOUBLE_0);
                        
                     
                        newLeafNode(this_DOUBLE_0, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3115:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7046); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEVENT"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3130:1: entryRuleEVENT returns [EObject current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final EObject entryRuleEVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENT = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3131:2: (iv_ruleEVENT= ruleEVENT EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3132:2: iv_ruleEVENT= ruleEVENT EOF
            {
             newCompositeNode(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT7091);
            iv_ruleEVENT=ruleEVENT();

            state._fsp--;

             current =iv_ruleEVENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT7101); 

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
    // $ANTLR end "entryRuleEVENT"


    // $ANTLR start "ruleEVENT"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3139:1: ruleEVENT returns [EObject current=null] : ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) ) ;
    public final EObject ruleEVENT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3142:28: ( ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3143:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3143:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt29=1;
                }
                break;
            case 58:
                {
                alt29=2;
                }
                break;
            case 59:
                {
                alt29=3;
                }
                break;
            case 60:
                {
                alt29=4;
                }
                break;
            case 61:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3143:2: ( (lv_name_0_0= 'HANGUP' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3143:2: ( (lv_name_0_0= 'HANGUP' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3144:1: (lv_name_0_0= 'HANGUP' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3144:1: (lv_name_0_0= 'HANGUP' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3145:3: lv_name_0_0= 'HANGUP'
                    {
                    lv_name_0_0=(Token)match(input,57,FOLLOW_57_in_ruleEVENT7144); 

                            newLeafNode(lv_name_0_0, grammarAccess.getEVENTAccess().getNameHANGUPKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEVENTRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "HANGUP");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3159:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3159:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3160:1: (lv_name_1_0= 'COMPLETED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3160:1: (lv_name_1_0= 'COMPLETED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3161:3: lv_name_1_0= 'COMPLETED'
                    {
                    lv_name_1_0=(Token)match(input,58,FOLLOW_58_in_ruleEVENT7181); 

                            newLeafNode(lv_name_1_0, grammarAccess.getEVENTAccess().getNameCOMPLETEDKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEVENTRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "COMPLETED");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3175:6: ( (lv_name_2_0= 'ERROR' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3175:6: ( (lv_name_2_0= 'ERROR' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3176:1: (lv_name_2_0= 'ERROR' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3176:1: (lv_name_2_0= 'ERROR' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3177:3: lv_name_2_0= 'ERROR'
                    {
                    lv_name_2_0=(Token)match(input,59,FOLLOW_59_in_ruleEVENT7218); 

                            newLeafNode(lv_name_2_0, grammarAccess.getEVENTAccess().getNameERRORKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEVENTRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "ERROR");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3191:6: ( (lv_name_3_0= 'TIMES' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3191:6: ( (lv_name_3_0= 'TIMES' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3192:1: (lv_name_3_0= 'TIMES' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3192:1: (lv_name_3_0= 'TIMES' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3193:3: lv_name_3_0= 'TIMES'
                    {
                    lv_name_3_0=(Token)match(input,60,FOLLOW_60_in_ruleEVENT7255); 

                            newLeafNode(lv_name_3_0, grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEVENTRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "TIMES");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3207:6: ( (lv_name_4_0= 'TIMEOUT' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3207:6: ( (lv_name_4_0= 'TIMEOUT' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3208:1: (lv_name_4_0= 'TIMEOUT' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3208:1: (lv_name_4_0= 'TIMEOUT' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3209:3: lv_name_4_0= 'TIMEOUT'
                    {
                    lv_name_4_0=(Token)match(input,61,FOLLOW_61_in_ruleEVENT7292); 

                            newLeafNode(lv_name_4_0, grammarAccess.getEVENTAccess().getNameTIMEOUTKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEVENTRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "TIMEOUT");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleEVENT"


    // $ANTLR start "entryRuleSESSION"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3230:1: entryRuleSESSION returns [EObject current=null] : iv_ruleSESSION= ruleSESSION EOF ;
    public final EObject entryRuleSESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSESSION = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3231:2: (iv_ruleSESSION= ruleSESSION EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3232:2: iv_ruleSESSION= ruleSESSION EOF
            {
             newCompositeNode(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION7341);
            iv_ruleSESSION=ruleSESSION();

            state._fsp--;

             current =iv_ruleSESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION7351); 

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
    // $ANTLR end "entryRuleSESSION"


    // $ANTLR start "ruleSESSION"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3239:1: ruleSESSION returns [EObject current=null] : ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) | ( (lv_name_4_0= 'ANSWER' ) ) | ( (lv_name_5_0= 'DIGITS' ) ) | ( (lv_name_6_0= 'RECORD' ) ) | ( (lv_name_7_0= 'TIMES' ) ) ) ;
    public final EObject ruleSESSION() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3242:28: ( ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) | ( (lv_name_4_0= 'ANSWER' ) ) | ( (lv_name_5_0= 'DIGITS' ) ) | ( (lv_name_6_0= 'RECORD' ) ) | ( (lv_name_7_0= 'TIMES' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3243:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) | ( (lv_name_4_0= 'ANSWER' ) ) | ( (lv_name_5_0= 'DIGITS' ) ) | ( (lv_name_6_0= 'RECORD' ) ) | ( (lv_name_7_0= 'TIMES' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3243:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) | ( (lv_name_4_0= 'ANSWER' ) ) | ( (lv_name_5_0= 'DIGITS' ) ) | ( (lv_name_6_0= 'RECORD' ) ) | ( (lv_name_7_0= 'TIMES' ) ) )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt30=1;
                }
                break;
            case 63:
                {
                alt30=2;
                }
                break;
            case 64:
                {
                alt30=3;
                }
                break;
            case 65:
                {
                alt30=4;
                }
                break;
            case 66:
                {
                alt30=5;
                }
                break;
            case 67:
                {
                alt30=6;
                }
                break;
            case 68:
                {
                alt30=7;
                }
                break;
            case 60:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3243:2: ( (lv_name_0_0= 'CALLER' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3243:2: ( (lv_name_0_0= 'CALLER' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3244:1: (lv_name_0_0= 'CALLER' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3244:1: (lv_name_0_0= 'CALLER' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3245:3: lv_name_0_0= 'CALLER'
                    {
                    lv_name_0_0=(Token)match(input,62,FOLLOW_62_in_ruleSESSION7394); 

                            newLeafNode(lv_name_0_0, grammarAccess.getSESSIONAccess().getNameCALLERKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "CALLER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3259:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3259:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3260:1: (lv_name_1_0= 'LASTSTATE' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3260:1: (lv_name_1_0= 'LASTSTATE' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3261:3: lv_name_1_0= 'LASTSTATE'
                    {
                    lv_name_1_0=(Token)match(input,63,FOLLOW_63_in_ruleSESSION7431); 

                            newLeafNode(lv_name_1_0, grammarAccess.getSESSIONAccess().getNameLASTSTATEKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "LASTSTATE");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3275:6: ( (lv_name_2_0= 'TIME' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3275:6: ( (lv_name_2_0= 'TIME' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3276:1: (lv_name_2_0= 'TIME' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3276:1: (lv_name_2_0= 'TIME' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3277:3: lv_name_2_0= 'TIME'
                    {
                    lv_name_2_0=(Token)match(input,64,FOLLOW_64_in_ruleSESSION7468); 

                            newLeafNode(lv_name_2_0, grammarAccess.getSESSIONAccess().getNameTIMEKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "TIME");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3291:6: ( (lv_name_3_0= 'CALLED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3291:6: ( (lv_name_3_0= 'CALLED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3292:1: (lv_name_3_0= 'CALLED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3292:1: (lv_name_3_0= 'CALLED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3293:3: lv_name_3_0= 'CALLED'
                    {
                    lv_name_3_0=(Token)match(input,65,FOLLOW_65_in_ruleSESSION7505); 

                            newLeafNode(lv_name_3_0, grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "CALLED");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3307:6: ( (lv_name_4_0= 'ANSWER' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3307:6: ( (lv_name_4_0= 'ANSWER' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3308:1: (lv_name_4_0= 'ANSWER' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3308:1: (lv_name_4_0= 'ANSWER' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3309:3: lv_name_4_0= 'ANSWER'
                    {
                    lv_name_4_0=(Token)match(input,66,FOLLOW_66_in_ruleSESSION7542); 

                            newLeafNode(lv_name_4_0, grammarAccess.getSESSIONAccess().getNameANSWERKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "ANSWER");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3323:6: ( (lv_name_5_0= 'DIGITS' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3323:6: ( (lv_name_5_0= 'DIGITS' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3324:1: (lv_name_5_0= 'DIGITS' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3324:1: (lv_name_5_0= 'DIGITS' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3325:3: lv_name_5_0= 'DIGITS'
                    {
                    lv_name_5_0=(Token)match(input,67,FOLLOW_67_in_ruleSESSION7579); 

                            newLeafNode(lv_name_5_0, grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "DIGITS");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3339:6: ( (lv_name_6_0= 'RECORD' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3339:6: ( (lv_name_6_0= 'RECORD' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3340:1: (lv_name_6_0= 'RECORD' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3340:1: (lv_name_6_0= 'RECORD' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3341:3: lv_name_6_0= 'RECORD'
                    {
                    lv_name_6_0=(Token)match(input,68,FOLLOW_68_in_ruleSESSION7616); 

                            newLeafNode(lv_name_6_0, grammarAccess.getSESSIONAccess().getNameRECORDKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_0, "RECORD");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:6: ( (lv_name_7_0= 'TIMES' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:6: ( (lv_name_7_0= 'TIMES' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3356:1: (lv_name_7_0= 'TIMES' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3356:1: (lv_name_7_0= 'TIMES' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3357:3: lv_name_7_0= 'TIMES'
                    {
                    lv_name_7_0=(Token)match(input,60,FOLLOW_60_in_ruleSESSION7653); 

                            newLeafNode(lv_name_7_0, grammarAccess.getSESSIONAccess().getNameTIMESKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_7_0, "TIMES");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleSESSION"


    // $ANTLR start "entryRuleCALLSTATUS"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3378:1: entryRuleCALLSTATUS returns [EObject current=null] : iv_ruleCALLSTATUS= ruleCALLSTATUS EOF ;
    public final EObject entryRuleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCALLSTATUS = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3379:2: (iv_ruleCALLSTATUS= ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3380:2: iv_ruleCALLSTATUS= ruleCALLSTATUS EOF
            {
             newCompositeNode(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS7702);
            iv_ruleCALLSTATUS=ruleCALLSTATUS();

            state._fsp--;

             current =iv_ruleCALLSTATUS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS7712); 

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
    // $ANTLR end "entryRuleCALLSTATUS"


    // $ANTLR start "ruleCALLSTATUS"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3387:1: ruleCALLSTATUS returns [EObject current=null] : ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) ;
    public final EObject ruleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3390:28: ( ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt31=1;
                }
                break;
            case 70:
                {
                alt31=2;
                }
                break;
            case 71:
                {
                alt31=3;
                }
                break;
            case 72:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:2: ( (lv_name_0_0= 'RINGING' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:2: ( (lv_name_0_0= 'RINGING' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3392:1: (lv_name_0_0= 'RINGING' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3392:1: (lv_name_0_0= 'RINGING' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3393:3: lv_name_0_0= 'RINGING'
                    {
                    lv_name_0_0=(Token)match(input,69,FOLLOW_69_in_ruleCALLSTATUS7755); 

                            newLeafNode(lv_name_0_0, grammarAccess.getCALLSTATUSAccess().getNameRINGINGKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCALLSTATUSRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "RINGING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3407:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3407:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3408:1: (lv_name_1_0= 'IN-PROGRESS' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3408:1: (lv_name_1_0= 'IN-PROGRESS' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3409:3: lv_name_1_0= 'IN-PROGRESS'
                    {
                    lv_name_1_0=(Token)match(input,70,FOLLOW_70_in_ruleCALLSTATUS7792); 

                            newLeafNode(lv_name_1_0, grammarAccess.getCALLSTATUSAccess().getNameINPROGRESSKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCALLSTATUSRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "IN-PROGRESS");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3423:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3423:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3424:1: (lv_name_2_0= 'DISCONNECTED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3424:1: (lv_name_2_0= 'DISCONNECTED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3425:3: lv_name_2_0= 'DISCONNECTED'
                    {
                    lv_name_2_0=(Token)match(input,71,FOLLOW_71_in_ruleCALLSTATUS7829); 

                            newLeafNode(lv_name_2_0, grammarAccess.getCALLSTATUSAccess().getNameDISCONNECTEDKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCALLSTATUSRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "DISCONNECTED");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3439:6: ( (lv_name_3_0= 'FAILED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3439:6: ( (lv_name_3_0= 'FAILED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3440:1: (lv_name_3_0= 'FAILED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3440:1: (lv_name_3_0= 'FAILED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3441:3: lv_name_3_0= 'FAILED'
                    {
                    lv_name_3_0=(Token)match(input,72,FOLLOW_72_in_ruleCALLSTATUS7866); 

                            newLeafNode(lv_name_3_0, grammarAccess.getCALLSTATUSAccess().getNameFAILEDKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCALLSTATUSRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "FAILED");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleCALLSTATUS"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\22\uffff";
    static final String DFA13_eofS =
        "\1\uffff\1\20\12\21\6\uffff";
    static final String DFA13_minS =
        "\1\4\13\10\6\uffff";
    static final String DFA13_maxS =
        "\1\110\13\33\6\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA13_specialS =
        "\22\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\2\14\1\uffff\1\16\2\uffff\1\15\2\uffff\1\3\1\1"+
            "\1\14\52\uffff\1\13\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\4"+
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1850:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDocument122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDocument139 = new BitSet(new long[]{0x01C8000000400022L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDocument165 = new BitSet(new long[]{0x01C8000000400022L});
    public static final BitSet FOLLOW_ruleState_in_ruleDocument187 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_ruleStatement281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_ruleStatement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_ruleStatement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleStatement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleStatement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbstractElement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAbstractElement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_ruleAbstractElement536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_ruleAbstractElement563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleState645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState662 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleState680 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleState697 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleState716 = new BitSet(new long[]{0x01CC8E3776000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleState737 = new BitSet(new long[]{0x01CC8E3776000020L});
    public static final BitSet FOLLOW_25_in_ruleState750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoiceTag796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_ruleVoiceTag843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_ruleVoiceTag870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_ruleVoiceTag897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_ruleVoiceTag924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_ruleVoiceTag951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_ruleVoiceTag978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_ruleVoiceTag1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_ruleVoiceTag1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_ruleVoiceTag1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleVoiceTag1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_ruleVoiceTag1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_ruleVoiceTag1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCall1228 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleCall1262 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCall1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_entryRuleDial1310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDial1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDial1363 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleDial1397 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDial1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_entryRulePlay1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlay1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePlay1498 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rulePlay1532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePlay1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRecord1633 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRecord1663 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRecord1680 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRecord1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_entryRuleReject1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReject1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleReject1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_entryRuleHangup1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHangup1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHangup1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_entryRuleGetDigits1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDigits1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGetDigits1981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGetDigits2011 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGetDigits2028 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGetDigits2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_entryRuleAsk2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsk2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAsk2129 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleAsk2163 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAsk2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend2211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSend2264 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSendBlock_in_ruleSend2298 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSend2310 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSend2331 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSend2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSendBlock2435 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSendBlock2456 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2477 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleSendBlock2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNotPrimaryParam2573 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleNotPrimaryParam2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParam2682 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleParam2699 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleParam2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay2756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSay2809 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSay2843 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSay2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_entryRuleSms2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSms2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSms2944 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms2978 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSms2990 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3011 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSms3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_entryRuleEmail3059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmail3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEmail3112 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEmail3137 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEmail3149 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEmail3161 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3182 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEmail3194 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEmail3206 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEmail3218 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3239 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEmail3251 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEmail3263 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEmail3275 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3296 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEmail3308 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEmail3320 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3341 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEmail3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTransition3442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3475 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTransition3487 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_ruleEVENT_in_ruleTransition3508 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTransition3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp3556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3612 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIfExp3625 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3646 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIfExp3661 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock3720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCondBlock3767 = new BitSet(new long[]{0xD0000000000392D0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3788 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBlock3901 = new BitSet(new long[]{0x01CC8E3776000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleBlock3922 = new BitSet(new long[]{0x01CC8E3776000020L});
    public static final BitSet FOLLOW_25_in_ruleBlock3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4028 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4054 = new BitSet(new long[]{0xD0000000000392D0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolExpression4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleBrackets4397 = new BitSet(new long[]{0xD0000000000392D0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBrackets4423 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleBrackets4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4537 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareExpression4554 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_ruleNegExpression4668 = new BitSet(new long[]{0xD0000000000392D0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression4730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_ruleMathExpression4787 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathExpression4813 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathExpression4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_ruleMathTerminal4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMathTerminal4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_ruleMathTerminal4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5075 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathBrackets5101 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5216 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_ruleConcatenationExpression5242 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5477 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5503 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable5561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStringVariable5608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariable5625 = new BitSet(new long[]{0x0030000008000000L});
    public static final BitSet FOLLOW_52_in_ruleStringVariable5644 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_53_in_ruleStringVariable5662 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5684 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStringVariable5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable5734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumVariable5781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumVariable5798 = new BitSet(new long[]{0x0030000008000000L});
    public static final BitSet FOLLOW_52_in_ruleNumVariable5817 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_53_in_ruleNumVariable5835 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleNumVariable5857 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNumVariable5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBoolVariable5954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolVariable5971 = new BitSet(new long[]{0x0030000008000000L});
    public static final BitSet FOLLOW_52_in_ruleBoolVariable5990 = new BitSet(new long[]{0xD0000000000392D0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_53_in_ruleBoolVariable6008 = new BitSet(new long[]{0xD0000000000392D0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolVariable6030 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBoolVariable6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleConstant6127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant6144 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleConstant6162 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_53_in_ruleConstant6180 = new BitSet(new long[]{0xD0000000000382D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleConstant6202 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConstant6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive6250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitive6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rulePrimitive6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rulePrimitive6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAbs6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleLiteralAbs6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_ruleLiteral6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumLiteral6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumber7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT7091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEVENT7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEVENT7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEVENT7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEVENT7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEVENT7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION7341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSESSION7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSESSION7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSESSION7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSESSION7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSESSION7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSESSION7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSESSION7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSESSION7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS7702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCALLSTATUS7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCALLSTATUS7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCALLSTATUS7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCALLSTATUS7866 = new BitSet(new long[]{0x0000000000000002L});

}