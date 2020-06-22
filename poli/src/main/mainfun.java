package main;

import phone.nokia330919;
import phone.phone;
import phone.samsung;

public class mainfun {

	public static void main(String[] args) {
		phone iphone= new phone("iphonex");
		phone samsung = new nokia330919("samsungnot8");
		
		System.out.println(samsung.feature());
		phone phone1 = new samsung("nokia 120");
		System.out.println(phone1.getmodel());
		System.out.println(phone1.feature());
	}

}
