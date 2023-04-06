public class statics2 {

    public static void main(String args[])
    {
     Vechicle v1=new Vechicle();
     System.out.println(v1.name);
     Vechicle.sedne s1=v1.new sedne();
             s1.printType();

             //static class method acess
        Vechicle.Suv s2=new Vechicle.Suv();
        s2.printType();
    }
}
class Vechicle{
    String name="TVTV";
    class sedne{
        public void printType()
        {
            System.out.println("sedne");
        }
    }
    static  class Suv
    {
        public  void printType()
        {
            System.out .println("suv");
        }
    }
}
