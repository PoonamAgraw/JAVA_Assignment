import java.util.Scanner;

public class ArrayService {

	public static void main(String[] args) {
		

	}

	public static void acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of an array:") ;
		for(int i = 0;i < arr.length;i++) {
			 arr[i] = sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) { 
		for(int i = 0;i < arr.length;i++) {
			 System.out.println(arr[i]) ;
		}
	}

	public static int searchElement(int[] arr, int num) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == num) {
				return i;
			}
	
		}
		return -1;
	}

	public static int maxNumber(int[] arr) {
		int max = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int minNumber(int[] arr) {
		int min = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int addElement(int[] arr) {
		int sum =0;
		for(int i = 0;i < arr.length;i++) {
			sum = sum +arr[i];
		}
		return sum;
	}

	public static int[] findElementOccurance(int[] arr, int value) {
		int [] temp = new int [arr.length];
		for(int i = 0;i < arr.length;i++) {
			temp[i]=-1;
		}
		int cnt =0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == value) {
				temp[cnt]=i;
				cnt++;
			}
		}
		if(cnt >0) {
			return temp;
		}
		return null;
	}

	public static int nthMaxmium(int[] arr, int num2) {
		for(int i=0;i<num2;i++) {
			int pos=findNthPos(arr,i);
			int temp=arr[i]; 
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[num2-1];
	}

	private static int findNthPos(int[] arr, int num2) {
		int pos=num2;
		int max=arr[pos];
		for(int i=num2+1;i<arr.length;i++) {
			if(max<arr[i]) {
				pos=i;
				max=arr[i];
			}
		}
		return pos;
	}

	public static int nthMinmium(int[] arr, int num3) {
		for(int i=0;i<num3;i++) {
			int pos=findNthPoss(arr,i);
			int temp=arr[i]; 
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[num3-1];
	}

	private static int findNthPoss(int[] arr, int num3) {
		int pos=num3;
		int min=arr[pos];
		for(int i=num3+1;i<arr.length;i++) {
			if(min>arr[i]) {
				pos=i;
				min=arr[i];
			}
		}
		return pos;
	}

	public static int[] isPrime(int[] arr) {
		int [] temp = new int[arr.length];
		int cnt =0;
		for(int i=0 ; i<arr.length;i++) {
			if(isPrime(arr[i])) {
				temp[cnt] = arr[i];
				cnt++;
			}
		}
		if(cnt > 0) {
			return temp;
		}
		else	
		return null;
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
	}

	public static int allOddElement(int[] arr) {
		int sum = 0;
		for(int i=0 ; i<arr.length;i++) {
			if(arr[i] % 2 ==1 ) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static int[] findFcatorial(int[] arr) {
		int [] temp = new int[arr.length];
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 7) {
				int fact = factorial(arr[i]);
				temp[cnt] = fact;
				cnt++;
			}
		}
		return null;
	}

	private static int factorial(int n) {
		int fact =1;
		for(int i=0;i<n;i++) {
			fact = fact *i;
		}
		return fact;
	}

	

	

}
