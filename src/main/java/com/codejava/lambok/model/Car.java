package com.codejava.lambok.model;

import lombok.*;

@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Car {

    private final String carName;
    private final String carMake;
    private String carNumber;
}
