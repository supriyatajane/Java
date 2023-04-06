public class Inners {
    public static void main(String args[])
    {
    Grocery g=new Grocery();
    System.out.println(g.price);
    //call the inner class methods;
        //Grocery Fruits = new Grocery();
        Grocery.Fruits fruitone =  g.new Fruits();
        fruitone.city();

        //Grocery.vegetable vegone=g.new Fruits();

        Grocery.vegetable vegOne = g.new vegetable();
        vegOne.city();

    }
}
class Grocery{
    int price=10;

    class Fruits{
        String supplier="mappoo";
        String vendor="adani";

        public  void city()
        {
            System.out.println("supplier from pune");
        }
    }

    protected  class vegetable{
        String supplier="mapoo1";
        String vendor="adani2";
        public  void city()
        {
            System.out.println("vendor from pune");
        }
    }
}
