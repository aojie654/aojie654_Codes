package service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Book;
import bean.BookCategory;
import dao.BookCategoryDAO;
import dao.BookDAO;

/**
 * �������ڵõ�ͼ��ͷ�����Ϣ
 * 
 * 
 */ 
public class BookService {
	
	/**
	 * �������ͼ������б�
	 * 
	 * @return List<BookCategory> ͼ������б�
	 */
	public List<BookCategory>  getCategoryList(){
		
		List<BookCategory> categoryList;
		BookCategoryDAO bcdao = new BookCategoryDAO();
		categoryList = bcdao.querryCategory();
		return categoryList;
	}
	
	
	/**
	 * ���ͼ�����
	 * 
	 * @return 
	 */
	public void  addCategory(String categoryName){
		
		BookCategoryDAO bcdao = new BookCategoryDAO();
		BookCategory bc = bcdao.querryUseName(categoryName);

		if (bc.getName() == null) {
			bc.setName(categoryName);
			bcdao.insert(bc);
		}
	}
	
	/**
	 * �޸�ͼ�����
	 * 
	 * @return 
	 */
	public void  modifyCategory(HttpServletRequest request,HttpServletResponse response){
		
		try {
			request.setCharacterEncoding("utf-8");
			
			String categoryName = request.getParameter("categoryName");
			int categoryId = Integer.parseInt(request.getParameter("categoryId"));
	
			BookCategoryDAO bcdao = new BookCategoryDAO();
			BookCategory bc = bcdao.querryUseName(categoryName);
			if(bc.getName()==null){
			
				bc.setId(categoryId);
				bc.setName(categoryName);
	
				bcdao.update(bc);
			}else{
				request.setAttribute("Error", "������������Ϣ���������ٴ�����");
				RequestDispatcher rd=request.getRequestDispatcher("modifyCategory.jsp");
				rd.forward(request, response);
			}
		
			response.sendRedirect("categoryManage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	/**
	 * ����ɾ��һ��ͼ�����
	 * 
	 * @param request
	 * @param response
	 */
	public void deleteCategory(String  id) {
		BookCategoryDAO bcdao = new BookCategoryDAO();
		bcdao.delete(Integer.valueOf(id).intValue());
	}
	
	/**
	 * �������ͼ����Ϣ
	 * 
	 * @return List<Book> ͼ���б�
	 */
	public List<Book>  getBookList(){
		List<Book> bookList;
		BookDAO bookdao = new BookDAO();
		bookList = bookdao.querryAllBooks();
		return bookList;
	}
	
	/**
	 * �������ָ��ͼ����Ϣ
	 * 
	 * @param bookId ͼ��ID
	 * @return Book ͼ��
	 */
	public Book  getBook(String bookId){
		Book book;
		BookDAO bookdao = new BookDAO();
		book = bookdao.querryBookbyId(Integer.parseInt(bookId));
		return book;
	}
	
	/**
	 * �������ָ��ͼ�������Ϣ
	 * 
	 * @param book ͼ��
	 * @return Book ָ��ͼ�����
	 */
	public String getOneBookCategory(Book book){
		String categoryName="" ;
		List<BookCategory> categoryList=getCategoryList();
		for(BookCategory category:categoryList){
			if(category.getId()==book.getCategoryId()){
				categoryName =category.getName();
			}
		}
		return categoryName;
	}
}
