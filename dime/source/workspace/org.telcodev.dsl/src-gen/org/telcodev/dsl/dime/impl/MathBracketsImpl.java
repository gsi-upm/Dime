/**
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.MathBrackets;
import org.telcodev.dsl.dime.MathExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Brackets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.MathBracketsImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.MathBracketsImpl#getObj <em>Obj</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.MathBracketsImpl#getClose <em>Close</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MathBracketsImpl extends MathExpressionImpl implements MathBrackets
{
  /**
   * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpen()
   * @generated
   * @ordered
   */
  protected static final String OPEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpen()
   * @generated
   * @ordered
   */
  protected String open = OPEN_EDEFAULT;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected MathExpression obj;

  /**
   * The default value of the '{@link #getClose() <em>Close</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClose()
   * @generated
   * @ordered
   */
  protected static final String CLOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClose() <em>Close</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClose()
   * @generated
   * @ordered
   */
  protected String close = CLOSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MathBracketsImpl()
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
    return DimePackage.Literals.MATH_BRACKETS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpen()
  {
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpen(String newOpen)
  {
    String oldOpen = open;
    open = newOpen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.MATH_BRACKETS__OPEN, oldOpen, open));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathExpression getObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObj(MathExpression newObj, NotificationChain msgs)
  {
    MathExpression oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DimePackage.MATH_BRACKETS__OBJ, oldObj, newObj);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(MathExpression newObj)
  {
    if (newObj != obj)
    {
      NotificationChain msgs = null;
      if (obj != null)
        msgs = ((InternalEObject)obj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DimePackage.MATH_BRACKETS__OBJ, null, msgs);
      if (newObj != null)
        msgs = ((InternalEObject)newObj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DimePackage.MATH_BRACKETS__OBJ, null, msgs);
      msgs = basicSetObj(newObj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.MATH_BRACKETS__OBJ, newObj, newObj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClose()
  {
    return close;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClose(String newClose)
  {
    String oldClose = close;
    close = newClose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.MATH_BRACKETS__CLOSE, oldClose, close));
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
      case DimePackage.MATH_BRACKETS__OBJ:
        return basicSetObj(null, msgs);
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
      case DimePackage.MATH_BRACKETS__OPEN:
        return getOpen();
      case DimePackage.MATH_BRACKETS__OBJ:
        return getObj();
      case DimePackage.MATH_BRACKETS__CLOSE:
        return getClose();
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
      case DimePackage.MATH_BRACKETS__OPEN:
        setOpen((String)newValue);
        return;
      case DimePackage.MATH_BRACKETS__OBJ:
        setObj((MathExpression)newValue);
        return;
      case DimePackage.MATH_BRACKETS__CLOSE:
        setClose((String)newValue);
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
      case DimePackage.MATH_BRACKETS__OPEN:
        setOpen(OPEN_EDEFAULT);
        return;
      case DimePackage.MATH_BRACKETS__OBJ:
        setObj((MathExpression)null);
        return;
      case DimePackage.MATH_BRACKETS__CLOSE:
        setClose(CLOSE_EDEFAULT);
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
      case DimePackage.MATH_BRACKETS__OPEN:
        return OPEN_EDEFAULT == null ? open != null : !OPEN_EDEFAULT.equals(open);
      case DimePackage.MATH_BRACKETS__OBJ:
        return obj != null;
      case DimePackage.MATH_BRACKETS__CLOSE:
        return CLOSE_EDEFAULT == null ? close != null : !CLOSE_EDEFAULT.equals(close);
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
    result.append(" (open: ");
    result.append(open);
    result.append(", close: ");
    result.append(close);
    result.append(')');
    return result.toString();
  }

} //MathBracketsImpl
