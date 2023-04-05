package in07;
//36p 1-5예제
public class MethodOverridingEx {
	static void paint(Shape p) { //Shape p=new Shape()
		p.draw(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line=new Line(); //line 객체생성
		paint(line); //Shape p=line과 같다. p.draw()는 Line클래스에 있는 draw()호출
		paint(new Shape()); //Shape p=new Shape() p.draw()는 Shape클래스에 있는 draw()호출
		paint(new Line()); //Shape p=new Line()과 같다. p.draw()는 Linee 클레스에 있는 draw()호출
		paint(new Rect()); //Shape p=new Rect()과 같다. p.draw()는 Rect 클레스에 있는 draw()호출
		paint(new Circle()); //Shape p=new Circle()과 같다. p.draw()는 Cieclee 클레스에 있는 draw()호출
	}

}
