public class Inners2 {
    public static void main(String args[])
    {
    car c=new car("audi","suv");
    //car.Auto h=c.new Auto();
    car.Auto h = c.new Auto();
   // h.displayEngine();
    h.typebased();
    h.displayEngine();
    }
}
class car{
    String name;
    String ty;
    public car(String nm,String ty)
    {
        this.name=nm;
        this.ty=ty;
    }
    private String getCar()
    {
        return  this.name;
    }
    class Auto{
    String engine;
    public String typebased()
    {
        if(car.this.ty.equals("suv"))
        {
            this.engine="bigger";
        }
        else if(car.this.ty.equals("sedane"))
        {
            this.engine="smaller";
        }
        else{
            this.engine="default";
        }
        return  this.engine;
    }
    void displayEngine()
    {
        System.out.println(this.engine);
    }
    }
}