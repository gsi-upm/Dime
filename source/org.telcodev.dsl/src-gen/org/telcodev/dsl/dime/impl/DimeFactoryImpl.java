/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.telcodev.dsl.dime.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimeFactoryImpl extends EFactoryImpl implements DimeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DimeFactory init()
  {
    try
    {
      DimeFactory theDimeFactory = (DimeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.telcodev.org/dsl/Dime"); 
      if (theDimeFactory != null)
      {
        return theDimeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DimeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DimePackage.DOCUMENT: return createDocument();
      case DimePackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DimePackage.STATEMENT: return createStatement();
      case DimePackage.STATE_ABSTRACT_ELEMENT: return createStateAbstractElement();
      case DimePackage.STATE: return createState();
      case DimePackage.VOICE_TAG: return createVoiceTag();
      case DimePackage.DIAL: return createDial();
      case DimePackage.PLAY: return createPlay();
      case DimePackage.RECORD: return createRecord();
      case DimePackage.REJECT: return createReject();
      case DimePackage.HANGUP: return createHangup();
      case DimePackage.GET_DIGITS: return createGetDigits();
      case DimePackage.ASK: return createAsk();
      case DimePackage.SEND: return createSend();
      case DimePackage.SEND_BLOCK: return createSendBlock();
      case DimePackage.NOT_PRIMARY_PARAM: return createNotPrimaryParam();
      case DimePackage.PARAM: return createParam();
      case DimePackage.SAY: return createSay();
      case DimePackage.TRANSITION: return createTransition();
      case DimePackage.IF_EXP: return createIfExp();
      case DimePackage.BLOCK: return createBlock();
      case DimePackage.COND_BLOCK: return createCondBlock();
      case DimePackage.IF_STATE_EXP: return createIfStateExp();
      case DimePackage.COND_STATE_BLOCK: return createCondStateBlock();
      case DimePackage.BLOCK_STATE: return createBlockState();
      case DimePackage.BOOL_EXPRESSION: return createBoolExpression();
      case DimePackage.BRACKETS: return createBrackets();
      case DimePackage.COMPARE_EXPRESSION: return createCompareExpression();
      case DimePackage.NEG_EXPRESSION: return createNegExpression();
      case DimePackage.MATH_EXPRESSION: return createMathExpression();
      case DimePackage.MATH_BRACKETS: return createMathBrackets();
      case DimePackage.CONCATENATION_EXPRESSION: return createConcatenationExpression();
      case DimePackage.CONCATENATION_BRACKETS: return createConcatenationBrackets();
      case DimePackage.STRING_VARIABLE: return createStringVariable();
      case DimePackage.NUM_VARIABLE: return createNumVariable();
      case DimePackage.BOOL_VARIABLE: return createBoolVariable();
      case DimePackage.ASSIGMENT: return createAssigment();
      case DimePackage.VARS: return createVars();
      case DimePackage.LITERAL_ABS: return createLiteralAbs();
      case DimePackage.LITERAL: return createLiteral();
      case DimePackage.BOOL_LITERAL: return createBoolLiteral();
      case DimePackage.NUM_LITERAL: return createNumLiteral();
      case DimePackage.STRING_LITERAL: return createStringLiteral();
      case DimePackage.OPERATION_BOOL: return createOperationBool();
      case DimePackage.OPERATION: return createOperation();
      case DimePackage.CONCATENATION: return createConcatenation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAbstractElement createStateAbstractElement()
  {
    StateAbstractElementImpl stateAbstractElement = new StateAbstractElementImpl();
    return stateAbstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoiceTag createVoiceTag()
  {
    VoiceTagImpl voiceTag = new VoiceTagImpl();
    return voiceTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dial createDial()
  {
    DialImpl dial = new DialImpl();
    return dial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Play createPlay()
  {
    PlayImpl play = new PlayImpl();
    return play;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record createRecord()
  {
    RecordImpl record = new RecordImpl();
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reject createReject()
  {
    RejectImpl reject = new RejectImpl();
    return reject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hangup createHangup()
  {
    HangupImpl hangup = new HangupImpl();
    return hangup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetDigits createGetDigits()
  {
    GetDigitsImpl getDigits = new GetDigitsImpl();
    return getDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ask createAsk()
  {
    AskImpl ask = new AskImpl();
    return ask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Send createSend()
  {
    SendImpl send = new SendImpl();
    return send;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendBlock createSendBlock()
  {
    SendBlockImpl sendBlock = new SendBlockImpl();
    return sendBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotPrimaryParam createNotPrimaryParam()
  {
    NotPrimaryParamImpl notPrimaryParam = new NotPrimaryParamImpl();
    return notPrimaryParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Say createSay()
  {
    SayImpl say = new SayImpl();
    return say;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExp createIfExp()
  {
    IfExpImpl ifExp = new IfExpImpl();
    return ifExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondBlock createCondBlock()
  {
    CondBlockImpl condBlock = new CondBlockImpl();
    return condBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStateExp createIfStateExp()
  {
    IfStateExpImpl ifStateExp = new IfStateExpImpl();
    return ifStateExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondStateBlock createCondStateBlock()
  {
    CondStateBlockImpl condStateBlock = new CondStateBlockImpl();
    return condStateBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockState createBlockState()
  {
    BlockStateImpl blockState = new BlockStateImpl();
    return blockState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolExpression createBoolExpression()
  {
    BoolExpressionImpl boolExpression = new BoolExpressionImpl();
    return boolExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Brackets createBrackets()
  {
    BracketsImpl brackets = new BracketsImpl();
    return brackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareExpression createCompareExpression()
  {
    CompareExpressionImpl compareExpression = new CompareExpressionImpl();
    return compareExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegExpression createNegExpression()
  {
    NegExpressionImpl negExpression = new NegExpressionImpl();
    return negExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathExpression createMathExpression()
  {
    MathExpressionImpl mathExpression = new MathExpressionImpl();
    return mathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathBrackets createMathBrackets()
  {
    MathBracketsImpl mathBrackets = new MathBracketsImpl();
    return mathBrackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcatenationExpression createConcatenationExpression()
  {
    ConcatenationExpressionImpl concatenationExpression = new ConcatenationExpressionImpl();
    return concatenationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcatenationBrackets createConcatenationBrackets()
  {
    ConcatenationBracketsImpl concatenationBrackets = new ConcatenationBracketsImpl();
    return concatenationBrackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringVariable createStringVariable()
  {
    StringVariableImpl stringVariable = new StringVariableImpl();
    return stringVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumVariable createNumVariable()
  {
    NumVariableImpl numVariable = new NumVariableImpl();
    return numVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolVariable createBoolVariable()
  {
    BoolVariableImpl boolVariable = new BoolVariableImpl();
    return boolVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assigment createAssigment()
  {
    AssigmentImpl assigment = new AssigmentImpl();
    return assigment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars createVars()
  {
    VarsImpl vars = new VarsImpl();
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralAbs createLiteralAbs()
  {
    LiteralAbsImpl literalAbs = new LiteralAbsImpl();
    return literalAbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolLiteral createBoolLiteral()
  {
    BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumLiteral createNumLiteral()
  {
    NumLiteralImpl numLiteral = new NumLiteralImpl();
    return numLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationBool createOperationBool()
  {
    OperationBoolImpl operationBool = new OperationBoolImpl();
    return operationBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concatenation createConcatenation()
  {
    ConcatenationImpl concatenation = new ConcatenationImpl();
    return concatenation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimePackage getDimePackage()
  {
    return (DimePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DimePackage getPackage()
  {
    return DimePackage.eINSTANCE;
  }

} //DimeFactoryImpl
