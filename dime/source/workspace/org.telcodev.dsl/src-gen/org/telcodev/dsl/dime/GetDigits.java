/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Digits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.GetDigits#getNumDigits <em>Num Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getGetDigits()
 * @model
 * @generated
 */
public interface GetDigits extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Num Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Digits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Digits</em>' attribute.
   * @see #setNumDigits(int)
   * @see org.telcodev.dsl.dime.DimePackage#getGetDigits_NumDigits()
   * @model
   * @generated
   */
  int getNumDigits();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.GetDigits#getNumDigits <em>Num Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Digits</em>' attribute.
   * @see #getNumDigits()
   * @generated
   */
  void setNumDigits(int value);

} // GetDigits
