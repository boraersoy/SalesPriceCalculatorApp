package VehiclePriceCalculation;

import java.util.ArrayList;
import java.util.Scanner;

import FileIO.FileIO;

public class SalesRecord {
	//bunlar static olunca nedense ulaþýlabiliyo
	private static ArrayList<Bicycle> bicycleArray = new ArrayList<Bicycle>();
	private static ArrayList<PickupTruck> pickUpTruckArray = new ArrayList<PickupTruck>();
	private static ArrayList<Hatchback> hatchbackArray = new ArrayList<Hatchback>();
	private static ArrayList<Sedan> SedanArray = new ArrayList<Sedan>();
	private static ArrayList<Minivan> MinivanArray = new ArrayList<Minivan>();
	private FileIO file = new FileIO();
	
	private void calculateBicycleSCTandPrice(Bicycle bicycle)
 {
		double MonthOfValue = 0;
		double ValueOfChain = 0;
		double ValueOfSeatPost = 0;
		
		
			if(bicycle.getMontOfSale().equals("January")) {
				MonthOfValue = 0.3;
				
			}
			else if(bicycle.getMontOfSale().equals("May")) {
				MonthOfValue = 0.4;
				
			}
			else if(bicycle.getMontOfSale().equals("August")) {
				MonthOfValue = 0.5;
				
			}
			else if(bicycle.getMontOfSale().equals("October")) {
				MonthOfValue = 0.6;
				
			}
			else if(bicycle.getMontOfSale().equals("December")) {
				MonthOfValue = 0.7;
				
			}
			if(bicycle.getChainType().equals("derailleur")) {
				ValueOfChain = 1.1;
			}
			else if(bicycle.getChainType().equals("onechain")) {
				ValueOfChain = 1.2;
			}
			else if(bicycle.getChainType().equals("doublechain")) {
				ValueOfChain = 1.3;
			}
			if(bicycle.getSeatPost().equals("carbonfiber")) {
				 ValueOfSeatPost = 0.8;
			}
			else if(bicycle.getSeatPost().equals("steel")) {
				 ValueOfSeatPost = 0.7;
			}
			else if(bicycle.getSeatPost().equals("aluminium")) {
				 ValueOfSeatPost = 0.9;
			}
			else if(bicycle.getSeatPost().equals("titanium")) {
				 ValueOfSeatPost = 0.6;
			}
			double SCT = (ValueOfSeatPost * ValueOfChain * 0.1) + MonthOfValue;
			bicycle.setSCT(SCT);
			double SalesPrice = (10000 *0.9) * (1 + SCT ) + (1 + bicycle.getVat()/100);
			bicycle.setSalesPrice(SalesPrice);
		}
	
	private void calculateSedanSCTAndPrice(Sedan sedan)
	{
		double engineVolume = sedan.getEngineVolume();
		double roofType = 0;
		double ValueOfYear = 0;
		double SCT = 0;
		if (sedan.getRoofType().equals("regular")) {
			roofType = 0.5;
		}
		else if (sedan.getRoofType().equals("moonroof")) {
			roofType = 0.6;
		}
		else if (sedan.getRoofType().equals("sunroof")) {
			roofType = 0.8;
		}
		
		 if ((sedan.getProductionYear() <= 2008) && (sedan.getProductionYear() >= 2001)) {
			ValueOfYear = 1.0;
		}
		else if((sedan.getProductionYear() <= 2017) && (sedan.getProductionYear() >= 2012)) {
			ValueOfYear = 1.2;
		}
		else if(sedan.getProductionYear() >= 2018 && sedan.getProductionYear() <= 2022) {
			ValueOfYear = 1.6;
		}
		SCT = (engineVolume * 0.2 * roofType) / ValueOfYear;
		double SalesPrice = 200000 * (1 + SCT + 0.8) + (1 + sedan.getVat()/100);
		
		sedan.setSCT(SCT);
		sedan.setSalesPrice(SalesPrice);
	}

	private void calculateHatchbackSCTandPrice(Hatchback _hatchback)
	{
		double engineVolume = _hatchback.getEngineVolume();
		double productionYearValue = 0;
		double cityModeValue = 0;
		int productionYear = _hatchback.getProductionYear();
		String cityMode = _hatchback.getCityMode();
		
		if (cityMode.equals("yes")) {
			cityModeValue = 0.15;
		}
		else {
			cityModeValue = 0.1;
		}
		 if ((productionYear <= 2008) && (productionYear >= 2001)) {
			 productionYearValue = 1.0;
			}
			else if((productionYear <= 2017) && (productionYear >= 2012)) {
				productionYearValue = 1.2;
			}
			else if(productionYear >= 2018 && productionYear <= 2022) {
				productionYearValue = 1.6;
			}
		double SCT = (engineVolume * 0.3 * productionYearValue) + cityModeValue;
		double SalesPrice = 200000 * (1 + SCT * 0.8) + (1 + _hatchback.getVat()/100);
		_hatchback.setSCT(SCT);
		_hatchback.setSalesPrice(SalesPrice);	
	}

	private void calculateMinivanSCTandPrice(Minivan _minivan)
	{
		double engineVolume = _minivan.getEngineVolume();
		int numberOfSeats = _minivan.getNumberOfSeats();
		int productionYear = _minivan.getProductionYear();
		double numberOfSeatsValue = 0;
		double productionYearValue = 0;
		if (numberOfSeats == 4) {
			numberOfSeatsValue = 0.1;
		}
		else if(numberOfSeats == 5) {
			numberOfSeatsValue = 0.4;
		}
		else if(numberOfSeats == 6) {
			numberOfSeatsValue = 0.6;
		}
		else {
			numberOfSeatsValue = 0.8;
		}
		if ((productionYear <= 2008) && (productionYear >= 2001)) {
			 productionYearValue = 1.0;
			}
			else if((productionYear <= 2017) && (productionYear >= 2012)) {
				productionYearValue = 1.2;
			}
			else if(productionYear >= 2018 && productionYear <= 2022) {
				productionYearValue = 1.6;
			}
		
		double SCT = (0.6 * productionYearValue)/(engineVolume + numberOfSeatsValue);
		double SalesPrice = 2000 * (1 + SCT * 0.8) + (1 + _minivan.getVat()/100);
		_minivan.setSCT(SCT);
		_minivan.setSalesPrice(SalesPrice);
	}

	private void calculatePickUpTruckSCTandPrice(PickupTruck _pickupTruck)
	{
		String truckBedType = _pickupTruck.getTruckBedType();
		int productionYear = _pickupTruck.getProductionYear();
		String cabType = _pickupTruck.getCabType();
		double TruckBedValue = 0;
		double productionYearValue = 0;
		double cabTypeValue = 0;
		if (cabType.equals("regular")) {
			cabTypeValue = 2.5;
		}
		else if(cabType.equals("extended")) {
			cabTypeValue = 2.8;
		}
		else {
			cabTypeValue = 3;
		}
		if(truckBedType.equals("regular")) {
			TruckBedValue = 0.5;
		}
		else if(truckBedType.equals("tanker")) {
			TruckBedValue = 0.8;
		}
		else {
			TruckBedValue = 1.0;
		}
		if ((productionYear <= 2008) && (productionYear >= 2001)) {
			 productionYearValue = 1.0;
			}
			else if((productionYear <= 2017) && (productionYear >= 2012)) {
				productionYearValue = 1.2;
			}
			else if(productionYear >= 2018 && productionYear <= 2022) {
				productionYearValue = 1.6;
			}
		double SCT = (TruckBedValue * productionYearValue)/(cabTypeValue);
		double SalesPrice = (250000 * 0.9) + (1 + SCT) + (1 + _pickupTruck.getVat()/100);
		
		_pickupTruck.setSCT(SCT);
		_pickupTruck.setSalesPrice(SalesPrice);
	}

	

	public ArrayList<Bicycle> getBicycleArray() {
		return bicycleArray;
	}

	public void setBicycleArray(ArrayList<Bicycle> bicycleArray1)
	{
		for (int i = 0; i < bicycleArray1.size(); i++) {
			calculateBicycleSCTandPrice(bicycleArray1.get(i));
			bicycleArray.add(bicycleArray1.get(i));
		}
	}

	public ArrayList<PickupTruck> getPickUpTruckArray() {
		return pickUpTruckArray;
	}

	public void setPickUpTruckArray(ArrayList<PickupTruck> _pickUpTruckArray) {
		for (int i = 0; i < _pickUpTruckArray.size(); i++) {
			calculatePickUpTruckSCTandPrice(_pickUpTruckArray.get(i));
			pickUpTruckArray.add(_pickUpTruckArray.get(i));
		}
		}

	public ArrayList<Hatchback> getHatchbackArray() {
		return hatchbackArray;
	}

	public void setHatchbackArray(ArrayList<Hatchback> _hatchbackArray) {
		for (int i = 0; i < _hatchbackArray.size(); i++) {
			calculateHatchbackSCTandPrice(_hatchbackArray.get(i));
			hatchbackArray.add(_hatchbackArray.get(i));
		}	}

	public ArrayList<Sedan> getSedanArray() {
		return SedanArray;
	}

	public void setSedanArray(ArrayList<Sedan> _sedanArray) {
		for (int i = 0; i < _sedanArray.size(); i++) {
			calculateSedanSCTAndPrice(_sedanArray.get(i));
			SedanArray.add(_sedanArray.get(i));
		}
	}

	public ArrayList<Minivan> getMinivanArray() {
		return MinivanArray;
	}

	public void setMinivanArray(ArrayList<Minivan> _minivanArray) {
		for (int i = 0; i < _minivanArray.size(); i++) {
			calculateMinivanSCTandPrice(_minivanArray.get(i));
			MinivanArray.add(_minivanArray.get(i));
		}	}
	private void printSoldVehicles() {
		for(int i = 0; i<bicycleArray.size(); i++) {
			System.out.println(bicycleArray.get(i));
		}
		for(int i = 0; i<MinivanArray.size(); i++) {
			System.out.println(MinivanArray.get(i));
		}
		for(int i = 0; i<hatchbackArray.size(); i++) {
			System.out.println(hatchbackArray.get(i));
		}
		for(int i = 0; i<pickUpTruckArray.size(); i++) {
			System.out.println(pickUpTruckArray.get(i));
		}
		for(int i = 0; i<SedanArray.size(); i++) {
			System.out.println(SedanArray.get(i));
		}
		
	}
	private void printSoldMinivan() {
		for(int i = 0; i<MinivanArray.size(); i++) {
			System.out.println(MinivanArray.get(i));
		}
	}
	private void printSoldSedan() {
		for(int i = 0; i<SedanArray.size(); i++) {
			System.out.println(SedanArray.get(i));
		}
	}
	private void printSoldPickupTruck() {
		for(int i = 0; i<pickUpTruckArray.size(); i++) {
			System.out.println(pickUpTruckArray.get(i));
		}
	}
	private void printSoldHatchback() {
		for(int i = 0; i<hatchbackArray.size(); i++) {
			System.out.println(hatchbackArray.get(i));
		}
	}
	private void printSoldBicycles() {
		for(int i = 0; i<bicycleArray.size(); i++) {
			System.out.println(bicycleArray.get(i));
		}
	}
	public void UserInteractionAndPrintingOutput() {
		printMessage();
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
			if (input == 1) {
				printSoldVehicles();
			}
			else if(input == 2) {
				printSoldSedan();
			}
			else if(input == 3) {
				printSoldHatchback();
			}
			else if(input == 4) {
				printSoldMinivan();
			}
			else if(input == 5) {
				printSoldPickupTruck();
			}
			else if(input == 6) {
				printSoldBicycles();
			}
			
		
		
		
	}
	private void printMessage() {
		System.out.println("**********************************");
		System.out.println("Please press,");
		System.out.println("1 to see all sold vehicles list");
		System.out.println("2 to see sold sedan list");
		System.out.println("3 to see sold hatchback list");
		System.out.println("4 to see sold minivan list");
		System.out.println("5 to see sold pickup truck list");
		System.out.println("6 to see bicycle list");
	}

}
	
	

