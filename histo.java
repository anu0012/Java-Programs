import java.io.*;

class histo{
      
      public static void main(String args[])
      {
           int arr[]=new int[10];
           int i,n,max,j,row;
           Console con=System.console();
           for(i=0;i<arr.length;i++)
           {
                   arr[i]=Integer.parseInt(con.readLine());
                   }
           max=arr[0];
           for(i=1;i<arr.length;i++)
           {
                 if(arr[i]>max)
                            {
                             max=arr[i];
                            }
           } 
           row=max;
           for(i=row;i>0;i--)
           {
              for(j=0;j<arr.length;j++)
              {
                                       if(arr[j]>=i)
                                       System.out.print("*");
                                       else
                                       System.out.print(" ");
                                       
                                       }
                                       System.out.println();
                                       }
              }
           }
           
                  
           
           
             
                
             