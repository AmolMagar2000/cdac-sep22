class print1To10{
public static void main(String [] args){
printNo(1);
}
public static void printNo(int n){
if (n<=10){
System.out.println(n);
printNo(n+1);

}
}


}