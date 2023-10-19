//2.7 create tester class....create array to store 10 vechile...create menu driven program 
//1:show all 2:add vehicle...3:edit color 4:edit price 5:remove 
//

package Tester;
import Codes.Vehicle;
import java.util.Scanner;
public class VehicleTester {

	public static void main(String[] args) {
		Vehicle arr[] = new Vehicle[10];
		int index=0;
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("1:Show all Vehicle \n2:Add New vehicle\n3:Edit Vehicle color \n4:Edit Vehicle price \n5:Remove Vehicle \n6.Exit");
	 int choice;
	do
	 {
		 System.out.print("\n Enter your choice ");
		 choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:{
			      for(Vehicle v : arr)
			      {
			    	  if(v != null)
			    		  System.out.println(v);
			      }
			      break;
		         }
		 case 2:{
			      System.out.println("Enter Vehcile ID ,Name, Color and Price");
			       Vehicle v = new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			       arr[index++]=v;
			       break;
		        }
		 case 3:{
			      System.out.println("Enter new color ");
			      String color = sc.next();
			      System.out.println("Enter Vehcile ID ");
			      int id = sc.nextInt();
			      boolean status = false;
			      for(Vehicle v : arr)
			      {
			    	  if(v.getId()==id)
			    	  {
			    		  status = true;
			    		  v.setColor(color);
			    		  break;
			    	  }
			      }
			      if(status)
			    	  System.out.println("Color Edited Successfully.");
			      else
			    	  System.out.println("Vehicle ID does not Exists");
			      break;
		        }
		 case 4:{
			     System.out.println("Enter new price ");
		         double price = sc.nextDouble();
		         System.out.println("Enter Vehcile ID ");
		         int id = sc.nextInt();
		         boolean status = false;
		         for(Vehicle v : arr)
		         {
		        	 if(v.getId()==id)
		        	 {
		    		  status = true;
		    		  v.setPrice(price);
		    		  break;
		        	 }
		         }
		         if(status)
		        	 System.out.println("Price Edited Successfully.");
		         else
		        	 System.out.println("Vehicle ID does not Exists");
		         break;
		        }
		 case 5:{
			 	System.out.println("Enter Vehcile ID ");
			 	int id = sc.nextInt();
			 	boolean status = false;
			 	for(Vehicle v : arr)
			 	{
			 		if(v.getId()==id)
			 		{
			 			status = true;
			 			v=null;
			 			break;
			 		}
			 	}
			 		if(status)
			 			System.out.println("Vehicle removed Successfully.");
			 		else
			 			System.out.println("Vehicle ID does not Exists");
			       break;
		        }
		 case 6: break;
			 default : System.out.println("Invalid Input");
			           break;
		 }
	 }
	 while(choice != 6);
	}

}
