import java.util.Scanner;
class P12{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
for(int i=1;i<=num;i++){
for(int j=1;j<=num-i;j++){          //for spaces
System.out.print(" ");   
}
for(int k=1;k<=i;k++){             //for number
System.out.print(i +" ");
}
System.out.println();
}

}}