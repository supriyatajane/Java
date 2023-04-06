import java.util.Arrays;

public class Arrayss3 {
    public static void main(String args[])
    {
        //array
        int num[]=new int[5];
        num[0]=110;
        num[1]=120;
        num[2]=90;
        num[3]=88;
        num[4]=78;
        System.out.println(Arrays.toString(num));

        int numbers[]={20,200,22,90};
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
        //forech
        for(int n:numbers){
            System.out.println(n);
        }

        //program 2
        //two dimensional array
        int numbersA[][]=new int[3][4];
        numbersA[0][0]=11;
        numbersA[0][1]=12;
        numbersA[0][2]=13;
        numbersA[0][3]=14;

        numbersA[1][0]=21;
        numbersA[1][1]=22;
        numbersA[1][2]=23;
        numbersA[1][3]=24;

        numbersA[2][0]=31;
        numbersA[2][1]=32;
        numbersA[2][2]=33;
        numbersA[2][3]=34;

        int numbersB[][]={
                {11,22,33,44},
                {10,20,30,40},
                {100,200,300,400}
        };
for(int i=0;i<numbersB.length;i++)
{
 //   System.out.println(Arrays.toString(numbersB));
    int row[]=numbersB[i];
    for(int j=0;j< row.length;j++)
    {
        System.out.println(row[j]);
    }
}
//two dimensional array for loop
        for(int i=0;i<numbersA.length;i++)
        {
            int r[]=numbersA[i];
            for(int j=0;j<r.length;j++)
            {
                System.out.println(r[j]);
            }
        }
        //using foreach
        for(int row[]:numbersA)
        {
            for(int col:row)
            {
                System.out.println(col);
            }
        }

        for(int row[]:numbersB){
            for(int col:row)
            {
                System.out.println(col);
            }
        }

        int [][][] numbersE={
                {
                        {90, 999,99},
                        {80,888,88},
                        {70,777,77}
                },{
                {10,100,110},
                {20,200,220},
                {30,300,330}
        },
                {{50,555,500},
                        {60,666,66},
                        {40,400,440}}
        };

System.out.println(numbersE[1][1][1]);

System.out.println("----------------------------");
for(int row[][]:numbersE)
{
    for(int rrs[]:row)
    {
        for(int r:rrs)
        {
            System.out.println(r);
        }
    }
}
for(int i=0;i<numbersE.length;i++)
{
    int [][]rrr=numbersE[i];
    for(int k=0;k< rrr.length;k++)
    {
        int []rr=rrr[k];
        for(int j=0;j<rr.length;j++)
        {
            System.out.println(rr[j]);
        }
    }
}
    }
}
