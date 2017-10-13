import java.io.*;
import java.util.*;
class usemystack
{
      public static void main(String args[])
      {
             String arr[]=new String[3];
	int i;
             Console con=System.console();
             mystack m=new mystack();
             for(i=0;i<arr.length;i++)
             arr[i]=con.readLine();
             
             for(i=0;i<arr.length;i++)
             m.push(arr[i]);
             
             for(i=arr.length-1;i>=0;i--)
	{
	try{
             m.pop(i);
	}
	catch(Exception e){
	System.out.println(e.getMessage());
	}
                 }
	
	
}
}