import java.rmi.*;
public class LMSServer
{
	public static void main(String args[])
	{
		try
		{
			Naming.rebind("LMSImpl",new LMSImpl());
			System.out.println("Server is ready, Throw some requests...");
		}
		catch(Exception e)
		{
			System.out.println("Server could not be loaded:"+e);
		}
	}
}