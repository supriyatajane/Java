import java.awt.*;
import java.util.Arrays;

public class Arrayss {

    public  static  void main(String args[])
    {
        int num[]=new int[5];
        int []num2=new int[5];

        num[0]=11;
        num[1]=12;
        num[2]=13;
        num[3]=14;
        num[4]=15;

        System.out.println(num);

        String q11= Arrays.toString(num);
        System.out.println(q11);


        for(int i=0;i<num.length;i++)
        {
            System.out.println(num);
            System.out.println(num[i]);
        }

        int num3[]={11,45,67,77};
        for(int i=0;i<num3.length;i++)
        {
            System.out.println(num3);
            System.out.println(num3[i]);

        }
    }
}
