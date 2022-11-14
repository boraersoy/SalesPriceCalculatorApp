package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import VehiclePriceCalculation.*;



public class FileIO {
		
	private  String line = "";  
	private  String splitBy = ",";
	

		
	public void transferSalesData(String fileName) //reads data from csv file and creates salesRecord objects
		{
			try   
			{  
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			br.readLine(); // skipping the header
			ArrayList<Bicycle> bicycleArray = new ArrayList<Bicycle>(); 
			ArrayList<PickupTruck> pickUpTruckArray = new ArrayList<PickupTruck>();
			ArrayList<Hatchback> hatchbackArray = new ArrayList<Hatchback>();
			ArrayList<Sedan> SedanArray = new ArrayList<Sedan>();
			ArrayList<Minivan> MinivanArray = new ArrayList<Minivan>();
			SalesRecord sales = new SalesRecord();
			while ((line = br.readLine()) != null)   
			{ 
 			String[] rows = line.split(splitBy); 
 			;

			if ((rows[0]).substring(0, 1).equals("B")) {
				
				Bicycle bicycle = new Bicycle(rows[0], rows[1], rows[2], Integer.parseInt(rows[3])
						, rows[4], rows[5], Integer.parseInt(rows[6]), 0, 0);
				bicycleArray.add(bicycle);
			}
			else if ((rows[0].substring(0, 1).equals("P"))) {
				PickupTruck pickUpTruck = new PickupTruck(rows[0], rows[1], rows[2], Integer.parseInt(rows[3])
						, rows[4], rows[5], Integer.parseInt(rows[6]), 0, 0) ;
				pickUpTruckArray.add(pickUpTruck);
			}
			else if ((rows[0].substring(0, 1).equals("H"))) {
				Hatchback hatchback = new Hatchback(rows[0], rows[1], rows[2], Integer.parseInt(rows[3])
						, rows[4], Double.parseDouble(rows[5]), Integer.parseInt(rows[6]), 0, 0 ) ;
				hatchbackArray.add(hatchback);
			}
			else if ((rows[0].substring(0, 1).equals("S"))) {
				Sedan sedan = new Sedan(rows[0], rows[1], rows[2], Integer.parseInt(rows[3])
						, rows[4], Double.parseDouble(rows[5]), Integer.parseInt(rows[6]), 0, 0) ;
				SedanArray.add(sedan);
			}
			else if ((rows[0].substring(0, 1).equals("M"))) {
				Minivan minivan = new Minivan(rows[0], rows[1], rows[2], Integer.parseInt(rows[3])
						, Integer.parseInt(rows[4]), Double.parseDouble(rows[5]), Integer.parseInt(rows[6]), 0 , 0) ;
				MinivanArray.add(minivan);
			}
			
			}
			sales.setBicycleArray(bicycleArray);
			sales.setHatchbackArray(hatchbackArray);
			sales.setMinivanArray(MinivanArray);
			sales.setPickUpTruckArray(pickUpTruckArray);
			sales.setSedanArray(SedanArray);
			br.close();

			}
			catch (IOException e)   
			{  
			e.printStackTrace();
			}
		}



	


	
		
}
