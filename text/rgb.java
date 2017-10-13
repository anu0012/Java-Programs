import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;

class rgb implements AdjustmentListener
{
	Frame f;
	Panel p,p1,p2;
	Scrollbar sb1,sb2,sb3;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Color col;
	int x=0,y=0,z=0;

	public rgb()
	{
	f=new Frame();
	f.setSize(400,300);
	
	p2=new Panel();
	l1=new Label("RED");
	t1=new TextField("0",5);
	l2=new Label("GREEN");
	t2=new TextField("0",5);
	l3=new Label("BLUE");
	t3=new TextField("0",5);
	p2.add(l1); p2.add(t1); p2.add(l2); p2.add(t2); p2.add(l3); p2.add(t3);
	f.add(p2,"South");

	p1=new Panel();
	p1.setLayout(new GridLayout(1,3));
	sb1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	sb1.addAdjustmentListener(this);
	p1.add(sb1);
	sb2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	sb2.addAdjustmentListener(this);
	p1.add(sb2);
	sb3=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	sb3.addAdjustmentListener(this);
	p1.add(sb3);
	f.add(p1,"East");
	
	
	
	f.setVisible(true);
	}

	public void adjustmentValueChanged(AdjustmentEvent e)
	    {
	int value1=0;
	if(e.getSource()==sb1)
	{
	value1=sb1.getValue();
	t1.setText(value1+"");
	x=Integer.parseInt(t1.getText());
	y=Integer.parseInt(t2.getText());
	z=Integer.parseInt(t3.getText());
	col=new Color(x,y,z);
	f.setBackground(col);
	}
	else if(e.getSource()==sb2)
	{
	value1=sb2.getValue();
	t2.setText(value1+"");
	x=Integer.parseInt(t1.getText());
	y=Integer.parseInt(t2.getText());
	z=Integer.parseInt(t3.getText());
	col=new Color(x,y,z);
	f.setBackground(col);
	}
	else
	{
	value1=sb3.getValue();
	t3.setText(value1+"");
	x=Integer.parseInt(t1.getText());
	y=Integer.parseInt(t2.getText());
	z=Integer.parseInt(t3.getText());
	col=new Color(x,y,z);
	f.setBackground(col);
	}
	
	    }

	public static void main(String args[])
	{
	rgb r=new rgb();
	
	}

}