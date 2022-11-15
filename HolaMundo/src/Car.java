
public class Car {

	private double milesDriven;
	private double gasInTank;
	private double milesPerGallon;
	
	public Car(double mpg) {
		milesDriven = 0;
		gasInTank = 0;
		milesPerGallon = mpg;
	}
	
	
	public void drive(double distance) {
		this.milesDriven = this.milesDriven + distance;
		double gasConsumed = distance / this.milesPerGallon;
		this.gasInTank = this.gasInTank - gasConsumed;
	}
	
	public void addGas(double amount) {
		this.gasInTank += amount;
	}
	
	
	public static void main(String[] args) {
		
	}

}
