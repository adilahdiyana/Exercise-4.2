package Exercise4_2;

public class Manggo extends Fruit { //subclass for Fruit
	
	protected String size;
	protected double calories;
	
	public Manggo() { //constructor for subclass
		super(); //inherit data, method from super class (constructor with no argument)
		size = null;
		calories = 0;
	}
	
	public Manggo(String name, String s, double c) { //constructor subclass with argument
		super(name); //called method in superclass with passing parameter
		size = s;
		calories = c;
		
		//name=manggo, s=big, c= 15.6
		setInformation(name, s, c); //method for overloading
	}
	
	public void setInformation(String name, String s, double c) { //overloading for subclass with 3 parameters
		if(s != null)
			size = s;
		else
			size = null;
		if(c <= 0)
			calories = c;
		else
			calories = 0;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public double getCalories() {
		return this.calories;
	}
	
	public String toString() { //overriding method
		return "Type\t: " +  name + "\n" + "Size\t: " + size + "\n" + "Calories\t: " + calories + "kcal";
	}
	
} //end for Manggo class
			   
