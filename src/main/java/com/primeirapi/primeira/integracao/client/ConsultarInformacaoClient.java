package com.primeirapi.primeira.integracao.client;

import com.primeirapi.primeira.domain.entrada.Pessoa;
import com.primeirapi.primeira.integracao.domain.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "placeholder", url = "${url.client}")
public interface ConsultarInformacaoClient {

    @GetMapping(value = "/busca/{cpf}")
    ResponseEntity<Response> consultaInformacao(@PathVariable("cpf") String cpf);
}
