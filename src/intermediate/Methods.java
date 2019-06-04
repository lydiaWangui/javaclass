package intermediate;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		Methods mym = new Methods();
		
		Scanner inputOne= new Scanner(System.in);
		System.out.print("Enter the first number");
		int v = inputOne.nextInt();
		
		Scanner inputTwo= new Scanner(System.in);
		System.out.print("Enter the second number");
		int w = inputTwo.nextInt();
	
		
		
		System.out.print(mym.calc(56, 67.98,70));
	
	}

	public int calc(int x , int y){
	
		int sum = x + y;
		return sum;
	}
	
	public int calc(int x , int y , int z){
		
		int sum = x + y + z;
		return sum;
	}
	
	public int calc(int x , int y , int z, int a){
		
		int sum = x + y + z + a;
		return sum;
	}
	
	public double calc(double x , double y , double z){
		
		double sum = x + y + z;
		return sum;
	}
}
