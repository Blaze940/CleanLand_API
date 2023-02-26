package com.cleanLandAPI.postgres.entity;

import com.cleanLandAPI.data.Speciality;
import com.cleanLandAPI.data.enums.Rarity;
import lombok.*;
import lombok.EqualsAndHashCode.Include;
import jakarta.persistence.*;
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_HERO")
public class HeroEntity {
    @Id
    @Include
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LIFE_POINTS")
    private Long lifePoints;
    @Column(name = "EXPERIENCE_POINTS")
    private Long experiencePoints;
    @Column(name = "POWERS")
    private int powers;
    @Column(name = "LEVEL")
    private int level;
    @Embedded
    @Column(name = "SPECIALITY")
    private Speciality speciality;
    @Column(name = "RARITY")
    private Rarity rarity;

}
