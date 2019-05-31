package Demo;

public class Car {
//	{
//		public abstract void Model(String mname);
//
//		System.out.println("New Brand Car");
//	}
//	
//	void newModel()
//	{
//		
//	}
public String carModel(String model)
{
	if( model.equalsIgnoreCase("BmW"))
	{
		//System.out.println("BMW");
		return "b M w";
	}
	else if (model.equals("Benz"))
	{
		return "Benz";
	}
	else if (model.equals("badmini"))
	{
		return "Badmini";
	}
	else 
	{
		return "cycle";
	}
}
	
	
}

