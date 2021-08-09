package homework;

public class PersonManager extends MainManager{
	
	public void add(User user) {
		System.out.println(user.getFirstanme());
	}
	public void addMultiple(User[] users) {
		
		for (User user:users) {
			add(user);
		}
	}

}
