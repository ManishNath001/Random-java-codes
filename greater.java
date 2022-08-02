import java.util.Scanner;
public class greater
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter another number");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is the greater number");
		}
		else
		{
			System.out.println(b+" is the greater number");
		} 

	}
}