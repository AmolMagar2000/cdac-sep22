import java.util.Scanner;
class PrintDigit8{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num= sc.nextInt();
int count=0;                  //to count digit
while(num>0){                 //you cant use if here
num=num/10;                  // to remove last digit
count++;

}
System.out.println("number of digit is :" + count);
}}