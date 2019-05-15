import java.util.Scanner;
public class Back_Sheet_Blue_Paper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner test = new Scanner(System.in);
		int test1;
		int test2;
		int test3;
		System.out.println("Test 1 grade?");
		test1 = test.nextInt();
		System.out.println("Test 3 grade?");
		test3 = test.nextInt();
		System.out.println("Test 2 grade?");
		test2 = test.nextInt();
		System.out.println("Test1 grade : " + test1);
		System.out.println("Test2 grade : " + test2);
		System.out.println("Test3 grade : " + test3);
		double score = (test1+test2+test3)/3.0;
		System.out.println("average : " + score);
	}

}
