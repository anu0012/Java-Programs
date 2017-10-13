import java.awt.*;

class form
{
	public static void main(String args[])
	{
	Frame f=new Frame();
	f.setBackground(Color.cyan);
	f.setSize(400,300);
	
	f.setLayout(new GridBagLayout());
	Label l1=new Label("Name");
	GridBagConstraints gbc=new GridBagConstraints();
	gbc.gridx=0;  gbc.gridy=0;
	gbc.gridwidth=4;  gbc.gridheight=4;
	Insets i=new Insets(2,4,8,10);
	gbc.insets=i;
	f.add(l1,gbc);
	TextField tf1=new TextField(10);
	gbc.gridx=4; gbc.gridy=0;
	
	f.add(tf1,gbc);

	Label l2=new Label("Password");
	gbc.gridy=4; gbc.gridx=0;
	f.add(l2,gbc);

	TextField tf2=new TextField(10);
	gbc.gridx=4;
	gbc.gridy=4;
	
	f.add(tf2,gbc);

	Button b=new Button("OK");
	gbc.gridx=0; gbc.gridy=8;
	gbc.gridwidth=8;
	b.setBackground(Color.lightGray);
	f.add(b,gbc);

	f.setVisible(true);
	}
}
