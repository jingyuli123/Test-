//饿汉模式,加载类时比较慢，但运行时获取对象的速度比较快。线程安全。

public class SingletonTest1 {
	//1.私有化构造器，使得在类的外部不能调用此构造器
	private SingletonTest1() {
		
	}
	//2.在类的内部创建一个类的实例
	private static SingletonTest1 singletonTest1 = new SingletonTest1();
	//3.私有化构造器，通过公共的方法来调用
	//4.此公共方法，只能通过类来调用，因此设置为static
	public static SingletonTest1 getInstance () {
		return singletonTest1;
	}
	
	public static void main(String[] args) {
		// SingletonTest1 st1 = new SingletonTest1();
		
		// SingletonTest1 st2 = new SingletonTest1();
		
		SingletonTest1 st1 = SingletonTest1.getInstance();
		SingletonTest1 st2 = SingletonTest1.getInstance();
		System.out.println(st1 == st2);//true
		
		// System.out.println(st1.getInstance()==st2.getInstance());
		// System.out.println("Hello World");
	}
}