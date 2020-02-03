package com.jaisoft.tdd.service;

import com.jaisoft.tdd.domain.ToDo;
import com.jaisoft.tdd.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }



    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }
}
