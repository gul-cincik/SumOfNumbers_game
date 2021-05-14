import java.util.Scanner;

public class sumOfNums {
	public static void main(String args [])
	{
		Scanner scanner = new Scanner(System.in);
		int num1 = (int) (0 + Math.random() * 9);
		int num2 = (int) (0 + Math.random() * 9);
		int sum = num1 + num2;
		boolean answer = false;
		while(answer == false) {
			System.out.print("What is " + num1 + "+" + num2 + "?\n");
			int i = scanner.nextInt();
			if(i == sum) {
				System.out.print("Correct answer!");
				answer = true;
				break;
			}
			else
				System.out.print("Wrong answer! Again: ");
		}
		
		
	}

}
