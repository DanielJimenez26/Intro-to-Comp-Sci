import java.util.Scanner;
public class Back_Sheet_Blue_Paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScan;
		inputScan = new Scanner(System.in);
		double radius;
		double area;
		area = inputScan.nextDouble();
		radius = Math.sqrt(area/(Math.PI));
		System.out.println("Radius = " + radius);
	}
}
