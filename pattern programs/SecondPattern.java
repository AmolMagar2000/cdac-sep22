import java.util.Scanner;
class SecondPattern{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int ch=65;
for(int i=0;i<num;i++){
for(int j=0;j<=i;j++){
System.out.print((char)(ch+j) +" ");
}
System.out.println();
}

}}