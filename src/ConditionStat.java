public class ConditionStat {
    public static void main(String args[])
    {
        String a="poorva";
        char []aa=a.toCharArray();
        for(char jj:aa)
        {
            System.out.println(jj);
        }

        //consditional statement
        //only if
        int numT=5;
        if(numT>=1&&numT<=5)
        {
            System.out.println("10% discount");
        }
        if(numT>=5&&numT<=10)
        {
            System.out.println("20% discount");
        }
        if(numT>=10)
        {
            System.out.println("100%discount");
        }

System.out.println("-------------------------");
        int numC = 11;
        if(numC > 0 && numC <= 5) {
            System.out.println("10% discount");
        }
        if(numC > 5 && numC <= 10) {
            System.out.println("20% discount");
        }
        if(numC > 10 ) {
            System.out.println("30% discount");
        }

System.out.println("-------------------------");
        int numS=5;
        if(numS>0&&numS<=5)
        {
            System.out.println("10%discount");
        } else if (numS>5&&numS<=10) {
            System.out.println("20%discount");
            
        } else if (numS>10) {
            System.out.println("30% discount");
            
        }
        else{
            System.out.println("please enter the correct input");
        }

        int marks=60;
        if(marks>=90)
        {
            System.out.println("grade A");
        }
        if(marks<80)
        {
            System.out.println("grade b");
        }
        if(marks<70)
        {
            System.out.println("grade c");
        }

        int marksA=90;
        if(marksA>=90)
        {
            System.out.println("grade A");
        }
        else if(marksA<80)
        {
            System.out.println("grade b");
        }
        else if(marksA<70)
        {
            System.out.println("grade c");
        }

        int p=10;
        int q=11;
        if(p<q)
        {
            System.out.println("q is greater");
        }
        else{
            System.out.println("p is grater");
        }

//ternary operator
        String y=p<q?"q is graeter":"p is grater";
        System.out.println(y);


        int s1 = 89000;
        int s2 = 999;
        int s3 = 100;

        if(s1>s2&&s1>s3)
        {
            System.out.println("s1 is grater");
        }
        else if(s2>s1&&s2>s3)
        {
            System.out.println("s2 is grater");
        }
        else{
            System.out.println("s3 is grater");
        }

        if(s1>s2){
            if(s1>s3){
                System.out.println("s1 is grater");
            } else if (s2>s1) {
                if(s2>s3)
                {
                    System.out.println("s2 is grater");
                }
                else{
                    System.out.println("s3 is graeter");
                }

            }
        }

        System.out.println("--------switch------------");
        String city="nagpur";

        switch (city){
            case "nagpur":
                System.out.println("mh");
            case "telegana":
                System.out.println("HH");
            case "Gujarat":
                System.out.println("GJ");
        }

        String company="tcs";
        switch (company){
            case "tcs":
                System.out.println("Ratan tata");
                break;
            case "Infosys":
                System.out.println("sudha Murthy");
                break;
            case "google":
                System.out.println("sudar pichai");
        }


        switch(city){
            case "nagpur":
            case "nasik":
                System.out.println("MH");
                break;
            case "indore":
            case "bhopal":
                System.out.println("MP");
            case "jaipur":
            case "udaipur":
                System.out.println("RJ");
            default:
                System.out.println("plese enter the correct city");

                //for loop

        }
        for(int i=0;i<=3;i++)
        {
            System.out.println(i);
        }
        for(int i=0;i<=3;i++)
        {
            System.out.println("hello");
        }
        for(int i=0;i<=40;i=i+4)
        {
            System.out.println(i);
        }


        //break and continue with if
        for(int i=0;i<=5;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }

        for(int i=0;i<=5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }


        //while loop
        int i=0;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }


        //print hello 4 times
        int j=0;
        while (j<=5)
        {
            System.out.println("hello");
            j++;
        }

        //print 5 to 1
        int k=5;
        while (k>=1)
        {
            System.out.println(k);
            k--;
        }

        //print 2 table
        int l=2;
        while(l<=20)
        {
            System.out.println(l);
            l=l+2;
        }

        //using break
        int w=0;
        while (w<=5)
        {
            if(w==3)
            {
                break;
            }
            System.out.println(w);
            w++;
        }

        //using continue
        int d=0;
        while (d<=5)
        {
            if(d==3)
            {
                d++;
                continue;
            }
            System.out.println(d);
            d++;
        }
    }
}







