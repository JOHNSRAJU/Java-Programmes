import java.awt.*;
import java.awt.event.*;
public class LoginPageDemo extends Frame implements ActionListener {
	Button button;
	TextField textField1 = new TextField(20);
	TextField textField2 = new TextField(20);
	TextField textField3 = new TextField(20);
	TextField textField4 = new TextField(20);
	LoginPageDemo(){
		
		setTitle("Sign up page");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		button=new Button("SUBMIT");
		add(textField1);
		add(textField2);
		add(textField3);
		add(textField4);
		add(button);
		textField1.setText("Name");
		textField2.setText("E-mail");
		textField3.setText("Mob Number");
		textField4.setText("Place");
		button.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Name :- "+textField1.getText());
		System.out.println("E-mail  :- "+textField2.getText());
		System.out.println("Mob Number  :- "+textField3.getText());
		System.out.println("Place  :- "+textField4.getText());
		
	}
	
	public static void main(String[] args) {
		new LoginPageDemo();
	}

}
