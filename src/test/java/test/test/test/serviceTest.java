package test.test.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import test.test.test.vo.Book;
import test.test.test.vo.User;

public class serviceTest {
	
	 private static List<Book> BOOK_LIST = new ArrayList<Book>();
	   static {
	      for(int i=1;i<=100;i++) {
	    	  if(i%10==0) {
	    		  BOOK_LIST.add(new Book(i,"book"+i,"free"));
	    	  }else {
	    		  BOOK_LIST.add(new Book(i,"book"+i,"expensive"));
	    	  }
	    	  
	      }
	   }
	@Test
	public void test() {
		User user1 = new User(1, "user1", "userPassword", "book20,book21");
		String myBookNames = user1.getMyBook();
		String[] myBookName = myBookNames.split(",");
		List<Book> mybookList = new ArrayList<Book>();
		for (int i = 0; i < BOOK_LIST.size(); i++) {
			for (int j = 0; j < myBookName.length; j++) {
				if (BOOK_LIST.get(i).getBookName().equals(myBookName[j])) {
					mybookList.add(BOOK_LIST.get(i));
				}
			}
		}
		assertEquals(mybookList.size(), 2);
	}

}
