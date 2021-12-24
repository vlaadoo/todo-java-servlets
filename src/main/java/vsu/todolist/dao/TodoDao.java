package vsu.todolist.dao;

import java.sql.SQLException;
import java.util.List;

import vsu.todolist.model.Todo;

public interface TodoDao {

	void insertTodo(Todo todo) throws SQLException;

	Todo selectTodo(long todoId);

	List<Todo> selectAllTodos(String user);

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(Todo todo) throws SQLException;

}