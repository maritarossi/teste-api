package com.primeirapi.primeira.domain.entrada;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Telefone {
    @JsonProperty("pais")
    private String codPais;
    private Integer ddd;
    private Integer numero;
}
