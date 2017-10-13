import java.awt.*;
import java.awt.event.*;

class form1 implements ActionListener
{
	Frame f;
	TextField t1,t2,t3,t4,t5,t6,t7,t8;
	Panel p1,p2,p3,p4,p5;
	Button b1,b2;
	CardLayout cl;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	public form1()
	{
	f=new Frame();
	f.setSize(400,300);
	p1=new Panel();
	b1=new Button("Back");
	b1.addActionListener(this);
	b2=new Button("Next");
	b2.addActionListener(this);
	p1.add(b1); p1.add(b2);
	f.add(p1,"South");

	cl=new CardLayout();
	p2=new Panel();
	p2.setLayout(cl);
	p3=new Panel();
	p3.setLayout(new GridBagLayout());
	GridBagConstraints gbc=new GridBagConstraints();
	gbc.gridwidth=4; gbc.gridheight=4;
	gbc.gridx=0; gbc.gridy=0;
	l1=new Label("Name");
	p3.add(l1,gbc);
	t1=new TextField(5);
	gbc.gridx=4; gbc.gridy=0;
	 p3.add(t1,gbc); 
	l2=new Label("Surname");
	gbc.gridx=0; gbc.gridy=4;
	p3.add(l2,gbc);
	t2=new TextField(5);
	gbc.gridx=4; gbc.gridy=4;
	 p3.add(t2,gbc);
	l3=new Label("Age");
	gbc.gridx=0; gbc.gridy=8;
	  p3.add(l3,gbc); 
	t3=new TextField(5);
	gbc.gridx=4; gbc.gridy=8;
	p3.add(t3,gbc);
	l4=new Label("Sex");
	gbc.gridx=0; gbc.gridy=12;
	  p3.add(l4,gbc); 
	t4=new TextField(5);
	gbc.gridx=4; gbc.gridy=12;
	   p3.add(t4,gbc);
	p2.add(p3);
	
	p4=new Panel();
	p4.setLayout(new GridBagLayout());
	gbc.gridwidth=4; gbc.gridheight=4;
	gbc.gridx=0; gbc.gridy=0;
	l5=new Label("Contact");
	p4.add(l5,gbc);
	t5=new TextField(5);
	gbc.gridx=4; gbc.gridy=0;
	 p4.add(t5,gbc); 
	l6=new Label("Status");
	gbc.gridx=0; gbc.gridy=4;
	p4.add(l6,gbc);
	t6=new TextField(5);
	gbc.gridx=4; gbc.gridy=4;
	 p4.add(t6,gbc);
	l7=new Label("Qualification");
	gbc.gridx=0; gbc.gridy=8;
	  p4.add(l7,gbc); 
	t7=new TextField(5);
	gbc.gridx=4; gbc.gridy=8;
	p4.add(t7,gbc);
	l8=new Label("Job");
	gbc.gridx=0; gbc.gridy=12;
	  p4.add(l8,gbc); 
	t8=new TextField(5);
	gbc.gridx=4; gbc.gridy=12;
	   p4.add(t8,gbc);
	p2.add(p4);

	p5=new Panel();
	p5.setLayout(new GridBagLayout());
	gbc.gridwidth=4; gbc.gridheight=4;
	gbc.gridx=0; gbc.gridy=0;
	l9=new Label("College");
	p5.add(l9,gbc);
	t5=new TextField(5);
	gbc.gridx=4; gbc.gridy=0;
	 p5.add(t5,gbc); 
	l6=new Label("School");
	gbc.gridx=0; gbc.gridy=4;
	p5.add(l6,gbc);
	t6=new TextField(5);
	gbc.gridx=4; gbc.gridy=4;
	 p5.add(t6,gbc);
	l7=new Label("Skills");
	gbc.gridx=0; gbc.gridy=8;
	  p5.add(l7,gbc); 
	t7=new TextField(5);
	gbc.gridx=4; gbc.gridy=8;
	p5.add(t7,gbc);
	l8=new Label("Achievements");
	gbc.gridx=0; gbc.gridy=12;
	  p5.add(l8,gbc); 
	t8=new TextField(5);
	gbc.gridx=4; gbc.gridy=12;
	   p5.add(t8,gbc);
	p2.add(p5);
	

	f.add(p2);
	f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
	String str=e.getActionCommand();
	if(str.equals("Back"))
	cl.previous(p2);
	else
	cl.next(p2);
	}

	public static void main(String args[])
	{
	form1 fm=new form1();
	}

}
	