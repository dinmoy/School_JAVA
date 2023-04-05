package in04;

public class MethodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r=new Rect(); //r은 Rect클래스를 가리키는 객체변수
		

		Shape s; //p는 Shape클래스를 가리키는 객체 변수로 선언만		
		s=r; //UPcasting 발생
		//Shape p=r;
		//Shape p=new Rect(); 아래 두줄 표현 가능
		
		System.out.println(s.a); //a=123(Shape클래스의 멤버)
		System.out.println(s.b); //b=456.678(Shape클래스의 멤버)
		s.draw(); //Rectangle 출력 (Rect클래스의 메소드)
		s.draw2();//(Shape클래스의 메소드)
		//s는 하위클래스인 Rect클래스로 UpCasting하게 되면
		//s는 하위클래스의 재정의된 메소드에만 접근 가능하고
		//원래 s는 Shape 클래스의 모든멤버에 접근 할 수 있는데
		//Overriding 재정의된 메소드만 접근불가
		//s.draw3();--> 오류가 발생한 원인은 Shape클래스에(시험에 나옴!!)
		//draw3()메소드를 정의하지 않았기 때문(Overriding가 안되었음)
	}

}
