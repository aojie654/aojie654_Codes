package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;

//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.*;

import dao.*;

/**
 * Index�ฺ����δ��½�û��������
 *
 */
public class Index extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public Index() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		doPost(request,response);
	}
	
	/**
	 * ���ڲ�ѯ���ݿ��е�������
	 * @param request
	 * @param response
	 */
	/*public void querryAllBooks(HttpServletRequest request, HttpServletResponse response){
		try{
		BookDAO bdao = new BookDAO();
		List<Book> al = bdao.querryAllBooks();
		request.setAttribute("allBooks", al);
		request.getRequestDispatcher("../userView/userpage.jsp").forward(request, response);
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}*/
	

	
	/**
	 * ���ܲ�ͬ����������Ӧ��ͬ�Ĺ���
	 * @throws IOException 
	 */
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		if (request.getParameter("requestType").equals("userLogin")) {

			userLogin(request, response);
			
		}
		if (request.getParameter("requestType").equals("adminLogin")) {

			adminLogin(request, response);
			
		}
		
		/*if(request.getParameter("requestType").equals("homePage")){
			this.querryAllBooks(request, response);
		}
		if(request.getParameter("requestType").equals("left")) {
			setCateBook(request,response);
		}
		
		if(request.getParameter("requestType").equals("right")) {
			setBook(request,response);
		}*/
		if(request.getParameter("requestType").equals("register")){
			
			register(request, response);
		}
	}
	
	/**
	 * �û���½ʱ���û���ݵ���֤
	 * @param request
	 * @param response
	 */
	public void userLogin(HttpServletRequest request, HttpServletResponse response) {

		
		response.setContentType("UTF-8");
		HttpSession session;
		try {
		session = request.getSession();
		String username = new String(request.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
		String password = request.getParameter("password");

		User u = new User();
		u.setName(username);
		u.setPass(password);
		UserDAO udao = new UserDAO();
	
			request.setCharacterEncoding("UTF-8");
			
			if (udao.userTest(u)) {
				
				User userInfo = udao.querryUserbyName(username);
				session.setAttribute("userInfo",userInfo);
				
				response.sendRedirect("../userView/userPage.jsp");
				//request.getRequestDispatcher("").forward(request, response);
				//this.querryAllBooks(request, response);
			} else {
				request.getRequestDispatcher("../userView/userLogin.jsp").forward(
						request,response);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * ����Ա��½ʱ���ڶ���ݵ���֤
	 * 
	 * @param request
	 * @param response
	 */
	public void adminLogin(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		// ��JSP�����л����Ϣ
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		// ����userDAO��ʵ��
		UserDAO userdao = new UserDAO();

		// �жϹ���Ա�ʺ���Ϣ
		try {
			if (userdao.adminTest(name, password)) {
				User user = new User(); 
				user.setName(name);
				user.setPass(password);
				session.setAttribute("admin", user);
				request.getRequestDispatcher("../managerView/adminMain.jsp").forward(request, response);

			} else {
				request.getRequestDispatcher("../userView/adminLogin.jsp").forward(request, response);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ѯͼ���������µ��屾��
	 * @param request
	 * @param response
	 */
	public void setCateBook(HttpServletRequest request, HttpServletResponse response) {
		List<BookCategory> categoryList;
		BookCategoryDAO bcdao = new BookCategoryDAO();
		categoryList = bcdao.querryCategory();
		request.setAttribute("category", categoryList);
	
		List<Book> bookList;
		BookDAO bookdao = new BookDAO();
		bookList = bookdao.querryAllBooks();
		request.setAttribute("books", bookList);
		
		try {
			request.getRequestDispatcher("../index.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ѯ���µ�5���鲢����ʾ����
	 * @param request
	 * @param response
	 */
	public void setBook(HttpServletRequest request, HttpServletResponse response) {
		List<Book> bookList;
		BookDAO bookdao = new BookDAO();
		bookList = bookdao.querryAllBooks();
		request.setAttribute("books", bookList);
		
		try {
			request.getRequestDispatcher("../index.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ���ڴ���һ���û���ע����Ϣ,����Ϣ���뵽���ݿ�
	 * @param request
	 * @param response
	 */
	public void register(HttpServletRequest request, HttpServletResponse response) {
		
		try{
			//request.setCharacterEncoding("UTF-8");
			//response.setCharacterEncoding("UTF-8");
		//��JSP��ȡ���û�����Ϣ
		String name = new String(request.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
		String pass =request.getParameter("password");
		String realName =new String(request.getParameter("realname").getBytes("ISO-8859-1"),"UTF-8");
		String sex = new String(request.getParameter("gender").getBytes("ISO-8859-1"),"UTF-8");
		int age;
		if(request.getParameter("age")==null){
			
			age = 0;
		}else{
			
			age = Integer.parseInt(request.getParameter("age"));
		}
		
		String email = new String(request.getParameter("email").getBytes("ISO-8859-1"),"UTF-8");
		String phone = request.getParameter("connectnumber");
		String address = new String(request.getParameter("address").getBytes("ISO-8859-1"),"UTF-8");
		
		//��ϵͳ�л��ע������
		Calendar cal = Calendar.getInstance();
		java.util.Date utilDate=cal.getTime();
		Date registerDate =new Date(utilDate.getTime());
		//Date registerDate = new Date(cal.get(Calendar.YEAR) - 1900, cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
		//ǿ�������û�����Ϊ�û���
		int role = 1;
		int id = 0;
		//���û���Ϣ��װ��USER����
		User user = new User(id,name,pass,sex,age,role,realName,phone,email,address,registerDate);
		//UserDAOʵ����
		UserDAO ud = new UserDAO();
		//�ж��û����Ƿ����
			if((ud.querryUserbyName(name))==null){
				ud.insertUser(user);	
				response.sendRedirect("../userView/registSuccess.jsp");
			}else{
				String alert ="���û����Ѵ���";
				if(pass == null){
					alert = "���벻��Ϊ��";
					request.setAttribute("alert", alert);
				}
				//���û�������,���û���ʾ,FORWARD��ע��ҳ��
				
				request.setAttribute("alert", alert);
				request.getRequestDispatcher("../userView/register.jsp").forward(request, response);		
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(ServletException se){
			se.printStackTrace();
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
