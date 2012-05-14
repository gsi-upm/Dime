package org.telcodev.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.telcodev.dsl.dime.Ask;
import org.telcodev.dsl.dime.Assigment;
import org.telcodev.dsl.dime.Block;
import org.telcodev.dsl.dime.BlockState;
import org.telcodev.dsl.dime.BoolLiteral;
import org.telcodev.dsl.dime.BoolVariable;
import org.telcodev.dsl.dime.Brackets;
import org.telcodev.dsl.dime.CompareExpression;
import org.telcodev.dsl.dime.Concatenation;
import org.telcodev.dsl.dime.ConcatenationBrackets;
import org.telcodev.dsl.dime.CondBlock;
import org.telcodev.dsl.dime.CondStateBlock;
import org.telcodev.dsl.dime.Dial;
import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.Document;
import org.telcodev.dsl.dime.GetDigits;
import org.telcodev.dsl.dime.Hangup;
import org.telcodev.dsl.dime.IfExp;
import org.telcodev.dsl.dime.IfStateExp;
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
import org.telcodev.dsl.dime.Say;
import org.telcodev.dsl.dime.Send;
import org.telcodev.dsl.dime.SendBlock;
import org.telcodev.dsl.dime.State;
import org.telcodev.dsl.dime.Statement;
import org.telcodev.dsl.dime.StringLiteral;
import org.telcodev.dsl.dime.StringVariable;
import org.telcodev.dsl.dime.Transition;
import org.telcodev.dsl.services.DimeGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractDimeSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected DimeGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DimePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DimePackage.ASK:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAskRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarsRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Ask(context, (Ask) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.ASSIGMENT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAssigmentRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Assigment(context, (Assigment) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BLOCK_STATE:
				if(context == grammarAccess.getBlockStateRule()) {
					sequence_BlockState(context, (BlockState) semanticObject); 
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
				   context == grammarAccess.getTerminalBoolExpressionRule()) {
					sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.BOOL_VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getBoolVariableRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
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
			case DimePackage.COND_STATE_BLOCK:
				if(context == grammarAccess.getCondStateBlockRule()) {
					sequence_CondStateBlock(context, (CondStateBlock) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.DIAL:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getDialRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
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
			case DimePackage.GET_DIGITS:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getGetDigitsRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarsRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_GetDigits(context, (GetDigits) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.HANGUP:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getHangupRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
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
			case DimePackage.IF_STATE_EXP:
				if(context == grammarAccess.getIfStateExpRule() ||
				   context == grammarAccess.getStateAbstractElementRule()) {
					sequence_IfStateExp(context, (IfStateExp) semanticObject); 
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
				   context == grammarAccess.getNumLiteralRule()) {
					sequence_NumLiteral(context, (NumLiteral) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.NUM_VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getNumVariableRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
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
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Play(context, (Play) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.RECORD:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getRecordRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Record(context, (Record) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.REJECT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getRejectRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Reject(context, (Reject) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SAY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSayRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVoiceTagRule()) {
					sequence_Say(context, (Say) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.SEND:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getSendRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
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
			case DimePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.STATEMENT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
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
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.STRING_VARIABLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStringVariableRule() ||
				   context == grammarAccess.getVarsRule()) {
					sequence_StringVariable(context, (StringVariable) semanticObject); 
					return; 
				}
				else break;
			case DimePackage.TRANSITION:
				if(context == grammarAccess.getStateAbstractElementRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (question=ConcatenationExpression choices=STRING name=ID)
	 */
	protected void sequence_Ask(EObject context, Ask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (va=[Vars|ID] right=MathExpression)
	 */
	protected void sequence_Assigment(EObject context, Assigment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sta+=StateAbstractElement*)
	 */
	protected void sequence_BlockState(EObject context, BlockState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stms+=AbstractElement*)
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
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.BOOL_LITERAL__VALUE));
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
	 *     (left=ConcatenationExpression_Concatenation_1_0 op=CONCATENATION right=ConcatenationExpression)
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
		feeder.accept(grammarAccess.getConcatenationExpressionAccess().getOpCONCATENATIONTerminalRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getConcatenationExpressionAccess().getRightConcatenationExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=TerminalBoolExpression action=Block)
	 */
	protected void sequence_CondBlock(EObject context, CondBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_BLOCK__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_BLOCK__COND));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_BLOCK__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_BLOCK__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCondBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=TerminalBoolExpression action=BlockState)
	 */
	protected void sequence_CondStateBlock(EObject context, CondStateBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_STATE_BLOCK__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_STATE_BLOCK__COND));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.COND_STATE_BLOCK__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.COND_STATE_BLOCK__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCondStateBlockAccess().getCondTerminalBoolExpressionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getCondStateBlockAccess().getActionBlockStateParserRuleCall_2_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     to=ConcatenationExpression
	 */
	protected void sequence_Dial(EObject context, Dial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID states?='withStates'? elements+=AbstractElement* sta+=State*)
	 */
	protected void sequence_Document(EObject context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (numDigits=INT question=ConcatenationExpression name=ID)
	 */
	protected void sequence_GetDigits(EObject context, GetDigits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='hangUp;'
	 */
	protected void sequence_Hangup(EObject context, Hangup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (block=CondStateBlock blocks+=CondStateBlock* defaultBlock=BlockState?)
	 */
	protected void sequence_IfStateExp(EObject context, IfStateExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v=[Vars|ID] | nul=NULL | ses=SESSION)
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
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.NUM_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.NUM_LITERAL__VALUE));
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
	 *     (paramName=STRING value=ConcatenationExpression)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PARAM__PARAM_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PARAM__PARAM_NAME));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.PARAM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getParamNameSTRINGTerminalRuleCall_0_0(), semanticObject.getParamName());
		feeder.accept(grammarAccess.getParamAccess().getValueConcatenationExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     file=ConcatenationExpression
	 */
	protected void sequence_Play(EObject context, Play semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (time=INT action=ConcatenationExpression name=ID?)
	 */
	protected void sequence_Record(EObject context, Record semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='reject;'
	 */
	protected void sequence_Reject(EObject context, Reject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     that=ConcatenationExpression
	 */
	protected void sequence_Say(EObject context, Say semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (params=SendBlock url=ConcatenationExpression)
	 */
	protected void sequence_Send(EObject context, Send semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID times=INT? timeout=INT? stms+=StateAbstractElement*)
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
		feeder.accept(grammarAccess.getStatementAccess().getComML_COMMENTTerminalRuleCall_5_0(), semanticObject.getCom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.STRING_LITERAL__VALUE));
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
	 *     (target=[State|ID] event=EventEnum)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.TRANSITION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.TRANSITION__TARGET));
			if(transientValues.isValueTransient(semanticObject, DimePackage.Literals.TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DimePackage.Literals.TRANSITION__EVENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getTransitionAccess().getEventEventEnumTerminalRuleCall_3_0(), semanticObject.getEvent());
		feeder.finish();
	}
}
