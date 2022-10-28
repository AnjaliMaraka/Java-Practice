/*import java.util.*;
class Table{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+(n*i));
    }
  }
}*/
/*import java.util.*;
class Table{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while(i<=10){
      System.out.println(n+"*"+i+"="+(n*i));
      i++;
    }
  }
}*/
import java.util.*;
class Table{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    do{
      System.out.println(n+"*"+i+"="+(n*i));
      i++;
    }while(i<=10);
  }
}