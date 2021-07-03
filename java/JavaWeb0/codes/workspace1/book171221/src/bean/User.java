package bean;
//jsp��display.jsp+doxxx.jsp��+javabean����ģʽ��
//jsp(display.jsp)+servlet(doxxx.jsp) +javaBean(����bean+ҵ��bean)����ģʽ��
// java + js +html5 +mysql
import java.util.Calendar;
import java.sql.Date;
/**
 * �û���
 */
public class User {
	
	/**
	 * ӵ�����
	 */
	private int id;
	
	/**
	 * �û�����
	 */
	private String name;
	
	/**
	 * �û�����
	 */
	private String pass;
	
	/**
	 * �û��Ա�
	 */
	private String sex;
	
	/**
	 * �û�����
	 */
	private int age;
	
	/**
	 * �û�����ݣ�����Ա������ͨ�û�
	 */
	private int role;
	
	/**
	 * ��ʵ����
	 */
	private String realName;
	
	/**
	 * ��ϵ�绰
	 */
	private String phone;
	
	/**
	 * �����ʼ�
	 */
	private String email;
	
	/**
	 * ��ϵ��ַ
	 */
	private String address;
	
	/**
	 * ע������
	 */
	private Date registerDate;

	/**
	 * �޲ι��캯��
	 */
	public User() {
	}
	
	/**
	 * ���ι��캯��
	 * @param id
	 * @param name
	 * @param pass
	 * @param sex
	 * @param age
	 * @param role
	 * @param realName
	 * @param phone
	 * @param email
	 * @param address
	 * @param postcode
	 * @param registerDate
	 */
	public User(int id, String name, String pass, String sex, int age, int role, String realName, String phone, String email, String address, Date registerDate) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.role = role;
		this.realName = realName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.registerDate = registerDate;
	}
	
	public User(String id,String name,String realName, String phone, String email, 
			String address,String age,String sex) {
		super();
		this.id=Integer.valueOf(id);
		this.name = name;
		this.sex = sex;
		this.age = Integer.valueOf(age);
		this.realName = realName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public User(String name,String realName, String phone, String email, String address,String age,String sex) {
		super();
		this.name = name;
		this.pass = "123";
		this.sex = sex;
		this.age = Integer.valueOf(age);
		this.role = 1;
		this.realName = realName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		//��ϵͳ�л��ע������
		Calendar cal = Calendar.getInstance();
		java.util.Date utilDate=cal.getTime();
		this.registerDate =new Date(utilDate.getTime());

	}
	
	/**
	 * �����ϵ��ַ
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * ������ϵ��ַ
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 *  �������
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * ��������
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 *  ��õ��ʵ�ַ
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * ���õ��ʵ�ַ
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * ��ñ��
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * ���ñ��
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	// ����û���
	public String getName() {
		return name;
	}
	/**
	 * �����û���
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * �������
	 * @return
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * ��������
	 * @param pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * �����ϵ�绰
	 * @return
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * ������ϵ�绰
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * �����ʵ����
	 * @return
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * ������ʵ����
	 * @param realName
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 *  ���ע������
	 * @return
	 */
	public Date getRegisterDate() {
		return registerDate;
	}
	/**
	 *  ����ע������
	 * @param registerDate
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	/**
	 * ����û����
	 * @return
	 */
	public int getRole() {
		return role;
	}
	/**
	 * �����û����
	 * @param role
	 */
	public void setRole(int role) {
		this.role = role;
	}
	/**
	 * ����Ա�
	 * @return
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * �����Ա�
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

}
