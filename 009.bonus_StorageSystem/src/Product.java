
public class Product {
	private String no, name, unit, maker;
	private int price, stock;
	
	public Product(String no, String name, int price, String unit, String maker) {
		this.modifyNo(no);
		this.modifyName(name);
		this.modifyPrice(price);
		this.modifyUnit(unit);
		this.modifyMaker(maker);
	}
	
	public Product(String no, String name, int price, String unit, String maker, int stock) {
		this(no, name, price, unit, maker);
		this.modifyStock(stock);
	}
	
	public void modifyNo(String no) {
		if (no != null)
			this.no = no;
		else
			this.no = "No.000";
	}
	
	public void modifyName(String name) {
		if (name != null)
			this.name = name;
		else
			this.name = "Product name undefined";
	}
	
	public void modifyPrice(int price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 1;
	}
	
	public void modifyUnit(String unit) {
		if (unit != null)
			this.unit = unit;
		else
			this.unit = "Unit undefined";
	}
	
	public void modifyMaker(String maker) {
		if (maker != null)
			this.maker = maker;
		else
			this.maker = "Maker undefined";
	}
	
	public void modifyStock(int stock) {
		this.stock = 0;
		if (stock >= 0)
			this.stock = stock;
	}
	
	public String getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getUnit() {
		return this.unit;
	}
	
	public String getMaker() {
		return this.maker;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void productInfo() {
		System.out.printf("%12s%13s%7d%6s%8d%12s\n", no, name, price, unit, stock, maker);
	}
	
	public static void infoTitle() {
		String[] p = {"Product No.", "Product Name", "Price", "Unit", "Stock", "Maker"};
		System.out.printf("%12s%13s%7s%6s%8s%12s\n", p[0], p[1], p[2], p[3], p[4], p[5]);
	}
}
