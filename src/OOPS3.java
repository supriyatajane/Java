public class OOPS3 {
    public static  void main(String args[])
    {
        //function overloading
PersonM p1=new PersonM();
p1.add();
p1.add(10);
p1.add(10,20);


//contructor overloading
        Employee e1=new Employee();
        Employee e2=new Employee(10);
        Employee e3=new Employee(10,20);

        //overriding
        Daughter d1=new Daughter("Alka","tajane","supriya");
        d1.display();
    }
}
//in polymorphism 1 to many form
//function overloading

//same class same function name differnt signature

class PersonM{
    public void add()
    {
        System.out.println("hello");
    }
    public void add(int x,int y)
    {
        System.out.println(x+y);
    }
    public  void add(int x)
    {
        System.out.println(x);
    }
}
//contructor overloading
class Employee{
    public  Employee()
    {
        System.out.println("default contructor");
    }
    public Employee(int x,int y)
    {
        System.out.println("parameter contructor"+x+y);
    }
    public Employee(int x)
    {
        System.out.println("one parameter"+x);
    }
}
//overriding
//differnt class same method same signature
class Mother{
    String Mname;
    String lname;
    public  Mother(String mn,String ln)
    {
        this.lname=ln;
        this.Mname=mn;
    }
    public void display()
    {
        System.out.println(this.Mname+" "+this.lname);
    }


}
class  Daughter extends  Mother{
    String dname;
    public Daughter(String ln,String mn,String dn)
    {
        super(ln,mn);
        this.dname=dn;
    }
    public  void display()
    {
        System.out.println(this.dname+" "+this.lname);
        super.display();
    }

}