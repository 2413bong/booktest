package test.test.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import test.test.test.service.BookService;
import test.test.test.vo.Book;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/bookselect/{userID}", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> bookList(@PathVariable String userID) {
		return bookService.bookList(userID);
	}
}
