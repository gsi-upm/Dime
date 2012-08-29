/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Say</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Say#getThat <em>That</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getSay()
 * @model
 * @generated
 */
public interface Say extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>That</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>That</em>' containment reference.
   * @see #setThat(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getSay_That()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getThat();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Say#getThat <em>That</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>That</em>' containment reference.
   * @see #getThat()
   * @generated
   */
  void setThat(ConcatenationExpression value);

} // Say
