import java.util.ArrayList;


public class newAccount extends account {
	private String name;
	ArrayList transactions = new ArrayList();
	
	public newAccount(String name,int id,double balance){
		super(id,balance);
		this.name = name;
	}
	
	public void withdraw(double money) {
		setBalance(getBalance()-money);
		transactions.add(new Transaction('W',money,getBalance(),this.name+"从账户上取了"+money+"元钱"));
	}
	
	public void deposit(double money) {
		setBalance(getBalance()+money);
		transactions.add(new Transaction('D',money,getBalance(),this.name+"往账户上存了"+money+"元钱"));
	}

	public String getName() {
		return name;
	}

}
