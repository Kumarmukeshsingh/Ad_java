import java.io.IOException;
import java.io.File;

public class createFile{
   public static void main(String[] args){
      try{
         File Obj = new File("myfile.txt");
         if(Obj.createNewFile()){
            System.out.println("File created: " + Obj.getName());
         }else {
            System.out.println("file already exists.");
         }
      }catch(IOException e){
         System.out.println("an error has occurred.");
         e.printStackTrace();
      }
   }
}