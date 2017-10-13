import java.io.*;
class book implements item
{
	public String title,name,publication;
      public void read()
      {
	
             Console con=System.console();
            title=con.readLine();
            name=con.readLine();
            publication=con.readLine();
             
             }
             
      public void show()
      {
             System.out.println("book : "+title+" "+"Author : "+name+" "+"Publication : "+publication);
             }
}