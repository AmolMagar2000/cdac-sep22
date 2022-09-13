import java.util.Scanner;
class FactByRecursion{
	
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num =sc.nextInt();
int ans=fact(num);
System.out.println("factorial is "+ ans);
}

public static int fact(int num){
	
	
if(num==0)
{
return 1;
}
int recur=num;
 recur= recur*fact(num-1);
  
return recur;

}
}