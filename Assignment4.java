import java.io.*;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
public class Assignment4 {
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment hoe");

//FUll Name
        JLabel labelName;
        labelName= new JLabel("Name");
        labelName.setBounds(0, 5, 100, 30);
        JTextField textFieldName;
        textFieldName = new JTextField("Enter name");
        textFieldName.setBounds(80,5,200,30);
        frame.add(labelName);
        frame.add(textFieldName);
//Gender
        JLabel labelGender;
        labelGender= new JLabel("Gender");
        labelGender.setBounds(0, 50, 100, 30);
        frame.add(labelGender);
        JRadioButton r1=new JRadioButton("A) Male");    
        JRadioButton r2=new JRadioButton("B) Female");  
        JRadioButton r3=new JRadioButton("B) Others"); 
        r1.setBounds(75,50,100,30);    
        r2.setBounds(180,50,100,30);
        r3.setBounds(300,50,100,30);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);bg.add(r3);   
        frame.add(r1);frame.add(r2); frame.add(r3);

//Permanent Address
        JLabel labelPermAdd;
        labelPermAdd= new JLabel("Permanent Address");
        labelPermAdd.setBounds(0, 100, 200, 30);
        JTextField textPermAdd;
        textPermAdd = new JTextField();
        textPermAdd.setBounds(170,100,200,30);
        frame.add(labelPermAdd);
        frame.add(textPermAdd);

//Temporary Add
        JLabel labelTempAdd;
        labelTempAdd= new JLabel("Temporary Address");
        labelTempAdd.setBounds(0, 130, 200, 30);
        JTextField textTempAdd;
        textTempAdd = new JTextField();
        textTempAdd.setBounds(170,130,200,30);
        frame.add(labelTempAdd);
        frame.add(textTempAdd);

        JLabel phoneNumber ;
        phoneNumber= new JLabel("Phone Number");
        phoneNumber.setBounds(0, 180, 200, 30);
        JTextField textPhoneNumber;
        textPhoneNumber = new JTextField();
        textPhoneNumber.setBounds(170,180,200,30);
        frame.add(phoneNumber);
        frame.add(textPhoneNumber);

        JLabel labelEmail ;
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(0, 200, 200, 30);
        JTextField textEmail;
        textEmail = new JTextField();
        textEmail.setBounds(170,210,200,30);
        frame.add(textEmail);
        frame.add(labelEmail);

        JLabel labelPassword;
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(0, 250, 200, 30);
        JPasswordField passwordField;
        passwordField = new JPasswordField();
        passwordField.setBounds(170, 260, 200, 30);
        frame.add(passwordField);
        frame.add(labelPassword);

        JLabel labelConfirmPass;
        labelConfirmPass = new JLabel("Confirm Password");
        labelConfirmPass.setBounds(0, 280, 200, 30);
        JPasswordField confirmPassField;
        confirmPassField = new JPasswordField();
        confirmPassField.setBounds(170, 290, 200, 30);
        frame.add(confirmPassField);
        frame.add(labelConfirmPass);

        JLabel labelQualification;
        labelQualification= new JLabel("Qualifications");
        labelQualification.setBounds(0, 330, 200, 30);
        String qualificationString[]={"SLC","+2","Bachelors","Masters"};        
        JComboBox cb=new JComboBox(qualificationString);    
        cb.setBounds(170, 340,200 ,30);    
        frame.add(cb);   
        frame.add(labelQualification);

        JLabel labelKnowledge;
        labelKnowledge= new JLabel("Tick the Programming language that you");
        labelKnowledge.setBounds(0, 380, 500, 30);
        frame.add(labelKnowledge);
        JCheckBox checkBox1;
        checkBox1 = new JCheckBox("C++");  
        checkBox1.setBounds(0,410, 50,50);  
        JCheckBox checkBox2;
        checkBox2 = new JCheckBox("Java");  
        checkBox2.setBounds(60,410, 60,50);  
        JCheckBox checkBox3;
        checkBox3 = new JCheckBox("HTML");  
        checkBox3.setBounds(130,410, 70,50);  
        JCheckBox checkBox4;
        checkBox4 = new JCheckBox("php");  
        checkBox4.setBounds(200,410, 50,50);  
        JCheckBox checkBox5;
        checkBox5 = new JCheckBox("C#");  
        checkBox5.setBounds(250,410, 50,50);  
        JCheckBox checkBox6;
        checkBox6 = new JCheckBox("C");  
        checkBox6.setBounds(300,410, 50,50);  
        frame.add(checkBox1);  
        frame.add(checkBox2);  
        frame.add(checkBox3);  
        frame.add(checkBox4);  
        frame.add(checkBox5);  
        frame.add(checkBox6); 


        JLabel labelExperiance;
        labelExperiance = new JLabel("Describe your work experiance");
        labelExperiance.setBounds(0, 460, 500, 30);
        JTextArea textExperiance;
        textExperiance = new JTextArea();
        textExperiance.setBounds(0, 500, 500, 100);
        frame.add(textExperiance);
        frame.add(labelExperiance);

        JButton button = new JButton("Your Image");
        button.setBounds(130,1100,150,30); 
        frame.add(button);

        frame.setSize(1000,2000);  
        frame.setLayout(null);  
        frame.setVisible(true);     
    }
}
