import java.io.*;
class space{
      public static void main(String args[])
      {
             Console con=System.console();
             
StringBuffer s1=new StringBuffer();
	s1.append(con.readLine());
	String str;
	str=s1.toString();
	char arr[];
	arr=str.toCharArray();             

             for(int i=0;i<s1.length();i++)
             {
                     if(arr[i]==' ')
	{
                     s1.deleteCharAt(i);
	str=s1.toString();
	arr=str.toCharArray();
	i--;
	}
                     }
	System.out.println(s1);
}
}