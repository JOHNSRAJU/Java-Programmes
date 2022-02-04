import java.awt.*;
import java.awt.event.*;
public class LoginPageDemo extends Frame implements ActionListener ,ItemListener {
	Button button=new Button("SUBMIT");
	boolean student;
	Checkbox checkbox1,checkbox2;
	TextField textField1 = new TextField(20);
	TextField textField2 = new TextField(20);
	TextField textField3 = new TextField(20);
	TextField textField4 = new TextField(20);
	Label labelTitle = new Label();
	Label label1 = new Label();
	Label label2 = new Label();
	Label label3 = new Label();
	Label label4 = new Label();
	LoginPageDemo(){
		
		setTitle("Sign up page");

		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		labelTitle.setText("                     Enter Details                            ");
		add(labelTitle);
		labelTitle.setForeground(Color.RED);
		
		 
		label1.setText("Name :            ");
		add(label1);
		add(textField1);
		
		
		label2.setText("E-mail :            ");
		add(label2);
		add(textField2);
		
		label3.setText("Mob Number :");
		add(label3);
		add(textField3);
		
		label4.setText("Place :              ");
		add(label4);
		add(textField4);
		
		
		
		
		setBounds(100,150,290,250);
		setBackground(Color.white);
		
		
		CheckboxGroup cbg = new CheckboxGroup();
		checkbox1 = new Checkbox("Student",cbg,true);
		checkbox2= new Checkbox("Facaulty",cbg,true);
		add(checkbox1);
		add(checkbox2);
		
		button.setBackground(Color.yellow );
		add(button);
		
		button.addActionListener(this);
		checkbox1.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ie) {}
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Name :- "+textField1.getText());
		System.out.println("E-mail  :- "+textField2.getText());
		System.out.println("Mob Number  :- "+textField3.getText());
		System.out.println("Place  :- "+textField4.getText());
		if(checkbox1.getState()) {
			System.out.println("Role :- Student");
		}
		else {
			System.out.println("Role :- Facualty");
		}
		
		
	}
	
	public static void main(String[] args) {
		new LoginPageDemo();
	}

}
