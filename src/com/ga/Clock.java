package com.ga;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class Clock {
	// instance variables
	private int hr;
	private int min;
	private int sec;

	// constructors: same name as class name. No type.
	public Clock() { // default constructor <---------- Calls a setter method
		setTime(0, 0, 0);
	}

	public Clock(int hours, int minutes, int seconds) { // <---------- Calls a setter method
		// your code goes here
		setTime(hours, minutes, seconds);
	}

//instance methods
	public void setTime(int hours, int minutes, int seconds) {
		// your code goes here
		// check if hours exceeds 24
		// check if minutes exceeds 60
		// check if seconds exceeds 60
		
		if(hours > 24) 
			this.hr = 0;
		else
			this.hr = hours;
		
		if(minutes > 60)
			this.min = 0;
		else
			this.min = minutes;
		
		if(seconds > 60)
			this.sec = 0;
		else
			this.sec = seconds;

	} // end of setTime

	
	// mutator methods
	public void incrementSeconds() {
		this.sec += 1;
		
		if(sec > 60) {
			this.sec = 0;
			incrementMinutes();
		}
	} // end incrementSeconds

	
	public void incrementMinutes() {
		this.min += 1;
		
		if(min > 60) {
			this.min = 0;
			incrementHours();
		}
	} // end incrementMinutes

	public void incrementHours() {
		this.hr += 1;
		
		if(hr > 24)
			this.hr = 0;
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
		
		Calendar calendar = Calendar.getInstance();
		
	    calendar.set(Calendar.HOUR_OF_DAY, getHours());
	    calendar.set(Calendar.MINUTE, getMinutes());
	    calendar.set(Calendar.SECOND, getSeconds());
	    
	    System.out.println(new SimpleDateFormat("hh:mm:ss").format(calendar.getTime()));
	} // end printTime

	public boolean equals(Clock otherClock) { // compare two times
		boolean result = false;
		// your code goes here
		
		if(this.hr == otherClock.getHours() && this.min == otherClock.getMinutes()) 
			result = true;
		
			
		return result;
	} // end equals

	public void makeCopy(Clock otherClock) { // object1 = object2
		otherClock = new Clock(this.hr, this.min, this.sec);
	}

	public Clock getCopy() { // get a copy of a given object
		Clock temp = new Clock();
		// your code goes here
		temp.setTime(this.hr, this.min, this.sec);
		
		return temp;
	}

} // end of Clock
