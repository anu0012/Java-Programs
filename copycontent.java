import java.io.*;
class copy
{
      public static void main(String args[]) throws IOException
      {
             if(args.length<3)
             {
                              System.out.print("Parameter are missing");
                              System.exit(0);
                              }
             if(args.length>3)
             {
                              System.out.print("Parameter are more than neccesary");
                              System.exit(0);
                              }
             File f=new File(args[0]);
             File f1=new File(args[1]);
             if(!f.exists() || !f1.exists())
             {
                              System.out.print("Source file is missing");
                              System.exit(0);
                              }
             FileInputStream fis=new FileInputStream(args[0]);
             FileInputStream fis1=new FileInputStream(args[1]);
             FileOutputStream fos=new FileOutputStream(args[2]);
             
             int ch;
             while((ch=fis.read())!=-1)
             fos.write((char)ch);
             
             fis.close();
             while((ch=fis1.read())!=-1)
             fos.write(ch);
             
             fos.close();
             
      }
}
             
             
             