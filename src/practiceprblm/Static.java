package practiceprblm;

public class Static {
	static int num;
	static String myString;
	//Static Block
	static {
		num = 97;
		myString = "This is a Static Block";
	}
	//Static variable without Object
	static String s = "Static variables without Object";
	//Static Method
	static void display() {
		System.out.println("Value of num : "+num);
		System.out.println("This is a Static Variable with Static Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of num : "+num);
		System.out.println(myString);
		display();
		System.out.println(s);
	}

}
