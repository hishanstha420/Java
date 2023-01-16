
import java.rmi.*;


public class Server {
	public static void main(String [] args) {
		try
		{
		AddC obj= new AddC();
		Naming.rebind("FACTORIAL", obj);
		AddC obj1= new AddC();
		Naming.rebind("ADD", obj1);
		AddC obj2= new AddC();
		Naming.rebind("MUL", obj2);
		System.out.println("Server Started.");
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}

}
}
