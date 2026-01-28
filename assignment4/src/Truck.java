
public class Truck extends Vehicle
{
	double maxLoadCapacity;
	public Truck(String brand, String model, int year,double maxLoadCapacity) 
	{  
		super(brand, model, year);
		 this.maxLoadCapacity=maxLoadCapacity;

	}

	public void startEngine() 
	{
		System.out.println("Truck Engine is Started Running");
	}
	public void displayInfo()
	{
	  	System.out.println("Truck Brand : "+this.brand);
	  	System.out.println("Truck Model : "+this.model);
	  	System.out.println("Truck Year : "+this.year);
	  	System.out.println("Truck MaxLoadCapacity : "+this.maxLoadCapacity);
	}
	
}
