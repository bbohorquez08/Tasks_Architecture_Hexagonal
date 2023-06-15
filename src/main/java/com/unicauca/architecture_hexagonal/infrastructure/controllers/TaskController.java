package com.unicauca.architecture_hexagonal.infrastructure.controllers;

import com.unicauca.architecture_hexagonal.application.services.TaskService;
import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;
import com.unicauca.architecture_hexagonal.domain.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        return ResponseEntity.ok(this.taskService.createTask(task));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id){
        return ResponseEntity.ok(this.taskService.getTask(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.ok(this.taskService.getAllTasks());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
        return ResponseEntity.ok(this.taskService.updateTask(id, task).orElse(null));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Long id){
        return ResponseEntity.ok(this.taskService.deleteTask(id));
    }

}
