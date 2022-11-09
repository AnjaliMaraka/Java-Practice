//Write a JAVA program to count total number of even and odd elements in an array.
import java.util.*;
class CountEvenOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]={2,4,6,3,7,1,9};
    int evencount=0;
    int oddcount=0;
    System.out.println("even count");
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        evencount++;
      }
      else if(a[i]%2!=0){
        oddcount++;
      }
    }
    System.out.println(evencount);
    System.out.println("odd count");
    System.out.println(oddcount);
  }
}
 // System.out.println(count);
     // System.out.println("odd count");
     // count=0;
     // for(int i=0;i<a.length;i++){
     //  if(a[i]%2!=0){
     //    count++;
// class Total{
//   public static void main(String args[]){
//     int a[]={2,4,6,8,10,11,13,17,44,57};
//     int count_even=0,count_odd=0;
//     for(int i=0;i<a.length;i++){
//       if(a[i]%2==0){
//         count_even++;
//       }
//       else{
//         count_odd++;
//       }
//     }
//     System.out.println("The even number in list are "+count_even);
//     System.out.println("The odd number in list are "+count_odd);
//   }
// }