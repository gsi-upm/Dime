/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.NumVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.NumVariable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getNumVariable()
 * @model
 * @generated
 */
public interface NumVariable extends Statement, Vars
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.telcodev.dsl.dime.DimePackage#getNumVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.NumVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(MathExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getNumVariable_Value()
   * @model containment="true"
   * @generated
   */
  MathExpression getValue();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.NumVariable#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(MathExpression value);

} // NumVariable
