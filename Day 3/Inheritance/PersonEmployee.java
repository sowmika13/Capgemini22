package Inheritance;


class Person {
	String name1;
	void Name(String name) {
		System.out.println("The name of the person is " +name1);
	}
}
class Employee extends Person {
	String name1;
	double salary1;
	int year1;
	String insurance1;
	public Employee(String name, double salary, int year, String insurance) {
		super();
		name1 = name;
		salary1 = salary;
		year1 = year;
		insurance1 = insurance;
	}
	void Details() {
		System.out.println("The name of the Employee is " +name1);
		System.out.println("The Annual Salary of the Employee is " +salary1);
		System.out.println("The Joining Year of the Employee is " +year1);
		System.out.println("The Insurancenumber of the Employee is " +insurance1);
	}
	
}
public class PersonEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Sowmika", 500000, 2022, "sbdcwbchbwkj");
	    employee.Details();

	}

}
