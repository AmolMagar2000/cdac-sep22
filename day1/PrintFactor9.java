import java.util.Scanner;
class PrintFactor9{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num= sc.nextInt();

    System.out.print("Factors of " + num + " are: ");
    for (int i = 1; i <= num/2; ++i) {

      // if number is divided by i
      // i is the factor
      if (num % i == 0) {
        System.out.print(i + " ");
      }
	 
	}
	 System.out.print(num);               //to print num itself 
}}