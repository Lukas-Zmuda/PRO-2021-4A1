package edu.oop.exercises;

public class MyTime {
	
	private int hour;
	private int minute;
	private int second;
	
	
	public MyTime() {
		this(0,0,0);
	}
		
	public MyTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour > 23 || hour < 0) {
			this.hour = 0;
		}else {
			this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute > 59 || minute < 0) {
			this.minute = 0;
		}else {
			this.minute = minute;
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second > 59 || second < 0) {
			this.second = 0;
		}else {
			this.second = second;
		}
	}
	
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
