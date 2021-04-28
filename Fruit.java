package Exercise4_2;

public class Fruit { //super class
	
	protected String name;
	
	public Fruit() { //constructor with no argument
		name = null; 
	}
	
	public Fruit(String name) { //constructor with argument
		
		//name = null;
		
		setInformation(name); //call method
	}
	
	public void setInformation(String name) { //overloading method with one parameter
		if(name != null)
			this.name = name;
		else
			this.name = null;
	}
	
	public String getName() {
		return name;
	}

	public String toString() { //overriding method
		return name + "constructor is invoked.";
	}

} //end for Fruit class
