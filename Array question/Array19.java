import java.util.*;
class Array19
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt(); 
     int a[]=new int[n]; 
     int sum=0;
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        sum=sum+a[i];
     }
    System.out.println(sum);
  }
}