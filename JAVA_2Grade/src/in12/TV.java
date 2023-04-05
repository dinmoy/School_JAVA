package in12;

public class TV implements Sound{

	private int SndLevel;
	
	//생성자
	public TV() {
		SndLevel=0;
	}
	public void SoundUp(int level) {
		SndLevel+=level;
		System.out.println("TV 볼륨"+level+"증가");
	}

	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel<0)
			SndLevel=0;
		System.out.println("TV 볼륨"+level+"감소");
	}

}
