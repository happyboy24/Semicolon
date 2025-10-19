public class Hcf{
  public static void main(String[]args){
   
	int num1 = 36;
	int num2 = 60;
	int gcd = 1; 
for( int count = 1; count <= num1 && count <= num2; count ++){
	if(num1 % count == 0 && num2 % count == 0){
	gcd = count;
}
}
   System.out.printf("The GCD is:" + gcd );

}
}