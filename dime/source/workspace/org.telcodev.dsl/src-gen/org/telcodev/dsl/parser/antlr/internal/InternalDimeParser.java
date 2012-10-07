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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_BOOL", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'State'", "'times'", "'timeout'", "'{'", "'}'", "'Call'", "';'", "'DialTo'", "'Play'", "'Record'", "'seconds'", "'Reject;'", "'HangUp;'", "'Gather'", "'digits'", "'Send'", "'to'", "','", "':'", "'Say'", "'Sms'", "'Email'", "'subject'", "'from'", "'message'", "'GoTo'", "'when'", "'else'", "'if'", "'String'", "'='", "' = '", "'Num'", "'Bool'", "'Const'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'CALLER'", "'LASTSTATE'", "'CALLED'", "'DIGITS'", "'RECORD'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
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
            case 27:
            case 29:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
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

            	        if ( (LA7_0==RULE_ML_COMMENT||LA7_0==27||(LA7_0>=29 && LA7_0<=31)||(LA7_0>=33 && LA7_0<=35)||LA7_0==37||(LA7_0>=41 && LA7_0<=43)||LA7_0==47||(LA7_0>=50 && LA7_0<=51)||(LA7_0>=54 && LA7_0<=56)) ) {
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:448:1: ruleVoiceTag returns [EObject current=null] : (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Send_5= ruleSend | this_Reject_6= ruleReject | this_Hangup_7= ruleHangup | this_Call_8= ruleCall | this_Sms_9= ruleSms | this_Email_10= ruleEmail ) ;
    public final EObject ruleVoiceTag() throws RecognitionException {
        EObject current = null;

        EObject this_Say_0 = null;

        EObject this_Dial_1 = null;

        EObject this_Play_2 = null;

        EObject this_Record_3 = null;

        EObject this_GetDigits_4 = null;

        EObject this_Send_5 = null;

        EObject this_Reject_6 = null;

        EObject this_Hangup_7 = null;

        EObject this_Call_8 = null;

        EObject this_Sms_9 = null;

        EObject this_Email_10 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:451:28: ( (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Send_5= ruleSend | this_Reject_6= ruleReject | this_Hangup_7= ruleHangup | this_Call_8= ruleCall | this_Sms_9= ruleSms | this_Email_10= ruleEmail ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:452:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Send_5= ruleSend | this_Reject_6= ruleReject | this_Hangup_7= ruleHangup | this_Call_8= ruleCall | this_Sms_9= ruleSms | this_Email_10= ruleEmail )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:452:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Send_5= ruleSend | this_Reject_6= ruleReject | this_Hangup_7= ruleHangup | this_Call_8= ruleCall | this_Sms_9= ruleSms | this_Email_10= ruleEmail )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 41:
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
            case 35:
                {
                alt9=5;
                }
                break;
            case 37:
                {
                alt9=6;
                }
                break;
            case 33:
                {
                alt9=7;
                }
                break;
            case 34:
                {
                alt9=8;
                }
                break;
            case 27:
                {
                alt9=9;
                }
                break;
            case 42:
                {
                alt9=10;
                }
                break;
            case 43:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:503:5: this_Send_5= ruleSend
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSend_in_ruleVoiceTag1162);
                    this_Send_5=ruleSend();

                    state._fsp--;

                     
                            current = this_Send_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:513:5: this_Reject_6= ruleReject
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleReject_in_ruleVoiceTag1189);
                    this_Reject_6=ruleReject();

                    state._fsp--;

                     
                            current = this_Reject_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:523:5: this_Hangup_7= ruleHangup
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleHangup_in_ruleVoiceTag1216);
                    this_Hangup_7=ruleHangup();

                    state._fsp--;

                     
                            current = this_Hangup_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:533:5: this_Call_8= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getCallParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleVoiceTag1243);
                    this_Call_8=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:543:5: this_Sms_9= ruleSms
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSmsParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleSms_in_ruleVoiceTag1270);
                    this_Sms_9=ruleSms();

                    state._fsp--;

                     
                            current = this_Sms_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:553:5: this_Email_10= ruleEmail
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleEmail_in_ruleVoiceTag1297);
                    this_Email_10=ruleEmail();

                    state._fsp--;

                     
                            current = this_Email_10; 
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:752:1: ruleRecord returns [EObject current=null] : ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:755:28: ( ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:756:2: ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= ';'
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
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRecord1849); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:805:1: entryRuleReject returns [EObject current=null] : iv_ruleReject= ruleReject EOF ;
    public final EObject entryRuleReject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReject = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:806:2: (iv_ruleReject= ruleReject EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:807:2: iv_ruleReject= ruleReject EOF
            {
             newCompositeNode(grammarAccess.getRejectRule()); 
            pushFollow(FOLLOW_ruleReject_in_entryRuleReject1885);
            iv_ruleReject=ruleReject();

            state._fsp--;

             current =iv_ruleReject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReject1895); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:814:1: ruleReject returns [EObject current=null] : ( (lv_name_0_0= 'Reject;' ) ) ;
    public final EObject ruleReject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:817:28: ( ( (lv_name_0_0= 'Reject;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:818:1: ( (lv_name_0_0= 'Reject;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:818:1: ( (lv_name_0_0= 'Reject;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:819:1: (lv_name_0_0= 'Reject;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:819:1: (lv_name_0_0= 'Reject;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:820:3: lv_name_0_0= 'Reject;'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_33_in_ruleReject1937); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:841:1: entryRuleHangup returns [EObject current=null] : iv_ruleHangup= ruleHangup EOF ;
    public final EObject entryRuleHangup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHangup = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:842:2: (iv_ruleHangup= ruleHangup EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:843:2: iv_ruleHangup= ruleHangup EOF
            {
             newCompositeNode(grammarAccess.getHangupRule()); 
            pushFollow(FOLLOW_ruleHangup_in_entryRuleHangup1985);
            iv_ruleHangup=ruleHangup();

            state._fsp--;

             current =iv_ruleHangup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHangup1995); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:850:1: ruleHangup returns [EObject current=null] : ( (lv_name_0_0= 'HangUp;' ) ) ;
    public final EObject ruleHangup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:853:28: ( ( (lv_name_0_0= 'HangUp;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:854:1: ( (lv_name_0_0= 'HangUp;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:854:1: ( (lv_name_0_0= 'HangUp;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:855:1: (lv_name_0_0= 'HangUp;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:855:1: (lv_name_0_0= 'HangUp;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:856:3: lv_name_0_0= 'HangUp;'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_ruleHangup2037); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:877:1: entryRuleGetDigits returns [EObject current=null] : iv_ruleGetDigits= ruleGetDigits EOF ;
    public final EObject entryRuleGetDigits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDigits = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:878:2: (iv_ruleGetDigits= ruleGetDigits EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:879:2: iv_ruleGetDigits= ruleGetDigits EOF
            {
             newCompositeNode(grammarAccess.getGetDigitsRule()); 
            pushFollow(FOLLOW_ruleGetDigits_in_entryRuleGetDigits2085);
            iv_ruleGetDigits=ruleGetDigits();

            state._fsp--;

             current =iv_ruleGetDigits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDigits2095); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:886:1: ruleGetDigits returns [EObject current=null] : ( ( (lv_name_0_0= 'Gather' ) ) ( (lv_numDigits_1_0= RULE_INT ) )? otherlv_2= 'digits' otherlv_3= ';' ) ;
    public final EObject ruleGetDigits() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_numDigits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:889:28: ( ( ( (lv_name_0_0= 'Gather' ) ) ( (lv_numDigits_1_0= RULE_INT ) )? otherlv_2= 'digits' otherlv_3= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:890:1: ( ( (lv_name_0_0= 'Gather' ) ) ( (lv_numDigits_1_0= RULE_INT ) )? otherlv_2= 'digits' otherlv_3= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:890:1: ( ( (lv_name_0_0= 'Gather' ) ) ( (lv_numDigits_1_0= RULE_INT ) )? otherlv_2= 'digits' otherlv_3= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:890:2: ( (lv_name_0_0= 'Gather' ) ) ( (lv_numDigits_1_0= RULE_INT ) )? otherlv_2= 'digits' otherlv_3= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:890:2: ( (lv_name_0_0= 'Gather' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:891:1: (lv_name_0_0= 'Gather' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:891:1: (lv_name_0_0= 'Gather' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:892:3: lv_name_0_0= 'Gather'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleGetDigits2138); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGetDigitsAccess().getNameGatherKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Gather");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:905:2: ( (lv_numDigits_1_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:906:1: (lv_numDigits_1_0= RULE_INT )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:906:1: (lv_numDigits_1_0= RULE_INT )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:907:3: lv_numDigits_1_0= RULE_INT
                    {
                    lv_numDigits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGetDigits2168); 

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
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleGetDigits2186); 

                	newLeafNode(otherlv_2, grammarAccess.getGetDigitsAccess().getDigitsKeyword_2());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleGetDigits2198); 

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


    // $ANTLR start "entryRuleSend"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:939:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:940:2: (iv_ruleSend= ruleSend EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:941:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend2234);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend2244); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:948:1: ruleSend returns [EObject current=null] : ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_url_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:951:28: ( ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:952:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:952:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:952:2: ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:952:2: ( (lv_name_0_0= 'Send' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:953:1: (lv_name_0_0= 'Send' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:953:1: (lv_name_0_0= 'Send' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:954:3: lv_name_0_0= 'Send'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_37_in_ruleSend2287); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSendAccess().getNameSendKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSendRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Send");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:967:2: ( (lv_params_1_0= ruleSendBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:968:1: (lv_params_1_0= ruleSendBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:968:1: (lv_params_1_0= ruleSendBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:969:3: lv_params_1_0= ruleSendBlock
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSendBlock_in_ruleSend2321);
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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSend2333); 

                	newLeafNode(otherlv_2, grammarAccess.getSendAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:989:1: ( (lv_url_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:990:1: (lv_url_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:990:1: (lv_url_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:991:3: lv_url_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSend2354);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSend2366); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1019:1: entryRuleSendBlock returns [EObject current=null] : iv_ruleSendBlock= ruleSendBlock EOF ;
    public final EObject entryRuleSendBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1020:2: (iv_ruleSendBlock= ruleSendBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1021:2: iv_ruleSendBlock= ruleSendBlock EOF
            {
             newCompositeNode(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock2402);
            iv_ruleSendBlock=ruleSendBlock();

            state._fsp--;

             current =iv_ruleSendBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock2412); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1028:1: ruleSendBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleSendBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        EObject lv_stms_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1031:28: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1032:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1032:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1032:2: () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1032:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1033:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendBlockAccess().getSendBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSendBlock2458); 

                	newLeafNode(otherlv_1, grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1042:1: ( (lv_value_2_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1043:1: (lv_value_2_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1043:1: (lv_value_2_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1044:3: lv_value_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleSendBlock2479);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1060:2: ( (lv_stms_3_0= ruleNotPrimaryParam ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1061:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1061:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1062:3: lv_stms_3_0= ruleNotPrimaryParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2500);
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSendBlock2513); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1090:1: entryRuleNotPrimaryParam returns [EObject current=null] : iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF ;
    public final EObject entryRuleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotPrimaryParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1091:2: (iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1092:2: iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF
            {
             newCompositeNode(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2549);
            iv_ruleNotPrimaryParam=ruleNotPrimaryParam();

            state._fsp--;

             current =iv_ruleNotPrimaryParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam2559); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1099:1: ruleNotPrimaryParam returns [EObject current=null] : (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) ;
    public final EObject ruleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1102:28: ( (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1103:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1103:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1103:3: otherlv_0= ',' ( (lv_value_1_0= ruleParam ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleNotPrimaryParam2596); 

                	newLeafNode(otherlv_0, grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1107:1: ( (lv_value_1_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1108:1: (lv_value_1_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1108:1: (lv_value_1_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1109:3: lv_value_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleNotPrimaryParam2617);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1133:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1134:2: (iv_ruleParam= ruleParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1135:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2653);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2663); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1142:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1145:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1146:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1146:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1146:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1146:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1147:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1147:1: (lv_name_0_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1148:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParam2705); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleParam2722); 

                	newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1168:1: ( (lv_value_2_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1169:1: (lv_value_2_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1169:1: (lv_value_2_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1170:3: lv_value_2_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleParam2743);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1194:1: entryRuleSay returns [EObject current=null] : iv_ruleSay= ruleSay EOF ;
    public final EObject entryRuleSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1195:2: (iv_ruleSay= ruleSay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1196:2: iv_ruleSay= ruleSay EOF
            {
             newCompositeNode(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay2779);
            iv_ruleSay=ruleSay();

            state._fsp--;

             current =iv_ruleSay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay2789); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1203:1: ruleSay returns [EObject current=null] : ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_that_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1206:28: ( ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1207:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1207:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1207:2: ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1207:2: ( (lv_name_0_0= 'Say' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1208:1: (lv_name_0_0= 'Say' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1208:1: (lv_name_0_0= 'Say' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1209:3: lv_name_0_0= 'Say'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_41_in_ruleSay2832); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSayAccess().getNameSayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Say");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1222:2: ( (lv_that_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1223:1: (lv_that_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1223:1: (lv_that_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1224:3: lv_that_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSay2866);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSay2878); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1252:1: entryRuleSms returns [EObject current=null] : iv_ruleSms= ruleSms EOF ;
    public final EObject entryRuleSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSms = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1253:2: (iv_ruleSms= ruleSms EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1254:2: iv_ruleSms= ruleSms EOF
            {
             newCompositeNode(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_ruleSms_in_entryRuleSms2914);
            iv_ruleSms=ruleSms();

            state._fsp--;

             current =iv_ruleSms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSms2924); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1261:1: ruleSms returns [EObject current=null] : ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSms() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1264:28: ( ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1265:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1265:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1265:2: ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1265:2: ( (lv_name_0_0= 'Sms' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1266:1: (lv_name_0_0= 'Sms' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1266:1: (lv_name_0_0= 'Sms' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1267:3: lv_name_0_0= 'Sms'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_42_in_ruleSms2967); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSmsAccess().getNameSmsKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Sms");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1280:2: ( (lv_value_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1281:1: (lv_value_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1281:1: (lv_value_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1282:3: lv_value_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3001);
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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleSms3013); 

                	newLeafNode(otherlv_2, grammarAccess.getSmsAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1302:1: ( (lv_to_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1303:1: (lv_to_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1303:1: (lv_to_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1304:3: lv_to_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3034);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSms3046); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1332:1: entryRuleEmail returns [EObject current=null] : iv_ruleEmail= ruleEmail EOF ;
    public final EObject entryRuleEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmail = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1333:2: (iv_ruleEmail= ruleEmail EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1334:2: iv_ruleEmail= ruleEmail EOF
            {
             newCompositeNode(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_ruleEmail_in_entryRuleEmail3082);
            iv_ruleEmail=ruleEmail();

            state._fsp--;

             current =iv_ruleEmail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmail3092); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1341:1: ruleEmail returns [EObject current=null] : ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1344:28: ( ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1345:1: ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1345:1: ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1345:2: ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' otherlv_10= 'message' otherlv_11= ':' ( (lv_value_12_0= ruleConcatenationExpression ) ) otherlv_13= '}' otherlv_14= 'to' ( (lv_to_15_0= ruleConcatenationExpression ) ) otherlv_16= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1345:2: ( (lv_name_0_0= 'Email' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1346:1: (lv_name_0_0= 'Email' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1346:1: (lv_name_0_0= 'Email' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1347:3: lv_name_0_0= 'Email'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_43_in_ruleEmail3135); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEmailAccess().getNameEmailKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmailRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Email");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEmail3160); 

                	newLeafNode(otherlv_1, grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleEmail3172); 

                	newLeafNode(otherlv_2, grammarAccess.getEmailAccess().getSubjectKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleEmail3184); 

                	newLeafNode(otherlv_3, grammarAccess.getEmailAccess().getColonKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1372:1: ( (lv_title_4_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1373:1: (lv_title_4_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1373:1: (lv_title_4_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1374:3: lv_title_4_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3205);
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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleEmail3217); 

                	newLeafNode(otherlv_5, grammarAccess.getEmailAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleEmail3229); 

                	newLeafNode(otherlv_6, grammarAccess.getEmailAccess().getFromKeyword_6());
                
            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleEmail3241); 

                	newLeafNode(otherlv_7, grammarAccess.getEmailAccess().getColonKeyword_7());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1402:1: ( (lv_from_8_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1403:1: (lv_from_8_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1403:1: (lv_from_8_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1404:3: lv_from_8_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3262);
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

            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleEmail3274); 

                	newLeafNode(otherlv_9, grammarAccess.getEmailAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleEmail3286); 

                	newLeafNode(otherlv_10, grammarAccess.getEmailAccess().getMessageKeyword_10());
                
            otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleEmail3298); 

                	newLeafNode(otherlv_11, grammarAccess.getEmailAccess().getColonKeyword_11());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1432:1: ( (lv_value_12_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1433:1: (lv_value_12_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1433:1: (lv_value_12_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1434:3: lv_value_12_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3319);
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

            otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleEmail3331); 

                	newLeafNode(otherlv_13, grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_13());
                
            otherlv_14=(Token)match(input,38,FOLLOW_38_in_ruleEmail3343); 

                	newLeafNode(otherlv_14, grammarAccess.getEmailAccess().getToKeyword_14());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1458:1: ( (lv_to_15_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1459:1: (lv_to_15_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1459:1: (lv_to_15_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1460:3: lv_to_15_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3364);
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

            otherlv_16=(Token)match(input,28,FOLLOW_28_in_ruleEmail3376); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1488:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1489:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1490:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3412);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3422); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1497:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_event_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1500:28: ( ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1501:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1501:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1501:2: ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1501:2: ( (lv_name_0_0= 'GoTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1502:1: (lv_name_0_0= 'GoTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1502:1: (lv_name_0_0= 'GoTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1503:3: lv_name_0_0= 'GoTo'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_47_in_ruleTransition3465); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GoTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1516:2: ( (otherlv_1= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1517:1: (otherlv_1= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1517:1: (otherlv_1= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1518:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3498); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleTransition3510); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getWhenKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1533:1: ( (lv_event_3_0= ruleEVENT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1534:1: (lv_event_3_0= ruleEVENT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1534:1: (lv_event_3_0= ruleEVENT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1535:3: lv_event_3_0= ruleEVENT
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEVENT_in_ruleTransition3531);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTransition3543); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1563:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1564:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1565:2: iv_ruleIfExp= ruleIfExp EOF
            {
             newCompositeNode(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp3579);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;

             current =iv_ruleIfExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp3589); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1572:1: ruleIfExp returns [EObject current=null] : ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_block_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1575:28: ( ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1576:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1576:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1576:2: ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1576:2: ( (lv_block_0_0= ruleCondBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1577:1: (lv_block_0_0= ruleCondBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1577:1: (lv_block_0_0= ruleCondBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1578:3: lv_block_0_0= ruleCondBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3635);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1594:2: (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==49) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==50) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1594:4: otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleIfExp3648); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIfExpAccess().getElseKeyword_1_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1598:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1599:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1599:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1600:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3669);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1616:4: (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1616:6: otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleIfExp3684); 

                        	newLeafNode(otherlv_3, grammarAccess.getIfExpAccess().getElseKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1620:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1621:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1621:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1622:3: lv_defaultBlock_4_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp3705);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1646:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1647:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1648:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
             newCompositeNode(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock3743);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;

             current =iv_ruleCondBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock3753); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1655:1: ruleCondBlock returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1658:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1659:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1659:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1659:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleCondBlock3790); 

                	newLeafNode(otherlv_0, grammarAccess.getCondBlockAccess().getIfKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1663:1: ( (lv_cond_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1664:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1664:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1665:3: lv_cond_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3811);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1681:2: ( (lv_action_2_0= ruleBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1682:1: (lv_action_2_0= ruleBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1682:1: (lv_action_2_0= ruleBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1683:3: lv_action_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock3832);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1707:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1708:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1709:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock3868);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock3878); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1716:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sta_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1719:28: ( ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1720:1: ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1720:1: ( () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1720:2: () otherlv_1= '{' ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1720:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1721:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleBlock3924); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1730:1: ( (lv_sta_2_0= ruleAbstractElement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ML_COMMENT||LA14_0==27||(LA14_0>=29 && LA14_0<=31)||(LA14_0>=33 && LA14_0<=35)||LA14_0==37||(LA14_0>=41 && LA14_0<=43)||LA14_0==47||(LA14_0>=50 && LA14_0<=51)||(LA14_0>=54 && LA14_0<=56)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1731:1: (lv_sta_2_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1731:1: (lv_sta_2_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1732:3: lv_sta_2_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleBlock3945);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleBlock3958); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1760:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1761:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1762:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3994);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression4004); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1769:1: ruleBoolExpression returns [EObject current=null] : (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalBoolExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1772:28: ( (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1773:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1773:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1774:5: this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4051);
            this_TerminalBoolExpression_0=ruleTerminalBoolExpression();

            state._fsp--;

             
                    current = this_TerminalBoolExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1782:1: ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LOGIC_WORD) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1782:2: () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1782:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1783:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1788:2: ( (lv_op_2_0= RULE_LOGIC_WORD ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1789:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1789:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1790:3: lv_op_2_0= RULE_LOGIC_WORD
                    {
                    lv_op_2_0=(Token)match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4077); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1806:2: ( (lv_right_3_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1807:1: (lv_right_3_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1807:1: (lv_right_3_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1808:3: lv_right_3_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolExpression4103);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1832:1: entryRuleTerminalBoolExpression returns [EObject current=null] : iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF ;
    public final EObject entryRuleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1833:2: (iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1834:2: iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4141);
            iv_ruleTerminalBoolExpression=ruleTerminalBoolExpression();

            state._fsp--;

             current =iv_ruleTerminalBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression4151); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1841:1: ruleTerminalBoolExpression returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1844:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1845:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1845:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1846:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4198);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1856:5: this_CompareExpression_1= ruleCompareExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4225);
                    this_CompareExpression_1=ruleCompareExpression();

                    state._fsp--;

                     
                            current = this_CompareExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1866:5: this_NegExpression_2= ruleNegExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4252);
                    this_NegExpression_2=ruleNegExpression();

                    state._fsp--;

                     
                            current = this_NegExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1876:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4279);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1886:5: this_Brackets_4= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4306);
                    this_Brackets_4=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1896:5: this_CALLSTATUS_5= ruleCALLSTATUS
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4333);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1912:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1913:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1914:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets4368);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets4378); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1921:1: ruleBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1924:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1925:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1925:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1925:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1925:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1926:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1926:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1927:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleBrackets4420); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1943:2: ( (lv_obj_1_0= ruleBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1944:1: (lv_obj_1_0= ruleBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1944:1: (lv_obj_1_0= ruleBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1945:3: lv_obj_1_0= ruleBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolExpression_in_ruleBrackets4446);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1961:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1962:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1962:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1963:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleBrackets4463); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1987:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1988:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1989:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
             newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4504);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;

             current =iv_ruleCompareExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression4514); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1996:1: ruleCompareExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1999:28: ( ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2000:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2000:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2000:2: ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2000:2: ( (lv_left_0_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2001:1: (lv_left_0_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2001:1: (lv_left_0_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2002:3: lv_left_0_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4560);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2018:2: ( (lv_op_1_0= RULE_COMPARE ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2019:1: (lv_op_1_0= RULE_COMPARE )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2019:1: (lv_op_1_0= RULE_COMPARE )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2020:3: lv_op_1_0= RULE_COMPARE
            {
            lv_op_1_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareExpression4577); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2036:2: ( (lv_right_2_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2037:1: (lv_right_2_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2037:1: (lv_right_2_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2038:3: lv_right_2_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4603);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2062:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2063:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2064:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
             newCompositeNode(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4639);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;

             current =iv_ruleNegExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4649); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2071:1: ruleNegExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2074:28: ( ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2075:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2075:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2075:2: ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2075:2: ( (lv_op_0_0= RULE_NEGATION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2076:1: (lv_op_0_0= RULE_NEGATION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2076:1: (lv_op_0_0= RULE_NEGATION )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2077:3: lv_op_0_0= RULE_NEGATION
            {
            lv_op_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_ruleNegExpression4691); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2093:2: ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2094:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2094:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2095:3: lv_obj_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4717);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2119:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2120:2: (iv_ruleMathExpression= ruleMathExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2121:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression4753);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression4763); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2128:1: ruleMathExpression returns [EObject current=null] : (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MathTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2131:28: ( (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2132:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2132:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2133:5: this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMathTerminal_in_ruleMathExpression4810);
            this_MathTerminal_0=ruleMathTerminal();

            state._fsp--;

             
                    current = this_MathTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2141:1: ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_MATH) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2141:2: () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2141:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2142:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2147:2: ( (lv_op_2_0= RULE_MATH ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2148:1: (lv_op_2_0= RULE_MATH )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2148:1: (lv_op_2_0= RULE_MATH )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2149:3: lv_op_2_0= RULE_MATH
                    {
                    lv_op_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathExpression4836); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2165:2: ( (lv_right_3_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2166:1: (lv_right_3_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2166:1: (lv_right_3_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2167:3: lv_right_3_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleMathExpression4862);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2191:1: entryRuleMathTerminal returns [EObject current=null] : iv_ruleMathTerminal= ruleMathTerminal EOF ;
    public final EObject entryRuleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2192:2: (iv_ruleMathTerminal= ruleMathTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2193:2: iv_ruleMathTerminal= ruleMathTerminal EOF
            {
             newCompositeNode(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4900);
            iv_ruleMathTerminal=ruleMathTerminal();

            state._fsp--;

             current =iv_ruleMathTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal4910); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2200:1: ruleMathTerminal returns [EObject current=null] : (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject ruleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_MathBrackets_0 = null;

        EObject this_Literal_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2203:28: ( (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2204:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2204:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt18=1;
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2205:5: this_MathBrackets_0= ruleMathBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMathBrackets_in_ruleMathTerminal4957);
                    this_MathBrackets_0=ruleMathBrackets();

                    state._fsp--;

                     
                            current = this_MathBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2215:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleMathTerminal4984);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2225:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_ruleMathTerminal5011);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2241:1: entryRuleMathBrackets returns [EObject current=null] : iv_ruleMathBrackets= ruleMathBrackets EOF ;
    public final EObject entryRuleMathBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2242:2: (iv_ruleMathBrackets= ruleMathBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2243:2: iv_ruleMathBrackets= ruleMathBrackets EOF
            {
             newCompositeNode(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5046);
            iv_ruleMathBrackets=ruleMathBrackets();

            state._fsp--;

             current =iv_ruleMathBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets5056); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2250:1: ruleMathBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleMathBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2253:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2254:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2254:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2254:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2254:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2255:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2255:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2256:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5098); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2272:2: ( (lv_obj_1_0= ruleMathExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2273:1: (lv_obj_1_0= ruleMathExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2273:1: (lv_obj_1_0= ruleMathExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2274:3: lv_obj_1_0= ruleMathExpression
            {
             
            	        newCompositeNode(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathExpression_in_ruleMathBrackets5124);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2290:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2291:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2291:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2292:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5141); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2316:1: entryRuleConcatenationExpression returns [EObject current=null] : iv_ruleConcatenationExpression= ruleConcatenationExpression EOF ;
    public final EObject entryRuleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2317:2: (iv_ruleConcatenationExpression= ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2318:2: iv_ruleConcatenationExpression= ruleConcatenationExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5182);
            iv_ruleConcatenationExpression=ruleConcatenationExpression();

            state._fsp--;

             current =iv_ruleConcatenationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression5192); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2325:1: ruleConcatenationExpression returns [EObject current=null] : (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) ;
    public final EObject ruleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ConcatenationTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2328:28: ( (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2329:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2329:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2330:5: this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5239);
            this_ConcatenationTerminal_0=ruleConcatenationTerminal();

            state._fsp--;

             
                    current = this_ConcatenationTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2338:1: ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_CONCATENATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2338:2: () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2338:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2339:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2344:2: ( (lv_op_2_0= RULE_CONCATENATION ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2345:1: (lv_op_2_0= RULE_CONCATENATION )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2345:1: (lv_op_2_0= RULE_CONCATENATION )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2346:3: lv_op_2_0= RULE_CONCATENATION
                    {
                    lv_op_2_0=(Token)match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_ruleConcatenationExpression5265); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2362:2: ( (lv_right_3_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2363:1: (lv_right_3_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2363:1: (lv_right_3_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2364:3: lv_right_3_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5291);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2388:1: entryRuleConcatenationTerminal returns [EObject current=null] : iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF ;
    public final EObject entryRuleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2389:2: (iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2390:2: iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF
            {
             newCompositeNode(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5329);
            iv_ruleConcatenationTerminal=ruleConcatenationTerminal();

            state._fsp--;

             current =iv_ruleConcatenationTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal5339); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2397:1: ruleConcatenationTerminal returns [EObject current=null] : (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) ;
    public final EObject ruleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_ConcatenationBrackets_0 = null;

        EObject this_LiteralAbs_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2400:28: ( (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2401:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2401:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OBRACKET) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID||(LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||(LA20_0>=RULE_NULL && LA20_0<=RULE_DOUBLE)||(LA20_0>=60 && LA20_0<=65)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2402:5: this_ConcatenationBrackets_0= ruleConcatenationBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5386);
                    this_ConcatenationBrackets_0=ruleConcatenationBrackets();

                    state._fsp--;

                     
                            current = this_ConcatenationBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2412:5: this_LiteralAbs_1= ruleLiteralAbs
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5413);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2428:1: entryRuleConcatenationBrackets returns [EObject current=null] : iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF ;
    public final EObject entryRuleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2429:2: (iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2430:2: iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF
            {
             newCompositeNode(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5448);
            iv_ruleConcatenationBrackets=ruleConcatenationBrackets();

            state._fsp--;

             current =iv_ruleConcatenationBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets5458); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2437:1: ruleConcatenationBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2440:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2441:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2441:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2441:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2441:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2442:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2442:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2443:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5500); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2459:2: ( (lv_obj_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2460:1: (lv_obj_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2460:1: (lv_obj_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2461:3: lv_obj_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5526);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2477:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2478:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2478:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2479:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5543); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2503:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2504:2: (iv_ruleStringVariable= ruleStringVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2505:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable5584);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable5594); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2512:1: ruleStringVariable returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2515:28: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2516:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2516:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2516:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleStringVariable5631); 

                	newLeafNode(otherlv_0, grammarAccess.getStringVariableAccess().getStringKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2520:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2521:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2521:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2522:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariable5648); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2538:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=52 && LA22_0<=53)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2538:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2538:3: (otherlv_2= '=' | otherlv_3= ' = ' )
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
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2538:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleStringVariable5667); 

                                	newLeafNode(otherlv_2, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2543:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleStringVariable5685); 

                                	newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:2: ( (lv_value_4_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2548:1: (lv_value_4_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2548:1: (lv_value_4_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2549:3: lv_value_4_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5707);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleStringVariable5721); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2577:1: entryRuleNumVariable returns [EObject current=null] : iv_ruleNumVariable= ruleNumVariable EOF ;
    public final EObject entryRuleNumVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2578:2: (iv_ruleNumVariable= ruleNumVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2579:2: iv_ruleNumVariable= ruleNumVariable EOF
            {
             newCompositeNode(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable5757);
            iv_ruleNumVariable=ruleNumVariable();

            state._fsp--;

             current =iv_ruleNumVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable5767); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2586:1: ruleNumVariable returns [EObject current=null] : (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2589:28: ( (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2590:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2590:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2590:3: otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleNumVariable5804); 

                	newLeafNode(otherlv_0, grammarAccess.getNumVariableAccess().getNumKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2594:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2595:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2595:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2596:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumVariable5821); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2612:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=52 && LA24_0<=53)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2612:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2612:3: (otherlv_2= '=' | otherlv_3= ' = ' )
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
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2612:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleNumVariable5840); 

                                	newLeafNode(otherlv_2, grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleNumVariable5858); 

                                	newLeafNode(otherlv_3, grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2621:2: ( (lv_value_4_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2622:1: (lv_value_4_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2622:1: (lv_value_4_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2623:3: lv_value_4_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleNumVariable5880);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleNumVariable5894); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2651:1: entryRuleBoolVariable returns [EObject current=null] : iv_ruleBoolVariable= ruleBoolVariable EOF ;
    public final EObject entryRuleBoolVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2652:2: (iv_ruleBoolVariable= ruleBoolVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2653:2: iv_ruleBoolVariable= ruleBoolVariable EOF
            {
             newCompositeNode(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5930);
            iv_ruleBoolVariable=ruleBoolVariable();

            state._fsp--;

             current =iv_ruleBoolVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable5940); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2660:1: ruleBoolVariable returns [EObject current=null] : (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2663:28: ( (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2664:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2664:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2664:3: otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleBoolVariable5977); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolVariableAccess().getBoolKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2668:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2669:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2669:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2670:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolVariable5994); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2686:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=52 && LA26_0<=53)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2686:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2686:3: (otherlv_2= '=' | otherlv_3= ' = ' )
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
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2686:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBoolVariable6013); 

                                	newLeafNode(otherlv_2, grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2691:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleBoolVariable6031); 

                                	newLeafNode(otherlv_3, grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2695:2: ( (lv_value_4_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2696:1: (lv_value_4_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2696:1: (lv_value_4_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2697:3: lv_value_4_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolVariable6053);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleBoolVariable6067); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2725:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2726:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2727:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant6103);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant6113); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2734:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2737:28: ( (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2738:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2738:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2738:3: otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleConstant6150); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2742:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2743:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2743:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2744:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant6167); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2760:2: (otherlv_2= '=' | otherlv_3= ' = ' )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2760:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleConstant6185); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2765:7: otherlv_3= ' = '
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleConstant6203); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:2: ( (lv_value_4_0= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2770:1: (lv_value_4_0= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2770:1: (lv_value_4_0= rulePrimitive )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2771:3: lv_value_4_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitive_in_ruleConstant6225);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleConstant6237); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2799:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2800:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2801:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive6273);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive6283); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2808:1: rulePrimitive returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2811:28: ( (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2812:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2812:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2813:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitive6330);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2823:5: this_BoolLiteral_1= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rulePrimitive6357);
                    this_BoolLiteral_1=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2833:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_rulePrimitive6384);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2851:1: entryRuleLiteralAbs returns [EObject current=null] : iv_ruleLiteralAbs= ruleLiteralAbs EOF ;
    public final EObject entryRuleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAbs = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2852:2: (iv_ruleLiteralAbs= ruleLiteralAbs EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2853:2: iv_ruleLiteralAbs= ruleLiteralAbs EOF
            {
             newCompositeNode(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6421);
            iv_ruleLiteralAbs=ruleLiteralAbs();

            state._fsp--;

             current =iv_ruleLiteralAbs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs6431); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2860:1: ruleLiteralAbs returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) ;
    public final EObject ruleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Primitive_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2863:28: ( (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2864:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2864:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==RULE_NULL||(LA29_0>=60 && LA29_0<=65)) ) {
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2865:5: this_Literal_0= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleLiteralAbs6478);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2875:5: this_Primitive_1= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleLiteralAbs6505);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2891:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2892:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2893:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6540);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6550); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2900:1: ruleLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nul_1_0=null;
        EObject this_SESSION_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2903:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
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
            case 60:
            case 61:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:1: (otherlv_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2906:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral6595); 

                    		newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2918:6: ( (lv_nul_1_0= RULE_NULL ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2918:6: ( (lv_nul_1_0= RULE_NULL ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2919:1: (lv_nul_1_0= RULE_NULL )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2919:1: (lv_nul_1_0= RULE_NULL )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2920:3: lv_nul_1_0= RULE_NULL
                    {
                    lv_nul_1_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral6618); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2938:5: this_SESSION_2= ruleSESSION
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSESSION_in_ruleLiteral6651);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2954:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2955:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2956:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6686);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral6696); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2963:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2966:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2967:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2967:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2967:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2967:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2968:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2973:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2974:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2974:1: (lv_value_1_0= RULE_BOOL )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2975:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral6747); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2999:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3000:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3001:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6788);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;

             current =iv_ruleNumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral6798); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3008:1: ruleNumLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3011:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3012:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3012:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3012:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3012:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3013:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumLiteralAccess().getNumLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3018:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3019:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3019:1: (lv_value_1_0= ruleNumber )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3020:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumLiteral6853);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3044:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3045:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3046:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6889);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6899); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3053:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3056:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3057:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3057:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3057:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3057:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3058:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3063:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3064:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3064:1: (lv_value_1_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3065:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6950); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3089:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3090:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3091:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber6992);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber7003); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3098:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3101:28: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3102:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3102:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3102:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumber7043); 

                    		current.merge(this_DOUBLE_0);
                        
                     
                        newLeafNode(this_DOUBLE_0, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3110:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7069); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3125:1: entryRuleEVENT returns [EObject current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final EObject entryRuleEVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENT = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3126:2: (iv_ruleEVENT= ruleEVENT EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3127:2: iv_ruleEVENT= ruleEVENT EOF
            {
             newCompositeNode(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT7114);
            iv_ruleEVENT=ruleEVENT();

            state._fsp--;

             current =iv_ruleEVENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT7124); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3134:1: ruleEVENT returns [EObject current=null] : ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) ) ;
    public final EObject ruleEVENT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3137:28: ( ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3138:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3138:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) )
            int alt32=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3138:2: ( (lv_name_0_0= 'HANGUP' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3138:2: ( (lv_name_0_0= 'HANGUP' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3139:1: (lv_name_0_0= 'HANGUP' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3139:1: (lv_name_0_0= 'HANGUP' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3140:3: lv_name_0_0= 'HANGUP'
                    {
                    lv_name_0_0=(Token)match(input,57,FOLLOW_57_in_ruleEVENT7167); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3154:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3154:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3155:1: (lv_name_1_0= 'COMPLETED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3155:1: (lv_name_1_0= 'COMPLETED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3156:3: lv_name_1_0= 'COMPLETED'
                    {
                    lv_name_1_0=(Token)match(input,58,FOLLOW_58_in_ruleEVENT7204); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3170:6: ( (lv_name_2_0= 'ERROR' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3170:6: ( (lv_name_2_0= 'ERROR' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3171:1: (lv_name_2_0= 'ERROR' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3171:1: (lv_name_2_0= 'ERROR' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3172:3: lv_name_2_0= 'ERROR'
                    {
                    lv_name_2_0=(Token)match(input,59,FOLLOW_59_in_ruleEVENT7241); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3186:6: ( (lv_name_3_0= 'TIMES' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3186:6: ( (lv_name_3_0= 'TIMES' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3187:1: (lv_name_3_0= 'TIMES' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3187:1: (lv_name_3_0= 'TIMES' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3188:3: lv_name_3_0= 'TIMES'
                    {
                    lv_name_3_0=(Token)match(input,60,FOLLOW_60_in_ruleEVENT7278); 

                            newLeafNode(lv_name_3_0, grammarAccess.getEVENTAccess().getNameTIMESKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEVENTRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "TIMES");
                    	    

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3209:1: entryRuleSESSION returns [EObject current=null] : iv_ruleSESSION= ruleSESSION EOF ;
    public final EObject entryRuleSESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSESSION = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3210:2: (iv_ruleSESSION= ruleSESSION EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3211:2: iv_ruleSESSION= ruleSESSION EOF
            {
             newCompositeNode(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION7327);
            iv_ruleSESSION=ruleSESSION();

            state._fsp--;

             current =iv_ruleSESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION7337); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3218:1: ruleSESSION returns [EObject current=null] : ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'CALLED' ) ) | ( (lv_name_3_0= 'DIGITS' ) ) | ( (lv_name_4_0= 'RECORD' ) ) | ( (lv_name_5_0= 'TIMES' ) ) ) ;
    public final EObject ruleSESSION() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3221:28: ( ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'CALLED' ) ) | ( (lv_name_3_0= 'DIGITS' ) ) | ( (lv_name_4_0= 'RECORD' ) ) | ( (lv_name_5_0= 'TIMES' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3222:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'CALLED' ) ) | ( (lv_name_3_0= 'DIGITS' ) ) | ( (lv_name_4_0= 'RECORD' ) ) | ( (lv_name_5_0= 'TIMES' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3222:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'CALLED' ) ) | ( (lv_name_3_0= 'DIGITS' ) ) | ( (lv_name_4_0= 'RECORD' ) ) | ( (lv_name_5_0= 'TIMES' ) ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 62:
                {
                alt33=2;
                }
                break;
            case 63:
                {
                alt33=3;
                }
                break;
            case 64:
                {
                alt33=4;
                }
                break;
            case 65:
                {
                alt33=5;
                }
                break;
            case 60:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3222:2: ( (lv_name_0_0= 'CALLER' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3222:2: ( (lv_name_0_0= 'CALLER' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3223:1: (lv_name_0_0= 'CALLER' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3223:1: (lv_name_0_0= 'CALLER' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3224:3: lv_name_0_0= 'CALLER'
                    {
                    lv_name_0_0=(Token)match(input,61,FOLLOW_61_in_ruleSESSION7380); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3238:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3238:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3239:1: (lv_name_1_0= 'LASTSTATE' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3239:1: (lv_name_1_0= 'LASTSTATE' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3240:3: lv_name_1_0= 'LASTSTATE'
                    {
                    lv_name_1_0=(Token)match(input,62,FOLLOW_62_in_ruleSESSION7417); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3254:6: ( (lv_name_2_0= 'CALLED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3254:6: ( (lv_name_2_0= 'CALLED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3255:1: (lv_name_2_0= 'CALLED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3255:1: (lv_name_2_0= 'CALLED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3256:3: lv_name_2_0= 'CALLED'
                    {
                    lv_name_2_0=(Token)match(input,63,FOLLOW_63_in_ruleSESSION7454); 

                            newLeafNode(lv_name_2_0, grammarAccess.getSESSIONAccess().getNameCALLEDKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "CALLED");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3270:6: ( (lv_name_3_0= 'DIGITS' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3270:6: ( (lv_name_3_0= 'DIGITS' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3271:1: (lv_name_3_0= 'DIGITS' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3271:1: (lv_name_3_0= 'DIGITS' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3272:3: lv_name_3_0= 'DIGITS'
                    {
                    lv_name_3_0=(Token)match(input,64,FOLLOW_64_in_ruleSESSION7491); 

                            newLeafNode(lv_name_3_0, grammarAccess.getSESSIONAccess().getNameDIGITSKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "DIGITS");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3286:6: ( (lv_name_4_0= 'RECORD' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3286:6: ( (lv_name_4_0= 'RECORD' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3287:1: (lv_name_4_0= 'RECORD' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3287:1: (lv_name_4_0= 'RECORD' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3288:3: lv_name_4_0= 'RECORD'
                    {
                    lv_name_4_0=(Token)match(input,65,FOLLOW_65_in_ruleSESSION7528); 

                            newLeafNode(lv_name_4_0, grammarAccess.getSESSIONAccess().getNameRECORDKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "RECORD");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3302:6: ( (lv_name_5_0= 'TIMES' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3302:6: ( (lv_name_5_0= 'TIMES' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3303:1: (lv_name_5_0= 'TIMES' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3303:1: (lv_name_5_0= 'TIMES' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3304:3: lv_name_5_0= 'TIMES'
                    {
                    lv_name_5_0=(Token)match(input,60,FOLLOW_60_in_ruleSESSION7565); 

                            newLeafNode(lv_name_5_0, grammarAccess.getSESSIONAccess().getNameTIMESKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSESSIONRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "TIMES");
                    	    

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3325:1: entryRuleCALLSTATUS returns [EObject current=null] : iv_ruleCALLSTATUS= ruleCALLSTATUS EOF ;
    public final EObject entryRuleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCALLSTATUS = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3326:2: (iv_ruleCALLSTATUS= ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3327:2: iv_ruleCALLSTATUS= ruleCALLSTATUS EOF
            {
             newCompositeNode(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS7614);
            iv_ruleCALLSTATUS=ruleCALLSTATUS();

            state._fsp--;

             current =iv_ruleCALLSTATUS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS7624); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3334:1: ruleCALLSTATUS returns [EObject current=null] : ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) ;
    public final EObject ruleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3337:28: ( ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3338:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3338:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3338:2: ( (lv_name_0_0= 'RINGING' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3338:2: ( (lv_name_0_0= 'RINGING' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3339:1: (lv_name_0_0= 'RINGING' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3339:1: (lv_name_0_0= 'RINGING' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3340:3: lv_name_0_0= 'RINGING'
                    {
                    lv_name_0_0=(Token)match(input,66,FOLLOW_66_in_ruleCALLSTATUS7667); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3354:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3354:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:1: (lv_name_1_0= 'IN-PROGRESS' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:1: (lv_name_1_0= 'IN-PROGRESS' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3356:3: lv_name_1_0= 'IN-PROGRESS'
                    {
                    lv_name_1_0=(Token)match(input,67,FOLLOW_67_in_ruleCALLSTATUS7704); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3370:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3370:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3371:1: (lv_name_2_0= 'DISCONNECTED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3371:1: (lv_name_2_0= 'DISCONNECTED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3372:3: lv_name_2_0= 'DISCONNECTED'
                    {
                    lv_name_2_0=(Token)match(input,68,FOLLOW_68_in_ruleCALLSTATUS7741); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3386:6: ( (lv_name_3_0= 'FAILED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3386:6: ( (lv_name_3_0= 'FAILED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3387:1: (lv_name_3_0= 'FAILED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3387:1: (lv_name_3_0= 'FAILED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3388:3: lv_name_3_0= 'FAILED'
                    {
                    lv_name_3_0=(Token)match(input,69,FOLLOW_69_in_ruleCALLSTATUS7778); 

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
        "\20\uffff";
    static final String DFA16_eofS =
        "\1\uffff\1\16\10\17\6\uffff";
    static final String DFA16_minS =
        "\1\4\11\10\6\uffff";
    static final String DFA16_maxS =
        "\1\105\11\34\6\uffff";
    static final String DFA16_acceptS =
        "\12\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA16_specialS =
        "\20\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\2\12\1\uffff\1\14\2\uffff\1\13\2\uffff\1\3\1\1"+
            "\1\12\52\uffff\1\11\1\4\1\5\1\6\1\7\1\10\4\15",
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
            return "1845:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )";
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
    public static final BitSet FOLLOW_25_in_ruleState854 = new BitSet(new long[]{0x01CC8E2EEC000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleState875 = new BitSet(new long[]{0x01CC8E2EEC000020L});
    public static final BitSet FOLLOW_26_in_ruleState888 = new BitSet(new long[]{0x0000000003400002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoiceTag980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_ruleVoiceTag1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_ruleVoiceTag1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_ruleVoiceTag1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_ruleVoiceTag1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_ruleVoiceTag1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_ruleVoiceTag1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_ruleVoiceTag1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_ruleVoiceTag1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleVoiceTag1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_ruleVoiceTag1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_ruleVoiceTag1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCall1385 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleCall1419 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCall1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_entryRuleDial1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDial1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDial1520 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleDial1554 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDial1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_entryRulePlay1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlay1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePlay1655 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rulePlay1689 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePlay1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRecord1790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRecord1820 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRecord1837 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRecord1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_entryRuleReject1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReject1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleReject1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_entryRuleHangup1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHangup1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleHangup2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_entryRuleGetDigits2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDigits2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleGetDigits2138 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGetDigits2168 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGetDigits2186 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGetDigits2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend2234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSend2287 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleSendBlock_in_ruleSend2321 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSend2333 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSend2354 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSend2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSendBlock2458 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSendBlock2479 = new BitSet(new long[]{0x0000008004000000L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2500 = new BitSet(new long[]{0x0000008004000000L});
    public static final BitSet FOLLOW_26_in_ruleSendBlock2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNotPrimaryParam2596 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleNotPrimaryParam2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParam2705 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleParam2722 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleParam2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSay2832 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSay2866 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSay2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_entryRuleSms2914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSms2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSms2967 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3001 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSms3013 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3034 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSms3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_entryRuleEmail3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmail3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEmail3135 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEmail3160 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleEmail3172 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEmail3184 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3205 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEmail3217 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEmail3229 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEmail3241 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3262 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEmail3274 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEmail3286 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEmail3298 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3319 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEmail3331 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEmail3343 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3364 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEmail3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTransition3465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3498 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTransition3510 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_ruleEVENT_in_ruleTransition3531 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp3579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3635 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIfExp3648 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3669 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIfExp3684 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock3743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCondBlock3790 = new BitSet(new long[]{0xF0000000000392D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3811 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock3868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBlock3924 = new BitSet(new long[]{0x01CC8E2EEC000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleBlock3945 = new BitSet(new long[]{0x01CC8E2EEC000020L});
    public static final BitSet FOLLOW_26_in_ruleBlock3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression3994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4051 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4077 = new BitSet(new long[]{0xF0000000000392D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolExpression4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets4368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleBrackets4420 = new BitSet(new long[]{0xF0000000000392D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBrackets4446 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleBrackets4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4560 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareExpression4577 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_ruleNegExpression4691 = new BitSet(new long[]{0xF0000000000392D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression4753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_ruleMathExpression4810 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathExpression4836 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathExpression4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_ruleMathTerminal4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMathTerminal4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_ruleMathTerminal5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5098 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathBrackets5124 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5239 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_ruleConcatenationExpression5265 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5500 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5526 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable5584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStringVariable5631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariable5648 = new BitSet(new long[]{0x0030000010000000L});
    public static final BitSet FOLLOW_52_in_ruleStringVariable5667 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_53_in_ruleStringVariable5685 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStringVariable5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable5757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumVariable5804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumVariable5821 = new BitSet(new long[]{0x0030000010000000L});
    public static final BitSet FOLLOW_52_in_ruleNumVariable5840 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_53_in_ruleNumVariable5858 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleNumVariable5880 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNumVariable5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBoolVariable5977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolVariable5994 = new BitSet(new long[]{0x0030000010000000L});
    public static final BitSet FOLLOW_52_in_ruleBoolVariable6013 = new BitSet(new long[]{0xF0000000000392D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_53_in_ruleBoolVariable6031 = new BitSet(new long[]{0xF0000000000392D0L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolVariable6053 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBoolVariable6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleConstant6150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant6167 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleConstant6185 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_53_in_ruleConstant6203 = new BitSet(new long[]{0xF0000000000382D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleConstant6225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConstant6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive6273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitive6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rulePrimitive6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rulePrimitive6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAbs6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleLiteralAbs6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_ruleLiteral6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumLiteral6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumber7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT7114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEVENT7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEVENT7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEVENT7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEVENT7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION7327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSESSION7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSESSION7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSESSION7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSESSION7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSESSION7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSESSION7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS7614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCALLSTATUS7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCALLSTATUS7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCALLSTATUS7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCALLSTATUS7778 = new BitSet(new long[]{0x0000000000000002L});

}
