package designPatterns.behavior.strategy;

public class StategyMain {

	public static void main(String[] args) {
		final Integer value = 100;
		PaymentStrategy paymentStrategy = new PaymentA();
		paymentStrategy.payment(value);
		paymentStrategy = new PaymentB();
		paymentStrategy.payment(value);
	}

}
