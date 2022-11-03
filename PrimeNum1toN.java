import java.util.*;

class PrimeNum1toN{
  public static void main(String arg[])	{
	int i,count;
  System.out.print("Enter n value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
	count=0;
	for(int j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(i+"\n");     
	}
	}
}