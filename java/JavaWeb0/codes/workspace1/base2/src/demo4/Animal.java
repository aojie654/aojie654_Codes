package demo4;

public abstract class  Animal {
	private String sound;
	public String getName() {
		return name;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}
	private String name;
	private int shoutNum;
	public int getShoutNum() {
		return shoutNum;
	}

	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	
	public Animal(){
		name="����";
		this.shoutNum=3;
		this.sound="~";
	}
	
	public Animal(String name){
		this.name=name;
		this.shoutNum=3;
	
	}
	public void shout(){
	//	System.out.println("���Ƕ��");
		
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("��Һã�����һֻ"+Cat.type+"�ҽ�"+this.getName()+"��"+shoutStr);
		
	}//���󷽷���������ô�в�֪�����������У�
}
