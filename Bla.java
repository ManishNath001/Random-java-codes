import java.io.*;
class Bla
{
    public static void main(String args[])
    {	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the number:");
   		int a=Integer.parseInt(br.readLine());
    	int b=Integer.parseInt(br.readLine());
    	int sum=a+b;
    	System.out.println("Sum="+sum);
    }
}