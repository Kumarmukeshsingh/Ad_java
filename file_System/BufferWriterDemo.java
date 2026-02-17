import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriterDemo {
   public static void main(String[] args) {

      // this part the write in a file
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"))) {
         writer.write("mukesh kumar singh lapung ranchi jharkhand");
         writer.flush();
         System.out.println("String writeen in file");
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }

      // this part read the file
      try (

            BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))) {
         String line;
         while ((line = reader.readLine()) != null) {
            System.out.println(line);
         }
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }

   }
}
