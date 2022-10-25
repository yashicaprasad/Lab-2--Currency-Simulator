/*
Lab 2
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of classes, polymorphism, and inheritance
 */
import java.util.Scanner;

public class Lab2Main {
	public static void main() {
		Currency[] baseCase;
		baseCase = new Currency[2];
		baseCase[0] = new Pound();
		baseCase[1] = new Dollar();

		Dollar d1 = null;
		Pound p1 = null;
		Scanner myObj = new Scanner(System.in); 
		String in = myObj.nextLine();
		
		String[] separatedInput = in.split(" ");
		
		
		while(separatedInput[0]!="q") {
			if(separatedInput[3]=="dollar") {
				d1 = new Dollar(Double.valueOf(separatedInput[2]));
				//debugging
				System.out.println("Dollar obj created");
			}
			if(separatedInput[3]=="pound") {
				p1 = new Pound(Double.valueOf(separatedInput[2]));
				//debugging
				System.out.println("Pound obj created");
			}

			if(separatedInput[1]=="p") {
				if(separatedInput[0]=="a") {
					p1.add();
				}
				if(separatedInput[0]=="s") {
					p1.subtract();
				}
			}
			if(separatedInput[1]=="d") {
				if(separatedInput[0]=="a") {
					d1.add();
				}
				if(separatedInput[0]=="s") {
					d1.subtract();
				}
			}
		}
	}
}

