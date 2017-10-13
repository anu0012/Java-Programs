class word
{
      private String str;
      private int no;
      public word(String nm,int n)
      {
             str=nm;
	no=n;
             }
      
      public int hashCode()
	{
	String s1=str;
	return s1.hashCode();
	}
	public void show()
	{
System.out.println(str+" "+no);
     	 }
}