public class interfaces2 {
    public static void main(String args[])
    {
PersonK pk=new PersonK();
pk.count();
pk.save();
pk.loan();
    }
}
interface  WorldBankP{
      public  void  save();
    public  void loan();
}
interface  RBI{
    public  void count();
}
class PersonK implements WorldBankP,RBI{
    public  void  save()
    {
        System.out.println("save in Person");
    }
    public  void loan()
    {
        System.out.println("loan in Person");
    }
    public  void count()
    {
        System.out.println("count in person");
    }
}
