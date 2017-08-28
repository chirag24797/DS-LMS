import java.rmi.*;
import java.rmi.server.*;
public class LMSImpl extends UnicastRemoteObject implements LMSInterface
{	
	String bks[]={"JAVA","C","HTML","CSS"};
	int quantity[]={10,10,10,10};
	public LMSImpl() throws RemoteException
	{
	}

	public String issueBook(String bookName,int amount)
	{
		int i,flag=0;
		for(i=0;i<bks.length;i++)
		{
			if(bookName.equalsIgnoreCase(bks[i]))
			{
				flag=1;
				break;
			}
		}
			if(flag==1)
			{
				if(quantity[i]==0)
				{
					return "Books not available in Book "+bks[i];	
				}
				else
				{
					quantity[i]=quantity[i]-amount;
					return "Success!!";
				}
			}
		else
		return "Incorrect Book Name";
	}
 
	public String returnBook(String bookName,int amount)
	{
		int i,flag=0;
		for(i=0;i<bks.length;i++)
		{
		if(bookName.equalsIgnoreCase(bks[i]))
			{
				flag=1;
				break;
			}
			}
			if(flag==1)
			{
				if(quantity[i]==10)
				{
					return "Book Already Returned";
				}
				else
				{
				quantity[i]=quantity[i]+amount;
				return "Success!!";
				}
			}
		else
		return "Incorrect Book Name";
	}

 
	
	 
	public String displayBook(int i)
	{
		return (bks[i]+"\t"+quantity[i]);
	} 
 
}
