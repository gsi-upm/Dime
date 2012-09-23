/**
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DimePackage.GET_DIGITS__NUM_DIGITS:
        return getNumDigits();
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
    result.append(')');
    return result.toString();
  }

} //GetDigitsImpl
