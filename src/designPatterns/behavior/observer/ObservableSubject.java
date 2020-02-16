package designPatterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableSubject {

	private List<Observer> observers = new ArrayList<>();
	
	public void add(Observer o) {
        observers.add(o);
    }
	
    public void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
