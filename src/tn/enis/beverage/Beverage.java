package tn.enis.beverage;

public abstract class Beverage {
	protected String description = "N/A";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}