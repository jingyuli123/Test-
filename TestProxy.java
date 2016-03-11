/*
	ProxyClassCreateSuccess
	ProxyClass is starting!
	=======ByProxyClass is starting=======
	=======options=======
	=======ByProxyClass end=======
	ProxyClass End
*/

public class TestProxy {
	
	public static void main(String[] args) {
		MyObject obj = new ProxyObject();
		obj.action();
	}
	
}

interface MyObject {
	void action();
}
//代理类
class ProxyObject implements MyObject{
	MyObject obj;
	
	public ProxyObject() {
		System.out.println("ProxyClassCreateSuccess");
		obj = new ObjectImpl();
	}
	
	public void action() {
		System.out.println("ProxyClass is starting!");
		obj.action();
		System.out.println("ProxyClass End");
	}
	
}
//被代理类
class ObjectImpl implements MyObject{
	
	public void action() {
		System.out.println("=======ByProxyClass is starting=======");
		System.out.println("=======options=======");
		System.out.println("=======ByProxyClass end=======");
	}
	
}
