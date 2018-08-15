public class Main {

  public static void main(String[] args) {
    System.out.println(power(2, 4));
  }

  public static int power(int x, int n) {
    if (n >= 1) {
      return x * power(x, n-1);
    } else {
      return 1;
    }
  }

}
