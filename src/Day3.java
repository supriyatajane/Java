import java.awt.*;

public class Day3 {

    public static void main(String []args)
    {
      //charAt()
        String city="jamnagar";
        for(int i = 0 ; i < city.length();i++) {
            System.out.println(i);
            System.out.println(city.charAt(i));
        }


        String city2="Nasik";
        char c1=city2.charAt(2);
        System.out.println(c1);

  int q1=city2.length();
  System.out.println(q1);

//reverse string

        String Company="infosys";
        String rev=" ";
        for(int i=0;i<Company.length();i++)
        {
            rev=Company.charAt(i)+rev;
        }
        System.out.println(rev);


        //second way

        String rev2="";
        for(int i=Company.length()-1;i>=0;i--)
        {
            rev2=rev2+Company.charAt(i);
        }
        System.out.println(rev2);

        //chek wheter string are availble or not

        String name=" supriya Sunil Tajane";
        String userinput="Sunil";

        if(name.contains(userinput))
        {
            System.out.println("string are avilable");
        }
        else{
            System.out.println("not availble");
        }


        //count the vowels in string
        System.out.println("--------count the vowels----------");
        String myName="supriya";
        int count=0;
        for(int i=0;i<myName.length();i++)
        {
            if(myName.charAt(i)=='a' || myName.charAt(i)=='e' ||myName.charAt(i)=='i'||myName.charAt(i)=='o'||myName.charAt(i)=='u')
            {
    count++;
            }
        }
        System.out.println(count);


        //substring
        String subject="chemistry";
        String h=subject.substring(2);
        String g=subject.substring(1,4);
        System.out.println();
    }
}
