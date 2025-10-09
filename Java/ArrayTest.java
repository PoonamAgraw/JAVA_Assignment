import java.util.Scanner;
class ArrayTest{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int [] arr = new int [10];
System.out.println("Enter Array Elements:");
for(int i =0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

for(int i =0;i<arr.length;i++){
System.out.println(i+":"+arr[i]);
}

}
}