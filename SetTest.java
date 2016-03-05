import java.util.HashSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		System.out.println(set.add("a"));//true
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set.add("a"));//false
		System.out.println(set);//[d,b,c,a]
		
	}
	
}