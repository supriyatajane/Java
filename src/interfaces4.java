public class interfaces4 {
    public  static  void main(String args[])
    {
 Demo11 d11=new Demo11("IDBI","saving","pune");
 d11.show();
 d11.displayCountry();
 d11.loan();
 d11.save();
    }
}
interface AB{
    public void loan();
    public  void save();

}
abstract  class SbiEE{
    String name;
    String type;
    public  SbiEE(String na,String ty)
    {
        this.name=na;
        this.type=ty;
    }
    abstract  public void show();

    public  void displayCountry()
    {
        System.out.println("India");
    }
}
//extends abstract class and implements interface
class  Demo11 extends SbiEE implements AB{
    String Dname;
    public Demo11(String na,String ty,String Dn)
    {
        super(na,ty);
        this.Dname=Dn;
    }

    @Override
    public void loan() {
        System.out.println(" i am loan in Demo");
    }

    @Override
    public void show() {
        System.out.println(" i am show in Demo");
    }

    @Override
    public void save() {
        System.out.println(" i am save in Demo");
    }
}
