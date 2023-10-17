package Dio.Bootcamp.Santander2023.Repository;

import Dio.Bootcamp.Santander2023.Model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
