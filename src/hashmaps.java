import java.util.HashMap;
public class hashmaps {
    public static void main(String args[])
    {
        HashMap<String,String>country=new HashMap<String,String>();
        //methods of hashMAp
        //add the values in Put
        country.put("Mahrashtra","mumbai");
        country.put("Delhi","kk");
        country.put("punjab","amrutsar");
        country.put("goa","punji");
        System.out.println(country);

        //retrive the value
        String h1=country.get("Delhi");
        System.out.println(h1);

        //update the value using put
        country.put("goa","ga");
        System.out.println(country);

        //delete the value
        country.remove("goa");
        System.out.println(country);

        System.out.println(country.values());
        System.out.println(country.keySet());

        for(String aa:country.keySet())
        {
            System.out.println(aa);
        }
        for(String bb:country.values())
        {
            System.out.println(bb);
        }

        HashMap<Integer,String>roles=new HashMap<Integer,String>();
        roles.put(1,"tester");
        roles.put(2,"developer");
        roles.put(3,"po");
        roles.put(4,"SM");
        for(int mm:roles.keySet())
        {
            System.out.println(mm);
        }
        for(String s1:roles.values())
        {
            System.out.println(s1);
        }
    }
}
