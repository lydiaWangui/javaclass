package basics;

import java.util.Scanner;

public class NetSalary {
	
	
	public static void main(String[]args) {
//			 create methods that input basic salary, allowances first. then those that calculate the deductions. 
//		this should be in a way way where i can call the gross salary and find its tax, nhif, nssf and payee
//		1. Input basic salary and total deductions
		
		Scanner inputOne = new Scanner(System.in);
		System.out.println("Enter your Basic Salary ");
		double num = inputOne.nextDouble();
				
		Scanner inputTwo = new Scanner(System.in);
		System.out.println("Enter Total Benefits i.e. travel, housing etc ");
		double num2 = inputTwo.nextDouble();
				
		NetSalary net = new NetSalary();
		double gross =net.gross(num, num2);
		double payee =net.payee(gross);
		double nhif =net.nhifDeductions(gross);
		double nssf=net.nssfDeductions(gross);
		double totalDeductions = net.totalDed(nssf, payee, nhif);
		double netSalary= net.netSal(gross, totalDeductions);
		
		
		
	}
	
	public double gross(double bas, double ben) {
		double gross = bas + ben;
		System.out.println("Your Gross Salary is ");
		System.out.println(gross);
		return gross;
		
	}
	
	public double payee(double g ) {
		double p = g ;
		if (p >= 0 && p <=12298) {
			System.out.println("Your Payee is "+ p * 0.1);
		}
		else if  (p== 12999 && p <= 23885) {
			System.out.println("Your Payee is "+ p * 0.15);
		}
		else if (p==23886 && p<= 35472) {
			System.out.println("Your Payee is "+ p * 0.2);
		}
		else if (p ==35473 && p<= 47059) {
			System.out.println("Your Payee is "+ p * 0.25);
		}
		else if (p >= 47059) {
			System.out.println("Your Payee is "+ p * 0.3);
		}
		return p;
	}
	
	
	public double nhifDeductions(double gross) {
		double nhif = gross; 
		
		if (nhif>= 0 && nhif <=5999) {
			System.out.println("Your NHIF Deduction is "+ 150);
		}
		else if (nhif >= 6000 && nhif <= 7999) {
			System.out.println("Your NHIF Deduction is "+ 300);
			}
		else if (nhif >= 8000 && nhif <= 11999) {
			System.out.println("Your NHIF Deduction is "+ 400);
			}
		else if (nhif >= 12000 && nhif <= 14999) {
			System.out.println("Your NHIF Deduction is "+ 500);
			}
		else if (nhif >= 15000 && nhif <= 19999) {
			System.out.println("Your NHIF Deduction is "+ 600);
		}
		else if (nhif >= 20000 && nhif <= 24999) {
			System.out.println("Your NHIF Deduction is "+ 750);
		}
		else if (nhif >= 25000 && nhif <= 29999) {
			System.out.println("Your NHIF Deduction is "+ 850);
		}
		else if (nhif >= 30000 && nhif <= 34999) {
			System.out.println("Your NHIF Deduction is "+ 900);
		}
		else if (nhif >= 35000 && nhif <= 39999) {
			System.out.println("Your NHIF Deduction is "+ 950);
		}
		else if (nhif >= 40000 && nhif <= 44999) {
			System.out.println("Your NHIF Deduction is "+ 1000);
		}
		else if (nhif >= 45000 && nhif <= 44999) {
			System.out.println("Your NHIF Deduction is "+ 1100);
		}
		else if (nhif >= 50000 && nhif <= 59999) {
			System.out.println("Your NHIF Deduction is "+ 1200);
		}
		else if (nhif >= 60000 && nhif <= 69999) {
			System.out.println("Your NHIF Deduction is "+ 1300);
		}
		else if (nhif >= 70000 && nhif <= 79999) {
			System.out.println("Your NHIF Deduction is "+ 1400);
		}
		else if (nhif >= 80000 && nhif <= 89999) {
			System.out.println("Your NHIF Deduction is "+ 1500);
		}
		else if (nhif >= 90000 && nhif <= 99999) {
			System.out.println("Your NHIF Deduction is "+ 1600);
		}
		else if (nhif >= 100000) {
			System.out.println("Your NHIF Deduction is "+ 1700);
		}
		return nhif;
	}
	
	public double nssfDeductions(double gross) {
		double nssf  = gross * 0.05;
		System.out.println("Your nssf is ");
		System.out.println(nssf);
		return nssf;
	}
	
	public double totalDed( double ns, double pa, double nh) {
		double totalDeduction=(ns +pa+ nh);
		return 	totalDeduction;
	}
	
	public double netSal(double g , double d) {
		double netSal = g-d;
		System.out.println("Your Net Salary  is ");
		System.out.println(netSal);
		return netSal;
	}
}
