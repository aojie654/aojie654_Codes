package basic;
public class Penguin extends Bird{
	private Climate climate;//������ϵ������������Ǳ�������ϵǿ�Ĺ�����ϵ��
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		if(this.climate.intro.equals("�ϼ�")){
			this.breed();
			System.out.println("����ǳ����䣬����µ��������ޣ�");
		}else{
			System.out.println("���򲻹����䣬����޷��µ���");
		}
	}
	public void setClimate(Climate climate) {
		this.climate = climate;
	}
	public Penguin(Climate climate) {
		super();
		this.climate = climate;
		System.out.println("��һֻ��죡");
	}
}
