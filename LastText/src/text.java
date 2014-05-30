
public class text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newAccount Account = new newAccount("George",1122,1000);
		Account.setAnnualInterestRate(0.015);
		Account.withdraw(30);
		Account.withdraw(40);
		Account.withdraw(50);
		Account.deposit(5);
		Account.deposit(4);
		Account.deposit(2);
		System.out.println("客户姓名："+Account.getName());
		System.out.println("利率："+Account.getAnnualInterestRate());
		System.out.println("收支额："+Account.getBalance());
		System.out.println("交易情况：");
		for(int i=0;i<Account.transactions.size();i++){
			System.out.println(Account.transactions.get(i));
		}

	}

}
