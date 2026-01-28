
public class VehicleTest
{
	public static void main(String[] args) 
	{
		Vehicle v1 = new Car("Mahindra", "N-200", 2005, 4);
		Vehicle v2 = new Bike("Rider", "R-2", 2016, "Sport");
		Vehicle v3 = new Truck("Tata", "T-Series", 2018, 23456);
		Vehicle[] arr = { v1, v2, v3 };
		for (Vehicle vehicle : arr) {
			vehicle.startEngine();
			vehicle.displayInfo();
			System.out.println("Age is: " + vehicle.calculateAge(2025) + "\n\n");
		}

	}
}
