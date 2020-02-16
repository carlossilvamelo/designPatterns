package designPatterns.behavior.observer;

public class ConcreteObserverB implements Observer{

	@Override
	public void update() {
		System.out.println("ConcreteObserverB notified!");
	}

}
