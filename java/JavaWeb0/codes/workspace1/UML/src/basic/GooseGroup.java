package basic;

public class GooseGroup {
	//goose����Ⱥ����
	private Goose[] gooses;
	//ͨ��set�������롣�������Լ������������㣡
	public void setGooses(Goose[] gooses) {
		this.gooses = gooses;
	}
	//Ҳ��ͨ�����캯��������Ⱥ���ۺ�û����Ϲ�ϵǿ
	public GooseGroup(Goose[] gooses){
		this.gooses = gooses;
	}
	
	public void vshapeFly(){
		System.out.println(this.gooses.length+"ֻ���㣬��V���ͷ�");
	}
	
	public void yishapeFly(){
		System.out.println(this.gooses.length+"ֻ���㣬��һ���ͷ�");
	}
	
}
