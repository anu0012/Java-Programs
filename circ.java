import java.io.*;

class circ{
      
      public static void main(String args[])
      {
           int arr[]=new int[10];
           int i,n,j,k,temp,x;
           Console con=System.console();
           for(i=0;i<arr.length;i++)
           {
                   arr[i]=Integer.parseInt(con.readLine());
                   }
           n=Integer.parseInt(con.readLine());
           for(i=n;i<arr.length;i++)
           {
                 temp=arr[i];
                 arr[i]=arr[i-n];
                 arr[i-n]=temp;
                 
                 }
          
                      x=i-n;
           j=x+1;
                 for(i=x;j<(arr.length);)
                 {
	    
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
	   j++;
                      }
                  for(i=0;i<arr.length;i++)
           {   
               System.out.print(arr[i]+" ");
               }
              
      }
}       
             