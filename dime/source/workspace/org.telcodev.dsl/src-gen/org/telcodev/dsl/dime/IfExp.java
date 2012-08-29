/**
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.IfExp#getBlock <em>Block</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.IfExp#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.IfExp#getDefaultBlock <em>Default Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getIfExp()
 * @model
 * @generated
 */
public interface IfExp extends AbstractElement
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
   * @see #setBlock(CondBlock)
   * @see org.telcodev.dsl.dime.DimePackage#getIfExp_Block()
   * @model containment="true"
   * @generated
   */
  CondBlock getBlock();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.IfExp#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(CondBlock value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.CondBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getIfExp_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<CondBlock> getBlocks();

  /**
   * Returns the value of the '<em><b>Default Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Block</em>' containment reference.
   * @see #setDefaultBlock(Block)
   * @see org.telcodev.dsl.dime.DimePackage#getIfExp_DefaultBlock()
   * @model containment="true"
   * @generated
   */
  Block getDefaultBlock();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.IfExp#getDefaultBlock <em>Default Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Block</em>' containment reference.
   * @see #getDefaultBlock()
   * @generated
   */
  void setDefaultBlock(Block value);

} // IfExp
