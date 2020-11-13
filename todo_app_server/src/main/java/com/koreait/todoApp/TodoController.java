package com.koreait.todoApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.koreait.todoApp.model.TodoVO;

@RestController
@RequestMapping("/api")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@RequestMapping(value="/insTodo", method=RequestMethod.POST)
	public @ResponseBody int insTodo(@RequestBody TodoVO param) {
		System.out.println("insert 왔음");
		return service.insTodo(param);
	}
	@RequestMapping(value="/delTodo", method=RequestMethod.DELETE)
	public int delTodo(@RequestBody TodoVO param) {
		return service.delTodo(param);
	}
	
	@RequestMapping("/selTodoList")
	public List<TodoVO> selTodoList() {
		List<TodoVO> list = service.selTodoList();
		return list;
	}
}
