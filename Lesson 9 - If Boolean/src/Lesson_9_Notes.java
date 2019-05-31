import java.util.Scanner;
public class Lesson_9_Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner Person = new Scanner(System.in);
//		System.out.println("Please enter your age");
//		int age = Person.nextInt();
//		if (age >= 18) {
//			System.out.println("You are able to drive");
//		}else{
//			System.out.println("You are not able to drive");
//		
//		
//		
//		}
		
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int number = UserInput.nextInt();
		System.out.println("Please enter your second number");
		int number2 = UserInput.nextInt();
		if (number == number2) {
			System.out.println("Yay! That's right");
		}else{
			System.out.println("Sorry, that's wrong");
		}
	}

}
