import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("welcome");
		arrayList.add("hello");
		
		String s1 = (String)arrayList.get(0);
		String s2 = (String)arrayList.get(1);
		String s3 = (String)arrayList.get(2);
		String s4 = (String)arrayList.get(3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("------------");
		
		for (int i = 0;i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//arrayList.clear();
		System.out.println(arrayList.isEmpty());
		
		arrayList.remove(0);
		arrayList.remove("world");
		
		System.out.println("------------");
		
		for (int i = 0;i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		arrayList.add("aaa");
		arrayList.add("bbb");
		
		System.out.println(arrayList.indexOf("aaa"));
		
	}
	
}