import java.awt.*;

class demogui
{
	public static void main(String args[])
	{
	Frame f=new Frame();
	f.setSize(400,300);
	f.setBackground(Color.cyan);
	f.setLayout(new FlowLayout());
	Label l =new Label("Name");
		f.add(l);
		TextField tf=new TextField();
		f.add(tf);
		Button b=new Button("Enter");
		f.add(b);
	f.setVisible(true);
	}
}