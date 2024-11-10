package org.pro.kafkapractice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Farewell {

    private String message;
    private Integer remainingMinutes;

    @Override
    public String toString() {
        return message + ". In " + remainingMinutes + "!";
    }
}