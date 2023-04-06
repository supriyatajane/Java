public class oops {
    public static  void main(String args[])
    {
  SonC sn=new SonC("sunil","Tajane","abhijit");
  sn.displayCName();
  sn.display();
    }
}
class Father{
    String Fname;
    String Lname;
    public Father(String fn,String ln)
    {
        this.Fname=fn;
        this.Lname=ln;
    }
    public void display()
    {
        System.out.println(this.Fname+" "+this.Lname);
    }
}
class SonC extends Father {

    String sname ;
    public SonC(String a, String b,String c) {
        super(a, b);
        this.sname  = c;
    }

    public void displayCName() {
        System.out.println(this.sname + this.Lname);
    }


}

