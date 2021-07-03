package bean;

import java.sql.Date;
//javabean ���ݹ��ܿ��Է�Ϊ����bean
/**
 * ͼ����Ϣ
 */
public class Book {
	
	/**
	 * ���
	 */
	private int id;
	
	/**
	 * ����
	 */
	private String name;
	/**
	 * ��ISBN
	 */
	private String isbn;
	
	/**
	 * ����
	 */
	private String author;
	
	/**
	 * ������
	 */
	private String publishing;
	
	/**
	 * �۸�
	 */
	private float price;
	
	/**
	 * �����鵱ǰʣ��ı���
	 */
	private  int remainNum;
	
	/**
	 * ������Ŀ¼���
	 */
	private int categoryId;
	
	/**
	 * ���ݼ��
	 */
	private String introduction;
	
	/**
	 * �ϼܱ���
	 */
	private  int onSaleNum;
	
	/**
	 * �ϼ�����
	 */
	private Date onSaleDate;
	
	/**
	 * ��������
	 */
	private Date onPublishDate;
	
	/**
	 * ͼƬ·��
	 */
	private String image;
	

	public Book(int id, String name,String isbn, String author, String publishing, float price, int remainNum, int categoryId, String introduction, int onSaleNum, Date onSaleDate,Date onPublishDate,String image) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publishing = publishing;
		this.price = price;
		this.remainNum = remainNum;
		this.categoryId = categoryId;
		this.introduction = introduction;
		this.onSaleNum = onSaleNum;
		this.onSaleDate = onSaleDate;
		this.onPublishDate = onPublishDate;
		this.image = image;
	}
	
	/**
	 * ���캯��
	 *
	 */
	public Book() {
		super();
	}
	/**
	 * ����������
	 * @return
	 */
	public int getOnSaleNum() {
		return onSaleNum;
	}
	/**
	 * �����������
	 * @param onSaleNum
	 */
	public  void setOnSaleNum(int onSaleNum) {
		this.onSaleNum = onSaleNum;
	}
	
	/**
	 * ������п������
	 * @return
	 */
	public  int getRemainNum() {
		return remainNum;
	}
	
	/**
	 * ���ÿ������
	 * @param remainNum
	 */
	public  void setRemainNum(int remainNum) {
		this.remainNum = remainNum;
	}

	/**
	 * �õ�����
	 * @return
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * ��������
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * �õ�������
	 * @return
	 */
	public String getPublishing() {
		return publishing;
	}
	
	/**
	 * ���ó�����
	 * @param publishing
	 */
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	/**
	 * �õ����ID
	 * @return
	 */
	public int getCategoryId() {
		return categoryId;
	}
	
	/**
	 * �������ID
	 * @param categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	/**
	 * �õ�ID
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * ����ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * �õ�����
	 * @return
	 */
	public String getIntroduction() {
		return introduction;
	}
	
	/**
	 * ����ͼ�����
	 * @param introduction
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * �õ�����
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ��������
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * �õ��������
	 * @return
	 */
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	
	/**
	 * �����������
	 * @param onSaleDate
	 */
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	
	/**
	 * �õ�����
	 * @return
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * ���õ���
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * �õ�ISBN
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * ����ISBN
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * �õ���������
	 * @return
	 */
	public Date getOnPublishDate() {
		return onPublishDate;
	}
	
	/**
	 * ���ó�������
	 * @param onPublishDate
	 */
	public void setOnPublishDate(Date onPublishDate) {
		this.onPublishDate = onPublishDate;
	}

	/**
	 * �õ���Ƭ
	 * @return
	 */
	public String getImage() {
		return image;
	}
	
	/**
	 * ������Ƭ·��
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
