package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Service;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Task;
import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task getTask(Long id){
        return this.taskRepository.findById(id).orElse(null);}

        public Task save(Task task) {
            return this.taskRepository.save(task);
        }
    }
