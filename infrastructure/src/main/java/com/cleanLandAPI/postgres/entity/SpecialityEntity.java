package com.cleanLandAPI.postgres.entity;

import com.cleanLandAPI.data.enums.Specialities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_SPECIALITY")
public class SpecialityEntity {
    @Id
    private Long id;
    private int armor;
    private int powerAdd;
    private int pvInit;
    private Specialities classSpeciality;

}
