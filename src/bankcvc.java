
public class bankcvc implements BankService{

	  int CVC = 111;
	  double money = 50.0;

	  double accountmoney;
	  boolean depositnotOK;
	  
	  public bankcvc() {
		    depositnotOK = false;
		    accountmoney = money;
	  }
	  
	  @Override
	  public boolean withdraw(double amount, int givencvc) {
	    if (givencvc == CVC) {
	      if (money - amount >= 0.0) {
	        money =money - amount;
	        return true;
	      } else {
	        return false;
	      }
	    } else {
	      return false;
	    }
	  }

	  @Override
	  public boolean deposit(double amount) {
	    if (depositnotOK) {
	      return false;
	    } else {
	      if (amount < 0.0) {
	        return false;
	      } else {
	         money = money + amount;
	        return true;
	      }
	    }
	  }

	  public double getMoney() {
	    return money;
	  }

	  public void setifdepositisok(boolean value) {
	    depositnotOK = value;
	  }
}
