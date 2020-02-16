package designPatterns.creation.singleton;

public class UserSingleton {

	private static UserSingleton instancenstance;
	
	private String name;
	
	private UserSingleton() {}
	
	public static UserSingleton getInstance() {
		if(instancenstance == null) {
			instancenstance = new UserSingleton();
		}else
			return instancenstance;
		return instancenstance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
