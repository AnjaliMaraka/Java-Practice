import java.io.*;
class FileH{
  public static void main(String args[]){
    File file=new File("Data.txt");
    try{
    if(file.createNewFile()){
      System.out.println("file created");
    }
    else{
      System.out.println("Already exist");
    }
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
}