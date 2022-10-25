//check whether character is digit or not
import java.util.*;

class CaDigrNot {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    if(c>=0 && c<=9){
      System.out.println("is a digit");
    }
    else{
      System.out.println("is not a digit");
    }

  }
}