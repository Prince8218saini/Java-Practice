
public class Car extends Vehicle
{
	int numDoors;
	public Car(String brand, String model, int year,int numDoors) 
	{  
		super(brand, model, year);
		 this.numDoors=numDoors;

	}

	public void startEngine() 
	{
		System.out.println("Car Engine is Started");
	}
	public void displayInfo()
	{
	  	System.out.println("Car Brand : "+this.brand);
	  	System.out.println("Car Model : "+this.model);
	  	System.out.println("Car Year : "+this.year);
	  	System.out.println("Car number of doors : "+this.numDoors);
	}
	
}
