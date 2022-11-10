// Valid Initial Configuration
 
// Nurikabe logical game (sometimes called Islands in the Stream) is a binary determination puzzle. The puzzle is played on a typically rectangular grid of cells, some of which contain numbers. You must decide for each cell if it is white or black (by clicking on them) according to the following rules:

// All of the black cells must be connected.
// Each numbered cell must be part of a white island of connected white cells.
// Each island must have the same number of white cells as the number it contains (including the numbered cell).
// Two islands may not be connected.
// There cannot be any 2x2 blocks of black cells.
// Unnumbered cells start out grey and cycle through white and black when clicked. Initially numbered cells are white in color.
 
// Problem Statement:
// Write a program to check whether the given board configuration is a valid initial configuration. Below figure is the sample valid initial configuration.
 
 
 
// Input Format:
// First line of the input is an integer N that gives the number of rows and columns of the grid.
// Next N lines will have the board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
 
// Output Format:
// Output "Yes" (without quotes) if the given configuration is a valid initial configuration. Print "No" otherwise (without quotes).
// Refer sample input and output for formatting specifications.
 
// Sample Input 1:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 20 20 20
// 20 20 20 20 20
// 6 20 3 20 20
 
// Sample Output 1:
// Yes
 
// Sample Input 2:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 12 20 20
// 20 20 20 20 20
// 6 20 3 20 20
 
// Sample Output 2:
// No

// Sample Input 1:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 20 20 20
// 20 20 20 20 20
// 6 20 3 20 20
 
// Sample Output 1:
// 4
 
// Sample Input 2:
// 9
// 20 5 20 20 3 20 20 20 20
// 20 20 8 20 20 20 20 5 20
// 20 20 20 20 20 20 2 20 20
// 20 20 20 20 20 20 20 20 20
// 20 20 20 20 20 20 20 20 20
// 20 20 20 20 20 20 20 20 20
// 20 20 3 20 20 20 20 20 20
// 20 3 20 20 20 20 3 20 20
// 20 20 20 20 1 20 20 6 20
 
// Sample Output 2:
// 10
 import java.util.*;
class Fuzzil{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rows and columns");
    int n=sc.nextInt();
    int count=0;
    int a[][]=new int[n][n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]>10 && a[i][j]!=20){
          count=1;
          break;
        }
      }
    }
    if(count==1){
      System.out.println("NO");
    }
    else{
      System.out.println("YES");
    }
  }
}
import java.util.*;
class Fuzzil{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rows and columns");
    int n=sc.nextInt();
    int count=0;
    int a[][]=new int[n][n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]<10){
          count++;
        }
      }
    }
  System.out.println(count);
  }
}
 