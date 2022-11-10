import java.util.*;
class SumTwoD{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows and colums");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int sum[][]=new int[row][col];
    System.out.println("Enter matrix1 elements");
    int a[][]=new int[row][col];
    int b[][]=new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter matrix2 elements");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        b[i][j]=sc.nextInt();
      }
    }
    System.out.println("sum of two matrix elements ");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        sum[i][j]=a[i][j]+b[i][j];
      }
}
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      System.out.println(sum[i][j]);
    }
  }
}
}