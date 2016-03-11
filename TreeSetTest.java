import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		set.add("c");
		set.add("d");
		set.add("b");
		set.add("c");
		set.add("a");
		
		System.out.println(set);//[a, b, c, d]
	}
	
}

