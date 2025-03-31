package ss21.B9;
class ValidAmount extends Exception{
	public ValidAmount(String message){
		super(message);
	}

}
public class BankAccount {
	private String accountId;
	private double balance;
	public BankAccount() {
	}
	public BankAccount(String accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Deposit(double amount){
		
	}
	public void Withdraw(double amount) throws ValidAmount{
		if(amount > balance) throw new ValidAmount("rut phai lon hon so du");
	}
	public void Transfer(BankAccount target,double amount) throws ValidAmount{
		if(target==null){
			throw new ValidAmount("ko tim thay tk");
		}
		if(amount > balance) throw new ValidAmount("so du ko du");
		balance -= amount;
		double targetBalance = target.getBalance();
		target.setBalance(targetBalance+amount);
		

	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", balance=" + balance + "]";
	}
	
}
