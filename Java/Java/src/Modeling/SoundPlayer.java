package Modeling;

public class SoundPlayer {
	private PlayInterface playInter;

	public void setPlayInter(PlayInterface playInter) {
		this.playInter = playInter;
	}
	
	public void Play()
	{
		playInter.Play();
	}
	
	
}
