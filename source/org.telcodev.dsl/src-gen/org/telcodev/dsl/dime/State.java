/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.State#getName <em>Name</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.State#getTimes <em>Times</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.State#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.State#getStms <em>Stms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
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
   * @see org.telcodev.dsl.dime.DimePackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Times</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Times</em>' attribute.
   * @see #setTimes(int)
   * @see org.telcodev.dsl.dime.DimePackage#getState_Times()
   * @model
   * @generated
   */
  int getTimes();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.State#getTimes <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Times</em>' attribute.
   * @see #getTimes()
   * @generated
   */
  void setTimes(int value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #setTimeout(int)
   * @see org.telcodev.dsl.dime.DimePackage#getState_Timeout()
   * @model
   * @generated
   */
  int getTimeout();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.State#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(int value);

  /**
   * Returns the value of the '<em><b>Stms</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.StateAbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stms</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getState_Stms()
   * @model containment="true"
   * @generated
   */
  EList<StateAbstractElement> getStms();

} // State
