package com.jiayuewen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiayuewen.bean.Appointment;
import com.jiayuewen.mapper.AppointmentMapper;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentMapper appointmentMapper; 
	
	@Override
	public List<Appointment> getAppointByStudentId(long studentId) {
		return appointmentMapper.getAppointByStudentId(studentId);
	}

	@Override
	public void appoint(long bookId, long studentId){
		appointmentMapper.appoint(bookId, studentId);
	}

	@Override
	public void deleteAppoint(long bookId, long studentId){
		appointmentMapper.deleteAppoint(bookId, studentId);
		
	}

}
