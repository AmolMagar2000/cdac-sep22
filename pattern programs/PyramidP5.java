   import java.util.Scanner;
      class PyramidP5{
     
     public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
      int num= sc.nextInt();
	  int n;
     for(int i=num;i>=1;i--){
		 
     for(int j=i;j>1;j--){
     System.out.print(" ");
     }
     for(int k=i;k<=num;k++){
      System.out.print(k);
     }
	 
	 for(int k=num-1;k>=i;k--){
      System.out.print(k);
	  
	 }
     System.out.println();
     }

      }


     }