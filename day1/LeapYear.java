//algorithm
//take year as input 2. divide by 4 if divisible then check for century year
// if not divisible then not leap year


import java.util.Scanner;
class LeapYear{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter year");
int year= sc.nextInt();
if(year%4==0){
if(year%100==0){
if(year%400==0){
System.out.println("Leap year");
}
else{
System.out.println("Not leap  year");
}
}
else{

System.out.println("leap year");
}
}
else{

System.out.println("Not leap year");
}
}

}