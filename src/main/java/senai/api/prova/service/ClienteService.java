package senai.api.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.api.prova.entity.Cliente;
import senai.api.prova.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService  {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente getCliente(Long clienteId){
        return clienteRepository.findById(clienteId).orElse(null);
    }

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
