package com.eap.demo.sidebyside.entity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class ToDoService {


	@PersistenceContext(unitName="ToDoPU")
	private EntityManager em;

	public void updateTodo(ToDo todo) {
		// Persist ToDo
		em.merge(todo);
	}

	public List<ToDo> getToDos() {
		TypedQuery<ToDo> query = em.createQuery("SELECT t FROM ToDo t", ToDo.class);
		return query.getResultList();
	}

}
