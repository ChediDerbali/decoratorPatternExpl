package tn.enis.decor;

import tn.enis.beverage.Beverage;

public class Milk extends CordimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		super();
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " bl7lib";
	}

	@Override
	public double cost() {
		return 50 + beverage.cost();
	}

}
