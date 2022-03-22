package Testing;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;


public class DrawingUsingMouse extends JFrame implements MouseMotionListener{
	Label l;
	int x,y;
	DrawingUsingMouse(){
		l = new Label() ;
		setVisible(true);
		setBounds(200,200,400,400);
		setTitle("JOHNS");
		l.setBounds(10,0,150,10);
		setLayout(null);
		l.setText("X axis :  Y axis : ");
		add(l);
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		l.setText("X-axis : "+e.getX() +"   Y-axis : "+e.getY());
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
		l.setText("X-axis : "+e.getX() +"   Y-axis : "+e.getY());
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x,y,5,5);
		}
	
	public static void main(String[] args) {
		new DrawingUsingMouse();
	}
}

