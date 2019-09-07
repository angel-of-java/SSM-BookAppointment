package com.jiayuewen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiayuewen.bean.Book;
import com.jiayuewen.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	public BookMapper getBookMapper() {
		return bookMapper;
	}

	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@Override
	public List<Book> getAllBook() {		
		return bookMapper.getAllBook();
	}

	@Override
	public Book getBookById(long bookId) {
		return bookMapper.selectByPrimaryKey(bookId);
	}

	@Override
	public List<Book> getBookByName(String name) {
		return bookMapper.getBookByName(name);
	}

	@Override
	public int getBookCountByBookId(long bookId) {
		return bookMapper.getBookCountByBookId(bookId);
	}

	@Override
	public int getBookCount() {
		int count = 0;
		List<Book> books = getAllBook();
		for (int i = 0; i < books.size(); i++) {
			count = count + books.get(i).getNumber();
		}
		return count;
	}

	@Override
	public void updateAppiontNo(long bookId) {
		bookMapper.updateAppointNo(bookId);		
	}

	@Override
	public void updateAddAppiontNo(long bookId) {
		bookMapper.updateAddAppointNo(bookId);			
	}

}
