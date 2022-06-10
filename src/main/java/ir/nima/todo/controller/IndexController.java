package ir.nima.todo.controller;

import ir.nima.todo.model.Template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value= "/", method = RequestMethod.GET)
    public String getIndexPage(){
        return Template.TODO_CREATE.getName();
    }
}
