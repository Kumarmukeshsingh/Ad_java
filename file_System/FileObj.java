import java.io.File;

public class FileObj {
   public static void main(String[] args) {

      String path = "D:\\Advance-java\\file_System\\myfile.txt";
      File file = new File(path);
      System.out.println(file.canRead());
      System.out.println(file.canExecute());
      System.out.println(file.canWrite());
      System.out.println(file.getAbsolutePath());
      System.out.println();
   }
}