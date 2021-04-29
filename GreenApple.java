package Exercise4_2;

public class GreenApple extends Apple { //subclass for Apple
	
	protected double weight;
	protected String brand;
	
	public GreenApple() { //constructor for subclass
		super(); //inherit data, method from super class (constructor with no argument)
		weight = 0;
		brand = null;
	}
	
	public GreenApple(String name, double p, int q, double w, String b) { //constructor subclass with argument
		super(name, p, q); //called method in superclass with passing parameter
		weight = w;
		brand = b;
		
		//name=green apple, p=12.50, q=4, w=0.89, b=india
		setInformation(name, p, q, w, b); //method for overloading
	}
	
	public void setInformation(String name, double p, int q, double w, String b) { //overloading
		if(b != null)
			brand = b;
		else
			brand = null;
		if(w <= 0)
			weight = w;
		else
			weight = 0;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public double totalWeight() {
		return super.getQuantity()*this.weight;
	}
	
	public String toString() { //overriding method
		return "Type\t: " +  name + "\n" + "Price\t: RM " + price + "Quantity\t: " + quantity + "Weight\t: " + weight + "kg" + "\n" + "Brand\t: " + brand + "\n" + "Total weight: " + totalWeight() + "kg";
	}
	
} //end for Green Apple class
			   
