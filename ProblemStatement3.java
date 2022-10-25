/*3.problem statement

event

brandingexpenses--20000
food expenses----50000
travel expenses---12000
logistic expenses-----5000

I want your help

find total amount i spent?

percentage on each expense*/
//creating package
import java.util.Scanner;
class ProblemStatement3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Branding expenses");
    double be=sc.nextInt();
    System.out.println("food expenses");
    double fe=sc.nextInt();
    System.out.println("Travel expenses");
    double te=sc.nextInt();
    System.out.println("logistic expenses");
    double le=sc.nextInt();
    double total=be+fe+te+le;
    System.out.println("total amount:"+total);
    be=(be*100)/total;
    System.out.println("percentage of Branding expenses:"+be+"%");
    fe=(fe*100)/total;
    System.out.println("percentage of food expenses:"+fe+"%");
    te=(te*100)/total;
    System.out.println("percentage of travel expenses:"+te+"%");
    le=(le*100)/(total);
    System.out.println("percentage of logistic expenses:"+le+"%");
  }
}
