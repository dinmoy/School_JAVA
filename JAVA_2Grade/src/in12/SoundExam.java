package in12;

public class SoundExam {

	public static void main(String[] args) {
		
		Sound tv=new TV(); //tv는 Sound인터페이스를 가리키는 객체변수이지만 TV클래스를 할당
		Sound radio=new Radio(); //radio는 Sound인터페이스를 가리키는 객체변수이지만 Radio클래스를 할당
		
		tv.SoundUp(5); //tv객체 변수는 TV클래스에 있는 재정의된 SoundUp()메소드를 호출
		tv.SoundDown(10); //
		
		radio.SoundUp(5);//radio객체 변수는 Radio클래스에 있는 재정의된 SoundUp()메소드를 호출
		radio.SoundDown(15);

	}

}
