abstract class Fig
{
	int l1;
	Fig(int a)
	{
		l1=a;
	}
	abstract float area();
}

class Rectangle extends Fig
{
	int l2;
	Rectangle(int a, int b)
	{
		super(a);
		l2=b;
	}
	float area()
	{
		float ar=l2*l1;
		return ar;
	}
}

class Square extends Fig
{
	Square(int a)
	{
		super(a);
	}
	float area()
	{
		float ar=l1*l1;
		return ar;
	}
}

class E_triangle extends Fig
{
	E_triangle(int a)
	{
		super(a);
	}
	float area()
	{
		float ar=(l1*l1)/4;
		return ar;
	}
}

class Area
{
	public static void main(String args[])
	{
		Rectangle obj1=new Rectangle(2,3);
		float m=obj1.area();
		Square obj2=new Square(2);
		float n=obj2.area();
		E_triangle obj3=new E_triangle(2);
		float c=obj3.area();
		System.out.println(m);
		System.out.println(n);
		System.out.println(c);
	}
}