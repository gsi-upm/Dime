/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.Literal;
import org.telcodev.dsl.dime.Vars;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.LiteralImpl#getV <em>V</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.LiteralImpl#getNul <em>Nul</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.LiteralImpl#getSes <em>Ses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends BoolExpressionImpl implements Literal
{
  /**
   * The cached value of the '{@link #getV() <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Vars v;

  /**
   * The default value of the '{@link #getNul() <em>Nul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNul()
   * @generated
   * @ordered
   */
  protected static final String NUL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNul() <em>Nul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNul()
   * @generated
   * @ordered
   */
  protected String nul = NUL_EDEFAULT;

  /**
   * The default value of the '{@link #getSes() <em>Ses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSes()
   * @generated
   * @ordered
   */
  protected static final String SES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSes() <em>Ses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSes()
   * @generated
   * @ordered
   */
  protected String ses = SES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
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
    return DimePackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars getV()
  {
    if (v != null && v.eIsProxy())
    {
      InternalEObject oldV = (InternalEObject)v;
      v = (Vars)eResolveProxy(oldV);
      if (v != oldV)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DimePackage.LITERAL__V, oldV, v));
      }
    }
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars basicGetV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Vars newV)
  {
    Vars oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.LITERAL__V, oldV, v));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNul()
  {
    return nul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNul(String newNul)
  {
    String oldNul = nul;
    nul = newNul;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.LITERAL__NUL, oldNul, nul));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSes()
  {
    return ses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSes(String newSes)
  {
    String oldSes = ses;
    ses = newSes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.LITERAL__SES, oldSes, ses));
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
      case DimePackage.LITERAL__V:
        if (resolve) return getV();
        return basicGetV();
      case DimePackage.LITERAL__NUL:
        return getNul();
      case DimePackage.LITERAL__SES:
        return getSes();
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
      case DimePackage.LITERAL__V:
        setV((Vars)newValue);
        return;
      case DimePackage.LITERAL__NUL:
        setNul((String)newValue);
        return;
      case DimePackage.LITERAL__SES:
        setSes((String)newValue);
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
      case DimePackage.LITERAL__V:
        setV((Vars)null);
        return;
      case DimePackage.LITERAL__NUL:
        setNul(NUL_EDEFAULT);
        return;
      case DimePackage.LITERAL__SES:
        setSes(SES_EDEFAULT);
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
      case DimePackage.LITERAL__V:
        return v != null;
      case DimePackage.LITERAL__NUL:
        return NUL_EDEFAULT == null ? nul != null : !NUL_EDEFAULT.equals(nul);
      case DimePackage.LITERAL__SES:
        return SES_EDEFAULT == null ? ses != null : !SES_EDEFAULT.equals(ses);
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
    result.append(" (nul: ");
    result.append(nul);
    result.append(", ses: ");
    result.append(ses);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
