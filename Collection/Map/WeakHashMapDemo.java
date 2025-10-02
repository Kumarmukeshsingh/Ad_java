import java.lang.ref.WeakReference;

public class WeakHashMapDemo {
  public static void main(String[] args) {

    // Phone phone = new Phone("Iphone", "16 pro Max");
    // System.out.println(phone);

    WeakReference phonewReference = new WeakReference<>(new Phone("Iphone", "16 pro max"));
    System.out.println(phonewReference.get());
    System.gc();
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
    System.out.println(phonewReference.get());

  }
}
class Phone {
  String brand;
  String model;

  public Phone(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  @Override
  public String toString() {
    return "Phone [brand=" + brand + ", model=" + model + "]";
  }

}