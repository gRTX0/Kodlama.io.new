package homework;

public class Main {

	public static void main(String[] args) {
		  
		Student student1 = new Student();
		student1.setFirstanme("nihad");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstanme("mahmud");
		
		PersonManager personManager = new PersonManager();
		personManager.add(instructor1);
		
		User[] users= {student1,instructor1};		
		personManager.addMultiple(users);
		
		
		
		MainManager mainManager = new MainManager();
		mainManager.add(new InstructorManager());
		
		
		

	}

}
