package thread2;
//�߳�ʵ�����ַ�ʽ1 
//�ö������ʵ��Runnable�ӿ�
public class RunThread implements Runnable{
     
	public static void main(String[] args) {
		//ʵ�����̣߳� �����߳�����������
		//ʵ����Thread����󣬵��ù��캯��������ʵ����Runnable�ӿڵ�
		//������Ϊ�������ݽ�Thread���캯����
		Thread thread = new Thread(new RunThread());
		//thread.run();//�򵥵�ִ��run�������ѣ�
		thread.start();//���߳�����������ִ��run������
		String name = Thread.currentThread().getName();//�õ���ǰ�߳�Ҳ����main�߳�����
		long id = Thread.currentThread().getId();//�õ���ǰ�߳�Ҳ����main�߳�id
		for(int i=0;i<=1000;i++){
			System.out.println("id:"+id+" name:"+name+" main i:"+i );
		}	
	}
	
	@Override
	public void run() {
		//�߳�ִ�еľ��巽����������Ҫ���������档
		String name = Thread.currentThread().getName();//�õ���ǰ�߳�ʵ������
		long id = Thread.currentThread().getId();//�õ���ǰ�߳�ʵ��id
		int sum = 0;
		
		for(int i=0;i<=1000;i++){
			sum = sum + i;
			System.out.println("id:"+id+" name:"+name+" thread sum : i:"+i+" "+sum);
		}
		
	}

}
