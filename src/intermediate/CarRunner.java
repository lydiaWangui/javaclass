package intermediate;

public class CarRunner {
	public static void main(String [] args) {
		Car gari = new Car("Toyota", "Vitz", 1100, "Red", "Saloon");
		System.out.println("gari" + gari.getMake());
		
		Car gariUno = new Car();
		gariUno.setMake("Toyota");
		System.out.print("gariUno "+ gariUno.getMake());
		
}

	
		
}
