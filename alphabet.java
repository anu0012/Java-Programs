import java.io.*;
class alphabet
{
      public static void main(String args[]) throws IOException
      {
             if(args.length<1)
             {
                              System.out.print("Parameter are missing");
                              System.exit(0);
                              }
             if(args.length>1)
             {
                              System.out.print("Parameter are more than neccesary");
                              System.exit(0);
                              }
             File f=new File(args[0]);
             File f1=new File("X.txt");
             if(!f.exists())
             {
                              System.out.print("Source file is missing");
                              System.exit(0);
              }
             FileInputStream fis=new FileInputStream(f);
             
             FileOutputStream fos=new FileOutputStream(f1);
            
             int ch;
             while((ch=fis.read())!=-1)
             fos.write(Character.toUpperCase(ch));
             fis.close();
	fos.close();
             f.delete();
             f1.renameTo(f);
            
          
             
      }
}
             
             
             