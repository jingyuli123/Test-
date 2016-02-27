//����ģʽ��������ʱ�ȽϿ죬������ʱ��ȡ������ٶȱȽ������̲߳���ȫ��

public class SingletonTest2 {
	//1�������췽��˽�л������������ֱ�Ӵ�������
	private SingletonTest2() {
		
	}
	//2���������Ψһʵ����ʹ��private static����
	private static SingletonTest2 singletonTest2 = null;
	//3���ṩһ����ȡʵ���ķ�����ʹ��public static����,�����ʱδ����ʵ��
	public static SingletonTest2 getInstance() {
		if (singletonTest2 == null) {
			singletonTest2 = new SingletonTest2();
		}
		return singletonTest2;
	}
	
	public static void main(String[] args) {
		SingletonTest2 st1 = SingletonTest2.getInstance();
		SingletonTest2 st2 = SingletonTest2.getInstance();
		System.out.println(st1==st2);//�Ƚϵ�ַtrue
	}
}