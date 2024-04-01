import java.util.Scanner;
 class FuncMul {


   //Multiply 2 numbers
   public static int multiply(int a, int b) {
       return a*b;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers: ");
  	int a = sc.nextInt();
       	int b = sc.nextInt();


       int result = multiply(a, b);
       System.out.println("Result: "+result);
   }
}