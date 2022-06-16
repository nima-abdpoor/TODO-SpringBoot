package ir.nima.todo.service;

import ir.nima.todo.entity.Todo;
import ir.nima.todo.model.TodoDTO;
import ir.nima.todo.repository.TodoRepository;
import ir.nima.todo.utility.EntityToDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<TodoDTO> getTodos() {
        return todoRepository.findAllByOrderById().stream().map(EntityToDTOMapper :: createDTOFromEntity).collect(Collectors.toList());
    }

    @Override
    public TodoDTO getTodo(int id) {
        return EntityToDTOMapper.createDTOFromEntity(todoRepository.findById(id));
    }

    @Override
    public void createTodo(TodoDTO todoDTO) {
        Todo todo = EntityToDTOMapper.createEntityFromDTO(todoDTO);
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(int id) {
        Todo todo = todoRepository.findById(id);
        todoRepository.delete(todo);
    }

    @Override
    public void updateTodo(TodoDTO todoDTO, int id) {
        Todo todo = todoRepository.findById(id);
        todo.setName(todoDTO.name);
        todo.setDescription(todoDTO.description);
        todoRepository.save(todo);
    }

    @Override
    public void updateTodoDoneStatus(int id, boolean status) {
        Todo todo = todoRepository.findById(id);
        todo.setDone(status);
        todoRepository.save(todo);
    }
}
