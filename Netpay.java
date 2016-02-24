// ********************************************************************
//   Netpay.java                                Author: Ben Otte
// 
// Calculates net pay from hourly wage and hours worked based on simple formula
// ********************************************************************

import javax.swing.*;

public class prog1 { 
	public static void main( String[] args) {
		String  hwage, hworked;
		double hourly_wage, net_pay, fica;
		int hours_worked;
		double fedTax, stateTax, grossPay;
		final double health = 150.0;
		
		hwage = JOptionPane.showInputDialog("Enter number of hours worked: ");
		hourly_wage = Double.parseDouble(hwage);
		
		hworked = JOptionPane.showInputDialog("Enter number of hours worked: ");
		hours_worked = Integer.parseInt(hworked);
		
		grossPay = hourly_wage * hours_worked;
		fedTax = grossPay * .20;
		stateTax = grossPay * .07;
		double ficaTax = .05 * grossPay;
		net_pay =( grossPay-fedTax-stateTax-ficaTax) ;
		System.out.println("Gross pay: " = grossPay);
		System.out.println("Net Pay: " + net_pay);
		
	}	
	 	
}
