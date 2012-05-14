/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If State Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.IfStateExp#getBlock <em>Block</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.IfStateExp#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.IfStateExp#getDefaultBlock <em>Default Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getIfStateExp()
 * @model
 * @generated
 */
public interface IfStateExp extends StateAbstractElement
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(CondStateBlock)
   * @see org.telcodev.dsl.dime.DimePackage#getIfStateExp_Block()
   * @model containment="true"
   * @generated
   */
  CondStateBlock getBlock();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.IfStateExp#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(CondStateBlock value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.CondStateBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getIfStateExp_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<CondStateBlock> getBlocks();

  /**
   * Returns the value of the '<em><b>Default Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Block</em>' containment reference.
   * @see #setDefaultBlock(BlockState)
   * @see org.telcodev.dsl.dime.DimePackage#getIfStateExp_DefaultBlock()
   * @model containment="true"
   * @generated
   */
  BlockState getDefaultBlock();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.IfStateExp#getDefaultBlock <em>Default Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Block</em>' containment reference.
   * @see #getDefaultBlock()
   * @generated
   */
  void setDefaultBlock(BlockState value);

} // IfStateExp
