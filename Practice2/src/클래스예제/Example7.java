package 클래스예제;

public class Example7 {

	public static void main(String[] args) {
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 19000);
		
		boolean result = true;
		while (result) {
			result = a.transfer(b, 3000);
		}
		System.out.println(a.toString());
		System.out.println(b.toString());
		

	}
}
class Account {
	String num;
	int balance;
	
	public Account(String num, int i) {
		this.num = num;
		balance = i;
	}
	@Override
	public String toString() {
		return "Account {num=" + num + ", balance=" + balance + "}";
	}

	public boolean transfer(Account target, int amount) {
		if(balance < amount) {
			return false;
		}
		else {
			balance -= amount;
			target.balance += amount;
			return true;
		}
		
	}

}