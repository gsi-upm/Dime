/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Param#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Param#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>Param Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Name</em>' attribute.
   * @see #setParamName(String)
   * @see org.telcodev.dsl.dime.DimePackage#getParam_ParamName()
   * @model
   * @generated
   */
  String getParamName();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Param#getParamName <em>Param Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param Name</em>' attribute.
   * @see #getParamName()
   * @generated
   */
  void setParamName(String value);

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
   * @see org.telcodev.dsl.dime.DimePackage#getParam_Value()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getValue();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Param#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ConcatenationExpression value);

} // Param
