/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.telcodev.dsl.dime.DimePackage
 * @generated
 */
public interface DimeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DimeFactory eINSTANCE = org.telcodev.dsl.dime.impl.DimeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  Document createDocument();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>State Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Abstract Element</em>'.
   * @generated
   */
  StateAbstractElement createStateAbstractElement();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Voice Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Voice Tag</em>'.
   * @generated
   */
  VoiceTag createVoiceTag();

  /**
   * Returns a new object of class '<em>Dial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dial</em>'.
   * @generated
   */
  Dial createDial();

  /**
   * Returns a new object of class '<em>Play</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Play</em>'.
   * @generated
   */
  Play createPlay();

  /**
   * Returns a new object of class '<em>Record</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record</em>'.
   * @generated
   */
  Record createRecord();

  /**
   * Returns a new object of class '<em>Reject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reject</em>'.
   * @generated
   */
  Reject createReject();

  /**
   * Returns a new object of class '<em>Hangup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hangup</em>'.
   * @generated
   */
  Hangup createHangup();

  /**
   * Returns a new object of class '<em>Get Digits</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Digits</em>'.
   * @generated
   */
  GetDigits createGetDigits();

  /**
   * Returns a new object of class '<em>Ask</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ask</em>'.
   * @generated
   */
  Ask createAsk();

  /**
   * Returns a new object of class '<em>Send</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Send</em>'.
   * @generated
   */
  Send createSend();

  /**
   * Returns a new object of class '<em>Send Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Send Block</em>'.
   * @generated
   */
  SendBlock createSendBlock();

  /**
   * Returns a new object of class '<em>Not Primary Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Primary Param</em>'.
   * @generated
   */
  NotPrimaryParam createNotPrimaryParam();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Say</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Say</em>'.
   * @generated
   */
  Say createSay();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>If Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Exp</em>'.
   * @generated
   */
  IfExp createIfExp();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Cond Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cond Block</em>'.
   * @generated
   */
  CondBlock createCondBlock();

  /**
   * Returns a new object of class '<em>If State Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If State Exp</em>'.
   * @generated
   */
  IfStateExp createIfStateExp();

  /**
   * Returns a new object of class '<em>Cond State Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cond State Block</em>'.
   * @generated
   */
  CondStateBlock createCondStateBlock();

  /**
   * Returns a new object of class '<em>Block State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block State</em>'.
   * @generated
   */
  BlockState createBlockState();

  /**
   * Returns a new object of class '<em>Bool Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Expression</em>'.
   * @generated
   */
  BoolExpression createBoolExpression();

  /**
   * Returns a new object of class '<em>Brackets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Brackets</em>'.
   * @generated
   */
  Brackets createBrackets();

  /**
   * Returns a new object of class '<em>Compare Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare Expression</em>'.
   * @generated
   */
  CompareExpression createCompareExpression();

  /**
   * Returns a new object of class '<em>Neg Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg Expression</em>'.
   * @generated
   */
  NegExpression createNegExpression();

  /**
   * Returns a new object of class '<em>Math Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Expression</em>'.
   * @generated
   */
  MathExpression createMathExpression();

  /**
   * Returns a new object of class '<em>Math Brackets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Brackets</em>'.
   * @generated
   */
  MathBrackets createMathBrackets();

  /**
   * Returns a new object of class '<em>Concatenation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concatenation Expression</em>'.
   * @generated
   */
  ConcatenationExpression createConcatenationExpression();

  /**
   * Returns a new object of class '<em>Concatenation Brackets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concatenation Brackets</em>'.
   * @generated
   */
  ConcatenationBrackets createConcatenationBrackets();

  /**
   * Returns a new object of class '<em>String Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Variable</em>'.
   * @generated
   */
  StringVariable createStringVariable();

  /**
   * Returns a new object of class '<em>Num Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Variable</em>'.
   * @generated
   */
  NumVariable createNumVariable();

  /**
   * Returns a new object of class '<em>Bool Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Variable</em>'.
   * @generated
   */
  BoolVariable createBoolVariable();

  /**
   * Returns a new object of class '<em>Assigment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assigment</em>'.
   * @generated
   */
  Assigment createAssigment();

  /**
   * Returns a new object of class '<em>Vars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vars</em>'.
   * @generated
   */
  Vars createVars();

  /**
   * Returns a new object of class '<em>Literal Abs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Abs</em>'.
   * @generated
   */
  LiteralAbs createLiteralAbs();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Literal</em>'.
   * @generated
   */
  BoolLiteral createBoolLiteral();

  /**
   * Returns a new object of class '<em>Num Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Literal</em>'.
   * @generated
   */
  NumLiteral createNumLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Operation Bool</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Bool</em>'.
   * @generated
   */
  OperationBool createOperationBool();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Concatenation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concatenation</em>'.
   * @generated
   */
  Concatenation createConcatenation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DimePackage getDimePackage();

} //DimeFactory
