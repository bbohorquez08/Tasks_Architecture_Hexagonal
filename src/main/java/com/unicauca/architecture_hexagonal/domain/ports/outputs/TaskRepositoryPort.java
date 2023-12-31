package com.unicauca.architecture_hexagonal.domain.ports.outputs;

import com.unicauca.architecture_hexagonal.domain.models.Task;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz que define los métodos para la gestión de tareas de un servicio externo(base de datos),
 *  *            es importante aclarar que este puerto es tipo de salida o secundario
 * @ClassName: TaskRepositoryPort
 * @Autor: Nicolas Muñoz
 */
@Component
public interface TaskRepositoryPort {
    /**
     * Guardar tarea
     * @param task
     * @return Task
     * @Description: Guarda una tarea en la base de datos
     */
    Task save(Task task);

    /**
     * Buscar tarea
     * @param id
     * @return Optional<Task>
     * @Description: Busca una tarea en la base de datos por medio del atributo id
     */
    Optional<Task> findById(Long id);

    /**
     * Listar tareas
     * @return List<Task>
     * @Description: Obtiene todas las tareas existentes en la base de datos
     */
    List<Task> findAll();

    /**
     * Actualizar tarea
     * @param task
     * @return Optional<Task>
     * @Description: Actualiza una tarea en la base de datos
     */
    Optional<Task> update(Task task);

    /**
     * Eliminar tarea
     * @param id
     * @return boolean
     * @Description: Elimina una tarea en la base de datos por medio del atributo id
     */
    boolean delete(Long id);
}
