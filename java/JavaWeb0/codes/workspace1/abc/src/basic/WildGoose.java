package basic;

public class WildGoose extends Bird implements IFly{
	
	public WildGoose(){
		System.out.println("��һֻ���㣡");
	}
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		this.breed();
		System.out.println("�����µ�����������");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("���������Ϸɣ�");
	}
}
