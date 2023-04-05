package in05;

public class DowncastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Student("이재문"); //Upcasting발생
		Person p1=new Person(); //p1객체 생성(Upcasting 발생X)
		
		Student s,s1;
		
		//Student s2=new Reseracher(); -- 형제 관계는 Upcasting 할 수가 없다 
		s=(Student)p; //Upcasting된 p는 Downcasting 할 수 있다.
		//s1=(Student)p1; -- 실행시 오류 발생
		System.out.println(s.name);
		s.grade="A";
		//System.out.println(s1.name); -- 오류발생
		//s1.grade="B"; -- 오류발생
		
	}

}
