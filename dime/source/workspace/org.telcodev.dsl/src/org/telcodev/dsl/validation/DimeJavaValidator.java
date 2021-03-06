package org.telcodev.dsl.validation;

import java.util.HashSet;

//import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.validation.Check;
//import org.telcodev.dsl.dime.CompareExpression;
import org.telcodev.dsl.dime.CondBlock;

import org.telcodev.dsl.dime.AbstractElement;
import org.telcodev.dsl.dime.DimePackage;
import org.telcodev.dsl.dime.Document;
import org.telcodev.dsl.dime.SendBlock;

public class DimeJavaValidator extends AbstractDimeJavaValidator {

	@Check
	public void checkSendBlockIsNotEmpty(SendBlock sendblock) {
		if (sendblock.getValue() == null) {
			error("SendBlock is empty", DimePackage.Literals.SEND_BLOCK__STMS);
		}
	}

	@Check
	public void checkCondBlockIsNotEmpty(CondBlock condblock) {
		if (condblock.getAction().getSta().size() == 0) {
			warning("ConditionalBlock is empty",
					DimePackage.Literals.COND_BLOCK__ACTION);
		}
	}

	// @Check
	// public void checkConditionIf(CompareExpression compare) {
	// boolean ok = false;
	// if (compare.getLeft().eClass().getName()
	// .equals(DimePackage.Literals.STRING_LITERAL.getName())) {
	// if (isString(compare.getRight().eClass())) {
	// if (compare.getOp().equals("==")
	// || compare.getOp().equals("!=")) {
	// ok = true;
	// }
	// }
	// } else if (compare.getLeft().eClass().getName()
	// .equals(DimePackage.Literals.NUM_LITERAL.getName())) {
	// if (isNum(compare.getRight().eClass())) {
	// ok = true;
	// }
	// } else if (compare.getLeft().eClass().getName()
	// .equals(DimePackage.Literals.BOOL_LITERAL.getName())) {
	// if (isBool(compare.getRight().eClass())) {
	// if (compare.getOp().equals("==")
	// || compare.getOp().equals("!=")) {
	// ok = true;
	// }
	// }
	// } else if (compare.getLeft().eClass().getName()
	// .equals(DimePackage.Literals.LITERAL.getName())) {
	// ok = true;
	// }
	// if (!ok) {
	// error("Check compare condition",
	// DimePackage.Literals.COMPARE_EXPRESSION__RIGHT);
	// }
	// }

	// private boolean isString(EClass clase) {
	// boolean string = false;
	// if (clase.getName().equals(
	// DimePackage.Literals.STRING_LITERAL.getName())) {
	// string = true;
	// } else if (clase.getName().equals(
	// DimePackage.Literals.LITERAL.getName())) {
	// string = true;
	// }
	// return string;
	// }
	//
	// private boolean isNum(EClass clase) {
	// boolean num = false;
	// if (clase.getName().equals(DimePackage.Literals.NUM_LITERAL.getName())) {
	// num = true;
	// } else if (clase.getName().equals(
	// DimePackage.Literals.LITERAL.getName())) {
	// num = true;
	// }
	// return num;
	// }
	//
	// private boolean isBool(EClass clase) {
	// boolean bool = false;
	// if (clase.getName().equals(DimePackage.Literals.BOOL_LITERAL.getName()))
	// {
	// bool = true;
	// } else if (clase.getName().equals(
	// DimePackage.Literals.LITERAL.getName())) {
	// bool = true;
	// }
	// return bool;
	// }
	
	
	@Check
	public void checkSeveralResult(org.telcodev.dsl.dime.State state) {
		int counter=0;
		
		for (AbstractElement c : state.getStms()) {
		
			if (c.eClass().getName().equals("Ask") ||c.eClass().getName().equals("GetDigits") ||c.eClass().getName().equals("Record") ) {
				counter++;
			}
		}
		if(counter>1){
		error("States just can contains one tag of Ask, Record or GetDigits",
				DimePackage.Literals.STATE__NAME);
		}
	}
	
	@Check
	public void checkSeveralCalls(org.telcodev.dsl.dime.State state) {
		int counter=0;
		
		for (AbstractElement c : state.getStms()) {
			if (c.eClass().getName().equals("Call") ) {
				counter++;
			}
		}
		if(counter>1){
		error("Only one call for each state",
				DimePackage.Literals.STATE__NAME);
		}
	}
	
	
	@Check
	public void checkStatesLowerCase(org.telcodev.dsl.dime.State state) {
		String name = state.getName();
		char[] characters = name.toCharArray();
		for (char character : characters) {
			if (Character.isUpperCase(character)) {
				error("States must be written in lower characters",
						DimePackage.Literals.STATE__NAME);
			}
		}
	}

	@Check
	public void checkStatesNames(Document document) {

		org.telcodev.dsl.dime.State[] states = (org.telcodev.dsl.dime.State[]) document
				.getSta().toArray();
		if (states != null) {
			HashSet<String> nameStates = new HashSet<String>();
			boolean start = false;
			for (org.telcodev.dsl.dime.State state : states) {
				String name = state.getName();

				if (nameStates.contains(name)) {
					error("There are two states with the same name",
							DimePackage.Literals.DOCUMENT__STA);
				} else {
					nameStates.add(name);
				}

				if (name.equals("start")) {
					start = true;
				}
			}
			if (!start) {
				error("There must be an state called start",
						DimePackage.Literals.DOCUMENT__STA);
			}
		}
	}

}
