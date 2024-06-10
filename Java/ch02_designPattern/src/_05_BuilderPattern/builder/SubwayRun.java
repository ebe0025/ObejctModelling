package _05_BuilderPattern.builder;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
		//이렇게 넣는것을 메소드 체이닝
		Subway menu1 = new SubwayBuilder(15, "허니오트", "올리브오일")
				.setCheese("모짜렐라")
				.build();
		System.out.println(menu1);
		
		
		Subway menu2 = new SubwayBuilder(30, "화이트", "머스터드")
				.setCheese("아보카도")
				.build();
		System.out.println(menu2);
		
		SubwayBuilder sb = new SubwayBuilder(30, "화이트", "머스터드")
				.setCheese("모짜렐라");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가토칭을 선택하세요 : ");
		String topping = sc.nextLine();
		
		Subway menu3 = sb.setExtraTopping(topping)
				.build();
		System.out.println(menu3);

	}

}
