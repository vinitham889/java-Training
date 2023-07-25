
public class HSBCBank implements USBank ,BrazilBank{//we are achieving multiple inheritance
	//also called Is-a relationship
	
	//If a class is implementing any interface , then it is mandatory to define/override all the methods of interface 
    //Override from USBank
	@Override
	public void credit() {
		System.out.println("hsbc---credit");
		
	}

	@Override
	public void debit() {
		System.out.println("hsbc---debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
		
	}
	//Separate method of HSBCBank class
	public void educationLoan()
	{
		System.out.println("hsbc---educationLoan");
		
	}
	public void carLoan()
	{
		System.out.println("hsbc---carLoan");
	}
     
	//Brazil bank method -- override from brazilBank
	@Override
	public void mutualFunds() {
		System.out.println("hsbc---mutualFunds");
		
	}
	

}
