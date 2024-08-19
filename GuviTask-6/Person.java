package guvitaskjat6;

//1. Create a class called "Person" with attributes "name" and "age". Also create a constructor

public class Person 
{
	//Declared an instance variables with private keyword this always to use the getter and setter methods.
	//Private keyword is an access modifier whichever variable or method is given as private it can only access within the class not outside class or method.
	
	private String name;
	private int age;
	
	//We are creating the parameterized constructor to pass value while creating object.
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		
	}
	//Declaring getter method to print the constructor value of name.
	public String getName()
	{
		return name; 
	}
	
	//Declaring getter method to print the constructor value of age.
	public int getAge()
	{
		return age;
	}
	
	//By using setter method we are creating the new name and age for the object.
	public void setName(String name)
	{
		this.name=name;
		
		//Checking the condition when we pass the values in new setName method, if condtion true
		if(name == null || name.isEmpty())
		{
			System.out.println("Empty and Null values are not allowed to pass in method!"); // This will get printed
		}
		
	}	
	
	//By using setter method we are creating the new name and age for the object.
	public void setAge(int age) 
	{
		this.age= age;
		
		//Checking the condition when we pass the integer values in new setAge method, if condtion true
		if(age<=0)
		{
			System.out.println("Enter the valid age of the person!"); // This will get printed
			
		}
	}
		
	
	public static void main(String[] args) {

		//Declared Object with name data and passed the value to the constructor.
		Person data =new Person("John Dao", 27);
		
		//Print the person name which is passed using constructor.
		System.out.println("Name of the person : " + data.getName());
		//Print the person name which is passed using constructor.
		System.out.println("Age of the person  : " + data.getAge());
	
		//Passing new values to setName and setAge methods.
		data.setName("Alexander");
		data.setAge(30);
		
		System.out.println("***********************************************"); //Just for visibility purpose.
		
		//Printing the newly passed values in the console using getName and getAge method which is already created. 
		
		System.out.println("New Name of the person : " + data.getName());
		System.out.println("New Age of the person  : " + data.getAge());
	}

}
