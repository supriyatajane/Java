import java.awt.*;

public class Users {

    public static void main(String args[])
    {
        Person1 p1=new Person1();
        p1.displayName();
        System.out.println(p1.firstname);
        System.out.println(p1.lastname);

        Student s1=new Student("sarika","pansare","infostrtch");
        s1.display();

    }
}


class Person1{
    String firstname="supriya";
    String lastname="Tajane";
    public void  displayName()
    {
        System.out.println(this.firstname+" "+this.lastname);
    }
}

class Student{
    String name;
    String lastname;
    String CompanyName;
    public Student(String fn,String ln,String Cn)
    {
        this.name=fn;
        this.lastname=ln;
        this.CompanyName=Cn;
    }
    public  void display()
    {
        System.out.println(this.name+" "+this.lastname);
    }
}
