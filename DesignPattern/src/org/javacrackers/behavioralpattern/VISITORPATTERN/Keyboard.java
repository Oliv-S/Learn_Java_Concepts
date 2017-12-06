package org.javacrackers.behavioralpattern.VISITORPATTERN;

public class Keyboard implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}