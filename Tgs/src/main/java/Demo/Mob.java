package Demo;

public class Mob {
     
	public static void main(String[] args) {
		
		//Mobile m = new Mobile();
		
		String s= new Mobile().cellphone("moto");
		System.out.println(s);
		
		String t = new Mobile().cellphone("sonyerr");
		System.out.println(t);
		
	int a = new Mobile().mobCount(5);
	System.out.println(a);
	
	//int a = new Mobile().mobCount1(5);
	//System.out.println(a);
	
	//new Mobile().mobColor();
	
	new Mobile().saveContact("+123");
	//.out.println(s1);
	
//	m.saveContact1("+456");
//	System.out.println(s2);
	
	
	
	}

}
