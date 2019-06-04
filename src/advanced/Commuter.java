package advanced;

public class Commuter {
	protected String make, model,color;
	protected int speed;
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
