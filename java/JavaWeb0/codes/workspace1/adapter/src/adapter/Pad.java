package adapter;

public class Pad {
	private Target plug;//�в���
	private String brand;//
	public Pad(String str,Target target){
		this.brand=str;
		plug = target;
	}
	public void work(){//Ҫ������Ҫ�Ȳ��ϵ�Դ����2��ͷ���������
		plug.plug2();
		System.out.println(brand+" pad �����˵�Դ����ʼ������");
	}
	public void  setPlug(Target plug){
		this.plug=plug;
	}
	public static void main(String[] args){
		//���й����ԣ�
		Pad pad = new Pad("lenovo",new ChineseSocket());
		pad.work();
		System.out.println("����ȥ���������ʼǱ�Ҫʹ������������");
		//������ʹ����������
		AmericanScoket as=new AmericanScoket();
		pad.setPlug(new Adapter(as));//ʹ������������������������
		pad.work();
		
		//������ģʽ�� 
		
	}
}
