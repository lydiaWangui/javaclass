package intermediate;

public class Train {
	 private String make;
	 private String model;
	 private String color;
	 private String engineType;
	 private int speed;
	
	
public Train(){
			
}

		public Train(String mak, String mod, String color,String eng){
			make = mak; this.model=mod;  this.color = color;  engineType = eng;speed = 0;
		}

}

		public void accelerate( int s ) {
			this.speed = s;
		}
		
		public void brake () {
			speed = speed -1;
		}
	
		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}	
		
		}
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public int getSpeed() {
			return speed;
		}

		
}
