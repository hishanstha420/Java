import java.rmi.Remote;

import java.rmi.*;

public interface addI extends Remote{
	public int add (int x, int y) throws RemoteException;
	public int mul(int x, int y) throws RemoteException;
	public int factorial(int x) throws Exception;

}