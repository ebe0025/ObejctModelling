package _02_FactoryPattern;

public class Product {
	private String name;
	private int price;
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name = " + name + ", price=" + price + "]";
	}
}
