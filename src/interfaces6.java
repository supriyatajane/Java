public class interfaces6 {
    public static void main(String args[])
    {
  xc x=new xc();
  x.zz();
    }
}
interface  zz{
    public void zz();
    default void greet()
    {
        System.out.println("greet in zz");
    }
    default  void  greet(int x)
    {
        System.out.println("greet "+x);
    }
}
class xc implements zz{
    @Override
    public void zz() {
        System.out.println("zz in xc");
    }
}
