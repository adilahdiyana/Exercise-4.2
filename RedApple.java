package Exercise4_2;

public class RedApple extends Apple { //subclass for Apple
	
	protected double vitc;
	protected double sugar;
	
	public RedApple() { //constructor for subclass
		super(); //inherit data, method from super class (constructor with no argument)
		vitc = 0;
		sugar = 0;
	}
	
	public RedApple(String name, double p, int q, double v, double u) { //constructor subclass with argument
		super(name, p, q); //called method in superclass with passing parameter
		vitc = v;
		sugar = u;
		
		//name=red apple, p=20.30, q=10, v=56.34, s=21.0
		setInformation(name, p, q, v, u); //method for overloading
	}
	
	public void setInformation(String name, double p, int q, double v, double u) { //overloading
		if(v <= 0);
			vitc = v;
		else
			vitc = 0;
		if(u >= 0)
			sugar = u;
		else
			sugar = 0;
	}
	
	public double getVitc() {
		return this.vitc;
	}
	
	public double getSugar() {
		return this.sugar;
	}
	
	public double totalVitc() {
		return super.getQuantity()*this.vitc;
	}
	
	public String toString() { //overriding method
		return "Type\t: " +  name + "\n" + "Price\t: RM " + price + "\n" + "Quantity\t: " + quantity + "\n" + "Vitamin c\t: " + vitc + "mg" + "\n" + "Sugar\t: " + sugar + "g" + "\n" + "Total vitamin c: " + totalVitc() + "mg";
	}
	
} //end for Red Apple class
			   


