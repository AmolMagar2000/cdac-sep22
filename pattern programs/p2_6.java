import java.util.Scanner;
class p2_6{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
   int i,j,k;
for (i=1;i<=num;i++){
	for (j=1;j<=i;j++){
		System.out.print(" ");
		
		
	}
	for( k=num;k>=i;k--){
		
		System.out.print("*");
	}
	
	for( k=num-1;k>=i;k--){
		
		System.out.print("*");
	}
	System.out.println();
}

}}