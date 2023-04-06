public class singleTerm {
    public static void main(String args[])
    {
        Vehicle2.createInstance();

    }
}
class Vehicle2{
    String color="red";
    static Vehicle2 v1;
    private Vehicle2()
    {

    }
    public static Vehicle2 createInstance()
    {
        if(v1==null)
        {
            System.out.println("hello");
            new Vehicle2();
        }
        return v1;
    }
}
