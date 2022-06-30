package practiceprblm;
import java.util.*;

public class CheckTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Values");
		String name1 = sc.next();
		String name2 = sc.next();
		System.out.println("\r\n Name1 : "+name1+" \r\n "+"Name2 : "+name2);
		boolean check = name1.equals(name2);
		System.out.println("Both are Equal :"+check);
	}

}
