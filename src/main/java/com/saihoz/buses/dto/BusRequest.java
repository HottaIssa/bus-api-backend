package com.saihoz.buses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BusRequest {
    private String num;
    private String placa;
    private String caracteristica;
    private Long modelId;
}
