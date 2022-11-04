// ATM Operation

// Enter pin
// 1234
// 4 digit pin
// if it is valid display  bellow options

// 1.Withdraw
// 2.Deposit
// 3.check balance
// 5.exit

// select option
// 1
// if pin is not valid

// display message "Invalid pin"

// Do you want try again

// y

// Enter pin
// 1234
// if it is valid display  bellow options

// 1.Withdraw
// 2.Deposit
// 3.check balance
// 5.exit

// if pin is not valid

// Do you want try it again
// N
import java.util.*;

class Atmprg {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int amount = 0;
    int count = 0;
    char ch;
    System.out.println("Enter pin number");
    int pin = sc.nextInt();
    do {
      while (pin > 0) {//1234>0
        count++;
        pin = pin / 10;//1234/10=123,
      }
      System.out.println(count);
      if (count == 4) {
        System.out.println("1.Withdraw\n 2.Deposit \n3.check balance \n5.exit");
        System.out.println("Enter number");
        int n = sc.nextInt();
        switch (n) {
          case 1:
            System.out.println("Enter amount to withdraw");
            int a = sc.nextInt();
            amount = amount - a;
            System.out.println("withdraw succefully");
            break;
          case 2:
            System.out.println("Enter amount to deposit/n deposit= ");
            int da = sc.nextInt();
            amount = amount + da;
            break;
          case 3:
            System.out.println("the amount is " + amount);
            break;
          case 4:
            System.out.println("Thank you for visiting");
            break;
          default:
            System.out.println("invalid number try again");

        }
      }
      System.out.println("Do u want to search one more home");
      ch = sc.next().charAt(0);
    } while (ch == 'y');
  }
}
