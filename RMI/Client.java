
import java.rmi.*;

public class Client {
    public static void main(String[] args)
    {
        try
        {
            AddI obj = (AddI)Naming.lookup("ADD");
            System.out.println(obj.add(10,20));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
