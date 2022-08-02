public class Bankaccount2
{
	String name;
	float amount;
	public void setValue(String n, float amnt)
	{
		name=n;
		amount=amnt;
	}
	
	public void getValue()
	{
		System.out.println("Your name: "+name);
		System.out.println("Your total amount "+amount);
	}
	public void cash_deposit(float dp)
	{
		System.out.println("Amount to be depositted= "+dp);
		amount=amount+dp;
		System.out.println("Total amount= "+amount);
	}
	public void cash_withdrawal(float wtdl)
	{
		System.out.println("Amount to be withdrawn= "+wtdl);
		if(wtdl>amount)
		{
			System.out.println("Amount to be withdrawn is more than total amount. So amount cannot be withdrawn");
		}
		else
		{
			amount=amount-wtdl;
			System.out.println("Total amount= "+amount);
		}
	}
	public static void main(String args[])
	{
		Bankaccount2 obj1=new Bankaccount2();
		obj1.setValue("Manish Nath", 80000);
		obj1.getValue();
		obj1.cash_deposit(10000);
		obj1.cash_withdrawal(90000);
		obj1.cash_withdrawal(20000);
	}
}