import java.applet.*;
import java.awt.*;

public class demo extends Applet
{
	public void init()
	{
	    	Label l =new Label("Name");
		add(l);
		TextField tf=new TextField();
		add(tf);
		Button b=new Button("Enter");
		add(b);
	}
}