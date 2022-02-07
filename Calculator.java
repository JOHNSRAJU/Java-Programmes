import java.awt.*;
import java.awt.event.*;
class EventHandlingCalc extends Frame implements ActionListener {
	String str="0";
	String strcpy,answer;
	double ans;
	char operation;
	double num1,num2;
	
	Button button0 = new Button("0");
	Button button1 = new Button("1");
	Button button2 = new Button("2");
	Button button3 = new Button("3");
	Button button4 = new Button("4");
	Button button5 = new Button("5");
	Button button6 = new Button("6");
	Button button7 = new Button("7");
	Button button8 = new Button("8");
	Button button9 = new Button("9");
	Button buttonPlus = new Button("+");
	Button buttonMinus = new Button("-");
	Button buttonMulti = new Button("*");
	Button buttonDivi = new Button("/");
	Button buttonDot = new Button(".");
	Button buttonEqual = new Button("=");
	Button buttonc = new Button("C");
	Frame f = new Frame();
	Panel panel = new Panel();
	TextField textField = new TextField();
	
	Label label = new Label();
	
	EventHandlingCalc(){
		f.setTitle("Calculator");
		f.setVisible(true);
		//f.setSize(550,450);
		textField.setBounds(10,50,250,50);
		label.setBounds(10,110,250,30);
		label.setBackground(Color.cyan);
		f.setBounds(200,200,270,470);
		f.setLayout(null);
		f.add(textField);
		f.add(label);
		f.setBackground(Color.LIGHT_GRAY);
		panel.setVisible(true);
		panel.setBounds(10,150,250,250);
		panel.setLayout(new GridLayout(4,4));
		buttonc.setBackground(Color.GRAY);
		panel.add(buttonc);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		buttonPlus.setBackground(Color.GRAY);
		panel.add(buttonPlus);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		buttonMinus.setBackground(Color.GRAY);
		panel.add(buttonMinus);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		buttonMulti.setBackground(Color.GRAY);
		buttonDivi.setBackground(Color.GRAY);
		buttonDot.setBackground(Color.GRAY);
		panel.add(buttonMulti);
		panel.add(buttonDivi);
		panel.add(buttonDot);
		panel.add(button0);
		
		f.add(panel);
		buttonEqual.setBackground(Color.gray);
		buttonEqual.setBounds(100,400,60,60);
		f.add(buttonEqual);
	
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonDivi.addActionListener(this);
		buttonDot.addActionListener(this);
		buttonc.addActionListener(this);
		buttonMulti.addActionListener(this);
		buttonEqual.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button0) {
			strcpy=textField.getText();
			str = strcpy+'0';
			textField.setText(str);
		}
		else if(e.getSource()==button1) {
			strcpy=textField.getText();
			str = strcpy+'1';
			textField.setText(str);
		}
		else if(e.getSource()==button2) {
			strcpy=textField.getText();
			str = strcpy+'2';
			textField.setText(str);
		}
		else if(e.getSource()==button3) {
			strcpy=textField.getText();
			str = strcpy+'3';
			textField.setText(str);
		}
		else if(e.getSource()==button4) {
			strcpy=textField.getText();
			str = strcpy+'4';
			textField.setText(str);
		}
		else if(e.getSource()==button5) {
			strcpy=textField.getText();
			str = strcpy+'5';
			textField.setText(str);
		}
		else if(e.getSource()==button6) {
			strcpy=textField.getText();
			str = strcpy+'6';
			textField.setText(str);
		}
		else if(e.getSource()==button7) {
			strcpy=textField.getText();
			str = strcpy+'7';
			textField.setText(str);
		}
		else if(e.getSource()==button8) {
			strcpy=textField.getText();
			str = strcpy+'8';
			textField.setText(str);
		}
		else if(e.getSource()==button9) {
			strcpy=textField.getText();
			str = strcpy+'9';
			textField.setText(str);
		}
     	else if(e.getSource()==buttonDot) {
			strcpy=textField.getText();
			str = strcpy+'.';
			textField.setText(str);
     	}
		else if(e.getSource()==buttonPlus) {
			num1 =Double.parseDouble(textField.getText());
			str ="";
			textField.setText(str);
			operation='+';
		}
		else if(e.getSource()==buttonMinus) {
			num1 =Double.parseDouble(textField.getText());
			str ="";
			textField.setText(str);
			operation='-';
		}
		else if(e.getSource()==buttonMulti) {
			num1 =Double.parseDouble(textField.getText());
			str ="";
			textField.setText(str);
			operation='*';
		}
		else if(e.getSource()==buttonDivi) {
			num1 =Double.parseDouble(textField.getText());
			str ="";
			textField.setText(str);
			operation='/';
		}
		else if(e.getSource()==buttonc) {
			num1=0;
			num2=0;
			str ="";
			textField.setText(str);
			label.setText("");
		}
		else if(e.getSource()==buttonEqual) {
			num2 =Double.parseDouble(textField.getText());
			switch(operation) {
				case '+':
					ans=num1+num2;
					answer = Double.toString(ans); 
					break;
				case '-':
					ans=num1-num2;
					answer = Double.toString(ans); 
					break;
				case '*':
					ans=num1*num2;
					answer = Double.toString(ans); 
					break;
				case '/':
					try {
						ans=num1/num2;
						answer = Double.toString(ans); 
					}
					catch(ArithmeticException ae) {
						answer=ae.toString();
					}
					break;
				default:
					answer = "Invalid Input";
			}
			textField.setText(answer);
			String stri = new String("ANS  "+ num1 +"  "+operation+"  " + num2 +" = "+answer);
			label.setText(stri);
			operation='/';
		}
		else {
			textField.setText("Invalid Input");
		}
	}
}
public class Calculator {
	public static void main(String []args) {
		EventHandlingCalc eventCalc = new EventHandlingCalc();
	}
}