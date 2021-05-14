package com.crudApp.crud.controller;

import com.crudApp.crud.models.Todo;
import com.crudApp.crud.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<Todo> getTodo(){
        return todoRepository.findAll();

    }
    @PostMapping("/crete")
    public Todo create(@RequestBody final Todo todo){
        return  todoRepository.saveAndFlush(todo);


    }



}
