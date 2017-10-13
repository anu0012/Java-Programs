package a;
import a.b.*;
import a.b.c.*;
public class Employee extends ContactInfo {
      private int salary; 
     public Employee() {
     	salary=0;
    }
    public Employee(String n,String sn,int ph,int sal)
    {
    	super(n,sn,ph);
    	salary=sal;
    }
    public Employee(int sal)
    {
    	salary=sal;
    }
    public void show()
   {
	super.show();
   	System.out.println(" salary is= "+salary);
   }
    
}
