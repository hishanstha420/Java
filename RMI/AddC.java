
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class AddC extends UnicastRemoteObject implements AddI {
    public AddC() throws RemoteException
    {
        super();
    }
    public int add(int x,int y) throws RemoteException
    {
        return x+y;
    }
}

