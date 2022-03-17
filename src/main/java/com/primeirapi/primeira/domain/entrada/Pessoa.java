package com.primeirapi.primeira.domain.entrada;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Pessoa {
    private String nome;
    @JsonProperty("data_nascimento")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;
    private String sexo;
    private List<Telefone> telefones;
}
