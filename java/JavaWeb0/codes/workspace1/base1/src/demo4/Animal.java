package demo4;

public abstract class Animal {
		//��Ա����
		private String name;
		private int shoutNum;
		public String getName() {
			return name;
		}

		public int getShoutNum() {
			return shoutNum;
		}

		public void setShoutNum(int shoutNum) {
			this.shoutNum = shoutNum;
		}
		
		public Animal(){
			this.name="����";//����name ��name����һ��������
			this.shoutNum=3;
		}
		
		public Animal(String name){
			this.name=name;//����name ��name����һ��������
			this.shoutNum=3;
		}
		
		//non static��������ʵ����� Test1��Ķ������t1
		public void shout(){
			System.out.println("........");
		}
}
