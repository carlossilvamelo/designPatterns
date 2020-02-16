package designPatterns.behavior.strategy;

public class PaymentB implements PaymentStrategy{

	
	@Override
	public void payment(Integer value) {
		System.out.println(value * 1.20);
		
	}

}
