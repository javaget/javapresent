package vehicles;

import vehicle.vehil;

public class bike extends vehil {
	private String handel;
	public String getHandel() {
		return handel;
	}
	public bike(String engine,int seat,int wheels,String fualtank,String light){
     super(engine,seat,wheels,fualtank,light);	   
	}
	
}

