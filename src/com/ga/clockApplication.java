package com.ga;

import java.util.Scanner;

public class clockApplication {
	static Scanner read = new Scanner(System.in);
	static final int SIZE = 100;

	public static void main(String[] args) {
		// your code goes here 
		System.out.println("------------------"
				+ "\nThis program is to check who has come late to work"
				+ "\nEmpolyees must arrive to work before 9:00 AM"
				+ "\n------------------\n");
		
		System.out.print("You only have " + SIZE + " in your company !");
		System.out.print("Enter Employee ID: ");
		int id = read.nextInt();
		
		System.out.print("Enter arrival houre: ");
		int hr = read.nextInt();
		
		System.out.print("Enter arrival minute: ");
		int min = read.nextInt();
		
		System.out.print("Enter arrival second: ");
		int sec = read.nextInt();
		
		Clock time = new Clock(hr, min, sec);
		lateEmployees(time);
	} // end main

	public static void lateEmployees(Clock arrival) {
		int lateHours;
		int lateMinutes;
		
		if(arrival.getHours() > 9 && arrival.getMinutes() > 0) {
			lateHours = arrival.getHours() - 9;
			lateMinutes = arrival.getMinutes();
			
			System.out.println("Employee has late for " + lateHours + " hour/s and " + lateMinutes + " minute/s from work !");
			return;
		}else if(arrival.getHours() < 9) {
			lateHours = 9 - arrival.getHours();
			lateMinutes = arrival.getMinutes();
			
			System.out.println("Employee come before work by " + lateHours + " hour/s and " + lateMinutes + " minute/s from work !");
			return;
		}
		
		System.out.println("Employee is not late");
			
	}// end lateEmployees

}// end class