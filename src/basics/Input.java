package basics;
import java.util.Scanner;

public class Input {
	
	public int number;
	public String name = "Lydia";
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");

		double num = scan.nextDouble();
		
		System.out.println(num * 2);
	}

}
