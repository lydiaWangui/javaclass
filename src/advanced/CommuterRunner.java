package advanced;

public class CommuterRunner {

	public static void main(String[] args) {
		CarInherit car = new CarInherit();
		car.setMake("Mercedes");
		car.setModel("E 350");
		car.setColor("Black");
		car.setEngine_cc(2500);
		car.setBody_type("Saloon");
		
		System.out.println(car.getSpeed());
//		
//		for (int i = car.getSpeed();  i<=car.getTopspeed();i++){
//			car.accelerate(i);
//			System.out.print(i);
//		}
//		System.out.println("");
//		System.out.println(car.getSpeed());
//		
		
		Commuter gari = new CarInherit();
//		car.getSpeed();
		for (int s = 0; s<= 10;s++) {
			gari.accelerate(gari.getSpeed());
			System.out.print(gari.getSpeed());
		}
		
		
		
		
	}

}
