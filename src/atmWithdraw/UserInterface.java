package atmWithdraw;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationImplementation impl=new AtmOperationImplementation();
		Scanner scanner=new Scanner(System.in);
		int atmNum=123456;
		int atmpin=2218;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("Enter The ATM NUMBER");
		int atmNum2=scanner.nextInt();
		System.out.println("Enter The ATM PIN");
		int atmpin2=scanner.nextInt();
		if(atmNum==atmNum2 && atmpin==atmpin2)
		{
			while(true)
			{
				System.out.println(" 1.viewAvailable\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewMiniStatement\n 5.exit");
				System.out.println("Enter the Choice");
				int n=scanner.nextInt();
				if(n==1)
				{
					impl.viewBalance();
				}
				else if(n==2)
				{
					System.out.println("Enter the amount to withdraw");
					double withdrawAmount=scanner.nextDouble();
					impl.withdrawAmount(withdrawAmount);
				}
				else if(n==3)
				{
					System.out.println("Enter the Deposit Amount");
					double depositAmount=scanner.nextDouble();
					impl.depositAmount(depositAmount);
				}
				else if(n==4)
				{
					impl.viewMiniStatement();
				}
				else if(n==5)
				{
					System.out.println("Collect your Card\n Thank you");
					System.exit(status);
				}
			    else
			    {
			    	System.out.println("Incorrect ATM Number or Pin");
			    }
			}
		}
		
	}

}
