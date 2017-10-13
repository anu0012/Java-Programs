import java.io.*;
class library
{
      public static void main(String args[])
      {
             item a[]=new item[20];
	int i;
             for(i=1;i<=4;i++)
             {
             System.out.println("book or dvd <b/d> : ");
             Console con=System.console();
             String str=null;
             str=con.readLine();
             if(str.equals("b"))
             {
                   a[i]=new book();
                   a[i].read();
                   }
              else
              {
                  a[i]=new dvd();
                  a[i].read();
                  }
                  }
             System.out.println("List of issued items : ");
             for(i=1;i<=4;i++)
             {
                         a[i].show();
	      System.out.println();
                         }
}      
}