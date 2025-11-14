import java.util.Scanner;
public class TestService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add Data.");
			System.out.println("2.Display Data.");
			System.out.println("3.Search by id.");
			System.out.println("4.Search by name.");
			System.out.println("5.Update Data.");
			System.out.println("6.Exit.");
			
			
			System.out.println("Enter Choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: boolean status = VehicleService.addNewVehicle();
			if(status) {
				System.out.println("Data Successfully Added.");
			}
			else {
				System.out.println("Error:Data coud not be Added.");
			}
			break;
			
			case 2:VehicleService.displayAllData();
			break;
			
			case 3:System.out.println("Enter id:");
			int id = sc.nextInt();
			Vehicle v = VehicleService.findById(id);
			if(v !=null) {
				System.out.println(v);
			}
			else {
				System.out.println("Data Not Found");
			}
			break;
			
			case 4:System.out.println("Enter name:");
			String name = sc.next();
			Vehicle [ ]vc1= VehicleService.findByName(name);
			if(vc1 !=null) {
				System.out.println(vc1);
			}
			else {
				System.out.println("Data Not Found");
			}
			break;
			
			case 5:System.out.println("Enter id");
			id = sc.nextInt();
			System.out.println("Enter Vehicle Type");
			String vTypee = sc.next();
			status =VehicleService.updateVtype(id,vTypee);
			if(status) {
				System.out.println("Data Updated.");
			}
			else {
				System.out.println("Error:Data coud not be Updated.");
			}
			
			break;
			
			
			case 6:System.out.println("Thank you.");
			break;
			
			default :System.out.println("Wrong Choice.");
			break;
			}
		}while(choice!=6);

	}

}
