/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.StatementImpl#getCom <em>Com</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends AbstractElementImpl implements Statement
{
  /**
   * The default value of the '{@link #getCom() <em>Com</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom()
   * @generated
   * @ordered
   */
  protected static final String COM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCom() <em>Com</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom()
   * @generated
   * @ordered
   */
  protected String com = COM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return DimePackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCom()
  {
    return com;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom(String newCom)
  {
    String oldCom = com;
    com = newCom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.STATEMENT__COM, oldCom, com));
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
      case DimePackage.STATEMENT__COM:
        return getCom();
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
      case DimePackage.STATEMENT__COM:
        setCom((String)newValue);
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
      case DimePackage.STATEMENT__COM:
        setCom(COM_EDEFAULT);
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
      case DimePackage.STATEMENT__COM:
        return COM_EDEFAULT == null ? com != null : !COM_EDEFAULT.equals(com);
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
    result.append(" (com: ");
    result.append(com);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
