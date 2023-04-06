public class encaps {
    public static void main(String args[])
    {
         String name=null;
         System.out.println(name);
         try{
             System.out.println(name.charAt(0));
         }
         catch (NullPointerException e)
         {
             System.out.println("please intiliaze the value");
         }
         catch (Exception e)
         {
             System.out.println("exception is handle");
             e.printStackTrace();
         }
         finally {
             System.out.println("i am always execute");
         }
    }
}
