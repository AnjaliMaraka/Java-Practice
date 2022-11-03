import java.util.*;
class PrimeSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbr");
    int n=sc.nextInt();
    int count=0;
    int sum=0;
    for(int i=1;i>=n;i++){
      if(n%i==0){
        count++;
      }
      if(count==2) {
        sum=sum+i;
        System.out.println(sum);
      }  
      }
  }
}