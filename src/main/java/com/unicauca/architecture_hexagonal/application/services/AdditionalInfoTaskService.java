package com.unicauca.architecture_hexagonal.application.services;

import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;
import com.unicauca.architecture_hexagonal.domain.ports.inputs.AdditionalTaskInfoManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicioInfoAdicionalDIP")
public class AdditionalInfoTaskService implements AdditionalTaskInfoManagement {

    //PRINCIPIO DE INVERSIÓN DE DEPENDENCIAS (DIP)
    @Qualifier("servicioInfoAdicional")
    @Autowired
    private AdditionalTaskInfoManagement additionalTaskInfoManagement;
    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return this.additionalTaskInfoManagement.getAdditionalTaskInfo(id);
    }
}
