import java.awt.*;

public class OOPS2 {

    public static void main(String args[])
    {
   calculator c1=new calculator();
   c1.add(10,20);
   c1.add(10,20,30);
   c1.add(10,20,30,40);



   //contructor callling
        students s1=new students();
        students s2=new students(10);
        students s3=new students(11,23,34);
        students s4=new students(11,22);

        //overriding
        Sbi sb=new Sbi();
        sb.loan(8);
        sb.saving(9);


        //
        sonD sd=new sonD("sunil","tajane","abhii");
        sd.display();
    }
}
//function overloading
//same class,same method ,different signature
class calculator{
    public void add(int x,int y)
    {
        System.out.println(x+y);
    }
    public void add(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
    public  void add(int x, int y, int z,int v)
    {
        System.out.println(x+y+z+v);
    }
}

class students{
    public students()
    {
        System.out.println("default contructor call");
    }
    public students(int x,int y)
    {
        System.out.println("parametrized contructor"+(x+y));
    }
    public students(int x)
    {
        System.out.println("contructor with one parameter"+x);
    }
    public students(int x,int y,int z)
    {
        System.out.println("contructor with parameter"+(x+y+z));
    }
}

//overriding
class worldbank{
   public void saving(int x)
    {
        System.out.println("saving in worldbank"+x);
    }
    public void loan(int y)
    {
        System.out.println("loan in worldbank"+y);
    }
}
class Sbi extends worldbank{
    public  void saving(int x)
    {
        System.out.println("saving in sbi"+x);
    }
    public  void loan(int y)
    {
        System.out.println("saving in loan"+y);
    }
}
class fatherD{
    String Fname;
    String Lname;
    public fatherD(String fn,String ln)
    {
        this.Fname=fn;
        this.Lname=ln;
    }
    public void display()
    {
        System.out.println(this.Fname+" "+this.Lname);
    }
}
class sonD extends fatherD{
    String  sname;
    public sonD(String fn,String ln,String sn)
    {
        super(fn,ln);
        this.sname=sn;
    }
    public  void display()
    {
        System.out.println(this.sname+" "+this.Lname);
        super.display();
    }
}
