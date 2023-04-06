import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class encaps2 {
    public static void main(String args[])
    {
    int [] number=new int[3];
    number[0]=11;
    number[1]=12;
    number[2]=13;


        try {
            File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
            BufferedReader br
                    = new BufferedReader(new FileReader(file));

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
            System.out.println("please select correct path");
        }
    }
}
