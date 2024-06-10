package _02_OCP_enswer;

class Cat1{
	void speak() {
		System.out.println("야옹");
	}
}

class WhiteCat extends Cat1{
	String color = "white";
	

}
class BlackCat extends Cat1{
	String color = "black";
	

}

public class CatRun {

	public static void main(String[] args) {
		Cat1 cat = new WhiteCat();
		cat.speak();
		WhiteCat whiteCat = (WhiteCat)cat;
		whiteCat.speak();

		
		Cat1 cat2 = new BlackCat();
		cat2.speak();
		BlackCat blackCat = (BlackCat)cat2;
		blackCat.speak();
	}

}
