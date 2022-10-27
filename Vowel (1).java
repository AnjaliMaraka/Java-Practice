/*1.Write a JAVA program to input any alphabet and check whether it is vowel or    consonant.
2. Write a JAVA program to input any character and check whether it is alphabet, digit    or special character.
3. Write a JAVA program to check whether a character is uppercase or lowercase     alphabet.
4.Write a JAVA program to input week number and print week day.
5.. Write a JAVA program to input basiJAVAsalary of an employee and calculate its Gross     salary according to following:


   BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%


   BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%


   BasiJAVASalary > 20000 : HRA = 30%, DA = 95%*/
import java.util.*;
class Vowel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the Alphabet");
    char c=sc.next().charAt(0);
    if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
    {
      System.out.println("it is an vowel");
    }
    else{
      System.out.println("it is not an vowel");
    }
  }
}
