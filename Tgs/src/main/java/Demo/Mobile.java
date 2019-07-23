package Demo;

public class Mobile {

	static String color = "black_and_white";
	static int numb = 1;
public String cellphone(String model)
{
	model = "sony";
	System.out.println("the mobile model "  +model);
	return "nokia";
}
	protected int mobCount(int count)
	{
		System.out.println(numb);
		System.out.println("no of mobiles" +count);
		return 23;
	}
	public static void mobColor() {
		int odd = 3;
		//System.out.println(numb);
		System.out.println("color = " +color);
	}
	private int mobCount1(int count)
	{
		
		System.out.println("no of mobiles" +count);
		return 1;
	}

public void saveContact(String phno)
{
	if(phno.equals("+123") )
	{
		System.out.println("+123");
	}
	else if (phno.equals("+234"))
	{
		System.out.println("+234");
		
	}
	else if (phno.equals("+345"))
	{
		System.out.println("+345");
	}
	else if (phno.equals("+456"))
	{
		System.out.println("+456");
	}
	else
	{
		System.out.println(1);
		//return "unknown";
	}
	
	//return phno;
}

public String saveContact1(String phno1)
{
	switch (phno1) {
	case "+123":
		System.out.println("+123");
		break;
	case "+234":
		System.out.println("+234");
		break;
	case "+345":
		System.out.println("+345");
		break;
	case "+456":
		System.out.println("+456....");
		break;
	case "+567":
		System.out.println("+567");
		break;
	default:
	break;

	}
	return phno1;
}

}
