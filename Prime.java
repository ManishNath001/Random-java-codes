class Prime
{
	public static void main(String args[])
	{
		int a=37,s=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				s=s+1;	
			}
		}
		if(s>0)
		{
			System.out.println("The number "+a+" is not Prime");
		}
		else
		{
			System.out.println("The number "+a+" is Prime");
		}
	}
}