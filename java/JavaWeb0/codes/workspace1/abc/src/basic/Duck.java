package basic;

public class Duck extends Bird{
	public Duck(){
		System.out.println("��һֻѼ�ӣ�");
	}
	@Override
	public void layEggs() {
		this.breed();
		// TODO Auto-generated method stub
		System.out.println("Ѽ���µ����¸¸£�");
	}
}
