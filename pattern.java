import java.awt.*;

class pattern
{
	public static void main(String args[])
	{
	Frame f=new Frame();
	f.setSize(400,300);
	f.setLayout(new GridLayout(2,2));
	
	Panel p=new Panel();
	p.setLayout(new GridLayout(2,1));
	Button b1=new Button("1");
	Button b2=new Button("2");
	p.add(b1); p.add(b2);
	f.add(p);

	Panel p1=new Panel();
	p1.setBackground(Color.cyan);
	p1.setLayout(new GridLayout(1,3));
	Button b3=new Button("3");
	p1.add(b3);
	Button b4=new Button("4");
	p1.add(b4);
	Button b5=new Button("5");
	p1.add(b5);
	f.add(p1);

	Panel pi=new Panel();
	pi.setLayout(new GridLayout(1,2));
	Panel p2=new Panel();
	p2.setLayout(new GridLayout(2,1));
	Button b6=new Button("6");
	Button b7=new Button("7");
	p2.add(b6); p2.add(b7);
	pi.add(p2);
	Panel p3=new Panel();
	p3.setLayout(new GridLayout(3,1));
	Button b8=new Button("8");
	Button b9=new Button("9");
	Button b10=new Button("10");
	p3.add(b8); p3.add(b9); p3.add(b10);
	pi.add(p3);
	f.add(pi);

	Panel pj=new Panel();
	pj.setLayout(new GridLayout(2,1));
	Panel p4=new Panel();
	p4.setLayout(new GridLayout(1,2));
	Button b11=new Button("11");
	Button b12=new Button("12");
	p4.add(b11); p4.add(b12);
	pj.add(p4);
		
	Panel p5=new Panel();
	p5.setLayout(new GridLayout(1,3));
	Button b13=new Button("13");
	Button b14=new Button("14");
	Button b15=new Button("15");
	p5.add(b13); p5.add(b14); p5.add(b15);
	pj.add(p5);
	f.add(pj);
	f.setVisible(true);
	}
}

	
	