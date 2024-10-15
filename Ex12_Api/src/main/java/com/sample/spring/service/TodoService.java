package com.sample.spring.service;

import com.sample.spring.dto.TodoDto;
import com.sample.spring.model.TodoEntity;

public interface TodoService {
	public TodoDto get(Long tno);
	
	public Long postTodo(TodoDto dto);
	
	public void modify(TodoDto dto);
	
	public void remove(Long tno);
	
	//Entity에서 Dto로, Dto에서 Entity로 서로 주고받는 값을 미리 정의
	//post
	default TodoDto entityToDto(TodoEntity todo) {
		TodoDto todoDto = TodoDto.builder()
				.tno(todo.getTno())
				.title(todo.getTitle())
				.writer(todo.getWriter())
				.complete(todo.isComplete())
				.dueDate(todo.getDueDate())
				.build();
		return todoDto; 
	};
	
	//get
	default TodoEntity dtoToEntity(TodoDto todoDto) {
		TodoEntity todoEntity = TodoEntity.builder()
				.tno(todoDto.getTno())
				.title(todoDto.getTitle())
				.writer(todoDto.getWriter())
				.complete(todoDto.isComplete())
				.dueDate(todoDto.getDueDate())
				.build();
		return todoEntity;
	};
}
