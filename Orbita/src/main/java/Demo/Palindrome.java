package Demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s = "level";
	//Scanner s1 = new Scanner(System.in);
	//String s = s1.nextLine();
		int x = s.length()-1;
	String r = "";
	for(int i = x; i <= 0; i--)
	{
		r = r + s.charAt(i);
	}
		if(s.equals(r))
		{	
			System.out.println("palindrome");
		}
			else
			{
				System.out.println("not palindrome");
			}
			}
}
