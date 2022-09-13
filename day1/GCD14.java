import java.util.Scanner;
class GCD14{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
int n1= sc.nextInt();
int n2= sc.nextInt();

 

if(n1>n2) { 
n1=n1-n2;  
System.out.printf("GCD of n1 and n2 is: " +n1);
}
else{  
n2=n2-n1;  
System.out.printf("GCD of n1 and n2 is: " +n2);
}
  
//System.out.printf("GCD of n1 and n2 is: " +n2);

}}