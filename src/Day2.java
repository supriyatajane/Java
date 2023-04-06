public class Day2 {

    public static void main(String args[])
    {
        String name="supriya";
        System.out.println(name);

        // String +  Integer =====> String
        // Integer + String  =====> String
        // String  + String  =====> String
        // Integer + Integer ====> Integer

        System.out.println("abhijit"+22);
        System.out.println(45+"Rohit");
        System.out.println("Rutuja"+"supriya");
        System.out.println(22+22);

        //methods
        String firstname="supriya";
        System.out.println(firstname.length());


        //program 3
        //concat
        String namee="supriya";
        String lname="Tajane";
        String Fullname=namee.concat(lname);
        System.out.println(Fullname);


        //progarm 4
        String city=new String("Mumbai");
        System.out.println(city);

//progarm 5
        String city1="sangamner";
        String q11=city1.toUpperCase();
        System.out.println(q11);

        //progarm 6
        String city2="NASIK";
        String q12=city2.toLowerCase();
        System.out.println(q12);



        //progarm 7
        //method chainning
        String  city3="Gujarat";
        city3.toLowerCase().toUpperCase().length();


        //program 8
        String city4="Pune";
        String city5="Pune";
        String city6="mumbai";

        System.out.println(city4.equals((city5)));

        System.out.println(city6.equals(city5));


        //program 9
if(city4.equals(city5))
{
    System.out.println("string are equal");
}
else{
    System.out.println("string are not equal");
}


if(city4.equalsIgnoreCase(city5))
{
    System.out.println("same city");
}
else{
    System.out.println("not same");
}

//program 10
String company="TCS";
boolean a11=company.startsWith("T");
boolean a12=company.startsWith("TC");
System.out.println(a11);
System.out.println(a12);

//program 11
        String company2="capgemini";
        boolean w11=company2.endsWith("mini");
        boolean w12=company2.endsWith("i");
        System.out.println(w11);
        System.out.println(w12);

        //program 12
        String sentence=" i am learnning javascript";
        boolean r11=sentence.contains("am");
        System.out.println(r11);
    }



}
