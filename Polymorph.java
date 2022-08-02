public class Polymorph
{
	int sum;
	String s;
	void Add(int a, int b)
	{
		sum=a+b;
		System.out.println("Addition of integers "+a+" and "+b+"= "+sum);
	}
	void Add(char a, char b)
	{
		s=""+a+b;
		System.out.println("Addition of characters "+a+" and "+b+"= "+s);
	}
	public static void main(String args[])
	{
		Polymorph obj1=new Polymorph();
		Polymorph obj2=new Polymorph();
		obj1.Add(7,9);
		obj2.Add('M','N');
	}
}