package thread;
//����1 ��ʵ��Runnable�ӿ�
public class RunThread2 implements Runnable{
	
	//�����һ���̺߳����߳�����������
	public static void main(String[] args) {
		//����һ���̣߳�Thread���ʵ����
		//��ʵ����Runnable�ӿڵı���ʵ����Ϊ�������룡
		Thread thread1 = new Thread(new RunThread2());//�����߳�1
		thread1.start();//���ˣ�ִ��run�������ܹ���Ϊ�߳��Լ������ˣ�
		Thread thread2= new Thread(new RunThread2());//�����߳�2
		thread2.start();
		for(int i=0;i<100;i++){
			System.out.println("Main method :"+ i);
		}
	}

	@Override
	public void run() {
	//�̵߳Ĺ�������ȫ��run�����У�
		//����1+2+3�ӵ�100
		String name =Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
		int sum =0;
		for(int i=1;i<=100;i++){
			sum = sum+i;
			System.out.println(id+" "+name+" thread run: sum"+i+"="+sum);

		}
	}

}
