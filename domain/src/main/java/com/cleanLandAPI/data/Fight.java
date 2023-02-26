package com.cleanLandAPI.data;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
@Data
public class Fight {

    private UUID fightId;
    private LocalDate fightDate;
    private UUID attacker;
    private UUID defender;
    private UUID winner;

}
