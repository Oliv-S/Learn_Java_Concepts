package org.javacrackers.behavioralpattern.VISITORPATTERN;

public class Mouse implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {

		computerPartVisitor.visit(this);
	}
}
