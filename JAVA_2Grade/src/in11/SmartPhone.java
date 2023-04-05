package in11;

public class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	//SmartPhone에서 다 구현해야함 안하면 오류
	//MobilePhoneInterface의 추상메서드 재정의
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자 보냅니다");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요");
	}
	//MP3Interface의 추상메서드 재정의
	@Override
	public void play() {
		System.out.println("음악 연주합니다");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다");
	}
	//추가로 작성한 메서드 
	public void schedule() {
		System.out.println("일정관리합니다");
	}
}
