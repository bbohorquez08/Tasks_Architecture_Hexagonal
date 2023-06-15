package com.unicauca.architecture_hexagonal.application.services;

import com.unicauca.architecture_hexagonal.domain.models.AdditionalTaskInfo;
import com.unicauca.architecture_hexagonal.domain.ports.inputs.AdditionalTaskInfoManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionalInfoTaskService implements AdditionalTaskInfoManagement {
    @Autowired
    private AdditionalTaskInfoManagement additionalTaskInfoManagement;
    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return null;
    }
}
