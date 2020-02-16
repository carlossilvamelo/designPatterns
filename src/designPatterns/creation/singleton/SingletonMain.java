package designPatterns.creation.singleton;

public class SingletonMain {
	
	public static void main(String[] args) {
		UserSingleton user = UserSingleton.getInstance();
		user.setName("Carlos");
		System.out.println(user.getName());
		UserSingleton user2 = UserSingleton.getInstance();
		System.out.println(user2.getName());
		
	}

}
