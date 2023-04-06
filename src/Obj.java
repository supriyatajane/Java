public class Obj {
    public static void main(String args[])
    {
     Humans h1=new Humans(12,"abhijit");
     Humans h2=new Humans(34,"raya");
     Humans h3=new Humans(90,"om");
     Humans.countObj();
    }
}
class Humans{
    static  int objCount=0;
    int age;
    String name;
    public Humans(int ag,String na)
    {
        this.age=ag;
        this.name=na;
        increaseCount();
    }
    public  static void countObj()
    {
        System.out.println(Humans.objCount);
    }
    public static void increaseCount()
    {
        objCount=objCount+1;
    }

}
