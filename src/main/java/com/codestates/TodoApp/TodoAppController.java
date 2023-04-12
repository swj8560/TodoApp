package com.codestates.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {

    @GetMapping("/")
    public String TodoApp(){
        return "To-do Application !!!!!";
    }
}
