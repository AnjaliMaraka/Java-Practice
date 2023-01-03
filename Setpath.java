import java.io.*;

class Setpath {
  public static void main(String args[]){
    
       File file=new File("Data.txt");
    if(file.exists()){
      System.out.println(file.getName());
      System.out.println("absolute path"+file.getAbsolutePath());
      System.out.println("is file writeable"+file.canWrite());
      System.out.println("is file readable"+file.canRead());
      System.out.println(file.length());
      }
    else{
      System.out.println("the file doesnot exist");
    }
  }
}
 


  