package senai.api.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.api.prova.entity.Pedido;

import senai.api.prova.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    
    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido getPedido(Long pedidoId){
        return pedidoRepository.findById(pedidoId).orElse(null);
    }

    public List<Pedido> getAll(){
        return pedidoRepository.findAll();
    }

    public void delete(Long id) {
        pedidoRepository.deleteById(id);
    }

}
