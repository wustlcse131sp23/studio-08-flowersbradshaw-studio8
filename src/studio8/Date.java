package studio8;

import java.util.LinkedList;

public class Date {
	/**
	 * Instance Variables
	 * These should be private because we only want to access these in this specific class
	 */
	private int month;
	private int day;
	private int year;
	private boolean field;
	
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.field = field;
	}

	public String getDate() {
		return this.month + "/" + this.day + "/"+ this.year;
	}
	
	public boolean getField(boolean field) {
		if((month == 1) && (day == 1)) {
			return true;
		}
		else if ((month == 12) && (day == 25)) {
			return true;
		}
		else if ((month == 7) && (day == 4)) {
			return true;
		}
		else if ((month == 10) && (day == 31)) {
			return true;
		}
		else {
			return false;

		}
	}
	
    public static void main(String[] args) {
    	LinkedList<Date> list = new LinkedList<Date>();
    	Date d1 = new Date(month, day, year);
    
    }

}
