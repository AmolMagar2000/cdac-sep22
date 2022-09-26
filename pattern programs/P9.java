import java.util.Scanner;
class P9{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int ascii= 65;
for(int i=1;i<=num;i++){
for(int j=1;j<=num-i;j++){
System.out.print(" ");
}
for(int k=0;k<i;k++){
System.out.print((char)(ascii+k) +" ");
}
System.out.println();
}

}}