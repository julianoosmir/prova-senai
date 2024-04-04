package senai.api.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.api.prova.entity.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
