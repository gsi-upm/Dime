/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Call#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getCall()
 * @model
 * @generated
 */
public interface Call extends VoiceTag
{
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
   * @see org.telcodev.dsl.dime.DimePackage#getCall_To()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getTo();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Call#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ConcatenationExpression value);

} // Call
