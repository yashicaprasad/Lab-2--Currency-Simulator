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
		Pound p1 = null;
		Dollar d1 = null;

		currencyArr[0] = p1;
		currencyArr[1] = d1;

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
						d1 = new Dollar(Double.parseDouble(separatedInput[2]));
						System.out.println(d1.getCurrencyWhole() + "." + d1.getCurrencyFrac() + "Dollar");
					}

					if(Objects.equals(separatedInput[3], "pound"))
					{
						p1 = new Pound(Double.parseDouble(separatedInput[2]));
						System.out.println(p1.getCurrencyWhole() + "." + p1.getCurrencyFrac() + "Pound");
					}
					if(Objects.equals(separatedInput[1], "p"))
					{
						if (Objects.equals(separatedInput[0], "a"))
						{
							p1.add();
							System.out.println(p1.getCurrencyWhole() + "." + p1.getCurrencyFrac() + "Pound");
						}
						if(Objects.equals(separatedInput[0], "s"))
						{
							p1.subtract();
							System.out.println(p1.getCurrencyWhole() + "." + p1.getCurrencyFrac() + "Pound");
						}
					}
					if(Objects.equals(separatedInput[1], "d"))
					{
						if(Objects.equals(separatedInput[0], "a"))
						{
							d1.add();
							System.out.println(d1.getCurrencyWhole() + "." + d1.getCurrencyFrac() + "Dollar");
						}
						if(Objects.equals(separatedInput[0], "s"))
						{
							d1.subtract();
							System.out.println(d1.getCurrencyWhole() + "." + d1.getCurrencyFrac() + "Dollar");
						}
					}
				}
			}
		}
}

