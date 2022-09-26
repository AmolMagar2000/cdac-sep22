      import java.util.Scanner;
      class PyramidP4{
     
     public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
      int num= sc.nextInt();
	  int n;
     for(int i=1;i<=num;i++){
		 n=i;
     for(int j=1;j<=num-i;j++){
     System.out.print(" ");
     }
     for(int k=1;k<=i;k++){
      System.out.print(k);
     }
	 
	 for(int k=1;k<i;k++){
      System.out.print(n-1);
	  n--;
	 }
     System.out.println();
     }

      }


     }