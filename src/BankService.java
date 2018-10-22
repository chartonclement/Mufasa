
public interface BankService {
	
    public boolean withdraw(double money, int cvc);
    public boolean deposit(double money);
    public double getMoney();
    
}
