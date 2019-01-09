package test.test.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.test.test.vo.Book;
import test.test.test.vo.User;

@Repository
public class BookDAO {
	
	/*@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	*/
	/*public List<Book> getBookList(Map<String, List<String>> booklist){
		return sqlSessionTemplate.selectList("SQL.BookSQL.getBookList",booklist);
		
	}
	public User getUserBookName(String UserID){
		return sqlSessionTemplate.selectOne("SQL.UserSQL.getUser",UserID);
		
	}*/

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
      
	public List<Book> getBookList(List<String> bookList){
		List<Book> list = new ArrayList<Book>();
		for(int j = 0;j<BOOK_LIST.size();j++) {
			for(int i = 0; i<bookList.size();i++) {
				if(BOOK_LIST.get(j).getBookName().equals(bookList.get(i))) {
					list.add(BOOK_LIST.get(j));
				}
			}
		}
		return list;
		}
		
	
	public User getUserBookName(String userID){
		User user1 = new User(1, "user1", "user1", "book1,book10");
		User user2 = new User(1, "user2", "user2", "book2,book20,book40,book60");
		User user3 = new User(1, "user3", "user3", "book3,book30,book60");
			if(userID.equals(user1.getUserID())){
				return user1;
			}else if(userID.equals(user2.getUserID())){
				return user2;
			}else if(userID.equals(user3.getUserID())){
				return user3;
			}else {
				return null;
			}
		
				
		
	}
	
}

