/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Wait#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Seconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seconds</em>' attribute.
   * @see #setSeconds(int)
   * @see org.telcodev.dsl.dime.DimePackage#getWait_Seconds()
   * @model
   * @generated
   */
  int getSeconds();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Wait#getSeconds <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seconds</em>' attribute.
   * @see #getSeconds()
   * @generated
   */
  void setSeconds(int value);

} // Wait
