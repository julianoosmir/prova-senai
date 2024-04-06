package senai.api.prova.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import senai.api.prova.entity.Pedido;
import senai.api.prova.service.PedidoService;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{id}")
    public Pedido getForca(@PathVariable Long id) {
        return pedidoService.getPedido(id);
    }

    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<Pedido> getAll() {
        return this.pedidoService.getAll();
    }

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) throws Exception {
        return this.pedidoService.save(pedido);
    }

    @PutMapping
    public Pedido alterar(@RequestBody Pedido pedido) throws Exception {
        return this.pedidoService.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void testDelete(@PathVariable Long id) {
        this.pedidoService.delete(id);
    }
}
