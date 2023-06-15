package com.unicauca.architecture_hexagonal.application.implementations;

import com.unicauca.architecture_hexagonal.domain.models.Task;
import com.unicauca.architecture_hexagonal.domain.ports.inputs.TaskManagement;
import com.unicauca.architecture_hexagonal.domain.ports.outputs.TaskRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("servicioGestionTarea")
public class TaskManagementImpl implements TaskManagement{
    @Autowired
    private TaskRepositoryPort taskRepositoryPort;

        @Override
        public Task createTask(Task task) {
            return this.taskRepositoryPort.save(task);
        }

        @Override
        public Optional<Task> updateTask(Long id, Task task){
            return this.taskRepositoryPort.update(task);
        }

        @Override
        public Optional<Task> getTask(Long id) {
            return this.taskRepositoryPort.findById(id);
        }

        @Override
        public List<Task> getAllTasks() {
            return this.taskRepositoryPort.findAll();
        }

    @Override
    public Boolean deleteTask(Long id) {
        return this.taskRepositoryPort.delete(id);
    }

}
