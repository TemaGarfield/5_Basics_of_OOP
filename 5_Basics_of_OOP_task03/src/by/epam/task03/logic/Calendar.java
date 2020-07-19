package by.epam.task03.logic;

import java.util.ArrayList;

public class Calendar {
	
	private ArrayList<Day> days = new ArrayList<Day>();
	private ArrayList<Day> holidays = new ArrayList<Day>();
	
	class Day {
		private int date;
		private int month;
		private int year;
		private boolean isHoliday;
		
		Day(int date, int month, int year, boolean isHoliday) {
			this.date = date;
			this.month = month;
			this.year = year;
			this.isHoliday = isHoliday;
		}
		
		public void setDate(int date) {
			this.date = date;
		}
		
		public void setMonth(int month) {
			this.month = month;
		}
		
		public void setYear(int year) {
			this.year = year;
		}
		
		public void setIsHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}
		
		public int getDate() {
			return date;
		}
		
		public int getMonth() {
			return month;
		}
		
		public int getYear() {
			return year;
		}
		
		public boolean getIsHoliday() {
			return isHoliday;
		}
	}
	
	private void addToCalendar(int day, int month, int year, boolean isHoliday) {
		Day userDay = new Day(day, month, year, isHoliday);
		days.add(userDay);
		if (isHoliday) {
			holidays.add(userDay);
		}
	}
	
	public void addDay(int day, int month, int year, boolean isHoliday) {
		if (month % 2 == 0) {
			if (month == 2) {
				if (day > 29 || day < 1) {
					System.out.println("Sorry. I can't add " + "\"" + day + "." + month + "." + year + "\".");
				} else {
					addToCalendar(day, month, year, isHoliday);
				}
			} else if (day > 30 || day < 0) {
				System.out.println("Sorry. I can't add " + "\"" + day + "." + month + "." + year + "\".");
			} else {
 				addToCalendar(day, month, year, isHoliday);
			}
 		} else {
 			if (day > 31 || day < 0) {
 				System.out.println("Sorry. I can't add " + "\"" + day + "." + month + "." + year + "\".");
 			} else {
 				addToCalendar(day, month, year, isHoliday);
 			}
 		}		
	}
	
	public void displayCalendar() {
		System.out.println("\nAll days: ");
		for(Day day:days) {
			String answer = (day.getIsHoliday()) ? "Holiday" : "Weekday";
			System.out.println(day.getDate() + "." + day.getMonth() + "." + day.getYear() + " -- " + answer);
		}
	}
	
	public void displayHolidays() {
		System.out.println("\nHolidays:");
		for (Day holiday:holidays) {
			System.out.println(holiday.getDate() + "." + holiday.getMonth() + "." + holiday.getYear());
		}
	}
}
