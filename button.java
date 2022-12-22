import java.io.*;
import javax.swing.*;
import java.awt.GridLayout;

public class button {
    public static void main(String[] args) {
        
        JFrame frame =new JFrame("Button Example");
        JButton button = new JButton("Enter");
       // setLayout(new GridLayout(5,5));
        //button.setBounds(130,120,95,30); 
        frame.add(button);
        JLabel label1;
        label1= new JLabel("Full Name");
        //label1.setBounds(130, 50, 100, 60);
        frame.add(label1);
        JTextField textField1;
        textField1=new JTextField();
       // textField1.setBounds(130, 90, 150, 20); 
        frame.add(textField1);  
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);
           
    }
 

        
}
    