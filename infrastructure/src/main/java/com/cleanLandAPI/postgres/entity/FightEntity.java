package com.cleanLandAPI.postgres.entity;


import jakarta.persistence.*;
import lombok.*;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate fightDate;
    private UUID attacker;
    private UUID defender;
    private UUID winner;


}
