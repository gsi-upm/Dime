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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_EVENTENUM", "RULE_LOGIC_WORD", "RULE_OBRACKET", "RULE_CBRACKET", "RULE_COMPARE", "RULE_NEGATION", "RULE_MATH", "RULE_CONCATENATION", "RULE_NULL", "RULE_SESSION", "RULE_BOOL", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'withStates'", "'state'", "'times'", "'timeout'", "'{'", "'}'", "'dialTo'", "';'", "'play'", "'record'", "'seconds'", "'in'", "'->'", "'reject;'", "'hangUp;'", "'get'", "'digits'", "'ask'", "'choices'", "'send'", "'to'", "','", "'=>'", "'say'", "'goTo'", "'when'", "'else'", "'if'", "'varString'", "'='", "'varNum'", "'varBool'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_OBRACKET=10;
    public static final int T__23=23;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_BOOL=18;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_CONCATENATION=15;
    public static final int RULE_INT=6;
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
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_DOUBLE=19;
    public static final int RULE_NULL=16;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_LOGIC_WORD=9;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SESSION=17;
    public static final int RULE_EVENTENUM=8;
    public static final int RULE_WS=21;
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:76:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= 'withStates' ) )? ( (lv_elements_3_0= ruleAbstractElement ) )* ( (lv_sta_4_0= ruleState ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_states_2_0=null;
        EObject lv_elements_3_0 = null;

        EObject lv_sta_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:79:28: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= 'withStates' ) )? ( (lv_elements_3_0= ruleAbstractElement ) )* ( (lv_sta_4_0= ruleState ) )* ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:80:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= 'withStates' ) )? ( (lv_elements_3_0= ruleAbstractElement ) )* ( (lv_sta_4_0= ruleState ) )* )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:80:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= 'withStates' ) )? ( (lv_elements_3_0= ruleAbstractElement ) )* ( (lv_sta_4_0= ruleState ) )* )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:80:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_states_2_0= 'withStates' ) )? ( (lv_elements_3_0= ruleAbstractElement ) )* ( (lv_sta_4_0= ruleState ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDocument122); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:102:2: ( (lv_states_2_0= 'withStates' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:103:1: (lv_states_2_0= 'withStates' )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:103:1: (lv_states_2_0= 'withStates' )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:104:3: lv_states_2_0= 'withStates'
                    {
                    lv_states_2_0=(Token)match(input,24,FOLLOW_24_in_ruleDocument162); 

                            newLeafNode(lv_states_2_0, grammarAccess.getDocumentAccess().getStatesWithStatesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDocumentRule());
                    	        }
                           		setWithLastConsumed(current, "states", true, "withStates");
                    	    

                    }


                    }
                    break;

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:117:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_ML_COMMENT)||LA2_0==30||(LA2_0>=32 && LA2_0<=33)||(LA2_0>=37 && LA2_0<=39)||LA2_0==41||LA2_0==43||LA2_0==47||(LA2_0>=51 && LA2_0<=52)||(LA2_0>=54 && LA2_0<=55)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:118:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:118:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:119:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDocument197);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:135:3: ( (lv_sta_4_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25||(LA3_0>=27 && LA3_0<=28)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:136:1: (lv_sta_4_0= ruleState )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:136:1: (lv_sta_4_0= ruleState )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:137:3: lv_sta_4_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getStaStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleDocument219);
            	    lv_sta_4_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sta",
            	            		lv_sta_4_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:161:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:162:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:163:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement256);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement266); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:170:1: ruleAbstractElement returns [EObject current=null] : (this_Statement_0= ruleStatement | this_IfExp_1= ruleIfExp ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_IfExp_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:173:28: ( (this_Statement_0= ruleStatement | this_IfExp_1= ruleIfExp ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:174:1: (this_Statement_0= ruleStatement | this_IfExp_1= ruleIfExp )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:174:1: (this_Statement_0= ruleStatement | this_IfExp_1= ruleIfExp )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_ML_COMMENT)||LA4_0==30||(LA4_0>=32 && LA4_0<=33)||(LA4_0>=37 && LA4_0<=39)||LA4_0==41||LA4_0==43||LA4_0==47||LA4_0==52||(LA4_0>=54 && LA4_0<=55)) ) {
                alt4=1;
            }
            else if ( (LA4_0==51) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:175:5: this_Statement_0= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleAbstractElement313);
                    this_Statement_0=ruleStatement();

                    state._fsp--;

                     
                            current = this_Statement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:185:5: this_IfExp_1= ruleIfExp
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getIfExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIfExp_in_ruleAbstractElement340);
                    this_IfExp_1=ruleIfExp();

                    state._fsp--;

                     
                            current = this_IfExp_1; 
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


    // $ANTLR start "entryRuleStatement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:201:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:202:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:203:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement375);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement385); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:210:1: ruleStatement returns [EObject current=null] : (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_VoiceTag_3= ruleVoiceTag | this_Assigment_4= ruleAssigment | ( (lv_com_5_0= RULE_ML_COMMENT ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_com_5_0=null;
        EObject this_NumVariable_0 = null;

        EObject this_StringVariable_1 = null;

        EObject this_BoolVariable_2 = null;

        EObject this_VoiceTag_3 = null;

        EObject this_Assigment_4 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:213:28: ( (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_VoiceTag_3= ruleVoiceTag | this_Assigment_4= ruleAssigment | ( (lv_com_5_0= RULE_ML_COMMENT ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:214:1: (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_VoiceTag_3= ruleVoiceTag | this_Assigment_4= ruleAssigment | ( (lv_com_5_0= RULE_ML_COMMENT ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:214:1: (this_NumVariable_0= ruleNumVariable | this_StringVariable_1= ruleStringVariable | this_BoolVariable_2= ruleBoolVariable | this_VoiceTag_3= ruleVoiceTag | this_Assigment_4= ruleAssigment | ( (lv_com_5_0= RULE_ML_COMMENT ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt5=1;
                }
                break;
            case 52:
                {
                alt5=2;
                }
                break;
            case 55:
                {
                alt5=3;
                }
                break;
            case 30:
            case 32:
            case 33:
            case 37:
            case 38:
            case 39:
            case 41:
            case 43:
            case 47:
                {
                alt5=4;
                }
                break;
            case RULE_ID:
                {
                alt5=5;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:215:5: this_NumVariable_0= ruleNumVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getNumVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumVariable_in_ruleStatement432);
                    this_NumVariable_0=ruleNumVariable();

                    state._fsp--;

                     
                            current = this_NumVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:225:5: this_StringVariable_1= ruleStringVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getStringVariableParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringVariable_in_ruleStatement459);
                    this_StringVariable_1=ruleStringVariable();

                    state._fsp--;

                     
                            current = this_StringVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:235:5: this_BoolVariable_2= ruleBoolVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBoolVariableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoolVariable_in_ruleStatement486);
                    this_BoolVariable_2=ruleBoolVariable();

                    state._fsp--;

                     
                            current = this_BoolVariable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:245:5: this_VoiceTag_3= ruleVoiceTag
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getVoiceTagParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVoiceTag_in_ruleStatement513);
                    this_VoiceTag_3=ruleVoiceTag();

                    state._fsp--;

                     
                            current = this_VoiceTag_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:255:5: this_Assigment_4= ruleAssigment
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAssigmentParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAssigment_in_ruleStatement540);
                    this_Assigment_4=ruleAssigment();

                    state._fsp--;

                     
                            current = this_Assigment_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:264:6: ( (lv_com_5_0= RULE_ML_COMMENT ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:264:6: ( (lv_com_5_0= RULE_ML_COMMENT ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:265:1: (lv_com_5_0= RULE_ML_COMMENT )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:265:1: (lv_com_5_0= RULE_ML_COMMENT )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:266:3: lv_com_5_0= RULE_ML_COMMENT
                    {
                    lv_com_5_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleStatement562); 

                    			newLeafNode(lv_com_5_0, grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"com",
                            		lv_com_5_0, 
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


    // $ANTLR start "entryRuleStateAbstractElement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:290:1: entryRuleStateAbstractElement returns [EObject current=null] : iv_ruleStateAbstractElement= ruleStateAbstractElement EOF ;
    public final EObject entryRuleStateAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateAbstractElement = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:291:2: (iv_ruleStateAbstractElement= ruleStateAbstractElement EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:292:2: iv_ruleStateAbstractElement= ruleStateAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getStateAbstractElementRule()); 
            pushFollow(FOLLOW_ruleStateAbstractElement_in_entryRuleStateAbstractElement603);
            iv_ruleStateAbstractElement=ruleStateAbstractElement();

            state._fsp--;

             current =iv_ruleStateAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAbstractElement613); 

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
    // $ANTLR end "entryRuleStateAbstractElement"


    // $ANTLR start "ruleStateAbstractElement"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:299:1: ruleStateAbstractElement returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfStateExp_2= ruleIfStateExp ) ;
    public final EObject ruleStateAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Transition_1 = null;

        EObject this_IfStateExp_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:302:28: ( (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfStateExp_2= ruleIfStateExp ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:303:1: (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfStateExp_2= ruleIfStateExp )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:303:1: (this_Statement_0= ruleStatement | this_Transition_1= ruleTransition | this_IfStateExp_2= ruleIfStateExp )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_ML_COMMENT:
            case 30:
            case 32:
            case 33:
            case 37:
            case 38:
            case 39:
            case 41:
            case 43:
            case 47:
            case 52:
            case 54:
            case 55:
                {
                alt6=1;
                }
                break;
            case 48:
                {
                alt6=2;
                }
                break;
            case 51:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:304:5: this_Statement_0= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStateAbstractElementAccess().getStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleStateAbstractElement660);
                    this_Statement_0=ruleStatement();

                    state._fsp--;

                     
                            current = this_Statement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:314:5: this_Transition_1= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getStateAbstractElementAccess().getTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleStateAbstractElement687);
                    this_Transition_1=ruleTransition();

                    state._fsp--;

                     
                            current = this_Transition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:324:5: this_IfStateExp_2= ruleIfStateExp
                    {
                     
                            newCompositeNode(grammarAccess.getStateAbstractElementAccess().getIfStateExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIfStateExp_in_ruleStateAbstractElement714);
                    this_IfStateExp_2=ruleIfStateExp();

                    state._fsp--;

                     
                            current = this_IfStateExp_2; 
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
    // $ANTLR end "ruleStateAbstractElement"


    // $ANTLR start "entryRuleState"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:340:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:341:2: (iv_ruleState= ruleState EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:342:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState749);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState759); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:349:1: ruleState returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:352:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:353:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:353:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:355:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:355:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:356:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup());
            	
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:359:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?)
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:360:3: ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+ {...}?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:360:3: ( ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA10_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA10_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:362:4: ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:362:4: ({...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:363:5: {...}? => ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:363:100: ( ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:364:6: ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:367:6: ({...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:367:7: {...}? => (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleState", "true");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:367:16: (otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )? )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:367:18: otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleState841); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_0_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:371:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:372:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:372:1: (lv_name_2_0= RULE_ID )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:373:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState858); 

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

            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:389:2: (otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==26) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:389:4: otherlv_3= 'times' ( (lv_times_4_0= RULE_INT ) )
            	            {
            	            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleState876); 

            	                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getTimesKeyword_0_2_0());
            	                
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:393:1: ( (lv_times_4_0= RULE_INT ) )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:394:1: (lv_times_4_0= RULE_INT )
            	            {
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:394:1: (lv_times_4_0= RULE_INT )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:395:3: lv_times_4_0= RULE_INT
            	            {
            	            lv_times_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleState893); 

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
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:418:4: ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:418:4: ({...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:419:5: {...}? => ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:419:100: ( ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:420:6: ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:423:6: ({...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:423:7: {...}? => ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleState", "true");
            	    }
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:423:16: ( (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}' )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:423:17: (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )? otherlv_7= '{' ( (lv_stms_8_0= ruleStateAbstractElement ) )* otherlv_9= '}'
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:423:17: (otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==27) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:423:19: otherlv_5= 'timeout' ( (lv_timeout_6_0= RULE_INT ) )
            	            {
            	            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleState969); 

            	                	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getTimeoutKeyword_1_0_0());
            	                
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:427:1: ( (lv_timeout_6_0= RULE_INT ) )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:428:1: (lv_timeout_6_0= RULE_INT )
            	            {
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:428:1: (lv_timeout_6_0= RULE_INT )
            	            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:429:3: lv_timeout_6_0= RULE_INT
            	            {
            	            lv_timeout_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleState986); 

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

            	    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleState1005); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:449:1: ( (lv_stms_8_0= ruleStateAbstractElement ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_ML_COMMENT)||LA9_0==30||(LA9_0>=32 && LA9_0<=33)||(LA9_0>=37 && LA9_0<=39)||LA9_0==41||LA9_0==43||(LA9_0>=47 && LA9_0<=48)||(LA9_0>=51 && LA9_0<=52)||(LA9_0>=54 && LA9_0<=55)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:450:1: (lv_stms_8_0= ruleStateAbstractElement )
            	    	    {
            	    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:450:1: (lv_stms_8_0= ruleStateAbstractElement )
            	    	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:451:3: lv_stms_8_0= ruleStateAbstractElement
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getStateAccess().getStmsStateAbstractElementParserRuleCall_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleStateAbstractElement_in_ruleState1026);
            	    	    lv_stms_8_0=ruleStateAbstractElement();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"stms",
            	    	            		lv_stms_8_0, 
            	    	            		"StateAbstractElement");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleState1039); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:494:1: entryRuleVoiceTag returns [EObject current=null] : iv_ruleVoiceTag= ruleVoiceTag EOF ;
    public final EObject entryRuleVoiceTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoiceTag = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:495:2: (iv_ruleVoiceTag= ruleVoiceTag EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:496:2: iv_ruleVoiceTag= ruleVoiceTag EOF
            {
             newCompositeNode(grammarAccess.getVoiceTagRule()); 
            pushFollow(FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag1121);
            iv_ruleVoiceTag=ruleVoiceTag();

            state._fsp--;

             current =iv_ruleVoiceTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoiceTag1131); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:503:1: ruleVoiceTag returns [EObject current=null] : (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup ) ;
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


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:506:28: ( (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:507:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:507:1: (this_Say_0= ruleSay | this_Dial_1= ruleDial | this_Play_2= rulePlay | this_Record_3= ruleRecord | this_GetDigits_4= ruleGetDigits | this_Ask_5= ruleAsk | this_Send_6= ruleSend | this_Reject_7= ruleReject | this_Hangup_8= ruleHangup )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 39:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            case 43:
                {
                alt11=7;
                }
                break;
            case 37:
                {
                alt11=8;
                }
                break;
            case 38:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:508:5: this_Say_0= ruleSay
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSayParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSay_in_ruleVoiceTag1178);
                    this_Say_0=ruleSay();

                    state._fsp--;

                     
                            current = this_Say_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:518:5: this_Dial_1= ruleDial
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getDialParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDial_in_ruleVoiceTag1205);
                    this_Dial_1=ruleDial();

                    state._fsp--;

                     
                            current = this_Dial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:528:5: this_Play_2= rulePlay
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getPlayParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePlay_in_ruleVoiceTag1232);
                    this_Play_2=rulePlay();

                    state._fsp--;

                     
                            current = this_Play_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:538:5: this_Record_3= ruleRecord
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRecordParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRecord_in_ruleVoiceTag1259);
                    this_Record_3=ruleRecord();

                    state._fsp--;

                     
                            current = this_Record_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:548:5: this_GetDigits_4= ruleGetDigits
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getGetDigitsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleGetDigits_in_ruleVoiceTag1286);
                    this_GetDigits_4=ruleGetDigits();

                    state._fsp--;

                     
                            current = this_GetDigits_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:558:5: this_Ask_5= ruleAsk
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getAskParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAsk_in_ruleVoiceTag1313);
                    this_Ask_5=ruleAsk();

                    state._fsp--;

                     
                            current = this_Ask_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:568:5: this_Send_6= ruleSend
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getSendParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSend_in_ruleVoiceTag1340);
                    this_Send_6=ruleSend();

                    state._fsp--;

                     
                            current = this_Send_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:578:5: this_Reject_7= ruleReject
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getRejectParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleReject_in_ruleVoiceTag1367);
                    this_Reject_7=ruleReject();

                    state._fsp--;

                     
                            current = this_Reject_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:588:5: this_Hangup_8= ruleHangup
                    {
                     
                            newCompositeNode(grammarAccess.getVoiceTagAccess().getHangupParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHangup_in_ruleVoiceTag1394);
                    this_Hangup_8=ruleHangup();

                    state._fsp--;

                     
                            current = this_Hangup_8; 
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


    // $ANTLR start "entryRuleDial"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:604:1: entryRuleDial returns [EObject current=null] : iv_ruleDial= ruleDial EOF ;
    public final EObject entryRuleDial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDial = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:605:2: (iv_ruleDial= ruleDial EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:606:2: iv_ruleDial= ruleDial EOF
            {
             newCompositeNode(grammarAccess.getDialRule()); 
            pushFollow(FOLLOW_ruleDial_in_entryRuleDial1429);
            iv_ruleDial=ruleDial();

            state._fsp--;

             current =iv_ruleDial; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDial1439); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:613:1: ruleDial returns [EObject current=null] : (otherlv_0= 'dialTo' ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleDial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:616:28: ( (otherlv_0= 'dialTo' ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:617:1: (otherlv_0= 'dialTo' ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:617:1: (otherlv_0= 'dialTo' ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:617:3: otherlv_0= 'dialTo' ( (lv_to_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDial1476); 

                	newLeafNode(otherlv_0, grammarAccess.getDialAccess().getDialToKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:621:1: ( (lv_to_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:622:1: (lv_to_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:622:1: (lv_to_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:623:3: lv_to_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleDial1497);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleDial1509); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:651:1: entryRulePlay returns [EObject current=null] : iv_rulePlay= rulePlay EOF ;
    public final EObject entryRulePlay() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:652:2: (iv_rulePlay= rulePlay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:653:2: iv_rulePlay= rulePlay EOF
            {
             newCompositeNode(grammarAccess.getPlayRule()); 
            pushFollow(FOLLOW_rulePlay_in_entryRulePlay1545);
            iv_rulePlay=rulePlay();

            state._fsp--;

             current =iv_rulePlay; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlay1555); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:660:1: rulePlay returns [EObject current=null] : (otherlv_0= 'play' ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject rulePlay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_file_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:663:28: ( (otherlv_0= 'play' ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:664:1: (otherlv_0= 'play' ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:664:1: (otherlv_0= 'play' ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:664:3: otherlv_0= 'play' ( (lv_file_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePlay1592); 

                	newLeafNode(otherlv_0, grammarAccess.getPlayAccess().getPlayKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:668:1: ( (lv_file_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:669:1: (lv_file_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:669:1: (lv_file_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:670:3: lv_file_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_rulePlay1613);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePlay1625); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:698:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:699:2: (iv_ruleRecord= ruleRecord EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:700:2: iv_ruleRecord= ruleRecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord1661);
            iv_ruleRecord=ruleRecord();

            state._fsp--;

             current =iv_ruleRecord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord1671); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:707:1: ruleRecord returns [EObject current=null] : (otherlv_0= 'record' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_action_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:710:28: ( (otherlv_0= 'record' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) ) )? otherlv_7= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:711:1: (otherlv_0= 'record' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:711:1: (otherlv_0= 'record' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:711:3: otherlv_0= 'record' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'seconds' otherlv_3= 'in' ( (lv_action_4_0= ruleConcatenationExpression ) ) (otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleRecord1708); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordAccess().getRecordKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:715:1: ( (lv_time_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:716:1: (lv_time_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:716:1: (lv_time_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:717:3: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRecord1725); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleRecord1742); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordAccess().getSecondsKeyword_2());
                
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleRecord1754); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getInKeyword_3());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:741:1: ( (lv_action_4_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:742:1: (lv_action_4_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:742:1: (lv_action_4_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:743:3: lv_action_4_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getRecordAccess().getActionConcatenationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleRecord1775);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:759:2: (otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:759:4: otherlv_5= '->' ( (lv_name_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleRecord1788); 

                        	newLeafNode(otherlv_5, grammarAccess.getRecordAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:763:1: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:764:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:764:1: (lv_name_6_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:765:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecord1805); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecordRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleRecord1824); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:793:1: entryRuleReject returns [EObject current=null] : iv_ruleReject= ruleReject EOF ;
    public final EObject entryRuleReject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReject = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:794:2: (iv_ruleReject= ruleReject EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:795:2: iv_ruleReject= ruleReject EOF
            {
             newCompositeNode(grammarAccess.getRejectRule()); 
            pushFollow(FOLLOW_ruleReject_in_entryRuleReject1860);
            iv_ruleReject=ruleReject();

            state._fsp--;

             current =iv_ruleReject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReject1870); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:802:1: ruleReject returns [EObject current=null] : ( (lv_name_0_0= 'reject;' ) ) ;
    public final EObject ruleReject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:805:28: ( ( (lv_name_0_0= 'reject;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:806:1: ( (lv_name_0_0= 'reject;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:806:1: ( (lv_name_0_0= 'reject;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:807:1: (lv_name_0_0= 'reject;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:807:1: (lv_name_0_0= 'reject;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:808:3: lv_name_0_0= 'reject;'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_37_in_ruleReject1912); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRejectAccess().getNameRejectKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRejectRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "reject;");
            	    

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:829:1: entryRuleHangup returns [EObject current=null] : iv_ruleHangup= ruleHangup EOF ;
    public final EObject entryRuleHangup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHangup = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:830:2: (iv_ruleHangup= ruleHangup EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:831:2: iv_ruleHangup= ruleHangup EOF
            {
             newCompositeNode(grammarAccess.getHangupRule()); 
            pushFollow(FOLLOW_ruleHangup_in_entryRuleHangup1960);
            iv_ruleHangup=ruleHangup();

            state._fsp--;

             current =iv_ruleHangup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHangup1970); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:838:1: ruleHangup returns [EObject current=null] : ( (lv_name_0_0= 'hangUp;' ) ) ;
    public final EObject ruleHangup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:841:28: ( ( (lv_name_0_0= 'hangUp;' ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:842:1: ( (lv_name_0_0= 'hangUp;' ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:842:1: ( (lv_name_0_0= 'hangUp;' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:843:1: (lv_name_0_0= 'hangUp;' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:843:1: (lv_name_0_0= 'hangUp;' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:844:3: lv_name_0_0= 'hangUp;'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_38_in_ruleHangup2012); 

                    newLeafNode(lv_name_0_0, grammarAccess.getHangupAccess().getNameHangUpKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHangupRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "hangUp;");
            	    

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:865:1: entryRuleGetDigits returns [EObject current=null] : iv_ruleGetDigits= ruleGetDigits EOF ;
    public final EObject entryRuleGetDigits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetDigits = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:866:2: (iv_ruleGetDigits= ruleGetDigits EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:867:2: iv_ruleGetDigits= ruleGetDigits EOF
            {
             newCompositeNode(grammarAccess.getGetDigitsRule()); 
            pushFollow(FOLLOW_ruleGetDigits_in_entryRuleGetDigits2060);
            iv_ruleGetDigits=ruleGetDigits();

            state._fsp--;

             current =iv_ruleGetDigits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetDigits2070); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:874:1: ruleGetDigits returns [EObject current=null] : (otherlv_0= 'get' ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleGetDigits() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_numDigits_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_question_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:877:28: ( (otherlv_0= 'get' ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:878:1: (otherlv_0= 'get' ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:878:1: (otherlv_0= 'get' ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:878:3: otherlv_0= 'get' ( (lv_numDigits_1_0= RULE_INT ) ) otherlv_2= 'digits' ( (lv_question_3_0= ruleConcatenationExpression ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleGetDigits2107); 

                	newLeafNode(otherlv_0, grammarAccess.getGetDigitsAccess().getGetKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:882:1: ( (lv_numDigits_1_0= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:883:1: (lv_numDigits_1_0= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:883:1: (lv_numDigits_1_0= RULE_INT )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:884:3: lv_numDigits_1_0= RULE_INT
            {
            lv_numDigits_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGetDigits2124); 

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

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleGetDigits2141); 

                	newLeafNode(otherlv_2, grammarAccess.getGetDigitsAccess().getDigitsKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:904:1: ( (lv_question_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:905:1: (lv_question_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:905:1: (lv_question_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:906:3: lv_question_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleGetDigits2162);
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

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleGetDigits2174); 

                	newLeafNode(otherlv_4, grammarAccess.getGetDigitsAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:926:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:927:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:927:1: (lv_name_5_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:928:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetDigits2191); 

            			newLeafNode(lv_name_5_0, grammarAccess.getGetDigitsAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGetDigitsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleGetDigits2208); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:956:1: entryRuleAsk returns [EObject current=null] : iv_ruleAsk= ruleAsk EOF ;
    public final EObject entryRuleAsk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsk = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:957:2: (iv_ruleAsk= ruleAsk EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:958:2: iv_ruleAsk= ruleAsk EOF
            {
             newCompositeNode(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_ruleAsk_in_entryRuleAsk2244);
            iv_ruleAsk=ruleAsk();

            state._fsp--;

             current =iv_ruleAsk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsk2254); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:965:1: ruleAsk returns [EObject current=null] : (otherlv_0= 'ask' ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= 'choices' ( (lv_choices_3_0= RULE_STRING ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleAsk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_choices_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_question_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:968:28: ( (otherlv_0= 'ask' ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= 'choices' ( (lv_choices_3_0= RULE_STRING ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:969:1: (otherlv_0= 'ask' ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= 'choices' ( (lv_choices_3_0= RULE_STRING ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:969:1: (otherlv_0= 'ask' ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= 'choices' ( (lv_choices_3_0= RULE_STRING ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:969:3: otherlv_0= 'ask' ( (lv_question_1_0= ruleConcatenationExpression ) ) otherlv_2= 'choices' ( (lv_choices_3_0= RULE_STRING ) ) otherlv_4= '->' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleAsk2291); 

                	newLeafNode(otherlv_0, grammarAccess.getAskAccess().getAskKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:973:1: ( (lv_question_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:974:1: (lv_question_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:974:1: (lv_question_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:975:3: lv_question_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleAsk2312);
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

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleAsk2324); 

                	newLeafNode(otherlv_2, grammarAccess.getAskAccess().getChoicesKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:995:1: ( (lv_choices_3_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:996:1: (lv_choices_3_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:996:1: (lv_choices_3_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:997:3: lv_choices_3_0= RULE_STRING
            {
            lv_choices_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsk2341); 

            			newLeafNode(lv_choices_3_0, grammarAccess.getAskAccess().getChoicesSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"choices",
                    		lv_choices_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleAsk2358); 

                	newLeafNode(otherlv_4, grammarAccess.getAskAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1017:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1018:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1018:1: (lv_name_5_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1019:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsk2375); 

            			newLeafNode(lv_name_5_0, grammarAccess.getAskAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAsk2392); 

                	newLeafNode(otherlv_6, grammarAccess.getAskAccess().getSemicolonKeyword_6());
                

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1047:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1048:2: (iv_ruleSend= ruleSend EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1049:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend2428);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend2438); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1056:1: ruleSend returns [EObject current=null] : (otherlv_0= 'send' ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_url_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1059:28: ( (otherlv_0= 'send' ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1060:1: (otherlv_0= 'send' ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1060:1: (otherlv_0= 'send' ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1060:3: otherlv_0= 'send' ( (lv_params_1_0= ruleSendBlock ) ) otherlv_2= 'to' ( (lv_url_3_0= ruleConcatenationExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleSend2475); 

                	newLeafNode(otherlv_0, grammarAccess.getSendAccess().getSendKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1064:1: ( (lv_params_1_0= ruleSendBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1065:1: (lv_params_1_0= ruleSendBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1065:1: (lv_params_1_0= ruleSendBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1066:3: lv_params_1_0= ruleSendBlock
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSendBlock_in_ruleSend2496);
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

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleSend2508); 

                	newLeafNode(otherlv_2, grammarAccess.getSendAccess().getToKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1086:1: ( (lv_url_3_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1087:1: (lv_url_3_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1087:1: (lv_url_3_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1088:3: lv_url_3_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSend2529);
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

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleSend2541); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1116:1: entryRuleSendBlock returns [EObject current=null] : iv_ruleSendBlock= ruleSendBlock EOF ;
    public final EObject entryRuleSendBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1117:2: (iv_ruleSendBlock= ruleSendBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1118:2: iv_ruleSendBlock= ruleSendBlock EOF
            {
             newCompositeNode(grammarAccess.getSendBlockRule()); 
            pushFollow(FOLLOW_ruleSendBlock_in_entryRuleSendBlock2577);
            iv_ruleSendBlock=ruleSendBlock();

            state._fsp--;

             current =iv_ruleSendBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendBlock2587); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1125:1: ruleSendBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleSendBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        EObject lv_stms_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1128:28: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1129:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1129:1: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1129:2: () otherlv_1= '{' ( (lv_value_2_0= ruleParam ) ) ( (lv_stms_3_0= ruleNotPrimaryParam ) )* otherlv_4= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1129:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1130:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendBlockAccess().getSendBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleSendBlock2633); 

                	newLeafNode(otherlv_1, grammarAccess.getSendBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1139:1: ( (lv_value_2_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1140:1: (lv_value_2_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1140:1: (lv_value_2_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1141:3: lv_value_2_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getSendBlockAccess().getValueParamParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleSendBlock2654);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1157:2: ( (lv_stms_3_0= ruleNotPrimaryParam ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1158:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1158:1: (lv_stms_3_0= ruleNotPrimaryParam )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1159:3: lv_stms_3_0= ruleNotPrimaryParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSendBlockAccess().getStmsNotPrimaryParamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2675);
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
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleSendBlock2688); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1187:1: entryRuleNotPrimaryParam returns [EObject current=null] : iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF ;
    public final EObject entryRuleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotPrimaryParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1188:2: (iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1189:2: iv_ruleNotPrimaryParam= ruleNotPrimaryParam EOF
            {
             newCompositeNode(grammarAccess.getNotPrimaryParamRule()); 
            pushFollow(FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2724);
            iv_ruleNotPrimaryParam=ruleNotPrimaryParam();

            state._fsp--;

             current =iv_ruleNotPrimaryParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPrimaryParam2734); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1196:1: ruleNotPrimaryParam returns [EObject current=null] : (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) ;
    public final EObject ruleNotPrimaryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1199:28: ( (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1200:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1200:1: (otherlv_0= ',' ( (lv_value_1_0= ruleParam ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1200:3: otherlv_0= ',' ( (lv_value_1_0= ruleParam ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleNotPrimaryParam2771); 

                	newLeafNode(otherlv_0, grammarAccess.getNotPrimaryParamAccess().getCommaKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1204:1: ( (lv_value_1_0= ruleParam ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1205:1: (lv_value_1_0= ruleParam )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1205:1: (lv_value_1_0= ruleParam )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1206:3: lv_value_1_0= ruleParam
            {
             
            	        newCompositeNode(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParam_in_ruleNotPrimaryParam2792);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1230:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1231:2: (iv_ruleParam= ruleParam EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1232:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam2828);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam2838); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1239:1: ruleParam returns [EObject current=null] : ( ( (lv_paramName_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1242:28: ( ( ( (lv_paramName_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleConcatenationExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1243:1: ( ( (lv_paramName_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1243:1: ( ( (lv_paramName_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleConcatenationExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1243:2: ( (lv_paramName_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleConcatenationExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1243:2: ( (lv_paramName_0_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1244:1: (lv_paramName_0_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1244:1: (lv_paramName_0_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1245:3: lv_paramName_0_0= RULE_STRING
            {
            lv_paramName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParam2880); 

            			newLeafNode(lv_paramName_0_0, grammarAccess.getParamAccess().getParamNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"paramName",
                    		lv_paramName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleParam2897); 

                	newLeafNode(otherlv_1, grammarAccess.getParamAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1265:1: ( (lv_value_2_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1266:1: (lv_value_2_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1266:1: (lv_value_2_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1267:3: lv_value_2_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleParam2918);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1291:1: entryRuleSay returns [EObject current=null] : iv_ruleSay= ruleSay EOF ;
    public final EObject entryRuleSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSay = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1292:2: (iv_ruleSay= ruleSay EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1293:2: iv_ruleSay= ruleSay EOF
            {
             newCompositeNode(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_ruleSay_in_entryRuleSay2954);
            iv_ruleSay=ruleSay();

            state._fsp--;

             current =iv_ruleSay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSay2964); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1300:1: ruleSay returns [EObject current=null] : (otherlv_0= 'say' ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_that_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1303:28: ( (otherlv_0= 'say' ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1304:1: (otherlv_0= 'say' ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1304:1: (otherlv_0= 'say' ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1304:3: otherlv_0= 'say' ( (lv_that_1_0= ruleConcatenationExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleSay3001); 

                	newLeafNode(otherlv_0, grammarAccess.getSayAccess().getSayKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1308:1: ( (lv_that_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1309:1: (lv_that_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1309:1: (lv_that_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1310:3: lv_that_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleSay3022);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleSay3034); 

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


    // $ANTLR start "entryRuleTransition"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1338:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1339:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1340:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3070);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3080); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1347:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'goTo' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= RULE_EVENTENUM ) ) otherlv_4= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_event_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1350:28: ( (otherlv_0= 'goTo' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= RULE_EVENTENUM ) ) otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1351:1: (otherlv_0= 'goTo' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= RULE_EVENTENUM ) ) otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1351:1: (otherlv_0= 'goTo' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= RULE_EVENTENUM ) ) otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1351:3: otherlv_0= 'goTo' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' ( (lv_event_3_0= RULE_EVENTENUM ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTransition3117); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getGoToKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1355:1: ( (otherlv_1= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1356:1: (otherlv_1= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1356:1: (otherlv_1= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1357:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3137); 

            		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleTransition3149); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getWhenKeyword_2());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1372:1: ( (lv_event_3_0= RULE_EVENTENUM ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1373:1: (lv_event_3_0= RULE_EVENTENUM )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1373:1: (lv_event_3_0= RULE_EVENTENUM )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1374:3: lv_event_3_0= RULE_EVENTENUM
            {
            lv_event_3_0=(Token)match(input,RULE_EVENTENUM,FOLLOW_RULE_EVENTENUM_in_ruleTransition3166); 

            			newLeafNode(lv_event_3_0, grammarAccess.getTransitionAccess().getEventEventEnumTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"event",
                    		lv_event_3_0, 
                    		"EventEnum");
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleTransition3183); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1402:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1403:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1404:2: iv_ruleIfExp= ruleIfExp EOF
            {
             newCompositeNode(grammarAccess.getIfExpRule()); 
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp3219);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;

             current =iv_ruleIfExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp3229); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1411:1: ruleIfExp returns [EObject current=null] : ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_block_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1414:28: ( ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1415:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1415:1: ( ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1415:2: ( (lv_block_0_0= ruleCondBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1415:2: ( (lv_block_0_0= ruleCondBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1416:1: (lv_block_0_0= ruleCondBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1416:1: (lv_block_0_0= ruleCondBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1417:3: lv_block_0_0= ruleCondBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfExpAccess().getBlockCondBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3275);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1433:2: (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==51) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1433:4: otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleIfExp3288); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIfExpAccess().getElseKeyword_1_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1437:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1438:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1438:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1439:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp3309);
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
            	    break loop14;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1455:4: (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1455:6: otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleIfExp3324); 

                        	newLeafNode(otherlv_3, grammarAccess.getIfExpAccess().getElseKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1459:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1460:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1460:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1461:3: lv_defaultBlock_4_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp3345);
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


    // $ANTLR start "entryRuleBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1485:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1486:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1487:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock3383);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock3393); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1494:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_stms_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stms_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1497:28: ( ( () otherlv_1= '{' ( (lv_stms_2_0= ruleAbstractElement ) )* otherlv_3= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1498:1: ( () otherlv_1= '{' ( (lv_stms_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1498:1: ( () otherlv_1= '{' ( (lv_stms_2_0= ruleAbstractElement ) )* otherlv_3= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1498:2: () otherlv_1= '{' ( (lv_stms_2_0= ruleAbstractElement ) )* otherlv_3= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1498:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1499:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleBlock3439); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1508:1: ( (lv_stms_2_0= ruleAbstractElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_ML_COMMENT)||LA16_0==30||(LA16_0>=32 && LA16_0<=33)||(LA16_0>=37 && LA16_0<=39)||LA16_0==41||LA16_0==43||LA16_0==47||(LA16_0>=51 && LA16_0<=52)||(LA16_0>=54 && LA16_0<=55)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1509:1: (lv_stms_2_0= ruleAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1509:1: (lv_stms_2_0= ruleAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1510:3: lv_stms_2_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStmsAbstractElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleBlock3460);
            	    lv_stms_2_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stms",
            	            		lv_stms_2_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleBlock3473); 

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


    // $ANTLR start "entryRuleCondBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1538:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1539:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1540:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
             newCompositeNode(grammarAccess.getCondBlockRule()); 
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock3509);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;

             current =iv_ruleCondBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock3519); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1547:1: ruleCondBlock returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1550:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1551:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1551:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1551:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleCondBlock3556); 

                	newLeafNode(otherlv_0, grammarAccess.getCondBlockAccess().getIfKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1555:1: ( (lv_cond_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1556:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1556:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1557:3: lv_cond_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3577);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1573:2: ( (lv_action_2_0= ruleBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1574:1: (lv_action_2_0= ruleBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1574:1: (lv_action_2_0= ruleBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1575:3: lv_action_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock3598);
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


    // $ANTLR start "entryRuleIfStateExp"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1599:1: entryRuleIfStateExp returns [EObject current=null] : iv_ruleIfStateExp= ruleIfStateExp EOF ;
    public final EObject entryRuleIfStateExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStateExp = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1600:2: (iv_ruleIfStateExp= ruleIfStateExp EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1601:2: iv_ruleIfStateExp= ruleIfStateExp EOF
            {
             newCompositeNode(grammarAccess.getIfStateExpRule()); 
            pushFollow(FOLLOW_ruleIfStateExp_in_entryRuleIfStateExp3634);
            iv_ruleIfStateExp=ruleIfStateExp();

            state._fsp--;

             current =iv_ruleIfStateExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStateExp3644); 

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
    // $ANTLR end "entryRuleIfStateExp"


    // $ANTLR start "ruleIfStateExp"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1608:1: ruleIfStateExp returns [EObject current=null] : ( ( (lv_block_0_0= ruleCondStateBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) ) )? ) ;
    public final EObject ruleIfStateExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_block_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1611:28: ( ( ( (lv_block_0_0= ruleCondStateBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1612:1: ( ( (lv_block_0_0= ruleCondStateBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1612:1: ( ( (lv_block_0_0= ruleCondStateBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1612:2: ( (lv_block_0_0= ruleCondStateBlock ) ) (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) ) )* (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) ) )?
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1612:2: ( (lv_block_0_0= ruleCondStateBlock ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1613:1: (lv_block_0_0= ruleCondStateBlock )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1613:1: (lv_block_0_0= ruleCondStateBlock )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1614:3: lv_block_0_0= ruleCondStateBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStateExpAccess().getBlockCondStateBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCondStateBlock_in_ruleIfStateExp3690);
            lv_block_0_0=ruleCondStateBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStateExpRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_0_0, 
                    		"CondStateBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1630:2: (otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==50) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==51) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1630:4: otherlv_1= 'else' ( (lv_blocks_2_0= ruleCondStateBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleIfStateExp3703); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIfStateExpAccess().getElseKeyword_1_0());
            	        
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1634:1: ( (lv_blocks_2_0= ruleCondStateBlock ) )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1635:1: (lv_blocks_2_0= ruleCondStateBlock )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1635:1: (lv_blocks_2_0= ruleCondStateBlock )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1636:3: lv_blocks_2_0= ruleCondStateBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStateExpAccess().getBlocksCondStateBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondStateBlock_in_ruleIfStateExp3724);
            	    lv_blocks_2_0=ruleCondStateBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfStateExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_2_0, 
            	            		"CondStateBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1652:4: (otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1652:6: otherlv_3= 'else' ( (lv_defaultBlock_4_0= ruleBlockState ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleIfStateExp3739); 

                        	newLeafNode(otherlv_3, grammarAccess.getIfStateExpAccess().getElseKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1656:1: ( (lv_defaultBlock_4_0= ruleBlockState ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1657:1: (lv_defaultBlock_4_0= ruleBlockState )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1657:1: (lv_defaultBlock_4_0= ruleBlockState )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1658:3: lv_defaultBlock_4_0= ruleBlockState
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStateExpAccess().getDefaultBlockBlockStateParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockState_in_ruleIfStateExp3760);
                    lv_defaultBlock_4_0=ruleBlockState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStateExpRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultBlock",
                            		lv_defaultBlock_4_0, 
                            		"BlockState");
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
    // $ANTLR end "ruleIfStateExp"


    // $ANTLR start "entryRuleCondStateBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1682:1: entryRuleCondStateBlock returns [EObject current=null] : iv_ruleCondStateBlock= ruleCondStateBlock EOF ;
    public final EObject entryRuleCondStateBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondStateBlock = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1683:2: (iv_ruleCondStateBlock= ruleCondStateBlock EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1684:2: iv_ruleCondStateBlock= ruleCondStateBlock EOF
            {
             newCompositeNode(grammarAccess.getCondStateBlockRule()); 
            pushFollow(FOLLOW_ruleCondStateBlock_in_entryRuleCondStateBlock3798);
            iv_ruleCondStateBlock=ruleCondStateBlock();

            state._fsp--;

             current =iv_ruleCondStateBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondStateBlock3808); 

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
    // $ANTLR end "entryRuleCondStateBlock"


    // $ANTLR start "ruleCondStateBlock"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1691:1: ruleCondStateBlock returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlockState ) ) ) ;
    public final EObject ruleCondStateBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1694:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlockState ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1695:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlockState ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1695:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlockState ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1695:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleTerminalBoolExpression ) ) ( (lv_action_2_0= ruleBlockState ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleCondStateBlock3845); 

                	newLeafNode(otherlv_0, grammarAccess.getCondStateBlockAccess().getIfKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1699:1: ( (lv_cond_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1700:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1700:1: (lv_cond_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1701:3: lv_cond_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getCondStateBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleCondStateBlock3866);
            lv_cond_1_0=ruleTerminalBoolExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCondStateBlockRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_1_0, 
                    		"TerminalBoolExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1717:2: ( (lv_action_2_0= ruleBlockState ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1718:1: (lv_action_2_0= ruleBlockState )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1718:1: (lv_action_2_0= ruleBlockState )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1719:3: lv_action_2_0= ruleBlockState
            {
             
            	        newCompositeNode(grammarAccess.getCondStateBlockAccess().getActionBlockStateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlockState_in_ruleCondStateBlock3887);
            lv_action_2_0=ruleBlockState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCondStateBlockRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_2_0, 
                    		"BlockState");
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
    // $ANTLR end "ruleCondStateBlock"


    // $ANTLR start "entryRuleBlockState"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1743:1: entryRuleBlockState returns [EObject current=null] : iv_ruleBlockState= ruleBlockState EOF ;
    public final EObject entryRuleBlockState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockState = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1744:2: (iv_ruleBlockState= ruleBlockState EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1745:2: iv_ruleBlockState= ruleBlockState EOF
            {
             newCompositeNode(grammarAccess.getBlockStateRule()); 
            pushFollow(FOLLOW_ruleBlockState_in_entryRuleBlockState3923);
            iv_ruleBlockState=ruleBlockState();

            state._fsp--;

             current =iv_ruleBlockState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockState3933); 

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
    // $ANTLR end "entryRuleBlockState"


    // $ANTLR start "ruleBlockState"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1752:1: ruleBlockState returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_sta_2_0= ruleStateAbstractElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlockState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sta_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1755:28: ( ( () otherlv_1= '{' ( (lv_sta_2_0= ruleStateAbstractElement ) )* otherlv_3= '}' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1756:1: ( () otherlv_1= '{' ( (lv_sta_2_0= ruleStateAbstractElement ) )* otherlv_3= '}' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1756:1: ( () otherlv_1= '{' ( (lv_sta_2_0= ruleStateAbstractElement ) )* otherlv_3= '}' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1756:2: () otherlv_1= '{' ( (lv_sta_2_0= ruleStateAbstractElement ) )* otherlv_3= '}'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1756:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1757:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockStateAccess().getBlockStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleBlockState3979); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockStateAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1766:1: ( (lv_sta_2_0= ruleStateAbstractElement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_ML_COMMENT)||LA19_0==30||(LA19_0>=32 && LA19_0<=33)||(LA19_0>=37 && LA19_0<=39)||LA19_0==41||LA19_0==43||(LA19_0>=47 && LA19_0<=48)||(LA19_0>=51 && LA19_0<=52)||(LA19_0>=54 && LA19_0<=55)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1767:1: (lv_sta_2_0= ruleStateAbstractElement )
            	    {
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1767:1: (lv_sta_2_0= ruleStateAbstractElement )
            	    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1768:3: lv_sta_2_0= ruleStateAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockStateAccess().getStaStateAbstractElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateAbstractElement_in_ruleBlockState4000);
            	    lv_sta_2_0=ruleStateAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sta",
            	            		lv_sta_2_0, 
            	            		"StateAbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleBlockState4013); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockStateAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBlockState"


    // $ANTLR start "entryRuleBoolExpression"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1796:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1797:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1798:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4049);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpression4059); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1805:1: ruleBoolExpression returns [EObject current=null] : (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_TerminalBoolExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1808:28: ( (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1809:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1809:1: (this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1810:5: this_TerminalBoolExpression_0= ruleTerminalBoolExpression ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getBoolExpressionAccess().getTerminalBoolExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4106);
            this_TerminalBoolExpression_0=ruleTerminalBoolExpression();

            state._fsp--;

             
                    current = this_TerminalBoolExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1818:1: ( () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LOGIC_WORD) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1818:2: () ( (lv_op_2_0= RULE_LOGIC_WORD ) ) ( (lv_right_3_0= ruleBoolExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1818:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1819:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1824:2: ( (lv_op_2_0= RULE_LOGIC_WORD ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1825:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1825:1: (lv_op_2_0= RULE_LOGIC_WORD )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1826:3: lv_op_2_0= RULE_LOGIC_WORD
                    {
                    lv_op_2_0=(Token)match(input,RULE_LOGIC_WORD,FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4132); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1842:2: ( (lv_right_3_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1843:1: (lv_right_3_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1843:1: (lv_right_3_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1844:3: lv_right_3_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolExpression4158);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1868:1: entryRuleTerminalBoolExpression returns [EObject current=null] : iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF ;
    public final EObject entryRuleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalBoolExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1869:2: (iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1870:2: iv_ruleTerminalBoolExpression= ruleTerminalBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalBoolExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4196);
            iv_ruleTerminalBoolExpression=ruleTerminalBoolExpression();

            state._fsp--;

             current =iv_ruleTerminalBoolExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalBoolExpression4206); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1877:1: ruleTerminalBoolExpression returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets ) ;
    public final EObject ruleTerminalBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_CompareExpression_1 = null;

        EObject this_NegExpression_2 = null;

        EObject this_Literal_3 = null;

        EObject this_Brackets_4 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1880:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1881:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1881:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets )
            int alt21=5;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1882:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBoolLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4253);
                    this_BoolLiteral_0=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1892:5: this_CompareExpression_1= ruleCompareExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getCompareExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4280);
                    this_CompareExpression_1=ruleCompareExpression();

                    state._fsp--;

                     
                            current = this_CompareExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1902:5: this_NegExpression_2= ruleNegExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getNegExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4307);
                    this_NegExpression_2=ruleNegExpression();

                    state._fsp--;

                     
                            current = this_NegExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1912:5: this_Literal_3= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4334);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1922:5: this_Brackets_4= ruleBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalBoolExpressionAccess().getBracketsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4361);
                    this_Brackets_4=ruleBrackets();

                    state._fsp--;

                     
                            current = this_Brackets_4; 
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1938:1: entryRuleBrackets returns [EObject current=null] : iv_ruleBrackets= ruleBrackets EOF ;
    public final EObject entryRuleBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1939:2: (iv_ruleBrackets= ruleBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1940:2: iv_ruleBrackets= ruleBrackets EOF
            {
             newCompositeNode(grammarAccess.getBracketsRule()); 
            pushFollow(FOLLOW_ruleBrackets_in_entryRuleBrackets4396);
            iv_ruleBrackets=ruleBrackets();

            state._fsp--;

             current =iv_ruleBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrackets4406); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1947:1: ruleBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1950:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1951:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1951:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1951:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleBoolExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1951:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1952:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1952:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1953:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleBrackets4448); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1969:2: ( (lv_obj_1_0= ruleBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1970:1: (lv_obj_1_0= ruleBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1970:1: (lv_obj_1_0= ruleBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1971:3: lv_obj_1_0= ruleBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolExpression_in_ruleBrackets4474);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1987:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1988:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1988:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:1989:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleBrackets4491); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2013:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2014:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2015:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
             newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4532);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;

             current =iv_ruleCompareExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression4542); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2022:1: ruleCompareExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2025:28: ( ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2026:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2026:1: ( ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2026:2: ( (lv_left_0_0= ruleLiteralAbs ) ) ( (lv_op_1_0= RULE_COMPARE ) ) ( (lv_right_2_0= ruleLiteralAbs ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2026:2: ( (lv_left_0_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2027:1: (lv_left_0_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2027:1: (lv_left_0_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2028:3: lv_left_0_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4588);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2044:2: ( (lv_op_1_0= RULE_COMPARE ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2045:1: (lv_op_1_0= RULE_COMPARE )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2045:1: (lv_op_1_0= RULE_COMPARE )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2046:3: lv_op_1_0= RULE_COMPARE
            {
            lv_op_1_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareExpression4605); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2062:2: ( (lv_right_2_0= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2063:1: (lv_right_2_0= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2063:1: (lv_right_2_0= ruleLiteralAbs )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2064:3: lv_right_2_0= ruleLiteralAbs
            {
             
            	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4631);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2088:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2089:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2090:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
             newCompositeNode(grammarAccess.getNegExpressionRule()); 
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression4667);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;

             current =iv_ruleNegExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression4677); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2097:1: ruleNegExpression returns [EObject current=null] : ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2100:28: ( ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2101:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2101:1: ( ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2101:2: ( (lv_op_0_0= RULE_NEGATION ) ) ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2101:2: ( (lv_op_0_0= RULE_NEGATION ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2102:1: (lv_op_0_0= RULE_NEGATION )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2102:1: (lv_op_0_0= RULE_NEGATION )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2103:3: lv_op_0_0= RULE_NEGATION
            {
            lv_op_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_RULE_NEGATION_in_ruleNegExpression4719); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2119:2: ( (lv_obj_1_0= ruleTerminalBoolExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2120:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2120:1: (lv_obj_1_0= ruleTerminalBoolExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2121:3: lv_obj_1_0= ruleTerminalBoolExpression
            {
             
            	        newCompositeNode(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4745);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2145:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2146:2: (iv_ruleMathExpression= ruleMathExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2147:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
             newCompositeNode(grammarAccess.getMathExpressionRule()); 
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression4781);
            iv_ruleMathExpression=ruleMathExpression();

            state._fsp--;

             current =iv_ruleMathExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression4791); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2154:1: ruleMathExpression returns [EObject current=null] : (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_MathTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2157:28: ( (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2158:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2158:1: (this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2159:5: this_MathTerminal_0= ruleMathTerminal ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMathExpressionAccess().getMathTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMathTerminal_in_ruleMathExpression4838);
            this_MathTerminal_0=ruleMathTerminal();

            state._fsp--;

             
                    current = this_MathTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2167:1: ( () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_MATH) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2167:2: () ( (lv_op_2_0= RULE_MATH ) ) ( (lv_right_3_0= ruleMathExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2167:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2168:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2173:2: ( (lv_op_2_0= RULE_MATH ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2174:1: (lv_op_2_0= RULE_MATH )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2174:1: (lv_op_2_0= RULE_MATH )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2175:3: lv_op_2_0= RULE_MATH
                    {
                    lv_op_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathExpression4864); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2191:2: ( (lv_right_3_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2192:1: (lv_right_3_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2192:1: (lv_right_3_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2193:3: lv_right_3_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleMathExpression4890);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2217:1: entryRuleMathTerminal returns [EObject current=null] : iv_ruleMathTerminal= ruleMathTerminal EOF ;
    public final EObject entryRuleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2218:2: (iv_ruleMathTerminal= ruleMathTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2219:2: iv_ruleMathTerminal= ruleMathTerminal EOF
            {
             newCompositeNode(grammarAccess.getMathTerminalRule()); 
            pushFollow(FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4928);
            iv_ruleMathTerminal=ruleMathTerminal();

            state._fsp--;

             current =iv_ruleMathTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathTerminal4938); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2226:1: ruleMathTerminal returns [EObject current=null] : (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) ;
    public final EObject ruleMathTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_MathBrackets_0 = null;

        EObject this_Literal_1 = null;

        EObject this_NumLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2229:28: ( (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2230:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2230:1: (this_MathBrackets_0= ruleMathBrackets | this_Literal_1= ruleLiteral | this_NumLiteral_2= ruleNumLiteral )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_OBRACKET:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
            case RULE_NULL:
            case RULE_SESSION:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2231:5: this_MathBrackets_0= ruleMathBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getMathBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMathBrackets_in_ruleMathTerminal4985);
                    this_MathBrackets_0=ruleMathBrackets();

                    state._fsp--;

                     
                            current = this_MathBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2241:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleMathTerminal5012);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2251:5: this_NumLiteral_2= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getMathTerminalAccess().getNumLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_ruleMathTerminal5039);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2267:1: entryRuleMathBrackets returns [EObject current=null] : iv_ruleMathBrackets= ruleMathBrackets EOF ;
    public final EObject entryRuleMathBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2268:2: (iv_ruleMathBrackets= ruleMathBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2269:2: iv_ruleMathBrackets= ruleMathBrackets EOF
            {
             newCompositeNode(grammarAccess.getMathBracketsRule()); 
            pushFollow(FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5074);
            iv_ruleMathBrackets=ruleMathBrackets();

            state._fsp--;

             current =iv_ruleMathBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathBrackets5084); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2276:1: ruleMathBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleMathBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2279:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2280:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2280:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2280:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleMathExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2280:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2281:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2281:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2282:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5126); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2298:2: ( (lv_obj_1_0= ruleMathExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2299:1: (lv_obj_1_0= ruleMathExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2299:1: (lv_obj_1_0= ruleMathExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2300:3: lv_obj_1_0= ruleMathExpression
            {
             
            	        newCompositeNode(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMathExpression_in_ruleMathBrackets5152);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2316:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2317:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2317:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2318:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5169); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2342:1: entryRuleConcatenationExpression returns [EObject current=null] : iv_ruleConcatenationExpression= ruleConcatenationExpression EOF ;
    public final EObject entryRuleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationExpression = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2343:2: (iv_ruleConcatenationExpression= ruleConcatenationExpression EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2344:2: iv_ruleConcatenationExpression= ruleConcatenationExpression EOF
            {
             newCompositeNode(grammarAccess.getConcatenationExpressionRule()); 
            pushFollow(FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5210);
            iv_ruleConcatenationExpression=ruleConcatenationExpression();

            state._fsp--;

             current =iv_ruleConcatenationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationExpression5220); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2351:1: ruleConcatenationExpression returns [EObject current=null] : (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) ;
    public final EObject ruleConcatenationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ConcatenationTerminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2354:28: ( (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2355:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2355:1: (this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )? )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2356:5: this_ConcatenationTerminal_0= ruleConcatenationTerminal ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getConcatenationTerminalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5267);
            this_ConcatenationTerminal_0=ruleConcatenationTerminal();

            state._fsp--;

             
                    current = this_ConcatenationTerminal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2364:1: ( () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_CONCATENATION) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2364:2: () ( (lv_op_2_0= RULE_CONCATENATION ) ) ( (lv_right_3_0= ruleConcatenationExpression ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2364:2: ()
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2365:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2370:2: ( (lv_op_2_0= RULE_CONCATENATION ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2371:1: (lv_op_2_0= RULE_CONCATENATION )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2371:1: (lv_op_2_0= RULE_CONCATENATION )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2372:3: lv_op_2_0= RULE_CONCATENATION
                    {
                    lv_op_2_0=(Token)match(input,RULE_CONCATENATION,FOLLOW_RULE_CONCATENATION_in_ruleConcatenationExpression5293); 

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

                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2388:2: ( (lv_right_3_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2389:1: (lv_right_3_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2389:1: (lv_right_3_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2390:3: lv_right_3_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5319);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2414:1: entryRuleConcatenationTerminal returns [EObject current=null] : iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF ;
    public final EObject entryRuleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationTerminal = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2415:2: (iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2416:2: iv_ruleConcatenationTerminal= ruleConcatenationTerminal EOF
            {
             newCompositeNode(grammarAccess.getConcatenationTerminalRule()); 
            pushFollow(FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5357);
            iv_ruleConcatenationTerminal=ruleConcatenationTerminal();

            state._fsp--;

             current =iv_ruleConcatenationTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationTerminal5367); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2423:1: ruleConcatenationTerminal returns [EObject current=null] : (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) ;
    public final EObject ruleConcatenationTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_ConcatenationBrackets_0 = null;

        EObject this_LiteralAbs_1 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2426:28: ( (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2427:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2427:1: (this_ConcatenationBrackets_0= ruleConcatenationBrackets | this_LiteralAbs_1= ruleLiteralAbs )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_OBRACKET) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||(LA25_0>=RULE_INT && LA25_0<=RULE_STRING)||(LA25_0>=RULE_NULL && LA25_0<=RULE_DOUBLE)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2428:5: this_ConcatenationBrackets_0= ruleConcatenationBrackets
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getConcatenationBracketsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5414);
                    this_ConcatenationBrackets_0=ruleConcatenationBrackets();

                    state._fsp--;

                     
                            current = this_ConcatenationBrackets_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2438:5: this_LiteralAbs_1= ruleLiteralAbs
                    {
                     
                            newCompositeNode(grammarAccess.getConcatenationTerminalAccess().getLiteralAbsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5441);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2454:1: entryRuleConcatenationBrackets returns [EObject current=null] : iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF ;
    public final EObject entryRuleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatenationBrackets = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2455:2: (iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2456:2: iv_ruleConcatenationBrackets= ruleConcatenationBrackets EOF
            {
             newCompositeNode(grammarAccess.getConcatenationBracketsRule()); 
            pushFollow(FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5476);
            iv_ruleConcatenationBrackets=ruleConcatenationBrackets();

            state._fsp--;

             current =iv_ruleConcatenationBrackets; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatenationBrackets5486); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2463:1: ruleConcatenationBrackets returns [EObject current=null] : ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) ;
    public final EObject ruleConcatenationBrackets() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_close_2_0=null;
        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2466:28: ( ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2467:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2467:1: ( ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2467:2: ( (lv_open_0_0= RULE_OBRACKET ) ) ( (lv_obj_1_0= ruleConcatenationExpression ) ) ( (lv_close_2_0= RULE_CBRACKET ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2467:2: ( (lv_open_0_0= RULE_OBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2468:1: (lv_open_0_0= RULE_OBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2468:1: (lv_open_0_0= RULE_OBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2469:3: lv_open_0_0= RULE_OBRACKET
            {
            lv_open_0_0=(Token)match(input,RULE_OBRACKET,FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5528); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2485:2: ( (lv_obj_1_0= ruleConcatenationExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2486:1: (lv_obj_1_0= ruleConcatenationExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2486:1: (lv_obj_1_0= ruleConcatenationExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2487:3: lv_obj_1_0= ruleConcatenationExpression
            {
             
            	        newCompositeNode(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5554);
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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2503:2: ( (lv_close_2_0= RULE_CBRACKET ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2504:1: (lv_close_2_0= RULE_CBRACKET )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2504:1: (lv_close_2_0= RULE_CBRACKET )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2505:3: lv_close_2_0= RULE_CBRACKET
            {
            lv_close_2_0=(Token)match(input,RULE_CBRACKET,FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5571); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2529:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2530:2: (iv_ruleStringVariable= ruleStringVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2531:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_ruleStringVariable_in_entryRuleStringVariable5612);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariable5622); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2538:1: ruleStringVariable returns [EObject current=null] : (otherlv_0= 'varString' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2541:28: ( (otherlv_0= 'varString' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) ) )? otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2542:1: (otherlv_0= 'varString' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) ) )? otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2542:1: (otherlv_0= 'varString' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) ) )? otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2542:3: otherlv_0= 'varString' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleStringVariable5659); 

                	newLeafNode(otherlv_0, grammarAccess.getStringVariableAccess().getVarStringKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2546:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2547:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2548:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariable5676); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2564:2: (otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2564:4: otherlv_2= '=' ( (lv_value_3_0= ruleConcatenationExpression ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleStringVariable5694); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2568:1: ( (lv_value_3_0= ruleConcatenationExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2569:1: (lv_value_3_0= ruleConcatenationExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2569:1: (lv_value_3_0= ruleConcatenationExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2570:3: lv_value_3_0= ruleConcatenationExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringVariableAccess().getValueConcatenationExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5715);
                    lv_value_3_0=ruleConcatenationExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"ConcatenationExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleStringVariable5729); 

                	newLeafNode(otherlv_4, grammarAccess.getStringVariableAccess().getSemicolonKeyword_3());
                

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2598:1: entryRuleNumVariable returns [EObject current=null] : iv_ruleNumVariable= ruleNumVariable EOF ;
    public final EObject entryRuleNumVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2599:2: (iv_ruleNumVariable= ruleNumVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2600:2: iv_ruleNumVariable= ruleNumVariable EOF
            {
             newCompositeNode(grammarAccess.getNumVariableRule()); 
            pushFollow(FOLLOW_ruleNumVariable_in_entryRuleNumVariable5765);
            iv_ruleNumVariable=ruleNumVariable();

            state._fsp--;

             current =iv_ruleNumVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumVariable5775); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2607:1: ruleNumVariable returns [EObject current=null] : (otherlv_0= 'varNum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleNumVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2610:28: ( (otherlv_0= 'varNum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) ) )? otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2611:1: (otherlv_0= 'varNum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) ) )? otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2611:1: (otherlv_0= 'varNum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) ) )? otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2611:3: otherlv_0= 'varNum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleNumVariable5812); 

                	newLeafNode(otherlv_0, grammarAccess.getNumVariableAccess().getVarNumKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2615:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2616:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2616:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2617:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumVariable5829); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2633:2: (otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2633:4: otherlv_2= '=' ( (lv_value_3_0= ruleMathExpression ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleNumVariable5847); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2637:1: ( (lv_value_3_0= ruleMathExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2638:1: (lv_value_3_0= ruleMathExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2638:1: (lv_value_3_0= ruleMathExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2639:3: lv_value_3_0= ruleMathExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumVariableAccess().getValueMathExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleNumVariable5868);
                    lv_value_3_0=ruleMathExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"MathExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleNumVariable5882); 

                	newLeafNode(otherlv_4, grammarAccess.getNumVariableAccess().getSemicolonKeyword_3());
                

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2667:1: entryRuleBoolVariable returns [EObject current=null] : iv_ruleBoolVariable= ruleBoolVariable EOF ;
    public final EObject entryRuleBoolVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVariable = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2668:2: (iv_ruleBoolVariable= ruleBoolVariable EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2669:2: iv_ruleBoolVariable= ruleBoolVariable EOF
            {
             newCompositeNode(grammarAccess.getBoolVariableRule()); 
            pushFollow(FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5918);
            iv_ruleBoolVariable=ruleBoolVariable();

            state._fsp--;

             current =iv_ruleBoolVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVariable5928); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2676:1: ruleBoolVariable returns [EObject current=null] : (otherlv_0= 'varBool' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleBoolVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2679:28: ( (otherlv_0= 'varBool' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) ) )? otherlv_4= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2680:1: (otherlv_0= 'varBool' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) ) )? otherlv_4= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2680:1: (otherlv_0= 'varBool' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) ) )? otherlv_4= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2680:3: otherlv_0= 'varBool' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleBoolVariable5965); 

                	newLeafNode(otherlv_0, grammarAccess.getBoolVariableAccess().getVarBoolKeyword_0());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2684:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2685:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2685:1: (lv_name_1_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2686:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolVariable5982); 

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

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2702:2: (otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==53) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2702:4: otherlv_2= '=' ( (lv_value_3_0= ruleBoolExpression ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleBoolVariable6000); 

                        	newLeafNode(otherlv_2, grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2706:1: ( (lv_value_3_0= ruleBoolExpression ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2707:1: (lv_value_3_0= ruleBoolExpression )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2707:1: (lv_value_3_0= ruleBoolExpression )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2708:3: lv_value_3_0= ruleBoolExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoolVariableAccess().getValueBoolExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpression_in_ruleBoolVariable6021);
                    lv_value_3_0=ruleBoolExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoolVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"BoolExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleBoolVariable6035); 

                	newLeafNode(otherlv_4, grammarAccess.getBoolVariableAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleAssigment"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2736:1: entryRuleAssigment returns [EObject current=null] : iv_ruleAssigment= ruleAssigment EOF ;
    public final EObject entryRuleAssigment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssigment = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2737:2: (iv_ruleAssigment= ruleAssigment EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2738:2: iv_ruleAssigment= ruleAssigment EOF
            {
             newCompositeNode(grammarAccess.getAssigmentRule()); 
            pushFollow(FOLLOW_ruleAssigment_in_entryRuleAssigment6071);
            iv_ruleAssigment=ruleAssigment();

            state._fsp--;

             current =iv_ruleAssigment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigment6081); 

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
    // $ANTLR end "entryRuleAssigment"


    // $ANTLR start "ruleAssigment"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2745:1: ruleAssigment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_right_2_0= ruleMathExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssigment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2748:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_right_2_0= ruleMathExpression ) ) otherlv_3= ';' ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2749:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_right_2_0= ruleMathExpression ) ) otherlv_3= ';' )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2749:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_right_2_0= ruleMathExpression ) ) otherlv_3= ';' )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2749:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_right_2_0= ruleMathExpression ) ) otherlv_3= ';'
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2749:2: ( (otherlv_0= RULE_ID ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2750:1: (otherlv_0= RULE_ID )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2750:1: (otherlv_0= RULE_ID )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2751:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssigmentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssigment6126); 

            		newLeafNode(otherlv_0, grammarAccess.getAssigmentAccess().getVaVarsCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleAssigment6138); 

                	newLeafNode(otherlv_1, grammarAccess.getAssigmentAccess().getEqualsSignKeyword_1());
                
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2766:1: ( (lv_right_2_0= ruleMathExpression ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2767:1: (lv_right_2_0= ruleMathExpression )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2767:1: (lv_right_2_0= ruleMathExpression )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2768:3: lv_right_2_0= ruleMathExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssigmentAccess().getRightMathExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMathExpression_in_ruleAssigment6159);
            lv_right_2_0=ruleMathExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssigmentRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"MathExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleAssigment6171); 

                	newLeafNode(otherlv_3, grammarAccess.getAssigmentAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleAssigment"


    // $ANTLR start "entryRuleLiteralAbs"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2798:1: entryRuleLiteralAbs returns [EObject current=null] : iv_ruleLiteralAbs= ruleLiteralAbs EOF ;
    public final EObject entryRuleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralAbs = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2799:2: (iv_ruleLiteralAbs= ruleLiteralAbs EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2800:2: iv_ruleLiteralAbs= ruleLiteralAbs EOF
            {
             newCompositeNode(grammarAccess.getLiteralAbsRule()); 
            pushFollow(FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6209);
            iv_ruleLiteralAbs=ruleLiteralAbs();

            state._fsp--;

             current =iv_ruleLiteralAbs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralAbs6219); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2807:1: ruleLiteralAbs returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_NumLiteral_3= ruleNumLiteral ) ;
    public final EObject ruleLiteralAbs() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BoolLiteral_2 = null;

        EObject this_NumLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2810:28: ( (this_Literal_0= ruleLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_NumLiteral_3= ruleNumLiteral ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2811:1: (this_Literal_0= ruleLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_NumLiteral_3= ruleNumLiteral )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2811:1: (this_Literal_0= ruleLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_NumLiteral_3= ruleNumLiteral )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_NULL:
            case RULE_SESSION:
                {
                alt29=1;
                }
                break;
            case RULE_STRING:
                {
                alt29=2;
                }
                break;
            case RULE_BOOL:
                {
                alt29=3;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2812:5: this_Literal_0= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleLiteralAbs6266);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2822:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getStringLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralAbs6293);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2832:5: this_BoolLiteral_2= ruleBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getBoolLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteralAbs6320);
                    this_BoolLiteral_2=ruleBoolLiteral();

                    state._fsp--;

                     
                            current = this_BoolLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2842:5: this_NumLiteral_3= ruleNumLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAbsAccess().getNumLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNumLiteral_in_ruleLiteralAbs6347);
                    this_NumLiteral_3=ruleNumLiteral();

                    state._fsp--;

                     
                            current = this_NumLiteral_3; 
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2858:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2859:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2860:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6382);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6392); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2867:1: ruleLiteral returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | ( (lv_ses_2_0= RULE_SESSION ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nul_1_0=null;
        Token lv_ses_2_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2870:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | ( (lv_ses_2_0= RULE_SESSION ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2871:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | ( (lv_ses_2_0= RULE_SESSION ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2871:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nul_1_0= RULE_NULL ) ) | ( (lv_ses_2_0= RULE_SESSION ) ) )
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
            case RULE_SESSION:
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2871:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2871:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2872:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2872:1: (otherlv_0= RULE_ID )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2873:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral6437); 

                    		newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getVVarsCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:6: ( (lv_nul_1_0= RULE_NULL ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2885:6: ( (lv_nul_1_0= RULE_NULL ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2886:1: (lv_nul_1_0= RULE_NULL )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2886:1: (lv_nul_1_0= RULE_NULL )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2887:3: lv_nul_1_0= RULE_NULL
                    {
                    lv_nul_1_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral6460); 

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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:6: ( (lv_ses_2_0= RULE_SESSION ) )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2904:6: ( (lv_ses_2_0= RULE_SESSION ) )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:1: (lv_ses_2_0= RULE_SESSION )
                    {
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2905:1: (lv_ses_2_0= RULE_SESSION )
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2906:3: lv_ses_2_0= RULE_SESSION
                    {
                    lv_ses_2_0=(Token)match(input,RULE_SESSION,FOLLOW_RULE_SESSION_in_ruleLiteral6488); 

                    			newLeafNode(lv_ses_2_0, grammarAccess.getLiteralAccess().getSesSESSIONTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ses",
                            		lv_ses_2_0, 
                            		"SESSION");
                    	    

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2930:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2931:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2932:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6529);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral6539); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2939:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2942:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2943:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2943:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2943:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2943:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2944:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2949:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2950:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2950:1: (lv_value_1_0= RULE_BOOL )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2951:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral6590); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2975:1: entryRuleNumLiteral returns [EObject current=null] : iv_ruleNumLiteral= ruleNumLiteral EOF ;
    public final EObject entryRuleNumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2976:2: (iv_ruleNumLiteral= ruleNumLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2977:2: iv_ruleNumLiteral= ruleNumLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumLiteralRule()); 
            pushFollow(FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6631);
            iv_ruleNumLiteral=ruleNumLiteral();

            state._fsp--;

             current =iv_ruleNumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumLiteral6641); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2984:1: ruleNumLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2987:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2988:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2988:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2988:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2988:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2989:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumLiteralAccess().getNumLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2994:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2995:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2995:1: (lv_value_1_0= ruleNumber )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:2996:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumLiteral6696);
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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3020:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3021:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3022:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6732);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6742); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3029:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3032:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3033:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3033:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3033:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3033:2: ()
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3039:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3040:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3040:1: (lv_value_1_0= RULE_STRING )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3041:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6793); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3065:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3066:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3067:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber6835);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber6846); 

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
    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3074:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3077:28: ( (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT ) )
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3078:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
            {
            // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3078:1: (this_DOUBLE_0= RULE_DOUBLE | this_INT_1= RULE_INT )
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
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3078:6: this_DOUBLE_0= RULE_DOUBLE
                    {
                    this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumber6886); 

                    		current.merge(this_DOUBLE_0);
                        
                     
                        newLeafNode(this_DOUBLE_0, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.telcodev.dsl/src-gen/org/telcodev/dsl/parser/antlr/internal/InternalDime.g:3086:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber6912); 

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

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\12\uffff";
    static final String DFA21_eofS =
        "\1\uffff\1\10\3\11\5\uffff";
    static final String DFA21_minS =
        "\1\4\4\11\5\uffff";
    static final String DFA21_maxS =
        "\1\23\4\37\5\uffff";
    static final String DFA21_acceptS =
        "\5\uffff\1\2\1\3\1\5\1\1\1\4";
    static final String DFA21_specialS =
        "\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\2\5\2\uffff\1\7\2\uffff\1\6\2\uffff\1\3\1\4\1\1"+
            "\1\5",
            "\1\10\1\uffff\1\10\1\5\17\uffff\1\10\2\uffff\1\10",
            "\1\11\1\uffff\1\11\1\5\17\uffff\1\11\2\uffff\1\11",
            "\1\11\1\uffff\1\11\1\5\17\uffff\1\11\2\uffff\1\11",
            "\1\11\1\uffff\1\11\1\5\17\uffff\1\11\2\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1881:1: (this_BoolLiteral_0= ruleBoolLiteral | this_CompareExpression_1= ruleCompareExpression | this_NegExpression_2= ruleNegExpression | this_Literal_3= ruleLiteral | this_Brackets_4= ruleBrackets )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDocument122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDocument139 = new BitSet(new long[]{0x00D88AE35B000032L});
    public static final BitSet FOLLOW_24_in_ruleDocument162 = new BitSet(new long[]{0x00D88AE35A000032L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDocument197 = new BitSet(new long[]{0x00D88AE35A000032L});
    public static final BitSet FOLLOW_ruleState_in_ruleDocument219 = new BitSet(new long[]{0x000000001A000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbstractElement313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_ruleAbstractElement340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_ruleStatement432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_ruleStatement459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_ruleStatement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_ruleStatement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigment_in_ruleStatement540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleStatement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAbstractElement_in_entryRuleStateAbstractElement603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAbstractElement613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStateAbstractElement660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleStateAbstractElement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStateExp_in_ruleStateAbstractElement714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleState841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState858 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_26_in_ruleState876 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleState893 = new BitSet(new long[]{0x000000001A000002L});
    public static final BitSet FOLLOW_27_in_ruleState969 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleState986 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleState1005 = new BitSet(new long[]{0x00D98AE360000030L});
    public static final BitSet FOLLOW_ruleStateAbstractElement_in_ruleState1026 = new BitSet(new long[]{0x00D98AE360000030L});
    public static final BitSet FOLLOW_29_in_ruleState1039 = new BitSet(new long[]{0x000000001A000002L});
    public static final BitSet FOLLOW_ruleVoiceTag_in_entryRuleVoiceTag1121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoiceTag1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_ruleVoiceTag1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_ruleVoiceTag1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_ruleVoiceTag1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_ruleVoiceTag1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_ruleVoiceTag1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_ruleVoiceTag1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_ruleVoiceTag1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_ruleVoiceTag1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_ruleVoiceTag1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDial_in_entryRuleDial1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDial1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDial1476 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleDial1497 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDial1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlay_in_entryRulePlay1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlay1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePlay1592 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_rulePlay1613 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePlay1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRecord1708 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRecord1725 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRecord1742 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRecord1754 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleRecord1775 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_36_in_ruleRecord1788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecord1805 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRecord1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReject_in_entryRuleReject1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReject1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleReject1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHangup_in_entryRuleHangup1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHangup1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHangup2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetDigits_in_entryRuleGetDigits2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetDigits2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleGetDigits2107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGetDigits2124 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleGetDigits2141 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleGetDigits2162 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGetDigits2174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetDigits2191 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleGetDigits2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsk_in_entryRuleAsk2244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsk2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAsk2291 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleAsk2312 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAsk2324 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsk2341 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAsk2358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsk2375 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAsk2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSend2475 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleSendBlock_in_ruleSend2496 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSend2508 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSend2529 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSend2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendBlock_in_entryRuleSendBlock2577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendBlock2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSendBlock2633 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleSendBlock2654 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_ruleSendBlock2675 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_29_in_ruleSendBlock2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPrimaryParam_in_entryRuleNotPrimaryParam2724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPrimaryParam2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNotPrimaryParam2771 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleNotPrimaryParam2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParam2880 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleParam2897 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleParam2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSay_in_entryRuleSay2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSay2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSay3001 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleSay3022 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSay3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTransition3117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3137 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTransition3149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_EVENTENUM_in_ruleTransition3166 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransition3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp3219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3275 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIfExp3288 = new BitSet(new long[]{0x00D88AE340000030L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp3309 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIfExp3324 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBlock3439 = new BitSet(new long[]{0x00D88AE360000030L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleBlock3460 = new BitSet(new long[]{0x00D88AE360000030L});
    public static final BitSet FOLLOW_29_in_ruleBlock3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCondBlock3556 = new BitSet(new long[]{0x00000000000F24D0L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleCondBlock3577 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStateExp_in_entryRuleIfStateExp3634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStateExp3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondStateBlock_in_ruleIfStateExp3690 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIfStateExp3703 = new BitSet(new long[]{0x00D98AE340000030L});
    public static final BitSet FOLLOW_ruleCondStateBlock_in_ruleIfStateExp3724 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIfStateExp3739 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlockState_in_ruleIfStateExp3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondStateBlock_in_entryRuleCondStateBlock3798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondStateBlock3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCondStateBlock3845 = new BitSet(new long[]{0x00000000000F24D0L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleCondStateBlock3866 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlockState_in_ruleCondStateBlock3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockState_in_entryRuleBlockState3923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockState3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBlockState3979 = new BitSet(new long[]{0x00D98AE360000030L});
    public static final BitSet FOLLOW_ruleStateAbstractElement_in_ruleBlockState4000 = new BitSet(new long[]{0x00D98AE360000030L});
    public static final BitSet FOLLOW_29_in_ruleBlockState4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleBoolExpression4106 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_LOGIC_WORD_in_ruleBoolExpression4132 = new BitSet(new long[]{0x00000000000F24D0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolExpression4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_entryRuleTerminalBoolExpression4196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalBoolExpression4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleTerminalBoolExpression4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleTerminalBoolExpression4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleTerminalBoolExpression4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerminalBoolExpression4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_ruleTerminalBoolExpression4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrackets_in_entryRuleBrackets4396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrackets4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleBrackets4448 = new BitSet(new long[]{0x00000000000F24D0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBrackets4474 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleBrackets4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression4532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareExpression4605 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleCompareExpression4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression4667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATION_in_ruleNegExpression4719 = new BitSet(new long[]{0x00000000000F24D0L});
    public static final BitSet FOLLOW_ruleTerminalBoolExpression_in_ruleNegExpression4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression4781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_ruleMathExpression4838 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathExpression4864 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathExpression4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathTerminal_in_entryRuleMathTerminal4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathTerminal4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_ruleMathTerminal4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMathTerminal5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_ruleMathTerminal5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathBrackets_in_entryRuleMathBrackets5074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathBrackets5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleMathBrackets5126 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleMathBrackets5152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleMathBrackets5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_entryRuleConcatenationExpression5210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationExpression5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_ruleConcatenationExpression5267 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_CONCATENATION_in_ruleConcatenationExpression5293 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationExpression5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationTerminal_in_entryRuleConcatenationTerminal5357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationTerminal5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_ruleConcatenationTerminal5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_ruleConcatenationTerminal5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatenationBrackets_in_entryRuleConcatenationBrackets5476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatenationBrackets5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OBRACKET_in_ruleConcatenationBrackets5528 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleConcatenationBrackets5554 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_CBRACKET_in_ruleConcatenationBrackets5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariable_in_entryRuleStringVariable5612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariable5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleStringVariable5659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariable5676 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_53_in_ruleStringVariable5694 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleConcatenationExpression_in_ruleStringVariable5715 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStringVariable5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumVariable_in_entryRuleNumVariable5765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumVariable5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumVariable5812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumVariable5829 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_53_in_ruleNumVariable5847 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleNumVariable5868 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNumVariable5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVariable_in_entryRuleBoolVariable5918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVariable5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBoolVariable5965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolVariable5982 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_53_in_ruleBoolVariable6000 = new BitSet(new long[]{0x00000000000F24D0L});
    public static final BitSet FOLLOW_ruleBoolExpression_in_ruleBoolVariable6021 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBoolVariable6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigment_in_entryRuleAssigment6071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigment6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssigment6126 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleAssigment6138 = new BitSet(new long[]{0x00000000000F04D0L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleAssigment6159 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAssigment6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralAbs_in_entryRuleLiteralAbs6209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralAbs6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralAbs6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralAbs6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteralAbs6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_ruleLiteralAbs6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SESSION_in_ruleLiteral6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral6529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumLiteral_in_entryRuleNumLiteral6631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumLiteral6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumLiteral6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumber6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber6912 = new BitSet(new long[]{0x0000000000000002L});

}
