import java.util.Scanner;

public class IT24102186Lab5 {
		public static void main(String[] args)	{
			
			System.out.print("Enter the first integer:	");
			int num1 = new Scanner(System.in).nextInt();
			
			System.out.print("Enter the second integer:	");
			int num2 = new Scanner(System.in).nextInt();
			
			System.out.print("Enter the third integer:	");
			int num3 = new Scanner(System.in).nextInt();
			
			System.out.println("User entered numbers are:" + num1 +" " + num2 +" " + num3 );
			
			//Compute the smallest number
			int smallest = Math.min(num1, Math.min(num2, num3));
			
			//Compute the largest number
			int largest = Math.max(num1, Math.min(num2, num3));
			
			
			//Display results
			System.out.println("The Smallest number is: " + smallest);
			System.out.println("The Largest number is: " + largest);
		}
		
}
			
			
			