
public class TestBank {

	public static void main(String[] args) {
		
		
		//This is not allowed because we cannot create instance of interface:
		//USBank ub = new USBank();
		System.out.println(USBank.minBal);
		//USBank.minBal = 200;//cannot change var value of interface by default it is final
		
		HSBCBank hb = new HSBCBank();
		hb.credit();
		hb.debit();
		hb.transferMoney();
		hb.educationLoan();
		hb.carLoan();
		
		//dynamic polymorphism:
		//child class object (HSBC class) can be referred by parent interface var(USBank)
		USBank ub = new HSBCBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();
		//ub.carLoan();//this is not allowed because this method present only in hsbc class only overridden method can be accessed
	}

}
