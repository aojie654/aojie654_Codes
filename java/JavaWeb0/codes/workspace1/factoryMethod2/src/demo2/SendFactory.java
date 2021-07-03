package demo2;
//�򵥹���ģʽ ����2 ���ò�ͬ��������ʵ������
public class SendFactory {
	//�����������Ҫ�����ͣ����ز�ͬ����ķ����ߣ�
	
	public Sender produceMailSender(){
		return new MailSender();
		//ʵ�ʿ����У�����һ��ʵ��Ҫ��Ҫ�ܶ�����
	}
	public Sender produceSmsSender(){
		return new SmsSender();
		//ʵ�ʿ����У�����һ��ʵ��Ҫ��Ҫ�ܶ�����
	}
	public static void main(String[] args){
		
		SendFactory factory = new SendFactory();
		Sender sender1=factory.produceMailSender();
		sender1.send();
		Sender sender2=factory.produceSmsSender();
		sender2.send();
	}
}
