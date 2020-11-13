package com.koreait.todoApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.todoApp.model.TodoVO;

@Service
public class TodoService {
	
	@Autowired
	private TodoMapper mapper;
	
	int insTodo(TodoVO param) {
		return mapper.insTodo(param);
	}
	int delTodo(TodoVO param) {
		return mapper.delTodo(param);
	}
	public List<TodoVO> selTodoList(){
		return mapper.selTodoList();
	}
}