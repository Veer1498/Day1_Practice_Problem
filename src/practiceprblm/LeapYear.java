package practiceprblm;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int minYear = 1582;
			if (year>minYear) {
					if (year%400==0 && year % 4 ==0 && year % 100 ==0) {
						System.out.println(year+" This is a Leap Year");
					}
					else
						System.out.println("Not a Leap Year");
			}
			else
				System.out.println("Entered Invalid year");

	}

}
