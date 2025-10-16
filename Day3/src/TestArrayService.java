
import java.util.Scanner;

public class TestArrayService {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int[][] arr1=new int[3][3];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		ArrayService.acceptData(arr1);
		ArrayService.displayData(arr1);
		int choice;
		do {
			System.out.println("1.Add All Numbers.");
			System.out.println("2.Add Element Row Wise.");
			System.out.println("3.Add Element Column Wise.");
			System.out.println("4.Find Maximum of all Array Elements.");
			System.out.println("5.Find Maximun Row Wise.");
			System.out.println("6.Find Maximun Column Wise.");
			System.out.println("7.Addition of Two Array.");
			System.out.println("8.Multiplication of Two Array.");
			System.out.println("9.Finf Transpose of an Array.");
			System.out.println("10.Check whether the Matrix is Identity Matrix or not.");
			System.out.println("11.Rotate Matrix Row Wise.");
			System.out.println("12.Rotate Matrix Column Wise.");
			System.out.println("13.Convert Two D Array into One D Array.");
			System.out.println("14.Exit.");
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: int  sum =ArrayService.addAllElement(arr);
				System.out.println("Addition of all Array Elements is:"+sum);
			break;
			
			case 2:int [] row = ArrayService.rowWiseAddition(arr);
			System.out.println("Row Wise Addition is ");
			for(int val : row) {
				System.out.println(val);
		}
			break;
			
			case 3:int [] column = ArrayService.columnWiseAddition(arr);
			System.out.println("coulumnWise Addition is ");
			for(int val : column) {
				System.out.println(val);
			}
			
			break;
			
			case 4:int max = ArrayService.maxOfAllElement(arr);
			System.out.println("Maximum Elements  of All Array Element is:"+max);
			break;
			
			case 5: row = ArrayService.maxOfRowWise(arr);
			System.out.println("Maximum Elements Row Wise is:");
			for(int val : row) {
				System.out.println(val);
			}
			
			break;
			
		
			case 6:column = ArrayService.maxOfColumnWise(arr);
			System.out.println("Maximum Elements Column Wise is:");
			for(int val : column) {
				System.out.println(val);
			}
			break;
		
			case 7:int[][] addTwoArray = ArrayService.addTwoArray(arr ,arr1);
			System.out.println("Addition Of Two Array is:");
			ArrayService.displayData(addTwoArray);
			break;
		
			case 8:int[][] multiplyTwoArray = ArrayService.multiplyTwoArray(arr ,arr1);
			if(multiplyTwoArray != null) {
				System.out.println("Multiplication Of Two Array is:");
				ArrayService.displayData(multiplyTwoArray);
			}
			else {
				System.out.println("Multiplication is Not Possible");
			}
			break;
    
			case 9:int [][] transpose =ArrayService.transpose(arr);
			System.out.println("Transpose of An Array is:");
			ArrayService.displayData(transpose);
		    
			case 10:boolean status = ArrayService.identityMatrix(arr);
			if(status) {
				System.out.println("It is Identity Matrix");
			}
			else {
				System.out.println("It is Not Identity Matrix");
			}
		    break;
		    
			case 11:System.out.println("Enetr number of Rotation:");
			int n = sc.nextInt();
			int[][] rotateRow = ArrayService.rotateRowWise(arr,n);
			ArrayService.displayData(rotateRow);
			break;
			
			case 12: System.out.println("Enetr number of Rotation:");
			 n = sc.nextInt();
			int[][] rotateColumn = ArrayService.rotateColumnWise(arr,n);
			ArrayService.displayData(rotateColumn);
			break;
		    
			case 13:int[] oneDArray = ArrayService.oneDArray(arr);
			for(int val :oneDArray) {
				System.out.println(oneDArray);
			}
			break;
			
			case 14:System.out.println("Thank you .");
			break;
			
			default :System.out.println("Wrong Choice.");
			break;
			}
			}while(choice!=14);
		
	}
}
