 package a.b.c;
 public class Person {
    private String name,surname;    
    
  public Person() {
  	name=surname="unknown";
    }
   public Person(String n,String sn)
   {
   	name=n;surname=sn;
   }
   public void show()
   {
   	System.out.println("Name is= "+name+" Surname is= "+surname);
   }
}
