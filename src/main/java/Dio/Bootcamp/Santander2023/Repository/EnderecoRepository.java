package Dio.Bootcamp.Santander2023.Repository;

import Dio.Bootcamp.Santander2023.Model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository <Endereco, String> {
}
