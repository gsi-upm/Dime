package org.telcodev.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.telcodev.dsl.dime.Ask;
import org.telcodev.dsl.dime.Block;
import org.telcodev.dsl.dime.BoolLiteral;
import org.telcodev.dsl.dime.BoolVariable;
import org.telcodev.dsl.dime.Brackets;
import org.telcodev.dsl.dime.CALLSTATUS;
import org.telcodev.dsl.dime.Call;
import org.telcodev.dsl.dime.CompareExpression;
import org.telcodev.dsl.dime.Concatenation;
import org.telcodev.dsl.dime.ConcatenationBrackets;
import org.telcodev.dsl.dime.CondBlock;
import org.telcodev.dsl.dime.Constant;
import org.telcodev.dsl.dime.Dial;
import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.Document;
import org.telcodev.dsl.dime.EVENT;
import org.telcodev.dsl.dime.Email;
import org.telcodev.dsl.dime.GetDigits;
import org.telcodev.dsl.dime.Hangup;
import org.telcodev.dsl.dime.IfExp;
import org.telcodev.dsl.dime.Literal;
import org.telcodev.dsl.dime.MathBrackets;
import org.telcodev.dsl.dime.NegExpression;
import org.telcodev.dsl.dime.NotPrimaryParam;
import org.telcodev.dsl.dime.NumLiteral;
import org.telcodev.dsl.dime.NumVariable;
import org.telcodev.dsl.dime.Operation;
import org.telcodev.dsl.dime.OperationBool;
import org.telcodev.dsl.dime.Param;
import org.telcodev.dsl.dime.Play;
import org.telcodev.dsl.dime.Record;
import org.telcodev.dsl.dime.Reject;
import org.telcodev.dsl.dime.SESSION;
import org.telcodev.dsl.dime.Say;
import org.telcodev.dsl.dime.Send;
import org.telcodev.dsl.dime.SendBlock;
import org.telcodev.dsl.dime.Sms;
import org.telcodev.dsl.dime.State;
import org.telcodev.dsl.dime.Statement;
import org.telcodev.dsl.dime.StringLiteral;
import org.telcodev.dsl.dime.StringVariable;
import org.telcodev.dsl.dime.Transition;
import org.telcodev.dsl.dime.Tweet;
import org.telcodev.dsl.services.DimeGrammarAccess;

@SuppressWarnings("all")
public class DimeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DimeGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DimePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DimePackage.ASK:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAskRule() ||
				   context == grammarAccess.getVarsRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Ask(context, (Ask) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BOOL_LITERAL:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getBoolLiteralRule() ||
				   context == grammarAccess.getConcatenationExpressionRule() ||
				   context == grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationTerminalRule() ||
				   context == grammarAccess.getLiteralAbsRule() ||
				   context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BOOL_VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getBoolVariableRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarsRule()) {
					sequence_BoolVariable(context, (BoolVariable) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BRACKETS:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getBracketsRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_Brackets(context, (Brackets) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.CALLSTATUS:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getCALLSTATUSRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_CALLSTATUS(context, (CALLSTATUS) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.CALL:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.COMPARE_EXPRESSION:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_CompareExpression(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.CONCATENATION:
				if(context == grammarAccess.getConcatenationExpressionRule()) {
					sequence_ConcatenationExpression(context, (Concatenation) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.CONCATENATION_BRACKETS:
				if(context == grammarAccess.getConcatenationBracketsRule() ||
				   context == grammarAccess.getConcatenationExpressionRule() ||
				   context == grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationTerminalRule()) {
					sequence_ConcatenationBrackets(context, (ConcatenationBrackets) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.COND_BLOCK:
				if(context == grammarAccess.getCondBlockRule()) {
					sequence_CondBlock(context, (CondBlock) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.CONSTANT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarsRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.DIAL:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getDialRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Dial(context, (Dial) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.DOCUMENT:
				if(context == grammarAccess.getDocumentRule()) {
					sequence_Document(context, (Document) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.EVENT:
				if(context == grammarAccess.getEVENTRule()) {
					sequence_EVENT(context, (EVENT) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.EMAIL:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getEmailRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Email(context, (Email) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.GET_DIGITS:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getGetDigitsRule() ||
				   context == grammarAccess.getVarsRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_GetDigits(context, (GetDigits) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.HANGUP:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getHangupRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Hangup(context, (Hangup) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.IF_EXP:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getIfExpRule()) {
					sequence_IfExp(context, (IfExp) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.LITERAL:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationExpressionRule() ||
				   context == grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationTerminalRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getLiteralAbsRule() ||
				   context == grammarAccess.getMathExpressionRule() ||
				   context == grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getMathTerminalRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.MATH_BRACKETS:
				if(context == grammarAccess.getMathBracketsRule() ||
				   context == grammarAccess.getMathExpressionRule() ||
				   context == grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getMathTerminalRule()) {
					sequence_MathBrackets(context, (MathBrackets) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.NEG_EXPRESSION:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_NegExpression(context, (NegExpression) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.NOT_PRIMARY_PARAM:
				if(context == grammarAccess.getNotPrimaryParamRule()) {
					sequence_NotPrimaryParam(context, (NotPrimaryParam) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.NUM_LITERAL:
				if(context == grammarAccess.getConcatenationExpressionRule() ||
				   context == grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationTerminalRule() ||
				   context == grammarAccess.getLiteralAbsRule() ||
				   context == grammarAccess.getMathExpressionRule() ||
				   context == grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getMathTerminalRule() ||
				   context == grammarAccess.getNumLiteralRule() ||
				   context == grammarAccess.getPrimitiveRule()) {
					sequence_NumLiteral(context, (NumLiteral) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.NUM_VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getNumVariableRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarsRule()) {
					sequence_NumVariable(context, (NumVariable) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.OPERATION:
				if(context == grammarAccess.getMathExpressionRule()) {
					sequence_MathExpression(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.OPERATION_BOOL:
				if(context == grammarAccess.getBoolExpressionRule()) {
					sequence_BoolExpression(context, (OperationBool) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.PLAY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPlayRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Play(context, (Play) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.RECORD:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getRecordRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Record(context, (Record) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.REJECT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getRejectRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Reject(context, (Reject) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SESSION:
				if(context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationExpressionRule() ||
				   context == grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationTerminalRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getLiteralAbsRule() ||
				   context == grammarAccess.getMathExpressionRule() ||
				   context == grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0() ||
				   context == grammarAccess.getMathTerminalRule() ||
				   context == grammarAccess.getSESSIONRule() ||
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_SESSION(context, (SESSION) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SAY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSayRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Say(context, (Say) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SEND:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSendRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Send(context, (Send) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SEND_BLOCK:
				if(context == grammarAccess.getSendBlockRule()) {
					sequence_SendBlock(context, (SendBlock) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SMS:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSmsRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Sms(context, (Sms) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.STATEMENT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.STRING_LITERAL:
				if(context == grammarAccess.getConcatenationExpressionRule() ||
				   context == grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0() ||
				   context == grammarAccess.getConcatenationTerminalRule() ||
				   context == grammarAccess.getLiteralAbsRule() ||
				   context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.STRING_VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStringVariableRule() ||
				   context == grammarAccess.getVarsRule()) {
					sequence_StringVariable(context, (StringVariable) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.TRANSITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.TWEET:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTweetRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Tweet(context, (Tweet) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name='Ask' question=ConcatenationExpression vari=ID)
	 */
	protected void sequence_Ask(EObject context, Ask semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.ASK__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.ASK__QUESTION));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.ASK__VARI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.ASK__VARI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAskAccess().getNameAskKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAskAccess().getQuestionConcatenationExpressionParserRuleCall_1_0(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getAskAccess().getVariIDTerminalRuleCall_3_0(), semanticObject.getVari());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='{' sta+=AbstractElement*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=BoolExpression_OperationBool_1_0 op=LOGIC_WORD right=BoolExpression)
	 */
	protected void sequence_BoolExpression(EObject context, OperationBool semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.OPERATION_BOOL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.OPERATION_BOOL__LEFT));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.OPERATION_BOOL__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.OPERATION_BOOL__OP));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.OPERATION_BOOL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.OPERATION_BOOL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolExpressionAccess().getOperationBoolLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBoolExpressionAccess().getOpLOGIC_WORDTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBoolExpressionAccess().getRightBoolExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOL
	 */
	protected void sequence_BoolLiteral(EObject context, BoolLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PRIMITIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PRIMITIVE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolLiteralAccess().getValueBOOLTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=BoolExpression?)
	 */
	protected void sequence_BoolVariable(EObject context, BoolVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (open=OBRACKET obj=BoolExpression close=CBRACKET)
	 */
	protected void sequence_Brackets(EObject context, Brackets semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.BRACKETS__OPEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.BRACKETS__OPEN));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.BRACKETS__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.BRACKETS__OBJ));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.BRACKETS__CLOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.BRACKETS__CLOSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0(), semanticObject.getOpen());
		feeder.accept(grammarAccess.getBracketsAccess().getObjBoolExpressionParserRuleCall_1_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0(), semanticObject.getClose());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='RINGING' | name='IN-PROGRESS' | name='DISCONNECTED' | name='FAILED')
	 */
	protected void sequence_CALLSTATUS(EObject context, CALLSTATUS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Call' to=ConcatenationExpression)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CALL__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CALL__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCallAccess().getNameCallKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCallAccess().getToConcatenationExpressionParserRuleCall_1_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=LiteralAbs op=COMPARE right=LiteralAbs)
	 */
	protected void sequence_CompareExpression(EObject context, CompareExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COMPARE_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COMPARE_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COMPARE_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COMPARE_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COMPARE_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COMPARE_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareExpressionAccess().getLeftLiteralAbsParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareExpressionAccess().getOpCOMPARETerminalRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getCompareExpressionAccess().getRightLiteralAbsParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (open=OBRACKET obj=ConcatenationExpression close=CBRACKET)
	 */
	protected void sequence_ConcatenationBrackets(EObject context, ConcatenationBrackets semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CONCATENATION_BRACKETS__OPEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CONCATENATION_BRACKETS__OPEN));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CONCATENATION_BRACKETS__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CONCATENATION_BRACKETS__OBJ));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CONCATENATION_BRACKETS__CLOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CONCATENATION_BRACKETS__CLOSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcatenationBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0(), semanticObject.getOpen());
		feeder.accept(grammarAccess.getConcatenationBracketsAccess().getObjConcatenationExpressionParserRuleCall_1_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getConcatenationBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0(), semanticObject.getClose());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConcatenationExpression_Concatenation_1_0 op='+' right=ConcatenationExpression)
	 */
	protected void sequence_ConcatenationExpression(EObject context, Concatenation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CONCATENATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CONCATENATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CONCATENATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CONCATENATION__OP));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.CONCATENATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.CONCATENATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcatenationExpressionAccess().getConcatenationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConcatenationExpressionAccess().getOpPlusSignKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='if' cond=TerminalBoolExpression action=Block)
	 */
	protected void sequence_CondBlock(EObject context, CondBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_BLOCK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_BLOCK__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_BLOCK__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_BLOCK__COND));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_BLOCK__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_BLOCK__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCondBlockAccess().getNameIfKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Primitive)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='DialTo' to=ConcatenationExpression)
	 */
	protected void sequence_Dial(EObject context, Dial semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.DIAL__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.DIAL__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDialAccess().getNameDialToKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDialAccess().getToConcatenationExpressionParserRuleCall_1_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=Statement* sta+=State*)
	 */
	protected void sequence_Document(EObject context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='HANGUP' | name='COMPLETED' | name='ERROR' | name='TIMES' | name='TIMEOUT')
	 */
	protected void sequence_EVENT(EObject context, EVENT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Email' title=ConcatenationExpression from=ConcatenationExpression value=ConcatenationExpression to=ConcatenationExpression)
	 */
	protected void sequence_Email(EObject context, Email semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.EMAIL__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.EMAIL__TITLE));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.EMAIL__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.EMAIL__FROM));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.EMAIL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.EMAIL__VALUE));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.EMAIL__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.EMAIL__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmailAccess().getNameEmailKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEmailAccess().getTitleConcatenationExpressionParserRuleCall_4_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getEmailAccess().getFromConcatenationExpressionParserRuleCall_8_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getEmailAccess().getValueConcatenationExpressionParserRuleCall_10_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getEmailAccess().getToConcatenationExpressionParserRuleCall_13_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Get' numDigits=INT question=ConcatenationExpression vari=ID)
	 */
	protected void sequence_GetDigits(EObject context, GetDigits semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.GET_DIGITS__NUM_DIGITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.GET_DIGITS__NUM_DIGITS));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.GET_DIGITS__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.GET_DIGITS__QUESTION));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.GET_DIGITS__VARI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.GET_DIGITS__VARI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGetDigitsAccess().getNameGetKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGetDigitsAccess().getNumDigitsINTTerminalRuleCall_1_0(), semanticObject.getNumDigits());
		feeder.accept(grammarAccess.getGetDigitsAccess().getQuestionConcatenationExpressionParserRuleCall_3_0(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getGetDigitsAccess().getVariIDTerminalRuleCall_5_0(), semanticObject.getVari());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='HangUp;'
	 */
	protected void sequence_Hangup(EObject context, Hangup semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHangupAccess().getNameHangUpKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (block=CondBlock blocks+=CondBlock* defaultBlock=Block?)
	 */
	protected void sequence_IfExp(EObject context, IfExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v=[Vars|ID] | nul=NULL)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (open=OBRACKET obj=MathExpression close=CBRACKET)
	 */
	protected void sequence_MathBrackets(EObject context, MathBrackets semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.MATH_BRACKETS__OPEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.MATH_BRACKETS__OPEN));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.MATH_BRACKETS__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.MATH_BRACKETS__OBJ));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.MATH_BRACKETS__CLOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.MATH_BRACKETS__CLOSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMathBracketsAccess().getOpenOBRACKETTerminalRuleCall_0_0(), semanticObject.getOpen());
		feeder.accept(grammarAccess.getMathBracketsAccess().getObjMathExpressionParserRuleCall_1_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getMathBracketsAccess().getCloseCBRACKETTerminalRuleCall_2_0(), semanticObject.getClose());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MathExpression_Operation_1_0 op=MATH right=MathExpression)
	 */
	protected void sequence_MathExpression(EObject context, Operation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.OPERATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.OPERATION__OP));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.OPERATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMathExpressionAccess().getOperationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMathExpressionAccess().getOpMATHTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMathExpressionAccess().getRightMathExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=NEGATION obj=TerminalBoolExpression)
	 */
	protected void sequence_NegExpression(EObject context, NegExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.NEG_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.NEG_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.NEG_EXPRESSION__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.NEG_EXPRESSION__OBJ));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegExpressionAccess().getOpNEGATIONTerminalRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getNegExpressionAccess().getObjTerminalBoolExpressionParserRuleCall_1_0(), semanticObject.getObj());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Param
	 */
	protected void sequence_NotPrimaryParam(EObject context, NotPrimaryParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.NOT_PRIMARY_PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.NOT_PRIMARY_PARAM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotPrimaryParamAccess().getValueParamParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Number
	 */
	protected void sequence_NumLiteral(EObject context, NumLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PRIMITIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PRIMITIVE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumLiteralAccess().getValueNumberParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=MathExpression?)
	 */
	protected void sequence_NumVariable(EObject context, NumVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=ConcatenationExpression)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PARAM__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PARAM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Play' file=ConcatenationExpression)
	 */
	protected void sequence_Play(EObject context, Play semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PLAY__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PLAY__FILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlayAccess().getNamePlayKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPlayAccess().getFileConcatenationExpressionParserRuleCall_1_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Record' time=INT action=ConcatenationExpression vari=ID?)
	 */
	protected void sequence_Record(EObject context, Record semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='Reject;'
	 */
	protected void sequence_Reject(EObject context, Reject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRejectAccess().getNameRejectKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='CALLER' | name='LASTSTATE' | name='TIME' | name='CALLED')
	 */
	protected void sequence_SESSION(EObject context, SESSION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Say' that=ConcatenationExpression)
	 */
	protected void sequence_Say(EObject context, Say semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.SAY__THAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.SAY__THAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSayAccess().getNameSayKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSayAccess().getThatConcatenationExpressionParserRuleCall_1_0(), semanticObject.getThat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=Param stms+=NotPrimaryParam*)
	 */
	protected void sequence_SendBlock(EObject context, SendBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Send' params=SendBlock url=ConcatenationExpression)
	 */
	protected void sequence_Send(EObject context, Send semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.SEND__PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.SEND__PARAMS));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.SEND__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.SEND__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSendAccess().getNameSendKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSendAccess().getParamsSendBlockParserRuleCall_1_0(), semanticObject.getParams());
		feeder.accept(grammarAccess.getSendAccess().getUrlConcatenationExpressionParserRuleCall_3_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Sms' value=ConcatenationExpression to=ConcatenationExpression)
	 */
	protected void sequence_Sms(EObject context, Sms semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.SMS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.SMS__VALUE));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.SMS__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.SMS__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSmsAccess().getNameSmsKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSmsAccess().getValueConcatenationExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSmsAccess().getToConcatenationExpressionParserRuleCall_3_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID times=INT? timeout=INT? stms+=AbstractElement*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     com=ML_COMMENT
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.STATEMENT__COM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.STATEMENT__COM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_4_0(), semanticObject.getCom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PRIMITIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PRIMITIVE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ConcatenationExpression?)
	 */
	protected void sequence_StringVariable(EObject context, StringVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='GoTo' target=[State|ID] event=EVENT)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.TRANSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.TRANSITION__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.TRANSITION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.TRANSITION__TARGET));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.TRANSITION__EVENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getNameGoToKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getTransitionAccess().getEventEVENTParserRuleCall_3_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tweet' value=ConcatenationExpression)
	 */
	protected void sequence_Tweet(EObject context, Tweet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.VOICE_TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.VOICE_TAG__NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.TWEET__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.TWEET__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTweetAccess().getNameTweetKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTweetAccess().getValueConcatenationExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
