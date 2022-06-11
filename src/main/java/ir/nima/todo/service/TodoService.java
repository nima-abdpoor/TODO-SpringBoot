package ir.nima.todo.service;

import ir.nima.todo.model.TodoDTO;

import java.util.List;

public interface TodoService {

    List<TodoDTO> getTodos();
    TodoDTO getTodo(int id);
    void createTodo(TodoDTO todoDTO);
    void deleteTodo(int id);
    void updateTodo(TodoDTO todoDTO, int id);
    void updateTodoDoneStatus(int id, boolean status);


}
