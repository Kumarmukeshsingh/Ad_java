import java.util.WeakHashMap;

// this is a week refrence so it is delect automatically by the garbage collection
public class WeakhashMapDemo2 {
   public static void main(String[] args) {
      WeakHashMap<String, Image> imageCatch = new WeakHashMap<>();
      imageCatch.put("img1", new Image("image 1"));
      imageCatch.put("img2", new Image("image 2"));
      System.out.println(imageCatch);
      System.gc();
      applicationRunning();
      System.out.println(imageCatch);

   }

   public static void applicationRunning() {
      try {
         Thread.sleep(1000);
      } catch (Exception e) {
         e.getStackTrace();
      }
   }
}

class Image {
   private String name;

   public Image(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Image [name=" + name + "]";
   }

}