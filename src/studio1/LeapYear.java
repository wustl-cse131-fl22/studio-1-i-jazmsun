package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year;
		System.out.println("what is the year?");
		year = in.nextInt();
		boolean leapYearOrNot = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println("Is this year a leap year? " + leapYearOrNot);
		
	}

}
