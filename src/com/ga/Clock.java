package com.ga;

class Clock {
	// instance variables
	private int hr;
	private int min;
	private int sec;

	// constructors: same name as class name. No type.
	public Clock() { // default constructor <---------- Calls a setter method
		// your code goes here
	}

	public Clock(int hours, int minutes, int seconds) { // <---------- Calls a setter method
		// your code goes here
	}

//instance methods
	public void setTime(int hours, int minutes, int seconds) {
		// your code goes here
		// check if hours exceeds 24
		// check if minutes exceeds 60
		// check if seconds exceeds 60

	} // end of setTime

	// mutator methods
	public void incrementSeconds() {

		// your code goes here
	} // end incrementSeconds

	public void incrementMinutes() {
		// your code goes here
	} // end incrementMinutes

	public void incrementHours() {
		// your code goes here
	} // end incrementHours

	// accessor methods
	public int getHours() {
		return hr;
	} // end of getHours

	public int getMinutes() {
		return min;
	} // end of getMinutes

	public int getSeconds() {
		return sec;
	} // end of getSeconds

	public void printTime() { // prints time in the form hh:mm:ss
		// your code goes here
	} // end printTime

	public boolean equals(Clock otherClock) { // compare two times
		boolean result = true;
		// your code goes here
		return result;
	} // end equals

	public void makeCopy(Clock otherClock) { // object1 = object2
		// your code goes here
	}

	public Clock getCopy() { // get a copy of a given object
		Clock temp = new Clock();
		// your code goes here
		return temp;
	}

} // end of Clock
