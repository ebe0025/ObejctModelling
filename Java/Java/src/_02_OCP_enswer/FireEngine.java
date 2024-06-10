package _02_OCP_enswer;

public class FireEngine implements IFireEngine{

	@Override
	public void drive() {
		System.out.println("운전하기");
	}

	@Override
	public void turnLeft() {
		System.out.println("왼쪽으로 회전");
	}

	@Override
	public void turnRight() {
		System.out.println("오른쪽으로 회전");
	}

	@Override
	public void stop() {
		System.out.println("멈춰");
	}

	@Override
	public void water() {
		System.out.println("물뿌리기");
	}



}
