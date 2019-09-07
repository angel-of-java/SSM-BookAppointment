package com.jiayuewen.service;

import com.jiayuewen.bean.Student;

public interface StudentService {

	/**
	 * 根据学号和密码查询学生
	 * @param studentId
	 * @param password
	 * @return
	 */
	Student getStudent(long studentId, long password);
	
}
