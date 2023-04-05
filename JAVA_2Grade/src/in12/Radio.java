package in12;

public class Radio  implements Sound{

	private int SndLevel;
	
	//생성자
	public Radio() {
		SndLevel=0;
	}
	public void SoundUp(int level) {
		SndLevel+=level;
		System.out.println("Radio 볼륨"+level+"증가");
	}

	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel<0)
			SndLevel=0;
		System.out.println("Radio 볼륨"+level+"증가");
	}

}