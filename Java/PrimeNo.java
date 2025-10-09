import java.util.Scanner;
class PrimeNo{
public static boolean isPrime(int n){
for(int i=2;i<=n;i++){
if(n%i==0){
return false;
}
}
return true;
}
public static void main(String [] args){
System.out.println("Enter your number: ");
Scanner sc = new Scanner(System.in);{
int n = sc.nextInt();
if(isPrime(n)){
System.out.println("Prime no ");
}
else{
System.out.println("Not Prime no");
}
sc.close();
}
}
}
