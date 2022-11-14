package VehiclePriceCalculation;

public class Hatchback extends Vehicle {
	private String cityMode;
	private double engineVolume;
	
	
	
	public Hatchback(String vehicleId, String montOfSale,
    		String cityOfSale, 
    		int productionYear, 
    		 String cityMode, double engineVolume, int vat, double SCT ,double SalesPrice) {
		super(vehicleId, montOfSale, cityOfSale, productionYear, vat, SCT, SalesPrice);
		this.cityMode = cityMode;
		this.engineVolume = engineVolume;
	}



	public Hatchback() {
		super();
		cityMode = "no";
		engineVolume = 0.0;
	}



	public String getCityMode() {
		return cityMode;
	}



	public void setCityMode(String cityMode) {
		this.cityMode = cityMode;
	}



	public double getEngineVolume() {
		return engineVolume;
	}



	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}



	@Override
	public String toString() {
		return "Hatchback [cityMode=" + cityMode + ", engineVolume=" + engineVolume + ", " + super.toString()
				+ "]";
	}



	
	 
	
	

}
