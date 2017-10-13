import java.io.*;
import java.util.*;
import java.lang.*;

class usereadfile
{
      public static void main(String args[]) throws Exception
      {
             readfile r=new readfile();
             write w=new write(r);
             read rd=new read(r);
             w.start();
             rd.start();
}
}