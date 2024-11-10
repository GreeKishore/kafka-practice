package org.pro.kafkapractice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    private String msg;
    private String name;

    @Override
    public String toString() {
        return msg + ", " + name + "!";
    }
}