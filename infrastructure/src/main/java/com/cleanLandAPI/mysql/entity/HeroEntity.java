package com.cleanLandAPI.mysql.entity;

import com.cleanLandAPI.data.Speciality;
import com.cleanLandAPI.data.enums.Rarity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HeroEntity {
    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private Long lifePoints;
    private Long experiencePoints;
    private int powers;
    private int level;
    private Speciality speciality;
    private Rarity rarity;
}
