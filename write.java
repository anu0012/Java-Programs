import java.util.*;
import java.io.*;
import java.lang.*;
class write extends Thread
{
      private readfile rf;
      public write(readfile r)
      {
             rf=r;
      }
      
      public void run()
      {
             File f=new File("C:\\Users\\Student\\Documents\\java\\text");
             File arr[];
             arr=f.listFiles();
             System.out.println("Total Files are : "+arr.length);
             System.out.println("File names are :");
             for(int i=0;i<arr.length;i++)
             {
                  System.out.println(arr[i].getName());
             }
          
             for(int i=0;i<arr.length;i++)
             {
             
	              rf.write1(arr[i]);
		
                  try
                  {
                          sleep((int)(Math.random()*10));
                  }
                  catch(InterruptedException e)
                  {
                          System.out.print(e.getMessage());
                  }
             }
      }
}