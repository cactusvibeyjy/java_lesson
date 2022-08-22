package 상속예제;

public class CurrencyTest {
	public static void main(String[] args) {
		KRW krw = new KRW(1500, "won");
		USD usd = new USD(1500, "dollor");
		EUR eur = new EUR(1500, "euro");
		JPY jpy = new JPY(1500, "yen");
		
		Currency [] currencies = {krw, usd, eur, jpy};
		
		for(Currency c : currencies) {
			System.out.println(c.toString());
		}
	}

}
class Currency {
	protected double amount;
	protected String notation;
	
	public Currency (double amount, String notation) {
		this.amount =  amount;
		this.notation = notation;
	}
}
class KRW extends Currency{

	public KRW(double amount, String notation) {
		super(amount, notation);
	}
	
	public String toString() {
		return String.format("KRW: %.2f %s", amount, notation);
	}
	
}
class USD extends Currency{

	public USD(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("USD: %.2f %s", amount, notation);
	}
	
}
class EUR extends Currency{
	
	public EUR(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("EUR: %.2f %s", amount, notation);
	}
	
}
class JPY extends Currency{
	
	public JPY(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("JPY: %.2f %s", amount, notation);
	}
	
}