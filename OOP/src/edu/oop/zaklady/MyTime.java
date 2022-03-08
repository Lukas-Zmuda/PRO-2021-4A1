package edu.oop.zaklady;

public class MyTime {
	
	int hour;
	int minute;
	int second;
	
	
	public String toString() {
		String cas = "";
		
		if(hour < 10) {
			cas += "0" + hour + ":";
		}else {
			cas += hour + ":";
		}
		if(minute < 10) {
			cas += "0" + minute + ":";
		}else {
			cas += minute + ":";
		}
		if(second < 10) {
			cas += "0" + second;
		}else {
			cas += second;
		}
		
		return cas; 
	}

}
