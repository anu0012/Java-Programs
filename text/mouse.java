import java.awt.*;
import java.awt.event.*;

class mouse extends Frame
{
	Frame f;  Panel p; Graphics g=getGraphics(); int x,y;
	
	public void paint(Graphics g)
	{
	g.setColor(Color.red);
	g.drawLine(10,20,30,40);
	}

	public static void main(String args[])
	{
	mouse m=new mouse();
	m.setSize(400,400);
	m.setVisible(true);
	}
}
	