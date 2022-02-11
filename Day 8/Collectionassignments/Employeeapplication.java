package Collectionassignments;
import java.util.*;
/*
 * Create an application for employee management having following classes: 
a) Create an Employee class with following attributes and behaviors : 
i) EmpId Int ii) EmpName String iii) EmpEmail String 
iv) EmpGender char v) EmpSalary float vi) GetEmployeeDetails() -> prints employee details
b) Create one more class EmployeeDB which has the following methods. 
i) boolean addEmployee(Employee e) ii) boolean deleteEmployee(int empId)
 iii) String showPaySlip(int empId) iv) Employee[] listAll()
Do implementation of the above application with below two methods : 
I. Use an ArrayList which will be used to store the employees and
 use enumeration/iterator to process the employees.
  II. Use a TreeSet Object to store employees on the basis of their EmpId and use enumeration/iterator to process employees.
 [Hint: Use Comparable interface] Write a Test Program to test that all functionalities are operational.
 */

class Employee
{
	
	
	int EmpId;
	String EmpName;
	String EmpEmail;
	char EmpGender;
	float EmpSalary;
	void Input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter EMP ID");
		int EmpId=sc.nextInt();
		System.out.println("Enter EMP NAME");
		String EmpName=sc.next();
		System.out.println("Enter EMP EMAIL");
		String EmpEmail=sc.nextLine();
		System.out.println("Enter EMP GENDER");
		char EmpGender = sc.next().charAt(0);
		System.out.println("Enter EMP SALARY");
		float EmpSalary=sc.nextFloat();
	}
	
	void GetEmployeeDetails()
	{
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(EmpEmail);
		System.out.println(EmpGender);
		System.out.println(EmpSalary);
	}
}


class EmployeeDB
{
	List<Employee> employeeBD = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e)
	{
		return employeeBD.add(e);
	}
	
	public boolean deleteEmployee(int empID)
	{
		boolean isRemoved = false;
		Iterator<Employee> it = employeeBD.iterator();
		
		while(it.hasNext())
		{
			Employee emp = it.next();
			//if(emp.getClass())
		}
		return isRemoved;
		
	}
	
	
}
public class Employeeapplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee e =new Employee();
		int n=sc.nextInt();
		for(int i=0 ;i<n;i++)
		{
		e.Input();
		e.GetEmployeeDetails();
		}

	}

}

