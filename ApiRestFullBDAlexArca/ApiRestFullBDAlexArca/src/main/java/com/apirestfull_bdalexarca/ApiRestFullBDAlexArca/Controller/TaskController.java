package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Controller;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Task;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Exception.TaskNotFoundException;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable Long id){
        if (id <= 0){
            throw new TaskNotFoundException ("La tarea con el ID: " + id + " no se encontro");
        }
        return taskService.getTask(id);
    }
    private Exception TaskNotFoundException(String s){
        return null;
    }

    @PostMapping("/tasks")
    public Task createTask(@Valid @RequestBody Task task){
        return taskService.save(task);
    }
}
