/**
 */
package org.telcodev.dsl.dime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.NotPrimaryParam;
import org.telcodev.dsl.dime.Param;
import org.telcodev.dsl.dime.SendBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.SendBlockImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.SendBlockImpl#getStms <em>Stms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendBlockImpl extends MinimalEObjectImpl.Container implements SendBlock
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Param value;

  /**
   * The cached value of the '{@link #getStms() <em>Stms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStms()
   * @generated
   * @ordered
   */
  protected EList<NotPrimaryParam> stms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SendBlockImpl()
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
    return DimePackage.Literals.SEND_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Param newValue, NotificationChain msgs)
  {
    Param oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DimePackage.SEND_BLOCK__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Param newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DimePackage.SEND_BLOCK__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DimePackage.SEND_BLOCK__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.SEND_BLOCK__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NotPrimaryParam> getStms()
  {
    if (stms == null)
    {
      stms = new EObjectContainmentEList<NotPrimaryParam>(NotPrimaryParam.class, this, DimePackage.SEND_BLOCK__STMS);
    }
    return stms;
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
      case DimePackage.SEND_BLOCK__VALUE:
        return basicSetValue(null, msgs);
      case DimePackage.SEND_BLOCK__STMS:
        return ((InternalEList<?>)getStms()).basicRemove(otherEnd, msgs);
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
      case DimePackage.SEND_BLOCK__VALUE:
        return getValue();
      case DimePackage.SEND_BLOCK__STMS:
        return getStms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DimePackage.SEND_BLOCK__VALUE:
        setValue((Param)newValue);
        return;
      case DimePackage.SEND_BLOCK__STMS:
        getStms().clear();
        getStms().addAll((Collection<? extends NotPrimaryParam>)newValue);
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
      case DimePackage.SEND_BLOCK__VALUE:
        setValue((Param)null);
        return;
      case DimePackage.SEND_BLOCK__STMS:
        getStms().clear();
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
      case DimePackage.SEND_BLOCK__VALUE:
        return value != null;
      case DimePackage.SEND_BLOCK__STMS:
        return stms != null && !stms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SendBlockImpl
