import java.util.Scanner;
public class Final_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\"Ladys and 'Gentlemen' good evening/ewe have sean that seeing* is believing\"");
		System.out.println("\"You'\\re I's and you are are ears will \"bee\" bleading - please chek two C if you're still breething\"");
		
		Scanner InputScan = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word1 = InputScan.nextLine();
		System.out.println("Enter another word.");
		String word2 = InputScan.nextLine();
		String both = word1 + word2;
		System.out.println(both);
		if (word1.length()==word2.length()) {
			System.out.println("Good Job!");
		}else{
			System.out.println("Almost!");
			
		}
		Scanner Fax = new Scanner(System.in);
		System.out.println("Enter a number.");
		int g = Fax.nextInt();
		System.out.println("Enter a word.");
		String s1 = Fax.nextLine();
		System.out.println("Enter another word.");
		String s2 = Fax.nextLine();
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("The words are the same-ish.");
		}else if (s1.length()+s2.length()==g) {
			System.out.println("da same.");
		}
		
	}

	
}
