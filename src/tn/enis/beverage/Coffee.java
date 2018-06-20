package tn.enis.beverage;

public class Coffee extends Beverage {

	@Override
	public double cost() {
		return 700;
	}

	public Coffee() {
		super();
		description="coffee";
	}
	
	
	

}
