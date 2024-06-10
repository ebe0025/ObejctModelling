package _02_FactoryPattern;

public class ProductFactory {
	public static Product getInstance(String name) {
		Product product = new Product();
		if(name.equalsIgnoreCase("tv")) {
			product.setName("TV");
			product.setPrice(300);
		}else if(name.equalsIgnoreCase("computer")) {
			product.setName("Computer");
			product.setPrice(200);
		}
		return product;
	}
	//객체를 숨기는 패턴(캡슐화) 
}
