package senai.api.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import senai.api.prova.entity.Cliente;
import senai.api.prova.service.ClienteService;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public Cliente getForca(@PathVariable Long id) {
        return clienteService.getCliente(id);
    }

    @GetMapping
    public List<Cliente> getAll() {
        return this.clienteService.getAll();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) throws Exception {
        return this.clienteService.save(cliente);
    }

    @PutMapping
    public Cliente alterar(@RequestBody Cliente cliente) throws Exception {
        return this.clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void testDelete(@PathVariable Long id) {
        this.clienteService.delete(id);
    }

}
