import java.util.Scanner;
public class AdditionNNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Number Addition you want:");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++){
		sum = sum +i;
		}
		System.out.println("Addition is:"+sum);
		sc.close();
		}

	}


