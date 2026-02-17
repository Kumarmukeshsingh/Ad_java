import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
   public static void main(String[] args) {
      String path1 = "myfile.txt";
      String path2 = " myfile.txt";

      FileReader fr = null;
      FileWriter fw = null;

      BufferedReader br = null;
      BufferedWriter bw = null;
      try {
         fr = new FileReader(path1);
         fw = new FileWriter(path2);
         br = new BufferedReader(fr);
         bw = new BufferedWriter(fw);
         String data;
         while ((data = br.readLine()) != null) {
            bw.write(data);
            System.out.println(data);
         }

      } catch (IOException e) {
         // e.printStackTrace();
         System.out.println(e);
      } finally {
         try {
            if (fr != null)
               fr.close();
            if (fw != null)
               fw.close();
            if (br != null)
               br.close();
            if (bw != null)
               bw.close();
         } catch (Exception e) {
            // TODO: handle exception
            // e.printStackTrace();
            System.err.println(e);
         }
      }
   }
}
