/*ATM operation

  amount=10000

1.withdraw
2.deposit
3.check balance
4.exit

  select option
  1
//  enter amount to withdraw
//  500
//  amount=amount-500;
// withdraw successfully

  2
   Enter amount to deposit
   depsoit=1000
  amount=amount+deposit

  3.
  the amount is 11000

  4
  System.out.print("thank you for visiting");*/
import java.util.*;
class Switch2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Amount");
    int amount=sc.nextInt();
    System.out.println("select the number 1.withdraw 2.deposit 3.check balance 4.exit");
    int num=sc.nextInt();
    switch(num){
      case 1:
        System.out.println("Enter amount to withdraw");
        int a=sc.nextInt();
        amount=amount-a;
        System.out.println("withdraw succefully");
        break;
      case 2:
        System.out.println("Enter amount to deposit/n deposit= ");
        int da=sc.nextInt();
        amount=amount+da;
        break;
      case 3:
        System.out.println("the amount is "+amount);
        break;
      case 4:
        System.out.println("Thank you for visiting");
        break;
      default:
        System.out.println("invalid number try again");
      }
  }
}
   