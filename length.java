class length{
      public static void main(String args[])
      {
             int a,count=0,max=0,i,l=0;
             for(i=1;i<=10;i++)
             {
                  a=(int)(Math.random()*100);
	              System.out.println(a);
                  if(a>max)
                  {
                           max=a;
                           count++;
                           }
                           
                  else
                  {
                      if(count>l)
                      {
                                    l=count;
                                    
                                    }
                                    max=a;
                                    count=1;
                                    }
                      }
                  if(count>l)    
                 System.out.println(count);
                 else
                    System.out.println(l);         
      }
}