package practiceprblm;

import java.util.Scanner;

public class CountInvalidIntegers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int a =0;
		while (a!=1000) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Integer");
			a = sc.nextInt();
			if (a%2!=0) {
				count++;
			}
			
		}
		if (a==1000)
		System.out.println("The Invalid Integers Count is :"+count);


	}

}
