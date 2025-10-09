import java.util.Scanner;
class TableNumber{
public void table(int n){
for(int i = 1;i<=10;i++){
System.out.println(n+"*"+i+"="+(n*i));
}
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter A number:");
int n = sc.nextInt();
TableNumber Obj = new TableNumber();
Obj.table(n);
sc.close();
}
}