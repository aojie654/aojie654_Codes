package demo3;

public abstract class  Animal {
	private String type;
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
		this.type="δ֪";
	}
	
	public Animal(String name,String sound,String type){
		this.name=name;
		this.shoutNum=3;
		this.sound=sound;
		this.type=type;
	}
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shoutStr.append(this.sound);
		}
		System.out.println("��Һã�����һֻ"+this.type+"�ҽ�"+this.name+"��"+shoutStr);
	}
}
