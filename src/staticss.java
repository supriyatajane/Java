public class staticss {
    public static  void main(String args[])
    {
        information.displayNAme();
        System.out.println(information.country);

        information in =new information(12);
        in.display();

        in.displayNAme();
    }
}
class information{
    static  String country="india";
    int age;
    public  information(int ag)
    {
        this.age=ag;
    }
    public  static void displayNAme()
    {
        System.out.println(information.country);
    }
    public void display()
    {
        System.out.println("pune");
    }
}
