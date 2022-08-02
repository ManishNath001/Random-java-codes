interface interf1
{
	int  a=56;
	public void exmpl1();
}

interface interf2
{
	int b=32;
	public void exmpl2();
}

class IntrfcImp  implements interf1,interf2
{
	public void exmpl1()
	{
		int  c=a*100; 
		System.out.println(c);
	}
	public void exmpl2()
	{
		int d=b*100;
		System.out.println(d);
	}
}

class MultipleInheritanceUsingInterface
{
	public static void main(String args[])
	{
		IntrfcImp obj=new IntrfcImp();
		obj.exmpl1();
		obj.exmpl2();
	}
}