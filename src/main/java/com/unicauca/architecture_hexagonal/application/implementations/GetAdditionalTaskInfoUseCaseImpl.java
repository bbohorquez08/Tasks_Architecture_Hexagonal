package com.unicauca.architecture_hexagonal.application.implementations;


import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;
import com.unicauca.architecture_hexagonal.domain.ports.inputs.AdditionalTaskInfoManagement;
import com.unicauca.architecture_hexagonal.domain.ports.outputs.ExternalServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servicioInfoAdicional")
public class GetAdditionalTaskInfoUseCaseImpl implements AdditionalTaskInfoManagement {

    @Autowired
    private ExternalServicePort externalServicePort;

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return this.externalServicePort.getAdditionalTaskInfo(id);
    }
}
