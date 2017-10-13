import java.awt.*;

class quiz
{
	public static void main(String args[])
	{
	Frame f=new Frame();
	f.setSize(400,300);
	f.setLayout(new GridLayout(7,1));

	Panel p=new Panel();
	Label l1=new Label("Q. Capital of Rajasthan ?");
	p.add(l1);
	f.add(p);
	
	Panel p1=new Panel();
	Label l2=new Label("A. ");
	p1.add(l2);
	Checkbox cb1=new Checkbox("Jaipur");
	p1.add(cb1);
	f.add(p1);

	Panel p2=new Panel();
	Label l3=new Label("B. ");
	p2.add(l3);
	Checkbox cb2=new Checkbox("Ajmer");
	p2.add(cb2);
	f.add(p2);

	Panel p3=new Panel();
	Label l4=new Label("C. ");
	p3.add(l4);
	Checkbox cb3=new Checkbox("Delhi");
	p3.add(cb3);
	f.add(p3);

	Panel p4=new Panel();
	Label l5=new Label("D. ");
	p4.add(l5);
	Checkbox cb4=new Checkbox("Bikaner");
	p4.add(cb4);
	f.add(p4);

	Panel p5=new Panel();
	Button b1=new Button("prev");
	p5.add(b1);
	Button b2=new Button("next");
	p5.add(b2);
	f.add(p5);
	f.setVisible(true);
	}
}
	