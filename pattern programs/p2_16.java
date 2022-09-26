import java.util.Scanner;
class p2_16{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
  int i,j,k;
for (i=1;i<=num;i++){
for (k=1;k<=num-i;k++){                //for initial space
       System.out.print(" ");        
}
     if(i<num){
	 System.out.print("*");            //for first *
	 for(j=2;j<i;j++){
	 System.out.print(" ");            //for middle space
	 }
	 if(i>1){
	 System.out.print("*");          //for second *
	 }
	 }
	 else{
		 int temp=i;
	  while(temp>0){
	  System.out.print("*");        //for last line
	  temp--;
	  }
	  }
	 System.out.println();
	 }
	 
	 	 
	 }}