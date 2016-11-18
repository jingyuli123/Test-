import java.util.*;

public class TreeSetTest2{

	public static void main(String[] args){
	
		TreeSet set = new TreeSet(new PersonComparator());
		
		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		Person p4 = new Person(40);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		//System.out.println(set);
		for(Iterator iterator = set.iterator();iterator.hasNext();){
			Person p = (Person)iterator.next();
			System.out.println(p.score);
		}

	}
}
class Person{
	
	int score;

	public Person(int score){
	
		this.score = score;

	}
	public String toString(){
		return String.valueOf(this.score);
	}
}
//对类进行排序
class PersonComparator implements Comparator{
	
	public int compare(Object arg0,Object arg1){
	
		Person p1 = (Person)arg0;
		Person p2 = (Person)arg1;

		return p1.score - p2.score;
	}
}
