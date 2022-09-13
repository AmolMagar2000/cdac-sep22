import java.util.Scanner;
class ReverceNo13{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num= sc.nextInt();
int reverce=0;
while(num>0){
reverce= num%10;              
num=num/10;
System.out.print( reverce);  
}
 //System.out.println("reverce number :" + reverce);   //why this is not working 
  
   
     
}}