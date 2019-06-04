package basics;

import java.util.Scanner;

class Main{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // get basic salary
    System.out.println("Enter salary");
    int salary = input.nextInt();

    // get benefits
    System.out.println("Enter benefits");
    int benefits = input.nextInt();

    System.out.println("Salary:" + salary);
  }
}