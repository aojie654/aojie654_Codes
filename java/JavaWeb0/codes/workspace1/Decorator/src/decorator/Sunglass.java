package decorator;

public class Sunglass extends ClothDecorator{
	public void show(){
		//����ִ�б����Լ���component��show������
		System.out.println("���ŵİ�����̫������");
		super.show();//�ȵ��ø����Լ���show������Ҳ����ִ�б����Լ���component��show������
		System.out.println("������̫������ᣡ");
	}
}
