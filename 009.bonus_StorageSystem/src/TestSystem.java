/*
 * Practice 009.bonus_Storage system
 * Date 20170818
 */
import java.util.Scanner;

public class TestSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input, count = 0;
		String inputString;
		Storage storeA = new Storage();
		while (true) {
			System.out.print("1)All products. 2)Add new products. 3)Purchase. 4)Sell. -1)Quit.:");
			input = scanner.nextInt();
			if (input == -1)
				break;
			else if(input == 1)
				storeA.printStorage();
			else if (input == 2)
				storeA.add();
			else if (input == 3) {
				System.out.print("Product name:");
				while ((inputString = scanner.nextLine()).equals("")){}
				System.out.print("Purchase amount:");
				input = scanner.nextInt();
				storeA.purchase(input, inputString);
			}
			else if (input == 4) {
				System.out.print("Product name:");
				while ((inputString = scanner.nextLine()).equals("")){}
				System.out.print("Sales amount:");
				input = scanner.nextInt();
				storeA.sales(input, inputString);
			}
			else 
				System.out.println("Input error!");
		}
		System.out.println("Program terminate.");
	}

}
