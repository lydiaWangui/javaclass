package basics;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		double number_one = scan.nextDouble();
		
		Scanner scan_one = new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		double number_two = scan_one.nextDouble();
		
		
		if ((number_one  > 100) && (number_two> 100))
		{
		
		{
			if (number_one < number_two)
			{
				System.out.println("The first number is smaller");
			}
			else
			{
				System.out.println("The fisrt number is bigger");
			}
			
		}
		else
		{System.out.print("Both Numbers have to be less tha 100");}
		}
	}
		

}
