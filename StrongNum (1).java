// Strong number

// If the sum of the factorial of digits of a number (N) is equal to the number itself, the number (N) is called a special number.

// Consider a number 145 and check it is a special number or not.
// The digits of the number are: 1, 4, 5

// Factorial of digits:

// !1 = 1

// !4 = 4*3*2*1 = 24

// !5 = 5*4*3*2*1 = 120

// Sum of factorial of digits = 1 + 24 + 120 = 145

// Compare the sum of the factorial of digits with the given number, i.e. 145 = 145. We observe that both are equal.
// Program in Java to check if a given number is a strong number or not
import java.util.*;

public class StrongNum {
  public static void main(String[] args) {
    int n, i;
    int fact, rem;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number");
    n = sc.nextInt();
    int sum = 0;
    int temp = n;
    while (n >0) {
      i = 1;
      fact= 1;
      rem= n % 10;
      while (i <= rem) {
        fact = fact * i;
        i++;
      }
      sum = sum + fact;
      n = n / 10;
    }
    if (sum == temp)
      System.out.println(" strong number");
    else
      System.out.println("not a strong number\n");
  }
}