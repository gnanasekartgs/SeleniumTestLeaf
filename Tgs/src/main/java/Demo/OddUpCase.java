package Demo;

public class OddUpCase {

	public static void main(String[] args) {
		String s  ="selenium";
		char[] chararr = s.toCharArray();
		for (int i = 0; i<s.length(); i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(s.toString().charAt(i));
			}
			else if(i %2 != 0)
			{
				System.out.print(s.toString().toUpperCase().charAt(i));				
			}
		}	
	}
}
