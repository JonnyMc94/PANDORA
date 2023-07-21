package com.science.earth.biogeochemistry.freshwaters.pandora.general;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class PandoraDifferentialEquations implements FirstOrderDifferentialEquations {
    
    private PandoraTimestep pandoraTimestep;
    
    public int getDimension() {
        // Return the number of variables in your ODE system
        return pandoraTimestep.getDimension();
    }

    public void computeDerivatives(double t, double[] y, double[] dy) {
	for (int i = 0; i < pandoraTimestep.getDimension(); i++) {
	    dy[i] = pandoraTimestep.getTerrestrialSources(i) + pandoraTimestep.getUpstreamSources(i);
	}    
    }
}