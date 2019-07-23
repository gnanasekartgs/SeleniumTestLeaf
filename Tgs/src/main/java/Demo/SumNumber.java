package Demo;

public class SumNumber {
	static int sum1(int x) {
		
		int sum;
		// sum+=(x%10), (x/=10);
		for (sum = 0; x > 0; sum += x % 10, x /= 10); 
		return sum; 
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 387;
System.out.println(sum1(x));
}

}


