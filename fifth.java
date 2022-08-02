import java.util.Scanner;
class Bank 
{
    private String accno;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);
    void openAccount() 
    {
        System.out.print("Enter account number: ");
        accno = sc.next();
        System.out.print("Enter name of account holder: ");
        name = sc.next();
        System.out.print("Enter balance: ");
        balance = sc.nextLong();
    }
    void showAccount() 
    {
        System.out.println("\n" + accno + ", " + name + ", " + balance);
    }
    void deposit() 
    {
        long amnt;
        System.out.println("Enter the amount to be deposited: ");
        amnt = sc.nextLong();
        balance = balance + amnt;
    }

    void withdrawal() 
    {
        long amnt;
        System.out.println("Enter the amount to be withdrawn: ");
        amnt = sc.nextLong();
        if (balance >= amnt) 
        {
            balance = balance - amnt;
        }
        else 
        {
            System.out.println("Insufficient funds.Transaction failed.");
        }
    }  
    boolean search(String acn) 
    {
        if (accno.equals(acn)) 
        {
            showAccount();
            return (true);
        } 
        else 
        {
            return (false);
        }
    }
}

public class fifth 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the desired number of customers: ");
        int n = sc.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) 
        {
            C[i] = new Bank();
            C[i].openAccount();
        }
        int choice;
        do 
        {
            System.out.println("\n\n\t\tMenu \n1.Display All \n2.Search By Account \n3.Deposit \n4.Withdraw \n5.Exit");
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    for (int i = 0; i < C.length; i++) 
                    {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    String acn = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) 
                    {
                        found = C[i].search(acn);
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) 
                    {
                        found = C[i].search(acn);
                        if (found) 
                        {
                            C[i].deposit();

                        } 
                        else 
                        {
                            System.out.println("Account does not exist in our records.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) 
                    {
                        found = C[i].search(acn);
                        if (found) 
                        {
                            C[i].withdrawal();
                            break;
                        } 
                        else 
                        {
                            System.out.println("Account does not exist in our records.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting..");
                    break;

            }
        } 
        while (choice != 5);
        sc.close();
    }
}