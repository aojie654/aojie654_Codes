package demo4;

public class Cat extends Animal{
	//���캯������Ա�����������Ŀɼ��ȱ����ƣ�
	public static String type="è";
	public Cat(String name){
		super(name);
	}
	public Cat(){
		super("С��");//���ø���Ĺ��캯����
	}
	public String getSound() {
		return "��~";
	}

	
	public void catchRice(){
		System.out.println("ץ��һֻ���");
	}
}

