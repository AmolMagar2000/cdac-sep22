import java.util.Scanner;
class P13{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int ascii= 65;
for(int i=0;i<num;i++){           //need to run 0 to n
for(int j=1;j<(num-i);j++){       //needs to run 1 to n-1 times for spaces
System.out.print(" ");
}
for(int k=0;k<=i;k++){                //needs to run 1 to n times means i times.
System.out.print((char)(ascii+i) +" ");
}
System.out.println();
}

}}