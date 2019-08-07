import java.util.*;

class Person{
	String name;
	boolean loggedIn;

	Person(){
		name = "empty";
		loggedIn = false;
	}
}

class Main {
	public static void main(String[] args) {
		String[] employees = new String[20];
		employees[0] = "jon";
		employees[1] = "jim";
		System.out.println(employees[0]);

		Person employee1 = new Person();
		System.out.println(employee1.name);

		Person[] employeesSet = new Person[20];
		for(Person p : employeesSet){
			p = new Person();
		}
		System.out.println(employeesSet[0].name);
	}
}
