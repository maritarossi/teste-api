package com.primeirapi.primeira.facade.domain;

import com.primeirapi.primeira.domain.entrada.Telefone;
import com.primeirapi.primeira.enums.Sexo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Intermediario {
    private String nomeCompleto;
    private Sexo sexo;
    private String indicadorAlistamentoObriagtorio;
    private List<Telefone> telefones;
}
