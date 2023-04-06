public class today {
    public  static void main(String args[])
    {
        PersonP p1=new PersonP();
        p1.displayName();
    }
}
class PersonP{

    String fullName = "Sagar";
    int age = 30;
    int adharCard = 90;

    public void displayName() {
        System.out.println(this.fullName);
    }
}
