package VehiclePriceCalculation;

public class PickupTruck extends Vehicle {
	private String cabType;
	private String truckBedType;
	public PickupTruck(String vehicleId, String montOfSale, String cityOfSale, int productionYear, 
			String cabType, String truckBedType, int vat
			, double SCT ,double SalesPrice) {
		super(vehicleId, montOfSale, cityOfSale, productionYear, vat, SCT, SalesPrice);
		this.cabType = cabType;
		this.truckBedType = truckBedType;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public String getTruckBedType() {
		return truckBedType;
	}
	public void setTruckBedType(String truckBedType) {
		this.truckBedType = truckBedType;
	}
	@Override
	public String toString() {
		return "PickupTruck [cabType=" + cabType + ", truckBedType=" + truckBedType + ", " + super.toString()
				+ "]";
	}
	
	
	
	

}
