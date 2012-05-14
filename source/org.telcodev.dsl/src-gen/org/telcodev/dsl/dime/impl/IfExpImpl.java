/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.telcodev.dsl.dime.Block;
import org.telcodev.dsl.dime.CondBlock;
import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.IfExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.impl.IfExpImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.IfExpImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.impl.IfExpImpl#getDefaultBlock <em>Default Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfExpImpl extends AbstractElementImpl implements IfExp
{
  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected CondBlock block;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<CondBlock> blocks;

  /**
   * The cached value of the '{@link #getDefaultBlock() <em>Default Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultBlock()
   * @generated
   * @ordered
   */
  protected Block defaultBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfExpImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DimePackage.Literals.IF_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondBlock getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(CondBlock newBlock, NotificationChain msgs)
  {
    CondBlock oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DimePackage.IF_EXP__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(CondBlock newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DimePackage.IF_EXP__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DimePackage.IF_EXP__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.IF_EXP__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CondBlock> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<CondBlock>(CondBlock.class, this, DimePackage.IF_EXP__BLOCKS);
    }
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getDefaultBlock()
  {
    return defaultBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultBlock(Block newDefaultBlock, NotificationChain msgs)
  {
    Block oldDefaultBlock = defaultBlock;
    defaultBlock = newDefaultBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DimePackage.IF_EXP__DEFAULT_BLOCK, oldDefaultBlock, newDefaultBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultBlock(Block newDefaultBlock)
  {
    if (newDefaultBlock != defaultBlock)
    {
      NotificationChain msgs = null;
      if (defaultBlock != null)
        msgs = ((InternalEObject)defaultBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DimePackage.IF_EXP__DEFAULT_BLOCK, null, msgs);
      if (newDefaultBlock != null)
        msgs = ((InternalEObject)newDefaultBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DimePackage.IF_EXP__DEFAULT_BLOCK, null, msgs);
      msgs = basicSetDefaultBlock(newDefaultBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DimePackage.IF_EXP__DEFAULT_BLOCK, newDefaultBlock, newDefaultBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DimePackage.IF_EXP__BLOCK:
        return basicSetBlock(null, msgs);
      case DimePackage.IF_EXP__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
      case DimePackage.IF_EXP__DEFAULT_BLOCK:
        return basicSetDefaultBlock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DimePackage.IF_EXP__BLOCK:
        return getBlock();
      case DimePackage.IF_EXP__BLOCKS:
        return getBlocks();
      case DimePackage.IF_EXP__DEFAULT_BLOCK:
        return getDefaultBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DimePackage.IF_EXP__BLOCK:
        setBlock((CondBlock)newValue);
        return;
      case DimePackage.IF_EXP__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends CondBlock>)newValue);
        return;
      case DimePackage.IF_EXP__DEFAULT_BLOCK:
        setDefaultBlock((Block)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DimePackage.IF_EXP__BLOCK:
        setBlock((CondBlock)null);
        return;
      case DimePackage.IF_EXP__BLOCKS:
        getBlocks().clear();
        return;
      case DimePackage.IF_EXP__DEFAULT_BLOCK:
        setDefaultBlock((Block)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DimePackage.IF_EXP__BLOCK:
        return block != null;
      case DimePackage.IF_EXP__BLOCKS:
        return blocks != null && !blocks.isEmpty();
      case DimePackage.IF_EXP__DEFAULT_BLOCK:
        return defaultBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //IfExpImpl
