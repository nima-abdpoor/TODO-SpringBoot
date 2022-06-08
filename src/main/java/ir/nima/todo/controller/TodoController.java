package ir.nima.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @RequestMapping("/todos")
    public String getTodos(Model model){
        //model.addAttribute("todos", );
        return "";
    }

    @RequestMapping(value= "/todos/{id}", method = RequestMethod.GET)
    public String getTodo(Model model, @PathVariable int id){
        //model.addAttribute("todo", todoService.getTodo(id));
        return "";
    }
}
