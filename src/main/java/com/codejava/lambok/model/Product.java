package com.codejava.lambok.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Product {

    private final String productId;
    private final String productName;
    private final String productDescription;
    @NonNull
    private final Long productCost;

}
