package org.javacrackers.structuralpattern.FILTERPATTERN;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}