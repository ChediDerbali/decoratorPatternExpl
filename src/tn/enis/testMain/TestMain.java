package tn.enis.testMain;

import tn.enis.beverage.Beverage;
import tn.enis.beverage.Tea;
import tn.enis.decor.Mint;

public class TestMain {

	public static void main(String[] args) {
		Beverage b= new Tea();
		System.out.println(b.getDescription()+" B"+b.cost());
		b=new Mint(b);
		System.out.println(b.getDescription()+" B"+b.cost());


	}

}
