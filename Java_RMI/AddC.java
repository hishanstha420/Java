
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements addI{
	public AddC() throws RemoteException{
		super();	
	}
	public int add (int x, int y) throws RemoteException{
		return x + y;
	}
	public int mul (int x, int y) throws RemoteException{
		return x * y;
	}
	public int factorial(int x) {
	if (x == 0 || x == 1){ return 1; }
	return x * factorial(x - 1);
}
}