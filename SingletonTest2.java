//懒汉模式：加载类时比较快，但运行时获取对象的速度比较慢。线程不安全。

public class SingletonTest2 {
	//1、将构造方法私有化，不允许外边直接创建对象
	private SingletonTest2() {
		
	}
	//2、声明类的唯一实例，使用private static修饰
	private static SingletonTest2 singletonTest2 = null;
	//3、提供一个获取实力的方法，使用public static修饰,类加载时未创建实例
	public static SingletonTest2 getInstance() {
		if (singletonTest2 == null) {
			singletonTest2 = new SingletonTest2();
		}
		return singletonTest2;
	}
	
	public static void main(String[] args) {
		SingletonTest2 st1 = SingletonTest2.getInstance();
		SingletonTest2 st2 = SingletonTest2.getInstance();
		System.out.println(st1==st2);//比较地址true
	}
}