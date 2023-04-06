public class day4 {
    //string methods
    public static  void main(String args[])
    {
        String str="I";
        String str2="am";
        String str3="javascript";
        String h=String.join("@",str,str2,str3);
        System.out.println(h);

//join
        String firstaname="supriya";
        String lastname="tajane";
        String d=String.join("#",firstaname,lastname);
        System.out.println(d);


//indexOf
        String city="sanagmaner";
        int a=city.indexOf('e');
        int b=city.indexOf('r');
        int c=city.indexOf('S');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    String Fullname="supriya Tajane";
    int g=Fullname.indexOf("a",4);
    System.out.println(g);

      System.out.println("----------------index---------------");
    ///print a index
for(int i=0;i<Fullname.length();i++)
{
    if(Fullname.charAt(i)=='a')
    {
        System.out.println(i);
    }
}
//progarm 5 trim()
        String company=" TCS ";
System.out.println(company.length());
String cc=company.trim();
System.out.println(cc.length());


//progarm 6
        //replace

        String Student="Abhijit Tajane";
        String tt=Student.replace("A","B");
        System.out.println(tt);

//progarm 7
        //isEmpty()
        String a1="";
        String a2="Delhi";
        boolean pp=a1.isEmpty();
        boolean pp1=a2.isEmpty();
        System.out.println(pp);
        System.out.println(pp1);



    }

}
