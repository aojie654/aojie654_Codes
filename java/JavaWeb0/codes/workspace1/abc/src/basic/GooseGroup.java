package basic;

public class GooseGroup {
	private WildGoose[] gooses;//��Ⱥ���д�����ɵģ��ۺϹ�ϵ��1�Զ�
	//ͨ��set��������Ⱥ���г�ʼ����Ҳ˵���˴����Ǵ��������ģ��ۺϹ�ϵ
	public void setGooses(WildGoose[] gooses) {
		this.gooses = gooses;
	}
	
	public void vFly(){
		System.out.println(this.gooses.length+"ֻ���㣬��V���ͷ�");
	}
	public void yiFly(){
		System.out.println(this.gooses.length+"ֻ���㣬��һ���ͷ�");
	}
}
