package com.unicauca.architecture_hexagonal.infrastructure.repositories;

import com.unicauca.architecture_hexagonal.domain.models.Task;
import com.unicauca.architecture_hexagonal.domain.ports.outputs.TaskRepositoryPort;
import com.unicauca.architecture_hexagonal.infrastructure.entities.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * @Description: Adaptador que me define la implementación de los métodos del puerto de salida(Base de datos)
 *  @Autor: Nicolas Muñoz
 */
@Component
public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {

    @Autowired
    private JpaTaskRepository jpaTaskRepository;

    @Override
    public Task save(Task task) {
        TaskEntity taskEntity = TaskEntity.toDomain(task);
        TaskEntity savedTaskEntity = this.jpaTaskRepository.save(taskEntity);
        return savedTaskEntity.toEntity();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return this.jpaTaskRepository.findById(id).map(TaskEntity::toEntity);
    }

    @Override
    public List<Task> findAll() {
        return this.jpaTaskRepository.findAll().stream().map(TaskEntity::toEntity).toList();
    }

    @Override
    public Optional<Task> update(Task task) {
        if(this.jpaTaskRepository.existsById(task.getId())){
            TaskEntity taskEntity = TaskEntity.toDomain(task);
            TaskEntity updatedTaskEntity = this.jpaTaskRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toEntity());

        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        if(jpaTaskRepository.existsById(id)){
            this.jpaTaskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
