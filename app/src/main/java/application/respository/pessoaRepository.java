package application.respository;

import org.springframework.data.repository.CrudRepository;

import application.model.Pessoa;


public interface pessoaRepository extends CrudRepository<Pessoa, Long> {
    
}