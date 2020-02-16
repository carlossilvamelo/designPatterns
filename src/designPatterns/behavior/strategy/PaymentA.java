package designPatterns.behavior.strategy;

public class PaymentA implements PaymentStrategy{

	@Override
	public void payment(Integer value) {
		System.out.println(value * 0.80);
		
	}
}
