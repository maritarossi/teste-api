package com.primeirapi.primeira.enums;

import lombok.Getter;

@Getter
public enum Sexo {
    F("FEMININO"),
    M("MASCULINO");

    private final String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }
}
