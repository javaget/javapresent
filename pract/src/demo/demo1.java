package demo;

import vehicles.bike;
import vehicles.cars;

public class demo1 {

	public static void main(String[] args) {
		 cars car = new cars("iron","cool","boss","large");
		 System.out.println(car.getstearing());
		bike Bike = new bike("super",4,4,"petrol","LED");
	     System.out.println(Bike.toString());
	}
	
}
