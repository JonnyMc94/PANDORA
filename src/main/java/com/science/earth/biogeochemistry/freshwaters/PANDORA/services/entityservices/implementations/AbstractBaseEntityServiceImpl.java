package com.science.earth.biogeochemistry.freshwaters.PANDORA.services.entityservices.implementations;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;

import com.science.earth.biogeochemistry.freshwaters.PANDORA.errors.ErrorMessageGenerator;
import com.science.earth.biogeochemistry.freshwaters.PANDORA.errors.ServiceImplError;
import com.science.earth.biogeochemistry.freshwaters.PANDORA.model.AbstractBaseEntity;
import com.science.earth.biogeochemistry.freshwaters.PANDORA.services.entityservices.interfaces.AbstractBaseEntityService;

public class AbstractBaseEntityServiceImpl<T extends AbstractBaseEntity> implements AbstractBaseEntityService<T> {

    @Autowired
    ErrorMessageGenerator errorMessageGenerator;

    public AbstractBaseEntityServiceImpl(ErrorMessageGenerator errorMessageGenerator) {
	this.errorMessageGenerator = errorMessageGenerator;
    }

    @Override
    public void nullCheck(T baseEntity) {
	if (baseEntity == null) {
	    throw new ServiceImplError(errorMessageGenerator.generate("abstract.crud.service.object.null"));
	}
    }
    
    @Override
    public boolean isNew(T baseEntity) {
	return baseEntity.getId() == null;
    }

    @Override
    public String getGenericType() {
	String[] packageParts = getFullGenericType().split("\\.");
	return packageParts[packageParts.length - 1];
    }

    @Override
    public String getFullGenericType() {
	Type classType = getClass().getGenericSuperclass();
	return ((ParameterizedType) classType).getActualTypeArguments()[0].getTypeName();
    }
}
