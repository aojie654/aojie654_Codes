package observer2;

public class Client {
	public static void main(String[] args){
		Boss boss =new Boss();
		Observer o1 = new NBAObserver("С��");
		Observer o2 = new GameObserver("С��");
		boss.attach(o1);//�󶨣�
		boss.attach(o2);
		boss.change("�ϰ���");
		boss.change("�ϰ岻��");
	}
}
