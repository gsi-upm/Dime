/**
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Document#getName <em>Name</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Document#getElements <em>Elements</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Document#getSta <em>Sta</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
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
   * @see org.telcodev.dsl.dime.DimePackage#getDocument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Document#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getDocument_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElements();

  /**
   * Returns the value of the '<em><b>Sta</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sta</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sta</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getDocument_Sta()
   * @model containment="true"
   * @generated
   */
  EList<State> getSta();

} // Document
