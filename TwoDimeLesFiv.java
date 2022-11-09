class TwoDimeLesFiv{
  public static void main(String args[]){
    int a[][]={{1,2,3,4,5},{4,0,8,6,7},{2,3,0,1,7},{11,5,15,12,9},{13,0,7,6,4}};
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(a[i][j]<=5){
          System.out.print(a[i][j]+" ");
        }
      }
    }
    System.out.println();
  }
}