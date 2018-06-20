package tn.enis.decor;

import tn.enis.beverage.Beverage;

public class Pine extends CordimentDecorator {
	Beverage beverage;

	public Pine(Beverage beverage) {
		super();
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " blpine";
	}

	@Override
	public double cost() {
		return 50 + beverage.cost();
	}

}
