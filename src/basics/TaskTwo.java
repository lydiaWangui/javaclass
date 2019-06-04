package basics;

import java.util.Scanner;


public class TaskTwo {

	public static void main(String[] args) {
		
		//first allow first input of a number, if out of range prompt user to enter another number,if in range, check if its prime or not
		
		
		while Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 100");
		int number = scan.nextInt();
		
		if (number>-1 && number <= 100){
		
			if (number ==0 || number ==1 ){
		
			System.out.println("Number is not prime ");	
		}
			else if (number%2==0|| number %3==0 ||number%5==0 || number% 7==0 ){
			
			
				System.out.println("Number is not prime ");
			}
			
			else {
				System.out.println("Number is prime ");
			}
		
		}
		else {
			System.out.println("Enter a number less than 100 ");
		}
			
			
	}

}
