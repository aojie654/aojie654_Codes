package basic;

public class Penguin extends Bird{
	//climate������ǹ�����ϵ��
	private Climate climate;
	
	//������������ã�
	public void setClimate(Climate climate) {
		this.climate = climate;
	}
	
	public Penguin(){
		System.out.println("��һֻ���");
	}
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		if(climate.intro.equals("�ϼ�")){
			System.out.println("�������䣬����µ���");
		}else{
			System.out.println("�����������䣬����޷��µ���");
		}
	}

}
