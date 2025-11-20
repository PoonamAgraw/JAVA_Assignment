import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		int choice = 0;
		 
		do {
			System.out.println("1.Search For a Number.");
			System.out.println("2.Maximum Number in Array.");
			System.out.println("3.Minimum Number in Array.");
			System.out.println("4.Addition of Array Element.");
			System.out.println("5.Find all Occurance of n Element.");
			System.out.println("6.Find Nth Maximum from Array.");
			System.out.println("7.Find Nth Minimum from Array.");
			System.out.println("8.Display all Prime no in Array.");
			System.out.println("9.Find Nth Maximum of Prime Number.");
			System.out.println("10.Find Nth Minimum of Prime Number.");
			System.out.println("11.Find Addition of Digits of a Odd Number in the Array.");
			System.out.println("12.Find Factorial of all Number in the Array which are less than 7.");
			System.out.println("13.Exit.");
			System.out.println("Enter Choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Enter Value for Search:");
			int  num = sc.nextInt();
			int pos= ArrayService.searchElement(arr,num);
			if(pos != -1) {
				System.out.println(num+":Fount at Position:"+pos);
			}
			else {
				System.out.println("Element not Found");
			}
			break;
			
			case 2:int max = ArrayService.maxNumber(arr);
			System.out.println("Maximum Number is:"+max);
			break;
			
			case 3:int min = ArrayService.minNumber(arr);
			System.out.println("Minimum Number is:"+min);
			break;
			
			case 4:int sum = ArrayService.addElement(arr);
			System.out.println("Addition of Array Element is:"+sum);
			break;
			
			case 5:System.out.println("Enter Value for Search:");
			int  value = sc.nextInt();
			int [] occur = ArrayService.findElementOccurance(arr,value);
			if(occur != null) {
				System.out.println("All position are:");
				ArrayService.displayData(occur);
			}
			else {
				System.out.println("Not Found");
			}
			break;
			
			case 6:System.out.println("Enter which Maximum Number You want:");
			int  num2 = sc.nextInt();
			int maxNumber = ArrayService.nthMaxmium(arr ,num2);
			System.out.println(num2+":Maximum Number is :"+maxNumber);
			break;
			
			case 7:System.out.println("Enter which Minimum Number You want:");
			int  num3 = sc.nextInt();
			int minNumber = ArrayService.nthMinmium(arr ,num3);
			System.out.println(num3+":Minimum Number is :"+minNumber);
			break;
			
			case 8: int [] prime =ArrayService.isPrime(arr);
			System.out.println("Prime Numbers are:");
			ArrayService.displayData(prime);
		    break;
		    
			case 9:  prime =ArrayService.isPrime(arr);
			System.out.println("Enter which Maximum Number You want:");
			int num4 = sc.nextInt();
			int maxNumber1 =ArrayService.nthMaxmium(prime,num4);
			System.out.println(num4+":Maximum Number is :"+maxNumber1);
		    break;
		    
			case 10:  prime =ArrayService.isPrime(arr);
			System.out.println("Enter which Minimum Number You want:");
			 num4 = sc.nextInt();
			int minNumber1 =ArrayService.nthMinmium(prime,num4);
			System.out.println(num4+":Minimum Number is :"+minNumber1);
		    break;
		    
			case 11: sum = ArrayService.allOddElement(arr);
			System.out.println("Addition of Array Element is:"+sum);
			break;
			
			case 12: int [] fact =ArrayService.findFcatorial(arr);
			System.out.println("Factorial are:");
			ArrayService.displayData(fact);
		    break;
		    
			case 13:System.out.println("Thank you .");
			break;
			
			default :System.out.println("Wrong Choice.");
			break;
			}
			
			
		}while(choice != 13);

	}

}
