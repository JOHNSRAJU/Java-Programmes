package Testing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TempConverter extends JFrame implements ActionListener{
	JTextField ct = new JTextField(10);
	
	JLabel cl = new JLabel("Celsius");
	JLabel fl = new JLabel("Farenheit :- ");
	JLabel frl = new JLabel();
	
	JButton co = new JButton("CONVERT");
	JButton re = new JButton("RESET");
	
	Panel p = new Panel();
	
	TempConverter() {
		setVisible(true);
		setTitle("Temp Converter");
		setBounds(100,100,220,200);
		setLayout(new FlowLayout());
	
		
		add(cl);
		add(ct);
		add(fl);
		add(frl);
		p.add(co);
		p.add(re);
		add(p);
		
		co.addActionListener(this);
		re.addActionListener(this);
	}

		
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==co) {
			String str = ct.getText();
			double cel = Double.parseDouble(str);
			double result = (cel*9/5)+32;
			String strResult = Double.toString(result);
			frl.setText(strResult);
		}
		
		else if(e.getSource()==re) {
			frl.setText(null);
			ct.setText(null);
		}
		
	}
	public static void main(String []args) {
		TempConverter t = new TempConverter();
	}
}
