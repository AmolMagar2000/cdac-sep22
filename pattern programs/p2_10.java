import java.util.Scanner;
class p2_10{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
for(int i=1;i<=num;i++){
for(int j=0;j<=num-i;j++){
System.out.print(" ");
}
for(int j=1;j<=num;j++){
System.out.print("*");
}
System.out.println();
}

}}