package com.unicauca.architecture_hexagonal.domain.ports.outputs;

import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
