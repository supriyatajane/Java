public class Function {
    public static void main(String args[])
    {
        int a=20;
        int b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        addition(1,1);
        add();
        add();

        adds(10,10);
        adds(90,90);
      int c=  addm(10,10);
      System.out.println(c);

    }
    //avoid multple lines code use function
    public static void addition(int a,int b)
    {
        System.out.println(a+b);
    }
    //function with no parameter
    public static void add()
    {
        System.out.println(9+9);
    }

    //function with parmetr
    public static void adds(int x,int y)
    {
        System.out.println(x+y);
    }

    //function with parameter and return type
    public static int addm(int a,int b)
    {
        return a+b;

    }
}
