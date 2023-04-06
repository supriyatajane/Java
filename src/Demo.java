public class Demo {
    public static void main(String[]args)
    {
        Demo d1=new Demo("supriya","tajane");
        d1.display();
    }
    String firstname;
    String  lastname;
public Demo(String fn,String ln)
{
    this.firstname=fn;
    this.lastname=ln;
}
public  void display()
{
    System.out.println(this.firstname+" "+this.lastname);
}


}
