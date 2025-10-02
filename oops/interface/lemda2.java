
interface A {
  int add(int a, int b);// lemda interface with the help of pass by value;
}

public class lemda2 {
  public static void main(String[] args) {

    A obj = (a, b) -> {

      return a + b;
    };

    int ans = obj.add(10, 10);
    System.out.println(ans);

  }
}
