package com.unicauca.architecture_hexagonal.domain.ports.inputs;

import com.unicauca.architecture_hexagonal.domain.models.Task;

import java.util.List;
import java.util.Optional;
/**
 * @ClassName: TaskManagement
 * @Description: Interfaz que define los métodos para la gestión de tareas,
 *            es importante aclarar que este puerto es tipo de entrada o principal
 * @Autor: Nicolas Muñoz
 */
public interface TaskManagement {
    /**
     * Crear nueva tarea
     * @param task
     * @return Task
     * @Description: Crea una nueva tarea
     */
    Task createTask(Task task);

    /**
     * Actualizar tarea
     * @param id
     * @return Optional<Task>
     * @Description: Actualiza una tarea por medio del atributo id
     */
    Optional<Task> updateTask(Long id, Task task);

    /**
     * Busca una tarea
     * @param id
     * @return Optional<Task>
     * @Description: Obtiene una tarea por medio del atributo id
     */
    Optional<Task> getTask(Long id);

    /**
     * Lista todas las tareas
     * @return List<Task>
     * @Description: Obtiene todas las tareas existentes
     */
    List<Task> getAllTasks();

    /**
     * Elimina una tarea
     * @param id
     * @return Boolean
     * @Description: Elimina una tarea por medio del atributo id
     */
    Boolean deleteTask(Long id);
}
