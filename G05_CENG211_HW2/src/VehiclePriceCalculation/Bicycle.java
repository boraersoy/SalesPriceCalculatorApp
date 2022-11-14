package VehiclePriceCalculation;

	public class Bicycle extends Vehicle {
	    private String chainType;
	    private String seatPost;

	    public Bicycle(String vehicleId, String montOfSale,
	    		String cityOfSale, 
	    		int productionYear, 
	    		 String chainType, String seatPost, int vat
	    		 , double SCT ,double SalesPrice) {
	        super(vehicleId, montOfSale, cityOfSale, productionYear, vat, SCT, SalesPrice);
	        this.chainType = chainType;
	        this.seatPost = seatPost;
	    }

		public String getChainType() {
			return chainType;
		}

		public void setChainType(String chainType) {
			this.chainType = chainType;
		}

		public String getSeatPost() {
			return seatPost;
		}

		public void setSeatPost(String seatPost) {
			this.seatPost = seatPost;
		}

		@Override
		public String toString() {
			return "Bicycle [chainType=" + chainType + ", seatPost=" + seatPost + ", " + super.toString()
					+ "]";
		}
	    




	}	


