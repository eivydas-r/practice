import java.util.ArrayList;

class Person{
	String name;
	boolean loggedIn;

	Person(){
		name = "empty";
		loggedIn = false;
	}

	Person(String name, boolean loggedIn){
		this.name = name;
		System.out.println("this");
		this.loggedIn = loggedIn;
	}
}

class Main {
	public static void main(String[] args) {
		ArrayList<Person> employees = new ArrayList<Person>();
		employees.add(new Person ("Joe",true));

		System.out.println(employees.get(0).name);
	}
}
