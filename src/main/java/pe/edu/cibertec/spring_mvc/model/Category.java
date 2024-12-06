package pe.edu.cibertec.spring_mvc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Cacheable("categories") // Define el caché para la entidad Category
public class Category {

    // Getters y Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(nullable = false, unique = true) // Asegura que el nombre sea único y no nulo
    private String name;

    @ManyToMany(mappedBy = "categories") // Relación bidireccional con Film
    private List<Film> films = new ArrayList<>();

    // Constructor vacío requerido por JPA
    public Category() {
    }

    // Constructor personalizado
    public Category(String name) {
        this.name = name;
    }

}
