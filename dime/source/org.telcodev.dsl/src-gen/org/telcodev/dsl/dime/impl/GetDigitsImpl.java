/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.telcodev.dsl.dime.ConcatenationExpression;
import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.GetDigits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Digits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.GetDigitsImpl#getNumDigits <em>Num Digits</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.GetDigitsImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.GetDigitsImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetDigitsImpl extends VoiceTagImpl implements GetDigits
{
  /**
   * The default value of the '{@link #getNumDigits() <em>Num Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumDigits()
   * @generated
   * @ordered
   */
  protected static final int NUM_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumDigits() <em>Num Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumDigits()
   * @generated
   * @ordered
   */
  protected int numDigits = NUM_DIGITS_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected ConcatenationExpression question;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetDigitsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DimePackage.Literals.GET_DIGITS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumDigits()
  {
    return numDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumDigits(int newNumDigits)
  {
    int oldNumDigits = numDigits;
    numDigits = newNumDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.GET_DIGITS__NUM_DIGITS, oldNumDigits, numDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcatenationExpression getQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuestion(ConcatenationExpression newQuestion, NotificationChain msgs)
  {
    ConcatenationExpression oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DimePackage.GET_DIGITS__QUESTION, oldQuestion, newQuestion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(ConcatenationExpression newQuestion)
  {
    if (newQuestion != question)
    {
      NotificationChain msgs = null;
      if (question != null)
        msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DimePackage.GET_DIGITS__QUESTION, null, msgs);
      if (newQuestion != null)
        msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DimePackage.GET_DIGITS__QUESTION, null, msgs);
      msgs = basicSetQuestion(newQuestion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.GET_DIGITS__QUESTION, newQuestion, newQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.GET_DIGITS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DimePackage.GET_DIGITS__QUESTION:
        return basicSetQuestion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DimePackage.GET_DIGITS__NUM_DIGITS:
        return getNumDigits();
      case DimePackage.GET_DIGITS__QUESTION:
        return getQuestion();
      case DimePackage.GET_DIGITS__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DimePackage.GET_DIGITS__NUM_DIGITS:
        setNumDigits((Integer)newValue);
        return;
      case DimePackage.GET_DIGITS__QUESTION:
        setQuestion((ConcatenationExpression)newValue);
        return;
      case DimePackage.GET_DIGITS__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DimePackage.GET_DIGITS__NUM_DIGITS:
        setNumDigits(NUM_DIGITS_EDEFAULT);
        return;
      case DimePackage.GET_DIGITS__QUESTION:
        setQuestion((ConcatenationExpression)null);
        return;
      case DimePackage.GET_DIGITS__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DimePackage.GET_DIGITS__NUM_DIGITS:
        return numDigits != NUM_DIGITS_EDEFAULT;
      case DimePackage.GET_DIGITS__QUESTION:
        return question != null;
      case DimePackage.GET_DIGITS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (numDigits: ");
    result.append(numDigits);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GetDigitsImpl
