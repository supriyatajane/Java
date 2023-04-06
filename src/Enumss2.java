public class Enumss2 {
    public static void main(String args[])
    {
        TEST t1=new TEST(Day.SUN);
        t1.DisplayCourse();
        t1.DisplayCourse2(Day.THU);
        t1.DisplayCourse2(Day.MON);
        Day [] days=Day.values();
        for(Day d:days)
        {
            System.out.println(d);
            System.out.println(d.ordinal());
        }

    }
}
enum Day{
    SUN,MON,TUE,WED,THU,FRI,SAT
}
class TEST{
    Day day;
    public  TEST(Day day)
    {
        this.day=day;
    }
     public void DisplayCourse()
     {
         switch (day)
         {
             case SUN :
                 System.out.println("python");
                 break;
             case MON:
                 System.out.println("java");
                 break;
             case TUE:
                 System.out.println("javascript");
                 break;
             case WED:
                 System.out.println("cpp");
                 break;
             case THU:
                 System.out.println("DS");
                 break;
             case FRI:
                 System.out.println("sql");
             case SAT:
                 System.out.println("php");
                 break;
         }
     }
     public void DisplayCourse2(Day a)
     {
         if(Day.SUN==a)
         {
             System.out.println("It is python day");
         }
         if(Day.MON==a)
         {
             System.out.println("it is java day");
         }
         if(Day.TUE==a)
         {
             System.out.println("it is oops day");
         }
         if(Day.THU==a)
         {
             System.out.println("it is cpp day");
         }
         if(Day.FRI==a)
         {
             System.out.println("it javascript day");
         }
         if(Day.SAT==a)
         {
             System.out.println("it is python day");
         }
         if(Day.WED==a)
         {
             System.out.println("it is DS day");
         }
     }
}
