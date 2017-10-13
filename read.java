import java.util.*;
import java.lang.*;
import java.io.*;
class read extends Thread
{
      private readfile rrf;
      public read(readfile r1)
      {
             rrf=r1;
      }
      
      public void run()
      {
             
             Vector vec=new Vector();
	
             
             
             File f=new File("C:\\Users\\Student\\Documents\\java\\text");
             File arr[];
             arr=f.listFiles();
            int x=arr.length;
	vec=rrf.read1(vec,x);
             while(x!=0)
             {
             
	          
                  try
                  {
                          sleep((int)(Math.random()*10));
                  }
                  catch(InterruptedException e)
                  {
                          System.out.print(e.getMessage());
                  }
	 rrf.read1(vec,x);
		x--;  
             }
             }
}
             
             
      