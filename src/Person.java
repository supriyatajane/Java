public class Person {
    //using get and set method

    public void main(String[] args) {

     Test t1=new Test();
     t1.setFirstname("Riya");
     t1.setLastname("mirza");
     t1.displayName();

     Test2 t2=new Test2();
     t2.displayName();
    }

    class Test{
        String firstname;
        String lastname;
        public void setFirstname(String firstname)
        {
            this.firstname=firstname;
        }
        public void setLastname(String lastname)
        {
            this.lastname=lastname;
        }
        public void displayName()
        {
            System.out.println(this.firstname+" "+this.lastname);
        }
    }
    class Test2{
        String name="sarika";
        String lname="Pansare";
        public void displayName()
        {
            System.out.println(this.name+" "+this.lname);
        }
    }
}
