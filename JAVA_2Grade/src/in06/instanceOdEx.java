package in06;

public class instanceOdEx {
	static void print(Person p) { //Person p=new Student()와 같다.
		if(p instanceof Person)
			System.out.println("Person 객체 타입");
		if(p instanceof Student)
			System.out.println("Student 객체 타입"); //얘만 실행 안됨 (시험 문제: 실행 안되는 건 뭘까요?)--
		if(p instanceof Researcher)
			System.out.println("Researcher 객체 타입");
		if(p instanceof Professor)
			System.out.println("Professor 객체 타입");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Stuednt() ==>\t"); print(new Student()); //Person p=new Student()와 같다.
		System.out.print("new Researcher() ==>\t"); print(new Researcher()); //Person p=new Student()와 같다.
		System.out.print("new Professor() ==>\t"); print(new Professor());
	}
}
