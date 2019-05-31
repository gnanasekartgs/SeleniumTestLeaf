package Demo;

public class BrandName {

	public static void main(String[] args) {
		Car c = new Car();
		String s = c.carModel("bmw");
		String s1 = c.carModel("Benz");
		
		System.out.println(s+ "  " +  s1);

	}

}
