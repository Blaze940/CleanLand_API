package com.cleanLandAPI.postgres.entity;

import com.cleanLandAPI.data.Hero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_FIGHT")
public class FightEntity {

    @Id
    private UUID fightId;
    private LocalDate fightDate;
    private UUID attacker;
    private UUID defender;
    private UUID winner;


}
