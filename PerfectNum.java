import java.util.Scanner;
class PerfectNum {
  public static void main(String args[]) {
    int n, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number");
    n = sc.nextInt();
    int i = 1;
    while (i <= n / 2) {
      if (n % i == 0) {
        sum = sum + i;
      }
      i++;
    }
    if (sum == n) {
      System.out.println("perfect number");
    } else
      System.out.println("not a perfect number");
  }
}