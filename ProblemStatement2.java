
/*2.problem statement
gross salary:

basicsalary+HRA+DA

basic salary:20000
hra:12% on basic salary------20000*12/100=2400
DA :20% on basic salary------20000*20/100=4000


gs=20000+2400+4000

can yot solve this?*/
//creating package
import java.util.Scanner;

//main class
class ProblemStatement2 {
  // main method
  public static void main(String args[]) {
    // creating object
    Scanner sc = new Scanner(System.in);
    System.out.println("basic salary");
    int bs = sc.nextInt();
    System.out.println("HRA");
    int hra = sc.nextInt();
    hra = (bs * hra) / 100;
    System.out.println("DA");
    int da = sc.nextInt();
    da = (bs * da) / 100;
    // formula for gross salary
    int gs = bs + hra + da;
    System.out.println("gross salary:" + gs);
  }
}