package com.cleanLandAPI.postgres.entity;

import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import lombok.*;
import lombok.EqualsAndHashCode.Include;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_HERO")
public class HeroEntity {
    @Id
    @Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LIFE_POINTS")
    private Long lifePoints;
    @Column(name = "EXPERIENCE_POINTS")
    private Long experiencePoints;

    @Column(name = "POWER")
    private int power;
    @Column(name = "LEVEL")
    private int level;

    @Column(name = "ARMOR")
    private int armor;

    @Column(name = "POWER_BOOST")
    private int powerBoost;

    @Column(name = "SPECIALITY")
    private Specialities speciality;
    @Column(name = "RARITY")
    private Rarity rarity;

}
