package com.unicauca.architecture_hexagonal.infrastructure.repositories;

import com.unicauca.architecture_hexagonal.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long>{
}
