/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond State Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.CondStateBlock#getCond <em>Cond</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.CondStateBlock#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getCondStateBlock()
 * @model
 * @generated
 */
public interface CondStateBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(BoolExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getCondStateBlock_Cond()
   * @model containment="true"
   * @generated
   */
  BoolExpression getCond();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.CondStateBlock#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(BoolExpression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(BlockState)
   * @see org.telcodev.dsl.dime.DimePackage#getCondStateBlock_Action()
   * @model containment="true"
   * @generated
   */
  BlockState getAction();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.CondStateBlock#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(BlockState value);

} // CondStateBlock
