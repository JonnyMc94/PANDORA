package com.science.earth.biogeochemistry.freshwaters.pandora.general.services.interfaces;

import com.science.earth.biogeochemistry.freshwaters.pandora.general.objects.CellTimestepBaseObject;

public interface CellTimestepService {
    CellTimestepBaseObject calculateNextTimestep(CellTimestepBaseObject cell);
}
