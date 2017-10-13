import java.io.*;
class dvd implements item
{
       public String title,director,category;
       public void read()
      {
             Console con=System.console();
            title=con.readLine();
            director=con.readLine();
            category=con.readLine();
             
             }
             
      public void show()
      {
             System.out.println("Dvd : "+title+" "+"Director : "+director+" "+"Category : "+category);
             }
}