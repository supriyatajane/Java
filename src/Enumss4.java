enum colorM{
    RED,WHITE,YELLOW;
    private colorM()
    {
        System.out.println("contructor called");
    }
    public void colorInfo()
    {
        System.out.println("added the information");
    }
}




public class Enumss4 {


    public static void main(String args[])
    {
     colorM c11=colorM.WHITE;
     c11.colorInfo();
    }
}
