import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int [10];
		acceptArray(arr);
		displayArray(arr);
		int max=maxNumber(arr);
		System.out.println("Maximum Number is:"+max);

		int min=minNumber(arr);
		System.out.println("Minimum Number is:"+min);
		}


public static void acceptArray(int [] arr){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Elements:");
for(int i =0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
}


public static void displayArray(int [] arr){
for(int i =0;i<arr.length;i++){
System.out.println(i+":"+arr[i]);
}
}

public static int maxNumber( int [] arr){
int max = arr[0];
for(int i=1; i<arr.length;i++){
if (max < arr[i]){
max=arr[i];
}
}
return max;
}


public static int minNumber( int [] arr){
int min = arr[0];
for(int i=1; i<arr.length;i++){
if (min > arr[i]){
min=arr[i];
}
}
return min;
}


	}


