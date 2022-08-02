public class BankAccount
{
	String name;
	float amount;
	public void setValue(String n, float amnt)
	{
		name=n;
		amount=amnt;
	}
	public void setValue(String n)
	{
		name=n;
	}
	public void setValue(float amnt)
	{
		amount=amnt;
	}
	public void getValue()
	{
		System.out.println("Your name: "+name);
		System.out.println("Your total amount "+amount);
	}
	public static void main(String args[])
	{
		BankAccount obj1=new BankAccount();
		obj1.setValue("Manish Nath", 40000);
		obj1.getValue();
		BankAccount obj2=new BankAccount();
		obj2.setValue("Manish");
		obj2.getValue();
		obj2.setValue(50000);
		obj2.getValue();
	}
}