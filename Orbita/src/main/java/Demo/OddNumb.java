package Demo;

public class OddNumb {
static int i, a, sum = 0;
	public static void main(String[] args) {
		
		for(i = 0; i <=20; i++)
		{
			 if (i % 2 != 0)
			 {
				 
				 sum = sum+i; 
			 }
		 
		}
		System.out.println(sum);

	}

}
