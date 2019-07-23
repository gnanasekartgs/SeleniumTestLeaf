package Demo;

class Calc 
{      int a = 10, b = 5;
	public int add()
	{
		this.a = a;
	     this.b = b;
		return a+b;
	}
	
	protected int sub()
	{
		this.a = a;
		this.b = b;
		return a-b;
	}

	 //private int mul()
	public int mul()
	{
		this.a = a;
		this.b = b;
		return a*b;
	}
	
	 final int div(int c, int d)
	{
		this.a = a;
		this.b = b;
		System.out.println(c/d);
		return a/b;
	}
	
	public static void main(String[] args) {
	Calc cal = new Calc();
	Calc1 cal1 = new Calc1();
		//int a =cal.add(5, 5);
		int a1 = cal.add();
		System.out.println(a1);
		
		int b = cal.sub();
		System.out.println(b);
		
		int c = cal.mul();
		System.out.println(c);
		
		int d = cal.div(10, 2);
		System.out.println(d);
	
		int e = cal1.mod(9, 2);
		System.out.println(e);
	}

	}

