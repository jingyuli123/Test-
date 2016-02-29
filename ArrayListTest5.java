import java.util.ArrayList;
/*
x=2, y=3
x=3, y=4
x=4, y=5
x=5, y=6
[x=2, y=3, x=3, y=4, x=4, y=5, x=5, y=6]
*/
public class ArrayListTest5 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Point(2,3));
		list.add(new Point(3,4));
		list.add(new Point(4,5));
		list.add(new Point(5,6));
		
		for (int i = 0;i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
		System.out.println(list);
		
	}
	
}

class Point {
	
	int x;
	int y;
	
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + this.x + ", y=" + this.y;
	}
	
}