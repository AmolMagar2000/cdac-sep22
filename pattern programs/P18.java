import java.util.Scanner;
class P18{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int ch=65;
for(int i=0;i<num;i++){
for(int j=0;j<num-i;j++){
System.out.print((char)(ch+j) +" ");
}
System.out.println();
}

}}