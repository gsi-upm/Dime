/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Sms#getValue <em>Value</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Sms#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getSms()
 * @model
 * @generated
 */
public interface Sms extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getSms_Value()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getValue();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Sms#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ConcatenationExpression value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getSms_To()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getTo();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Sms#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ConcatenationExpression value);

} // Sms
