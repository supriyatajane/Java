public class New {
    public static void main(String args[])
    {
    New1 n1=new New1();

    n1.setAge(10);
    n1.setAdharCard("sup123");
    n1.setFullname("supriya Tajane");
        System.out.println(n1.adharCard);
        System.out.println(n1.age);
        System.out.println(n1.name);

    }
}
//set the values setter and getter

class New1{
    String name;
    int age;
    String adharCard;

    public void setFullname(String fn)
    {
      this.name=fn;
    }
    public void setAge(int g)
    {
        this.age=g;
    }
    public void setAdharCard(String ad)
    {
        this.adharCard=ad;
    }


}
