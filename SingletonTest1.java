//����ģʽ,������ʱ�Ƚ�����������ʱ��ȡ������ٶȱȽϿ졣�̰߳�ȫ��

public class SingletonTest1 {
	//1.˽�л���������ʹ��������ⲿ���ܵ��ô˹�����
	private SingletonTest1() {
		
	}
	//2.������ڲ�����һ�����ʵ��
	private static SingletonTest1 singletonTest1 = new SingletonTest1();
	//3.˽�л���������ͨ�������ķ���������
	//4.�˹���������ֻ��ͨ���������ã��������Ϊstatic
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