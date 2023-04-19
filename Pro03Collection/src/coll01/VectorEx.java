import java.util.Vector;

public class VectorEx {  
	public static void printVector(Vector<Integer>v2) {  //Vector<Integer>v2=v와 같다
		for(int i=0;i<v2.size();i++) { //v2.size()는 4
			int n=v2.get(i);
			System.out.println(n+" ");
		}
	}
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		//v는 백터클래스의 객체변수로 데이터는 정수를 담는 것으로
		//Vector()생성자에 의해서 10개의 기억 공간이 만들어진다
	
		v.add(5); //인덱스0번째 5가 삽입
		v.add(4); //인덱스1번째 4가 삽입
		v.add(-1);//인덱스2번째 -1이 삽입
		
		v.add(2,100);   //인덱스 2에는 100이 삽입
		
		System.out.println("백터 내의 요소 객체의 수: "+v.size());
		//실제 데이터가 저장되어 있는 데이터 갯수
		System.out.println("백터의 현재 용량: "+v.capacity()); //전체 용량
		
		printVector(v); //메소드 호출 되는데 파라미터값은  v객체인데
		//v가 전달이 되는데 .. 받는 쪽도 같은 자료형이어야 한다.
		
		
		/*for(int i=0;i<v.size();i++) { //v.size()
			int n=v.get(i);
			System.out.println(n+" ");
		}*/

	}

}