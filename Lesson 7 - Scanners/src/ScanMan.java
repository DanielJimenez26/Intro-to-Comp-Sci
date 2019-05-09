	import java.util.Scanner;
	public class ScanMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScan;
		inputScan = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = inputScan.nextInt();
		System.out.println("you Are " + age + " Years Old!");
		System.out.println("Next year you will be " + ++age + "Years Old!");
		inputScan.close();
	}

}
