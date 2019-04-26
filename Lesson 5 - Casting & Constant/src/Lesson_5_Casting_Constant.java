
public class Lesson_5_Casting_Constant {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double E = 2.718;
		System.out.println(E);
		
		final double Area;
		Area = 203.49;
		
		//int cnt = 27.2;
		//System.out.println(cnt);
		
		double d = 78.1;
		int fg = (int)d;
		System.out.println(fg);
		
		double f4 = 22;
		
		System.out.println((double)(95/9));
		
		double q = 61.0/3.0;
		System.out.println(q);
		
		System.out.println(4 + 6.0/4 + 5 *3 -3);
		
		int p = 3;
		double x = 10.3;
		int j = (int)5.9;
		System.out.println(p + p * d - 3 * j);
		
		int dividend = 12, divisor = 4, quotient = 0, remainder = 0;
		int dividend2 = 13, divisor2 = 3, quotient2 = 0, remainder2 = 0;
		quotient = dividend/divisor;
		remainder = dividend % divisor;
		quotient2 = dividend2 / divisor2;
		remainder2 = dividend2 % divisor2;
		System.out.println(quotient);
		System.out.println(remainder);
		System.out.println(quotient2);
		System.out.println(remainder2);
		
		int k = 7;
		k*=.5;
		System.out.println(k);
		
		double d1 = 37.9;
		double d2 = 1004.128;
		int i1 = 12;
		int i2 = 18;
		
		System.out.println(57.2*(i1/i2)+1);
		System.out.println(57.2*((double)i1/i2)+1);
		System.out.println(15-i1*(d1*3)+4);
		System.out.println(15-i1*(int)(d1*3)+4);
		System.out.println(15-i1*((int)d1*3)+4);
	}

}
