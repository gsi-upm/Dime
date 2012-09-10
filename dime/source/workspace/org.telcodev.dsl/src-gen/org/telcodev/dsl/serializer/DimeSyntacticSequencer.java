package org.telcodev.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.telcodev.dsl.services.DimeGrammarAccess;

@SuppressWarnings("all")
public class DimeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DimeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BoolVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1;
	protected AbstractElementAlias match_Constant_EqualsSignKeyword_2_0_or_SpaceEqualsSignSpaceKeyword_2_1;
	protected AbstractElementAlias match_NumVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1;
	protected AbstractElementAlias match_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__a;
	protected AbstractElementAlias match_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__p;
	protected AbstractElementAlias match_State___RightCurlyBracketKeyword_1_3_LeftCurlyBracketKeyword_1_1__a;
	protected AbstractElementAlias match_StringVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DimeGrammarAccess) access;
		match_BoolVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBoolVariableAccess().getEqualsSignKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getBoolVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()));
		match_Constant_EqualsSignKeyword_2_0_or_SpaceEqualsSignSpaceKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstantAccess().getEqualsSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getSpaceEqualsSignSpaceKeyword_2_1()));
		match_NumVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNumVariableAccess().getEqualsSignKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getNumVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()));
		match_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()));
		match_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()));
		match_State___RightCurlyBracketKeyword_1_3_LeftCurlyBracketKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_1()));
		match_StringVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStringVariableAccess().getEqualsSignKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getStringVariableAccess().getSpaceEqualsSignSpaceKeyword_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BoolVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1.equals(syntax))
				emit_BoolVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Constant_EqualsSignKeyword_2_0_or_SpaceEqualsSignSpaceKeyword_2_1.equals(syntax))
				emit_Constant_EqualsSignKeyword_2_0_or_SpaceEqualsSignSpaceKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NumVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1.equals(syntax))
				emit_NumVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__a.equals(syntax))
				emit_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__p.equals(syntax))
				emit_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_State___RightCurlyBracketKeyword_1_3_LeftCurlyBracketKeyword_1_1__a.equals(syntax))
				emit_State___RightCurlyBracketKeyword_1_3_LeftCurlyBracketKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StringVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1.equals(syntax))
				emit_StringVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ' = ' | '='
	 */
	protected void emit_BoolVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' = ' | '='
	 */
	protected void emit_Constant_EqualsSignKeyword_2_0_or_SpaceEqualsSignSpaceKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=' | ' = '
	 */
	protected void emit_NumVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')*
	 */
	protected void emit_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')+
	 */
	protected void emit_State___LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' '{')*
	 */
	protected void emit_State___RightCurlyBracketKeyword_1_3_LeftCurlyBracketKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' = ' | '='
	 */
	protected void emit_StringVariable_EqualsSignKeyword_2_0_0_or_SpaceEqualsSignSpaceKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
