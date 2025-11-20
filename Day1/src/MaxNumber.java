import java.util.Scanner;

class MaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number:");
		System.out.println("Enter First number:");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number:");
		int n2 = sc.nextInt();
		System.out.println("Enter Third number:");
		int n3 = sc.nextInt();
		if (n1 == n2 && n1 == n3) {
			System.out.println("Numbers are equal");
		} else if (n1 > n2 && n1 > n3) {
			System.out.println("N1 is Greater");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("N2 is Greater");
		} else {
			System.out.println("N3 is Greater");
		}
		sc.close();

	}
}
