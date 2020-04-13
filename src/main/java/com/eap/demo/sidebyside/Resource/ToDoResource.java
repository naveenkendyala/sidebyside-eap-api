package com.eap.demo.sidebyside.Resource;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eap.demo.sidebyside.entity.ToDo;
import com.eap.demo.sidebyside.entity.ToDoService;

	

@Path("/")
public class ToDoResource {
	
	@Inject
	private ToDoService toDoService;

	@GET
	@Path("/todos")
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public List<ToDo> getToDos() {
		// ToDo Get All Entries
		return toDoService.getToDos();
	}

	@GET
	@Path("/todos/applive")
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public List<ToDo> liveCheck() {
		// ToDo Get All Entries
		return toDoService.getToDos();
	}
	

	@GET
	@Path("/todos/appready")
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public String readyCheck() {
		// ToDo Get All Entries
		return "OK";
	}
	
	
	@PUT
	@Path("/todos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<ToDo> createToDo(ToDo todo) {
		// ToDo Save
		toDoService.updateTodo(todo);
		return toDoService.getToDos();

	}

}
