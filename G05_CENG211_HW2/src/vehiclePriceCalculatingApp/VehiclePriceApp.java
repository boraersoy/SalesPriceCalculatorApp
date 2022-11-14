package vehiclePriceCalculatingApp;


import FileIO.FileIO;
import VehiclePriceCalculation.SalesRecord;

public class VehiclePriceApp {

	public static void main(String[] args) {
		FileIO file = new FileIO(); 
		SalesRecord sales = new SalesRecord();
		file.transferSalesData("C:\\Users\\ersoy\\Downloads\\HW2_SoldVehicles.csv");
		sales.UserInteractionAndPrintingOutput();
		
	}

}
