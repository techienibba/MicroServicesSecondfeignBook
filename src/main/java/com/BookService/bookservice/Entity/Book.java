package com.BookService.bookservice.Entity;

import java.util.List;

import com.BookService.bookservice.ExternalServices.Ratings;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Book {
	
	
	private int bookid;
	private String bookname;
	private int userid;
	private List<Ratings> ratings;

}
