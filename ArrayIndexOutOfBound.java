/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException.
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console.
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
class ArrayIndexOutOfBound{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements");
    
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
      try{
        //ArrayIndexOutOfBoundsException
        for(int i=0;i<=n;i++){
        System.out.println(arr[i]);
      }
      }
    
    catch(ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
    }
    
  }
}