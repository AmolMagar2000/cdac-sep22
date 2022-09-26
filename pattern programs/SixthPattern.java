import java.util.Scanner;
class SixthPattern{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int i, j;       

for (i=0; i<num; i++)   
{  
    
for (j=2*(num-i); j>0; j--)         
{  
   
System.out.print(" ");   
}   

for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}  
 System.out.println();   
}
}}