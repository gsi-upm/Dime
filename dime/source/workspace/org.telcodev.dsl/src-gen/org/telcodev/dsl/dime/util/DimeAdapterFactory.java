/**
 */
package org.telcodev.dsl.dime.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.telcodev.dsl.dime.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.telcodev.dsl.dime.DimePackage
 * @generated
 */
public class DimeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DimePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DimePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DimeSwitch<Adapter> modelSwitch =
    new DimeSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseVoiceTag(VoiceTag object)
      {
        return createVoiceTagAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseDial(Dial object)
      {
        return createDialAdapter();
      }
      @Override
      public Adapter casePlay(Play object)
      {
        return createPlayAdapter();
      }
      @Override
      public Adapter caseRecord(Record object)
      {
        return createRecordAdapter();
      }
      @Override
      public Adapter caseReject(Reject object)
      {
        return createRejectAdapter();
      }
      @Override
      public Adapter caseHangup(Hangup object)
      {
        return createHangupAdapter();
      }
      @Override
      public Adapter caseGetDigits(GetDigits object)
      {
        return createGetDigitsAdapter();
      }
      @Override
      public Adapter caseAsk(Ask object)
      {
        return createAskAdapter();
      }
      @Override
      public Adapter caseSend(Send object)
      {
        return createSendAdapter();
      }
      @Override
      public Adapter caseSendBlock(SendBlock object)
      {
        return createSendBlockAdapter();
      }
      @Override
      public Adapter caseNotPrimaryParam(NotPrimaryParam object)
      {
        return createNotPrimaryParamAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter caseSay(Say object)
      {
        return createSayAdapter();
      }
      @Override
      public Adapter caseSms(Sms object)
      {
        return createSmsAdapter();
      }
      @Override
      public Adapter caseEmail(Email object)
      {
        return createEmailAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseIfExp(IfExp object)
      {
        return createIfExpAdapter();
      }
      @Override
      public Adapter caseCondBlock(CondBlock object)
      {
        return createCondBlockAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseBoolExpression(BoolExpression object)
      {
        return createBoolExpressionAdapter();
      }
      @Override
      public Adapter caseBrackets(Brackets object)
      {
        return createBracketsAdapter();
      }
      @Override
      public Adapter caseCompareExpression(CompareExpression object)
      {
        return createCompareExpressionAdapter();
      }
      @Override
      public Adapter caseNegExpression(NegExpression object)
      {
        return createNegExpressionAdapter();
      }
      @Override
      public Adapter caseMathExpression(MathExpression object)
      {
        return createMathExpressionAdapter();
      }
      @Override
      public Adapter caseMathBrackets(MathBrackets object)
      {
        return createMathBracketsAdapter();
      }
      @Override
      public Adapter caseConcatenationExpression(ConcatenationExpression object)
      {
        return createConcatenationExpressionAdapter();
      }
      @Override
      public Adapter caseConcatenationBrackets(ConcatenationBrackets object)
      {
        return createConcatenationBracketsAdapter();
      }
      @Override
      public Adapter caseStringVariable(StringVariable object)
      {
        return createStringVariableAdapter();
      }
      @Override
      public Adapter caseNumVariable(NumVariable object)
      {
        return createNumVariableAdapter();
      }
      @Override
      public Adapter caseBoolVariable(BoolVariable object)
      {
        return createBoolVariableAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseVars(Vars object)
      {
        return createVarsAdapter();
      }
      @Override
      public Adapter caseLiteralAbs(LiteralAbs object)
      {
        return createLiteralAbsAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseBoolLiteral(BoolLiteral object)
      {
        return createBoolLiteralAdapter();
      }
      @Override
      public Adapter caseNumLiteral(NumLiteral object)
      {
        return createNumLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseEVENT(EVENT object)
      {
        return createEVENTAdapter();
      }
      @Override
      public Adapter caseSESSION(SESSION object)
      {
        return createSESSIONAdapter();
      }
      @Override
      public Adapter caseCALLSTATUS(CALLSTATUS object)
      {
        return createCALLSTATUSAdapter();
      }
      @Override
      public Adapter caseOperationBool(OperationBool object)
      {
        return createOperationBoolAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseConcatenation(Concatenation object)
      {
        return createConcatenationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.VoiceTag <em>Voice Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.VoiceTag
   * @generated
   */
  public Adapter createVoiceTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Dial <em>Dial</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Dial
   * @generated
   */
  public Adapter createDialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Play <em>Play</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Play
   * @generated
   */
  public Adapter createPlayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Record
   * @generated
   */
  public Adapter createRecordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Reject <em>Reject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Reject
   * @generated
   */
  public Adapter createRejectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Hangup <em>Hangup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Hangup
   * @generated
   */
  public Adapter createHangupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.GetDigits <em>Get Digits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.GetDigits
   * @generated
   */
  public Adapter createGetDigitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Ask <em>Ask</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Ask
   * @generated
   */
  public Adapter createAskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Send <em>Send</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Send
   * @generated
   */
  public Adapter createSendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.SendBlock <em>Send Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.SendBlock
   * @generated
   */
  public Adapter createSendBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.NotPrimaryParam <em>Not Primary Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.NotPrimaryParam
   * @generated
   */
  public Adapter createNotPrimaryParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Say <em>Say</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Say
   * @generated
   */
  public Adapter createSayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Sms <em>Sms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Sms
   * @generated
   */
  public Adapter createSmsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Email
   * @generated
   */
  public Adapter createEmailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.IfExp <em>If Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.IfExp
   * @generated
   */
  public Adapter createIfExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.CondBlock <em>Cond Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.CondBlock
   * @generated
   */
  public Adapter createCondBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.BoolExpression <em>Bool Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.BoolExpression
   * @generated
   */
  public Adapter createBoolExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Brackets
   * @generated
   */
  public Adapter createBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.CompareExpression
   * @generated
   */
  public Adapter createCompareExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.NegExpression <em>Neg Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.NegExpression
   * @generated
   */
  public Adapter createNegExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.MathExpression <em>Math Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.MathExpression
   * @generated
   */
  public Adapter createMathExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.MathBrackets <em>Math Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.MathBrackets
   * @generated
   */
  public Adapter createMathBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.ConcatenationExpression <em>Concatenation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.ConcatenationExpression
   * @generated
   */
  public Adapter createConcatenationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.ConcatenationBrackets <em>Concatenation Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.ConcatenationBrackets
   * @generated
   */
  public Adapter createConcatenationBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.StringVariable <em>String Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.StringVariable
   * @generated
   */
  public Adapter createStringVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.NumVariable <em>Num Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.NumVariable
   * @generated
   */
  public Adapter createNumVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.BoolVariable <em>Bool Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.BoolVariable
   * @generated
   */
  public Adapter createBoolVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Vars
   * @generated
   */
  public Adapter createVarsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.LiteralAbs <em>Literal Abs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.LiteralAbs
   * @generated
   */
  public Adapter createLiteralAbsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.BoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.BoolLiteral
   * @generated
   */
  public Adapter createBoolLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.NumLiteral <em>Num Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.NumLiteral
   * @generated
   */
  public Adapter createNumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.EVENT <em>EVENT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.EVENT
   * @generated
   */
  public Adapter createEVENTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.SESSION <em>SESSION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.SESSION
   * @generated
   */
  public Adapter createSESSIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.CALLSTATUS <em>CALLSTATUS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.CALLSTATUS
   * @generated
   */
  public Adapter createCALLSTATUSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.OperationBool <em>Operation Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.OperationBool
   * @generated
   */
  public Adapter createOperationBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.telcodev.dsl.dime.Concatenation <em>Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.telcodev.dsl.dime.Concatenation
   * @generated
   */
  public Adapter createConcatenationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DimeAdapterFactory
