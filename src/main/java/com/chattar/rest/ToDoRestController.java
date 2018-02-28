package com.chattar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chattar.login.WelcomeController;
import com.chattar.model.Todo;
import com.chattar.todo.service.TodoService;

@RestController
public class ToDoRestController {

	@Autowired
	TodoService todoService;
	
	@Autowired
	WelcomeController userService;
	
	@RequestMapping(value="/listTodos", method=RequestMethod.GET)
	List<Todo> getTodoList(){
		return todoService.retrieveTodos(userService.getLoggedInUserName());
	}
	
	@RequestMapping(value="/listTodos/{id}", method=RequestMethod.GET)
	Todo getTodo(@PathVariable int id) {
		return todoService.retrieveTodo(id);
	}
}
