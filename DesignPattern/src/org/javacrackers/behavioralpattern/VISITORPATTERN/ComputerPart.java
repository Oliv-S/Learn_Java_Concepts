package org.javacrackers.behavioralpattern.VISITORPATTERN;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}