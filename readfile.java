import java.util.*;
import java.io.*;
import java.lang.*;
class readfile
{
      private boolean empty=true;
      private Vector vect=new Vector();
      synchronized public void write1(File f)
      {
                   while(!empty)
            {
                   try{
                   wait();
                   }
                   catch(InterruptedException e1)
                   {
                   System.out.println(e1.getMessage());
                   }
            }
	try{
                  FileInputStream fis=new FileInputStream(f);
                  Vector v=new Vector();
                  int ch;
                  while((ch=fis.read())!=-1)
                  v.add((char)ch);
                  fis.close();
	vect=v;
	}
	catch(IOException e2)
                   {
                   System.out.println(e2.getMessage());
                   }
	
                  empty=false;
                  notify();
  
                 
      }
	
      synchronized public Vector read1(Vector ve,int k)
      {
	
                   while(empty)
            {
                          try{
                   wait();
                   }
                   catch(InterruptedException e1)
                   {
                   System.out.println(e1.getMessage());
                   }
            }     
	int j=0;
	StringBuffer st=new StringBuffer();
	File f=new File(k+"file.txt");
	try
	{
                   FileOutputStream fos=new FileOutputStream(f);
	
	Iterator iter=ve.iterator();
	while(iter.hasNext())
	st=st.append(iter.next());
	String str=st.toString();
	System.out.println(str);
	int x=str.length();
	while(x-->0)
{
	fos.write(str.charAt(j));
	j++;
}
	fos.close();
	}
	catch(IOException e)
	{
	System.out.println(e.getMessage());
                   }
	notify();
	empty=true;
                  return vect;
                   
      }
}