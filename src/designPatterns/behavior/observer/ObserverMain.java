package designPatterns.behavior.observer;

public class ObserverMain {

	public static void main(String[] args) {
		ObservableSubject subject = new ObservableSubject();
		
		ConcreteObserverA observerA = new ConcreteObserverA();
		ConcreteObserverB observerB = new ConcreteObserverB();

		subject.add(observerA);
		subject.add(observerB);
		
		subject.execute();
	}

}
