import java.util.Scanner;
class SumOfDigit10{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num= sc.nextInt();
int sum=0,m;

   while(num>0)    
{    
m=num%10;    
sum=sum+m;    
num=num/10;    
}    
        System.out.print("sum of digit is :" + sum);
     
}}