import java.util.Scanner;
public class Lesson_7_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner name1 = new Scanner(System.in);
//		int number;
//		System.out.println("Please enter your name.");
//		String name = name1.nextLine();
//		System.out.println("Your name has" + " " + name.length() + " " + "characters in it, how many would you like me to print?");
//		number = name1.nextInt();
//		System.out.println(name.substring(0,number));

		
//		Scanner name2 = new Scanner(System.in);
//		int number;
//		System.out.println("Please enter your whole name.");
//		String name = name2.nextLine();
//		System.out.println("Your name has" + " " + name.length() + " " + "characters in it, how many would like me to print?");
//		number = name2.nextInt();
//		System.out.println(name.substring(0,number));

		
//		Scanner math1 = new Scanner(System.in);
//		System.out.println("Please enter your A value");
//		int math = math1.nextInt();
//		System.out.println("Please enter your B value");
//		int math2 = math1.nextInt();
//		double answer = Math.sqrt(Math.pow(math, 2) + Math.pow(math2,2));
//		System.out.println("Square root of 3.0 sqaured + 4.0 squared =" + " " + answer);

		
//		Scanner quad = new Scanner(System.in);
//		System.out.println("Please enter the A value");
//		double math = quad.nextDouble();
//		System.out.println("Please enter the B value");
//		double math2 = quad.nextDouble();
//		System.out.println("Please enter the C value");
//		double math3 = quad.nextDouble();
//		double math4 = (-math2 + Math.sqrt(Math.pow(math2, 2) - (4*math*math3))) / (2*math);
//		double math5 = (-math2 - Math.sqrt(Math.pow(math2, 2) - (4*math*math3))) / (2*math);
//		System.out.println("Plus" + " " + "=" + " " + math5);
//		System.out.println("Minus" + "" + " " + "=" + " " + math4);

		
//		Scanner calc = new Scanner(System.in);
//		System.out.println("Please enter the A value");
//		double maths = calc.nextDouble();
//		System.out.println("Please enter the B value");
//		double mathz = calc.nextDouble();
//		System.out.println("Please enter the C value");
//		double mathez = calc.nextDouble();
//		double math1 = (-mathz + Math.sqrt(Math.pow(mathz, 2) - (4*maths*mathez))) / (2*maths);
//		double math2 = (-mathz - Math.sqrt(Math.pow(mathz, 2) - (4*maths*mathez))) / (2*maths);
//		System.out.println("Plus" + " " + " " + "=" + " " + math1);
//		System.out.println("Minus" + " " + " " + "=" + " " + math2);

		
//		Scanner name = new Scanner(System.in);
//		System.out.println("Please enter a sentence.");
//		String name1 = name.nextLine();
//		System.out.println("What letter shall I find?");
//		String name2 = name.nextLine();
//		System.out.println("Your letter occurs at index" + " " + name1.indexOf(name2));
		
		Scanner ScanMan = new Scanner (System.in);
		String s = "XRay";
		System.out.println("Enter your password.");
		String s1 = ScanMan.nextLine();
		if (s1.equals(s)) {
			System.out.println("Password entered successfully.");
		}else{
			System.out.println("Incorrect password.");
		}
		
	}

}
