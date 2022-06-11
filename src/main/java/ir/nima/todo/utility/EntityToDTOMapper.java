package ir.nima.todo.utility;


import ir.nima.todo.entity.Todo;
import ir.nima.todo.model.TodoDTO;

public  class EntityToDTOMapper {

    public static TodoDTO createDTOFromEntity(Todo todo){
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.id = todo.getId();
        todoDTO.name = todo.getName();
        todoDTO.description = todo.getDescription();
        todoDTO.done = todo.getDone();

        return todoDTO;
    }

    public static Todo createEntityFromDTO(TodoDTO todoDTO){
        return new Todo(todoDTO.name,todoDTO.description, todoDTO.done);
    }
}


