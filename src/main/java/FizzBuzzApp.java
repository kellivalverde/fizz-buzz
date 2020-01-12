import java.util.Scanner;

public class FizzBuzzApp {
	
	//user interface
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FizzBuzz fizzBuzzObject = new FizzBuzz();
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println(fizzBuzzObject.getResponse(number));
		
		input.close();
		
	}

}
