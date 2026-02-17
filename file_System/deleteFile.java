import java.io.File;

public class deleteFile {
   public static void main(String[] args) {
      try {
         File Obj = new File("myfile.txt");
         // deleting file
         if(Obj.delete()){
            System.out.println("the deleted file is :  " + Obj.getName());
         }else{
            System.out.println("Failed in deleting the file");
         }
      } catch (Exception e) {
         // TODO: handle exception
         e.getStackTrace();
      }
   }
}
