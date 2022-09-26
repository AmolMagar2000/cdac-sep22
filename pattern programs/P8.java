/*import java.util.Scanner;
class P8{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();
int n=num;
for(int i=1;i<=num;i++){
n=n-i;
for(int j=1;j<=num-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
n++;
System.out.print(n +" ");

}
System.out.println();
}

}}*/

import java.util.Scanner;
class P8{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num= sc.nextInt();

for(int i=num;i>=1;i--){            //for rows n to 1

for(int j=1;j<=i;j++){               //for spaces 1 to n
System.out.print(" ");
}
for(int k=i;k<=num;k++){        //for number 

System.out.print(k +" ");

}
System.out.println();
}

}}