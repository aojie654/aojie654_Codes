package demo1;
//��Ϣ���������칤����
public class SendFactory {
	//produce��������Sender��ʵ��������type
	public Sender produce(String type){
		if(type.equals("sms")){
			return new SmsSender();//����һ�����ŷ�����
		}else if(type.equals("mail")){
			return new MailSender();//����һ���ʼ�������			
		}else{
			System.out.println("��������ȷ�����ͣ�");
		}
		return null;
	}
	//���Թ���������
	public static void main(String[] args){
		SendFactory factory = new SendFactory();
		Sender mailSender=factory.produce("mail");
		mailSender.send();
		Sender smsSender=factory.produce("sms");
		smsSender.send();
		Sender sssSender=factory.produce("sss");
		sssSender.send();
	}
}
