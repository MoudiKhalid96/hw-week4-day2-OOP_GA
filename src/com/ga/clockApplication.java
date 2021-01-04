package com.ga;

import java.util.Scanner;

public class clockApplication {
	static Scanner read = new Scanner(System.in);
	static final int SIZE = 100;

	public static void main(String[] args) {
		int ndx;
		
		// instantiate arrays of objects
		Clock[] arrivalTime = new Clock[SIZE];
		Clock[] departTime = new Clock[SIZE];
		
		// instantiate the object elements of arrays
		for (ndx = 0; ndx < arrivalTime.length; ndx++) {
			// invoke constructor with hr = 8, min = 30 and sec = 0
			arrivalTime[ndx] = new Clock(8, 30, 0);
			
			// invoke constructor with hr = 15, min 30 and sec = 0
			departTime[ndx] = new Clock(15, 30, 0);
			
		} // end for
		
			// update the arrival times of late employees
		lateEmployees(arrivalTime); // process the whole array
		
		// check if two employees leave at the same time to take the same bus for
		// example
		int ID1 = -1, ID2 = -1;
		boolean sameTime = false;
		
		System.out.println("Enter ID of employee1");
		ID1 = read.nextInt();
		
		System.out.println("Enter ID of employee2");
		ID2 = read.nextInt();
		
		System.out.println("Okay thanks");
		
		sameTime = departTime[ID1].equals(departTime[ID2]);
		// Copy the arrival information of empLoyee ID1 to employee ID2
		
		System.out.println("Did they arrive at the same time? " + sameTime);
		
		arrivalTime[ID2].makeCopy(arrivalTime[ID1]);
				
		// Get a copy of the departure information of employee ID2
		
		Clock tempInfo = new Clock();
		
		tempInfo = departTime[ID2].getCopy();
		
		// specify the employees that deserve an overtime
		// create a parallel array
		boolean[] overTime = new boolean[SIZE];
		overTimedEmployees(departTime, overTime);
	
	} // end main

	public static void lateEmployees(Clock[] arrival) {
		int employeeID = -1, arrivalHour = 0, arrivalMinute = 0, arrivalSecond = 0;
		do {
			// Assume ndx is used as employee ID
			System.out.println("Enter employee ID or -1 to exit");
			employeeID = read.nextInt();
			if (employeeID == -1)
				break;
			System.out.println("Enter employee arrival hour");
			arrivalHour = read.nextInt();
			System.out.println("Enter employee arrival minute");
			arrivalMinute = read.nextInt();
			System.out.println("Enter employee arrival seconds");
			arrivalSecond = read.nextInt();
			// Update employee’s data in the array. Assume ID = ndx
			arrival[employeeID].setTime(arrivalHour, arrivalMinute, arrivalSecond);
		} while (employeeID != -1);
	}// end lateEmployees

	public static void overTimedEmployees(Clock[] depart, boolean[] bonus) {
		int ndx;
		Clock template = new Clock(15, 30, 0);
		for (ndx = 0; ndx < depart.length; ndx++)
			if (depart[ndx].getHours() > template.getHours()) {
				bonus[ndx] = true;
				System.out.printf("%d deserves a bonus %n", ndx);
			} // end if
	}// end overTimedEmployees
}// end class
