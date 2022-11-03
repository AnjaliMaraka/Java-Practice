//Product of number
import java.util.*;

class ProductNum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    int prod = 1;
    int rem = 0;
    while (n > 0) {
      rem = n % 10;
      prod = prod * rem;
      n=n/10;

    }
    System.out.println(prod);
  }
}