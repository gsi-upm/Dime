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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_NULL", "RULE_BOOL", "RULE_DOUBLE", "RULE_CONCATENATION", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'State'", "'times'", "'timeout'", "'{'", "'}'", "'Call'", "';'", "'DialTo'", "'Play'", "'Record'", "'seconds'", "'in'", "' -> '", "'Reject;'", "'HangUp;'", "'Get'", "'digits'", "'Ask'", "'Send'", "'to'", "','", "':'", "'Say'", "'Sms'", "'GoTo'", "'when'", "'else'", "'if'", "'+'", "'String'", "'='", "' = '", "'Num'", "'Bool'", "'Const'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'TIMEOUT'", "'CALLER'", "'LASTSTATE'", "'TIME'", "'CALLED'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
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
    public static final int RULE_BOOL=15;
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
    public static final int RULE_DOUBLE=16;
    public static final int RULE_NULL=14;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_LOGIC_WORD=8;
    public static final int T__35=35;
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

                if ( (LA2_0==22||(LA2_0>=24 && LA2_0<=25)) ) {
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
            case 46:
                {
                alt4=2;
                }
                break;
            case 49:
                {
                alt4=3;
                }
                break;
            case 27:
            case 29:
            case 30:
            case 31:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 44:
            case 45:
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:294:1: ruleState returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_times_4_0=null;
        Token otherlv_5=null;
        Token lv_timeout_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_stms_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:297:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:298:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:298:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:300:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:300:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:301:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup());
            	
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:304:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?)
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:305:3: ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:305:3: ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA8_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA8_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt8=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA8_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt8=2;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:307:4: ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:307:4: ({...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:308:5: {...}? => ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:308:100: ( ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:309:6: ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:312:6: ({...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:312:7: {...}? => (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleState", "true");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:312:16: (otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:312:18: otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleState690); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_0_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:316:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:317:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:317:1: (lv_name_2_0= RULE_ID )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:318:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState707); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStateRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:334:2: (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==23) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:334:4: otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) )
            	            {
            	            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleState725); 

            	                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getTimesKeyword_0_2_0());
            	                
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:338:1: ( (lv_times_4_0= RULE_INT ) )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:339:1: (lv_times_4_0= RULE_INT )
            	            {
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:339:1: (lv_times_4_0= RULE_INT )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:340:3: lv_times_4_0= RULE_INT
            	            {
            	            lv_times_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleState742); 

            	            			newLeafNode(lv_times_4_0, grammarAccess.getStateAccess().getTimesINTTerminalRuleCall_0_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getStateRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"times",
            	                    		lv_times_4_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:363:4: ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:363:4: ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:364:5: {...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:364:100: ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:365:6: ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:368:6: ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:368:7: {...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleState", "true");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:368:16: ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}' )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:368:17: (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleAbstractElement ) )* otherlv_9= '}'
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:368:17: (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==24) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:368:19: otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) )
            	            {
            	            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleState818); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0());
            	                
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:372:1: ( (lv_timeout_6_0= RULE_INT ) )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:373:1: (lv_timeout_6_0= RULE_INT )
            	            {
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:373:1: (lv_timeout_6_0= RULE_INT )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:374:3: lv_timeout_6_0= RULE_INT
            	            {
            	            lv_timeout_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleState835); 

            	            			newLeafNode(lv_timeout_6_0, grammarAccess.getStateAccess().getTimeoutINTTerminalRuleCall_1_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getStateRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"timeout",
            	                    		lv_timeout_6_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleState854); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:394:1: ( (lv_stms_8_0= ruleAbstractElement ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ML_COMMENT||LA7_0==27||(LA7_0>=29 && LA7_0<=31)||(LA7_0>=35 && LA7_0<=37)||(LA7_0>=39 && LA7_0<=40)||(LA7_0>=44 && LA7_0<=46)||LA7_0==49||LA7_0==51||(LA7_0>=54 && LA7_0<=56)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:395:1: (lv_stms_8_0= ruleAbstractElement )
            	    	    {
            	    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:395:1: (lv_stms_8_0= ruleAbstractElement )
            	    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:396:3: lv_stms_8_0= ruleAbstractElement
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getStateAccess().getStmsAbstractElementParserRuleCall_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleState875);
            	    	    lv_stms_8_0=ruleAbstractElement();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"stms",
            	    	            		lv_stms_8_0, 
            	    	            		"AbstractElement");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleState888); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStateAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canLeave(grammarAccess.getStateAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup());
            	

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:439:1: entryRuleVoiceTag returns [EObject current=null] : iv_ruleVoiceTag= ruleVoiceTag EOF ;
    public final EObject entryRuleVoiceTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoiceTag = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:440:2: (iv_ruleVoiceTag= ruleVoiceTag EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:441:2: iv_ruleVoiceTag= ruleVoiceTag EOF
            {
             newCompositeNode(grammarAccess.getVoiceTagRule()); 
            pushFollow(FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag970);
            iv_ruleVoiceTag=ruleVoiceTag();

            state._fsp--;

             current =iv_ruleVoiceTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoiceTag980); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:448:1: ruleVoiceTag returns [EObject current=null] : (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms ) ;
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


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:451:28: ( (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:452:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:452:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 31:
                {
                alt9=4;
                }
                break;
            case 37:
                {
                alt9=5;
                }
                break;
            case 39:
                {
                alt9=6;
                }
                break;
            case 40:
                {
                alt9=7;
                }
                break;
            case 35:
                {
                alt9=8;
                }
                break;
            case 36:
                {
                alt9=9;
                }
                break;
            case 27:
                {
                alt9=10;
                }
                break;
            case 45:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:453:5: this_Say_0= ruleSay
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSay_in_ruleVoiceTag1027);
                    this_Say_0=ruleSay();

                    state._fsp--;

                     
                            current = this_Say_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:463:5: this_Dial_1= ruleDial
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDial_in_ruleVoiceTag1054);
                    this_Dial_1=ruleDial();

                    state._fsp--;

                     
                            current = this_Dial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:473:5: this_Play_2= rulePlay
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePlay_in_ruleVoiceTag1081);
                    this_Play_2=rulePlay();

                    state._fsp--;

                     
                            current = this_Play_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:483:5: this_Record_3= ruleRecord
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRecord_in_ruleVoiceTag1108);
                    this_Record_3=ruleRecord();

                    state._fsp--;

                     
                            current = this_Record_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:493:5: this_GetDigits_4= ruleGetDigits
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetDigits_in_ruleVoiceTag1135);
                    this_GetDigits_4=ruleGetDigits();

                    state._fsp--;

                     
                            current = this_GetDigits_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:503:5: this_Ask_5= ruleAsk
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAsk_in_ruleVoiceTag1162);
                    this_Ask_5=ruleAsk();

                    state._fsp--;

                     
                            current = this_Ask_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:513:5: this_Send_6= ruleSend
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSend_in_ruleVoiceTag1189);
                    this_Send_6=ruleSend();

                    state._fsp--;

                     
                            current = this_Send_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:523:5: this_Reject_7= ruleReject
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleReject_in_ruleVoiceTag1216);
                    this_Reject_7=ruleReject();

                    state._fsp--;

                     
                            current = this_Reject_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:533:5: this_Hangup_8= ruleHangup
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHangup_in_ruleVoiceTag1243);
                    this_Hangup_8=ruleHangup();

                    state._fsp--;

                     
                            current = this_Hangup_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:543:5: this_Call_9= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleVoiceTag1270);
                    this_Call_9=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:553:5: this_Sms_10= ruleSms
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleSms_in_ruleVoiceTag1297);
                    this_Sms_10=ruleSms();

                    state._fsp--;

                     
                            current = this_Sms_10; 
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:569:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:570:2: (iv_ruleCall= ruleCall EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:571:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1332);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1342); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:578:1: ruleCall returns [EObject current=null] : ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:581:28: ( ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:582:1: ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:582:1: ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:582:2: ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:582:2: ( (lv_name_0_0= 'Call' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:583:1: (lv_name_0_0= 'Call' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:583:1: (lv_name_0_0= 'Call' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:584:3: lv_name_0_0= 'Call'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleCall1385); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCallAccess().getNameCallKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCallRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Call");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:597:2: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:598:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:598:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:599:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleCall1419);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCall1431); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:627:1: entryRuleDial returns [EObject current=null] : iv_ruleDial= ruleDial EOF ;
    public final EObject entryRuleDial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDial = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:628:2: (iv_ruleDial= ruleDial EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:629:2: iv_ruleDial= ruleDial EOF
            {
             newCompositeNode(grammarAccess.getDialRule()); 
            pushFollow(FOLLOW_ruleDial_in_entryRuleDial1467);
            iv_ruleDial=ruleDial();

            state._fsp--;

             current =iv_ruleDial; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDial1477); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:636:1: ruleDial returns [EObject current=null] : ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleDial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:639:28: ( ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:640:1: ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:640:1: ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:640:2: ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:640:2: ( (lv_name_0_0= 'DialTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:641:1: (lv_name_0_0= 'DialTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:641:1: (lv_name_0_0= 'DialTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:642:3: lv_name_0_0= 'DialTo'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleDial1520); 

                    newLeafNode(lv_name_0_0, grammarAccess.getDialAccess().getNameDialToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDialRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "DialTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:655:2: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:656:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:656:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:657:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleDial1554);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleDial1566); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:685:1: entryRulePlay returns [EObject current=null] : iv_rulePlay= rulePlay EOF ;
    public final EObject entryRulePlay() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:686:2: (iv_rulePlay= rulePlay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:687:2: iv_rulePlay= rulePlay EOF
            {
             newCompositeNode(grammarAccess.getPlayRule()); 
            pushFollow(FOLLOW_rulePlay_in_entryRulePlay1602);
            iv_rulePlay=rulePlay();

            state._fsp--;

             current =iv_rulePlay; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlay1612); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:694:1: rulePlay returns [EObject current=null] : ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject rulePlay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_file_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:697:28: ( ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:698:1: ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:698:1: ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:698:2: ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:698:2: ( (lv_name_0_0= 'Play' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:699:1: (lv_name_0_0= 'Play' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:699:1: (lv_name_0_0= 'Play' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:700:3: lv_name_0_0= 'Play'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_rulePlay1655); 

                    newLeafNode(lv_name_0_0, grammarAccess.getPlayAccess().getNamePlayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Play");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:713:2: ( (lv_file_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:714:1: (lv_file_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:714:1: (lv_file_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:715:3: lv_file_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rulePlay1689);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePlay1701); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:743:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:744:2: (iv_ruleRecord= ruleRecord EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:745:2: iv_ruleRecord= ruleRecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord1737);
            iv_ruleRecord=ruleRecord();

            state._fsp--;

             current =iv_ruleRecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord1747); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:752:1: ruleRecord returns [EObject current=null] : ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_vari_6_0=null;
        Token otherlv_7=null;
        EObject lv_action_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:755:28: ( ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:2: ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:2: ( (lv_name_0_0= 'Record' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:757:1: (lv_name_0_0= 'Record' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:757:1: (lv_name_0_0= 'Record' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:758:3: lv_name_0_0= 'Record'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_31_in_ruleRecord1790); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRecordAccess().getNameRecordKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Record");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:771:2: ( (lv_time_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:772:1: (lv_time_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:772:1: (lv_time_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:773:3: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRecord1820); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleRecord1837); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordAccess().getSecondsKeyword_2());
                
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleRecord1849); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getInKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:797:1: ( (lv_action_4_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:798:1: (lv_action_4_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:798:1: (lv_action_4_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:799:3: lv_action_4_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleRecord1870);
            lv_action_4_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_4_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:815:2: (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:815:4: otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleRecord1883); 

                        	newLeafNode(otherlv_5, grammarAccess.getRecordAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:819:1: ( (lv_vari_6_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:820:1: (lv_vari_6_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:820:1: (lv_vari_6_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:821:3: lv_vari_6_0= RULE_ID
                    {
                    lv_vari_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecord1900); 

                    			newLeafNode(lv_vari_6_0, grammarAccess.getRecordAccess().getVariIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecordRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"vari",
                            		lv_vari_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleRecord1919); 

                	newLeafNode(otherlv_7, grammarAccess.getRecordAccess().getSemicolonKeyword_6());
                

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:849:1: entryRuleReject returns [EObject current=null] : iv_ruleReject= ruleReject EOF ;
    public final EObject entryRuleReject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReject = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:850:2: (iv_ruleReject= ruleReject EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:851:2: iv_ruleReject= ruleReject EOF
            {
             newCompositeNode(grammarAccess.getRejectRule()); 
            pushFollow(FOLLOW_ruleReject_in_entryRuleReject1955);
            iv_ruleReject=ruleReject();

            state._fsp--;

             current =iv_ruleReject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReject1965); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:858:1: ruleReject returns [EObject current=null] : ( (lv_name_0_0= 'Reject;' ) ) ;
    public final EObject ruleReject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:861:28: ( ( (lv_name_0_0= 'Reject;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:862:1: ( (lv_name_0_0= 'Reject;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:862:1: ( (lv_name_0_0= 'Reject;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:863:1: (lv_name_0_0= 'Reject;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:863:1: (lv_name_0_0= 'Reject;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:864:3: lv_name_0_0= 'Reject;'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleReject2007); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:885:1: entryRuleHangup returns [EObject current=null] : iv_ruleHangup= ruleHangup EOF ;
    public final EObject entryRuleHangup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHangup = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:886:2: (iv_ruleHangup= ruleHangup EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:887:2: iv_ruleHangup= ruleHangup EOF
            {
             newCompositeNode(grammarAccess.getHangupRule()); 
            pushFollow(FOLLOW_ruleHangup_in_entryRuleHangup2055);
            iv_ruleHangup=ruleHangup();

            state._fsp--;

             current =iv_ruleHangup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHangup2065); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:894:1: ruleHangup returns [EObject current=null] : ( (lv_name_0_0= 'HangUp;' ) ) ;
    public final EObject ruleHangup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:897:28: ( ( (lv_name_0_0= 'HangUp;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:898:1: ( (lv_name_0_0= 'HangUp;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:898:1: ( (lv_name_0_0= 'HangUp;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:899:1: (lv_name_0_0= 'HangUp;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:899:1: (lv_name_0_0= 'HangUp;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:900:3: lv_name_0_0= 'HangUp;'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_36_in_ruleHangup2107); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:921:1: entryRuleGetDigits returns [EObject current=null] : iv_ruleGetDigits= ruleGetDigits EOF ;
    public final EObject entryRuleGetDigits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDigits = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:922:2: (iv_ruleGetDigits= ruleGetDigits EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:923:2: iv_ruleGetDigits= ruleGetDigits EOF
            {
             newCompositeNode(grammarAccess.getGetDigitsRule()); 
            pushFollow(FOLLOW_ruleGetDigits_in_entryRuleGetDigits2155);
            iv_ruleGetDigits=ruleGetDigits();

            state._fsp--;

             current =iv_ruleGetDigits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDigits2165); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:930:1: ruleGetDigits returns [EObject current=null] : ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleGetDigits() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_numDigits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_vari_5_0=null;
        Token otherlv_6=null;
        EObject lv_question_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:933:28: ( ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:934:1: ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:934:1: ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:934:2: ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:934:2: ( (lv_name_0_0= 'Get' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:935:1: (lv_name_0_0= 'Get' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:935:1: (lv_name_0_0= 'Get' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:936:3: lv_name_0_0= 'Get'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_37_in_ruleGetDigits2208); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Get");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:949:2: ( (lv_numDigits_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:950:1: (lv_numDigits_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:950:1: (lv_numDigits_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:951:3: lv_numDigits_1_0= RULE_INT
            {
            lv_numDigits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGetDigits2238); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleGetDigits2255); 

                	newLeafNode(otherlv_2, grammarAccess.getGetDigitsAccess().getDigitsKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:971:1: ( (lv_question_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:972:1: (lv_question_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:972:1: (lv_question_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:973:3: lv_question_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleGetDigits2276);
            lv_question_3_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetDigitsRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_3_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleGetDigits2288); 

                	newLeafNode(otherlv_4, grammarAccess.getGetDigitsAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:993:1: ( (lv_vari_5_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:994:1: (lv_vari_5_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:994:1: (lv_vari_5_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:995:3: lv_vari_5_0= RULE_ID
            {
            lv_vari_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDigits2305); 

            			newLeafNode(lv_vari_5_0, grammarAccess.getGetDigitsAccess().getVariIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vari",
                    		lv_vari_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleGetDigits2322); 

                	newLeafNode(otherlv_6, grammarAccess.getGetDigitsAccess().getSemicolonKeyword_6());
                

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1023:1: entryRuleAsk returns [EObject current=null] : iv_ruleAsk= ruleAsk EOF ;
    public final EObject entryRuleAsk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsk = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1024:2: (iv_ruleAsk= ruleAsk EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1025:2: iv_ruleAsk= ruleAsk EOF
            {
             newCompositeNode(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_ruleAsk_in_entryRuleAsk2358);
            iv_ruleAsk=ruleAsk();

            state._fsp--;

             current =iv_ruleAsk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsk2368); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1032:1: ruleAsk returns [EObject current=null] : ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleAsk() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_vari_3_0=null;
        Token otherlv_4=null;
        EObject lv_question_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1035:28: ( ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1036:1: ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1036:1: ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1036:2: ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1036:2: ( (lv_name_0_0= 'Ask' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1037:1: (lv_name_0_0= 'Ask' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1037:1: (lv_name_0_0= 'Ask' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1038:3: lv_name_0_0= 'Ask'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_39_in_ruleAsk2411); 

                    newLeafNode(lv_name_0_0, grammarAccess.getAskAccess().getNameAskKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAskRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Ask");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1051:2: ( (lv_question_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1052:1: (lv_question_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1052:1: (lv_question_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1053:3: lv_question_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleAsk2445);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAsk2457); 

                	newLeafNode(otherlv_2, grammarAccess.getAskAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1073:1: ( (lv_vari_3_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1074:1: (lv_vari_3_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1074:1: (lv_vari_3_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1075:3: lv_vari_3_0= RULE_ID
            {
            lv_vari_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsk2474); 

            			newLeafNode(lv_vari_3_0, grammarAccess.getAskAccess().getVariIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vari",
                    		lv_vari_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAsk2491); 

                	newLeafNode(otherlv_4, grammarAccess.getAskAccess().getSemicolonKeyword_4());
                

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1103:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1104:2: (iv_ruleSend= ruleSend EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1105:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend2527);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend2537); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1112:1: ruleSend returns [EObject current=null] : ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_url_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1115:28: ( ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1116:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1116:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1116:2: ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1116:2: ( (lv_name_0_0= 'Send' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1117:1: (lv_name_0_0= 'Send' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1117:1: (lv_name_0_0= 'Send' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1118:3: lv_name_0_0= 'Send'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_40_in_ruleSend2580); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSendAccess().getNameSendKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSendRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Send");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1131:2: ( (lv_params_1_0= ruleSendBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1132:1: (lv_params_1_0= ruleSendBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1132:1: (lv_params_1_0= ruleSendBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1133:3: lv_params_1_0= ruleSendBlock
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSendBlock_in_ruleSend2614);
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSend2626); 

                	newLeafNode(otherlv_2, grammarAccess.getSendAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1153:1: ( (lv_url_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1154:1: (lv_url_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1154:1: (lv_url_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1155:3: lv_url_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSend2647);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSend2659); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1183:1: entryRuleSendBlock returns [EObject current=null] : iv_ruleSendBlock= ruleSendBlock EOF ;
    public final EObject entryRuleSendBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1184:2: (iv_ruleSendBlock= ruleSendBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1185:2: iv_ruleSendBlock= ruleSendBlock EOF
            {
             newCompositeNode(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock2695);
            iv_ruleSendBlock=ruleSendBlock();

            state._fsp--;

             current =iv_ruleSendBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock2705); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1192:1: ruleSendBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleSendBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        EObject lv_stms_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1195:28: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1196:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1196:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1196:2: () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1196:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1197:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendBlockAccess().getSendBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSendBlock2751); 

                	newLeafNode(otherlv_1, grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1206:1: ( (lv_value_2_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1207:1: (lv_value_2_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1207:1: (lv_value_2_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1208:3: lv_value_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleSendBlock2772);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1224:2: ( (lv_stms_3_0= ruleNotPrimaryParam ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1225:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1225:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1226:3: lv_stms_3_0= ruleNotPrimaryParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2793);
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSendBlock2806); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1254:1: entryRuleNotPrimaryParam returns [EObject current=null] : iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF ;
    public final EObject entryRuleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotPrimaryParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1255:2: (iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1256:2: iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF
            {
             newCompositeNode(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2842);
            iv_ruleNotPrimaryParam=ruleNotPrimaryParam();

            state._fsp--;

             current =iv_ruleNotPrimaryParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam2852); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1263:1: ruleNotPrimaryParam returns [EObject current=null] : (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) ;
    public final EObject ruleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1266:28: ( (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1267:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1267:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1267:3: otherlv_0= ',' ( (lv_value_1_0= ruleParam ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleNotPrimaryParam2889); 

                	newLeafNode(otherlv_0, grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1271:1: ( (lv_value_1_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1272:1: (lv_value_1_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1272:1: (lv_value_1_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1273:3: lv_value_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleNotPrimaryParam2910);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1297:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1298:2: (iv_ruleParam= ruleParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1299:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2946);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2956); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1306:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1309:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1310:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1310:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1310:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1310:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1311:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1311:1: (lv_name_0_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1312:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParam2998); 

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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleParam3015); 

                	newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1332:1: ( (lv_value_2_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1333:1: (lv_value_2_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1333:1: (lv_value_2_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1334:3: lv_value_2_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleParam3036);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1358:1: entryRuleSay returns [EObject current=null] : iv_ruleSay= ruleSay EOF ;
    public final EObject entryRuleSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1359:2: (iv_ruleSay= ruleSay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1360:2: iv_ruleSay= ruleSay EOF
            {
             newCompositeNode(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay3072);
            iv_ruleSay=ruleSay();

            state._fsp--;

             current =iv_ruleSay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay3082); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1367:1: ruleSay returns [EObject current=null] : ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_that_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1370:28: ( ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1371:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1371:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1371:2: ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1371:2: ( (lv_name_0_0= 'Say' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1372:1: (lv_name_0_0= 'Say' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1372:1: (lv_name_0_0= 'Say' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1373:3: lv_name_0_0= 'Say'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_44_in_ruleSay3125); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSayAccess().getNameSayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Say");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1386:2: ( (lv_that_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1387:1: (lv_that_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1387:1: (lv_that_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1388:3: lv_that_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSay3159);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSay3171); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1416:1: entryRuleSms returns [EObject current=null] : iv_ruleSms= ruleSms EOF ;
    public final EObject entryRuleSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSms = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1417:2: (iv_ruleSms= ruleSms EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1418:2: iv_ruleSms= ruleSms EOF
            {
             newCompositeNode(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_ruleSms_in_entryRuleSms3207);
            iv_ruleSms=ruleSms();

            state._fsp--;

             current =iv_ruleSms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSms3217); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1425:1: ruleSms returns [EObject current=null] : ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSms() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1428:28: ( ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1429:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1429:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1429:2: ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1429:2: ( (lv_name_0_0= 'Sms' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1430:1: (lv_name_0_0= 'Sms' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1430:1: (lv_name_0_0= 'Sms' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1431:3: lv_name_0_0= 'Sms'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_45_in_ruleSms3260); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSmsAccess().getNameSmsKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Sms");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1444:2: ( (lv_value_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1445:1: (lv_value_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1445:1: (lv_value_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1446:3: lv_value_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3294);
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSms3306); 

                	newLeafNode(otherlv_2, grammarAccess.getSmsAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1466:1: ( (lv_to_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1467:1: (lv_to_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1467:1: (lv_to_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1468:3: lv_to_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3327);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSms3339); 

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


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1500:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1501:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1502:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3379);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3389); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1509:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_event_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1512:28: ( ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1513:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1513:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1513:2: ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1513:2: ( (lv_name_0_0= 'GoTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1514:1: (lv_name_0_0= 'GoTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1514:1: (lv_name_0_0= 'GoTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1515:3: lv_name_0_0= 'GoTo'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_46_in_ruleTransition3432); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GoTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1528:2: ( (otherlv_1= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1529:1: (otherlv_1= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1529:1: (otherlv_1= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1530:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3465); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleTransition3477); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getWhenKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1545:1: ( (lv_event_3_0= ruleEVENT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1546:1: (lv_event_3_0= ruleEVENT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1546:1: (lv_event_3_0= ruleEVENT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1547:3: lv_event_3_0= ruleEVENT
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEVENT_in_ruleTransition3498);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTransition3510); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1575:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1576:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1577:2: iv_ruleIfExp= ruleIfExp EOF
            {
             newCompositeNode(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp3546);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;

             current =iv_ruleIfExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp3556); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1584:1: ruleIfExp returns [EObject current=null] : ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_block_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1587:28: ( ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1588:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1588:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1588:2: ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1588:2: ( (lv_block_0_0= ruleCondBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1589:1: (lv_block_0_0= ruleCondBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1589:1: (lv_block_0_0= ruleCondBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1590:3: lv_block_0_0= ruleCondBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3602);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1606:2: (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==48) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==49) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1606:4: otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleIfExp3615); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIfExpAccess().getElseKeyword_1_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1610:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1611:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1611:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1612:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3636);
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
            	    break loop12;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1628:4: (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1628:6: otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleIfExp3651); 

                        	newLeafNode(otherlv_3, grammarAccess.getIfExpAccess().getElseKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1632:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1633:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1633:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1634:3: lv_defaultBlock_4_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp3672);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1658:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1659:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1660:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
             newCompositeNode(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock3710);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;

             current =iv_ruleCondBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock3720); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1667:1: ruleCondBlock returns [EObject current=null] : ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1670:28: ( ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1671:1: ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1671:1: ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1671:2: ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1671:2: ( (lv_name_0_0= 'if' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1672:1: (lv_name_0_0= 'if' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1672:1: (lv_name_0_0= 'if' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1673:3: lv_name_0_0= 'if'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_49_in_ruleCondBlock3763); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCondBlockRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "if");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1686:2: ( (lv_cond_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1687:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1687:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1688:3: lv_cond_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3797);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1704:2: ( (lv_action_2_0= ruleBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1705:1: (lv_action_2_0= ruleBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1705:1: (lv_action_2_0= ruleBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1706:3: lv_action_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock3818);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1730:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1731:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1732:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock3854);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock3864); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1739:1: ruleBlock returns [EObject current=null] : ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_sta_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1742:28: ( ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1743:1: ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1743:1: ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1743:2: () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1743:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1744:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1749:2: ( (lv_name_1_0= '{' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1750:1: (lv_name_1_0= '{' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1750:1: (lv_name_1_0= '{' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1751:3: lv_name_1_0= '{'
            {
            lv_name_1_0=(Token)match(input,25,FOLLOW_25_in_ruleBlock3916); 

                    newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameLeftCurlyBracketKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "{");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1764:2: ( (lv_sta_2_0= ruleAbstractElement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ML_COMMENT||LA14_0==27||(LA14_0>=29 && LA14_0<=31)||(LA14_0>=35 && LA14_0<=37)||(LA14_0>=39 && LA14_0<=40)||(LA14_0>=44 && LA14_0<=46)||LA14_0==49||LA14_0==51||(LA14_0>=54 && LA14_0<=56)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1765:1: (lv_sta_2_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1765:1: (lv_sta_2_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1766:3: lv_sta_2_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleBlock3950);
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
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleBlock3963); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1794:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1795:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1796:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3999);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression4009); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1803:1: ruleBoolExpression returns [EObject current=null] : (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalBoolExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1806:28: ( (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1807:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1807:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1808:5: this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4056);
            this_TerminalBoolExpression_0=ruleTerminalBoolExpression();

            state._fsp--;

             
                    current = this_TerminalBoolExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1816:1: ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LOGIC_WORD) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1816:2: () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1816:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1817:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1822:2: ( (lv_op_2_0= RULE_LOGIC_WORD ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1823:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1823:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1824:3: lv_op_2_0= RULE_LOGIC_WORD
                    {
                    lv_op_2_0=(Token)match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4082); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1840:2: ( (lv_right_3_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1841:1: (lv_right_3_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1841:1: (lv_right_3_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1842:3: lv_right_3_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolExpression4108);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1866:1: entryRuleTerminalBoolExpression returns [EObject current=null] : iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF ;
    public final EObject entryRuleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1867:2: (iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1868:2: iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4146);
            iv_ruleTerminalBoolExpression=ruleTerminalBoolExpression();

            state._fsp--;

             current =iv_ruleTerminalBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression4156); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1875:1: ruleTerminalBoolExpression returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1878:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1879:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1879:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1880:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4203);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1890:5: this_CompareExpression_1= ruleCompareExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4230);
                    this_CompareExpression_1=ruleCompareExpression();

                    state._fsp--;

                     
                            current = this_CompareExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1900:5: this_NegExpression_2= ruleNegExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4257);
                    this_NegExpression_2=ruleNegExpression();

                    state._fsp--;

                     
                            current = this_NegExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1910:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4284);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1920:5: this_Brackets_4= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4311);
                    this_Brackets_4=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1930:5: this_CALLSTATUS_5= ruleCALLSTATUS
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4338);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1946:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1947:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1948:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets4373);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets4383); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1955:1: ruleBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1958:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1959:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1959:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1959:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1959:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1960:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1960:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1961:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleBrackets4425); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1977:2: ( (lv_obj_1_0= ruleBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1978:1: (lv_obj_1_0= ruleBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1978:1: (lv_obj_1_0= ruleBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1979:3: lv_obj_1_0= ruleBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolExpression_in_ruleBrackets4451);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1995:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1996:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1996:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1997:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleBrackets4468); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2021:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2022:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2023:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
             newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4509);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;

             current =iv_ruleCompareExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression4519); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2030:1: ruleCompareExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2033:28: ( ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2034:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2034:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2034:2: ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2034:2: ( (lv_left_0_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2035:1: (lv_left_0_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2035:1: (lv_left_0_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2036:3: lv_left_0_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4565);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2052:2: ( (lv_op_1_0= RULE_COMPARE ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2053:1: (lv_op_1_0= RULE_COMPARE )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2053:1: (lv_op_1_0= RULE_COMPARE )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2054:3: lv_op_1_0= RULE_COMPARE
            {
            lv_op_1_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareExpression4582); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2070:2: ( (lv_right_2_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2071:1: (lv_right_2_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2071:1: (lv_right_2_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2072:3: lv_right_2_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4608);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2096:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2097:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2098:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
             newCompositeNode(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4644);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;

             current =iv_ruleNegExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4654); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2105:1: ruleNegExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2108:28: ( ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2109:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2109:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2109:2: ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2109:2: ( (lv_op_0_0= RULE_NEGATION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2110:1: (lv_op_0_0= RULE_NEGATION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2110:1: (lv_op_0_0= RULE_NEGATION )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2111:3: lv_op_0_0= RULE_NEGATION
            {
            lv_op_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_ruleNegExpression4696); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2127:2: ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2128:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2128:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2129:3: lv_obj_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4722);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2153:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2154:2: (iv_ruleMathExpression= ruleMathExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2155:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression4758);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression4768); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2162:1: ruleMathExpression returns [EObject current=null] : (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MathTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2165:28: ( (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2166:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2166:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2167:5: this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMathTerminal_in_ruleMathExpression4815);
            this_MathTerminal_0=ruleMathTerminal();

            state._fsp--;

             
                    current = this_MathTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2175:1: ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_MATH) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2175:2: () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2175:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2176:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2181:2: ( (lv_op_2_0= RULE_MATH ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2182:1: (lv_op_2_0= RULE_MATH )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2182:1: (lv_op_2_0= RULE_MATH )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2183:3: lv_op_2_0= RULE_MATH
                    {
                    lv_op_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathExpression4841); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2199:2: ( (lv_right_3_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2200:1: (lv_right_3_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2200:1: (lv_right_3_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2201:3: lv_right_3_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleMathExpression4867);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2225:1: entryRuleMathTerminal returns [EObject current=null] : iv_ruleMathTerminal= ruleMathTerminal EOF ;
    public final EObject entryRuleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2226:2: (iv_ruleMathTerminal= ruleMathTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2227:2: iv_ruleMathTerminal= ruleMathTerminal EOF
            {
             newCompositeNode(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4905);
            iv_ruleMathTerminal=ruleMathTerminal();

            state._fsp--;

             current =iv_ruleMathTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal4915); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2234:1: ruleMathTerminal returns [EObject current=null] : (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject ruleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_MathBrackets_0 = null;

        EObject this_Literal_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2237:28: ( (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2238:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2238:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2239:5: this_MathBrackets_0= ruleMathBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMathBrackets_in_ruleMathTerminal4962);
                    this_MathBrackets_0=ruleMathBrackets();

                    state._fsp--;

                     
                            current = this_MathBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2249:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleMathTerminal4989);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2259:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_ruleMathTerminal5016);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2275:1: entryRuleMathBrackets returns [EObject current=null] : iv_ruleMathBrackets= ruleMathBrackets EOF ;
    public final EObject entryRuleMathBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2276:2: (iv_ruleMathBrackets= ruleMathBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2277:2: iv_ruleMathBrackets= ruleMathBrackets EOF
            {
             newCompositeNode(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5051);
            iv_ruleMathBrackets=ruleMathBrackets();

            state._fsp--;

             current =iv_ruleMathBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets5061); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2284:1: ruleMathBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleMathBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2287:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2288:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2288:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2288:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2288:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2289:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2289:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2290:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5103); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2306:2: ( (lv_obj_1_0= ruleMathExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2307:1: (lv_obj_1_0= ruleMathExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2307:1: (lv_obj_1_0= ruleMathExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2308:3: lv_obj_1_0= ruleMathExpression
            {
             
            	        newCompositeNode(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathExpression_in_ruleMathBrackets5129);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2324:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2325:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2325:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2326:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5146); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2350:1: entryRuleConcatenationExpression returns [EObject current=null] : iv_ruleConcatenationExpression= ruleConcatenationExpression EOF ;
    public final EObject entryRuleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2351:2: (iv_ruleConcatenationExpression= ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2352:2: iv_ruleConcatenationExpression= ruleConcatenationExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5187);
            iv_ruleConcatenationExpression=ruleConcatenationExpression();

            state._fsp--;

             current =iv_ruleConcatenationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression5197); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2359:1: ruleConcatenationExpression returns [EObject current=null] : (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) ;
    public final EObject ruleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ConcatenationTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2362:28: ( (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2363:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2363:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2364:5: this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5244);
            this_ConcatenationTerminal_0=ruleConcatenationTerminal();

            state._fsp--;

             
                    current = this_ConcatenationTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2372:1: ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==50) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2372:2: () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2372:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2373:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2378:2: ( (lv_op_2_0= '+' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2379:1: (lv_op_2_0= '+' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2379:1: (lv_op_2_0= '+' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2380:3: lv_op_2_0= '+'
                    {
                    lv_op_2_0=(Token)match(input,50,FOLLOW_50_in_ruleConcatenationExpression5271); 

                            newLeafNode(lv_op_2_0, grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConcatenationExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_2_0, "+");
                    	    

                    }


                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2393:2: ( (lv_right_3_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2394:1: (lv_right_3_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2394:1: (lv_right_3_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2395:3: lv_right_3_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5305);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2419:1: entryRuleConcatenationTerminal returns [EObject current=null] : iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF ;
    public final EObject entryRuleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2420:2: (iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2421:2: iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF
            {
             newCompositeNode(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5343);
            iv_ruleConcatenationTerminal=ruleConcatenationTerminal();

            state._fsp--;

             current =iv_ruleConcatenationTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal5353); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2428:1: ruleConcatenationTerminal returns [EObject current=null] : (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) ;
    public final EObject ruleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_ConcatenationBrackets_0 = null;

        EObject this_LiteralAbs_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2431:28: ( (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2432:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2432:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OBRACKET) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID||(LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||(LA20_0>=RULE_NULL && LA20_0<=RULE_DOUBLE)||(LA20_0>=62 && LA20_0<=65)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2433:5: this_ConcatenationBrackets_0= ruleConcatenationBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5400);
                    this_ConcatenationBrackets_0=ruleConcatenationBrackets();

                    state._fsp--;

                     
                            current = this_ConcatenationBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2443:5: this_LiteralAbs_1= ruleLiteralAbs
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5427);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2459:1: entryRuleConcatenationBrackets returns [EObject current=null] : iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF ;
    public final EObject entryRuleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2460:2: (iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2461:2: iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF
            {
             newCompositeNode(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5462);
            iv_ruleConcatenationBrackets=ruleConcatenationBrackets();

            state._fsp--;

             current =iv_ruleConcatenationBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets5472); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2468:1: ruleConcatenationBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2471:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2472:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2472:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2472:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2472:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2473:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2473:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2474:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5514); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2490:2: ( (lv_obj_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2491:1: (lv_obj_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2491:1: (lv_obj_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2492:3: lv_obj_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5540);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2508:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2509:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2509:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2510:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5557); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2534:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2535:2: (iv_ruleStringVariable= ruleStringVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2536:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable5598);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable5608); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2543:1: ruleStringVariable returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2546:28: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleStringVariable5645); 

                	newLeafNode(otherlv_0, grammarAccess.getStringVariableAccess().getStringKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2551:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2552:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2552:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2553:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariable5662); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2569:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=52 && LA22_0<=53)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2569:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2569:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==52) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==53) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2569:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleStringVariable5681); 

                                	newLeafNode(otherlv_2, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2574:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleStringVariable5699); 

                                	newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2578:2: ( (lv_value_4_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2579:1: (lv_value_4_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2579:1: (lv_value_4_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2580:3: lv_value_4_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5721);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleStringVariable5735); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2608:1: entryRuleNumVariable returns [EObject current=null] : iv_ruleNumVariable= ruleNumVariable EOF ;
    public final EObject entryRuleNumVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2609:2: (iv_ruleNumVariable= ruleNumVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2610:2: iv_ruleNumVariable= ruleNumVariable EOF
            {
             newCompositeNode(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable5771);
            iv_ruleNumVariable=ruleNumVariable();

            state._fsp--;

             current =iv_ruleNumVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable5781); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:1: ruleNumVariable returns [EObject current=null] : (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2620:28: ( (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2621:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2621:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2621:3: otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleNumVariable5818); 

                	newLeafNode(otherlv_0, grammarAccess.getNumVariableAccess().getNumKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2625:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2626:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2626:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2627:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumVariable5835); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2643:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=52 && LA24_0<=53)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2643:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2643:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==52) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==53) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2643:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleNumVariable5854); 

                                	newLeafNode(otherlv_2, grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2648:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleNumVariable5872); 

                                	newLeafNode(otherlv_3, grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2652:2: ( (lv_value_4_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2653:1: (lv_value_4_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2653:1: (lv_value_4_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2654:3: lv_value_4_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleNumVariable5894);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleNumVariable5908); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2682:1: entryRuleBoolVariable returns [EObject current=null] : iv_ruleBoolVariable= ruleBoolVariable EOF ;
    public final EObject entryRuleBoolVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2683:2: (iv_ruleBoolVariable= ruleBoolVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2684:2: iv_ruleBoolVariable= ruleBoolVariable EOF
            {
             newCompositeNode(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5944);
            iv_ruleBoolVariable=ruleBoolVariable();

            state._fsp--;

             current =iv_ruleBoolVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable5954); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2691:1: ruleBoolVariable returns [EObject current=null] : (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2694:28: ( (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2695:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2695:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2695:3: otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleBoolVariable5991); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolVariableAccess().getBoolKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2699:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2700:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2700:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2701:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolVariable6008); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2717:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=52 && LA26_0<=53)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2717:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2717:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==52) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==53) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2717:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBoolVariable6027); 

                                	newLeafNode(otherlv_2, grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2722:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleBoolVariable6045); 

                                	newLeafNode(otherlv_3, grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2726:2: ( (lv_value_4_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2727:1: (lv_value_4_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2727:1: (lv_value_4_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2728:3: lv_value_4_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolVariable6067);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleBoolVariable6081); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2756:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2757:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2758:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant6117);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant6127); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2765:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2768:28: ( (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:3: otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleConstant6164); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2773:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2774:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2774:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2775:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant6181); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2791:2: (otherlv_2= '=' | otherlv_3= ' = ' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==53) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2791:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleConstant6199); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2796:7: otherlv_3= ' = '
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleConstant6217); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2800:2: ( (lv_value_4_0= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2801:1: (lv_value_4_0= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2801:1: (lv_value_4_0= rulePrimitive )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2802:3: lv_value_4_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitive_in_ruleConstant6239);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleConstant6251); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2830:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2831:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2832:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive6287);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive6297); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2839:1: rulePrimitive returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2842:28: ( (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2843:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2843:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt28=1;
                }
                break;
            case RULE_BOOL:
                {
                alt28=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2844:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitive6344);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2854:5: this_BoolLiteral_1= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rulePrimitive6371);
                    this_BoolLiteral_1=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2864:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_rulePrimitive6398);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2882:1: entryRuleLiteralAbs returns [EObject current=null] : iv_ruleLiteralAbs= ruleLiteralAbs EOF ;
    public final EObject entryRuleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAbs = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2883:2: (iv_ruleLiteralAbs= ruleLiteralAbs EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2884:2: iv_ruleLiteralAbs= ruleLiteralAbs EOF
            {
             newCompositeNode(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6435);
            iv_ruleLiteralAbs=ruleLiteralAbs();

            state._fsp--;

             current =iv_ruleLiteralAbs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs6445); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:1: ruleLiteralAbs returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) ;
    public final EObject ruleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Primitive_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2894:28: ( (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2895:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==RULE_NULL||(LA29_0>=62 && LA29_0<=65)) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||(LA29_0>=RULE_BOOL && LA29_0<=RULE_DOUBLE)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2896:5: this_Literal_0= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleLiteralAbs6492);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2906:5: this_Primitive_1= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleLiteralAbs6519);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2922:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2923:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2924:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6554);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6564); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2931:1: ruleLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nul_1_0=null;
        EObject this_SESSION_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2934:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2935:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2935:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt30=1;
                }
                break;
            case RULE_NULL:
                {
                alt30=2;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2935:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2935:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2936:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2936:1: (otherlv_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2937:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral6609); 

                    		newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2949:6: ( (lv_nul_1_0= RULE_NULL ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2949:6: ( (lv_nul_1_0= RULE_NULL ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2950:1: (lv_nul_1_0= RULE_NULL )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2950:1: (lv_nul_1_0= RULE_NULL )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2951:3: lv_nul_1_0= RULE_NULL
                    {
                    lv_nul_1_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral6632); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2969:5: this_SESSION_2= ruleSESSION
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSESSION_in_ruleLiteral6665);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2985:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2986:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2987:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6700);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral6710); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2994:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2997:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2998:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2998:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2998:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2998:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2999:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3004:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3005:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3005:1: (lv_value_1_0= RULE_BOOL )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3006:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral6761); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3030:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3031:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3032:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6802);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;

             current =iv_ruleNumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral6812); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3039:1: ruleNumLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3042:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3043:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3043:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3043:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3043:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3044:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumLiteralAccess().getNumLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3049:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3050:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3050:1: (lv_value_1_0= ruleNumber )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3051:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumLiteral6867);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3075:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3076:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3077:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6903);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6913); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3084:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3087:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3088:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3088:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3088:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3088:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3089:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3094:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3095:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3095:1: (lv_value_1_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3096:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6964); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3120:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3121:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3122:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber7006);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber7017); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3129:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3132:28: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3133:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3133:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_DOUBLE) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_INT) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3133:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumber7057); 

                    		current.merge(this_DOUBLE_0);
                        
                     
                        newLeafNode(this_DOUBLE_0, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3141:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7083); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3156:1: entryRuleEVENT returns [EObject current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final EObject entryRuleEVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENT = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3157:2: (iv_ruleEVENT= ruleEVENT EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3158:2: iv_ruleEVENT= ruleEVENT EOF
            {
             newCompositeNode(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT7128);
            iv_ruleEVENT=ruleEVENT();

            state._fsp--;

             current =iv_ruleEVENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT7138); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3165:1: ruleEVENT returns [EObject current=null] : ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) ) ;
    public final EObject ruleEVENT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3168:28: ( ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3169:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3169:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt32=1;
                }
                break;
            case 58:
                {
                alt32=2;
                }
                break;
            case 59:
                {
                alt32=3;
                }
                break;
            case 60:
                {
                alt32=4;
                }
                break;
            case 61:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3169:2: ( (lv_name_0_0= 'HANGUP' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3169:2: ( (lv_name_0_0= 'HANGUP' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3170:1: (lv_name_0_0= 'HANGUP' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3170:1: (lv_name_0_0= 'HANGUP' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3171:3: lv_name_0_0= 'HANGUP'
                    {
                    lv_name_0_0=(Token)match(input,57,FOLLOW_57_in_ruleEVENT7181); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3185:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3185:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3186:1: (lv_name_1_0= 'COMPLETED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3186:1: (lv_name_1_0= 'COMPLETED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3187:3: lv_name_1_0= 'COMPLETED'
                    {
                    lv_name_1_0=(Token)match(input,58,FOLLOW_58_in_ruleEVENT7218); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3201:6: ( (lv_name_2_0= 'ERROR' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3201:6: ( (lv_name_2_0= 'ERROR' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3202:1: (lv_name_2_0= 'ERROR' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3202:1: (lv_name_2_0= 'ERROR' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3203:3: lv_name_2_0= 'ERROR'
                    {
                    lv_name_2_0=(Token)match(input,59,FOLLOW_59_in_ruleEVENT7255); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3217:6: ( (lv_name_3_0= 'TIMES' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3217:6: ( (lv_name_3_0= 'TIMES' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3218:1: (lv_name_3_0= 'TIMES' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3218:1: (lv_name_3_0= 'TIMES' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3219:3: lv_name_3_0= 'TIMES'
                    {
                    lv_name_3_0=(Token)match(input,60,FOLLOW_60_in_ruleEVENT7292); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3233:6: ( (lv_name_4_0= 'TIMEOUT' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3233:6: ( (lv_name_4_0= 'TIMEOUT' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3234:1: (lv_name_4_0= 'TIMEOUT' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3234:1: (lv_name_4_0= 'TIMEOUT' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3235:3: lv_name_4_0= 'TIMEOUT'
                    {
                    lv_name_4_0=(Token)match(input,61,FOLLOW_61_in_ruleEVENT7329); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3256:1: entryRuleSESSION returns [EObject current=null] : iv_ruleSESSION= ruleSESSION EOF ;
    public final EObject entryRuleSESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSESSION = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3257:2: (iv_ruleSESSION= ruleSESSION EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3258:2: iv_ruleSESSION= ruleSESSION EOF
            {
             newCompositeNode(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION7378);
            iv_ruleSESSION=ruleSESSION();

            state._fsp--;

             current =iv_ruleSESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION7388); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3265:1: ruleSESSION returns [EObject current=null] : ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) ) ;
    public final EObject ruleSESSION() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3268:28: ( ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3269:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3269:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt33=1;
                }
                break;
            case 63:
                {
                alt33=2;
                }
                break;
            case 64:
                {
                alt33=3;
                }
                break;
            case 65:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3269:2: ( (lv_name_0_0= 'CALLER' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3269:2: ( (lv_name_0_0= 'CALLER' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3270:1: (lv_name_0_0= 'CALLER' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3270:1: (lv_name_0_0= 'CALLER' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3271:3: lv_name_0_0= 'CALLER'
                    {
                    lv_name_0_0=(Token)match(input,62,FOLLOW_62_in_ruleSESSION7431); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3285:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3285:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3286:1: (lv_name_1_0= 'LASTSTATE' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3286:1: (lv_name_1_0= 'LASTSTATE' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3287:3: lv_name_1_0= 'LASTSTATE'
                    {
                    lv_name_1_0=(Token)match(input,63,FOLLOW_63_in_ruleSESSION7468); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3301:6: ( (lv_name_2_0= 'TIME' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3301:6: ( (lv_name_2_0= 'TIME' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3302:1: (lv_name_2_0= 'TIME' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3302:1: (lv_name_2_0= 'TIME' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3303:3: lv_name_2_0= 'TIME'
                    {
                    lv_name_2_0=(Token)match(input,64,FOLLOW_64_in_ruleSESSION7505); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3317:6: ( (lv_name_3_0= 'CALLED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3317:6: ( (lv_name_3_0= 'CALLED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3318:1: (lv_name_3_0= 'CALLED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3318:1: (lv_name_3_0= 'CALLED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3319:3: lv_name_3_0= 'CALLED'
                    {
                    lv_name_3_0=(Token)match(input,65,FOLLOW_65_in_ruleSESSION7542); 

                            newLeafNode(lv_name_3_0, grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "CALLED");
                    	    

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3340:1: entryRuleCALLSTATUS returns [EObject current=null] : iv_ruleCALLSTATUS= ruleCALLSTATUS EOF ;
    public final EObject entryRuleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCALLSTATUS = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3341:2: (iv_ruleCALLSTATUS= ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3342:2: iv_ruleCALLSTATUS= ruleCALLSTATUS EOF
            {
             newCompositeNode(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS7591);
            iv_ruleCALLSTATUS=ruleCALLSTATUS();

            state._fsp--;

             current =iv_ruleCALLSTATUS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS7601); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3349:1: ruleCALLSTATUS returns [EObject current=null] : ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) ;
    public final EObject ruleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3352:28: ( ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3353:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3353:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt34=1;
                }
                break;
            case 67:
                {
                alt34=2;
                }
                break;
            case 68:
                {
                alt34=3;
                }
                break;
            case 69:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3353:2: ( (lv_name_0_0= 'RINGING' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3353:2: ( (lv_name_0_0= 'RINGING' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3354:1: (lv_name_0_0= 'RINGING' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3354:1: (lv_name_0_0= 'RINGING' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:3: lv_name_0_0= 'RINGING'
                    {
                    lv_name_0_0=(Token)match(input,66,FOLLOW_66_in_ruleCALLSTATUS7644); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3369:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3369:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3370:1: (lv_name_1_0= 'IN-PROGRESS' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3370:1: (lv_name_1_0= 'IN-PROGRESS' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3371:3: lv_name_1_0= 'IN-PROGRESS'
                    {
                    lv_name_1_0=(Token)match(input,67,FOLLOW_67_in_ruleCALLSTATUS7681); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3385:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3385:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3386:1: (lv_name_2_0= 'DISCONNECTED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3386:1: (lv_name_2_0= 'DISCONNECTED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3387:3: lv_name_2_0= 'DISCONNECTED'
                    {
                    lv_name_2_0=(Token)match(input,68,FOLLOW_68_in_ruleCALLSTATUS7718); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3401:6: ( (lv_name_3_0= 'FAILED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3401:6: ( (lv_name_3_0= 'FAILED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3402:1: (lv_name_3_0= 'FAILED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3402:1: (lv_name_3_0= 'FAILED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3403:3: lv_name_3_0= 'FAILED'
                    {
                    lv_name_3_0=(Token)match(input,69,FOLLOW_69_in_ruleCALLSTATUS7755); 

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\16\uffff";
    static final String DFA16_eofS =
        "\1\uffff\1\14\6\15\6\uffff";
    static final String DFA16_minS =
        "\1\4\7\10\6\uffff";
    static final String DFA16_maxS =
        "\1\105\7\34\6\uffff";
    static final String DFA16_acceptS =
        "\10\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA16_specialS =
        "\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\2\10\1\uffff\1\12\2\uffff\1\11\1\uffff\1\3\1\1"+
            "\1\10\55\uffff\1\4\1\5\1\6\1\7\4\13",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1879:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDocument122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDocument139 = new BitSet(new long[]{0x01C8000003400022L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDocument165 = new BitSet(new long[]{0x01C8000003400022L});
    public static final BitSet FOLLOW_ruleState_in_ruleDocument187 = new BitSet(new long[]{0x0000000003400002L});
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
    public static final BitSet FOLLOW_22_in_ruleState690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState707 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_23_in_ruleState725 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleState742 = new BitSet(new long[]{0x0000000003400002L});
    public static final BitSet FOLLOW_24_in_ruleState818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleState835 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleState854 = new BitSet(new long[]{0x01CA71B8EC000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleState875 = new BitSet(new long[]{0x01CA71B8EC000020L});
    public static final BitSet FOLLOW_26_in_ruleState888 = new BitSet(new long[]{0x0000000003400002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoiceTag980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_ruleVoiceTag1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_ruleVoiceTag1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_ruleVoiceTag1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_ruleVoiceTag1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_ruleVoiceTag1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_ruleVoiceTag1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_ruleVoiceTag1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_ruleVoiceTag1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_ruleVoiceTag1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleVoiceTag1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_ruleVoiceTag1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCall1385 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleCall1419 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCall1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_entryRuleDial1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDial1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDial1520 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleDial1554 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDial1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_entryRulePlay1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlay1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePlay1655 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rulePlay1689 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePlay1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRecord1790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRecord1820 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRecord1837 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRecord1849 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleRecord1870 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_34_in_ruleRecord1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecord1900 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRecord1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_entryRuleReject1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReject1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleReject2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_entryRuleHangup2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHangup2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleHangup2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_entryRuleGetDigits2155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDigits2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGetDigits2208 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGetDigits2238 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGetDigits2255 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleGetDigits2276 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleGetDigits2288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDigits2305 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGetDigits2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_entryRuleAsk2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsk2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAsk2411 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleAsk2445 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAsk2457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsk2474 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAsk2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSend2580 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleSendBlock_in_ruleSend2614 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSend2626 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSend2647 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSend2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock2695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSendBlock2751 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSendBlock2772 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2793 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_26_in_ruleSendBlock2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNotPrimaryParam2889 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleNotPrimaryParam2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParam2998 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleParam3015 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleParam3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay3072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSay3125 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSay3159 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSay3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_entryRuleSms3207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSms3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSms3260 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3294 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSms3306 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3327 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSms3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTransition3432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3465 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTransition3477 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_ruleEVENT_in_ruleTransition3498 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp3546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3602 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleIfExp3615 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3636 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleIfExp3651 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock3710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCondBlock3763 = new BitSet(new long[]{0xC00000000001D2D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock3854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBlock3916 = new BitSet(new long[]{0x01CA71B8EC000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleBlock3950 = new BitSet(new long[]{0x01CA71B8EC000020L});
    public static final BitSet FOLLOW_26_in_ruleBlock3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4056 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4082 = new BitSet(new long[]{0xC00000000001D2D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolExpression4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets4373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleBrackets4425 = new BitSet(new long[]{0xC00000000001D2D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBrackets4451 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleBrackets4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4565 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareExpression4582 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_ruleNegExpression4696 = new BitSet(new long[]{0xC00000000001D2D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression4758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_ruleMathExpression4815 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathExpression4841 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathExpression4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_ruleMathTerminal4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMathTerminal4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_ruleMathTerminal5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5103 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathBrackets5129 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5244 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConcatenationExpression5271 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5514 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5540 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable5598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStringVariable5645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariable5662 = new BitSet(new long[]{0x0030000010000000L});
    public static final BitSet FOLLOW_52_in_ruleStringVariable5681 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_53_in_ruleStringVariable5699 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5721 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStringVariable5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable5771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumVariable5818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumVariable5835 = new BitSet(new long[]{0x0030000010000000L});
    public static final BitSet FOLLOW_52_in_ruleNumVariable5854 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_53_in_ruleNumVariable5872 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleNumVariable5894 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNumVariable5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBoolVariable5991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolVariable6008 = new BitSet(new long[]{0x0030000010000000L});
    public static final BitSet FOLLOW_52_in_ruleBoolVariable6027 = new BitSet(new long[]{0xC00000000001D2D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_53_in_ruleBoolVariable6045 = new BitSet(new long[]{0xC00000000001D2D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolVariable6067 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBoolVariable6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleConstant6164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant6181 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleConstant6199 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_53_in_ruleConstant6217 = new BitSet(new long[]{0xC00000000001C2D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleConstant6239 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConstant6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive6287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitive6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rulePrimitive6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rulePrimitive6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAbs6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleLiteralAbs6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_ruleLiteral6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumLiteral6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber7006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumber7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT7128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEVENT7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEVENT7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEVENT7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEVENT7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEVENT7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION7378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSESSION7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSESSION7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSESSION7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSESSION7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS7591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCALLSTATUS7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCALLSTATUS7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCALLSTATUS7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCALLSTATUS7755 = new BitSet(new long[]{0x0000000000000002L});

}
