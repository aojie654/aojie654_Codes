package version2;

public class Teacher extends Subject{
	public void change(String newState){
        this.setState(newState);
        System.out.println("��״̬Ϊ��" + newState);
        //״̬�����ı䣬֪ͨ�����۲���
        this.inform(newState);
        //��ʦ���������幤����
    }
}
