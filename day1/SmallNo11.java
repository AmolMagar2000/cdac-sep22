import java.util.Scanner;
class SmallNo11{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
int small;

if (a<b){
small=a;
}
else{
small=b;
}

if(small<c){
System.out.print("small no is :" +small);
}
else{
System.out.print("small no is :" + c);
}
        
   
     
}}