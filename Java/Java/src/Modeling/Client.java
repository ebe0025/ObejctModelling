package Modeling;


public class Client {
	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInter(new Mp3());
		System.out.print("mp3파일 재생 : ");
		sp.Play();
		
		sp.setPlayInter(new Wav());
		System.out.print("wav파일 재생 : ");
		sp.Play();
	}
}
