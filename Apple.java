package Exercise4_2;

public class Apple extends Fruit { //subclass for Fruit
	
	protected double price;
	protected int quantity;
	
	public Apple() { //constructor for subclass
		super(); //inherit data, method from super class (constructor with no argument)
		price = 0; //declare
		quantity = 0;
	}

	public Apple(String name, double p, int q) { //constructor subclass with argument
		super(name); //called method in superclass with passing parameter
		price = p;
		quantity = q;
		
		//name=apple, p=13.50, q=5
		setInformation(name, p, q); //method for overloading
    }
	
	public void setInformation(String name, double p, int q) { //overloading for subclass with 3 parameters
		if(q != 0)
			quantity = q;
		else
			quantity = 0;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalPrice() {
		return getPrice()*getQuantity();
	}

	public double getDiscount() {
		return totalPrice()*0.1;
	}
	
	public double totalPayment() {
		return totalPrice()-getDiscount();
	}
	
	public String toString() { //overriding method
		return 	"Type\t: " +  name + "\n" + "Price\t: RM " + price + "\n" + "Quantity\t: " + quantity + "\n" + "Total Price\t: RM " + totalPrice() + "\n" + "Discount\t: RM " + getDiscount() + "\n" + "Total Payment\t: RM " + totalPayment();
	}
	
} //end for Apple class
