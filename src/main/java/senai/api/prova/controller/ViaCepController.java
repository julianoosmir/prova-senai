package senai.api.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senai.api.prova.model.ViaCepModel;

import senai.api.prova.service.ViaCepService;

@RestController
@RequestMapping(value = "/cep")
public class ViaCepController {

    @Autowired
    private ViaCepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<ViaCepModel> getCep(@PathVariable String cep) {

        ViaCepModel endereco = cepService.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }
}