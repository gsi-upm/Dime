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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_NULL", "RULE_BOOL", "RULE_DOUBLE", "RULE_CONCATENATION", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'State'", "'times'", "'timeout'", "'{'", "'}'", "'Call'", "';'", "'DialTo'", "'Play'", "'Record'", "'seconds'", "'in'", "' -> '", "'Reject;'", "'HangUp;'", "'Get'", "'digits'", "'Ask'", "'Send'", "'to'", "','", "':'", "'Say'", "'Sms'", "'Email'", "'subject'", "'from'", "'Tweet'", "'GoTo'", "'when'", "'else'", "'if'", "'+'", "'String'", "'='", "' = '", "'Num'", "'Bool'", "'Const'", "'HANGUP'", "'COMPLETED'", "'ERROR'", "'TIMES'", "'TIMEOUT'", "'CALLER'", "'LASTSTATE'", "'TIME'", "'CALLED'", "'RINGING'", "'IN-PROGRESS'", "'DISCONNECTED'", "'FAILED'"
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
    public static final int T__73=73;
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

                if ( (LA1_0==RULE_ML_COMMENT||LA1_0==55||(LA1_0>=58 && LA1_0<=60)) ) {
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
            case 58:
                {
                alt3=1;
                }
                break;
            case 55:
                {
                alt3=2;
                }
                break;
            case 59:
                {
                alt3=3;
                }
                break;
            case 60:
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
            case 55:
            case 58:
            case 59:
            case 60:
                {
                alt4=1;
                }
                break;
            case 50:
                {
                alt4=2;
                }
                break;
            case 53:
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
            case 46:
            case 49:
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

            	        if ( (LA7_0==RULE_ML_COMMENT||LA7_0==27||(LA7_0>=29 && LA7_0<=31)||(LA7_0>=35 && LA7_0<=37)||(LA7_0>=39 && LA7_0<=40)||(LA7_0>=44 && LA7_0<=46)||(LA7_0>=49 && LA7_0<=50)||LA7_0==53||LA7_0==55||(LA7_0>=58 && LA7_0<=60)) ) {
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:448:1: ruleVoiceTag returns [EObject current=null] : (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail | this_Tweet_12= ruleTweet ) ;
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

        EObject this_Tweet_12 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:451:28: ( (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail | this_Tweet_12= ruleTweet ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:452:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail | this_Tweet_12= ruleTweet )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:452:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup | this_Call_9= ruleCall | this_Sms_10= ruleSms | this_Email_11= ruleEmail | this_Tweet_12= ruleTweet )
            int alt9=13;
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
            case 46:
                {
                alt9=12;
                }
                break;
            case 49:
                {
                alt9=13;
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
                case 12 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:563:5: this_Email_11= ruleEmail
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getEmailParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleEmail_in_ruleVoiceTag1324);
                    this_Email_11=ruleEmail();

                    state._fsp--;

                     
                            current = this_Email_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:573:5: this_Tweet_12= ruleTweet
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getTweetParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleTweet_in_ruleVoiceTag1351);
                    this_Tweet_12=ruleTweet();

                    state._fsp--;

                     
                            current = this_Tweet_12; 
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:589:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:590:2: (iv_ruleCall= ruleCall EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:591:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1386);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1396); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:598:1: ruleCall returns [EObject current=null] : ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:601:28: ( ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:602:1: ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:602:1: ( ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:602:2: ( (lv_name_0_0= 'Call' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:602:2: ( (lv_name_0_0= 'Call' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:603:1: (lv_name_0_0= 'Call' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:603:1: (lv_name_0_0= 'Call' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:604:3: lv_name_0_0= 'Call'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleCall1439); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCallAccess().getNameCallKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCallRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Call");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:617:2: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:618:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:618:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:619:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleCall1473);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCall1485); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:647:1: entryRuleDial returns [EObject current=null] : iv_ruleDial= ruleDial EOF ;
    public final EObject entryRuleDial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDial = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:648:2: (iv_ruleDial= ruleDial EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:649:2: iv_ruleDial= ruleDial EOF
            {
             newCompositeNode(grammarAccess.getDialRule()); 
            pushFollow(FOLLOW_ruleDial_in_entryRuleDial1521);
            iv_ruleDial=ruleDial();

            state._fsp--;

             current =iv_ruleDial; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDial1531); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:656:1: ruleDial returns [EObject current=null] : ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleDial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:659:28: ( ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:660:1: ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:660:1: ( ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:660:2: ( (lv_name_0_0= 'DialTo' ) ) ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:660:2: ( (lv_name_0_0= 'DialTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:661:1: (lv_name_0_0= 'DialTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:661:1: (lv_name_0_0= 'DialTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:662:3: lv_name_0_0= 'DialTo'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleDial1574); 

                    newLeafNode(lv_name_0_0, grammarAccess.getDialAccess().getNameDialToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDialRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "DialTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:675:2: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:676:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:676:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:677:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleDial1608);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleDial1620); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:705:1: entryRulePlay returns [EObject current=null] : iv_rulePlay= rulePlay EOF ;
    public final EObject entryRulePlay() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:706:2: (iv_rulePlay= rulePlay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:707:2: iv_rulePlay= rulePlay EOF
            {
             newCompositeNode(grammarAccess.getPlayRule()); 
            pushFollow(FOLLOW_rulePlay_in_entryRulePlay1656);
            iv_rulePlay=rulePlay();

            state._fsp--;

             current =iv_rulePlay; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlay1666); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:714:1: rulePlay returns [EObject current=null] : ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject rulePlay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_file_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:717:28: ( ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:718:1: ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:718:1: ( ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:718:2: ( (lv_name_0_0= 'Play' ) ) ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:718:2: ( (lv_name_0_0= 'Play' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:719:1: (lv_name_0_0= 'Play' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:719:1: (lv_name_0_0= 'Play' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:720:3: lv_name_0_0= 'Play'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_rulePlay1709); 

                    newLeafNode(lv_name_0_0, grammarAccess.getPlayAccess().getNamePlayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Play");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:733:2: ( (lv_file_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:734:1: (lv_file_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:734:1: (lv_file_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:735:3: lv_file_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rulePlay1743);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePlay1755); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:763:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:764:2: (iv_ruleRecord= ruleRecord EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:765:2: iv_ruleRecord= ruleRecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord1791);
            iv_ruleRecord=ruleRecord();

            state._fsp--;

             current =iv_ruleRecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord1801); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:772:1: ruleRecord returns [EObject current=null] : ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:775:28: ( ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:776:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:776:1: ( ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:776:2: ( (lv_name_0_0= 'Record' ) ) ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )? otherlv_7= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:776:2: ( (lv_name_0_0= 'Record' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:777:1: (lv_name_0_0= 'Record' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:777:1: (lv_name_0_0= 'Record' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:778:3: lv_name_0_0= 'Record'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_31_in_ruleRecord1844); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRecordAccess().getNameRecordKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Record");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:791:2: ( (lv_time_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:792:1: (lv_time_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:792:1: (lv_time_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:793:3: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRecord1874); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleRecord1891); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordAccess().getSecondsKeyword_2());
                
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleRecord1903); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getInKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:817:1: ( (lv_action_4_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:818:1: (lv_action_4_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:818:1: (lv_action_4_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:819:3: lv_action_4_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleRecord1924);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:835:2: (otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:835:4: otherlv_5= ' -> ' ( (lv_vari_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleRecord1937); 

                        	newLeafNode(otherlv_5, grammarAccess.getRecordAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_5_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:839:1: ( (lv_vari_6_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:840:1: (lv_vari_6_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:840:1: (lv_vari_6_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:841:3: lv_vari_6_0= RULE_ID
                    {
                    lv_vari_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecord1954); 

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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleRecord1973); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:869:1: entryRuleReject returns [EObject current=null] : iv_ruleReject= ruleReject EOF ;
    public final EObject entryRuleReject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReject = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:870:2: (iv_ruleReject= ruleReject EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:871:2: iv_ruleReject= ruleReject EOF
            {
             newCompositeNode(grammarAccess.getRejectRule()); 
            pushFollow(FOLLOW_ruleReject_in_entryRuleReject2009);
            iv_ruleReject=ruleReject();

            state._fsp--;

             current =iv_ruleReject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReject2019); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:878:1: ruleReject returns [EObject current=null] : ( (lv_name_0_0= 'Reject;' ) ) ;
    public final EObject ruleReject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:881:28: ( ( (lv_name_0_0= 'Reject;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:882:1: ( (lv_name_0_0= 'Reject;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:882:1: ( (lv_name_0_0= 'Reject;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:883:1: (lv_name_0_0= 'Reject;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:883:1: (lv_name_0_0= 'Reject;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:884:3: lv_name_0_0= 'Reject;'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleReject2061); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:905:1: entryRuleHangup returns [EObject current=null] : iv_ruleHangup= ruleHangup EOF ;
    public final EObject entryRuleHangup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHangup = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:906:2: (iv_ruleHangup= ruleHangup EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:907:2: iv_ruleHangup= ruleHangup EOF
            {
             newCompositeNode(grammarAccess.getHangupRule()); 
            pushFollow(FOLLOW_ruleHangup_in_entryRuleHangup2109);
            iv_ruleHangup=ruleHangup();

            state._fsp--;

             current =iv_ruleHangup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHangup2119); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:914:1: ruleHangup returns [EObject current=null] : ( (lv_name_0_0= 'HangUp;' ) ) ;
    public final EObject ruleHangup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:917:28: ( ( (lv_name_0_0= 'HangUp;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:918:1: ( (lv_name_0_0= 'HangUp;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:918:1: ( (lv_name_0_0= 'HangUp;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:919:1: (lv_name_0_0= 'HangUp;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:919:1: (lv_name_0_0= 'HangUp;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:920:3: lv_name_0_0= 'HangUp;'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_36_in_ruleHangup2161); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:941:1: entryRuleGetDigits returns [EObject current=null] : iv_ruleGetDigits= ruleGetDigits EOF ;
    public final EObject entryRuleGetDigits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDigits = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:942:2: (iv_ruleGetDigits= ruleGetDigits EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:943:2: iv_ruleGetDigits= ruleGetDigits EOF
            {
             newCompositeNode(grammarAccess.getGetDigitsRule()); 
            pushFollow(FOLLOW_ruleGetDigits_in_entryRuleGetDigits2209);
            iv_ruleGetDigits=ruleGetDigits();

            state._fsp--;

             current =iv_ruleGetDigits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDigits2219); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:950:1: ruleGetDigits returns [EObject current=null] : ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:953:28: ( ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:954:1: ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:954:1: ( ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:954:2: ( (lv_name_0_0= 'Get' ) ) ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= ' -> ' ( (lv_vari_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:954:2: ( (lv_name_0_0= 'Get' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:955:1: (lv_name_0_0= 'Get' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:955:1: (lv_name_0_0= 'Get' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:956:3: lv_name_0_0= 'Get'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_37_in_ruleGetDigits2262); 

                    newLeafNode(lv_name_0_0, grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Get");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:969:2: ( (lv_numDigits_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:970:1: (lv_numDigits_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:970:1: (lv_numDigits_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:971:3: lv_numDigits_1_0= RULE_INT
            {
            lv_numDigits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGetDigits2292); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleGetDigits2309); 

                	newLeafNode(otherlv_2, grammarAccess.getGetDigitsAccess().getDigitsKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:991:1: ( (lv_question_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:992:1: (lv_question_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:992:1: (lv_question_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:993:3: lv_question_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleGetDigits2330);
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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleGetDigits2342); 

                	newLeafNode(otherlv_4, grammarAccess.getGetDigitsAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1013:1: ( (lv_vari_5_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1014:1: (lv_vari_5_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1014:1: (lv_vari_5_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1015:3: lv_vari_5_0= RULE_ID
            {
            lv_vari_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDigits2359); 

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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleGetDigits2376); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1043:1: entryRuleAsk returns [EObject current=null] : iv_ruleAsk= ruleAsk EOF ;
    public final EObject entryRuleAsk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsk = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1044:2: (iv_ruleAsk= ruleAsk EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1045:2: iv_ruleAsk= ruleAsk EOF
            {
             newCompositeNode(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_ruleAsk_in_entryRuleAsk2412);
            iv_ruleAsk=ruleAsk();

            state._fsp--;

             current =iv_ruleAsk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsk2422); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1052:1: ruleAsk returns [EObject current=null] : ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleAsk() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_vari_3_0=null;
        Token otherlv_4=null;
        EObject lv_question_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1055:28: ( ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1056:1: ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1056:1: ( ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1056:2: ( (lv_name_0_0= 'Ask' ) ) ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= ' -> ' ( (lv_vari_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1056:2: ( (lv_name_0_0= 'Ask' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1057:1: (lv_name_0_0= 'Ask' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1057:1: (lv_name_0_0= 'Ask' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1058:3: lv_name_0_0= 'Ask'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_39_in_ruleAsk2465); 

                    newLeafNode(lv_name_0_0, grammarAccess.getAskAccess().getNameAskKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAskRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Ask");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1071:2: ( (lv_question_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1072:1: (lv_question_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1072:1: (lv_question_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1073:3: lv_question_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleAsk2499);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAsk2511); 

                	newLeafNode(otherlv_2, grammarAccess.getAskAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1093:1: ( (lv_vari_3_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1094:1: (lv_vari_3_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1094:1: (lv_vari_3_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1095:3: lv_vari_3_0= RULE_ID
            {
            lv_vari_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsk2528); 

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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAsk2545); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1123:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1124:2: (iv_ruleSend= ruleSend EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1125:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend2581);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend2591); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1132:1: ruleSend returns [EObject current=null] : ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_url_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1135:28: ( ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1136:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1136:1: ( ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1136:2: ( (lv_name_0_0= 'Send' ) ) ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1136:2: ( (lv_name_0_0= 'Send' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1137:1: (lv_name_0_0= 'Send' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1137:1: (lv_name_0_0= 'Send' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1138:3: lv_name_0_0= 'Send'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_40_in_ruleSend2634); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSendAccess().getNameSendKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSendRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Send");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1151:2: ( (lv_params_1_0= ruleSendBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1152:1: (lv_params_1_0= ruleSendBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1152:1: (lv_params_1_0= ruleSendBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1153:3: lv_params_1_0= ruleSendBlock
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSendBlock_in_ruleSend2668);
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSend2680); 

                	newLeafNode(otherlv_2, grammarAccess.getSendAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1173:1: ( (lv_url_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1174:1: (lv_url_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1174:1: (lv_url_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1175:3: lv_url_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSend2701);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSend2713); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1203:1: entryRuleSendBlock returns [EObject current=null] : iv_ruleSendBlock= ruleSendBlock EOF ;
    public final EObject entryRuleSendBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1204:2: (iv_ruleSendBlock= ruleSendBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1205:2: iv_ruleSendBlock= ruleSendBlock EOF
            {
             newCompositeNode(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock2749);
            iv_ruleSendBlock=ruleSendBlock();

            state._fsp--;

             current =iv_ruleSendBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock2759); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1212:1: ruleSendBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleSendBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        EObject lv_stms_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1215:28: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1216:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1216:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1216:2: () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1216:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1217:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendBlockAccess().getSendBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSendBlock2805); 

                	newLeafNode(otherlv_1, grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1226:1: ( (lv_value_2_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1227:1: (lv_value_2_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1227:1: (lv_value_2_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1228:3: lv_value_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleSendBlock2826);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1244:2: ( (lv_stms_3_0= ruleNotPrimaryParam ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1245:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1245:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1246:3: lv_stms_3_0= ruleNotPrimaryParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2847);
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSendBlock2860); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1274:1: entryRuleNotPrimaryParam returns [EObject current=null] : iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF ;
    public final EObject entryRuleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotPrimaryParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1275:2: (iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1276:2: iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF
            {
             newCompositeNode(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2896);
            iv_ruleNotPrimaryParam=ruleNotPrimaryParam();

            state._fsp--;

             current =iv_ruleNotPrimaryParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam2906); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1283:1: ruleNotPrimaryParam returns [EObject current=null] : (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) ;
    public final EObject ruleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1286:28: ( (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1287:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1287:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1287:3: otherlv_0= ',' ( (lv_value_1_0= ruleParam ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleNotPrimaryParam2943); 

                	newLeafNode(otherlv_0, grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1291:1: ( (lv_value_1_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1292:1: (lv_value_1_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1292:1: (lv_value_1_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1293:3: lv_value_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleNotPrimaryParam2964);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1317:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1318:2: (iv_ruleParam= ruleParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1319:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam3000);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam3010); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1326:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1329:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1330:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1330:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1330:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConcatenationExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1330:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1331:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1331:1: (lv_name_0_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1332:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParam3052); 

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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleParam3069); 

                	newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1352:1: ( (lv_value_2_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1353:1: (lv_value_2_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1353:1: (lv_value_2_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1354:3: lv_value_2_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleParam3090);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1378:1: entryRuleSay returns [EObject current=null] : iv_ruleSay= ruleSay EOF ;
    public final EObject entryRuleSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1379:2: (iv_ruleSay= ruleSay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1380:2: iv_ruleSay= ruleSay EOF
            {
             newCompositeNode(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay3126);
            iv_ruleSay=ruleSay();

            state._fsp--;

             current =iv_ruleSay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay3136); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1387:1: ruleSay returns [EObject current=null] : ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSay() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_that_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1390:28: ( ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1391:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1391:1: ( ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1391:2: ( (lv_name_0_0= 'Say' ) ) ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1391:2: ( (lv_name_0_0= 'Say' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1392:1: (lv_name_0_0= 'Say' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1392:1: (lv_name_0_0= 'Say' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1393:3: lv_name_0_0= 'Say'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_44_in_ruleSay3179); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSayAccess().getNameSayKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSayRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Say");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1406:2: ( (lv_that_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1407:1: (lv_that_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1407:1: (lv_that_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1408:3: lv_that_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSay3213);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSay3225); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1436:1: entryRuleSms returns [EObject current=null] : iv_ruleSms= ruleSms EOF ;
    public final EObject entryRuleSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSms = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1437:2: (iv_ruleSms= ruleSms EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1438:2: iv_ruleSms= ruleSms EOF
            {
             newCompositeNode(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_ruleSms_in_entryRuleSms3261);
            iv_ruleSms=ruleSms();

            state._fsp--;

             current =iv_ruleSms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSms3271); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1445:1: ruleSms returns [EObject current=null] : ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSms() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_to_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1448:28: ( ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1449:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1449:1: ( ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1449:2: ( (lv_name_0_0= 'Sms' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1449:2: ( (lv_name_0_0= 'Sms' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1450:1: (lv_name_0_0= 'Sms' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1450:1: (lv_name_0_0= 'Sms' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1451:3: lv_name_0_0= 'Sms'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_45_in_ruleSms3314); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSmsAccess().getNameSmsKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmsRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Sms");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1464:2: ( (lv_value_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1465:1: (lv_value_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1465:1: (lv_value_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1466:3: lv_value_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3348);
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

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSms3360); 

                	newLeafNode(otherlv_2, grammarAccess.getSmsAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1486:1: ( (lv_to_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1487:1: (lv_to_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1487:1: (lv_to_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1488:3: lv_to_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSms3381);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSms3393); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1516:1: entryRuleEmail returns [EObject current=null] : iv_ruleEmail= ruleEmail EOF ;
    public final EObject entryRuleEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmail = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1517:2: (iv_ruleEmail= ruleEmail EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1518:2: iv_ruleEmail= ruleEmail EOF
            {
             newCompositeNode(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_ruleEmail_in_entryRuleEmail3429);
            iv_ruleEmail=ruleEmail();

            state._fsp--;

             current =iv_ruleEmail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmail3439); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1525:1: ruleEmail returns [EObject current=null] : ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' ( (lv_value_10_0= ruleConcatenationExpression ) ) otherlv_11= '}' otherlv_12= 'to' ( (lv_to_13_0= ruleConcatenationExpression ) ) otherlv_14= ';' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_title_4_0 = null;

        EObject lv_from_8_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_to_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1528:28: ( ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' ( (lv_value_10_0= ruleConcatenationExpression ) ) otherlv_11= '}' otherlv_12= 'to' ( (lv_to_13_0= ruleConcatenationExpression ) ) otherlv_14= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1529:1: ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' ( (lv_value_10_0= ruleConcatenationExpression ) ) otherlv_11= '}' otherlv_12= 'to' ( (lv_to_13_0= ruleConcatenationExpression ) ) otherlv_14= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1529:1: ( ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' ( (lv_value_10_0= ruleConcatenationExpression ) ) otherlv_11= '}' otherlv_12= 'to' ( (lv_to_13_0= ruleConcatenationExpression ) ) otherlv_14= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1529:2: ( (lv_name_0_0= 'Email' ) ) otherlv_1= '{' otherlv_2= 'subject' otherlv_3= ':' ( (lv_title_4_0= ruleConcatenationExpression ) ) otherlv_5= ',' otherlv_6= 'from' otherlv_7= ':' ( (lv_from_8_0= ruleConcatenationExpression ) ) otherlv_9= ',' ( (lv_value_10_0= ruleConcatenationExpression ) ) otherlv_11= '}' otherlv_12= 'to' ( (lv_to_13_0= ruleConcatenationExpression ) ) otherlv_14= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1529:2: ( (lv_name_0_0= 'Email' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1530:1: (lv_name_0_0= 'Email' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1530:1: (lv_name_0_0= 'Email' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1531:3: lv_name_0_0= 'Email'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_46_in_ruleEmail3482); 

                    newLeafNode(lv_name_0_0, grammarAccess.getEmailAccess().getNameEmailKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmailRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Email");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEmail3507); 

                	newLeafNode(otherlv_1, grammarAccess.getEmailAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleEmail3519); 

                	newLeafNode(otherlv_2, grammarAccess.getEmailAccess().getSubjectKeyword_2());
                
            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleEmail3531); 

                	newLeafNode(otherlv_3, grammarAccess.getEmailAccess().getColonKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1556:1: ( (lv_title_4_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1557:1: (lv_title_4_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1557:1: (lv_title_4_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1558:3: lv_title_4_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3552);
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

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleEmail3564); 

                	newLeafNode(otherlv_5, grammarAccess.getEmailAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleEmail3576); 

                	newLeafNode(otherlv_6, grammarAccess.getEmailAccess().getFromKeyword_6());
                
            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleEmail3588); 

                	newLeafNode(otherlv_7, grammarAccess.getEmailAccess().getColonKeyword_7());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1586:1: ( (lv_from_8_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1587:1: (lv_from_8_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1587:1: (lv_from_8_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1588:3: lv_from_8_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3609);
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

            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleEmail3621); 

                	newLeafNode(otherlv_9, grammarAccess.getEmailAccess().getCommaKeyword_9());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1608:1: ( (lv_value_10_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1609:1: (lv_value_10_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1609:1: (lv_value_10_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1610:3: lv_value_10_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3642);
            lv_value_10_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmailRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_10_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleEmail3654); 

                	newLeafNode(otherlv_11, grammarAccess.getEmailAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleEmail3666); 

                	newLeafNode(otherlv_12, grammarAccess.getEmailAccess().getToKeyword_12());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1634:1: ( (lv_to_13_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1635:1: (lv_to_13_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1635:1: (lv_to_13_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1636:3: lv_to_13_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleEmail3687);
            lv_to_13_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmailRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_13_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleEmail3699); 

                	newLeafNode(otherlv_14, grammarAccess.getEmailAccess().getSemicolonKeyword_14());
                

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


    // $ANTLR start "entryRuleTweet"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1664:1: entryRuleTweet returns [EObject current=null] : iv_ruleTweet= ruleTweet EOF ;
    public final EObject entryRuleTweet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTweet = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1665:2: (iv_ruleTweet= ruleTweet EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1666:2: iv_ruleTweet= ruleTweet EOF
            {
             newCompositeNode(grammarAccess.getTweetRule()); 
            pushFollow(FOLLOW_ruleTweet_in_entryRuleTweet3735);
            iv_ruleTweet=ruleTweet();

            state._fsp--;

             current =iv_ruleTweet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTweet3745); 

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
    // $ANTLR end "entryRuleTweet"


    // $ANTLR start "ruleTweet"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1673:1: ruleTweet returns [EObject current=null] : ( ( (lv_name_0_0= 'Tweet' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTweet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1676:28: ( ( ( (lv_name_0_0= 'Tweet' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1677:1: ( ( (lv_name_0_0= 'Tweet' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1677:1: ( ( (lv_name_0_0= 'Tweet' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1677:2: ( (lv_name_0_0= 'Tweet' ) ) ( (lv_value_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1677:2: ( (lv_name_0_0= 'Tweet' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1678:1: (lv_name_0_0= 'Tweet' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1678:1: (lv_name_0_0= 'Tweet' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1679:3: lv_name_0_0= 'Tweet'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_49_in_ruleTweet3788); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTweetAccess().getNameTweetKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTweetRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Tweet");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1692:2: ( (lv_value_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1693:1: (lv_value_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1693:1: (lv_value_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1694:3: lv_value_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getTweetAccess().getValueConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleTweet3822);
            lv_value_1_0=ruleConcatenationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTweetRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ConcatenationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleTweet3834); 

                	newLeafNode(otherlv_2, grammarAccess.getTweetAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleTweet"


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1722:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1723:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1724:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3870);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3880); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1731:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_event_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1734:28: ( ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1735:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1735:1: ( ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1735:2: ( (lv_name_0_0= 'GoTo' ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= ruleEVENT ) ) otherlv_4= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1735:2: ( (lv_name_0_0= 'GoTo' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1736:1: (lv_name_0_0= 'GoTo' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1736:1: (lv_name_0_0= 'GoTo' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1737:3: lv_name_0_0= 'GoTo'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_50_in_ruleTransition3923); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "GoTo");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1750:2: ( (otherlv_1= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1751:1: (otherlv_1= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1751:1: (otherlv_1= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1752:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3956); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleTransition3968); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getWhenKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1767:1: ( (lv_event_3_0= ruleEVENT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1768:1: (lv_event_3_0= ruleEVENT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1768:1: (lv_event_3_0= ruleEVENT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1769:3: lv_event_3_0= ruleEVENT
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEVENT_in_ruleTransition3989);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTransition4001); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1797:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1798:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1799:2: iv_ruleIfExp= ruleIfExp EOF
            {
             newCompositeNode(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp4037);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;

             current =iv_ruleIfExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp4047); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1806:1: ruleIfExp returns [EObject current=null] : ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_block_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1809:28: ( ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1810:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1810:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1810:2: ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1810:2: ( (lv_block_0_0= ruleCondBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1811:1: (lv_block_0_0= ruleCondBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1811:1: (lv_block_0_0= ruleCondBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1812:3: lv_block_0_0= ruleCondBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp4093);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1828:2: (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==52) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==53) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1828:4: otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleIfExp4106); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIfExpAccess().getElseKeyword_1_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1832:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1833:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1833:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1834:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp4127);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1850:4: (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1850:6: otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleIfExp4142); 

                        	newLeafNode(otherlv_3, grammarAccess.getIfExpAccess().getElseKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1854:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1855:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1855:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1856:3: lv_defaultBlock_4_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp4163);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1880:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1881:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1882:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
             newCompositeNode(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock4201);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;

             current =iv_ruleCondBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock4211); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1889:1: ruleCondBlock returns [EObject current=null] : ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1892:28: ( ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1893:1: ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1893:1: ( ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1893:2: ( (lv_name_0_0= 'if' ) ) ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1893:2: ( (lv_name_0_0= 'if' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1894:1: (lv_name_0_0= 'if' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1894:1: (lv_name_0_0= 'if' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1895:3: lv_name_0_0= 'if'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_53_in_ruleCondBlock4254); 

                    newLeafNode(lv_name_0_0, grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCondBlockRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "if");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1908:2: ( (lv_cond_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1909:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1909:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1910:3: lv_cond_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock4288);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1926:2: ( (lv_action_2_0= ruleBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1927:1: (lv_action_2_0= ruleBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1927:1: (lv_action_2_0= ruleBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1928:3: lv_action_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock4309);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1952:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1953:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1954:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock4345);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock4355); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1961:1: ruleBlock returns [EObject current=null] : ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_sta_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1964:28: ( ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1965:1: ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1965:1: ( () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1965:2: () ( (lv_name_1_0= '{' ) ) ( (lv_sta_2_0= ruleAbstractElement ) )* otherlv_3= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1965:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1966:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1971:2: ( (lv_name_1_0= '{' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1972:1: (lv_name_1_0= '{' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1972:1: (lv_name_1_0= '{' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1973:3: lv_name_1_0= '{'
            {
            lv_name_1_0=(Token)match(input,25,FOLLOW_25_in_ruleBlock4407); 

                    newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameLeftCurlyBracketKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "{");
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1986:2: ( (lv_sta_2_0= ruleAbstractElement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ML_COMMENT||LA14_0==27||(LA14_0>=29 && LA14_0<=31)||(LA14_0>=35 && LA14_0<=37)||(LA14_0>=39 && LA14_0<=40)||(LA14_0>=44 && LA14_0<=46)||(LA14_0>=49 && LA14_0<=50)||LA14_0==53||LA14_0==55||(LA14_0>=58 && LA14_0<=60)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1987:1: (lv_sta_2_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1987:1: (lv_sta_2_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1988:3: lv_sta_2_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStaAbstractElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleBlock4441);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleBlock4454); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2016:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2017:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2018:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4490);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression4500); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2025:1: ruleBoolExpression returns [EObject current=null] : (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalBoolExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2028:28: ( (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2029:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2029:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2030:5: this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4547);
            this_TerminalBoolExpression_0=ruleTerminalBoolExpression();

            state._fsp--;

             
                    current = this_TerminalBoolExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2038:1: ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LOGIC_WORD) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2038:2: () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2038:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2039:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2044:2: ( (lv_op_2_0= RULE_LOGIC_WORD ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2045:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2045:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2046:3: lv_op_2_0= RULE_LOGIC_WORD
                    {
                    lv_op_2_0=(Token)match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4573); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2062:2: ( (lv_right_3_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2063:1: (lv_right_3_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2063:1: (lv_right_3_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2064:3: lv_right_3_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolExpression4599);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2088:1: entryRuleTerminalBoolExpression returns [EObject current=null] : iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF ;
    public final EObject entryRuleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2089:2: (iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2090:2: iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4637);
            iv_ruleTerminalBoolExpression=ruleTerminalBoolExpression();

            state._fsp--;

             current =iv_ruleTerminalBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression4647); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2097:1: ruleTerminalBoolExpression returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2100:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2101:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2101:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2102:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4694);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2112:5: this_CompareExpression_1= ruleCompareExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4721);
                    this_CompareExpression_1=ruleCompareExpression();

                    state._fsp--;

                     
                            current = this_CompareExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2122:5: this_NegExpression_2= ruleNegExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4748);
                    this_NegExpression_2=ruleNegExpression();

                    state._fsp--;

                     
                            current = this_NegExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2132:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4775);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2142:5: this_Brackets_4= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4802);
                    this_Brackets_4=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2152:5: this_CALLSTATUS_5= ruleCALLSTATUS
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCALLSTATUSParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4829);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2168:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2169:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2170:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets4864);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets4874); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2177:1: ruleBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2180:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2181:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2181:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2181:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2181:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2182:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2182:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2183:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleBrackets4916); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2199:2: ( (lv_obj_1_0= ruleBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2200:1: (lv_obj_1_0= ruleBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2200:1: (lv_obj_1_0= ruleBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2201:3: lv_obj_1_0= ruleBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolExpression_in_ruleBrackets4942);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2217:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2218:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2218:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2219:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleBrackets4959); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2243:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2244:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2245:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
             newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression5000);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;

             current =iv_ruleCompareExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression5010); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2252:1: ruleCompareExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2255:28: ( ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2256:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2256:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2256:2: ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2256:2: ( (lv_left_0_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2257:1: (lv_left_0_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2257:1: (lv_left_0_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2258:3: lv_left_0_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression5056);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2274:2: ( (lv_op_1_0= RULE_COMPARE ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2275:1: (lv_op_1_0= RULE_COMPARE )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2275:1: (lv_op_1_0= RULE_COMPARE )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2276:3: lv_op_1_0= RULE_COMPARE
            {
            lv_op_1_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareExpression5073); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2292:2: ( (lv_right_2_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2293:1: (lv_right_2_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2293:1: (lv_right_2_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2294:3: lv_right_2_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression5099);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2318:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2319:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2320:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
             newCompositeNode(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression5135);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;

             current =iv_ruleNegExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression5145); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2327:1: ruleNegExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2330:28: ( ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2331:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2331:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2331:2: ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2331:2: ( (lv_op_0_0= RULE_NEGATION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2332:1: (lv_op_0_0= RULE_NEGATION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2332:1: (lv_op_0_0= RULE_NEGATION )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2333:3: lv_op_0_0= RULE_NEGATION
            {
            lv_op_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_ruleNegExpression5187); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2349:2: ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2350:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2350:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2351:3: lv_obj_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression5213);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2375:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2376:2: (iv_ruleMathExpression= ruleMathExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2377:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression5249);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression5259); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2384:1: ruleMathExpression returns [EObject current=null] : (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MathTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2387:28: ( (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2388:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2388:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2389:5: this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMathTerminal_in_ruleMathExpression5306);
            this_MathTerminal_0=ruleMathTerminal();

            state._fsp--;

             
                    current = this_MathTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2397:1: ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_MATH) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2397:2: () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2397:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2398:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2403:2: ( (lv_op_2_0= RULE_MATH ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2404:1: (lv_op_2_0= RULE_MATH )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2404:1: (lv_op_2_0= RULE_MATH )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2405:3: lv_op_2_0= RULE_MATH
                    {
                    lv_op_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathExpression5332); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2421:2: ( (lv_right_3_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2422:1: (lv_right_3_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2422:1: (lv_right_3_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2423:3: lv_right_3_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleMathExpression5358);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2447:1: entryRuleMathTerminal returns [EObject current=null] : iv_ruleMathTerminal= ruleMathTerminal EOF ;
    public final EObject entryRuleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2448:2: (iv_ruleMathTerminal= ruleMathTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2449:2: iv_ruleMathTerminal= ruleMathTerminal EOF
            {
             newCompositeNode(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal5396);
            iv_ruleMathTerminal=ruleMathTerminal();

            state._fsp--;

             current =iv_ruleMathTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal5406); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2456:1: ruleMathTerminal returns [EObject current=null] : (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject ruleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_MathBrackets_0 = null;

        EObject this_Literal_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2459:28: ( (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2460:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2460:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case 66:
            case 67:
            case 68:
            case 69:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2461:5: this_MathBrackets_0= ruleMathBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMathBrackets_in_ruleMathTerminal5453);
                    this_MathBrackets_0=ruleMathBrackets();

                    state._fsp--;

                     
                            current = this_MathBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2471:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleMathTerminal5480);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2481:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_ruleMathTerminal5507);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2497:1: entryRuleMathBrackets returns [EObject current=null] : iv_ruleMathBrackets= ruleMathBrackets EOF ;
    public final EObject entryRuleMathBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2498:2: (iv_ruleMathBrackets= ruleMathBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2499:2: iv_ruleMathBrackets= ruleMathBrackets EOF
            {
             newCompositeNode(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5542);
            iv_ruleMathBrackets=ruleMathBrackets();

            state._fsp--;

             current =iv_ruleMathBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets5552); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2506:1: ruleMathBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleMathBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2509:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2510:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2510:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2510:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2510:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2511:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2511:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2512:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5594); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2528:2: ( (lv_obj_1_0= ruleMathExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2529:1: (lv_obj_1_0= ruleMathExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2529:1: (lv_obj_1_0= ruleMathExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2530:3: lv_obj_1_0= ruleMathExpression
            {
             
            	        newCompositeNode(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathExpression_in_ruleMathBrackets5620);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2546:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2548:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5637); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2572:1: entryRuleConcatenationExpression returns [EObject current=null] : iv_ruleConcatenationExpression= ruleConcatenationExpression EOF ;
    public final EObject entryRuleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2573:2: (iv_ruleConcatenationExpression= ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2574:2: iv_ruleConcatenationExpression= ruleConcatenationExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5678);
            iv_ruleConcatenationExpression=ruleConcatenationExpression();

            state._fsp--;

             current =iv_ruleConcatenationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression5688); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2581:1: ruleConcatenationExpression returns [EObject current=null] : (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) ;
    public final EObject ruleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ConcatenationTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2584:28: ( (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2585:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2585:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2586:5: this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5735);
            this_ConcatenationTerminal_0=ruleConcatenationTerminal();

            state._fsp--;

             
                    current = this_ConcatenationTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2594:1: ( () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2594:2: () ( (lv_op_2_0= '+' ) ) ( (lv_right_3_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2594:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2595:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2600:2: ( (lv_op_2_0= '+' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2601:1: (lv_op_2_0= '+' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2601:1: (lv_op_2_0= '+' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2602:3: lv_op_2_0= '+'
                    {
                    lv_op_2_0=(Token)match(input,54,FOLLOW_54_in_ruleConcatenationExpression5762); 

                            newLeafNode(lv_op_2_0, grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConcatenationExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_2_0, "+");
                    	    

                    }


                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2615:2: ( (lv_right_3_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2616:1: (lv_right_3_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2616:1: (lv_right_3_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:3: lv_right_3_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5796);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2641:1: entryRuleConcatenationTerminal returns [EObject current=null] : iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF ;
    public final EObject entryRuleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2642:2: (iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2643:2: iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF
            {
             newCompositeNode(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5834);
            iv_ruleConcatenationTerminal=ruleConcatenationTerminal();

            state._fsp--;

             current =iv_ruleConcatenationTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal5844); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2650:1: ruleConcatenationTerminal returns [EObject current=null] : (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) ;
    public final EObject ruleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_ConcatenationBrackets_0 = null;

        EObject this_LiteralAbs_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2653:28: ( (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2654:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2654:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OBRACKET) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID||(LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||(LA20_0>=RULE_NULL && LA20_0<=RULE_DOUBLE)||(LA20_0>=66 && LA20_0<=69)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2655:5: this_ConcatenationBrackets_0= ruleConcatenationBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5891);
                    this_ConcatenationBrackets_0=ruleConcatenationBrackets();

                    state._fsp--;

                     
                            current = this_ConcatenationBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2665:5: this_LiteralAbs_1= ruleLiteralAbs
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5918);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2681:1: entryRuleConcatenationBrackets returns [EObject current=null] : iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF ;
    public final EObject entryRuleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2682:2: (iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2683:2: iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF
            {
             newCompositeNode(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5953);
            iv_ruleConcatenationBrackets=ruleConcatenationBrackets();

            state._fsp--;

             current =iv_ruleConcatenationBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets5963); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2690:1: ruleConcatenationBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2693:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2694:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2694:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2694:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2694:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2695:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2695:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2696:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets6005); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2712:2: ( (lv_obj_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2713:1: (lv_obj_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2713:1: (lv_obj_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2714:3: lv_obj_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets6031);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2730:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2731:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2731:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2732:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets6048); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2756:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2757:2: (iv_ruleStringVariable= ruleStringVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2758:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable6089);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable6099); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2765:1: ruleStringVariable returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2768:28: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2769:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleStringVariable6136); 

                	newLeafNode(otherlv_0, grammarAccess.getStringVariableAccess().getStringKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2773:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2774:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2774:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2775:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariable6153); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2791:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=56 && LA22_0<=57)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2791:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2791:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==56) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==57) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2791:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleStringVariable6172); 

                                	newLeafNode(otherlv_2, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2796:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleStringVariable6190); 

                                	newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2800:2: ( (lv_value_4_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2801:1: (lv_value_4_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2801:1: (lv_value_4_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2802:3: lv_value_4_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleStringVariable6212);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleStringVariable6226); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2830:1: entryRuleNumVariable returns [EObject current=null] : iv_ruleNumVariable= ruleNumVariable EOF ;
    public final EObject entryRuleNumVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2831:2: (iv_ruleNumVariable= ruleNumVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2832:2: iv_ruleNumVariable= ruleNumVariable EOF
            {
             newCompositeNode(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable6262);
            iv_ruleNumVariable=ruleNumVariable();

            state._fsp--;

             current =iv_ruleNumVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable6272); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2839:1: ruleNumVariable returns [EObject current=null] : (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2842:28: ( (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2843:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2843:1: (otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2843:3: otherlv_0= 'Num' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleNumVariable6309); 

                	newLeafNode(otherlv_0, grammarAccess.getNumVariableAccess().getNumKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2847:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2848:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2848:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2849:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumVariable6326); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2865:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=56 && LA24_0<=57)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2865:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2865:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==56) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==57) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2865:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleNumVariable6345); 

                                	newLeafNode(otherlv_2, grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2870:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleNumVariable6363); 

                                	newLeafNode(otherlv_3, grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2874:2: ( (lv_value_4_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2875:1: (lv_value_4_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2875:1: (lv_value_4_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2876:3: lv_value_4_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleNumVariable6385);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleNumVariable6399); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:1: entryRuleBoolVariable returns [EObject current=null] : iv_ruleBoolVariable= ruleBoolVariable EOF ;
    public final EObject entryRuleBoolVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:2: (iv_ruleBoolVariable= ruleBoolVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2906:2: iv_ruleBoolVariable= ruleBoolVariable EOF
            {
             newCompositeNode(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable6435);
            iv_ruleBoolVariable=ruleBoolVariable();

            state._fsp--;

             current =iv_ruleBoolVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable6445); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2913:1: ruleBoolVariable returns [EObject current=null] : (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2916:28: ( (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2917:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2917:1: (otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2917:3: otherlv_0= 'Bool' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleBoolVariable6482); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolVariableAccess().getBoolKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2922:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2922:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolVariable6499); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2939:2: ( (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=56 && LA26_0<=57)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2939:3: (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2939:3: (otherlv_2= '=' | otherlv_3= ' = ' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==56) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==57) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2939:5: otherlv_2= '='
                            {
                            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleBoolVariable6518); 

                                	newLeafNode(otherlv_2, grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2944:7: otherlv_3= ' = '
                            {
                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleBoolVariable6536); 

                                	newLeafNode(otherlv_3, grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2948:2: ( (lv_value_4_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2949:1: (lv_value_4_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2949:1: (lv_value_4_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2950:3: lv_value_4_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolVariable6558);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleBoolVariable6572); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2978:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2979:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2980:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant6608);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant6618); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2987:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2990:28: ( (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2991:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2991:1: (otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2991:3: otherlv_0= 'Const' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' | otherlv_3= ' = ' ) ( (lv_value_4_0= rulePrimitive ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleConstant6655); 

                	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2995:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2996:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2996:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2997:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant6672); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3013:2: (otherlv_2= '=' | otherlv_3= ' = ' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            else if ( (LA27_0==57) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3013:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleConstant6690); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3018:7: otherlv_3= ' = '
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleConstant6708); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3022:2: ( (lv_value_4_0= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3023:1: (lv_value_4_0= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3023:1: (lv_value_4_0= rulePrimitive )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3024:3: lv_value_4_0= rulePrimitive
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValuePrimitiveParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitive_in_ruleConstant6730);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleConstant6742); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3052:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3053:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3054:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive6778);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive6788); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3061:1: rulePrimitive returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_BoolLiteral_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3064:28: ( (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3065:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3065:1: (this_StringLiteral_0= ruleStringLiteral | this_BoolLiteral_1= ruleBoolLiteral | this_NumLiteral_2= ruleNumLiteral )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3066:5: this_StringLiteral_0= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getStringLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_rulePrimitive6835);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3076:5: this_BoolLiteral_1= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getBoolLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_rulePrimitive6862);
                    this_BoolLiteral_1=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3086:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimitiveAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_rulePrimitive6889);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3104:1: entryRuleLiteralAbs returns [EObject current=null] : iv_ruleLiteralAbs= ruleLiteralAbs EOF ;
    public final EObject entryRuleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAbs = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3105:2: (iv_ruleLiteralAbs= ruleLiteralAbs EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3106:2: iv_ruleLiteralAbs= ruleLiteralAbs EOF
            {
             newCompositeNode(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6926);
            iv_ruleLiteralAbs=ruleLiteralAbs();

            state._fsp--;

             current =iv_ruleLiteralAbs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs6936); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3113:1: ruleLiteralAbs returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) ;
    public final EObject ruleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Primitive_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3116:28: ( (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3117:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3117:1: (this_Literal_0= ruleLiteral | this_Primitive_1= rulePrimitive )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==RULE_NULL||(LA29_0>=66 && LA29_0<=69)) ) {
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3118:5: this_Literal_0= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleLiteralAbs6983);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3128:5: this_Primitive_1= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getPrimitiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleLiteralAbs7010);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3144:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3145:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3146:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral7045);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral7055); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3153:1: ruleLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nul_1_0=null;
        EObject this_SESSION_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3156:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3157:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3157:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | this_SESSION_2= ruleSESSION )
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
            case 66:
            case 67:
            case 68:
            case 69:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3157:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3157:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3158:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3158:1: (otherlv_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3159:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral7100); 

                    		newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3171:6: ( (lv_nul_1_0= RULE_NULL ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3171:6: ( (lv_nul_1_0= RULE_NULL ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3172:1: (lv_nul_1_0= RULE_NULL )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3172:1: (lv_nul_1_0= RULE_NULL )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3173:3: lv_nul_1_0= RULE_NULL
                    {
                    lv_nul_1_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral7123); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3191:5: this_SESSION_2= ruleSESSION
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSESSIONParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSESSION_in_ruleLiteral7156);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3207:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3208:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3209:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral7191);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral7201); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3216:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3219:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3220:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3220:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3220:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3220:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3226:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3227:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3227:1: (lv_value_1_0= RULE_BOOL )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3228:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral7252); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3252:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3253:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3254:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral7293);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;

             current =iv_ruleNumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral7303); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3261:1: ruleNumLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3264:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3265:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3265:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3265:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3265:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3266:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumLiteralAccess().getNumLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3271:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3272:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3272:1: (lv_value_1_0= ruleNumber )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3273:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumLiteral7358);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3297:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3298:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3299:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7394);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7404); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3306:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3309:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3310:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3310:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3310:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3310:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3311:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3316:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3317:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3317:1: (lv_value_1_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3318:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7455); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3342:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3343:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3344:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber7497);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber7508); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3351:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3354:28: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3355:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumber7548); 

                    		current.merge(this_DOUBLE_0);
                        
                     
                        newLeafNode(this_DOUBLE_0, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3363:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber7574); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3378:1: entryRuleEVENT returns [EObject current=null] : iv_ruleEVENT= ruleEVENT EOF ;
    public final EObject entryRuleEVENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVENT = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3379:2: (iv_ruleEVENT= ruleEVENT EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3380:2: iv_ruleEVENT= ruleEVENT EOF
            {
             newCompositeNode(grammarAccess.getEVENTRule()); 
            pushFollow(FOLLOW_ruleEVENT_in_entryRuleEVENT7619);
            iv_ruleEVENT=ruleEVENT();

            state._fsp--;

             current =iv_ruleEVENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEVENT7629); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3387:1: ruleEVENT returns [EObject current=null] : ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) ) ;
    public final EObject ruleEVENT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3390:28: ( ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:1: ( ( (lv_name_0_0= 'HANGUP' ) ) | ( (lv_name_1_0= 'COMPLETED' ) ) | ( (lv_name_2_0= 'ERROR' ) ) | ( (lv_name_3_0= 'TIMES' ) ) | ( (lv_name_4_0= 'TIMEOUT' ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt32=1;
                }
                break;
            case 62:
                {
                alt32=2;
                }
                break;
            case 63:
                {
                alt32=3;
                }
                break;
            case 64:
                {
                alt32=4;
                }
                break;
            case 65:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:2: ( (lv_name_0_0= 'HANGUP' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3391:2: ( (lv_name_0_0= 'HANGUP' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3392:1: (lv_name_0_0= 'HANGUP' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3392:1: (lv_name_0_0= 'HANGUP' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3393:3: lv_name_0_0= 'HANGUP'
                    {
                    lv_name_0_0=(Token)match(input,61,FOLLOW_61_in_ruleEVENT7672); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3407:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3407:6: ( (lv_name_1_0= 'COMPLETED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3408:1: (lv_name_1_0= 'COMPLETED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3408:1: (lv_name_1_0= 'COMPLETED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3409:3: lv_name_1_0= 'COMPLETED'
                    {
                    lv_name_1_0=(Token)match(input,62,FOLLOW_62_in_ruleEVENT7709); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3423:6: ( (lv_name_2_0= 'ERROR' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3423:6: ( (lv_name_2_0= 'ERROR' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3424:1: (lv_name_2_0= 'ERROR' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3424:1: (lv_name_2_0= 'ERROR' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3425:3: lv_name_2_0= 'ERROR'
                    {
                    lv_name_2_0=(Token)match(input,63,FOLLOW_63_in_ruleEVENT7746); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3439:6: ( (lv_name_3_0= 'TIMES' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3439:6: ( (lv_name_3_0= 'TIMES' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3440:1: (lv_name_3_0= 'TIMES' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3440:1: (lv_name_3_0= 'TIMES' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3441:3: lv_name_3_0= 'TIMES'
                    {
                    lv_name_3_0=(Token)match(input,64,FOLLOW_64_in_ruleEVENT7783); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3455:6: ( (lv_name_4_0= 'TIMEOUT' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3455:6: ( (lv_name_4_0= 'TIMEOUT' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3456:1: (lv_name_4_0= 'TIMEOUT' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3456:1: (lv_name_4_0= 'TIMEOUT' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3457:3: lv_name_4_0= 'TIMEOUT'
                    {
                    lv_name_4_0=(Token)match(input,65,FOLLOW_65_in_ruleEVENT7820); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3478:1: entryRuleSESSION returns [EObject current=null] : iv_ruleSESSION= ruleSESSION EOF ;
    public final EObject entryRuleSESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSESSION = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3479:2: (iv_ruleSESSION= ruleSESSION EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3480:2: iv_ruleSESSION= ruleSESSION EOF
            {
             newCompositeNode(grammarAccess.getSESSIONRule()); 
            pushFollow(FOLLOW_ruleSESSION_in_entryRuleSESSION7869);
            iv_ruleSESSION=ruleSESSION();

            state._fsp--;

             current =iv_ruleSESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSESSION7879); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3487:1: ruleSESSION returns [EObject current=null] : ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) ) ;
    public final EObject ruleSESSION() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3490:28: ( ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3491:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3491:1: ( ( (lv_name_0_0= 'CALLER' ) ) | ( (lv_name_1_0= 'LASTSTATE' ) ) | ( (lv_name_2_0= 'TIME' ) ) | ( (lv_name_3_0= 'CALLED' ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 67:
                {
                alt33=2;
                }
                break;
            case 68:
                {
                alt33=3;
                }
                break;
            case 69:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3491:2: ( (lv_name_0_0= 'CALLER' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3491:2: ( (lv_name_0_0= 'CALLER' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3492:1: (lv_name_0_0= 'CALLER' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3492:1: (lv_name_0_0= 'CALLER' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3493:3: lv_name_0_0= 'CALLER'
                    {
                    lv_name_0_0=(Token)match(input,66,FOLLOW_66_in_ruleSESSION7922); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3507:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3507:6: ( (lv_name_1_0= 'LASTSTATE' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3508:1: (lv_name_1_0= 'LASTSTATE' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3508:1: (lv_name_1_0= 'LASTSTATE' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3509:3: lv_name_1_0= 'LASTSTATE'
                    {
                    lv_name_1_0=(Token)match(input,67,FOLLOW_67_in_ruleSESSION7959); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3523:6: ( (lv_name_2_0= 'TIME' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3523:6: ( (lv_name_2_0= 'TIME' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3524:1: (lv_name_2_0= 'TIME' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3524:1: (lv_name_2_0= 'TIME' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3525:3: lv_name_2_0= 'TIME'
                    {
                    lv_name_2_0=(Token)match(input,68,FOLLOW_68_in_ruleSESSION7996); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3539:6: ( (lv_name_3_0= 'CALLED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3539:6: ( (lv_name_3_0= 'CALLED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3540:1: (lv_name_3_0= 'CALLED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3540:1: (lv_name_3_0= 'CALLED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3541:3: lv_name_3_0= 'CALLED'
                    {
                    lv_name_3_0=(Token)match(input,69,FOLLOW_69_in_ruleSESSION8033); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3562:1: entryRuleCALLSTATUS returns [EObject current=null] : iv_ruleCALLSTATUS= ruleCALLSTATUS EOF ;
    public final EObject entryRuleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCALLSTATUS = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3563:2: (iv_ruleCALLSTATUS= ruleCALLSTATUS EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3564:2: iv_ruleCALLSTATUS= ruleCALLSTATUS EOF
            {
             newCompositeNode(grammarAccess.getCALLSTATUSRule()); 
            pushFollow(FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS8082);
            iv_ruleCALLSTATUS=ruleCALLSTATUS();

            state._fsp--;

             current =iv_ruleCALLSTATUS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCALLSTATUS8092); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3571:1: ruleCALLSTATUS returns [EObject current=null] : ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) ;
    public final EObject ruleCALLSTATUS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3574:28: ( ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3575:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3575:1: ( ( (lv_name_0_0= 'RINGING' ) ) | ( (lv_name_1_0= 'IN-PROGRESS' ) ) | ( (lv_name_2_0= 'DISCONNECTED' ) ) | ( (lv_name_3_0= 'FAILED' ) ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt34=1;
                }
                break;
            case 71:
                {
                alt34=2;
                }
                break;
            case 72:
                {
                alt34=3;
                }
                break;
            case 73:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3575:2: ( (lv_name_0_0= 'RINGING' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3575:2: ( (lv_name_0_0= 'RINGING' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3576:1: (lv_name_0_0= 'RINGING' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3576:1: (lv_name_0_0= 'RINGING' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3577:3: lv_name_0_0= 'RINGING'
                    {
                    lv_name_0_0=(Token)match(input,70,FOLLOW_70_in_ruleCALLSTATUS8135); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3591:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3591:6: ( (lv_name_1_0= 'IN-PROGRESS' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3592:1: (lv_name_1_0= 'IN-PROGRESS' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3592:1: (lv_name_1_0= 'IN-PROGRESS' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3593:3: lv_name_1_0= 'IN-PROGRESS'
                    {
                    lv_name_1_0=(Token)match(input,71,FOLLOW_71_in_ruleCALLSTATUS8172); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3607:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3607:6: ( (lv_name_2_0= 'DISCONNECTED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3608:1: (lv_name_2_0= 'DISCONNECTED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3608:1: (lv_name_2_0= 'DISCONNECTED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3609:3: lv_name_2_0= 'DISCONNECTED'
                    {
                    lv_name_2_0=(Token)match(input,72,FOLLOW_72_in_ruleCALLSTATUS8209); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3623:6: ( (lv_name_3_0= 'FAILED' ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3623:6: ( (lv_name_3_0= 'FAILED' ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3624:1: (lv_name_3_0= 'FAILED' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3624:1: (lv_name_3_0= 'FAILED' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3625:3: lv_name_3_0= 'FAILED'
                    {
                    lv_name_3_0=(Token)match(input,73,FOLLOW_73_in_ruleCALLSTATUS8246); 

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
        "\1\111\7\34\6\uffff";
    static final String DFA16_acceptS =
        "\10\uffff\1\2\1\3\1\5\1\6\1\1\1\4";
    static final String DFA16_specialS =
        "\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\2\10\1\uffff\1\12\2\uffff\1\11\1\uffff\1\3\1\1"+
            "\1\10\61\uffff\1\4\1\5\1\6\1\7\4\13",
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
            return "2101:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets | this_CALLSTATUS_5= ruleCALLSTATUS )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDocument122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDocument139 = new BitSet(new long[]{0x1C80000003400022L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDocument165 = new BitSet(new long[]{0x1C80000003400022L});
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
    public static final BitSet FOLLOW_25_in_ruleState854 = new BitSet(new long[]{0x1CA671B8EC000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleState875 = new BitSet(new long[]{0x1CA671B8EC000020L});
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
    public static final BitSet FOLLOW_ruleEmail_in_ruleVoiceTag1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTweet_in_ruleVoiceTag1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCall1439 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleCall1473 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCall1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_entryRuleDial1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDial1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDial1574 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleDial1608 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDial1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_entryRulePlay1656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlay1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePlay1709 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rulePlay1743 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePlay1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRecord1844 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRecord1874 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRecord1891 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRecord1903 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleRecord1924 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_34_in_ruleRecord1937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecord1954 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRecord1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_entryRuleReject2009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReject2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleReject2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_entryRuleHangup2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHangup2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleHangup2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_entryRuleGetDigits2209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDigits2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGetDigits2262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGetDigits2292 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGetDigits2309 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleGetDigits2330 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleGetDigits2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDigits2359 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGetDigits2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_entryRuleAsk2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsk2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAsk2465 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleAsk2499 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAsk2511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsk2528 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAsk2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend2581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSend2634 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleSendBlock_in_ruleSend2668 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSend2680 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSend2701 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSend2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSendBlock2805 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSendBlock2826 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2847 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_26_in_ruleSendBlock2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNotPrimaryParam2943 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleNotPrimaryParam2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParam3052 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleParam3069 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleParam3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSay3179 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSay3213 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSay3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSms_in_entryRuleSms3261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSms3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSms3314 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3348 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSms3360 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSms3381 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSms3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmail_in_entryRuleEmail3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmail3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEmail3482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEmail3507 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleEmail3519 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEmail3531 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3552 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEmail3564 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleEmail3576 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEmail3588 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3609 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEmail3621 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3642 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEmail3654 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEmail3666 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleEmail3687 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEmail3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTweet_in_entryRuleTweet3735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTweet3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTweet3788 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleTweet3822 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTweet3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTransition3923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3956 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTransition3968 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleEVENT_in_ruleTransition3989 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp4037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp4093 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIfExp4106 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp4127 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIfExp4142 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock4201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCondBlock4254 = new BitSet(new long[]{0x000000000001D2D0L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock4288 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBlock4407 = new BitSet(new long[]{0x1CA671B8EC000020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleBlock4441 = new BitSet(new long[]{0x1CA671B8EC000020L});
    public static final BitSet FOLLOW_26_in_ruleBlock4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4547 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4573 = new BitSet(new long[]{0x000000000001D2D0L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolExpression4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_ruleTerminalBoolExpression4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets4864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleBrackets4916 = new BitSet(new long[]{0x000000000001D2D0L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBrackets4942 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleBrackets4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression5000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression5056 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareExpression5073 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression5135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_ruleNegExpression5187 = new BitSet(new long[]{0x000000000001D2D0L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_ruleMathExpression5306 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathExpression5332 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathExpression5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal5396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_ruleMathTerminal5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMathTerminal5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_ruleMathTerminal5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5594 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathBrackets5620 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5735 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleConcatenationExpression5762 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets6005 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets6031 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable6089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleStringVariable6136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariable6153 = new BitSet(new long[]{0x0300000010000000L});
    public static final BitSet FOLLOW_56_in_ruleStringVariable6172 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_57_in_ruleStringVariable6190 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleStringVariable6212 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStringVariable6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable6262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNumVariable6309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumVariable6326 = new BitSet(new long[]{0x0300000010000000L});
    public static final BitSet FOLLOW_56_in_ruleNumVariable6345 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_57_in_ruleNumVariable6363 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleNumVariable6385 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNumVariable6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable6435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBoolVariable6482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolVariable6499 = new BitSet(new long[]{0x0300000010000000L});
    public static final BitSet FOLLOW_56_in_ruleBoolVariable6518 = new BitSet(new long[]{0x000000000001D2D0L,0x00000000000003FCL});
    public static final BitSet FOLLOW_57_in_ruleBoolVariable6536 = new BitSet(new long[]{0x000000000001D2D0L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolVariable6558 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBoolVariable6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleConstant6655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant6672 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_56_in_ruleConstant6690 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_57_in_ruleConstant6708 = new BitSet(new long[]{0x000000000001C2D0L,0x000000000000003CL});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleConstant6730 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConstant6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive6778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimitive6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_rulePrimitive6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_rulePrimitive6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAbs6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleLiteralAbs7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_ruleLiteral7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral7191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral7293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumLiteral7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber7497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber7508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumber7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEVENT_in_entryRuleEVENT7619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEVENT7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEVENT7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEVENT7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEVENT7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleEVENT7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleEVENT7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSESSION_in_entryRuleSESSION7869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSESSION7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSESSION7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSESSION7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSESSION7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleSESSION8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCALLSTATUS_in_entryRuleCALLSTATUS8082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCALLSTATUS8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCALLSTATUS8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCALLSTATUS8172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCALLSTATUS8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCALLSTATUS8246 = new BitSet(new long[]{0x0000000000000002L});

}
