import java.awt.*;

class calc
{
	public static void main(String args[])
	{
	Frame p=new Frame();
	p.setSize(400,300);
	p.setBackground(Color.cyan);
	
	Panel p1=new Panel();
	p1.setLayout(new GridLayout(0,1));
	TextField tf=new TextField();
		p1.add(tf);
	p.add(p1,"North");
	Panel f=new Panel();
	f.setLayout(new GridLayout(4,4));
	Button b1=new Button("1");
	f.add(b1);
	
	Button b2=new Button("2");
	f.add(b2);

	Button b3=new Button("3");
	f.add(b3);

	Button b4=new Button("+");
	f.add(b4);

	Button b5=new Button("4");
	f.add(b5);

	Button b6=new Button("5");
	f.add(b6);

	Button b7=new Button("6");
	f.add(b7);

	Button b8=new Button("-");
	f.add(b8);

	Button b9=new Button("7");
	f.add(b9);

	Button b10=new Button("8");
	f.add(b10);

	Button b11=new Button("9");
	f.add(b11);

	Button b12=new Button("*");
	f.add(b12);

	Button b13=new Button("C");
	f.add(b13);

	Button b14=new Button("0");
	f.add(b14);

	Button b15=new Button("/");
	f.add(b15);
		
	Button b16=new Button("=");
	f.add(b16);
	p.add(f);
	p.setVisible(true);
	}
}