package Demo.Week3;

public class Phone {

	public void sms()
	{
		System.out.println("text sms");
	}
	public void call()
	{
		System.out.println("phone call");
	}
	public void music()
	{
		System.out.println("play music");
	}
}

 class Android1 extends Phone {
	@Override
	public void sms()
	{
		System.out.println("skype msg");
	}
	public void call()
	{
		System.out.println("whatsapp call");
	}
	@Override
	public void music()
	{
		System.out.println("gaana music");
	}
}
 

 	class IOS1 extends Phone {

	public void sms()
	{
		System.out.println("ios skype msg");
	}
	@Override
	public void call()
	{
		System.out.println("ios whatsapp call");
	}
	public void music()
	{
		System.out.println("ios gaana music");
	}
}

 