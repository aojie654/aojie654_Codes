package version2;
//Student����ǹ۲��ߡ�
public abstract class Observer {
	private String name;
	public Observer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//����updateΪ���󷽷���
	public abstract void update(String newState);
}
