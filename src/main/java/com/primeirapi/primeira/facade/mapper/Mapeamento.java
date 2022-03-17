package com.primeirapi.primeira.facade.mapper;


import com.primeirapi.primeira.domain.entrada.Pessoa;
import com.primeirapi.primeira.domain.entrada.Telefone;
import com.primeirapi.primeira.enums.Sexo;
import com.primeirapi.primeira.facade.domain.Intermediario;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", imports = Sexo.class)
public interface Mapeamento {

    @Mapping(target = "nomeCompleto", source = "nome")
    @Mapping(target = "sexo", expression = "java(pessoa.getSexo().substring(1).equalsIgnoreCase(\"F\") ? Sexo.F : Sexo.M)")
    @Mapping(target = "indicadorAlistamentoObriagtorio", constant = "N") //default value só funciona quanto tem source
    Intermediario mapEntradatoIntermediario(Pessoa pessoa);

    List<Telefone> mapTelefonePessoaToTelefoneIntermediario(List<Telefone> telefones);

    @Mapping(target = "codPais", expression = "java(ajustaCodigoPais(telefone.getCodPais()))")
    Telefone mapTelefonePessoaToTelefoneIntermediario(Telefone telefone);


    @AfterMapping
    default void mapToEntradaToIntermediarioAfter(@MappingTarget Intermediario intermediario){
        if(intermediario.getSexo().equals(Sexo.M)){
            intermediario.setIndicadorAlistamentoObriagtorio("S");
        }
    }

    default String ajustaCodigoPais(String codPais){
        return "+".concat(codPais);
    }

}
