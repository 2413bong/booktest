package test.test.test.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.test.test.vo.Book;
import test.test.test.vo.User;

@Repository
public class BookDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public Book getBookList(String myBookName){
		return sqlSessionTemplate.selectOne("SQL.BookSQL.getBookList",myBookName);
		
	}
	public User getUserBookName(String UserID){
		return sqlSessionTemplate.selectOne("SQL.UserSQL.getUser",UserID);
		
	}
	
}
