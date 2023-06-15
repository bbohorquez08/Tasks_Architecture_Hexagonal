package com.unicauca.architecture_hexagonal.domain.ports.inputs;

import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;

/**
 * @ClassName: AdditionalTaskInfoManagement
 * @Description: Interfaz que define los métodos para la gestión de información adicional de una tarea,
 *            es importante aclarar que este puerto es tipo de entrada o principal
 * @Autor: Nicolas Muñoz
 */
public interface AdditionalTaskInfoManagement {

    /**
     * Obtener información adicional de una tarea
     * @param id
     * @return AdditionalTaskInfo
     * @Description: Obtiene información adicional de una tarea por medio del atributo id
     */
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
