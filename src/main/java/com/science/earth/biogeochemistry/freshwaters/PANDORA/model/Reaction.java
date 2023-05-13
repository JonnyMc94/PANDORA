/**
 * 
 */
package com.science.earth.biogeochemistry.freshwaters.PANDORA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author Hoek0024 on 13 mei 2023
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "reactions")
public abstract class Reaction extends AbstractBaseEntity {

    private static final long serialVersionUID = -2032204521712978301L;
    
    private float rate;

}