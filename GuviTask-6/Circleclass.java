package guvitaskjat6;

// 3. Create a class circle class with radius as data member. Create two constructors (no argument, and two arguments) and a method to calculate Circumference.

public class Circleclass {

	//Initialized the radius variable as private 
	private double radius;
	
	//created a Default constructor and declare the integer value.
	public Circleclass()
	{
		this.radius = 5.0;
	}
	
	//Parameterized constructor in which we are passed two arugments
	//String circle variable is the dummy argument we have passed.
	public Circleclass(double radius, String circle)
	{
		this.radius = radius;
		
	}
	
	//Method to calculate the circumference of the circle 
	public double calculateCircumference()
	{
		//Circumference of the circle = 2 x π x R
		//Where Math.PI represents the pi (π) value in java, which is present in java.lang.math package. 
		
		return 2 * Math.PI * this.radius; 
		
	}
	
	//Main method
	public static void main(String[] args) 
	{
		//Initialize the object for class as circle
		//Calculating the circle cirumference by default constructor.
		Circleclass circle = new Circleclass();
		
		//Printing the output in the console.
		System.out.println("The Circumference of the circle is : " + circle.calculateCircumference());
		
		//Initialize the another object for class as circles
		//Calculating the circle cirumference by parameterized constructor.
		Circleclass circles = new Circleclass(10, " ");
		
		//Printing the output in the console.
		System.out.println("The Circumference of the circle is : " + circles.calculateCircumference());
		
			
	}

}
