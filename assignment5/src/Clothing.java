public class Clothing extends Product
{

	public Clothing(String name, double price)
	{
		super(name, price);
	}

	public double getDiscountedPrice() 
	{   
		
		return price-(price*0.10);
	}

	void displayDetails() 
	{
	 System.out.println("Clothing: "+name+" | Price: " +price+" rupees");
	}
	
}
