import java.util.Scanner;
class Factorial{
public static int factorial(int n){
int fact = 1;
for(int i =1;i<n;i++){
fact = fact *i;
}
return fact;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int n = sc.nextInt();
int ans = factorial(n);
System.out.println("Factorial is :"+ans);
}
}