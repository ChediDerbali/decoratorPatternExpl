package tn.enis.decor;

import tn.enis.beverage.Beverage;

public abstract class CordimentDecorator extends Beverage {
	
	protected Beverage beverage;
	
	
	
	public CordimentDecorator() {
		super();
	}



	public abstract String getDescription();
	public abstract double cost();


}

