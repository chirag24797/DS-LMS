import java.rmi.*;
import java.util.*;
public class LMSClient
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			LMSInterface lms=(LMSInterface)Naming.lookup("//localhost/LMSImpl");
			String bookName=null;
		    int amount;
			System.out.println("1. Book Issue\n2. Book Return\n3. Display Status\n4.Exit");
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
		    do
			{
			switch(ch)
			{
				case 1:
				System.out.println("Enter Name:");
				bookName=sc.next();
			    System.out.println("Enter No. of Books to Issue");
				amount=sc.nextInt();
				System.out.println(lms.issueBook(bookName,amount));
				
				break;

				case 2:
				System.out.println("Enter Name:");
				bookName=sc.next();
				System.out.println("Enter No. of Books to Return");
				amount=sc.nextInt();
				System.out.println(lms.returnBook(bookName,amount));
				
				break;

				case 3:
			    System.out.println("The Current Status");
				System.out.println("Book  \tStatus");
				for(int i=0;i<3;i++)
				{
					System.out.println(lms.displayBook(i));
				}
				break;	
			}
			System.out.println("1. Book Issue\n2. Book Return\n3. Display Status\n4.Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
		    
		}while(ch<4);
		}
		catch(Exception e)
		{
			System.out.println("Client Exception:"+e);
		}
	}
}
