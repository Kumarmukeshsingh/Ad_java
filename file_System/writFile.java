import java.io.File;
import java.io.FileWriter;

public class writFile {
   public static void main(String[] args) {
      try {
         FileWriter writer = new FileWriter("myfile.txt");
         writer.write("file in java are seriously good !!");
         writer.close();
         System.out.println(" successfully written");
      } catch (Exception e) {
         // TODO: handle exception
         System.out.println(" An  error has occurred");
         e.getStackTrace();
      }
   }
   
}
