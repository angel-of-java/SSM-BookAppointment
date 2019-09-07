package com.jiayuewen.service;

import java.util.List;

import com.jiayuewen.bean.Book;

public interface BookService {

	/**
	 * 获取所有书
	 * @return 
	 */
	List<Book> getAllBook();

	/**
	 * 根据bookId查询书
	 * @param bookId
	 * @return
	 */
	Book getBookById(long bookId);
	
	/**
	 * 通过书名查书
	 * @param name
	 * @return
	 */
	List<Book> getBookByName(String name);
	
	/**
	 * 查看库存还有几本bookId的书
	 * @param bookId
	 * @return
	 */
	 int getBookCountByBookId(long bookId);
	 
	 /**
	  * 查看库存一共还有多少书
	  * @return
	  */
	 int getBookCount();
	 
	 /**
	  * 被预约书的可预约数量减一
	  * @param bookId
	  */
	 void updateAppiontNo(long bookId);
	 
	 /**
	  * 被取消的预约的书的可预约数量加一
	  * @param bookId
	  */
	 void updateAddAppiontNo(long bookId);
}
