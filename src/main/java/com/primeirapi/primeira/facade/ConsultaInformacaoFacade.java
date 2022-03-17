package com.primeirapi.primeira.facade;

import com.primeirapi.primeira.domain.entrada.Pessoa;
import com.primeirapi.primeira.enums.Sexo;
import com.primeirapi.primeira.facade.domain.Intermediario;
import com.primeirapi.primeira.facade.mapper.Mapeamento;
import com.primeirapi.primeira.integracao.domain.Response;
import com.primeirapi.primeira.integracao.service.ConsultarInformacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ConsultaInformacaoFacade {

    @Autowired
    private ConsultarInformacaoService consultarInformacaoService;

    @Autowired
    private Mapeamento mapeamento;

    public ResponseEntity<Response> consultaInformacao(String cpf, Pessoa pessoa){

        Intermediario intermediario = mapeamento.mapEntradatoIntermediario(pessoa);

        return consultarInformacaoService.consultaInformacao(cpf);
    }
}
