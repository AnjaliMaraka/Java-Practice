// Imagine you are building a program that processes and stores data from a large number of text files. You want to ensure that the program is able to handle files of any size, but you also want to be notified if a file is unusually large. You could create a custom exception called LargeFileException that is thrown when the size of a file exceeds a certain threshold. 
import java.util.*;
class LargeFileException extends Exception{
  public LargeFileException(String str){
    super(str);
  }
}
class LargeFile{
  
    public void print(String file) throws LargeFileException{
        long thsize=1000l;
        long str=file.length();
        if (str > thsize) {
            throw new LargeFileException("Large file"+thsize);
        }
    }
    public static void main(String args[]) {
      LargeFile f = new LargeFile(file);
    try{
      
    f.print("file.txt");
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
  
}
