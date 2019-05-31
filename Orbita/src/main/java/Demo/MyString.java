package Demo;

import org.apache.poi.ss.formula.functions.Count;

public class MyString 
{
public static void main(String[] args) throws ArrayIndexOutOfBoundsException
{
	int Count = 0;

	String s = "gnana sekar";
	int a = s.length();
	System.out.println(s.charAt(a-1));
	
	char[] chararr = s.toCharArray();
	for(int i = 0; i < s.length()-1; i++)
	{
		Character cr=chararr[i];
		if (cr.toString().equals("a"))
		{
			Count = Count + 1;
			System.out.println(Count);	
		}
	}
	
	
	System.out.println(s.toUpperCase());
	
	System.out.println(s.trim().replace("s", "$"));
	
	String name = "dan, saa, maa, gon, len";
	String[] str = name.split(",");
	 for (int i = 0; i< str.length; i++)
	 {
		 if(str[i].endsWith("a"))
		 {
			 System.out.println(str[i]);
		 }
	 }
}}