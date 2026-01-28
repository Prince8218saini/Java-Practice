
public abstract class Product implements Discountable
{
  String name;
  double price;
  public Product(String name,double price)
  {
	  this.name=name;
	  this.price=price;
  }
  abstract void displayDetails();
  public String getName() 
  {
		return name;
	}

	public double getPrice()
	{
		return price;
	}
}
