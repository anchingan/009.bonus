import java.util.Scanner;

public class Storage {
	Scanner scanner = new Scanner(System.in);
	private Product[] productArray;
	private int count;
	
	public Storage() {
		productArray = new Product[5];
		count = 0;
	}
	
	public void add() {
		if (count >= productArray.length) {
			Product[] temp = new Product[count * 2];
			System.arraycopy(productArray, 0, temp, 0, count);
			productArray = null;
			productArray = temp;
		}
		String no, name, unit, maker;
		int price, stock;
		
		System.out.print("Product No.: ");
		no = scanner.nextLine();
		System.out.print("Product Name: ");
		name = scanner.nextLine();
		System.out.print("Price: ");
		price = scanner.nextInt();
		System.out.print("Unit: ");
		unit = scanner.nextLine();
		unit = scanner.nextLine();
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
	
	public void purchase() {
		
	}
	
	public int search(String target) {
		
	}

}
