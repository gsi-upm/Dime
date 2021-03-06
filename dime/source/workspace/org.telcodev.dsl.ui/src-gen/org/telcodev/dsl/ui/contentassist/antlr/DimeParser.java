/*
* generated by Xtext
*/
package org.telcodev.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.telcodev.dsl.services.DimeGrammarAccess;

public class DimeParser extends AbstractContentAssistParser {
	
	@Inject
	private DimeGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.telcodev.dsl.ui.contentassist.antlr.internal.InternalDimeParser createParser() {
		org.telcodev.dsl.ui.contentassist.antlr.internal.InternalDimeParser result = new org.telcodev.dsl.ui.contentassist.antlr.internal.InternalDimeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getVoiceTagAccess().getAlternatives(), "rule__VoiceTag__Alternatives");
					put(grammarAccess.getTerminalBoolExpressionAccess().getAlternatives(), "rule__TerminalBoolExpression__Alternatives");
					put(grammarAccess.getMathTerminalAccess().getAlternatives(), "rule__MathTerminal__Alternatives");
					put(grammarAccess.getConcatenationTerminalAccess().getAlternatives(), "rule__ConcatenationTerminal__Alternatives");
					put(grammarAccess.getStringVariableAccess().getAlternatives_2_0(), "rule__StringVariable__Alternatives_2_0");
					put(grammarAccess.getNumVariableAccess().getAlternatives_2_0(), "rule__NumVariable__Alternatives_2_0");
					put(grammarAccess.getBoolVariableAccess().getAlternatives_2_0(), "rule__BoolVariable__Alternatives_2_0");
					put(grammarAccess.getConstantAccess().getAlternatives_2(), "rule__Constant__Alternatives_2");
					put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
					put(grammarAccess.getVarsAccess().getAlternatives(), "rule__Vars__Alternatives");
					put(grammarAccess.getLiteralAbsAccess().getAlternatives(), "rule__LiteralAbs__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getEVENTAccess().getAlternatives(), "rule__EVENT__Alternatives");
					put(grammarAccess.getSESSIONAccess().getAlternatives(), "rule__SESSION__Alternatives");
					put(grammarAccess.getCALLSTATUSAccess().getAlternatives(), "rule__CALLSTATUS__Alternatives");
					put(grammarAccess.getDocumentAccess().getGroup(), "rule__Document__Group__0");
					put(grammarAccess.getStateAccess().getGroup_0(), "rule__State__Group_0__0");
					put(grammarAccess.getStateAccess().getGroup_0_2(), "rule__State__Group_0_2__0");
					put(grammarAccess.getStateAccess().getGroup_1(), "rule__State__Group_1__0");
					put(grammarAccess.getStateAccess().getGroup_1_0(), "rule__State__Group_1_0__0");
					put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
					put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getDialAccess().getGroup(), "rule__Dial__Group__0");
					put(grammarAccess.getPlayAccess().getGroup(), "rule__Play__Group__0");
					put(grammarAccess.getRecordAccess().getGroup(), "rule__Record__Group__0");
					put(grammarAccess.getGetDigitsAccess().getGroup(), "rule__GetDigits__Group__0");
					put(grammarAccess.getSendAccess().getGroup(), "rule__Send__Group__0");
					put(grammarAccess.getSendBlockAccess().getGroup(), "rule__SendBlock__Group__0");
					put(grammarAccess.getNotPrimaryParamAccess().getGroup(), "rule__NotPrimaryParam__Group__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getSayAccess().getGroup(), "rule__Say__Group__0");
					put(grammarAccess.getSmsAccess().getGroup(), "rule__Sms__Group__0");
					put(grammarAccess.getEmailAccess().getGroup(), "rule__Email__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getIfExpAccess().getGroup(), "rule__IfExp__Group__0");
					put(grammarAccess.getIfExpAccess().getGroup_1(), "rule__IfExp__Group_1__0");
					put(grammarAccess.getIfExpAccess().getGroup_2(), "rule__IfExp__Group_2__0");
					put(grammarAccess.getCondBlockAccess().getGroup(), "rule__CondBlock__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBoolExpressionAccess().getGroup(), "rule__BoolExpression__Group__0");
					put(grammarAccess.getBoolExpressionAccess().getGroup_1(), "rule__BoolExpression__Group_1__0");
					put(grammarAccess.getBracketsAccess().getGroup(), "rule__Brackets__Group__0");
					put(grammarAccess.getCompareExpressionAccess().getGroup(), "rule__CompareExpression__Group__0");
					put(grammarAccess.getNegExpressionAccess().getGroup(), "rule__NegExpression__Group__0");
					put(grammarAccess.getMathExpressionAccess().getGroup(), "rule__MathExpression__Group__0");
					put(grammarAccess.getMathExpressionAccess().getGroup_1(), "rule__MathExpression__Group_1__0");
					put(grammarAccess.getMathBracketsAccess().getGroup(), "rule__MathBrackets__Group__0");
					put(grammarAccess.getConcatenationExpressionAccess().getGroup(), "rule__ConcatenationExpression__Group__0");
					put(grammarAccess.getConcatenationExpressionAccess().getGroup_1(), "rule__ConcatenationExpression__Group_1__0");
					put(grammarAccess.getConcatenationBracketsAccess().getGroup(), "rule__ConcatenationBrackets__Group__0");
					put(grammarAccess.getStringVariableAccess().getGroup(), "rule__StringVariable__Group__0");
					put(grammarAccess.getStringVariableAccess().getGroup_2(), "rule__StringVariable__Group_2__0");
					put(grammarAccess.getNumVariableAccess().getGroup(), "rule__NumVariable__Group__0");
					put(grammarAccess.getNumVariableAccess().getGroup_2(), "rule__NumVariable__Group_2__0");
					put(grammarAccess.getBoolVariableAccess().getGroup(), "rule__BoolVariable__Group__0");
					put(grammarAccess.getBoolVariableAccess().getGroup_2(), "rule__BoolVariable__Group_2__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getBoolLiteralAccess().getGroup(), "rule__BoolLiteral__Group__0");
					put(grammarAccess.getNumLiteralAccess().getGroup(), "rule__NumLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getDocumentAccess().getNameAssignment_1(), "rule__Document__NameAssignment_1");
					put(grammarAccess.getDocumentAccess().getElementsAssignment_2(), "rule__Document__ElementsAssignment_2");
					put(grammarAccess.getDocumentAccess().getStaAssignment_3(), "rule__Document__StaAssignment_3");
					put(grammarAccess.getStatementAccess().getComAssignment_4(), "rule__Statement__ComAssignment_4");
					put(grammarAccess.getStateAccess().getNameAssignment_0_1(), "rule__State__NameAssignment_0_1");
					put(grammarAccess.getStateAccess().getTimesAssignment_0_2_1(), "rule__State__TimesAssignment_0_2_1");
					put(grammarAccess.getStateAccess().getTimeoutAssignment_1_0_1(), "rule__State__TimeoutAssignment_1_0_1");
					put(grammarAccess.getStateAccess().getStmsAssignment_1_2(), "rule__State__StmsAssignment_1_2");
					put(grammarAccess.getWaitAccess().getNameAssignment_0(), "rule__Wait__NameAssignment_0");
					put(grammarAccess.getWaitAccess().getSecondsAssignment_1(), "rule__Wait__SecondsAssignment_1");
					put(grammarAccess.getDataAccess().getNameAssignment_0(), "rule__Data__NameAssignment_0");
					put(grammarAccess.getDataAccess().getVariAssignment_1(), "rule__Data__VariAssignment_1");
					put(grammarAccess.getDataAccess().getValueAssignment_3(), "rule__Data__ValueAssignment_3");
					put(grammarAccess.getDataAccess().getStmsAssignment_4(), "rule__Data__StmsAssignment_4");
					put(grammarAccess.getDataAccess().getUrlAssignment_7(), "rule__Data__UrlAssignment_7");
					put(grammarAccess.getCallAccess().getNameAssignment_0(), "rule__Call__NameAssignment_0");
					put(grammarAccess.getCallAccess().getToAssignment_1(), "rule__Call__ToAssignment_1");
					put(grammarAccess.getDialAccess().getNameAssignment_0(), "rule__Dial__NameAssignment_0");
					put(grammarAccess.getDialAccess().getToAssignment_1(), "rule__Dial__ToAssignment_1");
					put(grammarAccess.getPlayAccess().getNameAssignment_0(), "rule__Play__NameAssignment_0");
					put(grammarAccess.getPlayAccess().getFileAssignment_1(), "rule__Play__FileAssignment_1");
					put(grammarAccess.getRecordAccess().getNameAssignment_0(), "rule__Record__NameAssignment_0");
					put(grammarAccess.getRecordAccess().getTimeAssignment_1(), "rule__Record__TimeAssignment_1");
					put(grammarAccess.getRejectAccess().getNameAssignment(), "rule__Reject__NameAssignment");
					put(grammarAccess.getHangupAccess().getNameAssignment(), "rule__Hangup__NameAssignment");
					put(grammarAccess.getGetDigitsAccess().getNameAssignment_0(), "rule__GetDigits__NameAssignment_0");
					put(grammarAccess.getGetDigitsAccess().getNumDigitsAssignment_1(), "rule__GetDigits__NumDigitsAssignment_1");
					put(grammarAccess.getSendAccess().getNameAssignment_0(), "rule__Send__NameAssignment_0");
					put(grammarAccess.getSendAccess().getParamsAssignment_1(), "rule__Send__ParamsAssignment_1");
					put(grammarAccess.getSendAccess().getUrlAssignment_3(), "rule__Send__UrlAssignment_3");
					put(grammarAccess.getSendBlockAccess().getValueAssignment_2(), "rule__SendBlock__ValueAssignment_2");
					put(grammarAccess.getSendBlockAccess().getStmsAssignment_3(), "rule__SendBlock__StmsAssignment_3");
					put(grammarAccess.getNotPrimaryParamAccess().getValueAssignment_1(), "rule__NotPrimaryParam__ValueAssignment_1");
					put(grammarAccess.getParamAccess().getNameAssignment_0(), "rule__Param__NameAssignment_0");
					put(grammarAccess.getParamAccess().getValueAssignment_2(), "rule__Param__ValueAssignment_2");
					put(grammarAccess.getSayAccess().getNameAssignment_0(), "rule__Say__NameAssignment_0");
					put(grammarAccess.getSayAccess().getThatAssignment_1(), "rule__Say__ThatAssignment_1");
					put(grammarAccess.getSmsAccess().getNameAssignment_0(), "rule__Sms__NameAssignment_0");
					put(grammarAccess.getSmsAccess().getValueAssignment_1(), "rule__Sms__ValueAssignment_1");
					put(grammarAccess.getSmsAccess().getToAssignment_3(), "rule__Sms__ToAssignment_3");
					put(grammarAccess.getEmailAccess().getNameAssignment_0(), "rule__Email__NameAssignment_0");
					put(grammarAccess.getEmailAccess().getTitleAssignment_4(), "rule__Email__TitleAssignment_4");
					put(grammarAccess.getEmailAccess().getFromAssignment_8(), "rule__Email__FromAssignment_8");
					put(grammarAccess.getEmailAccess().getValueAssignment_12(), "rule__Email__ValueAssignment_12");
					put(grammarAccess.getEmailAccess().getToAssignment_15(), "rule__Email__ToAssignment_15");
					put(grammarAccess.getTransitionAccess().getNameAssignment_0(), "rule__Transition__NameAssignment_0");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_1(), "rule__Transition__TargetAssignment_1");
					put(grammarAccess.getTransitionAccess().getEventAssignment_3(), "rule__Transition__EventAssignment_3");
					put(grammarAccess.getIfExpAccess().getBlockAssignment_0(), "rule__IfExp__BlockAssignment_0");
					put(grammarAccess.getIfExpAccess().getBlocksAssignment_1_1(), "rule__IfExp__BlocksAssignment_1_1");
					put(grammarAccess.getIfExpAccess().getDefaultBlockAssignment_2_1(), "rule__IfExp__DefaultBlockAssignment_2_1");
					put(grammarAccess.getCondBlockAccess().getCondAssignment_1(), "rule__CondBlock__CondAssignment_1");
					put(grammarAccess.getCondBlockAccess().getActionAssignment_2(), "rule__CondBlock__ActionAssignment_2");
					put(grammarAccess.getBlockAccess().getStaAssignment_2(), "rule__Block__StaAssignment_2");
					put(grammarAccess.getBoolExpressionAccess().getOpAssignment_1_1(), "rule__BoolExpression__OpAssignment_1_1");
					put(grammarAccess.getBoolExpressionAccess().getRightAssignment_1_2(), "rule__BoolExpression__RightAssignment_1_2");
					put(grammarAccess.getBracketsAccess().getOpenAssignment_0(), "rule__Brackets__OpenAssignment_0");
					put(grammarAccess.getBracketsAccess().getObjAssignment_1(), "rule__Brackets__ObjAssignment_1");
					put(grammarAccess.getBracketsAccess().getCloseAssignment_2(), "rule__Brackets__CloseAssignment_2");
					put(grammarAccess.getCompareExpressionAccess().getLeftAssignment_0(), "rule__CompareExpression__LeftAssignment_0");
					put(grammarAccess.getCompareExpressionAccess().getOpAssignment_1(), "rule__CompareExpression__OpAssignment_1");
					put(grammarAccess.getCompareExpressionAccess().getRightAssignment_2(), "rule__CompareExpression__RightAssignment_2");
					put(grammarAccess.getNegExpressionAccess().getOpAssignment_0(), "rule__NegExpression__OpAssignment_0");
					put(grammarAccess.getNegExpressionAccess().getObjAssignment_1(), "rule__NegExpression__ObjAssignment_1");
					put(grammarAccess.getMathExpressionAccess().getOpAssignment_1_1(), "rule__MathExpression__OpAssignment_1_1");
					put(grammarAccess.getMathExpressionAccess().getRightAssignment_1_2(), "rule__MathExpression__RightAssignment_1_2");
					put(grammarAccess.getMathBracketsAccess().getOpenAssignment_0(), "rule__MathBrackets__OpenAssignment_0");
					put(grammarAccess.getMathBracketsAccess().getObjAssignment_1(), "rule__MathBrackets__ObjAssignment_1");
					put(grammarAccess.getMathBracketsAccess().getCloseAssignment_2(), "rule__MathBrackets__CloseAssignment_2");
					put(grammarAccess.getConcatenationExpressionAccess().getOpAssignment_1_1(), "rule__ConcatenationExpression__OpAssignment_1_1");
					put(grammarAccess.getConcatenationExpressionAccess().getRightAssignment_1_2(), "rule__ConcatenationExpression__RightAssignment_1_2");
					put(grammarAccess.getConcatenationBracketsAccess().getOpenAssignment_0(), "rule__ConcatenationBrackets__OpenAssignment_0");
					put(grammarAccess.getConcatenationBracketsAccess().getObjAssignment_1(), "rule__ConcatenationBrackets__ObjAssignment_1");
					put(grammarAccess.getConcatenationBracketsAccess().getCloseAssignment_2(), "rule__ConcatenationBrackets__CloseAssignment_2");
					put(grammarAccess.getStringVariableAccess().getNameAssignment_1(), "rule__StringVariable__NameAssignment_1");
					put(grammarAccess.getStringVariableAccess().getValueAssignment_2_1(), "rule__StringVariable__ValueAssignment_2_1");
					put(grammarAccess.getNumVariableAccess().getNameAssignment_1(), "rule__NumVariable__NameAssignment_1");
					put(grammarAccess.getNumVariableAccess().getValueAssignment_2_1(), "rule__NumVariable__ValueAssignment_2_1");
					put(grammarAccess.getBoolVariableAccess().getNameAssignment_1(), "rule__BoolVariable__NameAssignment_1");
					put(grammarAccess.getBoolVariableAccess().getValueAssignment_2_1(), "rule__BoolVariable__ValueAssignment_2_1");
					put(grammarAccess.getConstantAccess().getNameAssignment_1(), "rule__Constant__NameAssignment_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_3(), "rule__Constant__ValueAssignment_3");
					put(grammarAccess.getLiteralAccess().getVAssignment_0(), "rule__Literal__VAssignment_0");
					put(grammarAccess.getLiteralAccess().getNulAssignment_1(), "rule__Literal__NulAssignment_1");
					put(grammarAccess.getBoolLiteralAccess().getValueAssignment_1(), "rule__BoolLiteral__ValueAssignment_1");
					put(grammarAccess.getNumLiteralAccess().getValueAssignment_1(), "rule__NumLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
					put(grammarAccess.getEVENTAccess().getNameAssignment_0(), "rule__EVENT__NameAssignment_0");
					put(grammarAccess.getEVENTAccess().getNameAssignment_1(), "rule__EVENT__NameAssignment_1");
					put(grammarAccess.getEVENTAccess().getNameAssignment_2(), "rule__EVENT__NameAssignment_2");
					put(grammarAccess.getEVENTAccess().getNameAssignment_3(), "rule__EVENT__NameAssignment_3");
					put(grammarAccess.getSESSIONAccess().getNameAssignment_0(), "rule__SESSION__NameAssignment_0");
					put(grammarAccess.getSESSIONAccess().getNameAssignment_1(), "rule__SESSION__NameAssignment_1");
					put(grammarAccess.getSESSIONAccess().getNameAssignment_2(), "rule__SESSION__NameAssignment_2");
					put(grammarAccess.getSESSIONAccess().getNameAssignment_3(), "rule__SESSION__NameAssignment_3");
					put(grammarAccess.getSESSIONAccess().getNameAssignment_4(), "rule__SESSION__NameAssignment_4");
					put(grammarAccess.getSESSIONAccess().getNameAssignment_5(), "rule__SESSION__NameAssignment_5");
					put(grammarAccess.getCALLSTATUSAccess().getNameAssignment_0(), "rule__CALLSTATUS__NameAssignment_0");
					put(grammarAccess.getCALLSTATUSAccess().getNameAssignment_1(), "rule__CALLSTATUS__NameAssignment_1");
					put(grammarAccess.getCALLSTATUSAccess().getNameAssignment_2(), "rule__CALLSTATUS__NameAssignment_2");
					put(grammarAccess.getCALLSTATUSAccess().getNameAssignment_3(), "rule__CALLSTATUS__NameAssignment_3");
					put(grammarAccess.getStateAccess().getUnorderedGroup(), "rule__State__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.telcodev.dsl.ui.contentassist.antlr.internal.InternalDimeParser typedParser = (org.telcodev.dsl.ui.contentassist.antlr.internal.InternalDimeParser) parser;
			typedParser.entryRuleDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DimeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DimeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
