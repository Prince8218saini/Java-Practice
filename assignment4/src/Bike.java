
public class Bike extends Vehicle
{
	String bikeType;
	public Bike(String brand, String model, int year,String bikeType) 
	{
		super(brand, model, year);
		this.bikeType =bikeType;

	}

	public void startEngine() {
		System.out.println("Bike Engine is Started ");
	}

	public void displayInfo() {
		System.out.println("Bike Brand : " + this.brand);
		System.out.println("Bike Model : " + this.model);
		System.out.println("Bike Year : " + this.year);
		System.out.println("Bike Type is : " + this.bikeType);
	}

}
