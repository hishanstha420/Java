
import java.rmi.*;


public class Client {
	public static void main(String []  args){
		try{
			addI obj1=(addI) Naming.lookup("ADD");
			int n1 =obj1.add(3, 5);
			System.out.println("Addition is :"+n1);

			addI obj2=(addI) Naming.lookup("MUL");
			int n2 =obj2.mul(3, 5);
			System.out.println("Multiplication is :"+n2);

			addI obj= (addI) Naming.lookup("FACTORIAL");
			int n= obj.factorial(5);
			System.out.println("Factorial is :"+n);
		}
		catch(Exception e){
			System.out.println("Exception :"+e);
		}

}
}
