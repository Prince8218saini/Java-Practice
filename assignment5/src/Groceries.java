
public class Groceries extends Product
{
	public Groceries(String name, double price)
	{
		super(name, price);
	}

	public double getDiscountedPrice() 
	{   
		return price;
	}
	void displayDetails() 
	{
	 System.out.println("Groceries: "+name+" | Price: " +price+" rupees");
	}
}
