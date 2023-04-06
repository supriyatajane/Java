enum Fruits{

    APPLE("red"),
    MANGO("yellow"),
    PAPAYA("orange");
    private  String colorinfo;

    private Fruits(String cl)
    {
     this.colorinfo=cl;
    }
    public String getcolor()
    {
        return  this.colorinfo;
    }
}


public class Enummss4 {
    public static void main(String args[])
    {
     Fruits ff[]=Fruits.values();
     for(Fruits f:ff)
     {
         System.out.println(f.getcolor());
     }
    }
}
