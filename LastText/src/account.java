import java.util.Date;


public class account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	public account(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withdraw(double money) {
		balance -= money;
	}
	
	public void deposit(double money) {
		balance += money;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

}
