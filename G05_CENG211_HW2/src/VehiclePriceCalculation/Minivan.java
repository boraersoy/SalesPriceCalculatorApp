package VehiclePriceCalculation;

public class Minivan extends Vehicle {
	private int numberOfSeats;
	private double engineVolume;
	
	@Override
	public String toString() {
		return "Minivan [numberOfSeats=" + numberOfSeats + ", engineVolume=" + engineVolume + ", "
				+ super.toString() + "]";
	}
	public Minivan(String vehicleId, String montOfSale,
    		String cityOfSale, 
    		int productionYear,int numberOfSeats, double engineVolume, int vat
    		, double SCT ,double SalesPrice) {
		super(vehicleId, montOfSale, cityOfSale, productionYear, vat, SCT, SalesPrice);
		this.numberOfSeats = numberOfSeats;
		this.engineVolume = engineVolume;
	}
	public Minivan() {
		super();
		numberOfSeats = 4;
		engineVolume = 0;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public double getEngineVolume() {
		return engineVolume;
	}
	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}
	
		
	

}
