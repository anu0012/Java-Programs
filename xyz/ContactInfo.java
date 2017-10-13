 package a.b;
 import a.b.c.Person;
public class ContactInfo extends Person {
        
    private int phone;
    public ContactInfo() {
    	phone=0;
    }
    public ContactInfo(String n,String sn,int ph)
    {
    	super(n,sn);
    	phone=ph;
    }
    public ContactInfo(int ph)
    {
    	phone=ph;
    }
   public void show()
   {              
	super.show();
   	System.out.println(" phone no is= "+phone);
   }
}
