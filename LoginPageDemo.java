import java.awt.*;
import java.awt.event.*;
public class LoginPageDemo extends Frame implements ActionListener  {
	Button button;
	TextField textField1 = new TextField(20);
	TextField textField2 = new TextField(20);
	 
	LoginPageDemo(){
		
		setTitle("Login Page");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		
		button=new Button("SUBMIT");
		add(textField1);
		add(textField2);
		add(button);
		textField1.setText("UserName");
		textField2.setText("Password");
		button.addActionListener(this);
		textField1.addActionListener(this);
		textField2.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("User name :- "+textField1.getText());
		System.out.println("PASSWORD  :- "+textField2.getText());
		
	}
	
	public static void main(String[] args) {
		new LoginPageDemo();
	}

}
