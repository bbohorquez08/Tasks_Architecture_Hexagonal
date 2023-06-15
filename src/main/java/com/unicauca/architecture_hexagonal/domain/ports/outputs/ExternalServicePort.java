package com.unicauca.architecture_hexagonal.domain.ports.outputs;

import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;
import org.springframework.stereotype.Component;

@Component
public interface ExternalServicePort {
    /**
     * Interfaz que define los métodos para la gestión de información adicional de una tarea en un servicio externo
        es importante aclarar que este puerto es tipo de salida o secundario
     * @ClassName: ExternalServicePort
     * @Autor: Nicolas Muñoz
     */
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
