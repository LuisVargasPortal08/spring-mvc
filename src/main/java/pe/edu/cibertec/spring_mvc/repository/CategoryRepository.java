package pe.edu.cibertec.spring_mvc.repository;

import pe.edu.cibertec.spring_mvc.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
