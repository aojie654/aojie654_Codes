package adapter1;
//��ҵ���ڶ������������������ϣ���ɶԵ�ѹ�����乤����
//�ڴ˻����ϣ�ʵ�ֵ�Դ��ѹ�����䡣�й���220V.�����������110V
//ʹ����������ɵ�ѹ���乤�����ṩ220V��ѹ����������110V*2
public class Laptop {
	private String brand;
	private Target plug2;
	public Laptop(String brand,Target plug){
		this.brand=brand;
		this.plug2=plug;
	}
	public void setTarget(Target plug){
		this.plug2=plug;
	}
	public void work(){
		System.out.println("���ϵ�Դ��");
		plug2.socket2();
		System.out.println("ʵ�ʹ�����ѹ"+plug2.volt220());
		System.out.println(brand+" ���ԣ���ʼ������");
	}
	public static void main(String[] args){
		
		//���й�ʹ�ã�
		Target chineseSocket = new ChineseSocket();
		Laptop book = new Laptop("lenovo",chineseSocket);
		book.work();
		System.out.println("--------------------");
		//������ʹ��
		Adaptee americanSocket = new AmericanSocket();
		Adapter adapter = new Adapter(americanSocket);
		book.setTarget(adapter);//ʹ�����������߰�
		book.work();
	}
}
