package demo1;

public class Test1 {
    //non-static ���������÷�ʽ��ʹ�ö���ʵ�������ã�
	public  void shout(){	
		System.out.println("��~");
	}
	
	public static void main(String[] args){
		Test1 t1= new Test1();
		t1.shout();
		Test1 t2= new Test1();
		t2.shout();
		//Test1.shout();
	}

	//�ڲ��࣡ �������׿���
	public class Test2 {
	}
}

