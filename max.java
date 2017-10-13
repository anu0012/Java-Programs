class max{
      public static void main(String args[])
      {
             int a,b,c,d,max,min;
             a=(int)(Math.random()*10);
             b=(int)(Math.random()*10);
             c=(int)(Math.random()*10);
             d=(int)(Math.random()*10);
             System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
             max=a;
             if(b>max)
             {
                      max=b;
                      }
             if(c>max)
             {
                      max=c;
                      }
             if(d>max)
             {
                      max=d;
                      }
             min=a;
             if(b<min)
             {
                      min=b;
                      }
             if(c<min)
             {
                      min=c;
                      }
             if(d<min)
             {
                      min=d;
                      }
             System.out.print("Max is "+max+"Min is "+min);
                      
      }
}
             