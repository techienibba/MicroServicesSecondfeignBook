package com.BookService.bookservice.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookService.bookservice.Entity.Book;
import com.BookService.bookservice.ExternalServices.Ratings;
import com.BookService.bookservice.Service.RatingService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private RatingService ratingservice;
	
	Book book1;
	Book book2;
	public List<Book> books;
	
	@GetMapping
	public List<Book> getbooks()
	{
		book1 = new Book();
		book1.setBookid(1);
		book1.setUserid(1);
		book1.setBookname("The Lion");
		
		book2 = new Book();
		book2.setBookid(2);
		book2.setUserid(2);
		book2.setBookname("The Tiger");
		
		books = new ArrayList<>();
		
		books.add(book1);
		books.add(book2);
		return books;
		
		
		
		
	}
	
	@GetMapping("/{bookid}")
	public Book getbookbyid(@PathVariable("bookid") int bookid)
	{
		List<Ratings>  ratingform = new ArrayList<>();

		book1 = new Book();
		book1.setBookid(1);
		book1.setUserid(1);
		book1.setBookname("The Lion");
	
		
		book2 = new Book();
		book2.setBookid(2);
		book2.setUserid(2);
		book2.setBookname("The Tiger");
		
		
		books = new ArrayList<>();
		
		books.add(book1);
		books.add(book2);
		Book book=books.stream().filter(e -> e.getBookid()==bookid).findAny().get();
		ratingform.add(ratingservice.getratingbyid(bookid));
		book.setRatings(ratingform);
		return book;
	}
	
	

}
