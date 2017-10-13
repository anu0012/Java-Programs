import java.io.*;


class maximum{
      
      public static void main(String args[])
      {
          int arr[]=new int[5];
          int i,max;
          Console con=System.console();
          System.out.println("Enter your values :");
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
            System.out.println("Max is :"+max);
            }
            }       