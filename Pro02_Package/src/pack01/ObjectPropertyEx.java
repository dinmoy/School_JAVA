package pack01;

//Object 클래스는 모든 클래스의 아버지 클래스 이다
public class ObjectPropertyEx {
	public static void print(Object obj) { //Object obj=p와 같은 문장(업케스팅 발생)
		System.out.println(obj.getClass().getName()); //클래스 이름 출력
		System.out.println(obj.hashCode()); //Point클래스의 고유코드
		System.out.println(obj.toString()); //패키지를 포함한 클래스 이름과 해시코드(16진수)
		System.out.println(obj); //.toString()이 생략됨(위에 것과 똑같음)
	}
	public static void main(String[] args) {
		Point p=new Point(2,3);
		print(p);
	}

}
