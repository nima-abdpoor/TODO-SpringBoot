package ir.nima.todo.controller;

import ir.nima.todo.model.Template;
import ir.nima.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping("/todos")
    public String getTodos(Model model){
        model.addAttribute("todos", todoService.getTodos());
        return Template.TODO_LIST.getName();
    }

    @RequestMapping(value= "/todos/{id}", method = RequestMethod.GET)
    public String getTodo(Model model, @PathVariable int id){
        model.addAttribute("todo", todoService.getTodo(id));
        return Template.TODO_DETAIL.getName();
    }
}
