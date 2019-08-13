package prob03;

public class Money {

	private int amount;
    
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Money() {
	}
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Object add (Money money) {
		Money add = new Money(this.amount+money.getAmount());
		return add;
	}
	public Object minus (Money money) {
		Money minus = new Money(this.amount-money.getAmount());
		return minus;
	}
	public Object multiply (Money money) {
		Money multiply = new Money(this.amount*money.getAmount());
		return multiply;
	}
	public Object devide (Money money) {
		Money devide = new Money(this.amount/money.getAmount());
		return devide;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Money ) {
			return ((Money) o).getAmount() == this.amount;
		}
		return false;
	}
}
