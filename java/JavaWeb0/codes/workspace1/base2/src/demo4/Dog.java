package demo4;

public class Dog  extends Animal{
	//���캯������Ա�����������Ŀɼ��ȱ����ƣ�
	private static String type="��";
	public Dog(String name){
		super(name);
	}
	public Dog(){
		super("С��");//���ø���Ĺ��캯����
	}
	
	public String getSound() {
		return "��~";
	}

}

