import java.util.ArrayList;
import java.util.HashSet;
public class hashsets {
    public static void main(String args[])
    {
   HashSet<String>names=new HashSet<String>();
   names.add("supriya");
   names.add("Akash");
   names.add("rutuja");
   names.add("rutuja");
   names.add("diya");
   names.add("Akash");
   System.out.println(names);


   names.remove("diya");
   System.out.println(names);

   boolean aa=names.contains("akash");
   boolean bb=names.contains("Akash");
   System.out.println(aa);
   System.out.println(bb);
   System.out.println(names.size());

   for(String ii:names)
   {
       System.out.println(ii);
   }
   HashSet<String>name2=new HashSet<String>();
   name2.add("supriya");

   for(int i=0;i<name2.size();i++)
   {
       if(names.contains(name2.get(i))) {
           System.out.println(name2.get(i)+" element  available on set");
       }
       else {
           System.out.println(name2.get(i)+" element not available on set");
       }
   }
    }
}
