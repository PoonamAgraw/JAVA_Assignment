import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class VehicleService {
static Vehicle [] v1;
static int cnt;
static {
	v1=new Vehicle[100];
	v1[0]=new Vehicle(12,"Raju","2Wheeler",new Date(2023-9-07));
	
}
public static boolean addNewVehicle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Id:");
	int vid =sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Owner Name:");
	String vname=sc.nextLine();
	System.out.println("Enter Type of Vehicle:");
	String vtype=sc.nextLine();
	System.out.println("Enter Date of Purchase:");
	String dpurchase=sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date bd = null;
	try {
		bd = (Date) sdf.parse(dpurchase);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

Vehicle v=new Vehicle(vid,vname,vtype,bd);
if(cnt==v1.length) {
	return false;
}else {
	v1[cnt]=v;
	cnt++;
	return true;
}

}


public static void displayAllData() {
	for(Vehicle v:v1) {
		if(v ==null) 
		break;
		else {
			System.out.println(v);
		}
	}
	
}


public static Vehicle findById(int id) {
	for(Vehicle v :v1) {
		if(v!=null) {
			if(v.getVid()==id) {
				return v;
			}
			else {
				break;
			}
		}
	}
	return null;
}




public static boolean updateVtype(int id,String vType) {
	Vehicle v =findById(id);
	if(v!=null) {
		v.setVtype(vType);
		return true;
	}
	return false;
}


public static Vehicle[] findByName(String name) {
	Vehicle [] vTemp = new Vehicle[cnt];
	int i=0;
	for(Vehicle v:v1) {
		if(v!=null) {
			if(v.getVname().equals(name)) {
				vTemp[i]=v;
				i++;
			}
			return vTemp;
		}
	}
	return null;
}






}
