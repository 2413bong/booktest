package test.test.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, List<String>> bookmap = new HashMap<String, List<String>>();
		String myBookNames = bookDAO.getUserBookName(userID).getMyBook();
		String[] myBookName =myBookNames.split(",");
		int max = myBookName.length;
		List<String> bookList = new ArrayList<String>();
		for(int i =0;i<max;i++) {
			bookList.add(myBookName[i]);
		}
		bookmap.put("booklist", bookList);
		return bookDAO.getBookList(bookmap);
		
	}
	
}
