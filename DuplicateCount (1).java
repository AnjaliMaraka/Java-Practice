class DuplicateCount{
  public void duplicateCount(){
   int a[]={1,2,1,3,2,1,4};
    int fr[]=new int[a.length];
    int visited=-1;
  int count=0;
    System.out.println("Duplicates elements");
    for(int i=0;i<a.length;i++){//i=0
      count=1;
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          count++;//2
          fr[j]=visited;
        }
       }
      if(fr[i]!=visited){
        fr[i]=count;
      }
    }
  System.out.println(" elements |frequency ");
    for(int i=0;i<a.length;i++){
      if(fr[i]!=visited){
      System.out.println(a[i]+"          "+fr[i]);
      }
    }
    int index=0;
    int min=fr[0];
    for(int k=0;k<fr.length;k++){
      if(fr[k]!=-1){
        if(min>fr[k]){
          min=fr[k];
          index=k;
        }
      }
    }
    System.out.println("Minimum");
    
       System.out.println(a[index]+"          "+fr[index]);
    //}
   
}
  public static void main(String args[]){
    DuplicateCount dc=new DuplicateCount();
    dc.duplicateCount();
  }
}