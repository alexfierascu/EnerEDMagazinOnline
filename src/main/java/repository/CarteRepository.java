package repository;


import com.alexf.model.Carte;
import org.springframework.data.repository.CrudRepository;


public interface CarteRepository
    extends CrudRepository<Carte, Integer> {

}
