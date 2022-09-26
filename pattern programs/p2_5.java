import java.util.Scanner;
class p2_5{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int i, j,n=0;       

for (i=0; i<num; i++)   
{  
  
for (j=num-1; j>i; j--)         
{  
   
System.out.print(" ");   
}   

for (j=0; j<=n; j++ )   
{   
//prints star      
System.out.print("*");
   
}  
/*for(int k=0;k<i;k++){
	
	System.out.print("*");
}*/
 System.out.println(); 
n+=2 ;
}
}}