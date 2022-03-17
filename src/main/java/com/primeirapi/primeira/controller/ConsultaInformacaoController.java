package com.primeirapi.primeira.controller;

import com.primeirapi.primeira.domain.entrada.Pessoa;
import com.primeirapi.primeira.facade.ConsultaInformacaoFacade;
import com.primeirapi.primeira.integracao.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/informacao", produces = { "application/json" })
public class ConsultaInformacaoController {

    @Autowired
    private ConsultaInformacaoFacade consultaInformacaoFacade;

    @PostMapping(value = "/pessoa/{cpf}")
    public ResponseEntity<Response> consultaInformacao(@PathVariable String cpf, @RequestBody Pessoa pessoa){
        return consultaInformacaoFacade.consultaInformacao(cpf,pessoa);

    }
}
