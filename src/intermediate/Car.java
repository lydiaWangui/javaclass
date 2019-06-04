package intermediate;

public class Car {
	 private String make;
	 private String model;
	 private int engine_cc;
	 private String color;
	 private String bodyType;
	 private int speed;
	
	
	
Car(){
		
	}

	Car(String ma, String mo, int cc, String color, String bo){
		make = ma; model =mo; engine_cc = cc; this.color = color; bodyType= bo; speed = 0;
	}

	public void accelerate( int s ) {
		this.speed = s;
	}
	
	public void brake () {
		speed = speed -1;
	}
	
	public int getSpeed() {
		return speed;
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

	public int getEngine_cc() {
		return engine_cc;
	}

	public void setEngine_cc(int engine_cc) {
		this.engine_cc = engine_cc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	
	
	
}
