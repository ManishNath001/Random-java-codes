abstract class Patt
{
	int n;
	Patt(int m)
	{
		n=m;
	}
	abstract void lines();
}

class Pyramid extends Patt
{
	Pyramid(int m)
	{
		super(m);
	}
	void lines()
	{
		int rows=n, k=0;
		for(int i=1;i<=rows;++i,k=0)
		{
			for(int l=1;l<=rows-i;++l)
			{
				System.out.print(" ");
			}
			while(k!=2*i-1)
			{
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}
	}
}

class Pattern
{
	public static void main(String args[])
	{
		Pyramid obj1=new Pyramid(3);
		obj1.lines();
	}
}