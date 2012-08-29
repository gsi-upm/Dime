/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Literal#getV <em>V</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Literal#getNul <em>Nul</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends BoolExpression, MathExpression, LiteralAbs
{
  /**
   * Returns the value of the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' reference.
   * @see #setV(Vars)
   * @see org.telcodev.dsl.dime.DimePackage#getLiteral_V()
   * @model
   * @generated
   */
  Vars getV();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Literal#getV <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' reference.
   * @see #getV()
   * @generated
   */
  void setV(Vars value);

  /**
   * Returns the value of the '<em><b>Nul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nul</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nul</em>' attribute.
   * @see #setNul(String)
   * @see org.telcodev.dsl.dime.DimePackage#getLiteral_Nul()
   * @model
   * @generated
   */
  String getNul();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Literal#getNul <em>Nul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nul</em>' attribute.
   * @see #getNul()
   * @generated
   */
  void setNul(String value);

} // Literal
