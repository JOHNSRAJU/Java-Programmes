package Testing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class LoginPageWithFile  extends JFrame implements ActionListener{
	JLabel label1= new JLabel("USERNAME");
	JLabel label2= new JLabel("PASSWORD");
	
	JTextField text1 = new JTextField(10);
	JPasswordField text2 = new JPasswordField(10); 
	
	JButton b = new JButton("SUBMIT");
	
	
	LoginPageWithFile() throws IOException{
		
		setVisible(true);
		setLayout(new FlowLayout());
		setBounds(100,100,200,200);
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(b);
		
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
				
				FileWriter	fr = new FileWriter("MyLoginData.txt",true);
				fr.write("User Name :- "+text1.getText()+"\t");
				char[] ch = text2.getPassword();
				String str = new String(ch);
				fr.write("Password  :- "+str+"\n");
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
	}
	
	
	public static void main(String args[]) throws IOException {
		LoginPageWithFile l = new LoginPageWithFile();
	}
}
	


