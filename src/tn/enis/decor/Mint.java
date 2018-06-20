package tn.enis.decor;

import tn.enis.beverage.Beverage;

public class Mint extends CordimentDecorator {
	Beverage beverage;

	public Mint(Beverage beverage) {
		super();
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " benna3ne3";
	}

	@Override
	public double cost() {
		return 50 + beverage.cost();
	}

}

