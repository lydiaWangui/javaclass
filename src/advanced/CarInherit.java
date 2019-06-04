package advanced;

public class CarInherit extends Commuter{
	private String body_type;
	private int engine_cc;
	public int speed;
	
	public int getEngine_cc() {
		return engine_cc;
	}
	public void setEngine_cc(int engine_cc) {
		this.engine_cc = engine_cc;
	}
	public String getBody_type() {
		return body_type;
	}
	public void setBody_type(String body_type) {
		this.body_type = body_type;
	}
	public void accelerate( ) {
		speed = 80;
	}
	
}
