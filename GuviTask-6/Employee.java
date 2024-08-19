package guvitaskjat6;

/*2. Create an implementation for a java class named Employee that, represents an employee with attributes including ID, name, and salary. 
  	 The class includes a method called raiseSalary(percent), which updates the salary by a specified percentage.
*/

public class Employee 
{
	//Declaring the Instance variable. 
	private String firstname;
	private String lastname;
	private int id;
	private int salary;
	
	//Constructor is created with parameter passed inside.
	Employee(String firstname,String lastname,int id,int salary)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.salary=salary;
	}
	
	//Method to get the employee firstname values.
	public String getFirstname()
	{
		return firstname;
	}
	
	//Method to get the employee lastname values.
	public String getLastname()
	{
		return lastname;
	}
	
	//Method to get the employee firstname and lastname together.
	public String getName()
	{
		 String name = firstname + " " + lastname;
		 return name;
	}
	//Method to get the employee ID values.
	public int getID()
	{
		return id;
	}
	
	//Method to get the employee salary values.
	public int getSalary()
	{
		return salary;
	}
	
	//Method to get the employee Annual salary and multiple by 12.
	public int getAnnualSalary()
	{
		return salary*12;
	}
	
	//Method to set salary for the employee
	public void setSalary(int salary)
	{
		this.salary= salary;
		
	}
	
	//Method to increase the salary by specific salary and return the new salary. 
	public void raisesalary(int percentage)
	{
		//IF condition we must pass the percentage above 0.
		if(percentage > 0)
		{
			//new percentage hike salary, stored in new variable raisesal.
			int raisesal = salary * percentage/100;
			
			//+= operator will add the salary and raisesal value and store in salary.
			salary += raisesal;
		}
		else
		{
			//If the percentage is 0 or less it should print this!
			System.out.println("Salary percent should be greater than Zero!");	
		}
			
		}
		
	//Method that returns the ID, name and salary of the emp.
	public String tostring() {
		
		return "Employee[id =" + id + ", Name = " + firstname +" "+ lastname + ", Salary = " + salary + "]";
		
	}
	
	//Main method program execution here.
	public static void main(String[] args) 
	{

		//Creating object and passed the constructor arguments.
		Employee emp =new Employee("Hari","Prasath", 247893, 23_000);
		
		//Invoking all the GET method to print constructor arguments.
		System.out.println("FirstName : " + emp.getFirstname());
		System.out.println("LastName  : " + emp.getLastname());
		System.out.println("Emp ID    : " + emp.getID());
		System.out.println("Salary    : " + emp.getSalary());
		
		//Outputing all the values in String type.
		System.out.println(emp.tostring());
		
		//Invoking the Annualsalary for constructor.
		System.out.println("Annual salary of the employee :" + emp.getAnnualSalary());
		
		System.out.println(); //Line
		
		//Invoking the SetSalary method to set new salary. 
		emp.setSalary(29_999);
		System.out.println("Newly set salary :" + emp.getSalary());
		
		//Invoking the Annualsalary for newly set salary.
		System.out.println("Newly assign Annual salary :" + emp.getAnnualSalary());
		
		//Increasing the salary precentage by 7%
		emp.raisesalary(7);
		System.out.println("Salary raised by 7% : " + emp.getSalary());
	
	
	}

}
