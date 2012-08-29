/**
 */
package org.telcodev.dsl.dime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.telcodev.dsl.dime.Ask;
import org.telcodev.dsl.dime.ConcatenationExpression;
import org.telcodev.dsl.dime.DimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.AskImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.AskImpl#getVari <em>Vari</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AskImpl extends VoiceTagImpl implements Ask
{
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
   * The default value of the '{@link #getVari() <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected static final String VARI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVari() <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected String vari = VARI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AskImpl()
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
    return DimePackage.Literals.ASK;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DimePackage.ASK__QUESTION, oldQuestion, newQuestion);
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
        msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DimePackage.ASK__QUESTION, null, msgs);
      if (newQuestion != null)
        msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DimePackage.ASK__QUESTION, null, msgs);
      msgs = basicSetQuestion(newQuestion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.ASK__QUESTION, newQuestion, newQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVari()
  {
    return vari;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVari(String newVari)
  {
    String oldVari = vari;
    vari = newVari;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.ASK__VARI, oldVari, vari));
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
      case DimePackage.ASK__QUESTION:
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
      case DimePackage.ASK__QUESTION:
        return getQuestion();
      case DimePackage.ASK__VARI:
        return getVari();
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
      case DimePackage.ASK__QUESTION:
        setQuestion((ConcatenationExpression)newValue);
        return;
      case DimePackage.ASK__VARI:
        setVari((String)newValue);
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
      case DimePackage.ASK__QUESTION:
        setQuestion((ConcatenationExpression)null);
        return;
      case DimePackage.ASK__VARI:
        setVari(VARI_EDEFAULT);
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
      case DimePackage.ASK__QUESTION:
        return question != null;
      case DimePackage.ASK__VARI:
        return VARI_EDEFAULT == null ? vari != null : !VARI_EDEFAULT.equals(vari);
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
    result.append(" (vari: ");
    result.append(vari);
    result.append(')');
    return result.toString();
  }

} //AskImpl