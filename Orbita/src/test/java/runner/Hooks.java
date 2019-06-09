package runner;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void beforeScenario(Scenario sc)
	{
		String name = sc.getName();
		System.out.println("name "+name);
		String id = sc.getId();
		System.out.println("this id" +id);
	}

	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println("status is:"+sc.getStatus());
		
	}
}
