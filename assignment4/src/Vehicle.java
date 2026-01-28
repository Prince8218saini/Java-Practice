
public abstract class Vehicle {
	String brand;
	String model;
	int year;

	public Vehicle(String brand , String model,int year) 
  {
	  this.brand=brand;
	  this.model=model;
	  this.year=year;
  }
	abstract void  startEngine();
	abstract void  displayInfo();
	public int calculateAge(int currentYear) 
	{
		return currentYear-year;
	}
	
}
