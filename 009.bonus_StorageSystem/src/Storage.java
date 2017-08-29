import java.util.Scanner;
import java.util.Arrays;

public class Storage {
	Scanner scanner = new Scanner(System.in);
	private Product[] productArray;
	private int count;
	
	public Storage() {
		productArray = new Product[10];
		count = 0;
	}
	
	public void add() {
		if (count >= productArray.length) {
			productArray = Arrays.copyOf(productArray, count * 2);
		}
		String no, name, unit, maker;
		int price, stock;
		
		System.out.print("Product No.: ");
		while ((no = scanner.nextLine()).equals("")){}
		System.out.print("Product Name: ");
		name = scanner.nextLine();
		System.out.print("Price: ");
		price = scanner.nextInt();
		System.out.print("Unit: ");
		while ((unit = scanner.nextLine()).equals("")){}
		System.out.print("Maker: ");
		maker = scanner.nextLine();
		System.out.print("Stock: ");
		stock = scanner.nextInt();
		productArray[count++] = new Product(no, name, price, unit, maker, stock);
	}
	
	public void printStorage() {
		Product.infoTitle();
		for (int i = 0; i < count; i++)
			productArray[i].productInfo();
	}
	
	//Add number of purchase to stock of item.
	public void purchase(int num, String item) {
		if (num >= 0) {
			int index = this.search(item);
			if (index == -1)
				System.out.println("Input of product is not exist.");
			else
				productArray[index].modifyStock(productArray[index].getStock() + num);
		}
	}
	
	//Delete number of sell to stock of item.
	public void sales(int num, String item) {
		if (num >= 0) {
			int index = this.search(item);
			if (index == -1)
				System.out.println("Input of product is not exist.");
			else
				productArray[index].modifyStock(productArray[index].getStock() - num);
		}
	}
	
	//Get index of product by search product name in productArray.
	public int search(String target) {
		for (int i = 0; i < this.count; i++) {
			if (this.productArray[i].getName().equalsIgnoreCase(target) == true) 
				return i;
		}
		return -1;
	}

}
