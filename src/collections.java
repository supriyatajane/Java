import java.util.ArrayList;

public class collections {
    public static void main(String args[])
    {
        //arraylist

  ArrayList<String> cars=new ArrayList<String>();
  //add the value using add method
        cars.add("audi");
        cars.add("tvtv");
        cars.add("hunydri");
        cars.add("moto");
        System.out.println(cars);


        //retrive the value using get method
        String c1=cars.get(2);
        System.out.println(c1);

        //update the value Set
        cars.set(1,"lenovo");
        System.out.println(cars);

        //remove the values
        cars.remove(1);
        System.out.println(cars);

        //for loop
        for(int i=0;i<cars.size();i++)
        {
            System.out.println(cars.get(i));
        }


        ///for each
        for(String a:cars)
        {
            System.out.println(a);
        }
    }
}
