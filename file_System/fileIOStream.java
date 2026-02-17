import java.io.FileInputStream;
import java.io.FileOutputStream;

class fileIOStream {
   public static void main(String[] args) {
      try (FileInputStream inputFile = new FileInputStream("Resume.pdf");
            FileOutputStream outputFile = new FileOutputStream("Backup_Resume.pdf")) {
         int byteData;
         while ((byteData = inputFile.read()) != -1) {
            outputFile.write(byteData);
            // System.out.println(byteData);

         }
         System.out.println("Resume copied sussfully ");

      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }
   }
}