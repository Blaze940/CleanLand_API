package com.cleanLandAPI.postgres.entity;

import com.cleanLandAPI.data.Speciality;
import com.cleanLandAPI.data.enums.Rarity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "T_HERO")
public class HeroEntity {
    @Id
    private int id;
    private String name;
    private Long lifePoints;
    private Long experiencePoints;
    private int powers;
    private int level;
    @ManyToOne
    private Speciality speciality;
    private Rarity rarity;

}
