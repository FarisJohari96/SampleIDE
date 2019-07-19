package com.faris.sample;

public class EnumTest {
	
	Day day;
	
	public EnumTest(Day day){
		this.day = day;
	}
	
	public void tellItLikeItIs(){
		
		switch (day){
		case MONDAY:
			System.out.println("Monday are bad");
			break;
		case FRIDAY:
			System.out.println("Monday are bad");
			break;
		case SATURDAY:
			System.out.println("Monday are bad");
			break;
		case SUNDAY:
			System.out.println("Monday are bad");
			break;
		case TUESDAY:
			System.out.println("Monday are bad");
			break;
		case WEDNESDAY:
			System.out.println("Monday are bad");
			break;
		default:
			System.out.println("Midweek is so-so");
		}
	}
	public static void main(String args[]){
		EnumTest firstday = new EnumTest(Day.MONDAY);
		firstday.tellItLikeItIs();
		EnumTest secondday = new EnumTest(Day.TUESDAY);
		firstday.tellItLikeItIs();
		EnumTest thirdday = new EnumTest(Day.WEDNESDAY);
		firstday.tellItLikeItIs();
		EnumTest fourthday = new EnumTest(Day.THURSDAY);
		firstday.tellItLikeItIs();
		EnumTest fifthday = new EnumTest(Day.FRIDAY);
		firstday.tellItLikeItIs();
		EnumTest sixthday = new EnumTest(Day.SATURDAY);
		firstday.tellItLikeItIs();
		EnumTest seventhday = new EnumTest(Day.SUNDAY);
		firstday.tellItLikeItIs();
	}
}
