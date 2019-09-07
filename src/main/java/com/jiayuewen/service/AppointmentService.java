package com.jiayuewen.service;

import java.util.List;

import com.jiayuewen.bean.Appointment;

public interface AppointmentService {

	/**
	 * 查看某学生所有图书的预约记录
	 * @param studentId
	 * @return
	 */
	List<Appointment> getAppointByStudentId(long studentId);
	
	/**
	 * 预约图书
	 * @param bookId
	 * @param studentId
	 */
	void appoint(long bookId, long studentId);
	
	/**
	 * 取消预约图书
	 * @param bookId
	 * @param studentId
	 */
	void deleteAppoint(long bookId, long studentId);
}
