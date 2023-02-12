package com.cleanLandAPI.data;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HeroDto {

    private String name;
    private Long lifePoints;
    private Long experiencePoints;
    private int powers;
    private int level;


}
