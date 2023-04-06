import java.awt.*;
import java.sql.Array;
import java.util.Arrays;

public class Arrayss2 {
    public static void main(String  args[])
    {
        String s1[]=new String[5];
        String []s2=new String[5];
        s1[0]="supriya";
        s1[1]="surya";
        s1[2]="diya";
        s1[3]="riya";
        s1[4]="isha";
        System.out.println(s1);
        System.out.println(Arrays.toString(s1));

        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
            System.out.println();
        }

        //print in revaerse order
        String []city={"sangamnaer","nasik","Aurnagabad","Ahmadnagar","sinner"};
        for(int i= city.length-1;i>=0;i--)
        {
            System.out.println(city[i]);
        }

        //spilt
        String info="i am laernning js";
        String sy[]=info.split("");
        String sy2[]=info.split("a");
        System.out.println(sy);
        System.out.println(Arrays.toString(sy));
        System.out.println(Arrays.toString(sy2));

        //program 2
        String bank="IDBI";
        char kl[]=bank.toCharArray();
        System.out.println(kl);
        System.out.println(Arrays.toString(kl));

        //program 3
        String namee[]={"sarika","rutuja","Aarti","diya"};
        for(int i=0;i<namee.length;i++)
        {
            System.out.println(namee[i]);
        }
        //second way
        for(String sq:namee)
        {
            System.out.println(sq);
        }

        char nn[]={'n','a','y','n'};
        String rev="";
        for(char s:nn)
        {
         rev=s+rev;
        }
        System.out.println(rev);

        //find the avg
        int []numbers={110,11,22,33};
        int sum=0;
        float avg;
        for(int ss:numbers){
            sum=sum+ss;
        }
        avg=sum/numbers.length;
        System.out.println(avg);
    }
}
