class star{
      public static void main(String args[])
      {
             int a=12,line,x,i,p;
            // a=(int)(Math.random()*10);
             
            p=(2*a);
             for(line=1;line<=a;line++)
             {
		  
                                       
                                       for(i=1;i<=p;i++)
                                       {
                                                     System.out.print(" ");
                                                     
                                                     }
                                       for(x=1;x<=line;x++)
                                       {
                                                          System.out.print(x+" ");
                                                          }
		  for(x=line-1;x>0;x--)
                                       {
                                                          System.out.print(x+" ");
                                                          }
                                       System.out.print("\n");
		   p-=2;
                                       }
		
		  	
             }
      }