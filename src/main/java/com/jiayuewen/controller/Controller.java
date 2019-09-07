package com.jiayuewen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiayuewen.bean.Appointment;
import com.jiayuewen.bean.Book;
import com.jiayuewen.bean.Student;
import com.jiayuewen.service.AppointmentService;
import com.jiayuewen.service.BookService;
import com.jiayuewen.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private StudentService ss;
	
	@Autowired
	private BookService bs;
	
	@Autowired
	private AppointmentService as;
	
	//不用修改
	@RequestMapping("login")
	public String login(Model model,HttpServletRequest request) {
		//当传过来的账号或密码不能转化为long型数据时，捕捉错误
		try {
			long studentId = Long.parseLong(request.getParameter("studentId"));
			long password = Long.parseLong(request.getParameter("password"));
			Student student = ss.getStudent(studentId, password);
			if(student != null) {
				HttpSession session = request.getSession();
			    session.setAttribute("student", student);
				return "redirect:goIndex";
			}else {
				request.setAttribute("errorMsg","学号或密码错误!!!");
				return "forward:login.jsp";	
			}
		}catch(Exception e) {
			request.setAttribute("errorMsg","学号或密码错误!!!");
			return "forward:login.jsp";
		}
	}
	
	//不用修改
	//登陆后进行跳转，防止刷新后重复提交表单
	@RequestMapping("goIndex")
	public String goIndex() {
		return "index";
	}
	
	//
	@RequestMapping("detail")
	public String detail(long bookId, HttpServletRequest request, Model model) {
		Book book = bs.getBookById(bookId);
		model.addAttribute("book", book);
		//检查是否已预约
		Student student = (Student)request.getSession().getAttribute("student");
		long studentId = student.getStudentId();
		//预约同一本书第二次时捕捉错误。一本书只能预约一次
		List<Appointment> appoint = as.getAppointByStudentId(studentId);
		if(appoint != null) {
			for(int i = 0; i < appoint.size(); i++) {
				//判断是否有bookId相同的书，及已经预约过的书
				if(appoint.get(i).getBookId() == bookId) {
					model.addAttribute("error", "您已经预约过了");
					break;
				}
			}
		}
		
		model.addAttribute("bookId", bookId);		
		return "detail";
	}  
	
	//不用修改
	@RequestMapping("search")
	public String search(String name,Model model) {		
		List<Book> books = bs.getBookByName(name);
		model.addAttribute("list",books);		
		return "list";
	}
	
	//不用修改
	@RequestMapping("appoint")
	public String appoint(HttpServletRequest request, Model model) {		
		Student student = (Student)request.getSession().getAttribute("student");
		long studentId = student.getStudentId();
		long bookId = Long.parseLong(request.getParameter("bookId"));
		as.appoint(bookId, studentId);
		bs.updateAppiontNo(bookId);
		return "appointSuccess";
	}
	
	//不用修改
	@RequestMapping("bookList")
	public String bookList(Model model) {
		List<Book> books = bs.getAllBook();
		model.addAttribute("list",books);
		return "list";
	}
	
	//不用修改
	@RequestMapping("appointBookList")
	public String appointBookList(HttpServletRequest request,Model model) {
		Student student = (Student)request.getSession().getAttribute("student");
		long studentId = student.getStudentId();
		List<Appointment> appointList = as.getAppointByStudentId(studentId);
		model.addAttribute("appointList", appointList);
		//根据预约的书的bookId查找书的信息，返回到前端预约列表
		List<Book> bookList = new ArrayList<Book>();
		for(int i = 0; i < appointList.size(); i++) {
			Book book = bs.getBookById(appointList.get(i).getBookId());
			bookList.add(book);
		}
		model.addAttribute("bookList", bookList);
		
		return "appointBookList";
	}
	
	//不用修改
	@RequestMapping("cancelAppoint")
	public String cancelAppoint(HttpServletRequest request, Model model) {
		Student student = (Student)request.getSession().getAttribute("student");
		long studentId = student.getStudentId();
		long bookId = Long.parseLong(request.getParameter("bookId"));
		bs.updateAddAppiontNo(bookId);
		as.deleteAppoint(bookId, studentId);
		model.addAttribute("bookId", bookId);
		return "forward:detail";
	}
	
	//不用修改
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) throws Exception {
	    HttpSession session = request.getSession();
	    session.invalidate();
	    return "redirect:login.jsp";
	}
	
	
	
}










