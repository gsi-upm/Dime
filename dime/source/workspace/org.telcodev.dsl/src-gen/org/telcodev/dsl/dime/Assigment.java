/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Assigment#getVa <em>Va</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Assigment#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getAssigment()
 * @model
 * @generated
 */
public interface Assigment extends Statement
{
  /**
   * Returns the value of the '<em><b>Va</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Va</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Va</em>' reference.
   * @see #setVa(Vars)
   * @see org.telcodev.dsl.dime.DimePackage#getAssigment_Va()
   * @model
   * @generated
   */
  Vars getVa();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Assigment#getVa <em>Va</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Va</em>' reference.
   * @see #getVa()
   * @generated
   */
  void setVa(Vars value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(MathExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getAssigment_Right()
   * @model containment="true"
   * @generated
   */
  MathExpression getRight();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Assigment#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(MathExpression value);

} // Assigment
