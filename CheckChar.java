//2. Write a JAVA program to input any character and check whether it is alphabet, digit    or special character.
import java.util.*;
class CheckChar{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter character");
    char c=sc.next().charAt(0);
    if((c>='A' && c<='Z') && (c>='a' && c<='z')){
      System.out.println("it is an alphabet");
    }
    else if(c>=0 && c<=9){
      System.out.println("it is a digit");
    }
    else{
      System.out.println("Special character");
    }
  }
}