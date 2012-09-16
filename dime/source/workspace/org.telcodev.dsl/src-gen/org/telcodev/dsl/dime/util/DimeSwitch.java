/**
 */
package org.telcodev.dsl.dime.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.telcodev.dsl.dime.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.telcodev.dsl.dime.DimePackage
 * @generated
 */
public class DimeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DimePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DimePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DimePackage.DOCUMENT:
      {
        Document document = (Document)theEObject;
        T result = caseDocument(document);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = caseAbstractElement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.VOICE_TAG:
      {
        VoiceTag voiceTag = (VoiceTag)theEObject;
        T result = caseVoiceTag(voiceTag);
        if (result == null) result = caseAbstractElement(voiceTag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.CALL:
      {
        Call call = (Call)theEObject;
        T result = caseCall(call);
        if (result == null) result = caseVoiceTag(call);
        if (result == null) result = caseAbstractElement(call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.DIAL:
      {
        Dial dial = (Dial)theEObject;
        T result = caseDial(dial);
        if (result == null) result = caseVoiceTag(dial);
        if (result == null) result = caseAbstractElement(dial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.PLAY:
      {
        Play play = (Play)theEObject;
        T result = casePlay(play);
        if (result == null) result = caseVoiceTag(play);
        if (result == null) result = caseAbstractElement(play);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.RECORD:
      {
        Record record = (Record)theEObject;
        T result = caseRecord(record);
        if (result == null) result = caseVoiceTag(record);
        if (result == null) result = caseAbstractElement(record);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.REJECT:
      {
        Reject reject = (Reject)theEObject;
        T result = caseReject(reject);
        if (result == null) result = caseVoiceTag(reject);
        if (result == null) result = caseAbstractElement(reject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.HANGUP:
      {
        Hangup hangup = (Hangup)theEObject;
        T result = caseHangup(hangup);
        if (result == null) result = caseVoiceTag(hangup);
        if (result == null) result = caseAbstractElement(hangup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.GET_DIGITS:
      {
        GetDigits getDigits = (GetDigits)theEObject;
        T result = caseGetDigits(getDigits);
        if (result == null) result = caseVoiceTag(getDigits);
        if (result == null) result = caseVars(getDigits);
        if (result == null) result = caseAbstractElement(getDigits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.ASK:
      {
        Ask ask = (Ask)theEObject;
        T result = caseAsk(ask);
        if (result == null) result = caseVoiceTag(ask);
        if (result == null) result = caseVars(ask);
        if (result == null) result = caseAbstractElement(ask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.SEND:
      {
        Send send = (Send)theEObject;
        T result = caseSend(send);
        if (result == null) result = caseVoiceTag(send);
        if (result == null) result = caseAbstractElement(send);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.SEND_BLOCK:
      {
        SendBlock sendBlock = (SendBlock)theEObject;
        T result = caseSendBlock(sendBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.NOT_PRIMARY_PARAM:
      {
        NotPrimaryParam notPrimaryParam = (NotPrimaryParam)theEObject;
        T result = caseNotPrimaryParam(notPrimaryParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.SAY:
      {
        Say say = (Say)theEObject;
        T result = caseSay(say);
        if (result == null) result = caseVoiceTag(say);
        if (result == null) result = caseAbstractElement(say);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.SMS:
      {
        Sms sms = (Sms)theEObject;
        T result = caseSms(sms);
        if (result == null) result = caseVoiceTag(sms);
        if (result == null) result = caseAbstractElement(sms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.EMAIL:
      {
        Email email = (Email)theEObject;
        T result = caseEmail(email);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.TWEET:
      {
        Tweet tweet = (Tweet)theEObject;
        T result = caseTweet(tweet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = caseAbstractElement(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.IF_EXP:
      {
        IfExp ifExp = (IfExp)theEObject;
        T result = caseIfExp(ifExp);
        if (result == null) result = caseAbstractElement(ifExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.COND_BLOCK:
      {
        CondBlock condBlock = (CondBlock)theEObject;
        T result = caseCondBlock(condBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.BOOL_EXPRESSION:
      {
        BoolExpression boolExpression = (BoolExpression)theEObject;
        T result = caseBoolExpression(boolExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.BRACKETS:
      {
        Brackets brackets = (Brackets)theEObject;
        T result = caseBrackets(brackets);
        if (result == null) result = caseBoolExpression(brackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.COMPARE_EXPRESSION:
      {
        CompareExpression compareExpression = (CompareExpression)theEObject;
        T result = caseCompareExpression(compareExpression);
        if (result == null) result = caseBoolExpression(compareExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.NEG_EXPRESSION:
      {
        NegExpression negExpression = (NegExpression)theEObject;
        T result = caseNegExpression(negExpression);
        if (result == null) result = caseBoolExpression(negExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.MATH_EXPRESSION:
      {
        MathExpression mathExpression = (MathExpression)theEObject;
        T result = caseMathExpression(mathExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.MATH_BRACKETS:
      {
        MathBrackets mathBrackets = (MathBrackets)theEObject;
        T result = caseMathBrackets(mathBrackets);
        if (result == null) result = caseMathExpression(mathBrackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.CONCATENATION_EXPRESSION:
      {
        ConcatenationExpression concatenationExpression = (ConcatenationExpression)theEObject;
        T result = caseConcatenationExpression(concatenationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.CONCATENATION_BRACKETS:
      {
        ConcatenationBrackets concatenationBrackets = (ConcatenationBrackets)theEObject;
        T result = caseConcatenationBrackets(concatenationBrackets);
        if (result == null) result = caseConcatenationExpression(concatenationBrackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.STRING_VARIABLE:
      {
        StringVariable stringVariable = (StringVariable)theEObject;
        T result = caseStringVariable(stringVariable);
        if (result == null) result = caseStatement(stringVariable);
        if (result == null) result = caseVars(stringVariable);
        if (result == null) result = caseAbstractElement(stringVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.NUM_VARIABLE:
      {
        NumVariable numVariable = (NumVariable)theEObject;
        T result = caseNumVariable(numVariable);
        if (result == null) result = caseStatement(numVariable);
        if (result == null) result = caseVars(numVariable);
        if (result == null) result = caseAbstractElement(numVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.BOOL_VARIABLE:
      {
        BoolVariable boolVariable = (BoolVariable)theEObject;
        T result = caseBoolVariable(boolVariable);
        if (result == null) result = caseStatement(boolVariable);
        if (result == null) result = caseVars(boolVariable);
        if (result == null) result = caseAbstractElement(boolVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseStatement(constant);
        if (result == null) result = caseVars(constant);
        if (result == null) result = caseAbstractElement(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.PRIMITIVE:
      {
        Primitive primitive = (Primitive)theEObject;
        T result = casePrimitive(primitive);
        if (result == null) result = caseLiteralAbs(primitive);
        if (result == null) result = caseConcatenationExpression(primitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.VARS:
      {
        Vars vars = (Vars)theEObject;
        T result = caseVars(vars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.LITERAL_ABS:
      {
        LiteralAbs literalAbs = (LiteralAbs)theEObject;
        T result = caseLiteralAbs(literalAbs);
        if (result == null) result = caseConcatenationExpression(literalAbs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseBoolExpression(literal);
        if (result == null) result = caseMathExpression(literal);
        if (result == null) result = caseLiteralAbs(literal);
        if (result == null) result = caseConcatenationExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.BOOL_LITERAL:
      {
        BoolLiteral boolLiteral = (BoolLiteral)theEObject;
        T result = caseBoolLiteral(boolLiteral);
        if (result == null) result = caseBoolExpression(boolLiteral);
        if (result == null) result = casePrimitive(boolLiteral);
        if (result == null) result = caseLiteralAbs(boolLiteral);
        if (result == null) result = caseConcatenationExpression(boolLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.NUM_LITERAL:
      {
        NumLiteral numLiteral = (NumLiteral)theEObject;
        T result = caseNumLiteral(numLiteral);
        if (result == null) result = caseMathExpression(numLiteral);
        if (result == null) result = casePrimitive(numLiteral);
        if (result == null) result = caseLiteralAbs(numLiteral);
        if (result == null) result = caseConcatenationExpression(numLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = casePrimitive(stringLiteral);
        if (result == null) result = caseLiteralAbs(stringLiteral);
        if (result == null) result = caseConcatenationExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.EVENT:
      {
        EVENT event = (EVENT)theEObject;
        T result = caseEVENT(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.SESSION:
      {
        SESSION session = (SESSION)theEObject;
        T result = caseSESSION(session);
        if (result == null) result = caseLiteral(session);
        if (result == null) result = caseBoolExpression(session);
        if (result == null) result = caseMathExpression(session);
        if (result == null) result = caseLiteralAbs(session);
        if (result == null) result = caseConcatenationExpression(session);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.CALLSTATUS:
      {
        CALLSTATUS callstatus = (CALLSTATUS)theEObject;
        T result = caseCALLSTATUS(callstatus);
        if (result == null) result = caseBoolExpression(callstatus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.OPERATION_BOOL:
      {
        OperationBool operationBool = (OperationBool)theEObject;
        T result = caseOperationBool(operationBool);
        if (result == null) result = caseBoolExpression(operationBool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseMathExpression(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DimePackage.CONCATENATION:
      {
        Concatenation concatenation = (Concatenation)theEObject;
        T result = caseConcatenation(concatenation);
        if (result == null) result = caseConcatenationExpression(concatenation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocument(Document object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Voice Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Voice Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoiceTag(VoiceTag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCall(Call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDial(Dial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Play</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Play</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlay(Play object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecord(Record object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReject(Reject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hangup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hangup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHangup(Hangup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Digits</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Digits</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetDigits(GetDigits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ask</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ask</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsk(Ask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSend(Send object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSendBlock(SendBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Primary Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Primary Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotPrimaryParam(NotPrimaryParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Say</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Say</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSay(Say object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSms(Sms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Email</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmail(Email object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tweet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tweet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTweet(Tweet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExp(IfExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cond Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cond Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondBlock(CondBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolExpression(BoolExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrackets(Brackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareExpression(CompareExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neg Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neg Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegExpression(NegExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathExpression(MathExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathBrackets(MathBrackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concatenation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concatenation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcatenationExpression(ConcatenationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concatenation Brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concatenation Brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcatenationBrackets(ConcatenationBrackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVariable(StringVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Num Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Num Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumVariable(NumVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolVariable(BoolVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitive(Primitive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVars(Vars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Abs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Abs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralAbs(LiteralAbs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolLiteral(BoolLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Num Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Num Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumLiteral(NumLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EVENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EVENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEVENT(EVENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SESSION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SESSION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSESSION(SESSION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CALLSTATUS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CALLSTATUS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCALLSTATUS(CALLSTATUS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationBool(OperationBool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concatenation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concatenation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcatenation(Concatenation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DimeSwitch
