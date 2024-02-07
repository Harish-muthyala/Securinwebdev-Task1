
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Readwritefile {

    public static void main(String  args[]){
        try{
            File file= new File("Demo.txt");    //creating file

        FileWriter writ= new FileWriter("Demo.txt");    //writing into file
        writ.write("helllo this is a demo text");
        writ.close();
        Scanner obj= new Scanner(file); //reading into file

        while (obj.hasNextLine()) {
            String data = obj.nextLine();
            System.out.println(data);
          }
        

        }
        catch(Exception e){}
    }
}
