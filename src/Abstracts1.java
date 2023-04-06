public class Abstracts1 {

    public static void main(String args[]) {
        SbiB w1 = new SbiB("sangamner","India",422605);
    w1.save();
    w1.loan();
    w1.displayName();


    //second class object
        PNB pn=new PNB("pune","india","IDBI");
        pn.save();
        pn.displayName();
        pn.loan();
    }
}
//abstraction is data hiding
abstract  class worldBankA{
    String city;
    String country;
    public  worldBankA(String ci,String co)
    {
        this.city=ci;
        this.country=co;
    }
    abstract  public void save();
    abstract  public  void loan();

    public  void  displayName()
    {
        System.out.println("india");
    }
}
//we cannot create abstract class object
//if you extend the abstract class then you need to override abstarct method and pass the body

class SbiB extends worldBankA{
    int pincode;
    public  SbiB(String ci,String co,int pn)
    {
        super(ci,co);
        this.pincode=pn;
    }
    public  void  save()
    {
        System.out.println("save in sbiB");
    }
    public  void  loan()
    {
        System.out.println("loan in sbiB");
    }
}
class PNB extends worldBankA{
    String Bname;
    public  PNB(String cn,String ci,String Bname)
    {
        super(cn,ci);
        this.Bname=Bname;
    }
    public  void  save()
    {
        System.out.println("save in PNB");
    }
    public  void  loan()
    {
        System.out.println("loan in PNB");
    }
}
