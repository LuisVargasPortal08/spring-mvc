package pe.edu.cibertec.spring_mvc.repository;

import pe.edu.cibertec.spring_mvc.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {


}
