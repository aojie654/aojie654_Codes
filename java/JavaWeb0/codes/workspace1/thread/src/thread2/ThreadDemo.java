package thread2;
//ʵ���̵߳ĵڶ��ַ�ʽ �̳�Thread
public class ThreadDemo extends Thread{//�̳�Thread�ࡣ
	//��дrun������
	public void run(){
		String name = Thread.currentThread().getName();
		long id =  Thread.currentThread().getId();
		int priority =Thread.currentThread().getPriority();//���ȼ�Ĭ����5
		System.out.println("name: "+name+" id:"+id+" priority:"+priority);
		for(int i=1;i<=1000;i++){//��ӡ1~100֮�������
			if(i%2!=0){
				System.out.println("name: "+name+" id:"+id+" num:"+i);
			}
		}
	}
	
	public static void main(String[] args) {
		//�����̣߳������߳̽���ִ�У�
		Thread thread1 = new ThreadDemo();//���岢ʵ����һ�����̣߳�
		thread1.setName("�߳�1");
		thread1.setPriority(10);
		//thread1���ó�Ϊ��̨�̣߳������߳̽��������߳̾ͽ�����
		//�������������߳̾���һ���ػ��߳�Ҳ�к�̨�߳�
		thread1.setDaemon(true);		
		thread1.start();//��������
		
		Thread thread2 = new ThreadDemo();//���岢ʵ����һ�����̣߳�
		thread2.setName("�߳�2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start();//����������
		
		//���ȼ���
		int priority =Thread.currentThread().getPriority();
		System.out.println("main method priority "+priority);
		//�߳����ȼ� 1~10 ��1��С��10���Ĭ��5. JVM�ó���Ա�������õ����ȼ���
		
	}

}
