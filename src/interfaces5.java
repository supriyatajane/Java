public class interfaces5 {
    public static  void main(String args[])
    {
   Dd d=new Dd();
   d.one();
   d.two();
   d.three();
   d.four();
   d.five();
   d.six();
   d.seven();
    }
}
interface  Aa{
   abstract public  void one();
   abstract public  void two();
    abstract public  void three();
}
interface Bb{
     abstract public  void four();
     abstract public  void  five();
}
 interface Cc extends Bb,Aa{
   abstract public  void six();
  abstract   public  void  seven();
 }
class Dd implements Cc{
    @Override
    public void one() {
        System.out.println("...one");
    }

    @Override
    public void two() {
        System.out.println("...two");
    }

    @Override
    public void three() {
        System.out.println("...three");
    }

    @Override
    public void four() {
        System.out.println("...four");
    }

    @Override
    public void five() {
        System.out.println("...five");
    }

    @Override
    public void six() {
        System.out.println("...six");
    }

    @Override
    public void seven() {
        System.out.println(".....seven");
    }
}
