class Duplicate{
  public void duplicateEleme(int arr[]){
   // int j;
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          //count++;
          System.out.println(arr[i]);
     
          //break;
        }
        
      }
        
    }
  }
  public static void main(String args[]){
    Duplicate de=new Duplicate();
    int array[]={1,1,2,2,3,4,4,5};
    de.duplicateEleme(array);
  }
}