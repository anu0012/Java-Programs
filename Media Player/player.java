
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

class player implements ActionListener,LineListener
{
	JFrame jf; 
	//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JMenuBar mb;    JMenu m1,m2;    JMenuItem opn,ext,abt;
	public player()
	{
	jf=new JFrame("Media Player");
	jf.setSize(400,300);
	mb=new JMenuBar();
	m1=new JMenu("File");
	m2=new JMenu("About");
	opn=new JMenuItem("Open");
	opn.addActionListener(this);
	ext=new JMenuItem("Exit");
	ext.addActionListener(this);
	abt=new JMenuItem("About the Player");
	abt.addActionListener(this);
	m1.add(opn);  m1.add(ext);  m2.add(abt);
	mb.add(m1);  mb.add(m2);
	jf.setJMenuBar(mb);
	jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
	if(s.equals("Open"))
	{
	JFileChooser jfc=new JFileChooser();
	
	int result=jfc.showOpenDialog(jf);
	if(result==JFileChooser.APPROVE_OPTION)
	 {
		
		
		this.audio(jfc.getSelectedFile().getName());
	    
	 }
	 
	}
	
	if(s.equals("Exit"))
	System.exit(0);
	
	if(s.equals("About the Player"))
	JOptionPane.showMessageDialog(null,"Created by d@rkGuy\n  Version 1.0");
	}
	public static void main(String args[])
	{
	player p=new player();
	}
	boolean completed; int flag=0;
	public void audio(String x)
	{
	   File f=new File(x);
	   
	   try{
	   AudioInputStream ais=AudioSystem.getAudioInputStream(f);
	   AudioFormat af=ais.getFormat();                                
	   DataLine.Info info=new DataLine.Info(Clip.class,af);
	   Clip c=(Clip)AudioSystem.getLine(info);
	   c.addLineListener(this);
	   c.open(ais);
	   if(flag==1)
	   {
	   flag=0;
	   c.close();
	   }
	   if(flag==0)
	   c.start();
	
	   
	 /*  while(!completed)
	     {
			try{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			e.getMessage();
			}
		 }*/
		 if(completed==true)
		 c.close();
	   }
	   catch(UnsupportedAudioFileException e)
	   {
			Label l=new Label("The specified audio file is not supported.");
			jf.add(l);
	   }
	   catch(LineUnavailableException e)
	   {
	   Label l=new Label("Audio line for playing back is unavailable.");
			jf.add(l);
	   }
	   catch(IOException e)
	   {
	   Label l=new Label("Error playing the audio file.");
			jf.add(l);
	   }
	}
	
	public void update(LineEvent le)
	{
	LineEvent.Type type=le.getType();
	
	if(type==LineEvent.Type.START)
	{
			flag=1;
			Label l=new Label("Playing music");
			jf.add(l);
	}
	else if(type==LineEvent.Type.STOP)
	{
		completed=true; flag=0;
		Label l=new Label("Music Stopped !");
			jf.add(l);
	}
	}
}
	
