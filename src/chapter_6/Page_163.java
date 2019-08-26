package chapter_6;

public class Page_163 {
	public static void main(String[] args) {
		Time time = new Time();
		
		time.setHour(80);
		time.setMinute(55);
		time.setSecond(87);
		
		
		System.out.println(time);
		
//		double d1 = 2.825932D;
//		System.out.println(String.format("%02.10f", d1));
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 24 && hour >= 0) {
			this.hour = hour;			
		} 
//		else {
//			return;
//		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 60 && minute >= 0) {
			this.minute = minute;			
		} 
//		else {
//			return;
//		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 60 && second >= 0) {
			this.second = second;			
		} 
//		else {
//			return;
//		}
	}
	
	@Override
	public String toString() {
		return String.format("%02d", hour) + ":" + String.format("%02d", minute) + "." + second;
	}
}
