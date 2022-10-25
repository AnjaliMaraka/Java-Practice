//check whether character is alphabet or not
import java.util.*;
class CharacterAlpharNot{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char c=sc.next().charAt(0);
    if((c>='a' && c<='z')||(c>='A' && c<='Z')){
      System.out.println("Character is alphabet");
    }
    else{
      System.out.println("Character is not an alphabet");
    }
  }
}