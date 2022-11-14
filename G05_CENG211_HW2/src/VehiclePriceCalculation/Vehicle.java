package VehiclePriceCalculation;

public class Vehicle {
	
	private String vehicleId;
	private String montOfSale;
	private String cityOfSale;
	private int productionYear;
	private int vat;
	private double SCT;
	private double salesPrice;
	
	@Override
	public String toString() {
		return "[vehicleId=" + vehicleId + ", montOfSale=" + montOfSale + ", cityOfSale=" + cityOfSale
				+ ", productionYear=" + productionYear + ", vat=" + vat + ", SCT=" + SCT + ", \nTotalPrice"
						+ " paid for " + vehicleId + " is=" + salesPrice
				+ "]";
	}

	public Vehicle() {
	}
	
	public Vehicle(String vehicleId, String montOfSale, String cityOfSale,
			int productionYear, int vat, double SCT, double salesPrice) {

		this.vehicleId = vehicleId;
		this.montOfSale = montOfSale;
		this.cityOfSale = cityOfSale;
		this.productionYear = productionYear;
		this.vat = vat;
		this.SCT = SCT;
		this.salesPrice = salesPrice;
	}
	public double getSCT() {
		return SCT;
	}

	public void setSCT(double sCT) {
		SCT = sCT;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getVat() {
		return vat;
	}

	public String getVehicleId() {
		return vehicleId;
	}
	public String getMontOfSale() {
		return montOfSale;
	}
	public String getCityOfSale() {
		return cityOfSale;
	}
	public int getProductionYear() {
		return productionYear;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public void setMontOfSale(String montOfSale) {
		this.montOfSale = montOfSale;
	}

	public void setCityOfSale(String cityOfSale) {
		this.cityOfSale = cityOfSale;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}
	
	

}
