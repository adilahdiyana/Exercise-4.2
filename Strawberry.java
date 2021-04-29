package Exercise4_2;

public class Strawberry extends Fruit { //subclass for Fruit

	protected char export;
	protected String taste;
	
	public Strawberry() { //constructor for subclass
		super(); //inherit data, method from super class (constructor with no argument)
		export = '';
		taste = null;
	}
	
	public Strawberry(String name, char e, String t) { //constructor subclass with argument
		super(name); //called method in superclass with passing parameter
		export = e;
		taste = t;
		
		//name=strawberry, e=y, t=sour
		setInformation(name, e, t); //method for overloading
	}
	
	public void setInformation(String name, char e, String t) { //overloading for subclass with 3 parameters
		if(e == 'y')
			export = 'y';
		else if(export == 'n')
			export = 'n';
		else
			export = '';
		if(t != null)
			taste = t;
		else
			taste = null;
	}
	
	public char getExport() {
		return this.export;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public String toString() { //overriding method
		return "Type\t: " +  name + "\n" + "Export\t: " + export + "\n" + "Taste\t: " + taste;
	}
	
} //end for Strawberry class
			   

