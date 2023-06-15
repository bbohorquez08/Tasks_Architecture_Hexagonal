package com.unicauca.architecture_hexagonal.domain.ports.inputs;

import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;

public interface AdditionalTaskInfoManagement {

    /**
     * Obtener información adicional de una tarea
     * @param id
     * @return AdditionalTaskInfo
     * @Description: Obtiene información adicional de una tarea por medio del atributo id
     */
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
