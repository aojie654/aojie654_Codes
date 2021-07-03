package demo1;
//�򵥹���ģʽ ����1
public class SendFactory {
	//�����������Ҫ�����ͣ����ز�ͬ����ķ����ߣ�
	Sender s = new MailSender();
	
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("��������ȷ�����ͣ�");
		}
		return null;
	}
	public static void main(String[] args){
		
		SendFactory factory = new SendFactory();
		Sender sender =factory.produce("mail");
		sender.send();
		Sender sender2 =factory.produce("sms");
		sender2.send();
		Sender sender3 =factory.produce("smss");
		if(sender3!=null){
			sender3.send();
		}
	}
}
