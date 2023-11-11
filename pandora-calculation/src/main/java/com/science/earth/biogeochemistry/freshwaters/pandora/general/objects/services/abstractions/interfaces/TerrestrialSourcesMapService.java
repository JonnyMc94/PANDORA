package com.science.earth.biogeochemistry.freshwaters.pandora.general.objects.services.abstractions.interfaces;

import java.time.LocalDateTime;

import com.science.earth.biogeochemistry.freshwaters.pandora.general.objects.Cell;

public interface TerrestrialSourcesMapService extends CellMapService {
    double[] findAtCellAndTimestep(Cell cell, LocalDateTime t);
}
