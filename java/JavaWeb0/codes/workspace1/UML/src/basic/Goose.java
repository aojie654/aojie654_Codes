package basic;

public class Goose extends Bird implements IFly{
	public Goose(){
		System.out.println("��һֻ����");
	}
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		System.out.println("�����µ�����������");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("���������Ϸɣ�");
	}

}
