package org.javacrackers.CreationalPatterns.BUILDERPATTERN;

public abstract class ColdDrink implements Item {
	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
}