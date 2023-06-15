package com.unicauca.architecture_hexagonal.application.services;

import com.unicauca.architecture_hexagonal.domain.models.Task;
import com.unicauca.architecture_hexagonal.domain.ports.inputs.TaskManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("servicioGestionTareaDIP")
public class TaskService implements TaskManagement {

    //PRINCIPIO DE INVERSIÓN DE DEPENDENCIAS (DIP)

    @Qualifier("servicioGestionTarea")
    @Autowired
    private TaskManagement taskManagement;

    @Override
    public Task createTask(Task task) {
        return this.taskManagement.createTask(task);
    }

    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        return this.taskManagement.updateTask(id, task);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return this.taskManagement.getTask(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return this.taskManagement.getAllTasks();
    }

    @Override
    public Boolean deleteTask(Long id) {
        return this.taskManagement.deleteTask(id);
    }
}
