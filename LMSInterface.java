import java.rmi.*; 
public interface LMSInterface extends Remote 
{ 
public String issueBook(String bookName,int amount)throws RemoteException; 
public String returnBook(String bookName,int amount)throws RemoteException; 
public String displayBook(int i)throws RemoteException; 
}