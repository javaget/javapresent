package pract;

public class xyz {

	   public xyz(String doors, String engine) {
		this.doors = doors;
		this.engine = engine;
	}
	public String getDoors() {
		return doors;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	private String doors;
	   private String engine;
	   private int speed;
	   
	   
	   public int getspeed(){
	    return speed;
	   }
	   public String running(){
		   if(doors.equals("closed")&& engine.equals("started")){
			return "running";   
		   }else{
			return "Not started the car";   
		   }
	   }
	   }
