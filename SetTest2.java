import java.util.HashSet;

public class SetTest2 {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		//set.add(new People("lisi"));
		//set.add(new People("lisi"));
		//set.add(new People("万物"));
		
		//System.out.println(set);
		//[People@55f33675, People@65690726, People@527c6768]
		
		//People p1 = new People("zhangsan");
		
		//set.add(p1);
		//set.add(p1);
		
		//System.out.println(set);//[People@459189e1]
		
		String s1 = new String("a");
		String s2 = new String("a");
		
		System.out.println(s1.hashCode() == s2.hashCode());//true
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);//[a]
		
		
	}
	
}

class People {
	
	String name;
	
	public People(String name) {
		this.name = name;
	}
	
}