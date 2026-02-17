import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileInputOutputDemo {
   public static void main(String[] args) throws IOException {
      String path1 = "myfile.txt";
      String path2 = "myfile.txt";
      FileInputStream fis = null;
      FileOutputStream fos = null;
      try {
         fis = new FileInputStream(path1);
         fos = new FileOutputStream(path2);
         int data;
         while ((data = fis.read()) != -1) {
            fos.write(data);
         }
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      } finally {

         fis.close();
         fos.close();
      }
   }
}