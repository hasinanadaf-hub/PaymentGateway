package com.payment.payement_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderResponse {

    private String keyId;

    private String orderId;

    private Long amount;

    private String currency;

}