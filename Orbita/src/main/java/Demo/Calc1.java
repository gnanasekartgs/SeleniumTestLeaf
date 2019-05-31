package Demo;

public class Calc1 {

	 int mod(int a, int b)
	{
		a = 12;
		b = 5;
		return a%b;
	}
	
	public static void main(String[] args) {
		
		
       Calc cal = new Calc();
		
		//int a =cal.add(5, 5);
		int a1 = cal.add();
		System.out.println(a1);
		
		int b = cal.sub();
		System.out.println(b);
		
		int c = cal.mul();
		System.out.println(c);
		
		int d = cal.div(10, 2);
		System.out.println(d);
	

	}

}
