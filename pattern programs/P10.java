import java.util.Scanner;
class P10{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int ascii= 65;
for(int i=num;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for(int k=i-1;k<num;k++){
System.out.print((char)(ascii+k) +" ");
}
System.out.println();
}

}}