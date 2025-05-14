package atmWithdraw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImplementation implements AtmInterface{

	Atm atm=new Atm();
	Map<Double,String>miniStmt=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("AvailableBalance:"+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				miniStmt.put(withdrawAmount,"Amount withdrawn");
				System.out.println("Collect your money"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Enter the amount in terms of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		
		System.out.println("depositedAmount:"+depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		miniStmt.put(depositAmount,"Deposited Successfully");
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		
		Set<Double> set=miniStmt.keySet();
		for(Double d:set)
		{
			System.out.println(d+""+miniStmt.get(d));
		}
		
	}

}
