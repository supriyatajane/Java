public class interfaces {
    public  static  void  main(String args[])
    {
  ICICI i1=new ICICI();
  i1.calculate();
  i1.save();
  i1.loan();
    }
}
interface  Bank{
    abstract  public  void save();
    abstract  public  void loan();
    abstract  public  void calculate();
}
class ICICI implements Bank{
    public  void  save()
    {
        System.out.println("save in IcIcI");
    }
    public  void  loan()
    {
        System.out.println("loan in Icici");
    }
    public  void  calculate()
    {
        System.out.println("calculate in IcicI");
    }
}
