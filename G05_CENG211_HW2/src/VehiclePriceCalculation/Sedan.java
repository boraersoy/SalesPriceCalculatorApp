package VehiclePriceCalculation;

public class Sedan extends Vehicle {

	private String roofType;
	private double engineVolume;
	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sedan(String vehicleId, String montOfSale, String cityOfSale, 
			int productionYear,String roofType, double engineVolume, int vat
			, double SCT ,double SalesPrice) {
		super(vehicleId, montOfSale, cityOfSale, productionYear, vat, SCT , SalesPrice);
		this.roofType = roofType;
		this.engineVolume = engineVolume;
		
		// TODO Auto-generated constructor stub
	}
	public String getRoofType() {
		return roofType;
	}
	public double getEngineVolume() {
		return engineVolume;
	}
	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}
	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}
	@Override
	public String toString() {
		return "Sedan [roofType=" + roofType + ", engineVolume=" + engineVolume + ", " + super.toString()
				+ "]";
	}
	
	
	
	

}
