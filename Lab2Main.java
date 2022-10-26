/*
Lab 2
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of classes, polymorphism, and inheritance
 */
import java.util.Objects;
import java.util.Scanner;

public class Lab2Main {
	public static void main(String[] args) {
		Currency[] currencyArr = new Currency[2]; //array of references
		currencyArr[0] = new Pound();
		currencyArr[1] = new Dollar();

		Dollar d1 = null;
		Pound p1 = null;

		for(int i = 0; i > -1; i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.printf("Please enter a command: ");
			String input = myObj.nextLine();
			String[] separatedInput = input.split(" ");

			if (Objects.equals(separatedInput[0], "q"))
			{
				i = -2;
			}
			else {
					if (Objects.equals(separatedInput[3], "dollar"))
					{
						//debugging
						System.out.println(Double.parseDouble(separatedInput[2]));
						d1 = new Dollar(Double.parseDouble(separatedInput[2]));
					}
					if(Objects.equals(separatedInput[3], "pound"))
					{
						p1 = new Pound(Double.parseDouble(separatedInput[2]));
					}
					if(Objects.equals(separatedInput[1], "p"))
					{
						if (Objects.equals(separatedInput[0], "a"))
						{
							p1.add();
						}
						if(Objects.equals(separatedInput[0], "s"))
						{
							p1.subtract();
						}
					}
					if(Objects.equals(separatedInput[1], "d"))
					{
						if(Objects.equals(separatedInput[0], "a"))
						{
							d1.add();
						}
						if(Objects.equals(separatedInput[0], "s"))
						{
							d1.subtract();
						}
					}
				}
			}
		}
}

