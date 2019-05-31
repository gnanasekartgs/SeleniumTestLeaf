package Demo;
import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		System.out.println("enter number");
Scanner s = new Scanner(System.in);
int x = s.nextInt();
if(prime(x))
{
	System.out.println("is prime number");
}
else
{
	System.out.println("is not prime");
}		
	}
	public static boolean prime(int x)
	{
		if(x<=1)
					return false;		
		for(int i = 2; i < x; i++)
		if(x%2 ==0)			
				return false;
			
			return true;
		}
	}

