import java.io.*;
import java.util.*;

class UnderFlowException extends Exception
{
	public UnderFlowException(String str)
	{
	super(str);
	}
}


class mystack
{
     
      Vector<String> v=new Vector<String>();
      public void push(String o)
      {
            
             v.add(o);
	
             }
             
      public void pop(int a) throws UnderFlowException
      {
	 Iterator itr=v.iterator();
             if(itr.hasNext()==true)
	{
             System.out.println((String)v.get(a));
	v.remove(a);
	}
	else
	{
	UnderFlowException e=new UnderFlowException("String is already empty");
	throw e;
	}
	
             }
       public void empty()
      {
	
             Iterator itr=v.iterator();
             if(itr.hasNext()==true)
             System.out.println("stack is not empty");
             else
             System.out.println("stack is empty");
}  
      
}