import java.awt.*;
import java.awt.event.*;
import java.io.*;

class calculator implements ActionListener
{
	Frame p;
	Panel p1,f;
	TextField tf;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b15,b14,b16;
	double x,y;
	double a=0,b=1,c=0;
	String z=null;
	public calculator()
	{
	p=new Frame();
	p.setSize(400,300);
	p.setBackground(Color.cyan);
	
	p1=new Panel();
	p1.setLayout(new GridLayout(0,1));
	tf=new TextField();
		p1.add(tf);
	p.add(p1,"North");
	f=new Panel();
	f.setLayout(new GridLayout(4,4));
	b1=new Button("1");
	b1.addActionListener(this);
	f.add(b1);
	
	b2=new Button("2");
	b2.addActionListener(this);
	f.add(b2);

	b3=new Button("3");
	b3.addActionListener(this);
	f.add(b3);

	b4=new Button("+");
	b4.addActionListener(this);
	f.add(b4);

	b5=new Button("4");
	b5.addActionListener(this);
	f.add(b5);

	b6=new Button("5");
	b6.addActionListener(this);
	f.add(b6);

	b7=new Button("6");
	b7.addActionListener(this);
	f.add(b7);

	b8=new Button("-");
	b8.addActionListener(this);
	f.add(b8);

	b9=new Button("7");
	b9.addActionListener(this);
	f.add(b9);

	b10=new Button("8");
	b10.addActionListener(this);
	f.add(b10);

	b11=new Button("9");
	b11.addActionListener(this);
	f.add(b11);

	b12=new Button("*");
	b12.addActionListener(this);
	f.add(b12);

	b13=new Button("C");
	b13.addActionListener(this);
	f.add(b13);

	b14=new Button("0");
	b14.addActionListener(this);
	f.add(b14);

	b15=new Button("/");
	b15.addActionListener(this);
	f.add(b15);
		
	b16=new Button("=");
	b16.addActionListener(this);
	f.add(b16);
	
	p.add(f);
	p.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
	
	StringBuffer s;
	String str=e.getActionCommand();
	if(str.equals("1"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"1");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("2"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"2");
	x=Double.parseDouble(tf.getText());
	}
	
	else if(str.equals("3"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"3");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("4"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"4");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("5"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"5");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("6"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"6");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("7"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"7");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("8"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"8");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("9"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"9");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("0"))
	{
	if(x==0)
	{ tf.setText(null); }
	tf.setText(tf.getText()+"0");
	x=Double.parseDouble(tf.getText());
	}
	else if(str.equals("+"))
	{
	if(x!=0)
	{
	if(!tf.getText().equals(null))
	{
	x=Double.parseDouble(tf.getText());
	if(z==(null))
	{ a=x; x=0; }
	else {
	if(z.equals("+"))
	{
	a=a+x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("-"))
	{
	a=a-x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("*"))
	{
	a=a*x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("/"))
	{
	a=a/x;
	tf.setText(a+"");
	x=0;
	}
	}
	}
	}
	z="+";
	
	}
	else if(str.equals("*"))
	{
	if(x!=0)
	{
	if(!tf.getText().equals(null))
	{
	x=Double.parseDouble(tf.getText());
	if(z==(null))
	{ a=x; x=0; }
	else {
	if(z.equals("+"))
	{
	a=a+x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("-"))
	{
	a=a-x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("*"))
	{
	a=a*x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("/"))
	{
	a=a/x;
	tf.setText(a+"");
	x=0;
	}
	}
	}
	}
	z="*";
	
	}
	else if(str.equals("-"))
	{
	if(x!=0)
	{
	if(!tf.getText().equals(null))
	{
	x=Double.parseDouble(tf.getText());
	if(z==(null))
	{ a=x; x=0;}
	else {
	if(z.equals("+"))
	{
	a=a+x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("-"))
	{
	a=a-x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("*"))
	{
	a=a*x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("/"))
	{
	a=a/x;
	tf.setText(a+"");
	x=0;
	}
	}
	}
	}
	z="-";
	
	}
	else if(str.equals("/"))
	{
	if(x!=0)
	{
	if(!tf.getText().equals(null))
	{
	x=Double.parseDouble(tf.getText());
	if(z==(null))
	{ a=x; x=0;}
	else {
	if(z.equals("+"))
	{
	a=a+x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("-"))
	{
	a=a-x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("*"))
	{
	a=a*x;
	tf.setText(a+"");
	x=0;
	}
	else if(z.equals("/"))
	{
	a=a/x;
	tf.setText(a+"");
	x=0;
	}
	}
	}
	}
	z="/";
	
	}
	else if(str.equals("="))
	{
	y=Double.parseDouble(tf.getText());
	if(z.equals("+"))
	c=a+y;
	else if(z.equals("-"))
	c=a-y;
	else if(z.equals("*"))
	c=a*y;
	else if(z.equals("/"))
	c=a/y;
	tf.setText(c+"");
	z=null;
	a=0;
	}
	else if(str.equals("C"))
	{
	tf.setText(null);
	z=null;
	a=0;
	}
	
		

	}

	public static void main(String args[])
	{
	calculator cal=new calculator();
	}
}