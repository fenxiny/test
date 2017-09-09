package com.hellojava.web.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.hellojava.business.IBookService;
import com.hellojava.entity.Book;

@Controller
public class BookHandler {
	@Autowired
	private IBookService bookService;
//	@RequestMapping("/loadAll")
//	public ModelAndView loadAll() {
//		List<Book> bookList=bookService.loadAll();
//		ModelAndView modelandView=new ModelAndView();
//		modelandView.setViewName("redirect:index");
//		modelandView.addObject("bookList", bookList);
//		//model.put("bookList", bookList);
//		//session.setAttribute("bookList", bookList);
//		//index  ”ÕºΩ‚Œˆ∆˜
//		return modelandView;
//	}
	
	@RequestMapping("/loadAll")
	public String loadAll(HttpSession session,@RequestParam(name="page",defaultValue="1")int page) {
		int displayCount=10;
		int maxPage=bookService.calcMaxPage(displayCount);
		if(page<1) {
			page=maxPage;
		}
		if(page>maxPage) {
			page=1;
		}
		session.setAttribute("page", page);
		session.setAttribute("maxPage", maxPage);
		List<Book> bookList=bookService.loadAll(page,displayCount);
		session.setAttribute("bookList", bookList);
		return "redirect:index";
	}
	@RequestMapping("/saveBook")
	public String addBook(Book b) {
		boolean bool=bookService.save(b);
		int maxPage=bookService.calcMaxPage(10);
		return bool?"redirect:loadAll?page="+maxPage:"redirect:error";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(HttpSession session,@PathVariable("id") int bookId) {
		boolean bool=bookService.delete(bookId);
		int page=Integer.parseInt(session.getAttribute("page").toString());
		return bool?"redirect:../loadAll?page="+page:"redirect:error";
	}
	
	@RequestMapping("/update/{id}")
	public String loadUpdate(Model model,@PathVariable("id") int bookId) {
		Book b=bookService.loadById(bookId);
		model.addAttribute("updateBook", b);
		return "forward:../updatebook";
	}
	
	@RequestMapping("/updateBook")
	public String updateBook(HttpSession session,Book b) {
		boolean bool=bookService.update(b);
		int page=Integer.parseInt(session.getAttribute("page").toString());
		return bool?"redirect:loadAll?page="+page:"redirect:error";
	}
}
