import java.io.*;
import java.util.*;

class wordcount
{
      
      public static void main(String args[]) throws Exception
      {
             System.out.println("Enter File Name :");
             Console con=System.console();
             String s=con.readLine();
             int count=0,x;
             File f=new File(s);
             StreamTokenizer st=new StreamTokenizer(new FileInputStream(f));
             HashSet set=new HashSet();
	HashMap map=new HashMap();
             while(st.nextToken()!=StreamTokenizer.TT_EOF)
             {
	String s1;
	switch(st.ttype)
	{
	case StreamTokenizer.TT_NUMBER:
		s1=st.nval+"";
		if(set.contains(s1))
	{
                   map.put(count,s1);
	count++;
	}
                   else
	{
                   set.add(s1);
	map.put(count,s1);
	count++;
	}
	 break;

	case StreamTokenizer.TT_WORD:
	s1=st.sval;
                  if(set.contains(s1))
	{
                   map.put(count,s1);
	count++;
	}
                   else
	{
                   set.add(s1);
	map.put(count,s1);
	count++;
	}
	break;

	default:
	s1=""+((char)st.ttype);
	if(set.contains(s1))
	{
                   map.put(count,s1);
	count++;
	}
                   else
	{
                   set.add(s1);
	map.put(count,s1);
	count++;
	}
                   }
            }
             
             
             Iterator iter=set.iterator();
             while(iter.hasNext())
             {
                                  
                                  String line=(String)iter.next();
                                  x=0;
                                  for(int i=0;i<count;i++)
{
		if(line.equals((String)map.get(i)))
		x++;
            
             }
	         System.out.println(x+" "+line);
             
             }
             
         }
}    
             