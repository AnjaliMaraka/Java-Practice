import java.util.*;

class CountNegPos {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows and columns");
    int row = sc.nextInt();
    int col = sc.nextInt();
    int poscount = 0,negcount=0;
    int a[][] = new int[row][col];
    System.out.println("enter elements");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        a[i][j] = sc.nextInt();

      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (a[i][j]<0) {
          negcount++;
        }
        else if(a[i][j]>0){
          poscount++;
        }
      }
    }
    System.out.println("print positive count"+poscount);
    System.out.println("print negative numbers"+negcount);
  }
}