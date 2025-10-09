import java.util.Scanner;
class FactorialCommandLine{
public static int factorial(int n){
int fact = 1;
for(int i =1;i<n;i++){
fact = fact *i;
}
return fact;
}
public static void main(String [] args){

int ans = factorial(Integer.parseInt(args[0]));
System.out.println("Factorial is :"+ans);
}
}
