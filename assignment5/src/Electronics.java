public class Electronics extends Product
{

	public Electronics(String name, double price)
	{
		super(name, price);
	}

	public double getDiscountedPrice() 
	{   
		
		return price-(price*0.05);
	}
	void displayDetails() 
	{
	 System.out.println("Electronics: "+name+" | Price: " +price+" rupees");
	}
   
}
