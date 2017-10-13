import a.*;
public class Office {
     
    public static void main(String[] args) {
         
          Employee e1=new Employee();
          e1.show();
          Employee e2=new Employee("kgnitesh","sharma",123345,25000);
          e2.show();
          Employee e3=new Employee(25000);
          e3.show();
    }
}
