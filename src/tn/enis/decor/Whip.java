package tn.enis.decor;

import tn.enis.beverage.Beverage;

public class Whip extends CordimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		super();
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " blmouss";
	}

	@Override
	public double cost() {
		return 50 + beverage.cost();
	}

}
