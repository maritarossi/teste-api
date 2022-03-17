package com.primeirapi.primeira.integracao.service;


import com.primeirapi.primeira.domain.entrada.Pessoa;
import com.primeirapi.primeira.integracao.client.ConsultarInformacaoClient;
import com.primeirapi.primeira.integracao.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ConsultarInformacaoService {


    @Autowired
    private ConsultarInformacaoClient consultarInformacaoClient;

    public ResponseEntity<Response> consultaInformacao(String cpf){
        return consultarInformacaoClient.consultaInformacao(cpf);
    }

}
