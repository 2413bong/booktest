package test.test.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.test.test.dao.BookDAO;
import test.test.test.vo.Book;
import test.test.test.vo.User;


@Service
public class BookService {
	@Autowired
	private  BookDAO bookDAO;
	
	public List<Book> bookList(String userID){
		String myBookNames = bookDAO.getUserBookName(userID).getMyBook();
		String[] myBookName =myBookNames.split(",");
		int max = myBookName.length;
		List<Book> bookList = new ArrayList<Book>();
		for(int i =0;i<max;i++) {
			bookList.add(bookDAO.getBookList(myBookName[i]));
		}
		return bookList;
		
	}
	
}
