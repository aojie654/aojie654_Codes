package demo3;
//�򵥹���ģʽ ����3 ��̬�򵥹���ģʽ ƽʱ���õķ�ʽ��
public class SendFactory {
	//�����������Ҫ�����ͣ����ز�ͬ����ķ����ߣ�
	
	public static Sender produceMailSender(){
		return new MailSender();
		//ʵ�ʿ����У�����һ��ʵ��Ҫ��Ҫ�ܶ�����
	}
	public static Sender produceSmsSender(){
		return new SmsSender();
		//ʵ�ʿ����У�����һ��ʵ��Ҫ��Ҫ�ܶ�����
	}
	public static void main(String[] args){
		//ʹ������������Ʒ��
		Sender sender1=SendFactory.produceMailSender();
		sender1.send();
		Sender sender2=SendFactory.produceSmsSender();
		sender2.send();
	}
}
