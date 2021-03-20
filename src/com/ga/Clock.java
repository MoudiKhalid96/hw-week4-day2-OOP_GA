  
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
		// your code goes here
		setTime(0, 0, 0);
	}

	public Clock(int hours, int minutes, int seconds) { // <---------- Calls a setter method
		setTime(hours, minutes, seconds);
	}

	//instance methods
	public void setTime(int hours, int minutes, int seconds) {
		// your code goes here
		
		// check if hours exceeds 24
		if(hours > 23)
			hr = 0;
		else
			hr = hours;
			
		// check if minutes exceeds 60
		if(minutes > 59)
			min = 0;
		else
			min = minutes;
		
		// check if seconds exceeds 60
		if(seconds > 59)
			sec = 0;
		else
			sec = seconds;

	} // end of setTime

	// mutator methods
	public void incrementSeconds() {
		// your code goes here
		sec++;
		
		if(sec > 59) {
			sec = 0;
			incrementMinutes();
		}
		
	} // end incrementSeconds

	public void incrementMinutes() {
		// your code goes here
		min++;
		
		if(min > 59) {
			min = 0;
			incrementHours();
		}
		
	} // end incrementMinutes

	public void incrementHours() {
		// your code goes here
		hr++;
		
		if(hr > 23)
			hr = 0;
		
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
	    
	    System.out.println(new SimpleDateFormat("HH:mm:ss").format(calendar.getTime()));
	} // end printTime

} // end of Clock