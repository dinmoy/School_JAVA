package coll01;

import java.util.Vector;

public class VectorEx {  
 
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		//기본적인 용량은 10개를 만든다
	
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);    
		
		System.out.println("백터 내의 요소 객체의 수: "+v.size());
		System.out.println("백터의 현재 용량: "+v.capacity());
		
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);
			System.out.println(n);
		}

	}

}

