package repository;


import com.alexf.model.Autor;
import org.springframework.data.repository.CrudRepository;


public interface AutorRepository
    extends CrudRepository<Autor, Integer> {

}
