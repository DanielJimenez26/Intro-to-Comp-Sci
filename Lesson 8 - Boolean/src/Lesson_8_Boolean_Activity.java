
public class Lesson_8_Boolean_Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = 23;
		int x = -109;
		double c = 2345.19;
		double v = 157.03;
		boolean a = false;
		boolean s = true;
		
		boolean gus = (x > 0) && (c == v);
		System.out.println(!gus);
		
		System.out.println(a || s);
		System.out.println(((-1*x) > 0) && !a);
		
		boolean r = z == x;
		System.out.println(r || false);
		System.out.println(z!=x);
		int u = 6;
		int b = 7;
		boolean kDog=(u<b);
		System.out.println(kDog);
		
				
		
	}

}
