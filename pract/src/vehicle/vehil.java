package vehicle;

public class vehil {
  public String getEngine() {
		return engine;
	}

	
	public int getSeat() {
		return seat;
	}

	

	public int getWheels() {
		return wheels;
	}

	

	public String getFualtank() {
		return fualtank;
	}

	
	public String getLight() {
		return light;
	}

	

public String engine;
  public int seat;
  public int wheels;
  public String fualtank;
  public String light;

  public vehil(String engine, int seat, int wheels, String fualtank,String light){
    this.engine = engine;
    this.seat = seat;
    this.wheels = wheels;
    this.fualtank = fualtank;
    this.light=light;
  }

  public String stearing;
  public String aircon;
  public String musicplayer;
  public String diky;

public vehil(String stearing, String aircon, String musicplayer, String diky) {
	this.stearing = stearing;
    this.aircon = aircon;
    this.musicplayer = musicplayer;
    this.diky = diky;
}

public String getstearing(){
return 	stearing;
}


public String toString() {
	return "vehil [getEngine()=" + getEngine() + ", getSeat()=" + getSeat()
			+ ", getWheels()=" + getWheels() + ", getFualtank()="
			+ getFualtank() + ", getLight()=" + getLight() + "]";
}
}
  
