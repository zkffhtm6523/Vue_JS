package com.koreait.todoApp;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.todoApp.model.TodoVO;

@Mapper
public interface TodoMapper {
	int insTodo(TodoVO param);
	int delTodo(TodoVO param);
	List<TodoVO> selTodoList();
}
