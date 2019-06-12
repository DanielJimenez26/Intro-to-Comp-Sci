import java.util.Scanner;
public class Scanners_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ugly = new Scanner(System.in);
		System.out.println("Enter your Password.");
		String s1 = Ugly.nextLine();
		System.out.println("Enter your Password again.");
		String s2 = Ugly.nextLine();
		if (s1.equals(s2)) {
			System.out.println("Password correct.");
		}else{
			System.out.println("Password Incorrect.");
			
		}
				
		}
		
	}
