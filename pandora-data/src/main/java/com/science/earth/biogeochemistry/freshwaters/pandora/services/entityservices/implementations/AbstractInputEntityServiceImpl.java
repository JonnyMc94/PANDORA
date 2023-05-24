package com.science.earth.biogeochemistry.freshwaters.pandora.services.entityservices.implementations;

import com.science.earth.biogeochemistry.freshwaters.pandora.errors.ErrorMessageGenerator;
import com.science.earth.biogeochemistry.freshwaters.pandora.model.inputs.AbstractInputEntity;
import com.science.earth.biogeochemistry.freshwaters.pandora.services.entityservices.interfaces.AbstractInputEntityService;

public class AbstractInputEntityServiceImpl<T extends AbstractInputEntity> extends AbstractBaseEntityServiceImpl<T>
	implements AbstractInputEntityService<T> {

    protected AbstractInputEntityServiceImpl(ErrorMessageGenerator errorMessageGenerator) {
	super(errorMessageGenerator);
    }

}
