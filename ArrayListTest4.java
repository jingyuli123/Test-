import java.util.ArrayList;

public class ArrayListTest4 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		/*
		*Object not translate Integer[]
		*/
		Object[] in = list.toArray();
		
		for (int i = 0;i < in.length; i++) {
			
			System.out.println(((Integer)in[i]).intValue());
			
		}
		
		
	}
	
}