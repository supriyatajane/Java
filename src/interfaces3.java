public class interfaces3 {
    public static  void main(String args[])
    {
  ABC ab=new ABC();
  ab.a();
  ab.b();
  ab.done();
  ab.undone();
  ab.gun();
  ab.run();
  ab.fun();
    }
}
interface A
{
    public void fun();
    public  void gun();
    public void run();
}
interface  B
{
    public  void done();
    public  void undone();
}
interface  C
{
    public  void  a();
    public  void b();
}

class ABC implements A,B,C{
    public void fun()
    {
        System.out.println("i am in ABC fun");
    }
    public  void gun()
    {
        System.out.println("i am Gun with Abc");
    }
    public void  run()
    {
        System.out.println("run  with ABC");
    }

    @Override
    public void done() {
        System.out.println("done with ABC");
    }

    @Override
    public void undone() {
        System.out.println("undone with ABC");
    }

    @Override
    public void a() {
        System.out.println("a with ABC");
    }

    @Override
    public void b() {
        System.out.println("b with ABC");
    }
}
